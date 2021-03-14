package cn.itcast.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

//@WebFilter(value = "/index.jsp",dispatcherTypes = DispatcherType.FORWARD)
@WebFilter(value = "/index.jsp",dispatcherTypes = {DispatcherType.FORWARD,DispatcherType.REQUEST})
public class FilterDemo5 implements Filter {

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        System.out.println("demo5");
        chain.doFilter(req, resp);

        System.out.println("demo5");
    }

    @Override
    public void init(FilterConfig config) throws ServletException {
        System.out.println("init5...");

    }

    @Override
    public void destroy() {
        System.out.println("destroy5...");

    }

}
