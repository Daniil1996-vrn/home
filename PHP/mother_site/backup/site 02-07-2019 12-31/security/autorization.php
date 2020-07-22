<?php

/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
require "clear_quotes.php";
$prov=0;

$host = 'localhost'; 
$database = 'mother_site'; 
$user = 'root'; 
$password = 'usbw'; 

$conn = new mysqli($host, $user, $password, $database);
 if ($conn->connect_error) die($conn->connect_error);


$login=clear_quotes($_POST["login"]);
$password=clear_quotes($_POST["password"]);

$password2=sha1($password);



  
$query ='SELECT login,password FROM users WHERE login='."'". $login."' AND password='". $password2."'";
//echo $query;

//$query2 ="SELECT password FROM users WHERE password=$password2";

$result = $conn->query($query);

if (!$result) die ($conn-> error);

$rows = $result->num_rows;
//echo $rows;
 for ($j = 0 ; $j < $rows ; ++$j)
 {
 $result->data_seek($j);
 $row = $result->fetch_array(MYSQLI_ASSOC);
if($login==$row['login'] &&$password2==$row['password'] ) 
{
$prov=1;

}


 }

$conn->close();
if($prov==1) 
{ echo '<script>location.href="admin.php";</script>';
setcookie("login",$login,2147483647);
}
 if($prov==0) echo <<<_END
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="shortcut icon" href="../../assets/ico/favicon.ico">
 <script src="js/jquery.js"></script>
    <title>Вход</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="signin.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy this line! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>

    <div class="container" align="center">

      <form class="form-signin" role="form" action="autorization.php"   method="post">
        <h2 class="form-signin-heading" align="center">Введите логин и пароль</h2><br>
        <input id="login" type="text" class="form-control" placeholder="Логин" required autofocus name="login"><br>
        <input id="password" type="password" class="form-control" placeholder="Пароль" required name="password"><br>
        <label id="par" style="color: red">Неверный логин и/или пароль</label>
        <button id="send_parametres" class="btn btn-lg btn-primary btn-block" type="submit">Войти</button>
          
          
           
      </form>

    </div> <!-- /container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
  </body>
</html>
_END;


 

?>