<?php
setcookie("code_auth","",-2147483647);
echo<<<_END
<html>
<head>
<meta http-equiv='Content-Type' content='text/html charset=utf8'>
<meta http-equiv='Content-Language' content='ru'>
<meta http-equiv='pragma' content='no-cache'>
<meta http-equiv='Expires' content='0'>
<meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <meta name='description' content=''>
    <meta name='author' content=''>
    <link rel='shortcut icon' href='../../assets/ico/favicon.ico'>
<script src="js/jquery.js"></script>

    <title></title>

    <!-- Bootstrap core CSS -->
    <link href='css/bootstrap.min.css' rel='stylesheet'>

    <!-- Custom styles for this template -->
    <link href='signin.css' rel='stylesheet'>

    <!-- Just for debugging purposes. Don't actually copy this line! -->
    <!--[if lt IE 9]><script src='../../assets/js/ie8-responsive-file-warning.js'></script><![endif]-->

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src='https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js'></script>
      <script src='https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js'></script>
    <![endif]-->

</head>

<body>
    
   
   <div class='container' align='center'>
       <a id="link"  href="vhod.php" target="_top"  ></a>
    
 <script>
       
            $(document).ready(function(){ document.getElementById('link').click();});

            
         //   document.getElementById('link').click()
             
    </script>
    </div>
    


</body>
_END;

echo <<<_END
<script>
history.go(-1);
</script>
_END;

?>