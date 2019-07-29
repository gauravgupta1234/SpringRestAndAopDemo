<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>RegisterPage</title>
</head>
<body>

	<f:form modelAttribute="student" method="post">
		<table>
			<tr>
				<td>Name :</td>
				<td><f:input path="name" /></td>
			</tr>
			<tr>
				<td>Address :</td>
				<td><f:input path="address" /></td>
			</tr>
			<tr>
				<td>Contact :</td>
				<td><f:input path="contact" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit"  name="Submit"/></td>
			</tr>
		</table>
	</f:form>
</html>
</body>
