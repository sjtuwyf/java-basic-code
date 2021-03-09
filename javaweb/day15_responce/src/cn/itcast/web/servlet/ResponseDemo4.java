package cn.itcast.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/responseDemo4")
public class ResponseDemo4 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        response.setContentType("text/html;charset=utf-8");
//        response.setCharacterEncoding("utf-8");
//        response.setHeader("content-type","text/html;charset=utf-8");
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter pw = response.getWriter();
//        pw.write("<h1>Hello,response </h1>");
        pw.write("你 好");


    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doPost(request,response);
    }
}
