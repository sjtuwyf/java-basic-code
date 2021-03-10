<%@ page import="cn.itcast.domain.User" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: sjtuw
  Date: 2021/3/10
  Time: 10:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>get data</title>
</head>
<body>

    <%
        User user = new User();
        user.setName("zs");
        user.setAge(23);
        user.setBirthday(new Date());

        request.setAttribute("u",user);

        ArrayList<Object> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add(user);

        request.setAttribute("list",list);

        HashMap<Object, Object> map = new HashMap<>();

        map.put("sname","lisi");
        map.put("gender","male");
        map.put("user",user);
        request.setAttribute("map",map);

    %>

    <h3>get source</h3>
    ${requestScope.u}<br>
    ${u.name}<br>
    ${u.age}<br>
    ${u.birthday.year}<br>
    ${u.birthday.year}<br>
    ${u.birStr}<br>


    <h3>get list</h3>
    ${list}<br>
    ${list[0]}<br>
    ${list.get(0)}<br>
    ${list[10]}<br>
    ${list[2].name}<br>
    ${list[2].name}<br>
    ${list[0]}<br>



    <h3>get map</h3>
    ${map.gender}<br>
    ${map["sname"]}<br>
    ${map.user.name}<br>


    <h3>empty</h3>

    <%
        String str = "";
        request.setAttribute("str",str);

    %>

    ${empty str}<br>
    ${not empty str}<br>
</body>
</html>
