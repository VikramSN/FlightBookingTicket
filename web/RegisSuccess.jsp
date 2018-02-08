<%-- 
    Document   : RegisSuccess
    Created on : 28 Dec, 2017, 12:55:51 PM
    Author     : MD. SALMAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <jsp:useBean id="rr" scope="page" class="org.register.Register" />
        <jsp:setProperty name="rr" property="name" />
        <jsp:setProperty name="rr" property="contact" />
        <jsp:setProperty name="rr" property="email" />
        <jsp:setProperty name="rr" property="pass" />
        <jsp:setProperty name="rr" property="repass" />
        
         <script>
            var a=rr.store();
            if(a === 1){
            alert("Registration Successfully");
        }else {
            alert("Registration Failed");
        }
            
        </script>
        <%        
        int a=rr.store();
        if(a==1){
            //out.print("Value Stored");
        }else {
            //out.print("Value not Stored");
        }
        %>
        
        <%  response.sendRedirect("HomePage.jsp"); %>

    </body>
</html>
