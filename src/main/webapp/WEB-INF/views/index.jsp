<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
​<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>

	<h1>Login</h1>
    
    <p class="message">${ message }</p>
    
    <!-- change the URL for controller -->
    <form action="/login" method="post">
        <p>
            <label for="username">Username:</label> <input id="username" name="username" value="${ param.username }" required min="2" />
        </p>        
        <p>
            <label for="password">Password:</label> <input id="password" type="password" name="password" value="${ param.password }" required min="2" />
        </p>
        <p>
            <button>Submit</button>
        </p>
    </form>
	
</body>
</html>