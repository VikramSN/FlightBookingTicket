<%-- 
    Document   : faq
    Created on : Dec 28, 2017, 3:48:22 PM
    Author     : MRuser
--%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "ch" %>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile Page</title>
        
        <style>
            #maincontainer12{
                background-color: #000;
                opacity: 0.8;
                width: 70%;
                border: 1px solid;
                padding: 10px;
                box-shadow: 5px 10px #888888;

            }

        </style>

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
String sql ="SELECT * FROM register";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
                       String username = resultSet.getString("name");
                        if(username.equals(loge)){
%>
  <div class="container" id="maincontainer12">
     
            <div class="row">
                <div class="col-sm-6">
                    
 <form action="DoUpDate" method="post" style="margin: auto; width: 80%;">
             <center>
                            <b><h2 style="color: #fff; font-size:30px;">
                                    View Profile
                                </h2></b>
                        </center>
                        <hr class="colorgraph">
            <input type="hidden" name ="UpDate" value="${profile.getId()}">
            <label style= "color: #fff">Name</label><br>
            <input type="text" name ="UpDate" class="form-control" value="<%=resultSet.getString("name")%>" placeholder="username" style="width: 100%">
            <br>
            <label style= "color: #fff">Email</label><br>
            <input type="email" name="UpDate" class="form-control" value="<%=resultSet.getString("email")%>"  required style="width: 100%">
              <br>
              
<!--              <input type="password" name="UpDate" class="form-control" value="" placeholder="password">
             <br>-->
              <label style= "color: #fff">Contact</label><br>
              <input type="text" name="UpDate" class="form-control" value="<%=resultSet.getString("contact")%>" maxlength="10" style="width: 100%">
              <br>
              
<!--              <textarea  name="UpDate" class="form-control" value="" placeholder="address"></textarea>
              <br>
              -->
              <br>
              <input type="file" name="pic" accept="image/*" class="btn btn-primary" onchange="readURL(this);" style="width: 100%"><br><br>
              <input type="submit" value="Update" class="btn btn-danger" style="width: 100px;">
                        <hr class="colorgraph">
                        <script>
                            function readURL(input) {
        if (input.files && input.files[0]) {
            var reader = new FileReader();

            reader.onload = function (e) {
                $('#blah')
                    .attr('src', e.target.result)
                    .width(300)
                    .height(350);
            };

            reader.readAsDataURL(input.files[0]);
        }
    }
                            </script>
        </form>
                              </div>
              <div class="col-sm-6">
                  <img id="blah" src="#" style="margin-top: 80px;" alt="your image" />
              </div>
            </div>
        </div>

<%                        }
			 }
} catch (Exception e) {
e.printStackTrace();
}
%>
        

    </body>
</html>
