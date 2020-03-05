<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit list</title>
</head>
<body>
<form action = "editItemServlet" method="post">
Model: <input type ="text" name = "store" value= "${itemToEdit.model}">
Make: <input type = "text" name = "item" value= "${itemToEdit.make}">
Type: <input type = "text" name = "item" value= "${itemToEdit.type}">s
<input type = "hidden" name = "id" value="${itemToEdit.id}">
<input type = "submit" value="Save Edited Item">
</form>
</body>
</html>