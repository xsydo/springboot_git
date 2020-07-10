package com.xsy.hr.filters;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author Xsy
 * @create 2020 - 07 - 07 - 10:31
 * @version:1.0
 **/
@WebFilter(urlPatterns = "/*", filterName = "loginFilter")
public class LoginFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding("UTF-8");
        servletResponse.setCharacterEncoding("UTF-8");

        HttpServletRequest req = (HttpServletRequest) servletRequest;
        String requestURI = req.getRequestURI();

        if (requestURI.indexOf("login") != -1) {
            filterChain.doFilter(servletRequest, servletResponse);
            return;
        }

        if(req.getSession().getAttribute("user") == null){
            req.getRequestDispatcher("/goto/login").forward(servletRequest,servletResponse);
        }
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
