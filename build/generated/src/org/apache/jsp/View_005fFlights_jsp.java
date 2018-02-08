package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import flightupload.flightgettersetter;
import flightupload.flightinterImpl;
import flightupload.flightinterface;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class View_005fFlights_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" <!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <script>\n");
      out.write("            $('link[href=\"css/mystyle.css\"]').remove();\n");
      out.write("        </script>\n");
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
      out.write("         <script type=\"text/javascript\" src=\"//ajax.googleapis.com/ajax/libs/angularjs/1.3.9/angular.min.js\"></script>\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"images/icons/favicon.ico\"/>\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/font-awesome-4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/animate/animate.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/css-hamburgers/hamburgers.min.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/select2/select2.min.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/util.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Product Page</title>\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Droid+Sans:400,700|Droid+Serif' rel='stylesheet' type='text/css'>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/reset.css\"> <!-- CSS reset -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\"> <!-- Resource style -->\n");
      out.write("        <script src=\"js/modernizr.js\"></script> <!-- Modernizr -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bookstyle.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");

            flightinterImpl impl = new flightinterImpl();
            ArrayList list = (ArrayList) impl.getcar_info();
        
      out.write("\n");
      out.write("        <style>\n");
      out.write("            .column {\n");
      out.write("                float: left;\n");
      out.write("                width: 24.8%;\n");
      out.write("                margin-bottom: 16px;\n");
      out.write("                padding: 0 8px;\n");
      out.write("            }\n");
      out.write("            /* Display the columns below each other instead of side by side on small screens */\n");
      out.write("            @media (max-width: 650px) {\n");
      out.write("                .column {\n");
      out.write("                    width: 100%;\n");
      out.write("                    display: block;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            /* Add some shadows to create a card effect */\n");
      out.write("            .card {\n");
      out.write("                box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.9);\n");
      out.write("            }\n");
      out.write("            /* Some left and right padding inside the container */\n");
      out.write("            .container {\n");
      out.write("                padding: 0 16px;\n");
      out.write("            }\n");
      out.write("            /* Clear floats */\n");
      out.write("            .container::after, .row::after {\n");
      out.write("                content: \"\";\n");
      out.write("                clear: both;\n");
      out.write("                display: table;\n");
      out.write("            }\n");
      out.write("            .title {\n");
      out.write("                color: grey;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        ");
      if (_jspx_meth_cc_import_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"row\" style=\"margin-left: 8px\">\n");
      out.write("\n");
      out.write("            ");
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_set_0.setPageContext(_jspx_page_context);
      _jspx_th_c_set_0.setParent(null);
      _jspx_th_c_set_0.setVar("value");
      _jspx_th_c_set_0.setValue(list);
      int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
      if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
        return;
      }
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      out.write("\n");
      out.write("            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        ");

            flightgettersetter fff = (flightgettersetter) request.getAttribute("fgsobject");
            if (fff == null) {
                System.out.println("Object is null");
            } else {
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--            ==============================================================================-->\n");
      out.write("        <div class=\"container\" style=\"background-color: white; padding: 10px; border-radius: 20px\">\n");
      out.write("            <h4 style=\"color:#5D6D7E\"><b>Flight Details</b></h4>\n");
      out.write("            <table class=\"table\" style='background-color: white; color:#5D6D7E; border-top-right-radius:40px; border-bottom-left-radius:20px;'>\n");
      out.write("                <tbody>\n");
      out.write("                <td rowspan=\"6\"><img src=\"");
out.println(fff.getFlightImage());
      out.write("\" style=\"width: 350px; height: 200px;\"></td>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Flight Name-");
out.println(fff.getFlightName());
      out.write("</th>\n");
      out.write("                    <th>Flight Number-");
out.println(fff.getFlightNumber());
      out.write("</th>\n");
      out.write("                    <th>Flight State-");
out.println(fff.getFlightState());
      out.write("</th>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>From-");
out.println(fff.getFlightFrom());
      out.write("</td>\n");
      out.write("                    <td>To-");
out.println(fff.getFlightTo());
      out.write("</td>\n");
      out.write("                    <td>Distance-");
out.println(fff.getFlightDistance());
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Economic Price-");
out.println(fff.getFlightETP());
      out.write("</td>\n");
      out.write("                    <td>Business Price-");
out.println(fff.getFlightBTP());
      out.write("</td>\n");
      out.write("                    <td>Flight Date-");
out.println(fff.getFlightDate());
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Flight Depature-");
out.println(fff.getFlightDepature());
      out.write("</td>\n");
      out.write("                    <td>Flight Arrival-");
out.println(fff.getFlightArrival());
      out.write("</td>\n");
      out.write("                    <td>Flight Duration-");
out.println(fff.getFlightDuration());
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Flight Seats Rows-");
out.println(fff.getFlightSeatRows());
      out.write("</td>\n");
      out.write("                    <td>Flight Seats Cols-");
out.println(fff.getFlightSeatCols());
      out.write("</td>\n");
      out.write("                    <td>Flight Runway-");
out.println(fff.getFlightRunway());
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("\n");
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
      out.write("            <div class=\"bg-contact3\" style=\"background-image: url('images/bg-01.jpg');\">\n");
      out.write("                <div class=\"container-contact3\">\n");
      out.write("                    <div class=\"wrap-contact3\">\n");
      out.write("                        <form class=\"contact3-form validate-form\" action=\"finalbooking.jsp\">\n");
      out.write("                            <span class=\"contact3-form-title\">\n");
      out.write("                                Booking Form\n");
      out.write("                            </span>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"wrap-input3 validate-input\" data-validate=\"Name is required\">\n");
      out.write("                                <input class=\"input3\" type=\"text\" name=\"name\" placeholder=\"Customer Name\" value=\"");
      out.print(resultSet.getString("name"));
      out.write("\" style=\"width: 100%; border: none\">\n");
      out.write("                                <span class=\"focus-input3\"></span>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"wrap-input3 validate-input\" data-validate = \"Valid email is required: ex@abc.xyz\">\n");
      out.write("                                <input class=\"input3\" type=\"text\" name=\"email\" placeholder=\"Customer Email\" value=\"");
      out.print(resultSet.getString("email"));
      out.write("\" style=\"width: 100%; border: none\">\n");
      out.write("                                <span class=\"focus-input3\"></span>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"wrap-input3 validate-input\" data-validate=\"Contact is required\">\n");
      out.write("                                <input class=\"input3\" type=\"text\" name=\"contact\" onchange=\"CheckIndianNumber(this.value)\" value=\"");
      out.print(resultSet.getString("contact"));
      out.write("\" placeholder=\"Customer Contact\" style=\"width: 100%; border: none\" maxlength=\"10\">\n");
      out.write("                                <span class=\"focus-input3\"></span>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                              <script>\n");
      out.write("                                    function CheckIndianNumber(IndianNumber)\n");
      out.write("                                    {\n");
      out.write("                                        var IndNum = /^([0|\\+[0-9]{1,5})?([7-9][0-9]{9})$/;\n");
      out.write("                                        if (IndNum.test(IndianNumber))\n");
      out.write("                                        {\n");
      out.write("                                            swal(\n");
      out.write("                                                    'Success!',\n");
      out.write("                                                    'Valid Mobile Number',\n");
      out.write("                                                    'success'\n");
      out.write("                                                    )\n");
      out.write("                                        } else\n");
      out.write("                                        {\n");
      out.write("                                            swal(\n");
      out.write("                                                    'Error!',\n");
      out.write("                                                    'Mobile number is not valid!',\n");
      out.write("                                                    'error'\n");
      out.write("                                                    )\n");
      out.write("                                        }\n");
      out.write("                                    }\n");
      out.write("                                </script>\n");
                        }
			 }
} catch (Exception e) {
e.printStackTrace();
}

      out.write("\n");
      out.write("                            <div class=\"wrap-input3 validate-input\" data-validate=\"This field is required\" id=\"dynamicInput\">\n");
      out.write("                                <input class=\"input3\" type=\"text\" id=\"asd\" name=\"nop\" placeholder=\"No. of Passanger\" style=\"width: 100%; border: none\">\n");
      out.write("                                <span class=\"focus-input3\"></span>\n");
      out.write("                            </div>\n");
      out.write("  \n");
      out.write("                            <div class=\"validate-input\">\n");
      out.write("\n");
      out.write("                                <label for=\"sel1\" style=\"color: white\">Select Class</label>\n");
      out.write("                                <select class=\"form-control\" id=\"mySelect\" name=\"selectclass\" required onchange=\"myFunction()\">\n");
      out.write("                                    <option>Economic Class</option>\n");
      out.write("                                    <option>Economic Class with Food</option>\n");
      out.write("                                    <option>Business Class</option>\n");
      out.write("                                    <option>Business Class with Food</option>\n");
      out.write("                                    \n");
      out.write("                                </select>\n");
      out.write("                                <span class=\"focus-input3\"></span>\n");
      out.write("                            </div>\n");
      out.write("<script>\n");
      out.write("function myFunction() {\n");
      out.write("    var x = document.getElementById(\"mySelect\");\n");
      out.write("    var i = x.selectedIndex;\n");
      out.write("    document.getElementById(\"demo\").value =\"You have selected : \"+x.options[i].text;\n");
      out.write("   \n");
      out.write("        if(x.options[i].text==\"Economic Class\"){\n");
      out.write("    document.getElementById(\"demo\").value =");
