<%-- 
    Document   : View_Runways
    Created on : 4 Jan, 2018, 4:09:26 PM
    Author     : MD. SALMAN
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "cc" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="runwayupload.runwaygettersetter"%>
<%@page import="runwayupload.runwayinterImpl"%>
<%@page import="runwayupload.runwayinterface"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Runway Page</title>
    </head>
    <body>
        <cc:import url = "adminnavbar.jsp"/>
        
         <%
            runwayinterImpl impl = new runwayinterImpl();
            ArrayList list = (ArrayList) impl.getcar_info();
        %>
        
 <c:set var="value" value="<%=list%>" />
<h2 style="margin: auto; width: 80%; text-align: center; color:#fff">Runways Details</h2><br>
        <div class="container">
        <table class="table table-bordered table-inverse" style="background-color: #000; opacity: 0.7; color: #fff">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Runway Image</th>
                    <th>Runway Name</th>
                    <th>Runway State</th>
                    <th>Runway Date</th>
                    <th>Delete Runways</th>
                    <th>Update Runways</th>
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
