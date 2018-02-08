<%-- 
    Document   : faq
    Created on : Dec 28, 2017, 3:48:22 PM
    Author     : MRuser
--%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "cc" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>FAQ's Page</title>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
 <style>  
/*        .panel-body{
            background-color: #D0D3D4 ;
            font-family: Comic Sans MS;
            font-size:14px; 
        }
        */
        td{
            color:#1A237E;
            font-family: monospace;
             border-radius: 5px;
        }
        tr{
            font-family: initial;
            color: #1A237E;
            
               border-radius: 5px;
    background: #FFFFFF;
    padding: 20px; 
    width: 200px;
    height: 100px;  
        }
/*        #maincontainer12{
          width: 100%;
    padding: 10px;
    box-shadow: 5px 10px #66666666;

        }
        .panel-title{
            font-family: Arial;
            font-size: 14px;
        }
        
        
        body { padding-top: 20px; }
#myCarousel .nav a small {
    display:block;
}*/
#myCarousel .nav {
	background:#eee;
}
#myCarousel .nav a {
    border-radius:0px;
}
.panel-heading{
               border-radius: 5px;
    background: #FFFFFF;
    width: 100%;
    height: 100%;  
    
}     
        
</style>
<script>
    $(document).ready( function() {
    $('#myCarousel').carousel({
		interval:   4000
	});
	
	var clickEvent = false;
	$('#myCarousel').on('click', '.nav a', function() {
			clickEvent = true;
			$('.nav li').removeClass('active');
			$(this).parent().addClass('active');		
	}).on('slid.bs.carousel', function(e) {
		if(!clickEvent) {
			var count = $('.nav').children().length -1;
			var current = $('.nav li.active');
			current.removeClass('active').next().addClass('active');
			var id = parseInt(current.data('slide-to'));
			if(count == id) {
				$('.nav li').first().addClass('active');	
			}
		}
		clickEvent = false;
	});
});
</script>

    </head>

 <body>
<cc:import url = "navbarhead.jsp"/>
    <div class="container">
    <div id="myCarousel" class="carousel slide" data-ride="carousel">
    
      <!-- Wrapper for slides -->
      <div class="carousel-inner">
      
        <div class="item active">
            <img src="images/fa.jpg">
           <div class="carousel-caption">
               <h1 style="font-family:initial; font-size:14px;  color: wheat;">Welcome to PhoenixAirways.</h1>
          </div>
        </div><!-- End Item -->
 
         <div class="item">
             <img src="images/fb.jpg">
           <div class="carousel-caption">
            <h1 style="font-family:initial; font-size:14px; color: wheat;">Feel free to ask Questions.</h1>
               
            
          </div>
        </div><!-- End Item -->
        
        <div class="item">
            <img src="images/fc.jpg">
           <div class="carousel-caption">
            <h1 style="font-family:initial; font-size:14px; color: wheat;">Feel free to contact us.</h1>
               
            
          </div>
        </div><!-- End Item -->
        
        <div class="item">
            <img src="images/fe.jpg">
           <div class="carousel-caption">
            <h1 style="font-family:initial; font-size:14px; color: wheat;">Thanks for visiting on our Website.</h1>
          </div>
        </div><!-- End Item -->
                
      </div><!-- End Carousel Inner -->


    	<ul class="nav nav-pills nav-justified">
          <li data-target="#myCarousel" data-slide-to="0" class="active"><a href="#">Pheonix Airways flight ticket booking</a></li>
          <li data-target="#myCarousel" data-slide-to="1"><a href="#">Products All type of flights available</a></li>
          <li data-target="#myCarousel" data-slide-to="2"><a href="#">Portfolio its group of NiiTian </a></li>
          <li data-target="#myCarousel" data-slide-to="3"><a href="#">Services we provide best service to customer </a></li>
        </ul>


    </div><!-- End Carousel -->
