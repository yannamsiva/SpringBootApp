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
<form:form action="empInsert" modelAttribute="emp"  method="post">

<table>

<tr>
<td>Ename :</td>
<td><form:input path="ename"/></td>
</tr>
<tr>
<td>Eaddress :</td>
<td><form:input path="eadd"/></td>
</tr>
<tr>
<td><input type="submit" value="Insert"></td>
<td><input type="Reset" value="Clear"></td>
</tr>


</table>


</form:form>
<a href="viewEmployees">ViewAllRecords</a>
</body>
</html>