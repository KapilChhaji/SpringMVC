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


<form:form action="Opcode.html" method="post" name="frm1">
<table >
  <tr><td>
<form:radiobutton path="l" value="1" /> Addition<br></td><td>
<form:input path="n1" />Enter First Number<br></td></tr><tr><td>
<form:radiobutton path="l" value="2"/>Sub<br></td><td>
<form:input path="n2" />Enter Second Number<br></td></tr><tr><td>
<form:radiobutton path="l" value="3"/>Multi<br></td><td>
<input type="submit" name="btnsubmit" value="Click" /><br></td></tr><tr><td>
<form:radiobutton  path="l" value="4" />Div<br></td><td>
</td></tr><tr><td>
<form:radiobutton  path="l" value="5" />Modulus<br></td><td>
</td></tr>

</table>
</form:form>


           ${key}
  
</body>
</html>