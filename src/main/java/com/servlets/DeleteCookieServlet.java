package com.servlets;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteCookieServlet extends HttpServlet {
    public  void doGet (HttpServletResponse resp, HttpServletRequest requ) throws SecurityException, IOException {
        Cookie cookie = new Cookie("Some_id","");

        cookie.setMaxAge(0);

    }
}
