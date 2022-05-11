package controller.home;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import commom.PageInfo;
import commom.Resource;
import io.ColorData;
import io.ItemData;

@WebServlet("/danh-sach-san-pham")
public class ListServlet extends HttpServlet {

	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String type = request.getParameter("type");
		var items = ItemData.all((type.equals("shoes") ? Resource.TYPE_SHOES : Resource.TYPE_SCANDAL), Resource.STATUS_SHOW);
		request.setAttribute("data", new Gson().toJson(items));
		request.setAttribute("colors", ColorData.all());
		PageInfo page = new PageInfo("Danh sách sản phẩm", "list.jsp");
		page.forward(request, response);
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String type = request.getParameter("type");
		int price = (request.getParameter("price").equals("null") ? -1 : Integer.parseInt(request.getParameter("price")));
		int color = (request.getParameter("color").equals("null") ? -1 : Integer.parseInt(request.getParameter("color")));
		int size = (request.getParameter("size").equals("null") ? -1 : Integer.parseInt(request.getParameter("size")));
		int sort = (request.getParameter("sort").equals("null") ? -1 : Integer.parseInt(request.getParameter("sort")));

		var items = ItemData.all((type.equals("shoes") ? Resource.TYPE_SHOES : Resource.TYPE_SCANDAL), Resource.STATUS_SHOW);
		Gson gson = new Gson();
		String json = gson.toJson(items);
		
		response.getWriter().print(json);
	}

}
