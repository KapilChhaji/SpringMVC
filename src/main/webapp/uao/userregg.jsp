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
<form:form action="usereg.html" method="post" name="frm1">
 Enter Student Roll Number <form:input path="userid" /> <br>
 Enter Student Name <form:input path="username" /> <br>
 Enter Password <form:input path="password" /><br>
<input type="submit" name="btnsubmit" value="Submit" /><br>
  

</form:form>
</body>
</html>