package cn.itcast.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/*")
public class FilterDemo4 implements Filter {

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        System.out.println("demo4");
        chain.doFilter(req, resp);

        System.out.println("demo4");
    }

    @Override
    public void init(FilterConfig config) throws ServletException {
        System.out.println("init4...");

    }

    @Override
    public void destroy() {
        System.out.println("destroy4...");

    }

}
