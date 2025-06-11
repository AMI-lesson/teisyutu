package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');

	session.removeAttribute("loginUserId");
	session.removeAttribute("employeeCode");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t\t<title>Start Up Education</title>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"common/css/style.css\">\r\n");
      out.write("\t</head>\r\n");
      out.write("\r\n");
      out.write("\t<body>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"header\">\r\n");
      out.write("\t\t\t<span class=\"big_title\">U</span>tart\r\n");
      out.write("\t\t\t<span class=\"big_title\">U</span>p<span class=\"big_title\">E</span>ducation\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"i_main_wrapper\">\r\n");
      out.write("\t\t\t<div class=\"employee_button\">\r\n");
      out.write("\t\t\t\t<input type=\"button\" class=\"regist_button\" onclick=\"location.href='login.jsp'\" value=\"管理者用メニュー\">\r\n");
      out.write("\t\t\t\t<input type=\"button\" onclick=\"location.href='attendance_login.jsp'\" value=\"従業員用メニュー\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"footer_top\">\r\n");
      out.write("\t\t\t<table class=\"table_format\">\r\n");
      out.write("\t\t\t\t<tr><th>管理者情報</th></tr>\r\n");
      out.write("\t\t\t\t<tr><td class=\"cel\">会社名</td><td>&nbsp;</td><td>株式会社 Start Up Education</td></tr>\r\n");
      out.write("\t\t\t\t<tr><td class=\"cel\">Tell</td><td>&nbsp;</td><td>03-3333-3333</td>\r\n");
      out.write("\t\t\t\t<tr><td class=\"cel\">Email</td><td>&nbsp;</td><td>startup_edu@freemail.com</td></tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"footer_design\">\r\n");
      out.write("\t\t\t<footer>\r\n");
      out.write("\t\t\t\t<small>© 2019 StartUpEducation.</small>\r\n");
      out.write("\t\t\t</footer>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
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
