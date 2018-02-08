<%-- 
    Document   : View_Reports
    Created on : Jan 30, 2018, 12:30:41 PM
    Author     : MRuser
--%>
<%@page import="java.util.List"%>
<%@page import="profiles.Profiles"%>
<%@page import="profiles.ProfileDaoIMPl"%> 
<%@page import="profiles.ProfileDAO"%>

<%@page import="java.util.ArrayList"%>
<%@page import="runwayupload.runwaygettersetter"%>
<%@page import="runwayupload.runwayinterImpl"%>
<%@page import="runwayupload.runwayinterface"%>

<%@page import="flightupload.flightgettersetter"%>
<%@page import="flightupload.flightinterImpl"%>
<%@page import="flightupload.flightinterface"%>

<%@page import="bookingdone.bookinggettersetter"%>
<%@page import="bookingdone.bookinginterImpl"%>
<%@page import="bookingdone.bookinginterface"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "cc" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reports Page</title>
         <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jspdf/1.3.4/jspdf.debug.js"></script>
<script type="text/javascript" src="https://canvasjs.com/assets/script/canvasjs.min.js"> </script>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
        <script type="text/javascript">
        var
    form,
 a4 = [595.28,841.89]; // for a4 size paper width and height
$(document).ready(function () {
    $(".create_pdf").on("click", function (e) {
        $('body').scrollTop(0);
        var selector = $(e.target).attr('myprint');
        createPDF(selector);
    });
});

function createPDF(selector) {
    form = $(selector);
    getCanvas().then(function (canvas) {
        var cache_width = form.width()

        var img = canvas.toDataURL("image/png"),
         doc = new jsPDF({
             unit: 'px',
             format: 'a4'
         });
        doc.addImage(img, 'JPEG', 20, 20);
        doc.save('PA-Reports.pdf');
        form.width(cache_width);
    });
}

// create canvas object
function getCanvas() {

    form.width((a4[0] * 1.33333) - 80).css('max-width', 'none');
    return html2canvas(form, {
        imageTimeout: 2000,
        removeContainer: true
    });
}
</script>

<script type="text/javascript">
        var
    form,
 a4 = [595.28,841.89]; // for a4 size paper width and height
$(document).ready(function () {
    $(".create_pdf2").on("click", function (e) {
        $('body').scrollTop(0);
        var selector = $(e.target).attr('myprint2');
        createPDF(selector);
    });
});

function createPDF2(selector) {
    form = $(selector);
    getCanvas().then(function (canvas) {
        var cache_width = form.width()

        var img = canvas.toDataURL("image/png"),
         doc = new jsPDF({
             unit: 'px',
             format: 'a4'
         });
        doc.addImage(img, 'JPEG', 20, 20);
        doc.save('View-Runway-Data.pdf');
        form.width(cache_width);
    });
}

// create canvas object
function getCanvas() {

    form.width((a4[0] * 1.33333) - 80).css('max-width', 'none');
    return html2canvas(form, {
        imageTimeout: 2000,
        removeContainer: true
    });
}
</script>
<script type="text/javascript">
        var
    form,
 a4 = [595.28,841.89]; // for a4 size paper width and height
$(document).ready(function () {
    $(".create_pdf3").on("click", function (e) {
        $('body').scrollTop(0);
        var selector = $(e.target).attr('myprint3');
        createPDF(selector);
    });
});

function createPDF3(selector) {
    form = $(selector);
    getCanvas().then(function (canvas) {
        var cache_width = form.width()

        var img = canvas.toDataURL("image/png"),
         doc = new jsPDF({
             unit: 'px',
             format: 'a4'
         });
        doc.addImage(img, 'JPEG', 20, 20);
        doc.save('View-Flight-Data.pdf');
        form.width(cache_width);
    });
}

// create canvas object
function getCanvas() {

    form.width((a4[0] * 1.33333) - 80).css('max-width', 'none');
    return html2canvas(form, {
        imageTimeout: 2000,
        removeContainer: true
    });
}
</script>

