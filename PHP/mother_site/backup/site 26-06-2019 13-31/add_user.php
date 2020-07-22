<?php
setlocale(LC_CTYPE, 'ru-RU');
$prov=0;
  $hm = 'localhost';
 $db = 'mother_site';
 $un = 'root';
 $pw = 'usbw';
 $conn = new mysqli($hm, $un, $pw, $db);
mysqli_set_charset($conn,'utf8');

$login=$_POST['login'];
$password=$_POST['password'];
$password2=sha1($password);

 if ($conn->connect_error) die($conn->connect_error);

 $query = "INSERT INTO users(login,password) VALUES('". "$login" ."',"."'"."$password2". "')";
echo $query;
$query2 = "SELECT *FROM USERS";

 $result = $conn->query($query);
 if (!$result) die ($conn-> error);

 $result2 = $conn->query($query2);
 if (!$result2) die ($conn-> error);


echo "<br></br>";
echo "<table border='1' cellspacing='0' cellpadding='20' align='center'><tr><th>Login</th><th>Password</th></tr>";
$rows = $result2->num_rows;

 for ($j = 0 ; $j < $rows ; ++$j)
 {
 $result2->data_seek($j);
 $row = $result2->fetch_array(MYSQLI_ASSOC);
 echo "<tr>";
 echo '<td>' . $row['login'] . '</td>';
 echo '<td>' . $row['password'] . '</td>';
 
 echo "</tr>";
 }
 echo "</table>";
// $result->close();

echo "Пользователь успешно добавлен<br>";
 $conn->close();


?>