<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>JSP Form Validation</title>
        <link rel="shortcut icon" type="image/png" href="img/check.png">
        <link rel="stylesheet" href="css/bootstrap.css">
        <link rel="stylesheet" href="css/font-awesome.min.css">
      
        <script type="text/javascript" src="sweetalert.js"></script>
        <script src="js/jquery-3.3.1.min.js"></script>
        <script src="js/bootstrap.js"></script>
        <script src="js/bootbox.min.js"></script>
        <script type="text/javascript" src="js/myform.js"></script>
          <link rel="stylesheet" href="css/sweetalert.css">
        <script type="text/javascript" src="js/sweetalert.js"></script>
            
    </head>

    <body>
        <input type="submit" name="submit" value="WELCOME" class="btn btn-primary btn-block" onclick="m1()" />

        <br>
        <br>
        <div class="row">
            <div class="col-md-4"></div>
            <div class="col-md-4">
                <div class="card" style="width: 18rem;">
                    <img src="img/img.png" class="card-img-top" alt="" style="margin-top: 10px">
                    <div class="card-body">
                        <a href="#" class="btn btn-primary btn-block" data-target="#mymodal" data-toggle="modal">Log In</a>
                    </div>
                </div>
            </div>
            <div class="col-md-4"></div>
        </div>
        <hr>
        <hr>
        <!-- **************************MODAL STARTS*************************-->
        <div class="modal" id="mymodal">
            <div class="modal-dialog modal-dialog-centered">
                <div class="modal-content">
                    <div class="modal-header">
                        <h3 class="text-primary" style="margin-left: 180px;">Log In</h3>
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                    </div>
                    <div class="modal-body">
                        <!--FORMS*******************-->
                        <form action="loggin">
                            <div class="form-group">
                                <input type="text" name="user" class="form-control" id="users" placeholder="Enter User">
                            </div>
                            <div class="form-group">
                                <input type="password" name="pass" class="form-control" id="passWord" placeholder="Password">
                            </div>
                            <input type="submit" name="submit" value="Submit" class="btn btn-primary btn-block" onclick="invalid()"/>
                            <input type="reset" name="reset" value="Clear" class="btn btn-danger btn-block">
                        </form>
                    </div>
                </div>
            </div>
        </div>
        
        <script type="text/javascript">
            function m1() {
               swal("Log In Please!", "Log In Go Admin Page!", "warning");
            }
            
            function invalid() {
    var usern = document.getElementById("users").value;
    var password = document.getElementById("passWord").value;
    var validUser = "admin";
    var validPass = "admin";
    if (usern != validUser && password != validPass) {
       alert("Access Denied !");
    }
}
            
        </script> 
    </body>
</html>