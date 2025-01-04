<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <% 
      String nameToPrint =(String) request.getAttribute("name_key");
   %>
   <h3>Welcome to the page <%= nameToPrint %></h3>
</body>
</html>