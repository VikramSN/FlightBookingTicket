<%-- 
    Document   : navbarhead
    Created on : 28 Dec, 2017, 2:18:56 PM
    Author     : MD. SALMAN
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="css/merastyle.css" />
        <script src="js/sweetalert.min.js"></script>
        <link rel="stylesheet" href="css/sweetalert.css">  
        <style>

          
            .navstyle {

                font-size: 10px;

            }
            body{
                background-image: url("images/backas.jpg");
                }
        </style>
        
        <script type="text/javascript">
  function checkForm(form)
  {
    if(form.pass.value != "" && form.pass.value == form.repass.value) {
      if(form.pass.value.length < 6) {
        swal(
      'Error!',
      'Password must contain at least six characters!',
      'error'
    )
        form.pass.focus();
        return false;
      }
      re = /[0-9]/;
      if(!re.test(form.pass.value)) {
           swal(
      'Error!',
      'Password must contain at least one number (0-9)!',
      'error'
  )
        form.pass.focus();
        return false;
      }
      re = /[a-z]/;
      if(!re.test(form.pass.value)) {
        swal(
      'Error!',
      'Password must contain at least one lowercase letter (a-z)!',
      'error'
    )
        form.pass.focus();
        return false;
      }
      re = /[A-Z]/;
      if(!re.test(form.pass.value)) {
        swal(
      'Error!',
      'Password must contain at least one uppercase letter (A-Z)!',
      'error'
    )
        form.pass.focus();
        return false;
      }
    } else {
      swal(
      'Error!',
      'Paassword not Match!',
      'error'
    )
      form.pass.focus();
      return false;
    }
    swal(
  'Success!',
  'Registration Successfully\nYour Password has sent on your Email-id.',
  'success'
)
    return true;
  }
