<%-- 
    Document   : View_User
    Created on : 28 Dec, 2017, 4:26:54 PM
    Author     : MD. SALMAN
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.List"%>
<%@page import="profiles.Profiles"%>
<%@page import="profiles.ProfileDaoIMPl"%> 
<%@page import="profiles.ProfileDAO"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "cc" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View-User Page</title>
    </head>
    <%
        ProfileDAO pdao = new ProfileDaoIMPl();

        List<Profiles> list = pdao.getProfiles();

        request.setAttribute("products", list);

    %>
    <body>
        <cc:import url = "adminnavbar.jsp"/>      

        <h1 style="margin: auto; width: 80%; text-align: center; color:#fff">View Profiles </h1><br>
        <div class="container">
        <table class="table table-bordered table-inverse" style="background-color: #000; opacity: 0.7; color: #fff">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>User Name</th>
                    <th>User Email</th>
                    <th>User Contact</th>
                    <th>Delete User</th>
                    <th>Update User</th>
                </tr>
            </thead>

            <tbody>

                <c:forEach items="${products}" var="x">                    
                    <tr bgcolor="white" style="color:black; ">


                    <tr>
                        <td scope="row">${x.getId()}</td>
                        <td>${x.getName()}</td>
                        <td>${x.getEmail()}</td>
                        <td>${x.getContact()}</td>
                        <th><center><a href="DeleteFromDB?id=${x.getId()}" class="btn btn-danger">Delete</a></center></th>
                        <th><center><a href="UpDate.jsp?id=${x.getId()}" class="btn btn-success">Update</a></center></th>

                    </tr>
                </c:forEach>

                </tr>
            </tbody>
        </table>
            </div>
    </body>
</html>
