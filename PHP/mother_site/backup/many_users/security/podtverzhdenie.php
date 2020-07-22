<?php


require "connection.php";

require "clear_quotes.php";

$conn = new mysqli($host, $user, $password, $database);
 if ($conn->connect_error) die($conn->connect_error);

  $code=clear_quotes($_GET['code']);
//echo $code;
$query = "SELECT code FROM users WHERE code=" .
 "'$code'";
//echo $query;
$result = $conn->query($query);

if (!$result) die ($conn-> error);

$rows = $result->num_rows;
//echo $rows;
 for ($j = 0 ; $j < $rows ; ++$j)
 {
 $result->data_seek($j);
 $row = $result->fetch_array(MYSQLI_ASSOC);
//echo "<br>".$row['code']."<br>";
if($code==$row['code']){

$query2 = "UPDATE users SET status=1 WHERE code=" ."'$code'";
 "'$code'";
//echo $query2;
$conn->query($query2);

 echo 'all right';

}

 }

$conn->close();





?>
