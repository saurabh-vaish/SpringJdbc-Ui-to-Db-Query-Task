<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Welcome to User Query Page</h2>

1. make a table as model table in project

2. Enter query -- select * from employee


<form action="reg" method="post">
<pre>

Name   : <input type="text" name="userQuery"/>   

	<input type="submit" value="Submit" />
</pre>

</form>

${data}

</body>
</html>