<%-- 
    Document   : faqsuccess
    Created on : Jan 27, 2018, 4:17:07 PM
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
        <jsp:useBean id="fq" scope="page" class="org.register.Faqfinal" />
        <jsp:setProperty name="fq" property="qname" value="" />
        <jsp:setProperty name="fq" property="qemail" value="" />
        <jsp:setProperty name="fq" property="qmsg" value="" />
       
        
        <% response.sendRedirect("faq.jsp"); %>
    </body>
</html>
