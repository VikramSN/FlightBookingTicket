<%-- 
    Document   : product.jsp
    Created on : 28 Dec, 2017, 2:07:58 PM
    Author     : MD. SALMAN
--%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.ArrayList"%>
<%@page import="flightupload.flightgettersetter"%>
<%@page import="flightupload.flightinterImpl"%>
<%@page import="flightupload.flightinterface"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="cc"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <!DOCTYPE html>
<html>
    <head>
        <script>
            $('link[href="css/mystyle.css"]').remove();
        </script>
        <style>
            
#holder{    
height:200px;    
width:550px;
background-color:#F5F5F5;
border:1px solid #A4A4A4;
margin-left:10px;   
}
#place {
position:relative;
margin:7px;
}
#place a{
font-size:0.6em;
}
#place li
{
 list-style: none outside none;
 position: absolute;   
}    
#place li:hover
{
background-color:yellow;      
} 
#place .seat{
background:url("images/available_seat_img.gif") no-repeat scroll 0 0 transparent;
height:33px;
width:33px;
display:block;   
}
#place .selectedSeat
{ 
background-image:url("images/booked_seat_img.gif");          
}
#place .selectingSeat
{ 
background-image:url("images/selected_seat_img.gif");        
}
#place .row-3, #place .row-4{
margin-top:10px;
}
#seatDescription li{
verticle-align:middle;    
list-style: none outside none;
padding-left:35px;
height:35px;
float:left;
}
        </style>
         <script type="text/javascript" src="//ajax.googleapis.com/ajax/libs/angularjs/1.3.9/angular.min.js"></script>
        <!--===============================================================================================-->
        <link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
        <!--===============================================================================================-->
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="css/util.css">
        <link rel="stylesheet" type="text/css" href="css/main.css">
        <!--===============================================================================================-->

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Product Page</title>
        <link href='http://fonts.googleapis.com/css?family=Droid+Sans:400,700|Droid+Serif' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" href="css/reset.css"> <!-- CSS reset -->
        <link rel="stylesheet" href="css/style.css"> <!-- Resource style -->
        <script src="js/modernizr.js"></script> <!-- Modernizr -->
        <link rel="stylesheet" href="css/bookstyle.css">


        <%
            flightinterImpl impl = new flightinterImpl();
            ArrayList list = (ArrayList) impl.getcar_info();
        %>
        <style>
            .column {
                float: left;
                width: 24.8%;
                margin-bottom: 16px;
                padding: 0 8px;
            }
            /* Display the columns below each other instead of side by side on small screens */
            @media (max-width: 650px) {
                .column {
                    width: 100%;
                    display: block;
                }
            }
            /* Add some shadows to create a card effect */
            .card {
                box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.9);
            }
            /* Some left and right padding inside the container */
            .container {
                padding: 0 16px;
            }
            /* Clear floats */
            .container::after, .row::after {
                content: "";
                clear: both;
                display: table;
            }
            .title {
                color: grey;
            }
        </style>
        
    </head>
    
    
    
    
    
    <body>
        <cc:import url = "navbarhead.jsp"/>

        <div class="row" style="margin-left: 8px">

            <c:set var="value" value="<%=list%>" />
            <c:forEach var="a" items="${value}" >

                <div class="column">
                    <div class="card" style="background-color: white">
                        <img src="${a.getFlightImage()}" width="300px" height="320px" /> 
                        <div class="container">
                            <h5><b style="color:#1C2C64">${a.getFlightName()}</b></h5>
                            <p class="title" style="color: black">${a.getFlightState()}<b><a href="BookingData?Id=${a.getId()}" ><input style="margin-left: 100px" class ="btn btn-danger"  type="button" value="View"></a></b></p> 
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>

        <%
            flightgettersetter fff = (flightgettersetter) request.getAttribute("fgsobject");
            if (fff == null) {
                System.out.println("Object is null");
            } else {%>


        <!--            ==============================================================================-->
        <div class="container" style="background-color: white; padding: 10px; border-radius: 20px">
            <h4 style="color:#5D6D7E"><b>Flight Details</b></h4>
            <table class="table" style='background-color: white; color:#5D6D7E; border-top-right-radius:40px; border-bottom-left-radius:20px;'>
                <tbody>
                <td rowspan="6"><img src="<%out.println(fff.getFlightImage());%>" style="width: 350px; height: 200px;"></td>
                <tr>
                    <th>Flight Name-<%out.println(fff.getFlightName());%></th>
                    <th>Flight Number-<%out.println(fff.getFlightNumber());%></th>
                    <th>Flight State-<%out.println(fff.getFlightState());%></th>
                </tr>
                <tr>
                    <td>From-<%out.println(fff.getFlightFrom());%></td>
                    <td>To-<%out.println(fff.getFlightTo());%></td>
                    <td>Distance-<%out.println(fff.getFlightDistance());%></td>
                </tr>
                <tr>
                    <td>Economic Price-<%out.println(fff.getFlightETP());%></td>
                    <td>Business Price-<%out.println(fff.getFlightBTP());%></td>
                    <td>Flight Date-<%out.println(fff.getFlightDate());%></td>
                </tr>
                <tr>
                    <td>Flight Depature-<%out.println(fff.getFlightDepature());%></td>
                    <td>Flight Arrival-<%out.println(fff.getFlightArrival());%></td>
                    <td>Flight Duration-<%out.println(fff.getFlightDuration());%></td>
                </tr>
                <tr>
                    <td>Flight Seats Rows-<%out.println(fff.getFlightSeatRows());%></td>
                    <td>Flight Seats Cols-<%out.println(fff.getFlightSeatCols());%></td>
                    <td>Flight Runway-<%out.println(fff.getFlightRunway());%></td>
                </tr>
                </tbody>
            </table>

        <%
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
%>
<%
try { 
connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
statement=connection.createStatement();
String sql ="SELECT * FROM register";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
                       String username = resultSet.getString("name");
                        if(username.equals(loge)){
%>
            <div class="bg-contact3" style="background-image: url('images/bg-01.jpg');">
                <div class="container-contact3">
                    <div class="wrap-contact3">
                        <form class="contact3-form validate-form" action="finalbooking.jsp">
                            <span class="contact3-form-title">
                                Booking Form
                            </span>


                            <div class="wrap-input3 validate-input" data-validate="Name is required">
                                <input class="input3" type="text" name="name" placeholder="Customer Name" value="<%=resultSet.getString("name")%>" style="width: 100%; border: none">
                                <span class="focus-input3"></span>
                            </div>

                            <div class="wrap-input3 validate-input" data-validate = "Valid email is required: ex@abc.xyz">
                                <input class="input3" type="text" name="email" placeholder="Customer Email" value="<%=resultSet.getString("email")%>" style="width: 100%; border: none">
                                <span class="focus-input3"></span>
                            </div>

                            <div class="wrap-input3 validate-input" data-validate="Contact is required">
                                <input class="input3" type="text" name="contact" onchange="CheckIndianNumber(this.value)" value="<%=resultSet.getString("contact")%>" placeholder="Customer Contact" style="width: 100%; border: none" maxlength="10">
                                <span class="focus-input3"></span>
                            </div>
                            
                              <script>
                                    function CheckIndianNumber(IndianNumber)
                                    {
                                        var IndNum = /^([0|\+[0-9]{1,5})?([7-9][0-9]{9})$/;
                                        if (IndNum.test(IndianNumber))
                                        {
                                            swal(
                                                    'Success!',
                                                    'Valid Mobile Number',
                                                    'success'
                                                    )
                                        } else
                                        {
                                            swal(
                                                    'Error!',
                                                    'Mobile number is not valid!',
                                                    'error'
                                                    )
                                        }
                                    }
                                </script>
<%                        }
			 }
} catch (Exception e) {
e.printStackTrace();
}
%>
                            <div class="wrap-input3 validate-input" data-validate="This field is required" id="dynamicInput">
                                <input class="input3" type="text" id="asd" name="nop" placeholder="No. of Passanger" style="width: 100%; border: none">
                                <span class="focus-input3"></span>
                            </div>
  
                            <div class="validate-input">

                                <label for="sel1" style="color: white">Select Class</label>
                                <select class="form-control" id="mySelect" name="selectclass" required onchange="myFunction()">
                                    <option>Economic Class</option>
                                    <option>Economic Class with Food</option>
                                    <option>Business Class</option>
                                    <option>Business Class with Food</option>
                                    
                                </select>
                                <span class="focus-input3"></span>
                            </div>
<script>
function myFunction() {
    var x = document.getElementById("mySelect");
    var i = x.selectedIndex;
    document.getElementById("demo").value ="You have selected : "+x.options[i].text;
   
        if(x.options[i].text=="Economic Class"){
    document.getElementById("demo").value =<%out.println(fff.getFlightETP());%>;        
    } else if(x.options[i].text=="Economic Class with Food"){
    document.getElementById("demo").value =<%out.println(1000+Integer.parseInt(fff.getFlightETP()));%>;        
    }
    else if(x.options[i].text=="Business Class"){
    document.getElementById("demo").value =<%out.println(fff.getFlightBTP());%>;        
    }
    else if(x.options[i].text=="Business Class with Food"){
        document.getElementById("demo").value =<%out.println(1000+Integer.parseInt(fff.getFlightBTP()));%>;        
}

var x = document.getElementById("mySelect");
    var i = x.selectedIndex;
    document.getElementById("demo1").innerHTML ="You have selected : "+x.options[i].text;
   
        if(x.options[i].text=="Economic Class"){
    document.getElementById("demo1").innerHTML ="You have selected : "+x.options[i].text+" and Your Total Price is "+<%out.println(fff.getFlightETP());%>;        
    } else if(x.options[i].text=="Economic Class with Food"){
    document.getElementById("demo1").innerHTML ="You have selected : "+x.options[i].text+" and Your Total Price with Food is "+<%out.println(1000+Integer.parseInt(fff.getFlightETP()));%>;        
    }
    else if(x.options[i].text=="Business Class"){
    document.getElementById("demo1").innerHTML ="You have selected : "+x.options[i].text+" and Your Total Price is "+<%out.println(fff.getFlightBTP());%>;        
    }
    else if(x.options[i].text=="Business Class with Food"){
        document.getElementById("demo1").innerHTML ="You have selected : "+x.options[i].text+" and Your Total Price with Food is "+<%out.println(1000+Integer.parseInt(fff.getFlightBTP()));%>;        
}
    

}
</script>
                            <br>
                            
                            <input type="hidden" id="demo" name="totalprice" readonly required/>
                            <input type="hidden" id="ses" name="totalseat" readonly required/>
                            <p id="demo1" name="totalprice123" style="color:white"></p>
                            <p id="ses1" name="totalseat123" style="color:white"></p>
                            
                            <button type="button" class="btn btn-danger btn-sm" data-toggle="modal" data-target="#meraModal" style="width: auto; height: 30px" required>Select Seat</button<br>
                            <br><Br><div class="container-contact3-form-btn">
                                <button class="contact3-form-btn" style="width: auto">
                                    Book Now
                                </button>
                                 
                            </div>
                        </form>

                    </div>
                    </div>
                </div>
            </div>


            <div id="dropDownSelect1"></div>
            <br><br>
            <!--============================================================================-->



            <%}

            %>


          

                </style>
     <!-- Modal -->
  <div class="modal" id="meraModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <b class="modal-title" style="color:#1C2C64;">Please Select Your Seats</b>
        </div>
        <div class="modal-body" id="btnShowNew">
    <div id="holder"> 
        
        <ul  id="place">
        </ul>    
    </div>
            <br><br><br><br><br>
    <div style="float:left;"> 
        <br>
    <ul id="seatDescription">
        <li style="background:url('images/available_seat_img.gif') no-repeat scroll 0 0 transparent;">Available Seat</li>
        <li style="background:url('images/booked_seat_img.gif') no-repeat scroll 0 0 transparent;">Booked Seat</li>
        <li style="background:url('images/selected_seat_img.gif') no-repeat scroll 0 0 transparent;">Selected Seat</li>
    </ul>
    </div>
