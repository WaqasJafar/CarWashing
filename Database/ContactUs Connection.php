<?php
$conn = mysqli_connect("localhost", "root", "test", "blog_samples") or die("Connection Error: " . mysqli_error($conn));
mysqli_query($conn, "INSERT INTO tblcontact (user_name, user_email,subject,content) VALUES ('" . $name. "', '" . $email. "','" . $subject. "','" . $content. "')");
$insert_id = mysqli_insert_id($conn);
if(!empty($insert_id)) {
$message = "Your contact information is saved successfully";
?>