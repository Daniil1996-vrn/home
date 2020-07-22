<?php
$header=$_POST['zagolovok'];
$body=$_POST['text_area'];

$descriptor=fopen("articles.html","a+");
fwrite($descriptor,"<h1 align=center>$header</h1>");
fwrite($descriptor,"<p align=center>$body</p>");
fwrite($descriptor,"<hr>");
fclose($descriptor)
?>
