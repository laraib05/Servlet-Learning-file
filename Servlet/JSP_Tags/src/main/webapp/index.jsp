<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Showcase</title>
<style>
    body {
        font-family: Arial, sans-serif;
        margin: 20px;
    }
    h1 {
        color: #0056b3;
    }
    h2 {
        color: #28a745;
    }
    p {
        font-size: 16px;
    }
    table {
        border-collapse: collapse;
        width: 50%;
        margin-top: 10px;
    }
    table, th, td {
        border: 1px solid #ddd;
    }
    th, td {
        padding: 10px;
        text-align: left;
    }
</style>
</head>
<body>
    <h1>JSP Demonstration</h1>
    
    <!-- Scripting Tags -->
    <h2>Scripting Tags</h2>
    <%
        // Declaration Tag
        String name = "Laraib Khan";
        int number = 42;

        // Scriptlet Tag
        session.setAttribute("userName", name);
    %>
    <p>Declaration: My name is <%= name %> and my favorite number is <%= number %>.</p>
    
    <!-- Implicit Objects -->
    <h2>Implicit Objects</h2>
    <table>
        <tr>
            <th>Object</th>
            <th>Example</th>
        </tr>
        <tr>
            <td>Request</td>
            <td><%= request.getMethod() %></td>
        </tr>
        <tr>
            <td>Session</td>
            <td><%= session.getAttribute("userName") %></td>
        </tr>
        <tr>
            <td>Application</td>
            
        </tr>
    </table>

    <!-- Expression Language -->
    <h2>Expression Language (EL)</h2>
    <%-- Setting attributes for EL demonstration --%>
    <%
        request.setAttribute("message", "Expression Language makes JSP more concise!");
        session.setAttribute("userRole", "Java Full Stack Developer");
    %>
    <p>Message: ${message}</p>
    <p>User Role: ${userRole}</p>

    <!-- Form Example -->
    <h2>Form Handling</h2>
    <form action="index.jsp" method="get">
        <label for="inputValue">Enter your favorite tech stack:</label>
        <input type="text" id="inputValue" name="techStack">
        <button type="submit">Submit</button>
    </form>
    <%-- Displaying the submitted value --%>
    <%
        String techStack = request.getParameter("techStack");
        if (techStack != null && !techStack.isEmpty()) {
    %>
        <p>Your favorite tech stack is: <%= techStack %></p>
    <% } %>

    <!-- Session Management -->
    <h2>Session Management</h2>
    <p>Session ID: <%= session.getId() %></p>
    <p>Session Creation Time: <%= new java.util.Date(session.getCreationTime()) %></p>
    <p>Session Last Accessed Time: <%= new java.util.Date(session.getLastAccessedTime()) %></p>
</body>
</html>
