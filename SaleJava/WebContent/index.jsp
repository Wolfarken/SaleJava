<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	
	<body>
		<form  action="newClient" method="post">
			<input type="text" name="document">
			
			<input type="text" name="name">
			
			<input type="text" name="birthday">
			
			<input type="submit">
		</form>
		
		<c:if test="${not empty exit }">
			<tr>
				<td><c:out value="${exit }"></c:out></td>
			</tr>
		</c:if>
	</body>
</html>