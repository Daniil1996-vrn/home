<?php
require "clear_quotes.php";
setlocale(LC_CTYPE, 'ru-RU');
$prov=0;
 $hm = 'localhost';
 $db = 'mother_site';
 $un = 'root';
 $pw = 'usbw';
 $conn = new mysqli($hm, $un, $pw, $db);
mysqli_set_charset($conn,'utf8');


$header=clear_quotes($_POST['zagolovok']);
$body=$_POST['text_area'];
$stoimost=clear_quotes($_POST['stoimost']);
$chislo=rand(0,1000);
$chislo.=1;
$file=$_COOKIE["file_name"];
$user=$_COOKIE["login"];


$header2="<h1 align=center>$header</h1>\r\n";
$stoimost2="<h1 >Стоимость:$stoimost</h1>\r\n";
$body2="<p>$body</p>\r\n";
$time =  date("d.m.Y") ;
$time2="<p>Опубликовано:$time</p>\r\n";

$oplata="<html lang='en'>
  <head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <meta name='description' content=''>
    <meta name='author' content=''>
    <link rel='shortcut icon' href='../../assets/ico/favicon.ico'>
 <script src='js/jquery.js'></script>
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

      <form  action='k_oplate.php' method='post'>
    <button  class='btn btn-primary' name='button'>Получить работу</button>
          <input name='ch' type='hidden'  value=$chislo>
          
      </form>


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
  </body>
      
</html>";

if(isset($header) and isset($body)  and isset($stoimost) and isset($file))
{

$query ='SELECT nazvanie FROM articles WHERE nazvanie='."'". $header."'";


$result = $conn->query($query);

if (!$result) die ($conn-> error);

$rows = $result->num_rows;
//echo $rows;
 for ($j = 0 ; $j < $rows ; ++$j)
 {
 $result->data_seek($j);
 $row = $result->fetch_array(MYSQLI_ASSOC);
if($header==$row['nazvanie'] ) $prov=1;



 }


if($prov==0)
{

$text=$header2.$stoimost2.$body2.$time2.$oplata."\r\n"."<hr>\r\n";
$text.=file_get_contents("articles.html").PHP_EOL;
file_put_contents("articles.html",$text);

if ($conn->connect_error) die($conn->connect_error);
 $query2 = "INSERT INTO articles(chislo,date,nazvanie,avtor,file,stoimost) VALUES('"."$chislo'".",'"."$time',"."'$header'".",". "'$user'".","."'$file'".","."'$stoimost')";
//echo $query2;

 $result2 = $conn->query($query2);
$conn->close();
echo '<script>location.href="rabota_dobavlena.html";</script>';

}

if($prov==1) echo '<script>location.href="rabota_uzhe_suschestvuet.html";</script>';

}

/*$descriptor=fopen("articles.html","a+");
fwrite($descriptor,"<h1 align=center>$header</h1>");
fwrite($descriptor,"<p align=center>$body</p>");
fwrite($descriptor,"<hr>");
fclose($descriptor)*/


?>
