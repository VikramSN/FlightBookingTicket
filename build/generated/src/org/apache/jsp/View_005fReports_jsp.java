package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import profiles.Profiles;
import profiles.ProfileDaoIMPl;
import profiles.ProfileDAO;
import java.util.ArrayList;
import runwayupload.runwaygettersetter;
import runwayupload.runwayinterImpl;
import runwayupload.runwayinterface;
import flightupload.flightgettersetter;
import flightupload.flightinterImpl;
import flightupload.flightinterface;
import bookingdone.bookinggettersetter;
import bookingdone.bookinginterImpl;
import bookingdone.bookinginterface;

public final class View_005fReports_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_cc_import_url_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_cc_import_url_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_cc_import_url_nobody.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
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
      out.write(" \n");
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
      out.write("        <title>Reports Page</title>\n");
      out.write("         <script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/jspdf/1.3.4/jspdf.debug.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"https://canvasjs.com/assets/script/canvasjs.min.js\"> </script>\n");
      out.write("<script type=\"text/javascript\" src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("        var\n");
      out.write("    form,\n");
      out.write(" a4 = [595.28,841.89]; // for a4 size paper width and height\n");
      out.write("$(document).ready(function () {\n");
      out.write("    $(\".create_pdf\").on(\"click\", function (e) {\n");
      out.write("        $('body').scrollTop(0);\n");
      out.write("        var selector = $(e.target).attr('myprint');\n");
      out.write("        createPDF(selector);\n");
      out.write("    });\n");
      out.write("});\n");
      out.write("\n");
      out.write("function createPDF(selector) {\n");
      out.write("    form = $(selector);\n");
      out.write("    getCanvas().then(function (canvas) {\n");
      out.write("        var cache_width = form.width()\n");
      out.write("\n");
      out.write("        var img = canvas.toDataURL(\"image/png\"),\n");
      out.write("         doc = new jsPDF({\n");
      out.write("             unit: 'px',\n");
      out.write("             format: 'a4'\n");
      out.write("         });\n");
      out.write("        doc.addImage(img, 'JPEG', 20, 20);\n");
      out.write("        doc.save('PA-Reports.pdf');\n");
      out.write("        form.width(cache_width);\n");
      out.write("    });\n");
      out.write("}\n");
      out.write("\n");
      out.write("// create canvas object\n");
      out.write("function getCanvas() {\n");
      out.write("\n");
      out.write("    form.width((a4[0] * 1.33333) - 80).css('max-width', 'none');\n");
      out.write("    return html2canvas(form, {\n");
      out.write("        imageTimeout: 2000,\n");
      out.write("        removeContainer: true\n");
      out.write("    });\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("        var\n");
      out.write("    form,\n");
      out.write(" a4 = [595.28,841.89]; // for a4 size paper width and height\n");
      out.write("$(document).ready(function () {\n");
      out.write("    $(\".create_pdf2\").on(\"click\", function (e) {\n");
      out.write("        $('body').scrollTop(0);\n");
      out.write("        var selector = $(e.target).attr('myprint2');\n");
      out.write("        createPDF(selector);\n");
      out.write("    });\n");
      out.write("});\n");
      out.write("\n");
      out.write("function createPDF2(selector) {\n");
      out.write("    form = $(selector);\n");
      out.write("    getCanvas().then(function (canvas) {\n");
      out.write("        var cache_width = form.width()\n");
      out.write("\n");
      out.write("        var img = canvas.toDataURL(\"image/png\"),\n");
      out.write("         doc = new jsPDF({\n");
      out.write("             unit: 'px',\n");
      out.write("             format: 'a4'\n");
      out.write("         });\n");
      out.write("        doc.addImage(img, 'JPEG', 20, 20);\n");
      out.write("        doc.save('View-Runway-Data.pdf');\n");
      out.write("        form.width(cache_width);\n");
      out.write("    });\n");
      out.write("}\n");
      out.write("\n");
      out.write("// create canvas object\n");
      out.write("function getCanvas() {\n");
      out.write("\n");
      out.write("    form.width((a4[0] * 1.33333) - 80).css('max-width', 'none');\n");
      out.write("    return html2canvas(form, {\n");
      out.write("        imageTimeout: 2000,\n");
      out.write("        removeContainer: true\n");
      out.write("    });\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("        var\n");
      out.write("    form,\n");
      out.write(" a4 = [595.28,841.89]; // for a4 size paper width and height\n");
      out.write("$(document).ready(function () {\n");
      out.write("    $(\".create_pdf3\").on(\"click\", function (e) {\n");
      out.write("        $('body').scrollTop(0);\n");
      out.write("        var selector = $(e.target).attr('myprint3');\n");
      out.write("        createPDF(selector);\n");
      out.write("    });\n");
      out.write("});\n");
      out.write("\n");
      out.write("function createPDF3(selector) {\n");
      out.write("    form = $(selector);\n");
      out.write("    getCanvas().then(function (canvas) {\n");
      out.write("        var cache_width = form.width()\n");
      out.write("\n");
      out.write("        var img = canvas.toDataURL(\"image/png\"),\n");
      out.write("         doc = new jsPDF({\n");
      out.write("             unit: 'px',\n");
      out.write("             format: 'a4'\n");
      out.write("         });\n");
      out.write("        doc.addImage(img, 'JPEG', 20, 20);\n");
      out.write("        doc.save('View-Flight-Data.pdf');\n");
      out.write("        form.width(cache_width);\n");
      out.write("    });\n");
      out.write("}\n");
      out.write("\n");
      out.write("// create canvas object\n");
      out.write("function getCanvas() {\n");
      out.write("\n");
      out.write("    form.width((a4[0] * 1.33333) - 80).css('max-width', 'none');\n");
      out.write("    return html2canvas(form, {\n");
      out.write("        imageTimeout: 2000,\n");
      out.write("        removeContainer: true\n");
      out.write("    });\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("        var\n");
      out.write("    form,\n");
      out.write(" a4 = [595.28,841.89]; // for a4 size paper width and height\n");
      out.write("$(document).ready(function () {\n");
      out.write("    $(\".create_pdf4\").on(\"click\", function (e) {\n");
      out.write("        $('body').scrollTop(0);\n");
      out.write("        var selector = $(e.target).attr('myprint4');\n");
      out.write("        createPDF(selector);\n");
      out.write("    });\n");
      out.write("});\n");
      out.write("\n");
      out.write("function createPDF4(selector) {\n");
      out.write("    form = $(selector);\n");
      out.write("    getCanvas().then(function (canvas) {\n");
      out.write("        var cache_width = form.width()\n");
      out.write("\n");
      out.write("        var img = canvas.toDataURL(\"image/png\"),\n");
      out.write("         doc = new jsPDF({\n");
      out.write("             unit: 'px',\n");
      out.write("             format: 'a4'\n");
      out.write("         });\n");
      out.write("        doc.addImage(img, 'JPEG', 20, 20);\n");
      out.write("        doc.save('View-Ticket-Data.pdf');\n");
      out.write("        form.width(cache_width);\n");
      out.write("    });\n");
      out.write("}\n");
      out.write("\n");
      out.write("// create canvas object\n");
      out.write("function getCanvas() {\n");
      out.write("\n");
      out.write("    form.width((a4[0] * 1.33333) - 80).css('max-width', 'none');\n");
      out.write("    return html2canvas(form, {\n");
      out.write("        imageTimeout: 2000,\n");
      out.write("        removeContainer: true\n");
      out.write("    });\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write(" <style>  \n");
      out.write("        table {  \n");
      out.write("            font-family: arial, sans-serif;  \n");
      out.write("            border-collapse: collapse;  \n");
      out.write("            width: 100%;  \n");
      out.write("        }  \n");
      out.write("  \n");
      out.write("        td, th {  \n");
      out.write("            border: 1px solid #dddddd;  \n");
      out.write("            text-align: left;  \n");
      out.write("            padding: 8px;  \n");
      out.write("        }  \n");
      out.write("  \n");
      out.write("        tr:nth-child(even) {  \n");
      out.write("            background-color: #dddddd;  \n");
      out.write("        }  \n");
      out.write("    </style>  \n");
      out.write("    </head>\n");
      out.write("      ");

        ProfileDAO pdao = new ProfileDaoIMPl();

        List<Profiles> list = pdao.getProfiles();

        request.setAttribute("products", list);

    
      out.write("\n");
      out.write("    \n");
      out.write("         ");

            runwayinterImpl impl = new runwayinterImpl();
            ArrayList list2 = (ArrayList) impl.getcar_info();
        
      out.write("\n");
      out.write("        \n");
      out.write("        ");

            flightinterImpl impl3 = new flightinterImpl();
            ArrayList list3 = (ArrayList) impl3.getcar_info();
        
      out.write("\n");
      out.write("        \n");
      out.write("        ");

            bookinginterImpl impl4 = new bookinginterImpl();
            ArrayList list4 = (ArrayList) impl4.getbooking_info();
        
      out.write("\n");
      out.write("    <body bgcolor=\"#34495E\">\n");
      if (_jspx_meth_cc_import_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("<!-- =======================user data==========================-->\n");
      out.write("\n");
      out.write("        <div id=\"container\">\n");
      out.write("        <table class=\"table table-bordered table-inverse\" style=\"background-color: #fff; opacity: 0.7; font-size: 12px; color: #000\">\n");
      out.write("            <thead>\n");
      out.write("            <td colspan=\"3\" style=\"font-size: 16px;\">View Profiles</td>\n");
      out.write("            <td><button class=\"btn-success create_pdf\" onclick=\"createPDFClick();\" myprint=\"#container\" id=\"btn\">Download</button></td>\n");
      out.write("                <tr>\n");
      out.write("                    <th>ID</th>\n");
      out.write("                    <th>User Name</th>\n");
      out.write("                    <th>User Email</th>\n");
      out.write("                    <th>User Contact</th>\n");
      out.write("                   </tr>\n");
      out.write("            </thead>\n");
      out.write("\n");
      out.write("            <tbody>\n");
      out.write("\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("            </div>\n");
      out.write("                        <!-- =======================user data end==========================-->\n");
      out.write("                        \n");
      out.write("                        <hr><br>\n");
      out.write("                         ");
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_set_0.setPageContext(_jspx_page_context);
      _jspx_th_c_set_0.setParent(null);
      _jspx_th_c_set_0.setVar("value");
      _jspx_th_c_set_0.setValue(list2);
      int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
      if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
        return;
      }
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      out.write("\n");
      out.write("        <div id=\"containerr\">\n");
      out.write("        <table class=\"table table-bordered table-inverse\" style=\"background-color: #fff; opacity: 0.9; font-size: 12px; color: #000\">\n");
      out.write("            <thead>\n");
      out.write("                <td colspan=\"4\" style=\"font-size: 16px;\">Runways Details</td>\n");
      out.write("                <td><button class=\"btn-success create_pdf2\" onclick=\"createPDFClick();\" myprint2=\"#containerr\" id=\"btn2\">Download</button></td>\n");
      out.write("                <tr>\n");
      out.write("                    <th>ID</th>\n");
      out.write("                    <th>Runway Image</th>\n");
      out.write("                    <th>Runway Name</th>\n");
      out.write("                    <th>Runway State</th>\n");
      out.write("                    <th>Runway Date</th>\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("\n");
      out.write("            <tbody>\n");
      out.write("\n");
      out.write("                 ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("        <hr><br>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_set_1.setPageContext(_jspx_page_context);
      _jspx_th_c_set_1.setParent(null);
      _jspx_th_c_set_1.setVar("value");
      _jspx_th_c_set_1.setValue(list3);
      int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
      if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
        return;
      }
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      out.write("\n");
      out.write("        <div id=\"containerrr\" class=\"container\" style=\"width: auto\">\n");
      out.write("        <table class=\"table table-bordered table-inverse\" style=\"background-color: #fff; opacity: 0.9; font-size: 12px; color: #000\">\n");
      out.write("            <thead>\n");
      out.write("                <td colspan=\"14\" style=\"font-size: 16px;\">Flights Details</td>\n");
      out.write("                <td><button class=\"btn-success create_pdf3\" onclick=\"createPDFClick();\" myprint3=\"#containerrr\" id=\"btn3\">Download</button></td>\n");
      out.write("                <tr>\n");
      out.write("                    <th>ID</th>\n");
      out.write("                    <th>Flight Image</th>\n");
      out.write("                    <th>Flight Runway</th>\n");
      out.write("                    <th>Flight Name</th>\n");
      out.write("                    <th>Runway State</th>\n");
      out.write("                    <th>Flight Date</th>\n");
      out.write("                    <th>Flight From</th>\n");
      out.write("                    <th>Flight To</th>\n");
      out.write("                    <th>Flight Distance</th>\n");
      out.write("                    <th>Flight Economic price</th>\n");
      out.write("                    <th>Flight Business Price</th>\n");
      out.write("                    <th>Flight Seats Available</th>\n");
      out.write("                    <th>Flight Depature</th>\n");
      out.write("                    <th>Flight Arrival</th>\n");
      out.write("                    <th>Flight Duration</th>\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("\n");
      out.write("            <tbody>\n");
      out.write("\n");
      out.write("                 ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("        <hr><br>\n");
      out.write("        \n");
      out.write("         ");
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_set_2.setPageContext(_jspx_page_context);
      _jspx_th_c_set_2.setParent(null);
      _jspx_th_c_set_2.setVar("value");
      _jspx_th_c_set_2.setValue(list4);
      int _jspx_eval_c_set_2 = _jspx_th_c_set_2.doStartTag();
      if (_jspx_th_c_set_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
        return;
      }
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
      out.write("\n");
      out.write("        <div class=\"container\" id=\"containerrrr\">\n");
      out.write("            <table class=\"table table-bordered table-inverse\" style=\"background-color: #fff; opacity: 0.7; font-size: 12px; color: #000\">\n");
      out.write("                <thead>\n");
      out.write("                    <td colspan=\"7\" id=\"containerrrr\" style=\"font-size: 16px;\">Ticket Details</td>\n");
      out.write("                    <td><button class=\"btn-success create_pdf4\" onclick=\"createPDFClick();\" myprint4=\"#containerrrr\" id=\"btn4\">Download</button></td>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>ID</th>\n");
      out.write("                        <th>Name</th>\n");
      out.write("                        <th>Email</th>\n");
      out.write("                        <th>Contact</th>\n");
      out.write("                        <th>No. of Passenger</th>\n");
      out.write("                        <th>Selected Class</th>\n");
      out.write("                        <th>No. of Total Price</th>\n");
      out.write("                        <th>No. of Total Seat booked</th>\n");
      out.write("                        </tr>\n");
      out.write("                </thead>\n");
      out.write("\n");
      out.write("                <tbody>\n");
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
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

  private boolean _jspx_meth_cc_import_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  cc:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_cc_import_0 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _jspx_tagPool_cc_import_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_cc_import_0.setPageContext(_jspx_page_context);
    _jspx_th_cc_import_0.setParent(null);
    _jspx_th_cc_import_0.setUrl("adminnavbar.jsp");
    int[] _jspx_push_body_count_cc_import_0 = new int[] { 0 };
    try {
      int _jspx_eval_cc_import_0 = _jspx_th_cc_import_0.doStartTag();
      if (_jspx_th_cc_import_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_cc_import_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_cc_import_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_cc_import_0.doFinally();
      _jspx_tagPool_cc_import_url_nobody.reuse(_jspx_th_cc_import_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${products}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("x");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("                    \n");
          out.write("                    <tr bgcolor=\"white\" style=\"color:black; \">\n");
          out.write("\n");
          out.write("\n");
          out.write("                    <tr>\n");
          out.write("                        <td scope=\"row\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.getEmail()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.getContact()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    </tr>\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setVar("a");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${value}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("                   \n");
          out.write("                    <tr bgcolor=\"white\" style=\"color:black; \">\n");
          out.write("\n");
          out.write("\n");
          out.write("                    <tr>\n");
          out.write("                        <td scope=\"row\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("        <td style=\"width: 20%;\"><img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.getRunwayImage()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"img-responsive\" /></td>\n");
          out.write("                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.getRunwayName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.getRunwayState()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.getRunwayDate()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    \n");
          out.write("                    </tr>\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setVar("ff");
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${value}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("                   \n");
          out.write("                    <tr bgcolor=\"white\" style=\"color:black; \">\n");
          out.write("\n");
          out.write("\n");
          out.write("                    <tr>\n");
          out.write("                        <td scope=\"row\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ff.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("        <td style=\"width: 20%;\"><img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ff.getFlightImage()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"img-responsive\" /></td>\n");
          out.write("                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ff.getFlightRunway()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ff.getFlightName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ff.getFlightState()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ff.getFlightDate()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ff.getFlightFrom()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ff.getFlightTo()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ff.getFlightDistance()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ff.getFlightETP()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ff.getFlightBTP()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                        <td>rows=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ff.getFlightSeatRows()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" cols=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ff.getFlightSeatCols()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ff.getFlightDepature()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ff.getFlightArrival()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ff.getFlightDuration()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                     \n");
          out.write("                    </tr>\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent(null);
    _jspx_th_c_forEach_3.setVar("a");
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${value}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("                   \n");
          out.write("                        <tr bgcolor=\"white\" style=\"color:black; \">\n");
          out.write("\n");
          out.write("\n");
          out.write("                        <tr>\n");
          out.write("                            <td scope=\"row\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.getEmail()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.getContact()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.getNop()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.getSelectclass()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.getTotalprice()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.getTotalseat()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                           </tr>\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }
}
