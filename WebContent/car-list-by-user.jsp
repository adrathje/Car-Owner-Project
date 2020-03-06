<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="listNavigationServlet">
		<table>
			<c:forEach items="${requestScope.allLists}" var="currentlist">
				<tr>
					<td><input type="radio" name="id" value="${currentlist.id}"></td>
					<td><h2>${currentlist.listName}</h2></td>	
				</tr>
				<tr>
					<td colspan="3">Order Date: ${currentlist.date}</td>
				</tr>
				<tr>
					<td colspan="3">First name: ${currentlist.person.firstName}</td>
				</tr>
				<tr>
					<td colspan="3">Last name: ${currentlist.person.lastName}</td>
				</tr>
				<c:forEach var="listVal" items="${currentlist.listOfItems}">
					<tr>
						<td></td>
						<td colspan="3">${listVal.CarID},${listVal.model},${listVal.make},${listVal.type}</td>
					</tr>
				</c:forEach>
			</c:forEach>
		</table>
		<input type="submit" value="edit" name="doThisToItem"> <input
			type="submit" value="delete" name="doThisToItem"> <input
			type="submit" value="add" name="doThisToItem">
	</form>
	<a href="addItemsForListServlet">Create a new List</a>
	<a href="index.html">Insert a new car</a>
</body>
</html>