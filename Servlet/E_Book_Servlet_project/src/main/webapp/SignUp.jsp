<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>E-Book Signup</title>
<link rel="stylesheet" href="signup.css">
</head>
<body>
       
      <body>
    <div class="container">
        <h1>Sign Up</h1>
        <form action="signup" method="post">
            <label for="un">Username:</label>
            <input type="text" name="user" id="un" required>

            <label for="ml">Email:</label>
            <input type="email" name="mail" id="ml" required>

            <label for="pass">Password:</label>
            <input type="password" name="pass" id="pass" required>

            <button type="submit">Sign Up</button>
        </form>
    </div>
</body>
</html>