/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.55
 * Generated at: 2022-05-10 14:40:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.home.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/Users/kiddo/OneDrive/Desktop/LTWeb/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/LapTrinhWebsite/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153359882000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1652064656778L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\" style=\"margin-top: 35px\">\r\n");
      out.write("	<h3 class=\"text-center\" s>DANH MỤC SẢN PHẨM</h3>\r\n");
      out.write("	<hr style=\"width: 10%; height: 2px\" class=\"color-main\">\r\n");
      out.write("	<div class=\"container bg-light pt-4 pb-3\">\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<div class=\"col-lg-4\">\r\n");
      out.write("				<div class=\"form-group\">\r\n");
      out.write("					<select class=\"form-control\" id=\"price\">\r\n");
      out.write("						<option value=\"-1\" disabled selected>Chọn giá tiền</option>\r\n");
      out.write("						<option value=\"0\">Dưới 200.000đ</option>\r\n");
      out.write("						<option value=\"1\">200.000đ - 300.000đ</option>\r\n");
      out.write("						<option value=\"2\">300.000đ - 500.000đ</option>\r\n");
      out.write("						<option value=\"3\">Trên 500.000đ</option>\r\n");
      out.write("					</select>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-lg-4\">\r\n");
      out.write("				<div class=\"form-group\">\r\n");
      out.write("					<select class=\"form-control\" id=\"size\">\r\n");
      out.write("						<option value=\"-1\" disabled selected>Chọn kích thước</option>\r\n");
      out.write("						<option value=\"35\">35</option>\r\n");
      out.write("						<option value=\"36\">36</option>\r\n");
      out.write("						<option value=\"37\">37</option>\r\n");
      out.write("						<option value=\"38\">38</option>\r\n");
      out.write("						<option value=\"39\">39</option>\r\n");
      out.write("						<option value=\"40\">40</option>\r\n");
      out.write("						<option value=\"41\">41</option>\r\n");
      out.write("						<option value=\"42\">42</option>\r\n");
      out.write("						<option value=\"43\">43</option>\r\n");
      out.write("						<option value=\"44\">44</option>\r\n");
      out.write("						<option value=\"45\">45</option>\r\n");
      out.write("					</select>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-lg-4\">\r\n");
      out.write("				<div class=\"form-group\">\r\n");
      out.write("					<select class=\"form-control\" id=\"color\">\r\n");
      out.write("						<option value=\"-1\" disabled selected>Chọn màu sắc</option>\r\n");
      out.write("						");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("					</select>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<div class=\"container pt-4\">\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<div class=\"col text-right\">\r\n");
      out.write("				<select id=\"sort\">\r\n");
      out.write("					<option value=\"-1\" disabled selected>Sắp xếp theo</option>\r\n");
      out.write("					<option value=\"0\">Sắp xếp từ A-Z</option>\r\n");
      out.write("					<option value=\"1\">Sắp xếp từ Z-A</option>\r\n");
      out.write("					<option value=\"2\">Giá giảm dần</option>\r\n");
      out.write("					<option value=\"3\">Giá tăng dần</option>\r\n");
      out.write("					<option value=\"4\">Đang giảm giá</option>\r\n");
      out.write("					<option value=\"5\">Hàng mới về</option>\r\n");
      out.write("				</select>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<div class=\"container\" style=\"margin-top: 35px\">\r\n");
      out.write("		<div class=\"row\" id=\"data\"></div>\r\n");
      out.write("\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<div class=\"col\">\r\n");
      out.write("				<ul class=\"pagination justify-content-end\" id=\"pageControl\">\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("	var data = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${data}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(";\r\n");
      out.write("	var arr = data;\r\n");
      out.write("	var numItem = 12;\r\n");
      out.write("	var index = 0;\r\n");
      out.write("\r\n");
      out.write("	console.log(data);\r\n");
      out.write("	$(document).ready(function() {\r\n");
      out.write("		showPage();\r\n");
      out.write("	});\r\n");
      out.write("\r\n");
      out.write("	function showPage() {\r\n");
      out.write("		var text = \"\";\r\n");
      out.write("		for (var i = index * numItem; i < (index + 1) * numItem; i++) {\r\n");
      out.write("			if (i < arr.length) {\r\n");
      out.write("				text += creatHtml(arr[i]);\r\n");
      out.write("			}\r\n");
      out.write("		}\r\n");
      out.write("		if (text == \"\") {\r\n");
      out.write("			text = \"<div class='col'><p class='text-center'>Hiện không có sản phầm nào.</p></div>\";\r\n");
      out.write("		}\r\n");
      out.write("		$(\"#data\").html(text);\r\n");
      out.write("\r\n");
      out.write("		text = \"\";\r\n");
      out.write("		var lengthPage = Math.round(arr.length / numItem)\r\n");
      out.write("				+ (arr.length % numItem == 0 ? 0 : 1);\r\n");
      out.write("		if (index > 0) {\r\n");
      out.write("			text += '<li class=\"page-item\"><a class=\"page-link text-dark\" href=\"javascript:void(0);\" onclick=\"nextPage(-1)\"><</a></li>';\r\n");
      out.write("		}\r\n");
      out.write("		text += '<li class=\"page-item\"><a class=\"page-link text-light bg-info\" href=\"javascript:void(0);\">'\r\n");
      out.write("				+ (index + 1) + '</a></li>';\r\n");
      out.write("		if (index + 1 < lengthPage) {\r\n");
      out.write("			text += '<li class=\"page-item\"><a class=\"page-link text-dark\" href=\"javascript:void(0);\" onclick=\"nextPage(+1)\">></a></li>';\r\n");
      out.write("		}\r\n");
      out.write("		$(\"#pageControl\").html(text);\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	function nextPage(param) {\r\n");
      out.write("		index += param;\r\n");
      out.write("		showPage();\r\n");
      out.write("		$(\"html, body\").animate({\r\n");
      out.write("			scrollTop : 0\r\n");
      out.write("		}, \"slow\");\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	$(\"#price\").on(\"change\", function() {\r\n");
      out.write("		search();\r\n");
      out.write("	})\r\n");
      out.write("\r\n");
      out.write("	$(\"#size\").on(\"change\", function() {\r\n");
      out.write("		search();\r\n");
      out.write("	})\r\n");
      out.write("\r\n");
      out.write("	$(\"#color\").on(\"change\", function() {\r\n");
      out.write("		search();\r\n");
      out.write("	})\r\n");
      out.write("\r\n");
      out.write("	$(\"#sort\").on(\"change\", function() {\r\n");
      out.write("		search();\r\n");
      out.write("	})\r\n");
      out.write("\r\n");
      out.write("	function search() {\r\n");
      out.write("\r\n");
      out.write("		arr = Array.from(data);\r\n");
      out.write("\r\n");
      out.write("		var price = $(\"#price\").val();\r\n");
      out.write("\r\n");
      out.write("		if (price != null) {\r\n");
      out.write("			console.log(\"search price\");\r\n");
      out.write("			var prices = [ 200000, 300000, 500000, 100000000 ];\r\n");
      out.write("			for (var i = arr.length - 1; i >= 0; i--) {\r\n");
      out.write("				if (arr[i].price > prices[price]\r\n");
      out.write("						|| (price > 0 && arr[i].price < prices[price - 1])) {\r\n");
      out.write("					arr.splice(i, 1);\r\n");
      out.write("				}\r\n");
      out.write("			}\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		var size = $(\"#size\").val();\r\n");
      out.write("		if (size != null) {\r\n");
      out.write("			console.log(\"search size\");\r\n");
      out.write("			for (var i = arr.length - 1; i >= 0; i--) {\r\n");
      out.write("				var infos = JSON.parse(arr[i].strInfos);\r\n");
      out.write("				var exist = false;\r\n");
      out.write("				for (var j = 0; j < infos.length; j++) {\r\n");
      out.write("					if (infos[j].size == size && infos[j].quantity > 0) {\r\n");
      out.write("						exist = true;\r\n");
      out.write("						break;\r\n");
      out.write("					}\r\n");
      out.write("				}\r\n");
      out.write("				if (!exist) {\r\n");
      out.write("					arr.splice(i, 1);\r\n");
      out.write("				}\r\n");
      out.write("			}\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		var color = $(\"#color\").val();\r\n");
      out.write("		if (color != null) {\r\n");
      out.write("			console.log(\"search color\");\r\n");
      out.write("			for (var i = arr.length - 1; i >= 0; i--) {\r\n");
      out.write("				if (arr[i].colorId != color) {\r\n");
      out.write("					arr.splice(i, 1);\r\n");
      out.write("				}\r\n");
      out.write("			}\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		var sort = $(\"#sort\").val();\r\n");
      out.write("		if (sort != null){\r\n");
      out.write("			console.log(\"search sort: \" + sort);\r\n");
      out.write("			console.log(arr);\r\n");
      out.write("			switch (Number(sort)){\r\n");
      out.write("			case 0:\r\n");
      out.write("				arr.sort((a,b) => (a.name > b.name) ? 1 : ((b.name > a.name) ? -1 : 0));\r\n");
      out.write("				break;\r\n");
      out.write("			case 1:\r\n");
      out.write("				arr.sort((a,b) => (a.name > b.name) ? -1 : ((b.name > a.name) ? 1 : 0));\r\n");
      out.write("				break;\r\n");
      out.write("			case 2:\r\n");
      out.write("				arr.sort((a,b) => (a.price > b.price) ? -1 : ((b.price > a.price) ? 1 : 0));\r\n");
      out.write("				break;\r\n");
      out.write("			case 3:\r\n");
      out.write("				arr.sort((a,b) => (a.price > b.price) ? 1 : ((b.price > a.price) ? -1 : 0));\r\n");
      out.write("				break;\r\n");
      out.write("			case 4:\r\n");
      out.write("				arr.sort((a,b) => (a.sale > b.sale) ? -1 : ((b.sale > a.sale) ? 1 : 0));\r\n");
      out.write("				break;\r\n");
      out.write("			case 5:\r\n");
      out.write("				arr.sort((a,b) => (a.isNew) ? -1 : (b.isNew ? 1 : 0));\r\n");
      out.write("				break;\r\n");
      out.write("			}\r\n");
      out.write("		\r\n");
      out.write("\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("\r\n");
      out.write("		index = 0;\r\n");
      out.write("		showPage();\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	function creatHtml(item) {\r\n");
      out.write("		return '<div class=\"col-md-3 col-6\" id=\"card-item\"><a href=\"chi-tiet-san-pham?id='\r\n");
      out.write("				+ item.id\r\n");
      out.write("				+ '\" style=\"text-decoration: none\"> <div class=\"card mb-3 box-shadow\" style=\"color: black\"> <img class=\"card-img-top mb-4\" src=\"upload/' + item.thump + '\" alt=\"\"> <div class=\"top-right font-weight-bold text-white bg-danger\" style=\"position: absolute; top: 3px; right: 5px; padding: 2px 8px\">' + (item.sale > 0 ? \"GIẢM \" + item.sale + \"%\" : (item.isNew ? \"HÀNG MỚI\" : \"\")) + '</div> <div class=\"card-body text-center pt-0\" style=\"padding-left: 5px; padding-right: 5px\"> <p class=\"card-text font-weight-bold font-weight-bolder text-warning\">'\r\n");
      out.write("				+ item.name\r\n");
      out.write("				+ '</p> <p>Giá: '\r\n");
      out.write("				+ formatNumber(item.price)\r\n");
      out.write("				+ 'đ</p> </div> </div> </a> </div>';\r\n");
      out.write("	}\r\n");
      out.write("</script>");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /home/view/list.jsp(42,6) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/home/view/list.jsp(42,6) '${colors}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${colors}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /home/view/list.jsp(42,6) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("color");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("							<option value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${color.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write('"');
            out.write('>');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${color.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</option>\r\n");
            out.write("						");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}
