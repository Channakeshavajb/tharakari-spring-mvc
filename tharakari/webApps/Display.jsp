<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display items</title>
<style type="text/css">
table, td, th {
	border: 1px solid black;
	border-collapse: collapse;
	
}
table{
margin-left:450px;
}

</style>

</head>
<body>
	<h1 align="center">Total ordered Tharakari Data in List</h1>

	<table >
	<tr>
				<th>Name</th>
				<th>Quantity</th>
				<th>Price</th>
				<th>Type</th>
				<th>Delivery Date</th>
			</tr>
		<c:forEach items="${listItems}" var="item">
			
			<tr>
				<td><c:out value="${item.name}" /></td>
				<td><c:out value="${item.quantity}" /></td>
				<td><c:out value="${item.price}" /></td>
				<td><c:out value="${item.type}" /></td>
				<td><c:out value="${item.deliveryDate}" /></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>