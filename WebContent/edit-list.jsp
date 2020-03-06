<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<style type="text/css">
.btn {
    border: none;
    display: inline-block;
    padding: 8px 16px;
    vertical-align: middle;
    overflow: hidden;
    text-decoration: none;
    text-align: center;
    cursor: pointer;
    white-space: nowrap;
}
.btn, .btn:link, .btn:visited {
    color: #FFFFFF;
    background-color: #0077be;
}
.btn:hover {
    color: #FFFFFF;
    background-color: #368DC5;
}
</style>
<head>
<meta charset="ISO-8859-1">
<title>Edit list</title>
</head>
<body>
<form action = "editItemForListServlet" method="post">
<p><label>Model: </label><input type ="text" name = "model" value= "${itemToEdit.model}"></p>
<p><label>Make: </label><input type = "text" name = "make" value= "${itemToEdit.make}"></p>
<p><label>Type: </label><input type = "text" name = "type" value= "${itemToEdit.type}"></p>
<input type = "hidden" name = "id" value="${itemToEdit.id}">
<input class="btn" type = "submit" value="Save Edited Item">
</form>
</body>
</html>