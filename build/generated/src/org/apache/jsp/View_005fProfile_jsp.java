package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class View_005fProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_ch_import_url_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_ch_import_url_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_ch_import_url_nobody.release();
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Profile Page</title>\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            #maincontainer12{\n");
      out.write("                background-color: #000;\n");
      out.write("                opacity: 0.8;\n");
      out.write("                width: 70%;\n");
      out.write("                border: 1px solid;\n");
      out.write("                padding: 10px;\n");
      out.write("                box-shadow: 5px 10px #888888;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      if (_jspx_meth_ch_import_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        \n");
      out.write("        ");

String loge =String.valueOf(request.getSession().getAttribute("userdb"));
String driverName = "org.apache.derby.jdbc.ClientDriver";
String connectionUrl = "jdbc:derby://localhost:1527/";
String dbName = "PA";
String userId = "areo";
String password = "plane";
try {
Class.forName(driverName);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;

      out.write('\n');

try { 
connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
statement=connection.createStatement();
String sql ="SELECT * FROM register";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
                       String username = resultSet.getString("name");
                        if(username.equals(loge)){

      out.write("\n");
      out.write("  <div class=\"container\" id=\"maincontainer12\">\n");
      out.write("     \n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("                    \n");
      out.write(" <form action=\"DoUpDate\" method=\"post\" style=\"margin: auto; width: 80%;\">\n");
      out.write("             <center>\n");
      out.write("                            <b><h2 style=\"color: #fff; font-size:30px;\">\n");
      out.write("                                    View Profile\n");
      out.write("                                </h2></b>\n");
      out.write("                        </center>\n");
      out.write("                        <hr class=\"colorgraph\">\n");
      out.write("            <input type=\"hidden\" name =\"UpDate\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${profile.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("            <label style= \"color: #fff\">Name</label><br>\n");
      out.write("            <input type=\"text\" name =\"UpDate\" class=\"form-control\" value=\"");
      out.print(resultSet.getString("name"));
      out.write("\" placeholder=\"username\" style=\"width: 100%\">\n");
      out.write("            <br>\n");
      out.write("            <label style= \"color: #fff\">Email</label><br>\n");
      out.write("            <input type=\"email\" name=\"UpDate\" class=\"form-control\" value=\"");
      out.print(resultSet.getString("email"));
      out.write("\"  required style=\"width: 100%\">\n");
      out.write("              <br>\n");
      out.write("              \n");
      out.write("<!--              <input type=\"password\" name=\"UpDate\" class=\"form-control\" value=\"\" placeholder=\"password\">\n");
      out.write("             <br>-->\n");
      out.write("              <label style= \"color: #fff\">Contact</label><br>\n");
      out.write("              <input type=\"text\" name=\"UpDate\" class=\"form-control\" value=\"");
      out.print(resultSet.getString("contact"));
      out.write("\" maxlength=\"10\" style=\"width: 100%\">\n");
      out.write("              <br>\n");
      out.write("              \n");
      out.write("<!--              <textarea  name=\"UpDate\" class=\"form-control\" value=\"\" placeholder=\"address\"></textarea>\n");
      out.write("              <br>\n");
      out.write("              -->\n");
      out.write("              <br>\n");
      out.write("              <input type=\"file\" name=\"pic\" accept=\"image/*\" class=\"btn btn-primary\" onchange=\"readURL(this);\" style=\"width: 100%\"><br><br>\n");
      out.write("              <input type=\"submit\" value=\"Update\" class=\"btn btn-danger\" style=\"width: 100px;\">\n");
      out.write("                        <hr class=\"colorgraph\">\n");
      out.write("                        <script>\n");
      out.write("                            function readURL(input) {\n");
      out.write("        if (input.files && input.files[0]) {\n");
      out.write("            var reader = new FileReader();\n");
      out.write("\n");
      out.write("            reader.onload = function (e) {\n");
      out.write("                $('#blah')\n");
      out.write("                    .attr('src', e.target.result)\n");
      out.write("                    .width(300)\n");
      out.write("                    .height(350);\n");
      out.write("            };\n");
      out.write("\n");
      out.write("            reader.readAsDataURL(input.files[0]);\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("                            </script>\n");
      out.write("        </form>\n");
      out.write("                              </div>\n");
      out.write("              <div class=\"col-sm-6\">\n");
      out.write("                  <img id=\"blah\" src=\"#\" style=\"margin-top: 80px;\" alt=\"your image\" />\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
                        }
			 }
} catch (Exception e) {
e.printStackTrace();
}

      out.write("\n");
      out.write("        \n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_ch_import_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ch:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_ch_import_0 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _jspx_tagPool_ch_import_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_ch_import_0.setPageContext(_jspx_page_context);
    _jspx_th_ch_import_0.setParent(null);
    _jspx_th_ch_import_0.setUrl("navbarhead.jsp");
    int[] _jspx_push_body_count_ch_import_0 = new int[] { 0 };
    try {
      int _jspx_eval_ch_import_0 = _jspx_th_ch_import_0.doStartTag();
      if (_jspx_th_ch_import_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_ch_import_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_ch_import_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_ch_import_0.doFinally();
      _jspx_tagPool_ch_import_url_nobody.reuse(_jspx_th_ch_import_0);
    }
    return false;
  }
}
