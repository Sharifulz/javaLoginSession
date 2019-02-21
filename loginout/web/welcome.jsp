<%-- 
    Document   : welcome
    Created on : Feb 20, 2019, 9:30:56 PM
    Author     : Shaariful
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>JavaScript Validation</title>
        <link rel="shortcut icon" type="image/png" href="img/check.png">
        <link rel="stylesheet" href="css/bootstrap.css">
        <link rel="stylesheet" href="css/font-awesome.min.css">
        <script src="js/jquery-3.3.1.min.js"></script>
        <script src="js/bootstrap.js"></script>
        <script src="js/bootbox.min.js"></script>
        <script type="text/javascript" src="js/myform.js"></script>
                  <link rel="stylesheet" href="css/sweetalert.css">
        <script type="text/javascript" src="js/sweetalert.js"></script>
         <script type="text/javascript">
            $( document ).ready(function() {
   swal("Logged In!", "Welcome To Admin Page!", "success");
});
              
            
        </script> 
    </head>
    <body>

        <%
            if (session.getAttribute("username") == null) {
                response.sendRedirect("login.jsp");
            }
        %>
        <br>
        <br>
        <div class="container">
            <div class="row">
                <div class="col-md-2"></div>
                <div class="col-md-8">
                    <h1>Successfully Logges In</h1> 
                    <h2 class="text-primary"> Welcome ${username}</h2> 

                </div>
                <div class="col-md-2">
                    <form action="logout" >
                        <input type="submit" value="LOG OUT" class="btn btn-danger">
                    </form>
                </div>
            </div>
        </div>
                    <hr>


    </body>
</html>
