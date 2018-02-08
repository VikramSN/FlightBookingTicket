<%-- 
    Document   : Contact_Us
    Created on : 27 Dec, 2017, 3:09:53 PM
    Author     : Bharti Pant
--%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "cc" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact Page</title>
        
    </head>
    <body>
        <cc:import url = "navbarhead.jsp"/>
        <div class="container" id="maincontainer12" style="border:2px solid white">
            <center><h2 style="color:white; border:1px solid white">Contact Us</h2></center><br>
      <div class="container">
  <div class="row">
    <div class="col-sm-12">  
        <center><form action="ContactSuccess.jsp" method="Post">
        <input type="text" placeholder="Name" class="form-control"  name="name" required style="color:black"/><br>
        <input type="email" placeholder="Email" class="form-control" name="email" required style="color:black"  /><br>
        <input type="text" placeholder="Contact no" class="form-control" name="contact" required style="color:black" maxlength="
               10"/><br>
        <input type="text" placeholder="Subject" class="form-control" name="subject" required style="color:black"/><br>
        <textarea rows="6" cols="1" placeholder=" Enter Message" class="form-control" name="msg" required style="color:black; width: 565px;"></textarea><br>
        <input type="submit" value="Send Message" class="btn btn-success"/><br><br>
           </form></center>
    </div>
  </div>
</div>
        </div>
        <br><br><br><br><br><br><br><br>

                <cc:import url = "footer.jsp"/>
    </body>
</html>
