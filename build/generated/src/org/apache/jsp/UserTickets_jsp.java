package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.util.ArrayList;
import bookingdone.bookinggettersetter;
import bookingdone.bookinginterImpl;
import bookingdone.bookinginterface;

public final class UserTickets_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Your Ticktes Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");
      if (_jspx_meth_ch_import_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("          \n");
      out.write("            ");

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
String sql ="SELECT * FROM finalbook";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
                       String username = resultSet.getString("name");
                        if(username.equals(loge)){

      out.write("\n");
      out.write("            \n");
      out.write("        <div class=\"container\">\n");
      out.write("            <table class=\"table table-bordered table-inverse\" style=\"background-color: #000; opacity: 0.7; color: #fff\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>ID</th>\n");
      out.write("                        <th>Name</th>\n");
      out.write("                        <th>Email</th>\n");
      out.write("                        <th>Contact</th>\n");
      out.write("                        <th>No. of Passenger</th>\n");
      out.write("                        <th>Selected Class</th>\n");
      out.write("                        <th>No. of Total Price</th>\n");
      out.write("                        <th>No. of Total Seat booked</th>\n");
      out.write("                        <th>Delete Ticket</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("\n");
      out.write("                <tbody>\n");
      out.write("\n");
      out.write("                        <tr bgcolor=\"white\" style=\"color:white; \">\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td scope=\"row\">");
      out.print(resultSet.getString("id"));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(resultSet.getString("name"));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(resultSet.getString("email"));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(resultSet.getString("contact"));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(resultSet.getString("nop"));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(resultSet.getString("selectclass"));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(resultSet.getString("totalprice"));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(resultSet.getString("totalseat"));
      out.write("</td>\n");
      out.write("                            <th><center><a href=\"DeleteFromDBP?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"btn btn-danger\">Delete</a></center></th>\n");
      out.write("                   \n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      \n");
      out.write("        \n");
                        }
			 }
} catch (Exception e) {
e.printStackTrace();
}

      out.write("\n");
      out.write("         \n");
      out.write("         \n");
      out.write("        <cc:import url = \"footer.jsp\"/>         \n");
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
