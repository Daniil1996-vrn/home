<?php

require "clear_quotes.php";
if(file_exists("copy/articles.html"))
{
unlink("copy/articles.html");
copy("articles.html","copy/articles.html");
}
else copy("articles.html","copy/articles.html");

setlocale(LC_CTYPE, 'ru-RU');
$prov=0;
 $hm = 'localhost';
 $db = 'mother_site';
 $un = 'root';
 $pw = 'usbw';
 $conn = new mysqli($hm, $un, $pw, $db);
mysqli_set_charset($conn,'utf8');

$file="articles.html";
$file_name;
$search_t=clear_quotes($_POST["nazvanie"]);

$chislo;

$array_d=array();
$user=$_COOKIE['login'];

if(isset($search_t) and isset($user)  )
{

$query ='SELECT nazvanie,file,chislo FROM articles WHERE nazvanie='."'". $search_t."' AND avtor='"."$user'";


$result = $conn->query($query);

if (!$result) die ($conn-> error);

$rows = $result->num_rows;
//echo $rows;
 for ($j = 0 ; $j < $rows ; ++$j)
 {
 $result->data_seek($j);
 $row = $result->fetch_array(MYSQLI_ASSOC);
if($search_t==$row['nazvanie'] ) 
{
$prov=1;
$file_name=$row['file'];
$chislo=$row['chislo'];

}

 }


if($prov==1) 
{

$query2 ='DELETE FROM articles WHERE nazvanie='."'". $search_t."' AND avtor='"."$user'";


$resul2t = $conn->query($query2);

if (!$resul2t) die ($conn-> error);


$search_t2="<h1 align=center>".$search_t."</h1>";
$array_file=file_get_contents("articles.html");

$text=explode("<hr>",$array_file);
$search_t=mb_strtolower($search_t,"UTF-8");
$search_t2="<h1 align=center>".$search_t."</h1>";

$file = file('articles.html');

foreach($text as $t)
{


$t2=$t;


$t2=mb_strtolower($t2,"UTF-8");

if(strripos($t2,$chislo,0)==false)
{

//echo $t.'<hr>';
array_push($array_d,$t);


}


}


file_put_contents("articles.html",$array_d);
if (file_exists("files/$file_name"))  unlink("files/$file_name");
echo <<<_END
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
    <title>Đ’Ń…ĐľĐ´</title>

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

    <h1>Статья была успешно удалена $search_t </h1>
    </div> <!-- /container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
  </body>
</html>
_END;

}

if($prov==0) 

echo <<<_END
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
    <title>Đ’Ń…ĐľĐ´</title>

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

    <h1>Статьи $search_t не существует </h1><br>

 <h1><a href="delete_article.html">Назад</a></h1>

    </div> <!-- /container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
  </body>
</html>
_END;



}

/*echo "$start<br>$end<br>";

for ($t=0;$t<count($file);$t++)
{

echo "$file[$t]";
 
}*/


//print_r($array_d);

//echo $search_t2;

?>