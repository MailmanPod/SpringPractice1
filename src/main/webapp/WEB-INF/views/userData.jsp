<%--
  Created by IntelliJ IDEA.
  User: Paradox
  Date: 28/10/2015
  Time: 15:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
</head>
<body>
<p>
  ${title}
</p>
<table>
  <tr>
    <td>Name: </td>
    <td>${u.name}</td>
  </tr>

  <tr>
    <td>Password: </td>
    <td>${u.password}</td>
  </tr>

  <tr>
    <td>Birthdate: </td>
    <td><fmt:formatDate pattern="dd/MM/yyyy" value="${u.birthdate}"></fmt:formatDate> </td>
  </tr>
</table>
<p>

</p>
</body>
</html>
