<?php
function clear_quotes($string)
{
$string=str_replace("'","",$string);
$buf=$string;
 $buf2=str_replace('"',"",$buf);
return $buf2;
}

?>