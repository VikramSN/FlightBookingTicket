<%-- 
    Document   : ContactSuccess
    Created on : Jan 27, 2018, 5:15:20 PM
    Author     : MRuser
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="cc" scope="page" class="org.register.ContactUs" />
        <jsp:setProperty name="cc" property="name" value="" />
        <jsp:setProperty name="cc" property="contact" value="" />
        <jsp:setProperty name="cc" property="email" value="" />
        <jsp:setProperty name="cc" property="subject" value="" />
        <jsp:setProperty name="cc" property="msg" value="" />
        
        <% response.sendRedirect("Contact_Us.jsp"); %>
        
    </body>
</html>
