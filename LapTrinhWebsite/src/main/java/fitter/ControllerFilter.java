package fitter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;

import io.UserData;
import model.User;


@WebFilter("/*")
public class ControllerFilter extends HttpFilter implements Filter {
       
    public ControllerFilter() {
        super();
    }

	public void destroy() {
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		Cookie[] cookies = httpRequest.getCookies();
		String email = null, pass = null;
		if (cookies != null) {
			for (var cookie : cookies) {
				if (cookie.getName().equals("email")) {
					email = cookie.getValue();
				} else if (cookie.getName().equals("pass")) {
					pass = cookie.getValue();
				}
			}
		}
		if (email != null && pass != null) {
			User user = UserData.login(email, pass);
			if (user != null) {
				request.setAttribute("user", user);
			}
		}
		chain.doFilter(request, response);
		
		
	}


	public void init(FilterConfig fConfig) throws ServletException {
	}

}
