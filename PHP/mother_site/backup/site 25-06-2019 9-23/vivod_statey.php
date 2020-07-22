<?php
setlocale(LC_CTYPE, 'ru-RU');
$prov=0;
  $hm = 'localhost';
 $db = 'mother_site';
 $un = 'root';
 $pw = 'usbw';
 $conn = new mysqli($hm, $un, $pw, $db);
mysqli_set_charset($conn,'utf8');

 if ($conn->connect_error) die($conn->connect_error);

 $query = "SELECT * FROM articles";
 $result = $conn->query($query);
 if (!$result) die ($conn-> error);

echo "<br></br>";
echo "<table border='1' cellspacing='0' cellpadding='20' align='center'><tr><th>Date</th><th>Nazvanie</th><th>File</th><th>Avtor</th></tr>";
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
 echo "</tr>";
 }
 echo "</table>";
 $result->close();


 $conn->close();


?>