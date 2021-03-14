package cn.itcast.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/*")
public class FilterDemo2 implements Filter {
    @Override
    public void destroy() {
        System.out.println("destroy2...");
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("filterdemo2...");
        chain.doFilter(req, resp);
        System.out.println("filterdemo2 back");
    }

    @Override
    public void init(FilterConfig config) throws ServletException {
        System.out.println("init2...");

    }

}
