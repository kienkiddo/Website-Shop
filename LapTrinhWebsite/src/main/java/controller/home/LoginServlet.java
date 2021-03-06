package controller.home;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import commom.PageInfo;
import commom.Security;
import io.UserData;
import model.User;

/**
 * Servlet implementation class IndexServlet
 */
@WebServlet("/dang-nhap")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		User user = (User) request.getAttribute("user");
		if (user != null) {
			response.sendRedirect("trang-chu");
		} else {
			PageInfo page = new PageInfo("Đăng nhập", "login.jsp");
			page.forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		var email = request.getParameter("email");
		var pass = request.getParameter("pass");
		String message = "";
		if (!email.contains("@")) {
			message = "Vui lòng nhập đúng định dạng Email";
		} else if (pass.length() < 4 || pass.length() > 16) {
			message = "Mật khẩu phải từ 4 đến 16 kí tự";
		}  else {
			User user = UserData.login(email, Security.getMd5(pass));
			if (user != null) {
				HttpServletRequest httpRequest = (HttpServletRequest) request;
				Cookie[] cookies = httpRequest.getCookies();
				String hashkey = Security.getHashkey(cookies);
				if (hashkey != null) {
					user.setHahskey(hashkey);
					UserData.updateHashKey(user);
				}
				
				message = "OK";
				Security.setCookieLogin(email, Security.getMd5(pass), user.getHahskey(), response);
			
			} else {
				message = "Thông tin đăng nhập không chính xác";
			}
		}
		response.getWriter().print(message);
	}

}
