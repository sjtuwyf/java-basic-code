<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: sjtuw
  Date: 2021/3/10
  Time: 11:00
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
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");


        request.setAttribute("list",list);
    %>

    <c:forEach begin="1" end="10" var="i" step="2" varStatus="s">
        ${i} ${s.index} ${s.count}<br>
    </c:forEach>

    <hr>

    <c:forEach items="${list}" var="str" varStatus="s">
        ${s.index}  ${s.count} ${str} <br>
    </c:forEach>


</body>
</html>
