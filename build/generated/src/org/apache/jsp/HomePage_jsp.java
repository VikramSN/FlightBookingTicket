package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class HomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Home Page</title>\n");
      out.write("        <style>\n");
      out.write("  .navstyle {\n");
      out.write("\n");
      out.write("                font-size: 10px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!---- start main ------------------------------------ -->\n");
      out.write("        ");
      if (_jspx_meth_ch_import_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\" >\n");
      out.write("\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <div class=\"panel-group\">\n");
      out.write("                        <div class=\"panel panel-default\">\n");
      out.write("                            <div class=\"panel-heading\" style=\"text-align: center; font-size: 12px; color:#1C2C64\">Indira Gandhi International Airport<b>(Delhi)</b>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"panel-body\">\n");
      out.write("\n");
      out.write("                                <img src=\"images/iga.jpg\"  width=\"100%\" style=\"height:130px;\"/>\n");
      out.write("                                <br><Br>\n");
      out.write("                                <p><b>\n");
      out.write("                                        Indira Gandhi International Airport</b> serves as the primary civilian aviation hub for the National Capital Region of Delhi, India. The airport, spread over an area of 5,106 acres (2,066 ha),[4] is situated in Palam, 15 km (9.3 mi) south-west of the New Delhi railway station and 16 km (9.9 mi) from New Delhi city centre\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </p>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <div class=\"panel-group\">\n");
      out.write("                        <div class=\"panel panel-default\">\n");
      out.write("                            <div class=\"panel-heading\" style=\"text-align: center; font-size: 12px; color:#1C2C64\">Chhatrapati Shivaji IA<b>(MUMBAI)</b></div>\n");
      out.write("                            <div class=\"panel-body\">\n");
      out.write("\n");
      out.write("                                <img src=\"images/cs.jpg\"  width=\"100%\"/>\n");
      out.write("\n");
      out.write("                                <br><Br>\n");
      out.write("                                <p><b>Chhatrapati Shivaji International Airport</b>\n");
      out.write("                                    formerly known as Sahar International Airport, is the primary international airport serving the Mumbai Metropolitan Area, India. It is the second busiest airport in the country in terms of total and international passenger traffic after Delhi.\n");
      out.write("\n");
      out.write("                                </p>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>  \n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <div class=\"panel-group\">\n");
      out.write("                        <div class=\"panel panel-default\">\n");
      out.write("                            <div class=\"panel-heading\" style=\"text-align: center; font-size: 12px; color:#1C2C64\">Netaji Subhas IA<b>(KOLKATA)</b></div>\n");
      out.write("                            <div class=\"panel-body\">\n");
      out.write("\n");
      out.write("                                <img src=\"images/nscb.jpg\" width=\"100%\" style=\"height: 130px\"/>\n");
      out.write("                                <br><br>\n");
      out.write("                                <p><b>\n");
      out.write("                                        Netaji Subhas Chandra Bose International Airport</b> is an international airport located in Kolkata, West Bengal, India, serving the Kolkata metropolitan area. It is located approximately 17 km (11 mi) from the city center. The airport was earlier known as Dum Dum Airport before being renamed after NSCB.\n");
      out.write("\n");
      out.write("                                </p>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>  \n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <div class=\"panel-group\">\n");
      out.write("                        <div class=\"panel panel-default\">\n");
      out.write("                            <div class=\"panel-heading\" style=\"text-align: center; font-size: 12px; color:#1C2C64\">Chennai International Airport<b>(CHENNAI)</b></div>\n");
      out.write("                            <div class=\"panel-body\">\n");
      out.write("\n");
      out.write("                                <img src=\"images/cia.jpg\" />\n");
      out.write("                                <br><Br>\n");
      out.write("                                <p><b>\n");
      out.write("                                        Chennai International Airport </b> is an international airport serving the city of Chennai (Madras), Tamil Nadu, India and its metropolitan area. It is the fourth busiest airport in India in terms of total passenger traffic after airports at Delhi, Mumbai and Bengaluru. It is the 49th busiest airport in Asia for CY 2016.\n");
      out.write("                                </p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>              \n");
      out.write("                </div>  \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <br><br>\n");
      out.write("\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\" style=\"background-color: #1C2C64\">\n");
      out.write("                <br>\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <div class=\"panel-group\">\n");
      out.write("                        <div class=\"panel panel-default\">\n");
      out.write("                            <div class=\"panel-heading\" style=\"text-align: center; font-size: 12px; color:#1C2C64\">Know About<b> PhoenixAirways</b>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"panel-body\">\n");
      out.write("                                <center><img src=\"images/iconpic.png\" /></center>\n");
      out.write("\n");
      out.write("                                <center><h3 style=\"color:#1C2C64;\">PhoenixAirways</h3></center>\n");
      out.write("                                <p><strong>Address : </strong> JAVANDROID/69, South-X(Delhi,India)</p>\n");
      out.write("                                <p><strong>Email : </strong> phoenixAirways@gmail.com</p>\n");
      out.write("                                <p><strong>Phone : </strong> 9000000000</p>\n");
      out.write("                                <p><strong>Timing : </strong> 9:30am to 6:30pm</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("                    <h4 style=\"color: white\"><b style=\"font-size: 35px; color:white\">P</b>hoenixAirways is a flight ticket booking website, where customer book ticket online \n");
      out.write("                    Color codes are ways of representing the colors we see everyday in a format that a computer can interpret and display. Commonly used in websites and other software applications, there are a variety of formats, including Hex color codes, RGB and HSL values, and HTML color names, amongst others.\n");
      out.write("\n");
      out.write("HEX COLOR CODES\n");
      out.write("The most popular are Hex color codes; three byte hexadecimal numbers (meaning they consist of six digits), with each byte, or pair of characters in the Hex code, representing the intensity of red, green and blue in the color respectively.\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    </h4>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <div class=\"panel-group\">\n");
      out.write("                        <div class=\"panel panel-default\">\n");
      out.write("                            <div class=\"panel-heading\" style=\"text-align: center; font-size: 12px; color:#1C2C64\">Know About<b> PhoenixAirways</b>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"panel-body\">\n");
      out.write("                                <center><img src=\"images/iconpic.png\" /></center>\n");
      out.write("\n");
      out.write("                                <center><h3 style=\"color:#1C2C64;\">PhoenixAirways</h3></center>\n");
      out.write("                                <p><strong>Address : </strong> JAVANDROID/69, South-X(Delhi,India)</p>\n");
      out.write("                                <p><strong>Email : </strong> phoenixAirways@gmail.com</p>\n");
      out.write("                                <p><strong>Phone : </strong> 9000000000</p>\n");
      out.write("                                <p><strong>Timing : </strong> 9:30am to 6:30pm</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <br>     \n");
      out.write("        ");
      if (_jspx_meth_ch_import_1(_jspx_page_context))
        return;
      out.write("\n");
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

  private boolean _jspx_meth_ch_import_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ch:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_ch_import_1 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _jspx_tagPool_ch_import_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_ch_import_1.setPageContext(_jspx_page_context);
    _jspx_th_ch_import_1.setParent(null);
    _jspx_th_ch_import_1.setUrl("footer.jsp");
    int[] _jspx_push_body_count_ch_import_1 = new int[] { 0 };
    try {
      int _jspx_eval_ch_import_1 = _jspx_th_ch_import_1.doStartTag();
      if (_jspx_th_ch_import_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_ch_import_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_ch_import_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_ch_import_1.doFinally();
      _jspx_tagPool_ch_import_url_nobody.reuse(_jspx_th_ch_import_1);
    }
    return false;
  }
}
