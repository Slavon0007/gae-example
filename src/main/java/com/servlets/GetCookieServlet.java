package com.servlets;

import javax.naming.Context;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class GetCookieServlet extends HttpServlet {
    public  void doGet(HttpServletRequest req, HttpServletResponse resp) throws SecurityException, IOException {

        Cookie[] cookies = req.getCookies();

        for( Cookie cookie : cookies){

        }

    }

}
