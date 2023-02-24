<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
</head>
<body>
<h1>Print Fabnoccis Seris</h1>
<form:form action="ficode.html" method="post" name="frm1">
 Enter End Number Number <form:input path="n" /> <br>
  <input type="submit" name="btnsubmit" value="Print" /><br>

</form:form>
${key}
</body>
</html>