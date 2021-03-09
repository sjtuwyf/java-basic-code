package cn.itcast.web.servletcontext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

@WebServlet("/servletContextDemo5")
public class ServletContextDemo5 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        ServletContext context = this.getServletContext();

        String realPath = context.getRealPath("/b.txt");
        System.out.println(realPath);

//        File file = new File(realPath);
        String realPath1 = context.getRealPath("/WEB-INF/c.txt");
        System.out.println(realPath1);

        String realPath2 = context.getRealPath("/WEB-INF/classes/a.txt");
        System.out.println(realPath2);


    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doPost(request,response);
    }
}
