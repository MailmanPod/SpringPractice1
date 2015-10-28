<%--
  Created by IntelliJ IDEA.
  User: Paradox
  Date: 28/10/2015
  Time: 14:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title></title>
</head>
<body>
<p>
  ${title};
</p>

<p>
  <mvc:form modelAttribute="user" action="result" method="post">
<table>
  <tr>
    <td><mvc:label path="name">Name:</mvc:label></td>
    <td><mvc:input path="name"></mvc:input></td>
  </tr>

  <tr>
    <td><mvc:label path="password">Password:</mvc:label></td>
    <td><mvc:password path="password"></mvc:password></td>
  </tr>

  <tr>
    <td><mvc:label path="birthdate">Birthdate</mvc:label></td>
    <td><mvc:input path="birthdate"></mvc:input></td>
  </tr>

  <tr>
    <td>
      <input type="submit" value="Submit" />
    </td>
  </tr>
</table>
</mvc:form>
</p>
</body>
</html>
