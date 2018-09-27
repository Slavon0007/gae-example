package com.servlets;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SetCookieServlet extends HttpServlet {

    public  void  doGet(HttpServletRequest request, HttpServletResponse response) throws SecurityException, IOException{

        Cookie cookie = new Cookie("Some_id","002");
        Cookie cookie1 = new Cookie("name","vova");

        cookie1.setMaxAge(24*60*60);
        cookie.setMaxAge(24*60*60);

        response.addCookie(cookie1);
        response.addCookie(cookie);

    }
}
