<%-- 
    Document   : adminnavbar
    Created on : 28 Dec, 2017, 3:10:23 PM
    Author     : MD. SALMAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="js/sweetalert.min.js"></script>
        <link rel="stylesheet" href="css/sweetalert.css">  
        <style>

            body{

                background-image: url("images/backas.jpg");
            background-repeat: no-repeat;
            }

            .navstyle {

                font-size: 10px;

            }
        </style>

    </head>
    <body>
      <!---- start navbar ------------------------------------ -->
        <nav class="navbar navbar-inverse navstyle" style=' background-color: #1C2C64; border: none'>
            <div class="container">
                <div class="navbar-header">
                    <img class="navbar-brand" src='images/webicon.png' />
                    <a class="navbar-brand" href="AdminHP.jsp">PhoenixAirways</a>
                </div>
                <ul class="nav navbar-nav ">
                    <li><a href="View_User.jsp"><b>VIEW USERS</b></a></li>      
                       <li><a href="Upload_Runways.jsp"><b>UPLOAD RUNWAY</b></a></li>
                    <li><a href="Upload_Products.jsp"><b>UPLOAD PRODUCTS</b></a></li>
              <li><a href="View_Runways.jsp"><b>VIEW RUNWAYS</b></a></li>
              <li><a href="View_Products.jsp"><b>VIEW PRODUCTS</b></a></li>
                    <li><a href="View_TicketBooker.jsp"><b>VIEW TICKET BOOKER</b></a></li>
                    <li><a href="View_Reports.jsp"><b>VIEW REPORT</b></a></li>
                </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="#"><b style="font-size: 14px">ADMIN</b></a></li>
                        <a href="HomePage.jsp"><button class="btn btn-danger navbar-btn">Logout</button></a>
    </ul>

            </div>
        </nav>
        <!---- stop navbar ------------------------------------ -->
        
    </body>
</html>
