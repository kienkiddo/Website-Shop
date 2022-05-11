package controller.home;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import commom.PageInfo;
import io.BillData;
import io.CartData;
import io.HistoryData;
import model.Bill;
import model.Cart;
import model.History;
import model.User;

@WebServlet("/xac-nhan-don-hang")
public class ConfirmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ConfirmServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		var user = (User) request.getAttribute("user");
		if (user == null) {
			PageInfo page = new PageInfo("Đăng nhập", "login.jsp");
			page.forward(request, response);
		} else {
			PageInfo page = new PageInfo("Xác nhận đơn hàng", "confirm.jsp");
			page.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		var user = (User) request.getAttribute("user");
		var cart = (Cart) request.getAttribute("cart");
		if (user == null) {
			System.out.println("xac-nhan-don-hang => user == null");
			PageInfo.page404NotFound(request, response);
		} else if (cart == null) {
			System.out.println("xac-nhan-don-hang => cart == null");
			PageInfo.page404NotFound(request, response);
		} else if (cart.getCartItems().size() == 0) {
			System.out.println("xac-nhan-don-hang => cart size = 0");
			PageInfo.page404NotFound(request, response);
		} else {
			String name = request.getParameter("name");
			String phone = request.getParameter("phone");
			String address = request.getParameter("address");

			History history = new History();
			history.setUserId(user.getId());
			history.setName(name);
			history.setPhone(phone);
			history.setAddress(address);
			HistoryData.insert(history);
			
			for (var cartItem : cart.getCartItems()) {
				Bill bill = new Bill();
				bill.setHistoryId(history.getId());
				bill.setItemId(cartItem.getId());
				bill.setPrice(cartItem.getPrice());
				bill.setSize(cartItem.getSize());
				bill.setQuantity(cartItem.getQuantity());
				BillData.insert(bill);
			}
			
			cart.getCartItems().clear();
			CartData.update(cart);
			
			response.sendRedirect("dat-hang-thanh-cong");
		}
	}

}
