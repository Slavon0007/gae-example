package com.servlets;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;

        response.getWriter().write("Hi! I called before servlet.doPost/Get method. Original url is: ");

        //chain.doFilter(request, response);

        response.getWriter().println("I called after servlet execution");
    }

    @Override
    public void destroy() {

    }
}
