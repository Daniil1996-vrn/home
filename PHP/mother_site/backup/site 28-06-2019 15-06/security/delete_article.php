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

$file="articles.html";
$file_name;
$search_t=clear_quotes($_POST["nazvanie"]);


if(isset($search_t))
{

$query ='SELECT nazvanie,file FROM articles WHERE nazvanie='."'". $search_t."'";


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
}

 }


if($prov==1) 
{

$query2 ='DELETE FROM articles WHERE nazvanie='."'". $search_t."'";


$resul2t = $conn->query($query2);

if (!$resul2t) die ($conn-> error);



$array_file=file_get_contents("articles.html");
//array_push($array_files,"articles.html");

$array_d=array();

$text=explode("<hr>",$array_file);
$search_t=mb_strtolower($search_t,"UTF-8");
//echo $search_t;
foreach($text as $t)
{


$t2=$t;


$t2=mb_strtolower($t2,"UTF-8");

if(strripos($t2,$search_t,0)==false)
{

//echo $t.'<hr>';
array_push($array_d,$t);


}


file_put_contents("articles.html",$array_d);
if (file_exists("files/$file_name"))  unlink("files/$file_name");
echo "article was succesfully delete";

}

}

if($prov==0) echo "this article not exists";


}




//print_r($array_d);



?>