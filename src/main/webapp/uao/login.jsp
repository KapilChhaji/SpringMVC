<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%

response.setHeader("Pragma","no-cache");

response.setHeader("Cache-Control","no-store");

response.setHeader("Expires","0");

response.setDateHeader("Expires",-1);



%>
</head>
<body>
<form:form method="post" action="logincode.html">
  <form:input path="userid" /> <br><br>
  <form:password path="password"/> <br><br>
  <input type="submit" name="btnsubmit" value="Login" />
  <a href="regg.html"><h2>New User</h2></a>

</form:form>
${key}
</body>
</html>