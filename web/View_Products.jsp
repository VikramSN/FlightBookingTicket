<%-- 
    Document   : View_Product
    Created on : 6 Jan, 2018, 6:44:25 PM
    Author     : MD. SALMAN
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "cc" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="flightupload.flightgettersetter"%>
<%@page import="flightupload.flightinterImpl"%>
<%@page import="flightupload.flightinterface"%>
<%@page import="java.util.ArrayList"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Products Page</title>
    </head>
    <body>
         <cc:import url = "adminnavbar.jsp"/>
          <%
            flightinterImpl impl = new flightinterImpl();
            ArrayList list = (ArrayList) impl.getcar_info();
        %>
        
 <c:set var="value" value="<%=list%>" />
<h2 style="margin: auto; width: 80%; text-align: center; color:#fff">Runways Details</h2><br>
        <div class="container" style="width: auto">
        <table class="table table-bordered table-inverse" style="background-color: #000; opacity: 0.7; color: #fff">
            <thead>
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
                    <th>Delete Runways</th>
                    <th>Update Runways</th>
                </tr>
            </thead>

            <tbody>

                 <c:forEach var="ff" items="${value}" >                   
                    <tr bgcolor="white" style="color:black; ">


                    <tr>
                        <td scope="row">${ff.getId()}</td>
        <td style="width: 20%;"><img src="${ff.getFlightRunway()}" class="img-responsive" /></td>
                        <td>${ff.getFlightDuration()}</td>
                        <td>${ff.getFlightName()}</td>
                        <td>${ff.getFlightNumber()}</td>
                        <td>${ff.getFlightBTP()}</td>
                        <td>${ff.getFlightState()}</td>
                        <td>${ff.getFlightFrom()}</td>
                        <td>${ff.getFlightTo()}</td>
                        <td>${ff.getFlightDistance()}</td>
                        <td>${ff.getFlightETP()}</td>
                        <td>rows=${ff.getFlightDate()} cols=${ff.getFlightSeatRows()}</td>
                        <td>${ff.getFlightSeatCols()}</td>
                        <td>${ff.getFlightDepature()}</td>
                        <td>${ff.getFlightArrival()}</td>
                        <th><center><a href="DeleteFromDBP?id=${a.getId()}" class="btn btn-danger">Delete</a></center></th>
                        <th><center><a href="UpDate.jsp?id=${a.getId()}" class="btn btn-success">Update</a></center></th>

                    </tr>
                </c:forEach>

                </tr>
            </tbody>
        </table>
            </div>
    </body>
</html>
