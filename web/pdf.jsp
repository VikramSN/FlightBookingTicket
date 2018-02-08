<%-- 
    Document   : pdf
    Created on : 28 Jan, 2018, 1:26:00 AM
    Author     : Neha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jspdf/1.3.4/jspdf.debug.js"></script>
<script type="text/javascript" src="https://canvasjs.com/assets/script/canvasjs.min.js"> </script>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
    <script type="text/javascript">
        var
    form,
 a4 = [595.28,841.89]; // for a4 size paper width and height
$(document).ready(function () {
    $(".create_pdff").on("click", function (e) {
        $('body').scrollTop(0);
        var selector = $(e.target).attr('myprintt');
        createPDF(selector);
    });
});

function createPDF(selector) {
    form = $(selector);
    getCanvas().then(function (canvas) {
        var cache_width = form.width()

        var img = canvas.toDataURL("image/png"),
         doc = new jsPDF({
             unit: 'px',
             format: 'a4'
         });
        doc.addImage(img, 'JPEG', 20, 20);
        doc.save('techumber-html-to-pdf.pdf');
        form.width(cache_width);
    });
}

// create canvas object
function getCanvas() {

    form.width((a4[0] * 1.33333) - 80).css('max-width', 'none');
    return html2canvas(form, {
        imageTimeout: 2000,
        removeContainer: false
    });
}
</script>

        <style>  
        table {  
            font-family: arial, sans-serif;  
            border-collapse: collapse;  
            width: 100%;  
        }  
  
        td, th {  
            border: 1px solid #dddddd;  
            text-align: left;  
            padding: 8px;  
        }  
  
        tr:nth-child(even) {  
            background-color: #dddddd;  
        }  
    </style>  

    </head>
    
    <body>
    <div id="container">

    <table>
    <thead>
      <tr>
        <th>Firstname</th>
        <th>Lastname</th>
        <th>Email</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>John</td>
        <td>Doe</td>
        <td>john@example.com</td>
      </tr>
      <tr>
        <td>Mary</td>
        <td>Moe</td>
        <td>mary@example.com</td>
      </tr>
      <tr>
        <td>July</td>
        <td>Dooley</td>
        <td>july@example.com</td>
      </tr>
    </tbody>
  </table>
</div>
        <br>
            <center><button class="create_pdff" myprintt="#container" id="btn">Download</button>


       </body>
</html>

