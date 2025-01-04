<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet" href="login.css">
</head>
<body>
   <div class="container">
        <h1>Login</h1>
        <form action="login" method="post">
            <label for="ml">e-mail : </label>
            <input type="email" name="user" id="ml" required>

            <label for="pass">Password:</label>
            <input type="password" name="pass" id="pass" required>

            <button type="submit">Log-in</button>
        </form>
    </div>
</body>
</html>