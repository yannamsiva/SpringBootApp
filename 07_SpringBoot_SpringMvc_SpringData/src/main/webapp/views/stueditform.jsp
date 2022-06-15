<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@page isELIgnored="false" %>

		<h1>Edit Employee</h1>
       <form:form method="POST" action="editsave" modelAttribute="student">  
      	<table >  
      	<tr>
      	<td></td>  
         <td><form:hidden  path="sno" /></td>
         </tr> 
         <tr>  
          <td>Name : </td> 
          <td><form:input path="sname"  /></td>
         </tr>  
         <tr>  
          <td>StudentAddress :</td>  
          <td><form:input path="saddd" /></td>
         </tr> 
         
         <tr>  
          <td> </td>  
          <td><input type="submit" value="Edit Save" /></td>  
         </tr>  
        </table>  
       </form:form>  
