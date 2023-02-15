<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
     <%@ include file="menu.jsp" %>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>leads</title>
</head>
<body>
<h2> All Leads</h2>
<table>
<tr>

<th> FirstName</th>
<th> lastName</th>
<th> Email</th>
<th> Mobile</th>
<th> Source</th>
<th> Billing</th>

</tr>
<c:forEach var="contacts" items="${contacts}">
 
<tr>

<td> ${contacts.firstName}</td>
<td> ${contacts.lastName}</td>
<td> ${contacts.email}</td>
<td> ${contacts.mobile}</td>
<td> ${contacts.source}</td>
<td> <a href="generateBill?id=${contacts.id }"> Billing </a>  </td>


</tr>
</c:forEach>

</table>
</body>
</html>