<?php
$prov=0;
$prov2=0;
$filename=$_FILES['somename']['name'];
$randname=rand(0,10000);
$randname.=1;

$goodlist = array(".doc", ".docx", ".pdf", ".zip",".rar");
  $ext = substr($filename, strrpos($filename,'.'), strlen($filename)-1); 
  if(in_array($ext,$goodlist ))
{
$prov=1;

 }

/*if($_FILES['somename']['size']<2000000)
{
$prov2=1;
}*/



if($prov==1 && $_FILES['somename']['size']!=0)
{
$randname2=$randname.$ext;
$_FILES['somename']['name']=$randname2;
  $uploadfile = "files/".$_FILES['somename']['name'];
  move_uploaded_file($_FILES['somename']['tmp_name'], $uploadfile);
//echo "Файл был успешно загружен<br>";
setcookie("file_name",$randname2);
echo "<script>location.href='admin.html'</script>";
//echo $_FILES['somename']['type'];
}

//echo "$prov<br>$prov2<br>";
if($prov==0) echo "<script>location.href='bad_extension.html'</script>";

if($_FILES['somename']['size']==0) echo "<script>location.href='big_size.html'</script>";


//echo $_FILES['somename']['size'];




?>