<?php

require "clear_quotes.php";

$file="articles.html";
$prov=0;
$search_t=clear_quotes($_POST["search"]);


$array_file=file_get_contents("articles.html");
//array_push($array_files,"articles.html");

$array_s=array();

$text=explode("<hr>",$array_file);
$search_t=mb_strtolower($search_t,"UTF-8");
//echo $search_t;
foreach($text as $t)
{


$t2=$t;


$t2=mb_strtolower($t2,"UTF-8");

if(strripos($t2,$search_t,0)!=false)
{

//echo $t.'<hr>';
array_push($array_s,$t);

}


}



/*$count=count($array_s);

echo $count-1;*/

echo "<h1 align=center>Результаты поиска по запросу $search_t</h1><br>";

foreach($array_s as $item)
{
echo $item;
}




?>