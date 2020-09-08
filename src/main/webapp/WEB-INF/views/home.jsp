<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Brewery API</title>
</head>
<body>
	<table>
		<tr>
			<th><h1>Brewery List</h1></th>
		</tr>

		<c:forEach var="brewery" items="${breweries }">
			<tr>
				<td><a href="/details?id=${brewery.id }">${brewery.name }</a></td>
			</tr>
		</c:forEach>

	</table>

</body>
</html>