</div>
    
    <!-- start Faqs-->
    <div class="container" style="height: 100px;"> 
     <div class="row" style="background-color:#337ab7;margin-left: 0.1px; width: 100%; height: 100px;">
         <div class="col-lg-12">
             <div>
   <h1 style=" margin-top: 20px; color: #FFFFFF; font-family: Roman; height: 3%; size: 150px;">
       <center>Frequently asked questions ?</center></h1>
             </div>
         </div>
     </div>
 </div>
    
 <div class="container" id="maincontainer12">
     <div class="row">
         <div class="col-md-8">
    
  <div class="panel-group" id="accordion">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h4 class="panel-title">
          <a data-toggle="collapse" data-parent="#accordion" href="#collapse1">Q.1 :-
              How can i cancel my tickets ? </a>
        </h4>
      </div>
      <div id="collapse1" class="panel-collapse collapse in">
        <div class="panel-body">
        1.To cancel your tickets, simply follow the steps below:<br/>
              * Log onto www.makemytrip.com<br/>
              * Click on the Customer Support link<br/>
              * Click on Cancel Bookings button under the Flights section<br/>
              * Enter the MakeMyTrip Booking ID corresponding to your booking and the Contact Number that you gave at                  the time of the booking.<br/>
              * You can choose to cancel your entire booking or cancel any specific passengers or sectors in your                      booking after you log in.<br/>
              * Please review the cancellation penalty and refund amount before you confirm to cancel the booking.<br/>
              * The refund amount would reflect in the same account that was used to make the payment at the time of                 the booking.<br/><br/>
 
                      You can also cancel your ticket(s) by logging into your account using your email id and                                password under the My Bookings section on the Custoemr Support page.<br/><br/>

              ** We now also support cancellation of select international flights online.<br/>
        </div>
      </div>
    </div>
    <div class="panel panel-default">
      <div class="panel-heading">
        <h4 class="panel-title">
          <a data-toggle="collapse" data-parent="#accordion" href="#collapse2">Q.2 :- What documents do I need to carry to check-in for my flight?<BR/>Do I have to carry the credit card that was used for making the payment? </a>
        </h4>
      </div>
      <div id="collapse2" class="panel-collapse collapse">
        <div class="panel-body">It is mandatory to carry a government issued photo identification (ID) proof along with the E-Ticket copy. The same is verified by the airport security as well as the airline at the check in counter. On presenting your photo ID proof and E-Ticket copy, your boarding pass will be issued. For international flights, your passport is the only valid photo ID proof that will be accepted.<br/><br/>

In case of an infant travelling, it is mandatory to carry the birth certificate of the infant along with the ticket.
<br/><br/>
It is not mandatory to carry the credit/debit card that was used to make the payment at the time of the booking, if you have booked through MakeMyTrip. (we do not pass on your account details to the airline).

</div>
      </div>
    </div>
    
    <div class="panel panel-default">
      <div class="panel-heading">
        <h4 class="panel-title">
          <a data-toggle="collapse" data-parent="#accordion" href="#collapse3">Q.3 :-What are the cancellation charges applicable on cancelling a train ticket? </a>
        </h4>
      </div>
      <div id="collapse3" class="panel-collapse collapse">
        <div class="panel-body">Cancellation penalty varies by the quota you have booked your ticket in, time before departure of the train, PNR status, class of travel and distance for which reservation is done. You can find indicative information below to help you calculate your cancellation penalties. For more detailed information, please refer to http://www.indianrail.gov.in/refund_rules.html<br/><br/>


If a confirmed ticket is cancelled more than 24 hrs before the scheduled departure of the train, flat cancellation charges shall be deducted @ Rs.70/- for AC First Class/Executive Class, Rs.60/- for AC 2 Tier/AC 3 Tier/First Class/AC Chair car, Rs.40/- for Sleeper Class and Rs.20/- for Second Class. Cancellation charges are per passenger.
<br/><br/>

If a confirmed ticket is cancelled within 24 hrs and up to 4 hours before the scheduled departure of the train, cancellation charges shall be 25% of the fare subject to the minimum flat rate mentioned in the above clause.
<br/><br/>

Less than 4 hours before the schedule departure of the train upto chart preparation of the train, 50% of the fare paid subject to the minimum cancellation charges. Note the Chart preparation time is the time for the chart preparation from the Train Originating Station or from the Previous chart Preparation station.
<br/><br/>

