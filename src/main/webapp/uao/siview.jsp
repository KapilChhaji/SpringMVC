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
<form:form action="sicode.html" method="post" name="frm1">
 P <form:input path="p" /> <br>
 R <form:input path="r" /> <br>
 T <form:input path="t" /> <br>
 SI <input type="submit" name="btnsubmit" value="Calculate" /><br>

</form:form>
${key}
</body>
</html>