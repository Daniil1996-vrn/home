<?php

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
echo<<<_END
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="Expires" content="0">
    <link rel="shortcut icon" href="../../assets/ico/favicon.ico">

    <title>Панель администратора</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="dashboard.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy this line! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>

    

    <div class="container-fluid">
      <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
          <ul class="nav nav-sidebar">
            <li class="active"><a href="#">Меню</a></li>
                <li><a href="#"></a></li>
            <li><a href="#">Открыть сайт </a></li>
            <li><a href="add_file.html" target="frame1">Добавить статью</a></li>
        
          </ul>
          <ul class="nav nav-sidebar">
            <li><a href="change_login-password.php" target="frame1">Сменить логин/пароль</a></li>
            <li><a href="vivod_statey.php" target="frame1">Опубликованные статьи</a></li>
            <li><a href="exit.php">Выйти</a></li>
       
          </ul>
        
        </div>
          
        <div class="col-sm-9  col-md-10 main">
      <div class="embed-responsive embed-responsive-4by3">
  <iframe name="frame1" src="add_file.html" class="embed-responsive-item"  width=100%></iframe>
</div>

        </div>
      </div>
    </div>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/docs.min.js"></script>
  </body>
</html>
_END;
}

 else echo '<script>location.href="vhod.php";</script>';

?>