For Taktal quota tickets, a flat refund of 25% of total fare charged on ticket, excluding Tatkal Charges is granted on cancellation of confirmed Tatkal tickets, which are cancelled up to 24 hrs before the schedule departure of train. No refund on confirmed Tatkal tickets is granted when cancelled within 24 hrs of the schedule departure of train. For contingent cancellation and waitlisted Tatkal ticket cancellations, charges will be deducted as per existing Railway rules.<br/>
</div>
      </div>
    </div>
    
    <div class="panel panel-default">
      <div class="panel-heading">
        <h4 class="panel-title">
          <a data-toggle="collapse" data-parent="#accordion" href="#collapse4">Q.4 :-How can I change the date of my flight booking? </a>
        </h4>
      </div>
      <div id="collapse4" class="panel-collapse collapse">
        <div class="panel-body">Date Change may be permissible on your booking on payment of Airline Date Change Fee, MakeMyTrip Service Charges plus any fare difference that may exist between your original fare and the fare of the flight that you want to change to. The date change fees and MakeMyTrip Service Charges are printed on your E-Ticket. In several cases, the date change fees and the cancellation fees levied by the airline is the same and you could also cancel the ticket online and make a fresh booking at the same cost as that of doing a date change. Please note that date change may not be permitted on certain tickets. <br/><br/>

 

You would need to get in touch with our Customer Care helpline to do any change of flights in your booking.
<br/><br/>
 

If you want to change your flight to a flight that is operated by another airline, you will need to cancel your existing booking and make a fresh booking. Please visit our Customer Support section to cancel your booking online. Our online cancellation service lets you cancel a part of your booking by selecting the passengers and sectors you wish to cancel or cancel your complete booking in quick time.<br/><br/>


</div>
      </div>
    </div>
    
    <div class="panel panel-default">
      <div class="panel-heading">
        <h4 class="panel-title">
          <a data-toggle="collapse" data-parent="#accordion" href="#collapse5">Q.5 :- I have booked my tickets online. How can I get another copy of my E-Ticket? </a>
        </h4>
      </div>
      <div id="collapse5" class="panel-collapse collapse">
        <div class="panel-body">To view and take a printout of your E-Ticket, simply follow the steps below:<br/><br/>

                  * Log onto www.makemytrip.com<br/>
                  * Click on the Customer Support link<br/>
                  * Click on “Print E-Tickets” button under your product type (Domestic Flights, International                        Flights, Rail)<br/>
             * Enter the MakeMyTrip Booking ID corresponding to your booking and the Contact Number given                           at the time of making the Booking.<br/>

</div>
      </div>
    </div>
    
    <div class="panel panel-default">
      <div class="panel-heading">
        <h4 class="panel-title">
          <a data-toggle="collapse" data-parent="#accordion" href="#collapse6">Q.6 :- Which terminal will my flight operate from at Delhi / Mumbai airport? </a>
        </h4>
      </div>
      <div id="collapse6" class="panel-collapse collapse">
        <div class="panel-body">
            
            <div class="container-fluid">

  <p style="background-color: #F9E79F; text-align: center; font-size: x-large; font-family: monospace;">Delhi (Indira Gandhi International) Airport</p>            
  <table class="table">
    <thead>
      <tr>
          <th >Airline</th>
        <th >Departure Terminal

</th>
        <th >Departure Terminal

</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>Air India, Air India Express, Jet Airways,<br/> Jet Konnect, Jetlite, Kingfisher Airlines,<br/> Kingfisher Red, All International Flights</td>
        <td> Terminal 3</td>
        <td> Terminal 3</td>
      </tr>
      <tr>
        <td>IndiGo Airlines*, SpiceJet**, Go Air</td>
        <td> Terminal 1D <br/>(Palam)</td>
        <td> Terminal 1C <br/>(Palam)</td>
      </tr>
    </tbody>
  </table>
  <p style="color:#212121; font-family:serif ;"> * International flights of Indigo Airlines will depart from Terminal 3 <br/>
      **International flights of SpiceJet operate from Terminal 3</p>
</div>

<div class="container-fluid ">

  <p style="background-color: #F9E79F; text-align: center; font-size: x-large; font-family: monospace;">Mumbai (Chattrapati Shivaji International) Airport</p>            
  <table class="table" style="width: 100%">
    <thead>
      <tr>
        <th >Airline</th>
        <th >Departure Terminal
</th>
        <th >Departure Terminal

