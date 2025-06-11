package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


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

	if (session.getAttribute("loginUserId") == null) {
		response.sendRedirect("login.jsp");
	} else {

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>管理者用メニュー</title>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"common/css/style.css\">\r\n");
      out.write("\t</head>\r\n");
      out.write("\r\n");
      out.write("\t<body>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"header\">\r\n");
      out.write("\t\t\t<span class=\"big_title\">S</span>tart <span class=\"big_title\">U</span>p\r\n");
      out.write("\t\t\t<span class=\"big_title\">E</span>ducation\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"main_wrapper\">\r\n");
      out.write("\t\t\t<div class=\"employee_button\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<a href=\"GetSectionEmployee\" class=\"regist_button\">\r\n");
      out.write("\t\t\t\t\t<button class=\"display_button\">従業員登録</button>\r\n");
      out.write("\t\t\t\t</a> <a href=\"DisplayEmployeeList\">\r\n");
      out.write("\t\t\t\t\t<button class=\"display_button\">従業員情報一覧</button>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"logout_button\">\r\n");
      out.write("\t\t\t\t<a href=\"regist_adminuser.jsp\">\r\n");
      out.write("\t\t\t\t\t<button class=\"display_button\">管理者権限を付与する</button>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"link_main_button\">\r\n");
      out.write("\t\t\t\t<form action=\"LogoutChk\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t<button class=\"display_button\">ログアウト</button>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=link_main_button>\r\n");
      out.write("\t\t\t\t<input type=\"button\" class=\"display_button\"\r\n");
      out.write("\t\t\t\t\tonclick=\"location.href='SendIndex'\" value=\"Topページ\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"footer_top\">\r\n");
      out.write("\t\t\t<table class=\"table_format\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>管理者情報</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"cel\">会社名</td>\r\n");
      out.write("\t\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t<td>株式会社 Start Up Education</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"cel\">Tell</td>\r\n");
      out.write("\t\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t<td>03-3333-3333</td>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"cel\">Email</td>\r\n");
      out.write("\t\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t<td>startup_edu@freemail.com</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"footer_design\">\r\n");
      out.write("\t\t\t<footer>\r\n");
      out.write("\t\t\t\t<small>© 2019 StartUpEducation.</small>\r\n");
      out.write("\t\t\t</footer>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>\r\n");

	}

    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
