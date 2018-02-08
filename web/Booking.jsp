<%-- 
    Document   : ContactUs
    Created on : 2 Jan, 2018, 2:06:05 PM
    Author     : Neha
--%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "cc" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style> 
            * {
                -webkit-box-sizing: border-box;
                -moz-box-sizing: border-box;
                box-sizing: border-box;
            }
            .page-wrap {
                max-width: 75rem;
                margin: 0 auto;
            }
            h1 {
                color: #8e44ad;
                font-size: 1.5rem;
                letter-spacing: -1px;
                margin: 1.25rem 0;
            }
            input:focus ~ label, textarea:focus ~ label, input:valid ~ label, textarea:valid ~ label {
                font-size: 0.75em;
                color: red;
                top: -2.50rem;
                -webkit-transition: all 0.125s ease;
                transition: all 0.125s ease;
            }
            .styled-input {
                float: left;
                width: 30.3333%;
                margin: 2rem 0 1rem;
                position: relative;
            }
            .styled-input label {
                color: #000;
                padding: 1rem;
                position: absolute;
                top: 0;
                left: 0;
                -webkit-transition: all 0.25s ease;
                transition: all 0.25s ease;
                pointer-events: none;
            }
            .styled-input.wide { width: 70%; }
            input,
            textarea {
                padding: 1rem 1rem;
                border: 1;
                width: 100%;
                font-size: 1rem;
            }
            input ~ span,
            textarea ~ span {
                display: block;
                width: 0;
                height: 3px;
                background: #8e44ad;
                position: absolute;
                bottom: 0;
                left: 0;
                -webkit-transition: all 0.125s ease;
                transition: all 0.125s ease;
            }
            input:focus,
            textarea:focus { outline: 0; }
            input:focus ~ span,
            textarea:focus ~ span {
                width: 70%;
                -webkit-transition: all 0.075s ease;
                transition: all 0.075s ease;
            }
            textarea {
                width: 100%;
                min-height: 15em;
            }
            .panel-default{
                background: rgba(255, 255, 255, 0.5);
            }
            .panel-default .panel-heading{
                background: rgba(255, 255, 255, 0.9);
            }
            .panel-default .panel-body{
                background: rgba(255, 255, 255, 0.0);
            }
             body{
                background-image: url('images/bm2.jpg');
            }
        </style>
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
    </head>
    <body>
       <cc:import url = "navbarhead.jsp"/>
        <!--        form start-->
        <br><BR><BR><BR><br><BR><BR><br><BR><BR><BR><br><BR><BR>
        <div class="container-fluid" style="margin-top: 100px;">
            <div class="row">
                <div class="col-sm-12">          
                    <div class="carousel-caption">
                        <div class="panel panel-default">
                            <div class="panel-heading" >
                                <ul class="nav nav-tabs" id="mytabs">
                                    <li class="active"><a href="#tab1" style="color:blue"><b>Customer Booking Details</b></a></li>
                                </ul>
                            </div>

                            <div class="panel-body">
                                <div class="tab-content clearfix">
                                    <div class="tab-pane fade in active" id="tab1">
                   
                                        <form style="color:red" action="usale.jsp">

                                            <div class="styled-input">
                                                <input type="text" required />
                                                <label>Customer Name</label>
                                            </div>
                                            <div class="styled-input">
                                                <input type="text" required />
                                                <label>Customer Email</label>
                                            </div>

                                                <div class="styled-input">
                                                <input type="text" required />
                                                <label>Customer Contact</label>
                                            </div>
                                                 <div class="styled-input">
                                                <input type="text" id="mycr" required onchange="myfunc()"/>
                                                <label>Number of passenger</label>
                                                
                                                <script>
                                                    function myfunc() {
  // get the reference for the body
  var sr=document.getElementById("mycr").value;
  var body = document.getElementsByTagName("body")[0];
 
  // creates a <table> element and a <tbody> element
  var tbl = document.createElement("table");
  var tblBody = document.createElement("tbody");
    
  // creating all cells
  for (var i = 0; i < sr; i++) {
    // creates a table row
    var row = document.createElement("tr");
 
    for (var j = 0; j < 2; j++) {
      // Create a <td> element and a text node, make the text
      // node the contents of the <td>, and put the <td> at
      // the end of the table row
      var cell = document.createElement("td");
      
var cellText = document.createElement("INPUT");
    cellText.setAttribute("type", "text");
      cell.appendChild(cellText);
      row.appendChild(cell);
    }
 
    // add the row to the end of the table body
    tblBody.appendChild(row);
  }
 
  // put the <tbody> in the <table>
  tbl.appendChild(tblBody);
  // appends <table> into <body>
  body.appendChild(tbl);
  // sets the border attribute of tbl to 2;
  tbl.setAttribute("border", "2");
}
                                                    </script>
                                            </div>
                                                
                                                   <div class="styled-input">
                                                <input type="plain" required list="sc" name="flightState" id="select1"/>
                                                <label>Select Class</label>
                                                <span><datalist id="sc">
                                                        <option value="Economic Class"></option>
                                                        <option value="Business Class">
                                                    </datalist></span> </div>
                                             <div>
                                                 <br>
                                                 <div class="styled-input">
                                                    <a class="btn-primary btn-block btn-sm" data-toggle="modal" data-target="#myModal">Select Seat</a></div>
                                    </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
            
             <!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <b class="modal-title" style="color:#1C2C64;">Please Select Your Seats</b>
        </div>
        <div class="modal-body">
    <div id="holder"> 
        <ul  id="place">
        </ul>    
    </div>
    <div style="float:left;"> 
    <ul id="seatDescription">
        <li style="background:url('images/available_seat_img.gif') no-repeat scroll 0 0 transparent;">Available Seat</li>
        <li style="background:url('images/booked_seat_img.gif') no-repeat scroll 0 0 transparent;">Booked Seat</li>
        <li style="background:url('images/selected_seat_img.gif') no-repeat scroll 0 0 transparent;">Selected Seat</li>
    </ul>
    </div>
        <div style="clear:both;width:100%">
        <input type="button" id="btnShowNew" value="Show Selected Seats" />
        <input type="button" id="btnShow" value="Show All" />           
        </div>
        </div>
          <script>
var settings = {
               rows: 5,
               cols: 15,
               rowCssPrefix: 'row-',
               colCssPrefix: 'col-',
               seatWidth: 35,
               seatHeight: 35,
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
                                  '<a title="' + seatNo + '">' + seatNo + '</a>' +
                                  '</li>');
                    }
                }
                $('#place').html(str.join(''));
            };
            //case I: Show from starting
            //init();
 
            //Case II: If already booked
            var bookedSeats = [5, 10, 25];
            init(bookedSeats);
            
            $('.' + settings.seatCss).click(function () {
if ($(this).hasClass(settings.selectedSeatCss)){
    alert('This seat is already reserved');
}
else{
    $(this).toggleClass(settings.selectingSeatCss);
    }
});
 
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
        str.push(item);                   
    });
    alert(str.join(','));
})


          </script>
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>
  </div>
  

    </body>
</html>
