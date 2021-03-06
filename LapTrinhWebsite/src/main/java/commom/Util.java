package commom;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import org.apache.tomcat.util.http.fileupload.IOUtils;

public class Util {
	
	public static String getTime(String param) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(param);
		Calendar calendar = Calendar.getInstance();
		return dateFormat.format(calendar.getTime());
	}
	
	public static void saveFile(Part part, String name) {
		File file = new File(Resource.folderUpload + "\\" + name);
		try (OutputStream outputStream = new FileOutputStream(file)) {
			IOUtils.copy(part.getInputStream(), outputStream);
		} catch (Exception e) {
		}
	}

	public static String getFileName(Part part) {
		String contentDisp = part.getHeader("content-disposition");
		String[] tokens = contentDisp.split(";");
		for (String token : tokens) {
			if (token.trim().startsWith("filename")) {
				return token.substring(token.indexOf("=") + 2, token.length() - 1);
			}
		}
		return "";
	}
	
	public static void addNotify(HttpServletRequest request, String message) {
		HttpSession session = request.getSession(false);
		session.setAttribute("message", message);
	}
	
}
