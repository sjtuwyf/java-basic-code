<%@ page import="java.util.ArrayList" %>
<%@ page import="cn.itcast.domain.User" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: sjtuw
  Date: 2021/3/10
  Time: 11:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%
        ArrayList<Object> list = new ArrayList<>();
        list.add(new User("aaa",18,new Date()));
        list.add(new User("bbb",19,new Date()));
        list.add(new User("ccc",20,new Date()));
        request.setAttribute("list",list);
    %>

    <table border="1" width="500" align="center">
        <tr>
            <th>id</th>
            <th>name</th>
            <th>age</th>
            <th>birthday</th>
        </tr>
        <c:forEach items="${list}" var="user" varStatus="s">
            <c:if test="${s.count % 2 == 0}">
                <tr bgcolor="#ffd700">
                    <th>${s.count}</th>
                    <th>${user.name}</th>
                    <th>${user.age}</th>
                    <th>${user.birStr}</th>
                </tr>
            </c:if>
            <c:if test="${s.count % 2 != 0}">
                <tr bgcolor="red">
                    <th>${s.count}</th>
                    <th>${user.name}</th>
                    <th>${user.age}</th>
                    <th>${user.birStr}</th>
                </tr>
            </c:if>

        </c:forEach>
    </table>

</body>
</html>
