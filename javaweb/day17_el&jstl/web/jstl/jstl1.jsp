<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: sjtuw
  Date: 2021/3/10
  Time: 10:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>if</title>
</head>
<body>

    <c:if test="true">
        true
    </c:if>
    <br>

    <%
        ArrayList<Object> list = new ArrayList<>();
        list.add("aaa");
        request.setAttribute("list",list);

        request.setAttribute("number",3);

    %>
    <c:if test="${not empty list}">
        list
    </c:if>
    <br>

    <c:if test="${number%2!=0}">
        ${number}是奇数
    </c:if>
    <br>
</body>
</html>
