package com.servlets;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.ResponseWrapper;
import java.io.IOException;

public class UserFilter implements Filter {


    public void init(FilterConfig filterConfig) throws ServletException {

    }


    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

////////////////////////////////////////////////////////////////////////////////////////////////
        chain.doFilter(request, response);
///////////////////////////////////////////////////////////////////////////////////////////////
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;

        if (httpServletRequest.getCookies() == null) {


            HttpServletResponse httpServletResponse = (HttpServletResponse) response;
            httpServletResponse.sendRedirect("/not/authorized");

        }

    }

    @Override
    public void destroy() {

    }
}