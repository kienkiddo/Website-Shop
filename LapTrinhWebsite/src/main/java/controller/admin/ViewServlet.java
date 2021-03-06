package controller.admin;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import commom.PageInfo;
import commom.Resource;
import io.ItemData;
import model.Item;

@WebServlet(urlPatterns = { "/admin/view" })

public class ViewServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		var type = request.getParameter("type");
		if (type == null) {
			type = "tat-ca";
		}
		ArrayList<Item> items = new ArrayList<Item>();
		switch (type) {
		case "tat-ca":
			items = ItemData.all();
			break;
		case "dang-ban":
			items = ItemData.all(Resource.STATUS_SHOW);
			break;
		case "dang-an":
			items = ItemData.all(Resource.STATUS_HIDDEN);
			break;
		case "hang-moi-ve":
			items = ItemData.allNew();
			break;
		case "hang-giam-gia":
			items = ItemData.allSale();
			break;
		case "het-hang":
			items = ItemData.all();
			for (int i = items.size() - 1; i >= 0; i--) {
				for (var info : items.get(i).getInfos()) {
					if (info.getQuantity() > 0) {
						items.remove(i);
						break;
					}
				}
			}
			break;
		}
		request.setAttribute("type", type);
		request.setAttribute("items", items);
		PageInfo page = new PageInfo("Danh sách sản phẩm", "view.jsp");
		page.setAdmin();
		page.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
