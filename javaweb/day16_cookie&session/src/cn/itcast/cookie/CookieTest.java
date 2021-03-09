package cn.itcast.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/cookieTest")
public class CookieTest extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html; charset=UTF-8");

        Cookie[] cookies = request.getCookies();

        boolean flag = false;
        if (cookies != null && cookies.length > 0) {
            for (Cookie cookie : cookies) {
                String name = cookie.getName();
                if ("lastTime".equals(name)) {



                    String value = cookie.getValue();

                    value = URLDecoder.decode(value,"utf-8");
                    response.getWriter().write("welcome back ,last time is "+value);

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

            response.getWriter().write("welcome  ");
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
