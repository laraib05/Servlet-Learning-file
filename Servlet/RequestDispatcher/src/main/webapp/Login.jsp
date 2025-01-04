<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <form action="login" method="post">
    <label for="un">UserName : </label><br>
    <input type="text" id="un" name="name"><br><br>
    <label for="ml">E-mail : </label><br>
    <input type="email" name="mail" placeholder="abc@gmail.com" id="ml"><br><br>
    <label for="pass">Password : </label><br>
    <input type="password" name="pass" id="pass" ><br><br>
    <button type="submit">log-in</button>
    </form>
</body>
</html>