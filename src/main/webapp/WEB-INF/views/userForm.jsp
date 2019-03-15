<%@ page contentType="text/html; charset=ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%>
<html>
<head>
<title>JavaSpringExamples Spring MVC Form</title>
<style type="text/css">
.formFieldError {
	background-color: #FFC;
}
</style>
</head>
<body>

	<h2>Form</h2>
	<mvc:form modelAttribute="user" action="result.mvc">
		<table>
			<tr>
				<td><mvc:label path="username">Login</mvc:label></td>
				<td><mvc:input path="username" cssErrorClass="formFieldError" /></td>
				<td><mvc:errors path="username" /></td>
			</tr>
			<tr>
				<td><mvc:label path="password">Password</mvc:label></td>
				<td><mvc:password path="password"
						cssErrorClass="formFieldError" /></td>
				<td><mvc:errors path="password" /></td>
			</tr>
			<tr>
				<td colspan="3"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</mvc:form>
</body>
</html>