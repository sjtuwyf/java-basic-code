<%@ page import="java.net.URLDecoder" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.net.URLEncoder" %><%--
  Created by IntelliJ IDEA.
  User: sjtuw
  Date: 2021/3/9
  Time: 19:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%



    Cookie[] cookies = request.getCookies();

    boolean flag = false;
    if (cookies != null && cookies.length > 0) {
        for (Cookie cookie : cookies) {
            String name = cookie.getName();
            if ("lastTime".equals(name)) {



                String value = cookie.getValue();

                value = URLDecoder.decode(value,"utf-8");
                %>

welcome back ,last time is <%=value%>
<%





                Date date = new Date();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String str_date = simpleDateFormat.format(date);

                str_date = URLEncoder.encode(str_date,"utf-8");



                cookie.setValue(str_date);
                cookie.setMaxAge(60*60*24*30);
                response.addCookie(cookie);

                flag = true;

                break;
            }
        }
    }

    if (cookies == null || cookies.length == 0 || flag == false) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str_date = simpleDateFormat.format(date);
        str_date = URLEncoder.encode(str_date,"utf-8");

        Cookie cookie = new Cookie("lastTime", str_date);


//            cookie.setValue(str_date);
        cookie.setMaxAge(60*60*24*30);
        response.addCookie(cookie);
%>
        welcome
<%
    }




%>

</body>
</html>
