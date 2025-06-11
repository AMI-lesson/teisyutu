package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class regist_005fadminuser_jsp extends org.apache.jasper.runtime.HttpJspBase
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

	if (session.getAttribute("loginUserId") == null) {
		response.sendRedirect("login.jsp");
	} else {

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>総務部登録</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"common/css/style.css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"common/JS/func.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"header\">\r\n");
      out.write("\t\t<span class=\"big_title\">S</span>tart <span class=\"big_title\">U</span>p\r\n");
      out.write("\t\t<span class=\"big_title\">E</span>ducation\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"menu\">\r\n");
      out.write("\t\t<div class=\"main_frame\">\r\n");
      out.write("\t\t\t<p>総務部登録</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"main_wrapper\">\r\n");
      out.write("\t\t<div class=\"main_admin\">\r\n");
      out.write("\t\t\t総務部として登録をします。<br> ユーザーID(4文字以上)、パスワード(8文字以上)を半角英数で入力してください。\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<form action=\"RegistAdminUser\" method=\"POST\"\r\n");
      out.write("\t\t\tonsubmit=\"return chkUser()\">\r\n");
      out.write("\t\t\t<div class=\"regist_table\">\r\n");
      out.write("\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>ユーザーID</td>\r\n");
      out.write("\t\t\t\t\t\t<td>：</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"userId\" id=\"user_id\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"comment_user_id\">半角英数4文字以上24文字以下で入力してください</div>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>パスワード</td>\r\n");
      out.write("\t\t\t\t\t\t<td>：</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"password\" name=\"password\" id=\"password\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td><div id=\"comment_password\">半角英数8文字以上32文字以下で入力してください</div></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>もう一度</td>\r\n");
      out.write("\t\t\t\t\t\t<td>：</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"password\" name=\"confirmation\"\r\n");
      out.write("\t\t\t\t\t\t\tid=\"confirmation\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"comment_confirmation\">パスワードと違います</div>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t<div class=\"tomenu_button\">\r\n");
      out.write("\t\t\t\t\t<div class=\"admin_user_button\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" class=\"admin_user_submit\" value=\"登録する\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<a href=\"menu.jsp\"> <input type=\"button\" class=\"clear_button\"\r\n");
      out.write("\t\t\t\t\t\t\tvalue=\"キャンセル\">\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"footer_top\">\r\n");
      out.write("\t\t<table class=\"table_format\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th>管理者情報</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"cel\">会社名</td>\r\n");
      out.write("\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t\t<td>株式会社 Start Up Education</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"cel\">Tell</td>\r\n");
      out.write("\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t\t<td>03-3333-3333</td>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"cel\">Email</td>\r\n");
      out.write("\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t\t<td>startup_edu@freemail.com</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"footer_design\">\r\n");
      out.write("\t\t<footer>\r\n");
      out.write("\t\t\t<small>© 2019 StartUpEducation.</small>\r\n");
      out.write("\t\t</footer>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
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
