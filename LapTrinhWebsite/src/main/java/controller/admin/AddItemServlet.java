package controller.admin;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import commom.PageInfo;
import commom.Resource;
import commom.Util;
import io.ColorData;
import io.ItemData;
import model.Info;
import model.Item;

@MultipartConfig
@WebServlet(urlPatterns = { "/admin/addItem" })

public class AddItemServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("colors", ColorData.all());
		PageInfo page = new PageInfo("Add item", "addItem.jsp");
		page.setAdmin();
		page.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// String filePath =
		// request.getServletContext().getRealPath("/resources/images/");
		// String applicationPath = request.getServletContext().getRealPath("");
		request.setCharacterEncoding("UTF-8");

		int type = Integer.parseInt(request.getParameter("type"));
		String name = request.getParameter("name");
		String description = request.getParameter("description");
		int color = Integer.parseInt(request.getParameter("color"));
		int price = (request.getParameter("price").length() == 0 ? -1
				: Integer.parseInt(request.getParameter("price")));

		String message = "";
		if (type < 0 || type > 1) {
			message = "Vui lòng chọn sản phẩm";
		} else if (name.length() < 6 || name.length() > 255) {
			message = "Tên sản phẩm phải từ 6 đến 256 kí tự";
		} else if (description.length() > 1024) {
			message = "Mô tả phải nhỏ hơn 1024 kí tự";
		} else if (color == -1) {
			message = "Vui lòng chọn màu sắc";
		} else if (price < 0) {
			message = "Giá tiền không thể là số âm";
		} else {
			Item item = new Item(type, name, description, price, color, Resource.STATUS_HIDDEN);
			if (ItemData.insert(item)) {
				Part thump = null;
				ArrayList<Part> images = new ArrayList<Part>();
				for (Part part : request.getParts()) {
					if (part.getName().equals("images")) {
						images.add(part);
					} else if (part.getName().equals("thump")) {
						thump = part;
					}
				}
				String strThump = "";
				if (thump != null) {
					strThump = item.getId() + "_thump_" + Util.getTime("yyyyMMdd_HHmmss") + ".jpg";
					this.saveFile(thump, strThump);
				}
				JSONArray job = new JSONArray();
				int index = 0;
				for (var image : images) {
					var nameImage = item.getId() + "_image_" + (index++) + "_" + Util.getTime("yyyyMMdd_HHmmss") + ".jpg";
					this.saveFile(image, nameImage);
					job.add(nameImage);
				}
				ItemData.updateImage(item, job.toJSONString(), strThump);
				message = "Thành công";
			} else {
				message = "Đã xảy ra lỗi, vui lòng liên hệ Admin";
			}
		}
		request.setAttribute("message", message);
		this.doGet(request, response);
	}

	private void saveFile(Part part, String name) {
		File file = new File(Resource.folderUpload + "\\" + name);
		try (OutputStream outputStream = new FileOutputStream(file)) {
			IOUtils.copy(part.getInputStream(), outputStream);
		} catch (Exception e) {
		}
	}

	private String getFileName(Part part) {
		String contentDisp = part.getHeader("content-disposition");
		String[] tokens = contentDisp.split(";");
		for (String token : tokens) {
			if (token.trim().startsWith("filename")) {
				return token.substring(token.indexOf("=") + 2, token.length() - 1);
			}
		}
		return "";
	}

}