<script type="text/javascript">
        var
    form,
 a4 = [595.28,841.89]; // for a4 size paper width and height
$(document).ready(function () {
    $(".create_pdf4").on("click", function (e) {
        $('body').scrollTop(0);
        var selector = $(e.target).attr('myprint4');
        createPDF(selector);
    });
});

function createPDF4(selector) {
    form = $(selector);
    getCanvas().then(function (canvas) {
        var cache_width = form.width()

        var img = canvas.toDataURL("image/png"),
         doc = new jsPDF({
             unit: 'px',
             format: 'a4'
         });
        doc.addImage(img, 'JPEG', 20, 20);
        doc.save('View-Ticket-Data.pdf');
        form.width(cache_width);
    });
}

// create canvas object
function getCanvas() {

    form.width((a4[0] * 1.33333) - 80).css('max-width', 'none');
    return html2canvas(form, {
        imageTimeout: 2000,
        removeContainer: true
    });
}
</script>
 <style>  
        table {  
            font-family: arial, sans-serif;  
            border-collapse: collapse;  
            width: 100%;  
        }  
  
        td, th {  
            border: 1px solid #dddddd;  
            text-align: left;  
            padding: 8px;  
        }  
  
        tr:nth-child(even) {  
            background-color: #dddddd;  
        }  
    </style>  
    </head>
      <%
        ProfileDAO pdao = new ProfileDaoIMPl();

        List<Profiles> list = pdao.getProfiles();

        request.setAttribute("products", list);

    %>
    
         <%
            runwayinterImpl impl = new runwayinterImpl();
            ArrayList list2 = (ArrayList) impl.getcar_info();
        %>
        
        <%
            flightinterImpl impl3 = new flightinterImpl();
            ArrayList list3 = (ArrayList) impl3.getcar_info();
        %>
        
        <%
            bookinginterImpl impl4 = new bookinginterImpl();
            ArrayList list4 = (ArrayList) impl4.getbooking_info();
        %>
    <body bgcolor="#34495E">
<cc:import url = "adminnavbar.jsp"/>

