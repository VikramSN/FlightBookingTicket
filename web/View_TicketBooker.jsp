<%-- 
    Document   : View_TicketBooker
    Created on : Jan 24, 2018, 4:58:20 PM
    Author     : MRuser
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "cc" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bookingdone.bookinggettersetter"%>
<%@page import="bookingdone.bookinginterImpl"%>
<%@page import="bookingdone.bookinginterface"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Tickets</title>
    </head>
    <body>
        <cc:import url = "adminnavbar.jsp"/>

        <%
            bookinginterImpl impl = new bookinginterImpl();
            ArrayList list = (ArrayList) impl.getbooking_info();
        %>

        <c:set var="value" value="<%=list%>" />
        <h2 style="margin: auto; width: 80%; text-align: center; color:#fff">Ticket Details</h2><br>
        <div class="container">
            <table class="table table-bordered table-inverse" style="background-color: #000; opacity: 0.7; color: #fff">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Email</th>
                        <th>Contact</th>
                        <th>No. of Passenger</th>
                        <th>Selected Class</th>
                        <th>No. of Total Price</th>
                        <th>No. of Total Seat booked</th>
                        <th>Delete Ticket</th>
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
                            <th><center><a href="DeleteFromDBT?id=${a.getId()}" class="btn btn-danger">Delete</a></center></th>
                    
                    </tr>
                </c:forEach>

                </tr>
                </tbody>
            </table>
        </div>
    </body>
</html>
