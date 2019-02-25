<%--
  Created by IntelliJ IDEA.
  User: Georgy
  Date: 28.08.2018
  Time: 14:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jpaJBoss</title>
</head>
<body>
<h1>Enter your credentials</h1>
    <form action="register" method="post">
        <input type="text" name="nick" placeholder="nickname">
        <input type="text" name="email" placeholder="email">
        <input type="password" name="pw" placeholder="password">
        <br/> <br/>
        <input type="text" name="country1" placeholder="country">
        <input type="text" name="city1" placeholder="city">

        <input type="text" name="country2" placeholder="country">
        <input type="text" name="city2" placeholder="city">
        <input type="submit">
    </form>
</body>
</html>
