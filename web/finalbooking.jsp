<%-- 
    Document   : finalbooking
    Created on : Jan 23, 2018, 2:05:21 PM
    Author     : MRuser
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Final Booking Page</title>
    </head>
    <body>
          <jsp:useBean id="fb" scope="page" class="bookingdone.FinalBooking" />
        <jsp:setProperty name="fb" property="name" />
        <jsp:setProperty name="fb" property="email" />
        <jsp:setProperty name="fb" property="contact" />
        <jsp:setProperty name="fb" property="nop" />
        <jsp:setProperty name="fb" property="selectclass" />
        <jsp:setProperty name="fb" property="totalprice" />
        <jsp:setProperty name="fb" property="totalseat" />
         <script>
            var a=fb.store();
            if(a === 1){
            alert("Data Store Successfully");
        }else {
            alert("Data Failed to store");
        }
            
        </script>
        <%        
        int a=fb.store();
        if(a==1){
            //out.print("Value Stored");
        }else {
            //out.print("Value not Stored");
        }
        %>

        <%  response.sendRedirect("View_Flights.jsp"); %>
        

    </body>
</html>
