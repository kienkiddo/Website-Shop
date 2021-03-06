package controller.home;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import commom.PageInfo;
import commom.Resource;
import commom.Security;
import io.CartData;
import io.ItemData;
import model.Cart;
import model.CartItem;

/**
 * Servlet implementation class IndexServlet
 */
@WebServlet("/gio-hang")
public class CartServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PageInfo page = new PageInfo("Giỏ hàng của tôi", "cart.jsp");
		page.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		Cookie[] cookies = httpRequest.getCookies();
		String hashkey = Security.getHashkey(cookies);
		if (hashkey == null) {
			hashkey = Security.creatHashkey();
			Security.setHashkey(hashkey, response);
		}
		String message = "";
		
		var action = request.getParameter("action");
		if (action.equals("addCart")) {
			var id = Integer.parseInt(request.getParameter("id"));
			var quantity = Integer.parseInt(request.getParameter("quantity"));
			int size = Integer.parseInt(request.getParameter("size"));
			var item = ItemData.withId(id);
			if (item == null || item.getStatus() != Resource.STATUS_SHOW) {
				message = "Sản phẩm không tồn tại";
			} else if (size < 35 || size > 45) {
				message = "Vui lòng chọn kích thước";
			} else if (quantity < 1) {
				message = "Số lượng phải lớn hơn 0";
			} else if (quantity > item.getQuantity(size)) {
				message = "Hiện tại chỉ còn " + item.getQuantity(size) + " sản phẩm";
			} else {
				Cart cart = CartData.withHashkey(hashkey);
				if (cart == null) {
					if (CartData.add(new Cart(hashkey))) {
						cart = CartData.withHashkey(hashkey);
					} else {
						message = "Đã xảy ra lỗi vui lòng thử lại";
					}
				}
				if (cart != null) {
					cart.add(new CartItem(item.getId(), size, quantity));
					CartData.update(cart);
					message = "OK|" + cart.getCartItems().size();
				}
			}
			
		} else if (action.equals("removeCart")) {
			int id = Integer.parseInt(request.getParameter("id"));
			int size = Integer.parseInt(request.getParameter("size"));
			Cart cart = CartData.withHashkey(hashkey);
			if (cart == null) {
				return;
			}
			cart.remove(id, size);
			CartData.update(cart);
			message = "OK";
		} else if (action.equals("orderCart")) {
			
		}
		response.getWriter().print(message);
		
	}

}
