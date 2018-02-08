package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Booking_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_cc_import_url_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_cc_import_url_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_cc_import_url_nobody.release();
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
      out.write("        <style> \n");
      out.write("            * {\n");
      out.write("                -webkit-box-sizing: border-box;\n");
      out.write("                -moz-box-sizing: border-box;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("            .page-wrap {\n");
      out.write("                max-width: 75rem;\n");
      out.write("                margin: 0 auto;\n");
      out.write("            }\n");
      out.write("            h1 {\n");
      out.write("                color: #8e44ad;\n");
      out.write("                font-size: 1.5rem;\n");
      out.write("                letter-spacing: -1px;\n");
      out.write("                margin: 1.25rem 0;\n");
      out.write("            }\n");
      out.write("            input:focus ~ label, textarea:focus ~ label, input:valid ~ label, textarea:valid ~ label {\n");
      out.write("                font-size: 0.75em;\n");
      out.write("                color: red;\n");
      out.write("                top: -2.50rem;\n");
      out.write("                -webkit-transition: all 0.125s ease;\n");
      out.write("                transition: all 0.125s ease;\n");
      out.write("            }\n");
      out.write("            .styled-input {\n");
      out.write("                float: left;\n");
      out.write("                width: 30.3333%;\n");
      out.write("                margin: 2rem 0 1rem;\n");
      out.write("                position: relative;\n");
      out.write("            }\n");
      out.write("            .styled-input label {\n");
      out.write("                color: #000;\n");
      out.write("                padding: 1rem;\n");
      out.write("                position: absolute;\n");
      out.write("                top: 0;\n");
      out.write("                left: 0;\n");
      out.write("                -webkit-transition: all 0.25s ease;\n");
      out.write("                transition: all 0.25s ease;\n");
      out.write("                pointer-events: none;\n");
      out.write("            }\n");
      out.write("            .styled-input.wide { width: 70%; }\n");
      out.write("            input,\n");
      out.write("            textarea {\n");
      out.write("                padding: 1rem 1rem;\n");
      out.write("                border: 1;\n");
      out.write("                width: 100%;\n");
      out.write("                font-size: 1rem;\n");
      out.write("            }\n");
      out.write("            input ~ span,\n");
      out.write("            textarea ~ span {\n");
      out.write("                display: block;\n");
      out.write("                width: 0;\n");
      out.write("                height: 3px;\n");
      out.write("                background: #8e44ad;\n");
      out.write("                position: absolute;\n");
      out.write("                bottom: 0;\n");
      out.write("                left: 0;\n");
      out.write("                -webkit-transition: all 0.125s ease;\n");
      out.write("                transition: all 0.125s ease;\n");
      out.write("            }\n");
      out.write("            input:focus,\n");
      out.write("            textarea:focus { outline: 0; }\n");
      out.write("            input:focus ~ span,\n");
      out.write("            textarea:focus ~ span {\n");
      out.write("                width: 70%;\n");
      out.write("                -webkit-transition: all 0.075s ease;\n");
      out.write("                transition: all 0.075s ease;\n");
      out.write("            }\n");
      out.write("            textarea {\n");
      out.write("                width: 100%;\n");
      out.write("                min-height: 15em;\n");
      out.write("            }\n");
      out.write("            .panel-default{\n");
      out.write("                background: rgba(255, 255, 255, 0.5);\n");
      out.write("            }\n");
      out.write("            .panel-default .panel-heading{\n");
      out.write("                background: rgba(255, 255, 255, 0.9);\n");
      out.write("            }\n");
      out.write("            .panel-default .panel-body{\n");
      out.write("                background: rgba(255, 255, 255, 0.0);\n");
      out.write("            }\n");
      out.write("             body{\n");
      out.write("                background-image: url('images/bm2.jpg');\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("#holder{    \n");
      out.write("height:200px;    \n");
      out.write("width:550px;\n");
      out.write("background-color:#F5F5F5;\n");
      out.write("border:1px solid #A4A4A4;\n");
      out.write("margin-left:10px;   \n");
      out.write("}\n");
      out.write("#place {\n");
      out.write("position:relative;\n");
      out.write("margin:7px;\n");
      out.write("}\n");
      out.write("#place a{\n");
      out.write("font-size:0.6em;\n");
      out.write("}\n");
      out.write("#place li\n");
      out.write("{\n");
      out.write(" list-style: none outside none;\n");
      out.write(" position: absolute;   \n");
      out.write("}    \n");
      out.write("#place li:hover\n");
      out.write("{\n");
      out.write("background-color:yellow;      \n");
      out.write("} \n");
      out.write("#place .seat{\n");
      out.write("background:url(\"images/available_seat_img.gif\") no-repeat scroll 0 0 transparent;\n");
      out.write("height:33px;\n");
      out.write("width:33px;\n");
      out.write("display:block;   \n");
      out.write("}\n");
      out.write("#place .selectedSeat\n");
      out.write("{ \n");
      out.write("background-image:url(\"images/booked_seat_img.gif\");          \n");
      out.write("}\n");
      out.write("#place .selectingSeat\n");
      out.write("{ \n");
      out.write("background-image:url(\"images/selected_seat_img.gif\");        \n");
      out.write("}\n");
      out.write("#place .row-3, #place .row-4{\n");
      out.write("margin-top:10px;\n");
      out.write("}\n");
      out.write("#seatDescription li{\n");
      out.write("verticle-align:middle;    \n");
      out.write("list-style: none outside none;\n");
      out.write("padding-left:35px;\n");
      out.write("height:35px;\n");
      out.write("float:left;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       ");
      if (_jspx_meth_cc_import_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <!--        form start-->\n");
      out.write("        <br><BR><BR><BR><br><BR><BR><br><BR><BR><BR><br><BR><BR>\n");
      out.write("        <div class=\"container-fluid\" style=\"margin-top: 100px;\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-12\">          \n");
      out.write("                    <div class=\"carousel-caption\">\n");
      out.write("                        <div class=\"panel panel-default\">\n");
      out.write("                            <div class=\"panel-heading\" >\n");
      out.write("                                <ul class=\"nav nav-tabs\" id=\"mytabs\">\n");
      out.write("                                    <li class=\"active\"><a href=\"#tab1\" style=\"color:blue\"><b>Customer Booking Details</b></a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"panel-body\">\n");
      out.write("                                <div class=\"tab-content clearfix\">\n");
      out.write("                                    <div class=\"tab-pane fade in active\" id=\"tab1\">\n");
      out.write("                   \n");
      out.write("                                        <form style=\"color:red\" action=\"usale.jsp\">\n");
      out.write("\n");
      out.write("                                            <div class=\"styled-input\">\n");
      out.write("                                                <input type=\"text\" required />\n");
      out.write("                                                <label>Customer Name</label>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"styled-input\">\n");
      out.write("                                                <input type=\"text\" required />\n");
      out.write("                                                <label>Customer Email</label>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                                <div class=\"styled-input\">\n");
      out.write("                                                <input type=\"text\" required />\n");
      out.write("                                                <label>Customer Contact</label>\n");
      out.write("                                            </div>\n");
      out.write("                                                 <div class=\"styled-input\">\n");
      out.write("                                                <input type=\"text\" id=\"mycr\" required onchange=\"myfunc()\"/>\n");
      out.write("                                                <label>Number of passenger</label>\n");
      out.write("                                                \n");
      out.write("                                                <script>\n");
      out.write("                                                    function myfunc() {\n");
      out.write("  // get the reference for the body\n");
      out.write("  var sr=document.getElementById(\"mycr\").value;\n");
      out.write("  var body = document.getElementsByTagName(\"body\")[0];\n");
      out.write(" \n");
      out.write("  // creates a <table> element and a <tbody> element\n");
      out.write("  var tbl = document.createElement(\"table\");\n");
      out.write("  var tblBody = document.createElement(\"tbody\");\n");
      out.write("    \n");
      out.write("  // creating all cells\n");
      out.write("  for (var i = 0; i < sr; i++) {\n");
      out.write("    // creates a table row\n");
      out.write("    var row = document.createElement(\"tr\");\n");
      out.write(" \n");
      out.write("    for (var j = 0; j < 2; j++) {\n");
      out.write("      // Create a <td> element and a text node, make the text\n");
      out.write("      // node the contents of the <td>, and put the <td> at\n");
      out.write("      // the end of the table row\n");
      out.write("      var cell = document.createElement(\"td\");\n");
      out.write("      \n");
      out.write("var cellText = document.createElement(\"INPUT\");\n");
      out.write("    cellText.setAttribute(\"type\", \"text\");\n");
      out.write("      cell.appendChild(cellText);\n");
      out.write("      row.appendChild(cell);\n");
      out.write("    }\n");
      out.write(" \n");
      out.write("    // add the row to the end of the table body\n");
      out.write("    tblBody.appendChild(row);\n");
      out.write("  }\n");
      out.write(" \n");
      out.write("  // put the <tbody> in the <table>\n");
      out.write("  tbl.appendChild(tblBody);\n");
      out.write("  // appends <table> into <body>\n");
      out.write("  body.appendChild(tbl);\n");
      out.write("  // sets the border attribute of tbl to 2;\n");
      out.write("  tbl.setAttribute(\"border\", \"2\");\n");
      out.write("}\n");
      out.write("                                                    </script>\n");
      out.write("                                            </div>\n");
      out.write("                                                \n");
      out.write("                                                   <div class=\"styled-input\">\n");
      out.write("                                                <input type=\"plain\" required list=\"sc\" name=\"flightState\" id=\"select1\"/>\n");
      out.write("                                                <label>Select Class</label>\n");
      out.write("                                                <span><datalist id=\"sc\">\n");
      out.write("                                                        <option value=\"Economic Class\"></option>\n");
      out.write("                                                        <option value=\"Business Class\">\n");
      out.write("                                                    </datalist></span> </div>\n");
      out.write("                                             <div>\n");
      out.write("                                                 <br>\n");
      out.write("                                                 <div class=\"styled-input\">\n");
      out.write("                                                    <a class=\"btn-primary btn-block btn-sm\" data-toggle=\"modal\" data-target=\"#myModal\">Select Seat</a></div>\n");
      out.write("                                    </div>\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("             <!-- Modal -->\n");
      out.write("  <div class=\"modal fade\" id=\"myModal\" role=\"dialog\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("    \n");
      out.write("      <!-- Modal content-->\n");
      out.write("      <div class=\"modal-content\">\n");
      out.write("        <div class=\"modal-header\">\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("          <b class=\"modal-title\" style=\"color:#1C2C64;\">Please Select Your Seats</b>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-body\">\n");
      out.write("    <div id=\"holder\"> \n");
      out.write("        <ul  id=\"place\">\n");
      out.write("        </ul>    \n");
      out.write("    </div>\n");
      out.write("    <div style=\"float:left;\"> \n");
      out.write("    <ul id=\"seatDescription\">\n");
      out.write("        <li style=\"background:url('images/available_seat_img.gif') no-repeat scroll 0 0 transparent;\">Available Seat</li>\n");
      out.write("        <li style=\"background:url('images/booked_seat_img.gif') no-repeat scroll 0 0 transparent;\">Booked Seat</li>\n");
      out.write("        <li style=\"background:url('images/selected_seat_img.gif') no-repeat scroll 0 0 transparent;\">Selected Seat</li>\n");
      out.write("    </ul>\n");
      out.write("    </div>\n");
      out.write("        <div style=\"clear:both;width:100%\">\n");
      out.write("        <input type=\"button\" id=\"btnShowNew\" value=\"Show Selected Seats\" />\n");
      out.write("        <input type=\"button\" id=\"btnShow\" value=\"Show All\" />           \n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("          <script>\n");
      out.write("var settings = {\n");
      out.write("               rows: 5,\n");
      out.write("               cols: 15,\n");
      out.write("               rowCssPrefix: 'row-',\n");
      out.write("               colCssPrefix: 'col-',\n");
      out.write("               seatWidth: 35,\n");
      out.write("               seatHeight: 35,\n");
      out.write("               seatCss: 'seat',\n");
      out.write("               selectedSeatCss: 'selectedSeat',\n");
      out.write("               selectingSeatCss: 'selectingSeat'\n");
      out.write("           };              \n");
      out.write("              \n");
      out.write("             var init = function (reservedSeat) {\n");
      out.write("                var str = [], seatNo, className;\n");
      out.write("                for (i = 0; i < settings.rows; i++) {\n");
      out.write("                    for (j = 0; j < settings.cols; j++) {\n");
      out.write("                        seatNo = (i + j * settings.rows + 1);\n");
      out.write("                        className = settings.seatCss + ' ' + settings.rowCssPrefix + i.toString() + ' ' + settings.colCssPrefix + j.toString();\n");
      out.write("                        if ($.isArray(reservedSeat) && $.inArray(seatNo, reservedSeat) != -1) {\n");
      out.write("                            className += ' ' + settings.selectedSeatCss;\n");
      out.write("                        }\n");
      out.write("                        str.push('<li class=\"' + className + '\"' +\n");
      out.write("                                  'style=\"top:' + (i * settings.seatHeight).toString() + 'px;left:' + (j * settings.seatWidth).toString() + 'px\">' +\n");
      out.write("                                  '<a title=\"' + seatNo + '\">' + seatNo + '</a>' +\n");
      out.write("                                  '</li>');\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("                $('#place').html(str.join(''));\n");
      out.write("            };\n");
      out.write("            //case I: Show from starting\n");
      out.write("            //init();\n");
      out.write(" \n");
      out.write("            //Case II: If already booked\n");
      out.write("            var bookedSeats = [5, 10, 25];\n");
      out.write("            init(bookedSeats);\n");
      out.write("            \n");
      out.write("            $('.' + settings.seatCss).click(function () {\n");
      out.write("if ($(this).hasClass(settings.selectedSeatCss)){\n");
      out.write("    alert('This seat is already reserved');\n");
      out.write("}\n");
      out.write("else{\n");
      out.write("    $(this).toggleClass(settings.selectingSeatCss);\n");
      out.write("    }\n");
      out.write("});\n");
      out.write(" \n");
      out.write("$('#btnShow').click(function () {\n");
      out.write("    var str = [];\n");
      out.write("    $.each($('#place li.' + settings.selectedSeatCss + ' a, #place li.'+ settings.selectingSeatCss + ' a'), function (index, value) {\n");
      out.write("        str.push($(this).attr('title'));\n");
      out.write("    });\n");
      out.write("    alert(str.join(','));\n");
      out.write("})\n");
      out.write(" \n");
      out.write("$('#btnShowNew').click(function () {\n");
      out.write("    var str = [], item;\n");
      out.write("    $.each($('#place li.' + settings.selectingSeatCss + ' a'), function (index, value) {\n");
      out.write("        item = $(this).attr('title');                   \n");
      out.write("        str.push(item);                   \n");
      out.write("    });\n");
      out.write("    alert(str.join(','));\n");
      out.write("})\n");
      out.write("\n");
      out.write("\n");
      out.write("          </script>\n");
      out.write("          <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  \n");
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

  private boolean _jspx_meth_cc_import_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  cc:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_cc_import_0 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _jspx_tagPool_cc_import_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_cc_import_0.setPageContext(_jspx_page_context);
    _jspx_th_cc_import_0.setParent(null);
    _jspx_th_cc_import_0.setUrl("navbarhead.jsp");
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
}
