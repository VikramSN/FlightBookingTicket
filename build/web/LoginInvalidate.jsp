<%-- 
    Document   : LoginInvalid
    Created on : 28 Dec, 2017, 1:43:53 PM
    Author     : MD. SALMAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      <%session.invalidate();%>
<% HttpSession nsession = request.getSession(false);
if(nsession!=null) {
   String data=(String)session.getAttribute( "userdb" );
   out.println(data);
}
else
   response.sendRedirect("HomePage.jsp");
%>
    </body>
</html>
