/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.55
 * Generated at: 2022-05-10 09:15:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.home.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("  th td {\r\n");
      out.write("    padding: 5px 10px;\r\n");
      out.write("  }\r\n");
      out.write("</style>\r\n");
      out.write("<div class=\"container\" style=\"margin-top: 35px\">\r\n");
      out.write("  <h3 class=\"text-center\">GIỎ HÀNG CỦA BẠN</h3>\r\n");
      out.write("  <hr style=\"width: 10%; height: 2px\" class=\"color-main\">\r\n");
      out.write("  <div class=\"container pt-4 pb-3\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("      <div class=\"col-4 offset-2\">\r\n");
      out.write("        <h5>TÊN SẢN PHẨM</h5>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col\">\r\n");
      out.write("        <h5>SỐ LƯỢNG</h5>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col text-center\">\r\n");
      out.write("        <h5>GIÁ</h5>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col text-center\">\r\n");
      out.write("        <h5>THÀNH TIỀN</h5>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"row mt-4 mb-4\">\r\n");
      out.write("      <div class=\"col-2\">\r\n");
      out.write("        <img class=\"img-thumbnail\"\r\n");
      out.write("          src=\"https://product.hstatic.net/1000230642/product/dsm072033doo__3__8fce31cb70d042eeb130f10095764882_master.jpg\"\r\n");
      out.write("          alt=\"\" style=\"width: 75%\">\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col-4\">\r\n");
      out.write("        <p class=\"mb-1\"> Giày Thể Thao Nam Biti's DSM072033DOO (Đỏ)</p>\r\n");
      out.write("        <p style=\"font-size: 11px\">Mã sản phẩm: 123213213</p>\r\n");
      out.write("        <small>Size: 33 - Color: White</small> &nbsp; <span class=\"fas fa-trash\"></span>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col\">\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("          <input type=\"number\" class=\"form-control\" value=\"1\" style=\"width: 60%\">\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col  text-center\">\r\n");
      out.write("        <p>80.000đ</p>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col  text-center\">\r\n");
      out.write("        <p class=\"font-weight-bold\">380.000đ</p>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <hr>\r\n");
      out.write("    <div class=\"row mt-4 mb-4\">\r\n");
      out.write("      <div class=\"col-2\">\r\n");
      out.write("        <img class=\"img-thumbnail\"\r\n");
      out.write("          src=\"https://product.hstatic.net/1000230642/product/dsm072033doo__3__8fce31cb70d042eeb130f10095764882_master.jpg\"\r\n");
      out.write("          alt=\"\" style=\"width: 75%\">\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col-4\">\r\n");
      out.write("        <p class=\"mb-1\"> Giày Thể Thao Nam Biti's DSM072033DOO (Đỏ)</p>\r\n");
      out.write("        <p style=\"font-size: 11px\">Mã sản phẩm: 123213213</p>\r\n");
      out.write("        <small>Size: 33 - Color: White</small> &nbsp; <span class=\"fas fa-trash\"></span>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col\">\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("          <input type=\"number\" class=\"form-control\" value=\"1\" style=\"width: 60%\">\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col  text-center\">\r\n");
      out.write("        <p>80.000đ</p>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col  text-center\">\r\n");
      out.write("        <p class=\"font-weight-bold\">380.000đ</p>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <hr>\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("      <div class=\"col text-right\">\r\n");
      out.write("        <p style=\"font-size: 21px;\" class=\"font-weight-bold\">Tổng: 120.000đ</p>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("      <div class=\"col\">\r\n");
      out.write("        <button class=\"btn btn-primary btn-sm form-control font-weight-bold\"><span class=\"fas fa-key\"></span> ĐẶT HÀNG NGAY</button>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