out.println(fff.getFlightETP());
      out.write(";        \n");
      out.write("    } else if(x.options[i].text==\"Economic Class with Food\"){\n");
      out.write("    document.getElementById(\"demo\").value =");
out.println(1000+Integer.parseInt(fff.getFlightETP()));
      out.write(";        \n");
      out.write("    }\n");
      out.write("    else if(x.options[i].text==\"Business Class\"){\n");
      out.write("    document.getElementById(\"demo\").value =");
out.println(fff.getFlightBTP());
      out.write(";        \n");
      out.write("    }\n");
      out.write("    else if(x.options[i].text==\"Business Class with Food\"){\n");
      out.write("        document.getElementById(\"demo\").value =");
out.println(1000+Integer.parseInt(fff.getFlightBTP()));
      out.write(";        \n");
      out.write("}\n");
      out.write("\n");
      out.write("var x = document.getElementById(\"mySelect\");\n");
      out.write("    var i = x.selectedIndex;\n");
      out.write("    document.getElementById(\"demo1\").innerHTML =\"You have selected : \"+x.options[i].text;\n");
      out.write("   \n");
      out.write("        if(x.options[i].text==\"Economic Class\"){\n");
      out.write("    document.getElementById(\"demo1\").innerHTML =\"You have selected : \"+x.options[i].text+\" and Your Total Price is \"+");
