<?php
/*echo <<<_END
<script>
history.go(-1);
</script>
_END;*/



if (isset($_COOKIE['login']))  echo '<script>location.href="admin.php";</script>';
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
        <input id="login" type="text" class="form-control" placeholder="Пароль" required autofocus name="login"><br>
        <input id="password" type="password" class="form-control" placeholder="Логин" required name="password"><br>
       <label id="par"></label>
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