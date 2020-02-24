<%--
  Created by IntelliJ IDEA.
  User: CSO
  Date: 2020-02-24
  Time: 오후 3:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>${message}</h1>
<table>
    <thead>
        <tr>
            <th>id</th>
            <th>user_id</th>
            <th>user_name</th>
            <th>user_pw</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="item" items="${usersList}">
            <tr>
                <td>${item.id}</td>
                <td>${item.userId}</td>
                <td>${item.userName}</td>
                <td>${item.userPw}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>
