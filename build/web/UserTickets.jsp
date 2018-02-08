<%-- 
    Document   : UserTickets
    Created on : Jan 24, 2018, 5:16:41 PM
    Author     : MRuser
--%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "ch" %>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bookingdone.bookinggettersetter"%>
<%@page import="bookingdone.bookinginterImpl"%>
<%@page import="bookingdone.bookinginterface"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Your Ticktes Page</title>
    </head>
    <body>
         <ch:import url = "navbarhead.jsp"/>
          
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
String sql ="SELECT * FROM finalbook";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
                       String username = resultSet.getString("name");
                        if(username.equals(loge)){
%>
            
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

                        <tr bgcolor="white" style="color:white; ">


                        <tr>
                            <td scope="row"><%=resultSet.getString("id")%></td>
                            <td><%=resultSet.getString("name")%></td>
                            <td><%=resultSet.getString("email")%></td>
                            <td><%=resultSet.getString("contact")%></td>
                            <td><%=resultSet.getString("nop")%></td>
                            <td><%=resultSet.getString("selectclass")%></td>
                            <td><%=resultSet.getString("totalprice")%></td>
                            <td><%=resultSet.getString("totalseat")%></td>
                            <th><center><a href="DeleteFromDBP?id=${a.getId()}" class="btn btn-danger">Delete</a></center></th>
                   

                    </tr>
                    

                </tr>
                </tbody>
            </table>
        </div>

      
        
<%                        }
			 }
} catch (Exception e) {
e.printStackTrace();
}
%>
         
         
        <cc:import url = "footer.jsp"/>         
    </body>
</html>
