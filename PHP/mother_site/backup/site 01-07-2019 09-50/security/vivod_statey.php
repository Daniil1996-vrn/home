<?php
setlocale(LC_CTYPE, 'ru-RU');
$prov=0;
  $hm = 'localhost';
 $db = 'mother_site';
 $un = 'root';
 $pw = 'usbw';
 $conn = new mysqli($hm, $un, $pw, $db);
mysqli_set_charset($conn,'utf8');

$user=$_COOKIE['login'];

 if ($conn->connect_error) die($conn->connect_error);

 $query = "SELECT * FROM articles WHERE avtor='"."$user'";
 $result = $conn->query($query);
 if (!$result) die ($conn-> error);

echo "<br></br>";
echo '<h1 align="center">Мои работы</h1>';
echo "<table border='1' cellspacing='0' cellpadding='20' align='center'><tr><th>Дата</th><th>Название</th><th>Файл</th><th>Автор</th><th>Стоимость</th></tr>";
$rows = $result->num_rows;

 for ($j = 0 ; $j < $rows ; ++$j)
 {
 $result->data_seek($j);
 $row = $result->fetch_array(MYSQLI_ASSOC);
 echo "<tr>";
 echo '<td>' . $row['date'] . '</td>';
 echo '<td>' . $row['nazvanie'] . '</td>';
 echo '<td> ' . $row['file'] . '</td>';
echo '<td> ' . $row['avtor'] . '</td>';
echo '<td> ' . $row['stoimost'] . '</td>';

 echo "</tr>";
 }
 echo "</table>";
 $result->close();


 $conn->close();


?>