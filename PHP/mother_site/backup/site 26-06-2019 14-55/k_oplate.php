<?php
$chislo=$_POST["ch"];

$host = 'localhost'; 
$database = 'mother_site'; 
$user = 'root'; 
$password = 'usbw'; 

$conn = new mysqli($host, $user, $password, $database);
 if ($conn->connect_error) die($conn->connect_error);


$query ='SELECT nazvanie,stoimost,file FROM articles WHERE chislo='."'$chislo"."'";
//echo $query."<br>";

//$query2 ="SELECT password FROM users WHERE password=$password2";

$result = $conn->query($query);

if (!$result) die ($conn-> error);

$rows = $result->num_rows;
//echo $rows;
 for ($j = 0 ; $j < $rows ; ++$j)
 {
 $result->data_seek($j);
 $row = $result->fetch_array(MYSQLI_ASSOC);
$nazvanie=$row['nazvanie'];
$stoimost=$row['stoimost'];
$file=$row['file'];
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

    <title>К оплате</title>

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
      
<form action='oplata.php' method='POST'>
<h1>К оплате</h1>
    <h1>Название:$nazvanie</h1>
  <h1>Стоимость:$stoimost</h1>
      <h1>Файл для загрузки:$file</h1><br>
      <button class='btn btn-primary btn-block'>Оплатить</button>


</form>
     

    </div>
    


</body>

</html>

_END;



 }

$conn->close();



setcookie("file", $file);

?>