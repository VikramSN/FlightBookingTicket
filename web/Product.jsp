<%-- 
    Document   : product.jsp
    Created on : 28 Dec, 2017, 2:07:58 PM
    Author     : MD. SALMAN
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.ArrayList"%>
<%@page import="runwayupload.runwaygettersetter"%>
<%@page import="runwayupload.runwayinterImpl"%>
<%@page import="runwayupload.runwayinterface"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "cc" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Product Page</title>
        <%
            runwayinterImpl impl = new runwayinterImpl();
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
                        <img src="${a.getRunwayImage()}" width="304px" height="320px"/> 
                        <div class="container">
                            <h5><b style="color:#1C2C64">${a.getRunwayName()}</b></h5>
                            <p class="title" style="color: black">${a.getRunwayDate()}<a href="View_Flights.jsp"><input style="margin-left: 150px" class ="btn btn-danger" data-toggle="modal" data-target="#myModal" type="button" value="View"></a></p> 

                        </div>
                    </div>
                </div>
            </c:forEach>


        </div>

        <cc:import url = "footer.jsp"/>
    </body>
</html>
