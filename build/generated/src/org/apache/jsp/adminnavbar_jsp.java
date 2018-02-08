package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminnavbar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"js/sweetalert.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/sweetalert.css\">  \n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("            body{\n");
      out.write("\n");
      out.write("                background-image: url(\"images/backas.jpg\");\n");
      out.write("            background-repeat: no-repeat;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .navstyle {\n");
      out.write("\n");
      out.write("                font-size: 10px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      <!---- start navbar ------------------------------------ -->\n");
      out.write("        <nav class=\"navbar navbar-inverse navstyle\" style=' background-color: #1C2C64; border: none'>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <img class=\"navbar-brand\" src='images/webicon.png' />\n");
      out.write("                    <a class=\"navbar-brand\" href=\"AdminHP.jsp\">PhoenixAirways</a>\n");
      out.write("                </div>\n");
      out.write("                <ul class=\"nav navbar-nav \">\n");
      out.write("                    <li><a href=\"View_User.jsp\"><b>VIEW USERS</b></a></li>      \n");
      out.write("                       <li><a href=\"Upload_Runways.jsp\"><b>UPLOAD RUNWAY</b></a></li>\n");
      out.write("                    <li><a href=\"Upload_Products.jsp\"><b>UPLOAD PRODUCTS</b></a></li>\n");
      out.write("              <li><a href=\"View_Runways.jsp\"><b>VIEW RUNWAYS</b></a></li>\n");
      out.write("              <li><a href=\"View_Products.jsp\"><b>VIEW PRODUCTS</b></a></li>\n");
      out.write("                    <li><a href=\"View_TicketBooker.jsp\"><b>VIEW TICKET BOOKER</b></a></li>\n");
      out.write("                    <li><a href=\"View_Reports.jsp\"><b>VIEW REPORT</b></a></li>\n");
      out.write("                </ul>\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        <li><a href=\"#\"><b style=\"font-size: 14px\">ADMIN</b></a></li>\n");
      out.write("                        <a href=\"HomePage.jsp\"><button class=\"btn btn-danger navbar-btn\">Logout</button></a>\n");
      out.write("    </ul>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <!---- stop navbar ------------------------------------ -->\n");
      out.write("        \n");
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
}
