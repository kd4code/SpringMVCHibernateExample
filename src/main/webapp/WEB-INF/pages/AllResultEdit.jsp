<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List Of Students</title>
</head>
<body>
	<div align="center">
		<h1>List of Students with Result</h1>
		
		<table border="1">

			<th>Roll No</th>
			<th>Name</th>
			<th>Maths</th>
			<th>Science</th>
			<th>English</th>

			<c:forEach var="result" items="${listResult}">
				<tr>

					<td>${result.roll}</td>
					<td>${result.name}</td>
					<td>${result.math}</td>
					<td>${result.science}</td>
					<td>${result.english}</td>
					<td><a href="updateResult?roll=${result.roll}">Update</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a
						href="deleteResult?roll=${result.roll}">Delete</a></td>

				</tr>
			</c:forEach>
		</table>
		<h4>
			If data updated <a href="thankyou">click here</a>
		</h4>
	</div>
</body>
</html>