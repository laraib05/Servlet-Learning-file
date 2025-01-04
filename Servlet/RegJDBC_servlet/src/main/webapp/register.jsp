<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<form action="regForm" method="post">
		<label for="un">Name : </label>
	    <input type="text" name="name" id="un"><br><br> 
	    <label for="ml">E-mail : </label> 
	    <input type="email"	name="mail" id="ml"><br><br> 
	    <label for="p">Password : </label> 
	    <input type="password" name="pass" id="p"><br><br> 
	    <input type="radio" id="male" name="gender" value="male">
		<label for="male">Male</label><br> 
		<input type="radio"id="female" name="gender" value="female">
	    <label for="female">Female</label><br>
		<input type="radio" id="other" name="gender" value="other"> 
		<label for="other">Other</label><br>
		<label for="city">City:</label>
		<select id="city" name="city"> 
		   <option value="new_delhi">New Delhi</option> 
		   <option value="mumbai">Mumbai</option>
		   <option value="bangalore">Bangalore</option> 
		   <option value="chennai">Chennai</option> 
		   <option value="kolkata">Kolkata</option> 
		</select><br><br>
		
		<input type="submit" value="Submit">
	</form>
	
	
</body>
</html>