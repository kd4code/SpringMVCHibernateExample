<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New/Edit Result</title>
</head>
<body>
    <div align="center">
        <h1>New/Edit Result</h1>
        <form:form action="saveResult" method="post" modelAttribute="result">
        <table>
            <tr>
                <td>Roll No:</td>
                <td><form:input path="roll" /></td>
            </tr>
            <tr>
                <td>Name:</td>
                <td><form:input path="name" /></td>
            </tr>
            <tr>
                <td>Mathematics:</td>
                <td><form:input path="math" /></td>
            </tr>
            <tr>
                <td>Science:</td>
                <td><form:input path="science" /></td>
            </tr>
            <tr>
                <td>English:</td>
                <td><form:input path="english" /></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Save"></td>
            </tr>
        </table>
        </form:form>
    </div>
</body>
</html>