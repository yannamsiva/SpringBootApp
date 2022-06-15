<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib  uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Message : 
${msg}
</hr>
<form:form action="addStudent" modelAttribute="student"  method="post">

<table>

<tr>
<td>Sname :</td>
<td><form:input path="sname"/></td>
</tr>
<tr>
<td>Sadd :</td>
<td><form:input path="saddd"/></td>
</tr>
<tr>
<td><input type="submit" value="Insert"></td>
<td><input type="Reset" value="Clear"></td>
</tr>


</table>


</form:form>
<a href="viewStudents">ViewAllRecords</a>
</body>
</html>