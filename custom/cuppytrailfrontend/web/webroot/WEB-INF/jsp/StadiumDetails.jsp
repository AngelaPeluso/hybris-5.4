<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!Doctype html>
<html>
	<title>Stadium Details</title>
<body>
	<h1>Stadium Details</h1>
	Stadium Details for ${stadium.name}<br><br>
	capacity:${stadium.capacity}<br>
	matches:<br>
	
	<ul>
	<c:forEach var="match" items="${stadium.matches}">
	 <li>${match.matchSummaryFormatted}</li>
	 </c:forEach>	 
	</ul>
	<a href="../stadiums">Back to stadium listing</a>
</body>
</html>