<!--        <div style="clear:both;width:100%">
        <input type="button"  value="Show Selected Seats" />
        <input type="button" id="btnShow" value="Show All" />           
        </div>-->
        </div>
          <script>
var settings = {
               rows: <%=fff.getFlightSeatRows()%>,
               cols: <%=fff.getFlightSeatCols()%>,
               rowCssPrefix: 'row-',
               colCssPrefix: 'col-',
               seatWidth: 40,
               seatHeight: 40,
               seatCss: 'seat',
               selectedSeatCss: 'selectedSeat',
               selectingSeatCss: 'selectingSeat'
           };              
              
             var init = function (reservedSeat) {
                var str = [], seatNo, className;
                for (i = 0; i < settings.rows; i++) {
                    for (j = 0; j < settings.cols; j++) {
                        seatNo = (i + j * settings.rows + 1);
                        className = settings.seatCss + ' ' + settings.rowCssPrefix + i.toString() + ' ' + settings.colCssPrefix + j.toString();
                        if ($.isArray(reservedSeat) && $.inArray(seatNo, reservedSeat) != -1) {
                            className += ' ' + settings.selectedSeatCss;
                        }
                        str.push('<li class="' + className + '"' +
                                  'style="top:' + (i * settings.seatHeight).toString() + 'px;left:' + (j * settings.seatWidth).toString() + 'px">' +
                                  '<a style="color:#000" title="' + seatNo + '">' + seatNo + '</a>' +
                                  '</li>');
                    }
                }
                $('#place').html(str.join(''));
            };
            //case I: Show from starting
            //init();
 
   
 
