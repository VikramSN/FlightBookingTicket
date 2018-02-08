package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class faq_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>FAQ's Page</title>\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write(" <style>  \n");
      out.write("/*        .panel-body{\n");
      out.write("            background-color: #D0D3D4 ;\n");
      out.write("            font-family: Comic Sans MS;\n");
      out.write("            font-size:14px; \n");
      out.write("        }\n");
      out.write("        */\n");
      out.write("        td{\n");
      out.write("            color:#1A237E;\n");
      out.write("            font-family: monospace;\n");
      out.write("             border-radius: 5px;\n");
      out.write("        }\n");
      out.write("        tr{\n");
      out.write("            font-family: initial;\n");
      out.write("            color: #1A237E;\n");
      out.write("            \n");
      out.write("               border-radius: 5px;\n");
      out.write("    background: #FFFFFF;\n");
      out.write("    padding: 20px; \n");
      out.write("    width: 200px;\n");
      out.write("    height: 100px;  \n");
      out.write("        }\n");
      out.write("/*        #maincontainer12{\n");
      out.write("          width: 100%;\n");
      out.write("    padding: 10px;\n");
      out.write("    box-shadow: 5px 10px #66666666;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        .panel-title{\n");
      out.write("            font-family: Arial;\n");
      out.write("            font-size: 14px;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        body { padding-top: 20px; }\n");
      out.write("#myCarousel .nav a small {\n");
      out.write("    display:block;\n");
      out.write("}*/\n");
      out.write("#myCarousel .nav {\n");
      out.write("\tbackground:#eee;\n");
      out.write("}\n");
      out.write("#myCarousel .nav a {\n");
      out.write("    border-radius:0px;\n");
      out.write("}\n");
      out.write(".panel-heading{\n");
      out.write("               border-radius: 5px;\n");
      out.write("    background: #FFFFFF;\n");
      out.write("    width: 100%;\n");
      out.write("    height: 100%;  \n");
      out.write("    \n");
      out.write("}     \n");
      out.write("        \n");
      out.write("</style>\n");
      out.write("<script>\n");
      out.write("    $(document).ready( function() {\n");
      out.write("    $('#myCarousel').carousel({\n");
      out.write("\t\tinterval:   4000\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\tvar clickEvent = false;\n");
      out.write("\t$('#myCarousel').on('click', '.nav a', function() {\n");
      out.write("\t\t\tclickEvent = true;\n");
      out.write("\t\t\t$('.nav li').removeClass('active');\n");
      out.write("\t\t\t$(this).parent().addClass('active');\t\t\n");
      out.write("\t}).on('slid.bs.carousel', function(e) {\n");
      out.write("\t\tif(!clickEvent) {\n");
      out.write("\t\t\tvar count = $('.nav').children().length -1;\n");
      out.write("\t\t\tvar current = $('.nav li.active');\n");
      out.write("\t\t\tcurrent.removeClass('active').next().addClass('active');\n");
      out.write("\t\t\tvar id = parseInt(current.data('slide-to'));\n");
      out.write("\t\t\tif(count == id) {\n");
      out.write("\t\t\t\t$('.nav li').first().addClass('active');\t\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t\tclickEvent = false;\n");
      out.write("\t});\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write(" <body>\n");
      if (_jspx_meth_cc_import_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("    <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("    \n");
      out.write("      <!-- Wrapper for slides -->\n");
      out.write("      <div class=\"carousel-inner\">\n");
      out.write("      \n");
      out.write("        <div class=\"item active\">\n");
      out.write("            <img src=\"images/fa.jpg\">\n");
      out.write("           <div class=\"carousel-caption\">\n");
      out.write("               <h1 style=\"font-family:initial; font-size:14px;  color: wheat;\">Welcome to PhoenixAirways.</h1>\n");
      out.write("          </div>\n");
      out.write("        </div><!-- End Item -->\n");
      out.write(" \n");
      out.write("         <div class=\"item\">\n");
      out.write("             <img src=\"images/fb.jpg\">\n");
      out.write("           <div class=\"carousel-caption\">\n");
      out.write("            <h1 style=\"font-family:initial; font-size:14px; color: wheat;\">Feel free to ask Questions.</h1>\n");
      out.write("               \n");
      out.write("            \n");
      out.write("          </div>\n");
      out.write("        </div><!-- End Item -->\n");
      out.write("        \n");
      out.write("        <div class=\"item\">\n");
      out.write("            <img src=\"images/fc.jpg\">\n");
      out.write("           <div class=\"carousel-caption\">\n");
      out.write("            <h1 style=\"font-family:initial; font-size:14px; color: wheat;\">Feel free to contact us.</h1>\n");
      out.write("               \n");
      out.write("            \n");
      out.write("          </div>\n");
      out.write("        </div><!-- End Item -->\n");
      out.write("        \n");
      out.write("        <div class=\"item\">\n");
      out.write("            <img src=\"images/fe.jpg\">\n");
      out.write("           <div class=\"carousel-caption\">\n");
      out.write("            <h1 style=\"font-family:initial; font-size:14px; color: wheat;\">Thanks for visiting on our Website.</h1>\n");
      out.write("          </div>\n");
      out.write("        </div><!-- End Item -->\n");
      out.write("                \n");
      out.write("      </div><!-- End Carousel Inner -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    \t<ul class=\"nav nav-pills nav-justified\">\n");
      out.write("          <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"><a href=\"#\">Pheonix Airways flight ticket booking</a></li>\n");
      out.write("          <li data-target=\"#myCarousel\" data-slide-to=\"1\"><a href=\"#\">Products All type of flights available</a></li>\n");
      out.write("          <li data-target=\"#myCarousel\" data-slide-to=\"2\"><a href=\"#\">Portfolio its group of NiiTian </a></li>\n");
      out.write("          <li data-target=\"#myCarousel\" data-slide-to=\"3\"><a href=\"#\">Services we provide best service to customer </a></li>\n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div><!-- End Carousel -->\n");
      out.write("</div>\n");
      out.write("    \n");
      out.write("    <!-- start Faqs-->\n");
      out.write("    <div class=\"container\" style=\"height: 100px;\"> \n");
      out.write("     <div class=\"row\" style=\"background-color:#337ab7;margin-left: 0.1px; width: 100%; height: 100px;\">\n");
      out.write("         <div class=\"col-lg-12\">\n");
      out.write("             <div>\n");
      out.write("   <h1 style=\" margin-top: 20px; color: #FFFFFF; font-family: Roman; height: 3%; size: 150px;\">\n");
      out.write("       <center>Frequently asked questions ?</center></h1>\n");
      out.write("             </div>\n");
      out.write("         </div>\n");
      out.write("     </div>\n");
      out.write(" </div>\n");
      out.write("    \n");
      out.write(" <div class=\"container\" id=\"maincontainer12\">\n");
      out.write("     <div class=\"row\">\n");
      out.write("         <div class=\"col-md-8\">\n");
      out.write("    \n");
      out.write("  <div class=\"panel-group\" id=\"accordion\">\n");
      out.write("    <div class=\"panel panel-default\">\n");
      out.write("      <div class=\"panel-heading\">\n");
      out.write("        <h4 class=\"panel-title\">\n");
      out.write("          <a data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapse1\">Q.1 :-\n");
      out.write("              How can i cancel my tickets ? </a>\n");
      out.write("        </h4>\n");
      out.write("      </div>\n");
      out.write("      <div id=\"collapse1\" class=\"panel-collapse collapse in\">\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("        1.To cancel your tickets, simply follow the steps below:<br/>\n");
      out.write("              * Log onto www.makemytrip.com<br/>\n");
      out.write("              * Click on the Customer Support link<br/>\n");
      out.write("              * Click on Cancel Bookings button under the Flights section<br/>\n");
      out.write("              * Enter the MakeMyTrip Booking ID corresponding to your booking and the Contact Number that you gave at                  the time of the booking.<br/>\n");
      out.write("              * You can choose to cancel your entire booking or cancel any specific passengers or sectors in your                      booking after you log in.<br/>\n");
      out.write("              * Please review the cancellation penalty and refund amount before you confirm to cancel the booking.<br/>\n");
      out.write("              * The refund amount would reflect in the same account that was used to make the payment at the time of                 the booking.<br/><br/>\n");
      out.write(" \n");
      out.write("                      You can also cancel your ticket(s) by logging into your account using your email id and                                password under the My Bookings section on the Custoemr Support page.<br/><br/>\n");
      out.write("\n");
      out.write("              ** We now also support cancellation of select international flights online.<br/>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"panel panel-default\">\n");
      out.write("      <div class=\"panel-heading\">\n");
      out.write("        <h4 class=\"panel-title\">\n");
      out.write("          <a data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapse2\">Q.2 :- What documents do I need to carry to check-in for my flight?<BR/>Do I have to carry the credit card that was used for making the payment? </a>\n");
      out.write("        </h4>\n");
      out.write("      </div>\n");
      out.write("      <div id=\"collapse2\" class=\"panel-collapse collapse\">\n");
      out.write("        <div class=\"panel-body\">It is mandatory to carry a government issued photo identification (ID) proof along with the E-Ticket copy. The same is verified by the airport security as well as the airline at the check in counter. On presenting your photo ID proof and E-Ticket copy, your boarding pass will be issued. For international flights, your passport is the only valid photo ID proof that will be accepted.<br/><br/>\n");
      out.write("\n");
      out.write("In case of an infant travelling, it is mandatory to carry the birth certificate of the infant along with the ticket.\n");
      out.write("<br/><br/>\n");
      out.write("It is not mandatory to carry the credit/debit card that was used to make the payment at the time of the booking, if you have booked through MakeMyTrip. (we do not pass on your account details to the airline).\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div class=\"panel panel-default\">\n");
      out.write("      <div class=\"panel-heading\">\n");
      out.write("        <h4 class=\"panel-title\">\n");
      out.write("          <a data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapse3\">Q.3 :-What are the cancellation charges applicable on cancelling a train ticket? </a>\n");
      out.write("        </h4>\n");
      out.write("      </div>\n");
      out.write("      <div id=\"collapse3\" class=\"panel-collapse collapse\">\n");
      out.write("        <div class=\"panel-body\">Cancellation penalty varies by the quota you have booked your ticket in, time before departure of the train, PNR status, class of travel and distance for which reservation is done. You can find indicative information below to help you calculate your cancellation penalties. For more detailed information, please refer to http://www.indianrail.gov.in/refund_rules.html<br/><br/>\n");
      out.write("\n");
      out.write("\n");
      out.write("If a confirmed ticket is cancelled more than 24 hrs before the scheduled departure of the train, flat cancellation charges shall be deducted @ Rs.70/- for AC First Class/Executive Class, Rs.60/- for AC 2 Tier/AC 3 Tier/First Class/AC Chair car, Rs.40/- for Sleeper Class and Rs.20/- for Second Class. Cancellation charges are per passenger.\n");
      out.write("<br/><br/>\n");
      out.write("\n");
      out.write("If a confirmed ticket is cancelled within 24 hrs and up to 4 hours before the scheduled departure of the train, cancellation charges shall be 25% of the fare subject to the minimum flat rate mentioned in the above clause.\n");
      out.write("<br/><br/>\n");
      out.write("\n");
      out.write("Less than 4 hours before the schedule departure of the train upto chart preparation of the train, 50% of the fare paid subject to the minimum cancellation charges. Note the Chart preparation time is the time for the chart preparation from the Train Originating Station or from the Previous chart Preparation station.\n");
      out.write("<br/><br/>\n");
      out.write("\n");
      out.write("For Taktal quota tickets, a flat refund of 25% of total fare charged on ticket, excluding Tatkal Charges is granted on cancellation of confirmed Tatkal tickets, which are cancelled up to 24 hrs before the schedule departure of train. No refund on confirmed Tatkal tickets is granted when cancelled within 24 hrs of the schedule departure of train. For contingent cancellation and waitlisted Tatkal ticket cancellations, charges will be deducted as per existing Railway rules.<br/>\n");
      out.write("</div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div class=\"panel panel-default\">\n");
      out.write("      <div class=\"panel-heading\">\n");
      out.write("        <h4 class=\"panel-title\">\n");
      out.write("          <a data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapse4\">Q.4 :-How can I change the date of my flight booking? </a>\n");
      out.write("        </h4>\n");
      out.write("      </div>\n");
      out.write("      <div id=\"collapse4\" class=\"panel-collapse collapse\">\n");
      out.write("        <div class=\"panel-body\">Date Change may be permissible on your booking on payment of Airline Date Change Fee, MakeMyTrip Service Charges plus any fare difference that may exist between your original fare and the fare of the flight that you want to change to. The date change fees and MakeMyTrip Service Charges are printed on your E-Ticket. In several cases, the date change fees and the cancellation fees levied by the airline is the same and you could also cancel the ticket online and make a fresh booking at the same cost as that of doing a date change. Please note that date change may not be permitted on certain tickets. <br/><br/>\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("You would need to get in touch with our Customer Care helpline to do any change of flights in your booking.\n");
      out.write("<br/><br/>\n");
      out.write(" \n");
      out.write("\n");
      out.write("If you want to change your flight to a flight that is operated by another airline, you will need to cancel your existing booking and make a fresh booking. Please visit our Customer Support section to cancel your booking online. Our online cancellation service lets you cancel a part of your booking by selecting the passengers and sectors you wish to cancel or cancel your complete booking in quick time.<br/><br/>\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div class=\"panel panel-default\">\n");
      out.write("      <div class=\"panel-heading\">\n");
      out.write("        <h4 class=\"panel-title\">\n");
      out.write("          <a data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapse5\">Q.5 :- I have booked my tickets online. How can I get another copy of my E-Ticket? </a>\n");
      out.write("        </h4>\n");
      out.write("      </div>\n");
      out.write("      <div id=\"collapse5\" class=\"panel-collapse collapse\">\n");
      out.write("        <div class=\"panel-body\">To view and take a printout of your E-Ticket, simply follow the steps below:<br/><br/>\n");
      out.write("\n");
      out.write("                  * Log onto www.makemytrip.com<br/>\n");
      out.write("                  * Click on the Customer Support link<br/>\n");
      out.write("                  * Click on “Print E-Tickets” button under your product type (Domestic Flights, International                        Flights, Rail)<br/>\n");
      out.write("             * Enter the MakeMyTrip Booking ID corresponding to your booking and the Contact Number given                           at the time of making the Booking.<br/>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div class=\"panel panel-default\">\n");
      out.write("      <div class=\"panel-heading\">\n");
      out.write("        <h4 class=\"panel-title\">\n");
      out.write("          <a data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapse6\">Q.6 :- Which terminal will my flight operate from at Delhi / Mumbai airport? </a>\n");
      out.write("        </h4>\n");
      out.write("      </div>\n");
      out.write("      <div id=\"collapse6\" class=\"panel-collapse collapse\">\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("            \n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("  <p style=\"background-color: #F9E79F; text-align: center; font-size: x-large; font-family: monospace;\">Delhi (Indira Gandhi International) Airport</p>            \n");
      out.write("  <table class=\"table\">\n");
      out.write("    <thead>\n");
      out.write("      <tr>\n");
      out.write("          <th >Airline</th>\n");
      out.write("        <th >Departure Terminal\n");
      out.write("\n");
      out.write("</th>\n");
      out.write("        <th >Departure Terminal\n");
      out.write("\n");
      out.write("</th>\n");
      out.write("      </tr>\n");
      out.write("    </thead>\n");
      out.write("    <tbody>\n");
      out.write("      <tr>\n");
      out.write("        <td>Air India, Air India Express, Jet Airways,<br/> Jet Konnect, Jetlite, Kingfisher Airlines,<br/> Kingfisher Red, All International Flights</td>\n");
      out.write("        <td> Terminal 3</td>\n");
      out.write("        <td> Terminal 3</td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td>IndiGo Airlines*, SpiceJet**, Go Air</td>\n");
      out.write("        <td> Terminal 1D <br/>(Palam)</td>\n");
      out.write("        <td> Terminal 1C <br/>(Palam)</td>\n");
      out.write("      </tr>\n");
      out.write("    </tbody>\n");
      out.write("  </table>\n");
      out.write("  <p style=\"color:#212121; font-family:serif ;\"> * International flights of Indigo Airlines will depart from Terminal 3 <br/>\n");
      out.write("      **International flights of SpiceJet operate from Terminal 3</p>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"container-fluid \">\n");
      out.write("\n");
      out.write("  <p style=\"background-color: #F9E79F; text-align: center; font-size: x-large; font-family: monospace;\">Mumbai (Chattrapati Shivaji International) Airport</p>            \n");
      out.write("  <table class=\"table\" style=\"width: 100%\">\n");
      out.write("    <thead>\n");
      out.write("      <tr>\n");
      out.write("        <th >Airline</th>\n");
      out.write("        <th >Departure Terminal\n");
      out.write("</th>\n");
      out.write("        <th >Departure Terminal\n");
      out.write("\n");
      out.write("</th>\n");
      out.write("      </tr>\n");
      out.write("    </thead>\n");
      out.write("    <tbody>\n");
      out.write("      <tr>\n");
      out.write("        <td>Air India (Flight # 400-899 & 9000-9999),<br/>Kingfisher Airlines,\n");
      out.write("Kingfisher Red</td>\n");
      out.write("        <td> Terminal 1A <br/>(Santa Cruz)</td>\n");
      out.write("        <td> Terminal 1A <br/>(Santa Cruz)</td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td>IndiGo Airlines*, SpiceJet, Go Air, Jet Airways, Jetlite</td>\n");
      out.write("        <td>  Terminal 1B (Santa Cruz)<br/>(Palam)</td>\n");
      out.write("        <td>Terminal 1B (Santa Cruz)</td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("      <td>Air India Express, Air India (Flight # 010-399 & 900-999),<br/> All International Flights</td>\n");
      out.write("       <td>Terminal 2 (Sahar)</td>\n");
      out.write("     <td>Terminal 2 (Sahar)</td>\n");
      out.write("     \n");
      out.write("      </tr>\n");
      out.write("    </tbody>\n");
      out.write("  </table>\n");
      out.write("  <p style=\"color:#212121; font-family:serif ;\"> * International flights of Indigo Airlines will depart from Terminal 2</p>\n");
      out.write("</div>\n");
      out.write(" \n");
      out.write("        \t\n");
      out.write("</div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("      <div class=\"panel panel-default\" style=\"margin-top: 5px;\">\n");
      out.write("      <div class=\"panel-heading\">\n");
      out.write("        <h4 class=\"panel-title\">\n");
      out.write("          <a data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapse7\">Q.7 :- Online Cancellation & Refund<br/>\n");
      out.write("How do I get a refund for tickets that I have directly cancelled with airlines? </a>\n");
      out.write("        </h4>\n");
      out.write("      </div>\n");
      out.write("      <div id=\"collapse7\" class=\"panel-collapse collapse\">\n");
      out.write("        <div class=\"panel-body\">If you have cancelled the booking directly with the airline, you would need to inform MakeMyTrip of the same.<BR/> Please log on to( https://support.makemytrip.com/customersupports.aspx )to inform us of the cancellation,<br>\n");
      out.write("            under Special Claims.<br/><br/>\n");
      out.write("\n");
      out.write("You can also submit request for Special Claims against (NO SHOW) un-utilized ticket, and flight not operational cases.\n");
      out.write("<br/><br/>\n");
      out.write("On receiving your confirmation, Make My Trip will validate the refund amount with the airline and then process the refund to your account.<BR/>\n");
      out.write("Please note that MakeMyTrip shall charge Rs. 250 per sector per passenger as a cancellation service fee over and above <BR/>\n");
      out.write("the individual airline cancellation fee.\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div class=\"panel panel-default\">\n");
      out.write("      <div class=\"panel-heading\">\n");
      out.write("        <h4 class=\"panel-title\">\n");
      out.write("          <a data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapse8\">Q.8 :-How do I become a registered member of MakeMyTrip? </a>\n");
      out.write("        </h4>\n");
      out.write("      </div>\n");
      out.write("      <div id=\"collapse8\" class=\"panel-collapse collapse\">\n");
      out.write("        <div class=\"panel-default\">Becoming a registered member of MakeMyTrip is easy and free of cost. To register, click on the Register with Us link under the Customer Supportsection on the website.\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div class=\"panel panel-default\">\n");
      out.write("      <div class=\"panel-heading\">\n");
      out.write("        <h4 class=\"panel-title\">\n");
      out.write("          <a data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapse9\">Q.9 :- How do I check if my flight is on time or not?</a>\n");
      out.write("        </h4>\n");
      out.write("      </div>\n");
      out.write("      <div id=\"collapse9\" class=\"panel-collapse collapse\">\n");
      out.write("        <div class=\"panel-body\">You can check the status for any flight departing within 24 hours by clicking on the<br/>Flight Status link.\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <div class=\"panel panel-default\">\n");
      out.write("      <div class=\"panel-heading\">\n");
      out.write("        <h4 class=\"panel-title\">\n");
      out.write("          <a data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapse10\">Q.10 :-I am unable to cancel my domestic air travel tickets online. What do I do?</a>\n");
      out.write("        </h4>\n");
      out.write("      </div>\n");
      out.write("      <div id=\"collapse10\" class=\"panel-collapse collapse\">\n");
      out.write("        <div class=\"panel-body\">You will not be able to use the online flight cancellation facility if:<br/><li>Your flight departure time is within the next 3 hours<br/>\n");
      out.write("\n");
      out.write("For all such cancellations, kindly call us.\n");
      out.write("<br/>\n");
      out.write("\n");
      out.write("Please note, if your flight departure time is within the next 3 hours,\n");
      out.write("you will need to call the relevant airline to cancel your booking. Kindly click on Airline Contact Information for more details.</div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div> \n");
      out.write("         </div>\n");
      out.write("     \n");
      out.write("         <br>\n");
      out.write("         <div class=\"col-md-4\">\n");
      out.write("             <form action=\"faqsuccess.jsp\">\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("                <label style=\"color: #fff\">Name</label>\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"fname\" placeholder=\"Enter name\" name=\"qname\" required style=\"width: 100%\">\n");
      out.write("                <label style=\"color: #fff\">Email</label>\n");
      out.write("        <input type=\"email\" class=\"form-control\" id=\"email\" placeholder=\"Enter email\" name=\"qemail\" required style=\"width: 100%\">\n");
      out.write("          <label style=\"color: #fff\">Any Querry ?</label>\n");
      out.write("          <textarea rows=\"4\" cols=\"50\" class=\"form-control\" id=\"querry\" placeholder=\"Enter Further Querry ?\" name=\"qmsg\" required>\n");
      out.write("          </textarea>\n");
      out.write("          <br>\n");
      out.write("    <input type=\"submit\" class=\"btn btn-primary\" value=\"Submit\">\n");
      out.write("   </div>\n");
      out.write("             </form>\n");
      out.write("            \n");
      out.write("         </div>\n");
      out.write("     </div>\n");
      out.write("    </div><br>\n");
      out.write("        ");
      if (_jspx_meth_cc_import_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("</body>\n");
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
