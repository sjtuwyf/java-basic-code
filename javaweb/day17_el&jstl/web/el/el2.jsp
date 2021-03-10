<%--
  Created by IntelliJ IDEA.
  User: sjtuw
  Date: 2021/3/10
  Time: 9:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        session.setAttribute("name","zhangsssssssan");
        request.setAttribute("name","zzzzzzzhangsan");
        session.setAttribute("age","23");


    %>
    ${requestScope.name}<br>
    ${requestScope.get("name")}<br>
    ${sessionScope.age}<br>
    ${sessionScope.hh}<br>
    ${sessionScope.get("age")}<br>
    ${name}<br>
    ${age}<br>


</body>
</html>
