<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit a list</title>
</head>
<body>
	<form action="createNewListServlet" method="post"> Order
		date: <input type="text" name="month" placeholder="mm" size="4">
		<input type="text" name="day" placeholder="dd" size="4">, <input
			type="text" name="year" placeholder="yyyy" size="4"> 
		First name: <input type="text" name="firstName"><br /> Last
		name: <input type="text" name="lastName"><br /> Available
		cars:<br /> <select name="allItemsToAdd" multiple size="6">
			<c:forEach items="${requestScope.allItems}" var="currentitem">
				<option value="${currentitem.carOrderNumber}">${currentitem.model}|
					${currentitem.make}| ${currentitem.type}</option>
			</c:forEach>
		</select> <br /> <input type="submit" value="Create List and Add Cars">
	</form>
	<a href="index.html">Go add new cars instead.</a>
</body>

</html>