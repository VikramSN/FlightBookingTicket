package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pdf_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/jspdf/1.3.4/jspdf.debug.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://canvasjs.com/assets/script/canvasjs.min.js\"> </script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        var\r\n");
      out.write("    form,\r\n");
      out.write(" a4 = [595.28,841.89]; // for a4 size paper width and height\r\n");
      out.write("$(document).ready(function () {\r\n");
      out.write("    $(\".create_pdff\").on(\"click\", function (e) {\r\n");
      out.write("        $('body').scrollTop(0);\r\n");
      out.write("        var selector = $(e.target).attr('myprintt');\r\n");
      out.write("        createPDF(selector);\r\n");
      out.write("    });\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("function createPDF(selector) {\r\n");
      out.write("    form = $(selector);\r\n");
      out.write("    getCanvas().then(function (canvas) {\r\n");
      out.write("        var cache_width = form.width()\r\n");
      out.write("\r\n");
      out.write("        var img = canvas.toDataURL(\"image/png\"),\r\n");
      out.write("         doc = new jsPDF({\r\n");
      out.write("             unit: 'px',\r\n");
      out.write("             format: 'a4'\r\n");
      out.write("         });\r\n");
      out.write("        doc.addImage(img, 'JPEG', 20, 20);\r\n");
      out.write("        doc.save('techumber-html-to-pdf.pdf');\r\n");
      out.write("        form.width(cache_width);\r\n");
      out.write("    });\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("// create canvas object\r\n");
      out.write("function getCanvas() {\r\n");
      out.write("\r\n");
      out.write("    form.width((a4[0] * 1.33333) - 80).css('max-width', 'none');\r\n");
      out.write("    return html2canvas(form, {\r\n");
      out.write("        imageTimeout: 2000,\r\n");
      out.write("        removeContainer: false\r\n");
      out.write("    });\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("        <style>  \r\n");
      out.write("        table {  \r\n");
      out.write("            font-family: arial, sans-serif;  \r\n");
      out.write("            border-collapse: collapse;  \r\n");
      out.write("            width: 100%;  \r\n");
      out.write("        }  \r\n");
      out.write("  \r\n");
      out.write("        td, th {  \r\n");
      out.write("            border: 1px solid #dddddd;  \r\n");
      out.write("            text-align: left;  \r\n");
      out.write("            padding: 8px;  \r\n");
      out.write("        }  \r\n");
      out.write("  \r\n");
      out.write("        tr:nth-child(even) {  \r\n");
      out.write("            background-color: #dddddd;  \r\n");
      out.write("        }  \r\n");
      out.write("    </style>  \r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    \r\n");
      out.write("    <body>\r\n");
      out.write("    <div id=\"container\">\r\n");
      out.write("\r\n");
      out.write("    <table>\r\n");
      out.write("    <thead>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <th>Firstname</th>\r\n");
      out.write("        <th>Lastname</th>\r\n");
      out.write("        <th>Email</th>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </thead>\r\n");
      out.write("    <tbody>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>John</td>\r\n");
      out.write("        <td>Doe</td>\r\n");
      out.write("        <td>john@example.com</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>Mary</td>\r\n");
      out.write("        <td>Moe</td>\r\n");
      out.write("        <td>mary@example.com</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>July</td>\r\n");
      out.write("        <td>Dooley</td>\r\n");
      out.write("        <td>july@example.com</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </tbody>\r\n");
      out.write("  </table>\r\n");
      out.write("</div>\r\n");
      out.write("        <br>\r\n");
      out.write("            <center><button class=\"create_pdff\" myprintt=\"#container\" id=\"btn\">Download</button>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("       </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
