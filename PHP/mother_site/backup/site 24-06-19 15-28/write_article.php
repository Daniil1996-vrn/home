<?php

setlocale(LC_CTYPE, 'ru-RU');
$prov=0;
  $hm = 'localhost';
 $db = 'mother_site';
 $un = 'root';
 $pw = 'usbw';
 $conn = new mysqli($hm, $un, $pw, $db);
mysqli_set_charset($conn,'utf8');


$header=$_POST['zagolovok'];
$body=$_POST['text_area'];
$stoimost=$_POST['stoimost'];
$chislo=rand(0,1000);
$chislo.=1;
$file=$_COOKIE["file_name"];
$user=$_COOKIE["login"];


$header2="<h1 align=center>$header</h1>";
$stoimost2="<h1 >Стоимость:$stoimost</h1>";
$body2="<p>$body</p>";
$time =  date("d.m.Y") ;
$time2="<p>Опубликовано:$time</p>";

$text=$header2.$stoimost2.$body2.$time2."<hr>";
$text.=file_get_contents("articles.html").PHP_EOL;
file_put_contents("articles.html",$text);

if(isset($header) and isset($body)  and isset($stoimost) and isset($file))
{

if ($conn->connect_error) die($conn->connect_error);

 $query = "INSERT INTO articles(chislo,date,nazvanie,avtor,file,stoimost) VALUES('"."$chislo'".",'"."$time',"."'$header'".",". "'$user'".","."'$file'".","."'$stoimost')";
echo $query;

 $result = $conn->query($query);



}

/*$descriptor=fopen("articles.html","a+");
fwrite($descriptor,"<h1 align=center>$header</h1>");
fwrite($descriptor,"<p align=center>$body</p>");
fwrite($descriptor,"<hr>");
fclose($descriptor)*/


?>