</script>
    </head>
    <body>
        <!---- start navbar ------------------------------------ -->
        <nav class="navbar navbar-inverse" style=' background-color: #1C2C64; border: none'>
            <div class="container">
                <div class="navbar-header">
                    <img class="navbar-brand" src='images/webicon.png' />
                    <a class="navbar-brand" href="#">PhoenixAirways</a>
                </div>
                <ul class="nav navbar-nav navstyle">
                    <li><a href="HomePage.jsp"><b>HOME</b></a></li>      
                    <li><a href="Product.jsp"><b>PRODUCTS</b></a></li>
                    <li><a href="faq.jsp"><b>FAQ's</b></a></li>
                    <li><a href="Contact_Us.jsp"><b>CONTACT US</b></a></li>
                    <li><a href="About_us.jsp"><b>ABOUT US</b></a></li>
                </ul>


                <ul class="nav navbar-nav navbar-right">


                    <!-- User Login Form Started -->
                    <div id="id01" class="modal">

                        <form class="modal-content animate" action="logincheck.jsp">
                            <div class="imgcontainer">
                                <span onclick="document.getElementById('id01').style.display = 'none'" class="close" title="Close Modal">&times;</span>
                                <img src="images/myprofile.png" alt="Login Pic" class="avatar">
                            </div>

                            <!-- Login Form Started -->
                            <div class="container ">

                                <label><b>Email Id</b></label><br>
                                <input type="email" placeholder="Enter Email-Id" name="email" required><br><br>

                                <label><b>Password</b></label><br>
                                <input type="password" placeholder="Enter Password" name="pass" required><br><br>

                                <button type="submit" onclick="log(this.form)">Login</button><br><br>
                                <a href="#" onclick="document.getElementById('id02').style.display = 'block', document.getElementById('id01').style.display = 'none'" ><b>Click for Registration</b></a><br><br>
                                <input type="checkbox" checked="checked"> Remember me<br><br>
                            </div>

                            <div  style="background-color:#f1f1f1">
                                <button type="button" onclick="document.getElementById('id01').style.display = 'none'" class="cancelbtn">Cancel</button>
                                <span class="psw">Forgot <a href="#">password?</a></span>
                            </div>
                        </form>
                    </div>

                    <!--User Login Form End -->



                    <!--           User Logged UserName Button 
                    <li id="hi4"><a href="#" ><span class="glyphicon glyphicon-user"></span> Vikram Singh Negi</a></li>
                     User Logout Button 
                    <li id="hi5"><a href="#"><span class="glyphicon glyphicon-user"></span> Log Out</a></li>-->

                    <div id="id02" class="modal">


                        <!-- User Registration Form Started -->                    
                        <form class="modal-content animate" action="RegisSuccess.jsp"  method="POST" onsubmit="return checkForm(this)">
                            <div class="imgcontainer">
                                <span onclick="document.getElementById('id02').style.display = 'none'" class="close" title="Close Modal">&times;</span>

                            </div>
                            <div class="container">
                                <label><b>Name</b></label><br>
                                <input type="text" placeholder="Enter Name" name="name" required><br>

                                <label><b>Mobile</b></label><br>
                                <input type="text" placeholder="Enter Mobile Number" name="contact" onchange="CheckIndianNumber(this.value)"  required maxlength="10"><br>

                                <script>
                                    function CheckIndianNumber(IndianNumber)
                                    {
                                        var IndNum = /^([0|\+[0-9]{1,5})?([7-9][0-9]{9})$/;
                                        if (IndNum.test(IndianNumber))
                                        {
                                            swal(
                                                    'Success!',
                                                    'Valid Mobile Number',
                                                    'success'
                                                    )
                                        } else
                                        {
                                            swal(
                                                    'Error!',
                                                    'Mobile number is not valid!',
                                                    'error'
                                                    )
                                        }
                                    }
                                </script>


                                <label><b>Email</b></label><br>
                                <input type="email" placeholder="Enter Email" name="email" onchange="myFunction(this.value)" pattern="[a-z0-9._%+-]+@gmail\.com$"  id="emailid" required><br>

                                <script>
                                    function myFunction(val)
                                    {
                                        var email_id = document.getElementById("emailid").value;
                                        console.log(email_id);
                                        $.ajax({
                                            type: "post",
                                            url: "mailChecking",
                                            data: {email: email_id},
                                            success: function (data, textStatus, jqXHR) {
                                                var result = data;
                                                swal({
                                                    title: result,
                                                    width: 600,
                                                    padding: 100,
                                                })
                                            }
                                        });
                                    }

                                </script>   
                                <label><b>Password</b></label><br>
                                <input type="password" placeholder="Enter Password" name="pass" required id="pass" ><br>

                                <label><b>Repeat Password</b></label><br>
                                <input type="password" placeholder="Repeat Password" name="repass" id="repass" required ><br>

                                <div class="clearfix">
                                    <button type="submit" class="signupbtn" >Sign Up</button><br><br>
                                    <button type="button" onclick="document.getElementById('id02').style.display = 'none'" class="cancelbtn">Cancel</button>
                                    <a href="#" onclick="document.getElementById('id01').style.display = 'block', document.getElementById('id02').style.display = 'none'" ><b class="alrbtn">Already Register? Click for Login</b></a>      

                                </div>
                            </div>
                        </form>
                    </div>
                    <c:set var="income" scope="session" value="<%= request.getSession().getAttribute("userdb")%>"/>  
                    <c:if test="${income==null}">  
                        <!-- User Login Button -->
                        <li id="hi2"><a href="#" onclick="document.getElementById('id01').style.display = 'block'"><span class="glyphicon glyphicon-user navstyle"></span> Login</a></li>


                        <!-- User Registration Button -->
                        <li id="hi3"><a href="#" onclick="document.getElementById('id02').style.display = 'block'"><span class="glyphicon glyphicon-registration-mark navstyle"></span> Registration</a></li>
                        
                    </c:if>  
                    <c:if test="${income!=null}">  

                        <li class="dropdown">
                            <a class="dropdown-toggle" data-toggle="dropdown" href="#"><img src="images/profilepic.png"><b style="color:white"> <c:out value="${income}"/></b>
                                <span class="caret"></span></a>
                            <ul class="dropdown-menu navstyle">
                            <li><a href="View_Profile.jsp"><img src="images/user.png"><b> View Profile</b></a></li>
                        <li><a href="UserTickets.jsp"><img src="images/product.png"><b> View Tickets</b></a></li>
                                <li><a href="LoginInvalidate.jsp"><img src="images/logout.png"><b> Logout</b></a></li>
                            </ul>
                        </li>
                    </c:if>  


                </ul>
            </div>
        </nav>
        <!---- stop navbar ------------------------------------ -->
    </body>
</html>
