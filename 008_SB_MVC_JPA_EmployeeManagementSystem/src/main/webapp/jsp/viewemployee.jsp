<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

    <%@page isELIgnored="false" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.5.1.js"></script>

<script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.12.1/js/jquery.dataTables.js"></script>

<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.12.1/css/jquery.dataTables.css">

<script>
$(document).ready( function () {
    $('#myTable').DataTable();
} );
</script>




</head>






<body>
	<H3>view Employees</H3>

	<a href="loadForm">Add New Employee</a>
	<table border="2" id="myTable">
		<thead>
			<tr>
				<th>EmployeeNumber</th>
				<th>Employee Name</th>
				<th>EmployeeAddress</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach items="${employees}" var="e">
				<tr>
					<td>${e.eno}</td>
					<td>${e.ename}</td>
					<td>${e.eadd}</td>
					  <td>
					  <a href="editemp?id=${e.eno}">Edit</a></td>
     <td><a href="deleteemp?id=${e.eno}" onclick="deleteConfirm()">Delete</a>
				</tr>
					
			</c:forEach>
		</tbody>
	</table>
</body>
</html>