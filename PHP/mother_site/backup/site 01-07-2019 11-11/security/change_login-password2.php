<?php
$user_name=$_COOKIE["login"];
$host = 'localhost'; 
$database = 'mother_site'; 
$user = 'root'; 
$password = 'usbw'; 

$prov=0;

$conn = new mysqli($host, $user, $password, $database);
 if ($conn->connect_error) die($conn->connect_error);

$login=$_POST["login"];
$password=$_POST["password"];
$password2=$_POST["password2"];

$buf=sha1($password);

if($password==$password2 && strlen($password)>=6 && strlen($password2)>=6 && strlen($login)>=6)
{
$query ="UPDATE users SET login='"."$login',password='"."$buf' WHERE login='"."$user_name'";
//echo $query;

//$query2 ="SELECT password FROM users WHERE password=$password2";

$result = $conn->query($query);


setcookie("login","",-2147483647);
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
<script src="js/jquery.js"></script>

    <title></title>

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

       <a id="link"  href="vhod.php" target="_top" ></a>
      <script>
       
            $(document).ready(function(){ document.getElementById('link').click();});
  
    </script>


    </div>
    


</body>

</html>
_END;

/*echo <<<_END
<script>
location.reload();
</script>
_END;*/


}



if($password!=$password2) 
{
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

    <title></title>

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
       <h1>Пароли не совпадают</h1>
  


    </div>
    


</body>

</html>
_END;
$prov=1;
}

if(strlen($password)<6 || strlen($login)<6 || strlen($password2)<6) 
{
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

    <title></title>

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
       <h1>Логин и пароль должны быть не менее шести символов</h1>
     

    </div>
    


</body>

</html>
_END;
$prov=1;
}


if($prov==1) 
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

    <title></title>

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
     
   <h1>  <a href="change_login-password.php"> Назад</a></h1>

    </div>
    


</body>

</html>
_END;





/*echo<<<_END
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

    <title>ĐˇĐĽĐµĐ˝Đ¸Ń‚ŃŚ Đ»ĐľĐłĐ¸Đ˝/ĐżĐ°Ń€ĐľĐ»ŃŚ</title>

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
       <h1>ĐˇĐĽĐµĐ˝Đ° Đ»ĐľĐłĐ¸Đ˝Đ°/ĐżĐ°Ń€ĐľĐ»ŃŹ</h1>
<form action='write_article.php' method='POST'>



    <h1>Đ˘ĐµĐşŃŃ‰Đ¸Đą Đ»ĐľĐłĐ¸Đ˝:$login</h1><br><br>
    
<input type='text' name='login' class='form-control' placeholder=' ĐťĐľĐ˛Ń‹Đą Đ›ĐľĐłĐ¸Đ˝' size='32' maxlength='32'  required  >

    <br><br>
    
<input type='text' name='password' class='form-control' placeholder='ĐťĐľĐ˛Ń‹Đą ĐżĐ°Ń€ĐľĐ»ŃŚ' size='32' maxlength='32'  required  >
    <br><br>
    <input type='text' name='password2' class='form-control' placeholder='ĐźĐľĐ˛Ń‚ĐľŃ€Đ¸Ń‚Đµ ĐżĐ°Ń€ĐľĐ»ŃŚ' size='32' maxlength='32'  required  >

<br><br>

<button id='change' class='btn btn-lg btn-primary btn-block'>
ĐĐ·ĐĽĐµĐ˝Đ¸Ń‚ŃŚ
</button>



</form>
     

    </div>
    


</body>

</html>
_END;*/

$conn->close();

?>