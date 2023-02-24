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


<form:form action="Excode.html" method="post" name="frm1" modelAttribute="lan">
<table border="1">
  <tr><td>
<form:radiobutton path="course" value="C" /> C<br></td><td>
<form:checkbox path="course1" value="java"  />Java<br></td></tr><tr><td>
<form:radiobutton path="course" value="C++"/>C++<br></td><td>
<form:checkbox path="course1" value=".net"  />.NET<br></td></tr><tr><td>
<form:radiobutton path="course" value="DS"/>DS<br></td><td>
<form:checkbox path="course1" value="php" />PHP<br></td></tr><tr><td colspan="2" align="center">
<input type="submit" name="btnsubmit" value="Click" /><br></td></tr>
</table>
</form:form>


           ${key}
  
</body>
</html>