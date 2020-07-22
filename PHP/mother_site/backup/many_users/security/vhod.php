<?php
/*echo <<<_END
<script>
history.go(-1);
</script>
_END;*/

require "connection.php";

$prov=0;

if (isset($_COOKIE['code_auth']))  
{
$code_auth=$_COOKIE['code_auth'];
echo $code_auth;
$conn = new mysqli($host, $user, $password, $database);
 if ($conn->connect_error) die($conn->connect_error);

$query ="SELECT code_auth FROM users WHERE code_auth="."'$code_auth'";
//echo $query;


$result = $conn->query($query);

if (!$result) die ($conn-> error);

$rows = $result->num_rows;
//echo $rows;
 for ($j = 0 ; $j < $rows ; ++$j)
 {
 $result->data_seek($j);
 $row = $result->fetch_array(MYSQLI_ASSOC);
if($code_auth==$row['code_auth']) 
{
$prov=1;
}
}
if($prov==1)echo '<script>location.href="admin.php";</script>';

if($prov==0)

echo<<<_END
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
 <meta http-equiv="pragma" content="no-cache">
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




}
else
{
echo<<<_END
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
 <meta http-equiv="pragma" content="no-cache">
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
}
?>