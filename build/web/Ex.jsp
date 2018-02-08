<%-- 
    Document   : Ex
    Created on : Jan 23, 2018, 3:54:06 PM
    Author     : MRuser
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>
      var counter = 1;
var limit = 3;
function addInput(divName){
     if (counter == limit)  {
          alert("You have reached the limit of adding " + counter + " inputs");
     }
     else {
          var newdiv = document.createElement('div');
          newdiv.innerHTML = "Entry " + (counter + 1) + " <br><input type='text' name='myInputs[]'>";
          document.getElementById(divName).appendChild(newdiv);
          counter++;
     }
}
            </script>
    </head>
    <body>
<form method="POST">
     <div id="dynamicInput">
         Entry 1<br><input type="text" name="myInputs[]" onchange="addInput('dynamicInput');">
     </div>

</form>
    </body>
</html>
