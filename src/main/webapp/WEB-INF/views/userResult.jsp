<%@ page contentType="text/html; charset=ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%>
<html>
<head>
<title>JavaSpringExamples Spring MVC Form</title>
</head>
<body>
	<h2>Result Form</h2>
	<table>
		<tr>
			<td>login :</td>
			<td>${usr.username}</td>
		</tr>
		<tr>
			<td>Password :</td>
			<td>${usr.password}</td>
		</tr>
	</table>
</body>
</html>