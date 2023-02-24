<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.Iterator" %>
<%@page import="java.util.List" %>
<%@page import="dao.Student"  %>
<%@page import="dao.Admin"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
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
<a href="logout.html">Logout</a>
<% String s1=request.getAttribute("btnkey")==null? "Insert":"Update"; %>
<h1>Student Details</h1>
<form:form action="stucode.html" method="post" name="frm1">
 Enter Student Roll Number <form:input path="rno" /> <br>
 Enter Student Name <form:input path="name" /> <br>
  <input type="submit" name="btnsubmit" value="<%= s1 %>" /><br>
  <a href="select.html">Show </a>

</form:form>
${key}
<br>
<%
if(request.getAttribute("key2")!=null)
{
	List lst = (List)request.getAttribute("key2");
	Iterator it = lst.iterator();
	if(it.hasNext())
	{
		Admin o = (Admin)it.next();
		out.print(o.getUserid() + " " + o.getPassword() + "<br>");
		
	}
}


%>
<table border="1">
<tr><th>Rno</th><th>Name</th></tr>
<% 
if(request.getAttribute("key1")!=null){
	List lst=(List)request.getAttribute("key1");
	Iterator it=lst.iterator();
	while(it.hasNext()){
		Student s=(Student)it.next(); %>
		<tr><td><%= s.getRno() %></td><td><%= s.getName() %></td>
		<td><a href="edit.html?q=<%=s.getRno() %>">Edit</a></td>
		<td><a href="delete.html?q=<%=s.getRno() %>">Delete</a></td></tr>
		
		
	<% }
}
%>
</table>
</body>
</html>