$('#btnShow').click(function () {
    var str = [];
    $.each($('#place li.' + settings.selectedSeatCss + ' a, #place li.'+ settings.selectingSeatCss + ' a'), function (index, value) {
        str.push($(this).attr('title'));
    });
    alert(str.join(','));
})
 
$('#btnShowNew').click(function () {
    var str = [], item;
    $.each($('#place li.' + settings.selectingSeatCss + ' a'), function (index, value) {
        item = $(this).attr('title');                   
        str.push("A"+item);                   
    });        
        document.getElementById("ses1").innerHTML ="Your seats are : -"+str.join(',')+"---&---You have selected "+str.length+" Seats";
        document.getElementById("ses").value =str.join(',');
                                
                            
})
         //Case II: If already booked
            var bookedSeats = [0];
            init(bookedSeats);
            
            $('.' + settings.seatCss).click(function () {
if ($(this).hasClass(settings.selectedSeatCss)){
    alert('This seat is already reserved');
}
else{
    $(this).toggleClass(settings.selectingSeatCss);
    }
});

          </script>
          <button type="button" class="btn btn-default" data-dismiss="modal" style="width: auto; height: auto;">Close</button>
        </div>
      </div>
      
    </div>

            <!--        ========================================================================================-->
            <!--        <div class="cd-panel from-right">
                        <header class="cd-panel-header" id="panelheader2">
                            <h4>flightname</h4>
                            <a href="#0" class="cd-panel-close">Close</a>
                        </header>
            
                        <div class="cd-panel-container" style="background-color: #EDF4CE;">
                            <div class="cd-panel-content">
                                <img style="width: 100%;height: 100;"src="flightimage"/>          
            
                                <br/>                      
                                <div class="container">
            
                                    <form action="airflightindia.jsp" method="post"> 
                                        <table class="table">
            
                                            <tbody>
                                                <tr>
                                                    <td>Runway Name </td>
                                                    <td>international airport</td>
            
                                                </tr>
            
                                                <tr>
                                                    <td>Flight Name</td>
                                                    <td>ABC</td>
                                                </tr>
            
                                                <tr>
                                                    <td>Flight no</td>
                                                    <td>a1402466</td>
                                                </tr>
            
                                                <tr>
                                                    <td>Date</td>
                                                    <td>Daily</td>
                                                </tr>
            
                                                <tr>
                                                    <td>Time</td>
                                                    <td>10.00a m ,12.50 p m ,9.00 p m</td>
                                                </tr>
            
                                                <tr>
                                                    <td>Departures Time</td>
                                                    <td>10.00 a m</td>
                                                </tr>
            
                                                <tr>
                                                    <td>Arrival Time</td>
                                                    <td>11.20 a m</td>
                                                </tr>
            
                                                <tr>
                                                    <td>Duration</td>
                                                    <td>1500 k m</td>
                                                </tr>
            
                                                <tr>
                                                    <td>Business Seat</td>
                                                    <td>50 Seat</td>
                                                </tr>
            
                                                <tr>
                                                    <td>Economic Seat</td>
                                                    <td>80 Seat</td>
                                                </tr>
            
                                                <tr>
                                                    <td>Business Price</td>
                                                    <td>7,000 + G s t</td>
                                                </tr>
            
            
                                                <tr>
                                                    <td>Economic price</td>
                                                    <td>5,000 + G s t</td>
                                                <tr><td><main class="cd-main-content">
                                                            <b style="color: #89ba2c;"><input type="submit"/>
            
                                                        </main>
                                                    </td>
                                                </tr>
                                            </tbody>
                                        </table>
                                    </form>    
                                </div>
            
                            </div>
                        </div>
                    </div>-->

            <script src="js/bookscript.js">
            </script> 
            <!--===============================================================================================-->
            <!--===============================================================================================-->
            <script src="vendor/bootstrap/js/popper.js"></script>
            <!--===============================================================================================-->
            <script src="vendor/select2/select2.min.js"></script>
            <script>
                $(".selection-2").select2({
                    minimumResultsForSearch: 20,
                    dropdownParent: $('#dropDownSelect1')
                });
            </script>
            <!--===============================================================================================-->
            <script src="js/mainn.js"></script>

            <!-- Global site tag (gtag.js) - Google Analytics -->
            <script async src="https://www.googletagmanager.com/gtag/js?id=UA-23581568-13"></script>
            <script>
                window.dataLayer = window.dataLayer || [];
                function gtag() {
                    dataLayer.push(arguments);
                }
                gtag('js', new Date());

                gtag('config', 'UA-23581568-13');
            </script>
            <cc:import url = "footer.jsp"/>
            
    </body>
</html>