<!-- =======================user data==========================-->

        <div id="container">
        <table class="table table-bordered table-inverse" style="background-color: #fff; opacity: 0.7; font-size: 12px; color: #000">
            <thead>
            <td colspan="3" style="font-size: 16px;">View Profiles</td>
            <td><button class="btn-success create_pdf" onclick="createPDFClick();" myprint="#container" id="btn">Download</button></td>
                <tr>
                    <th>ID</th>
                    <th>User Name</th>
                    <th>User Email</th>
                    <th>User Contact</th>
                   </tr>
            </thead>

            <tbody>

                <c:forEach items="${products}" var="x">                    
                    <tr bgcolor="white" style="color:black; ">


                    <tr>
                        <td scope="row">${x.getId()}</td>
                        <td>${x.getName()}</td>
                        <td>${x.getEmail()}</td>
                        <td>${x.getContact()}</td>
                    </tr>
                </c:forEach>

                </tr>
            </tbody>
        </table>
            </div>
                        <!-- =======================user data end==========================-->
                        
                        <hr><br>
                         <c:set var="value" value="<%=list2%>" />
        <div id="containerr">
        <table class="table table-bordered table-inverse" style="background-color: #fff; opacity: 0.9; font-size: 12px; color: #000">
            <thead>
                <td colspan="4" style="font-size: 16px;">Runways Details</td>
                <td><button class="btn-success create_pdf2" onclick="createPDFClick();" myprint2="#containerr" id="btn2">Download</button></td>
                <tr>
                    <th>ID</th>
                    <th>Runway Image</th>
                    <th>Runway Name</th>
                    <th>Runway State</th>
                    <th>Runway Date</th>
                    
                </tr>
            </thead>

            <tbody>

                 <c:forEach var="a" items="${value}" >                   
                    <tr bgcolor="white" style="color:black; ">


                    <tr>
                        <td scope="row">${a.getId()}</td>
        <td style="width: 20%;"><img src="${a.getRunwayImage()}" class="img-responsive" /></td>
                        <td>${a.getRunwayName()}</td>
                        <td>${a.getRunwayState()}</td>
                        <td>${a.getRunwayDate()}</td>
                    
                    </tr>
                </c:forEach>

                </tr>
            </tbody>
        </table>
            </div>
        
        <hr><br>
        
        
        <c:set var="value" value="<%=list3%>" />
        <div id="containerrr" class="container" style="width: auto">
        <table class="table table-bordered table-inverse" style="background-color: #fff; opacity: 0.9; font-size: 12px; color: #000">
            <thead>
                <td colspan="14" style="font-size: 16px;">Flights Details</td>
                <td><button class="btn-success create_pdf3" onclick="createPDFClick();" myprint3="#containerrr" id="btn3">Download</button></td>
                <tr>
                    <th>ID</th>
                    <th>Flight Image</th>
                    <th>Flight Runway</th>
                    <th>Flight Name</th>
                    <th>Runway State</th>
                    <th>Flight Date</th>
                    <th>Flight From</th>
                    <th>Flight To</th>
                    <th>Flight Distance</th>
                    <th>Flight Economic price</th>
                    <th>Flight Business Price</th>
                    <th>Flight Seats Available</th>
                    <th>Flight Depature</th>
                    <th>Flight Arrival</th>
                    <th>Flight Duration</th>
                    
                </tr>
            </thead>

            <tbody>

                 <c:forEach var="ff" items="${value}" >                   
                    <tr bgcolor="white" style="color:black; ">


                    <tr>
                        <td scope="row">${ff.getId()}</td>
        <td style="width: 20%;"><img src="${ff.getFlightImage()}" class="img-responsive" /></td>
                        <td>${ff.getFlightRunway()}</td>
                        <td>${ff.getFlightName()}</td>
                        <td>${ff.getFlightState()}</td>
                        <td>${ff.getFlightDate()}</td>
                        <td>${ff.getFlightFrom()}</td>
                        <td>${ff.getFlightTo()}</td>
                        <td>${ff.getFlightDistance()}</td>
                        <td>${ff.getFlightETP()}</td>
                        <td>${ff.getFlightBTP()}</td>
                        <td>rows=${ff.getFlightSeatRows()} cols=${ff.getFlightSeatCols()}</td>
                        <td>${ff.getFlightDepature()}</td>
                        <td>${ff.getFlightArrival()}</td>
                        <td>${ff.getFlightDuration()}</td>
                     
                    </tr>
                </c:forEach>

                </tr>
            </tbody>
        </table>
            </div>
        
        <hr><br>
        
         <c:set var="value" value="<%=list4%>" />
        <div class="container" id="containerrrr">
            <table class="table table-bordered table-inverse" style="background-color: #fff; opacity: 0.7; font-size: 12px; color: #000">
                <thead>
                    <td colspan="7" id="containerrrr" style="font-size: 16px;">Ticket Details</td>
                    <td><button class="btn-success create_pdf4" onclick="createPDFClick();" myprint4="#containerrrr" id="btn4">Download</button></td>
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Email</th>
                        <th>Contact</th>
                        <th>No. of Passenger</th>
                        <th>Selected Class</th>
                        <th>No. of Total Price</th>
                        <th>No. of Total Seat booked</th>
                        </tr>
                </thead>

                <tbody>

                    <c:forEach var="a" items="${value}" >                   
                        <tr bgcolor="white" style="color:black; ">


                        <tr>
                            <td scope="row">${a.getId()}</td>
                            <td>${a.getName()}</td>
                            <td>${a.getEmail()}</td>
                            <td>${a.getContact()}</td>
                            <td>${a.getNop()}</td>
                            <td>${a.getSelectclass()}</td>
                            <td>${a.getTotalprice()}</td>
                            <td>${a.getTotalseat()}</td>
                           </tr>
                </c:forEach>

                </tr>
                </tbody>
            </table>
        </div>
    </body>
</html>
