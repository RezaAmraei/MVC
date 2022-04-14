<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show</title>
</head>
<body>

<h1><c:out value="${book.title}"/></h1>
<h3>Description: <c:out value="${book.description}"/></h3>
<h3>Language: <c:out value="${book.language}"/></h3>
<h3>Number of Pages: <c:out value="${book.numberOfPages}"/></h3>
</body>
</html>