out.println(fff.getFlightETP());
      out.write(";        \n");
      out.write("    } else if(x.options[i].text==\"Economic Class with Food\"){\n");
      out.write("    document.getElementById(\"demo1\").innerHTML =\"You have selected : \"+x.options[i].text+\" and Your Total Price with Food is \"+");
out.println(1000+Integer.parseInt(fff.getFlightETP()));
      out.write(";        \n");
      out.write("    }\n");
      out.write("    else if(x.options[i].text==\"Business Class\"){\n");
      out.write("    document.getElementById(\"demo1\").innerHTML =\"You have selected : \"+x.options[i].text+\" and Your Total Price is \"+");
out.println(fff.getFlightBTP());
      out.write(";        \n");
      out.write("    }\n");
      out.write("    else if(x.options[i].text==\"Business Class with Food\"){\n");
      out.write("        document.getElementById(\"demo1\").innerHTML =\"You have selected : \"+x.options[i].text+\" and Your Total Price with Food is \"+");
out.println(1000+Integer.parseInt(fff.getFlightBTP()));
      out.write(";        \n");
      out.write("}\n");
      out.write("    \n");
      out.write("\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("                            <br>\n");
      out.write("                            \n");
      out.write("                            <input type=\"hidden\" id=\"demo\" name=\"totalprice\" readonly required/>\n");
      out.write("                            <input type=\"hidden\" id=\"ses\" name=\"totalseat\" readonly required/>\n");
      out.write("                            <p id=\"demo1\" name=\"totalprice123\" style=\"color:white\"></p>\n");
      out.write("                            <p id=\"ses1\" name=\"totalseat123\" style=\"color:white\"></p>\n");
      out.write("                            \n");
      out.write("                            <button type=\"button\" class=\"btn btn-danger btn-sm\" data-toggle=\"modal\" data-target=\"#meraModal\" style=\"width: auto; height: 30px\" required>Select Seat</button<br>\n");
      out.write("                            <br><Br><div class=\"container-contact3-form-btn\">\n");
      out.write("                                <button class=\"contact3-form-btn\" style=\"width: auto\">\n");
      out.write("                                    Book Now\n");
      out.write("                                </button>\n");
      out.write("                                 \n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div id=\"dropDownSelect1\"></div>\n");
      out.write("            <br><br>\n");
      out.write("            <!--============================================================================-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            ");
}

            
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("          \n");
      out.write("\n");
      out.write("                </style>\n");
      out.write("     <!-- Modal -->\n");
      out.write("  <div class=\"modal\" id=\"meraModal\" role=\"dialog\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("    \n");
      out.write("      <!-- Modal content-->\n");
      out.write("      <div class=\"modal-content\">\n");
      out.write("        <div class=\"modal-header\">\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("          <b class=\"modal-title\" style=\"color:#1C2C64;\">Please Select Your Seats</b>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-body\" id=\"btnShowNew\">\n");
      out.write("    <div id=\"holder\"> \n");
      out.write("        \n");
      out.write("        <ul  id=\"place\">\n");
      out.write("        </ul>    \n");
      out.write("    </div>\n");
      out.write("            <br><br><br><br><br>\n");
      out.write("    <div style=\"float:left;\"> \n");
      out.write("        <br>\n");
      out.write("    <ul id=\"seatDescription\">\n");
      out.write("        <li style=\"background:url('images/available_seat_img.gif') no-repeat scroll 0 0 transparent;\">Available Seat</li>\n");
      out.write("        <li style=\"background:url('images/booked_seat_img.gif') no-repeat scroll 0 0 transparent;\">Booked Seat</li>\n");
      out.write("        <li style=\"background:url('images/selected_seat_img.gif') no-repeat scroll 0 0 transparent;\">Selected Seat</li>\n");
      out.write("    </ul>\n");
      out.write("    </div>\n");
      out.write("<!--        <div style=\"clear:both;width:100%\">\n");
      out.write("        <input type=\"button\"  value=\"Show Selected Seats\" />\n");
      out.write("        <input type=\"button\" id=\"btnShow\" value=\"Show All\" />           \n");
      out.write("        </div>-->\n");
      out.write("        </div>\n");
      out.write("          <script>\n");
      out.write("var settings = {\n");
      out.write("               rows: ");
      out.print(fff.getFlightSeatRows());
      out.write(",\n");
      out.write("               cols: ");
      out.print(fff.getFlightSeatCols());
      out.write(",\n");
      out.write("               rowCssPrefix: 'row-',\n");
      out.write("               colCssPrefix: 'col-',\n");
      out.write("               seatWidth: 40,\n");
      out.write("               seatHeight: 40,\n");
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
      out.write("                                  '<a style=\"color:#000\" title=\"' + seatNo + '\">' + seatNo + '</a>' +\n");
      out.write("                                  '</li>');\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("                $('#place').html(str.join(''));\n");
      out.write("            };\n");
      out.write("            //case I: Show from starting\n");
      out.write("            //init();\n");
      out.write(" \n");
      out.write("   \n");
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
      out.write("        str.push(\"A\"+item);                   \n");
      out.write("    });        \n");
      out.write("        document.getElementById(\"ses1\").innerHTML =\"Your seats are : -\"+str.join(',')+\"---&---You have selected \"+str.length+\" Seats\";\n");
      out.write("        document.getElementById(\"ses\").value =str.join(',');\n");
      out.write("                                \n");
      out.write("                            \n");
      out.write("})\n");
      out.write("         //Case II: If already booked\n");
      out.write("            var bookedSeats = [0];\n");
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
      out.write("\n");
      out.write("          </script>\n");
      out.write("          <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\" style=\"width: auto; height: auto;\">Close</button>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("            <!--        ========================================================================================-->\n");
      out.write("            <!--        <div class=\"cd-panel from-right\">\n");
      out.write("                        <header class=\"cd-panel-header\" id=\"panelheader2\">\n");
      out.write("                            <h4>flightname</h4>\n");
      out.write("                            <a href=\"#0\" class=\"cd-panel-close\">Close</a>\n");
      out.write("                        </header>\n");
      out.write("            \n");
      out.write("                        <div class=\"cd-panel-container\" style=\"background-color: #EDF4CE;\">\n");
      out.write("                            <div class=\"cd-panel-content\">\n");
      out.write("                                <img style=\"width: 100%;height: 100;\"src=\"flightimage\"/>          \n");
      out.write("            \n");
      out.write("                                <br/>                      \n");
      out.write("                                <div class=\"container\">\n");
      out.write("            \n");
      out.write("                                    <form action=\"airflightindia.jsp\" method=\"post\"> \n");
      out.write("                                        <table class=\"table\">\n");
      out.write("            \n");
      out.write("                                            <tbody>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td>Runway Name </td>\n");
      out.write("                                                    <td>international airport</td>\n");
      out.write("            \n");
      out.write("                                                </tr>\n");
      out.write("            \n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td>Flight Name</td>\n");
      out.write("                                                    <td>ABC</td>\n");
      out.write("                                                </tr>\n");
      out.write("            \n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td>Flight no</td>\n");
      out.write("                                                    <td>a1402466</td>\n");
      out.write("                                                </tr>\n");
      out.write("            \n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td>Date</td>\n");
      out.write("                                                    <td>Daily</td>\n");
      out.write("                                                </tr>\n");
      out.write("            \n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td>Time</td>\n");
      out.write("                                                    <td>10.00a m ,12.50 p m ,9.00 p m</td>\n");
      out.write("                                                </tr>\n");
      out.write("            \n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td>Departures Time</td>\n");
      out.write("                                                    <td>10.00 a m</td>\n");
      out.write("                                                </tr>\n");
      out.write("            \n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td>Arrival Time</td>\n");
      out.write("                                                    <td>11.20 a m</td>\n");
      out.write("                                                </tr>\n");
      out.write("            \n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td>Duration</td>\n");
      out.write("                                                    <td>1500 k m</td>\n");
      out.write("                                                </tr>\n");
      out.write("            \n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td>Business Seat</td>\n");
      out.write("                                                    <td>50 Seat</td>\n");
      out.write("                                                </tr>\n");
      out.write("            \n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td>Economic Seat</td>\n");
      out.write("                                                    <td>80 Seat</td>\n");
      out.write("                                                </tr>\n");
      out.write("            \n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td>Business Price</td>\n");
      out.write("                                                    <td>7,000 + G s t</td>\n");
      out.write("                                                </tr>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td>Economic price</td>\n");
      out.write("                                                    <td>5,000 + G s t</td>\n");
      out.write("                                                <tr><td><main class=\"cd-main-content\">\n");
      out.write("                                                            <b style=\"color: #89ba2c;\"><input type=\"submit\"/>\n");
      out.write("            \n");
      out.write("                                                        </main>\n");
      out.write("                                                    </td>\n");
      out.write("                                                </tr>\n");
      out.write("                                            </tbody>\n");
      out.write("                                        </table>\n");
      out.write("                                    </form>    \n");
      out.write("                                </div>\n");
      out.write("            \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>-->\n");
      out.write("\n");
      out.write("            <script src=\"js/bookscript.js\">\n");
      out.write("            </script> \n");
      out.write("            <!--===============================================================================================-->\n");
      out.write("            <!--===============================================================================================-->\n");
      out.write("            <script src=\"vendor/bootstrap/js/popper.js\"></script>\n");
      out.write("            <!--===============================================================================================-->\n");
      out.write("            <script src=\"vendor/select2/select2.min.js\"></script>\n");
      out.write("            <script>\n");
      out.write("                $(\".selection-2\").select2({\n");
      out.write("                    minimumResultsForSearch: 20,\n");
      out.write("                    dropdownParent: $('#dropDownSelect1')\n");
      out.write("                });\n");
      out.write("            </script>\n");
      out.write("            <!--===============================================================================================-->\n");
      out.write("            <script src=\"js/mainn.js\"></script>\n");
      out.write("\n");
      out.write("            <!-- Global site tag (gtag.js) - Google Analytics -->\n");
      out.write("            <script async src=\"https://www.googletagmanager.com/gtag/js?id=UA-23581568-13\"></script>\n");
      out.write("            <script>\n");
      out.write("                window.dataLayer = window.dataLayer || [];\n");
      out.write("                function gtag() {\n");
      out.write("                    dataLayer.push(arguments);\n");
      out.write("                }\n");
      out.write("                gtag('js', new Date());\n");
      out.write("\n");
      out.write("                gtag('config', 'UA-23581568-13');\n");
      out.write("            </script>\n");
      out.write("            ");
      if (_jspx_meth_cc_import_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            \n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("a");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${value}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\n");
          out.write("                <div class=\"column\">\n");
          out.write("                    <div class=\"card\" style=\"background-color: white\">\n");
          out.write("                        <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.getFlightImage()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" width=\"300px\" height=\"320px\" /> \n");
          out.write("                        <div class=\"container\">\n");
          out.write("                            <h5><b style=\"color:#1C2C64\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.getFlightName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</b></h5>\n");
          out.write("                            <p class=\"title\" style=\"color: black\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.getFlightState()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("<b><a href=\"BookingData?Id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" ><input style=\"margin-left: 100px\" class =\"btn btn-danger\"  type=\"button\" value=\"View\"></a></b></p> \n");
          out.write("                        </div>\n");
          out.write("                    </div>\n");
          out.write("                </div>\n");
          out.write("            ");
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

  private boolean _jspx_meth_cc_import_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  cc:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_cc_import_1 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _jspx_tagPool_cc_import_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_cc_import_1.setPageContext(_jspx_page_context);
    _jspx_th_cc_import_1.setParent(null);
    _jspx_th_cc_import_1.setUrl("footer.jsp");
    int[] _jspx_push_body_count_cc_import_1 = new int[] { 0 };
    try {
      int _jspx_eval_cc_import_1 = _jspx_th_cc_import_1.doStartTag();
      if (_jspx_th_cc_import_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_cc_import_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_cc_import_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_cc_import_1.doFinally();
      _jspx_tagPool_cc_import_url_nobody.reuse(_jspx_th_cc_import_1);
    }
    return false;
  }
}
