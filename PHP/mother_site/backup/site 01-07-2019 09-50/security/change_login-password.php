<?php

if(isset($_COOKIE['login']))$login=$_COOKIE['login'];

echo<<<_END
<html>
<head>
<meta http-equiv='Content-Type' content='text/html charset=utf8'>
<meta http-equiv='Content-Language' content='ru'>
<meta http-equiv='pragma' content='no-cache'>
<meta http-equiv='Expires' content='0'>
<meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <meta name='description' content=''>
    <meta name='author' content=''>
    <link rel='shortcut icon' href='../../assets/ico/favicon.ico'>

    <title>Сменить логин/пароль</title>

    <!-- Bootstrap core CSS -->
    <link href='css/bootstrap.min.css' rel='stylesheet'>

    <!-- Custom styles for this template -->
    <link href='signin.css' rel='stylesheet'>

    <!-- Just for debugging purposes. Don't actually copy this line! -->
    <!--[if lt IE 9]><script src='../../assets/js/ie8-responsive-file-warning.js'></script><![endif]-->

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src='https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js'></script>
      <script src='https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js'></script>
    <![endif]-->

</head>

<body>
    
   <div class='container' align='center'>
       <h1>Смена логина/пароля</h1>
<form action='change_login-password2.php' method='POST'>



    <h1>Текущий логин:$login</h1>
<h1>Примечание после смены логина/пароля нужно будет выполнить повторный вход</h1><br><br>
    
<input type='text' name='login' class='form-control' placeholder=' Новый Логин' size='32' maxlength='32'  required  >

    <br><br>
    
<input type='text' name='password' class='form-control' placeholder='Новый пароль' size='32' maxlength='32'  required  >
    <br><br>
    <input type='text' name='password2' class='form-control' placeholder='Повторите пароль' size='32' maxlength='32'  required  >

<br><br>

<button id='change' class='btn btn-lg btn-primary btn-block'>
Изменить
</button>



</form>
     

    </div>
    


</body>

</html>
_END;



?>