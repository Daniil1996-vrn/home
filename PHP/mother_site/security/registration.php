<?php


require "connection.php";

require "clear_quotes.php";

$conn = new mysqli($host, $user, $password, $database);
mysqli_set_charset($conn,'utf8');

 if ($conn->connect_error) die($conn->connect_error);

$id=rand(100000,1000000);
$id.=1;

$first_name=clear_quotes($_POST["first_name"]);
$last_name=clear_quotes($_POST["last_name"]);


$login=clear_quotes($_POST["login"]);
$password=clear_quotes($_POST["password"]);

$repeat_password=clear_quotes($_POST["repeat_password"]);

$email=clear_quotes($_POST["email"]);

$password2=sha1($password);

$code=rand(-100000,1000000);
$code.=1;
$code.=sha1($code);

$code_auth=rand(-500000,2000000);
$code_auth.=1;
$code_auth.=sha1($code);

$question=$_POST["question"];
$answer=clear_quotes($_POST["answer"]);
  
$query = "INSERT INTO users(id,first_name, last_name, login, password, email,code,status,code_auth,question,answer,groups) VALUES" .
 "('$id','$first_name', '$last_name', '$login', '$password2', '$email','$code','0','$code_auth','$question','$answer','u')";
//echo $query;

//$query2 ="SELECT password FROM users WHERE password=$password2";
//"INSERT INTO articles(chislo,date,nazvanie,avtor,file) VALUES('"."$chislo'".",'"."$time',"."'$header'".",". "'$user'".","."'$file'".")";


$result = $conn->query($query);

echo  "('$id','$first_name', '$last_name', '$login', '$password2', '$email')";
echo "$code";

/*date_default_timezone_set('Europe/Moscow');
$date = date('m/d/Y h:i:s ', time());
echo $date;
$newDate = date("Y-m-d H:i:s",strtotime($date." +5 minutes"));
echo $newDate;

$datetime1 = new DateTime($date);
$datetime2 = new DateTime($newDate);
$interval = $datetime1->diff($datetime2);
echo "<br>";
echo $interval->format( '%i');*/


echo <<<_END

<script>location.href="podtverzhdenie.php?code=$code"</script>
_END;

?>
