<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
</head>
<body>
<form:form method="post" action="regcode.html">
  <form:input path="userid" /> <br><br>
  <form:password path="password"/> <br><br>
  <input type="submit" name="btnsubmit" value="Registred" />
  <a href="login.html"><h2>Alerdy Ragistred</h2></a>

</form:form>
</body>
</html>