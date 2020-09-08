<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Brewery Details</title>
</head>
<body>

	<p>${brewery.name }</p>
	<p>Address: ${brewery.street }, ${brewery.city }, ${brewery.state }
	 ${brewery.postal_code } ${brewery.country }</p>
	<p>Phone number: ${brewery.phone }</p>


	<a href="/">Back to Homepage</a>

</body>
</html>