</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>Air India (Flight # 400-899 & 9000-9999),<br/>Kingfisher Airlines,
Kingfisher Red</td>
        <td> Terminal 1A <br/>(Santa Cruz)</td>
        <td> Terminal 1A <br/>(Santa Cruz)</td>
      </tr>
      <tr>
        <td>IndiGo Airlines*, SpiceJet, Go Air, Jet Airways, Jetlite</td>
        <td>  Terminal 1B (Santa Cruz)<br/>(Palam)</td>
        <td>Terminal 1B (Santa Cruz)</td>
      </tr>
      <tr>
      <td>Air India Express, Air India (Flight # 010-399 & 900-999),<br/> All International Flights</td>
       <td>Terminal 2 (Sahar)</td>
     <td>Terminal 2 (Sahar)</td>
     
      </tr>
    </tbody>
  </table>
  <p style="color:#212121; font-family:serif ;"> * International flights of Indigo Airlines will depart from Terminal 2</p>
</div>
 
        	
</div>
      </div>
    </div>
    
      <div class="panel panel-default" style="margin-top: 5px;">
      <div class="panel-heading">
        <h4 class="panel-title">
          <a data-toggle="collapse" data-parent="#accordion" href="#collapse7">Q.7 :- Online Cancellation & Refund<br/>
How do I get a refund for tickets that I have directly cancelled with airlines? </a>
        </h4>
      </div>
      <div id="collapse7" class="panel-collapse collapse">
        <div class="panel-body">If you have cancelled the booking directly with the airline, you would need to inform MakeMyTrip of the same.<BR/> Please log on to( https://support.makemytrip.com/customersupports.aspx )to inform us of the cancellation,<br>
            under Special Claims.<br/><br/>

You can also submit request for Special Claims against (NO SHOW) un-utilized ticket, and flight not operational cases.
<br/><br/>
On receiving your confirmation, Make My Trip will validate the refund amount with the airline and then process the refund to your account.<BR/>
Please note that MakeMyTrip shall charge Rs. 250 per sector per passenger as a cancellation service fee over and above <BR/>
the individual airline cancellation fee.

</div>
      </div>
    </div>
    
    <div class="panel panel-default">
      <div class="panel-heading">
        <h4 class="panel-title">
          <a data-toggle="collapse" data-parent="#accordion" href="#collapse8">Q.8 :-How do I become a registered member of MakeMyTrip? </a>
        </h4>
      </div>
      <div id="collapse8" class="panel-collapse collapse">
        <div class="panel-default">Becoming a registered member of MakeMyTrip is easy and free of cost. To register, click on the Register with Us link under the Customer Supportsection on the website.

</div>
      </div>
    </div>
    
    <div class="panel panel-default">
      <div class="panel-heading">
        <h4 class="panel-title">
          <a data-toggle="collapse" data-parent="#accordion" href="#collapse9">Q.9 :- How do I check if my flight is on time or not?</a>
        </h4>
      </div>
      <div id="collapse9" class="panel-collapse collapse">
        <div class="panel-body">You can check the status for any flight departing within 24 hours by clicking on the<br/>Flight Status link.



</div>
      </div>
    </div>
    
    
    <div class="panel panel-default">
      <div class="panel-heading">
        <h4 class="panel-title">
          <a data-toggle="collapse" data-parent="#accordion" href="#collapse10">Q.10 :-I am unable to cancel my domestic air travel tickets online. What do I do?</a>
        </h4>
      </div>
      <div id="collapse10" class="panel-collapse collapse">
        <div class="panel-body">You will not be able to use the online flight cancellation facility if:<br/><li>Your flight departure time is within the next 3 hours<br/>

For all such cancellations, kindly call us.
<br/>

Please note, if your flight departure time is within the next 3 hours,
you will need to call the relevant airline to cancel your booking. Kindly click on Airline Contact Information for more details.</div>
      </div>
    </div>
  </div> 
         </div>
     
         <br>
         <div class="col-md-4">
             <form action="faqsuccess.jsp">
    <div class="form-group">
                <label style="color: #fff">Name</label>
      <input type="text" class="form-control" id="fname" placeholder="Enter name" name="qname" required style="width: 100%">
                <label style="color: #fff">Email</label>
        <input type="email" class="form-control" id="email" placeholder="Enter email" name="qemail" required style="width: 100%">
          <label style="color: #fff">Any Querry ?</label>
          <textarea rows="4" cols="50" class="form-control" id="querry" placeholder="Enter Further Querry ?" name="qmsg" required>
          </textarea>
          <br>
    <input type="submit" class="btn btn-primary" value="Submit">
   </div>
             </form>
            
         </div>
     </div>
    </div><br>
        <cc:import url = "footer.jsp"/>
</body>
</html>
