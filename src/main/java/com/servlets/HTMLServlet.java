package com.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;


/**
 * Servlet try to parse 2 parameters and sum it. Simplest version without error handling
 */
public abstract class HTMLServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String num1 = req.getParameter("param1");
        String num2 = req.getParameter("param2");
        String num3 = req.getParameter("param3");
        String num4 = req.getParameter("param4");

        int a = Integer.parseInt(num1);
        int b = Integer.parseInt(num2);
        int c = Integer.parseInt(num3);
        int d = Integer.parseInt(num4);

        int[] array = new int[4];
        array[0] = a;
        array[1] = b;
        array[2] = c;
        array[3] = d;

        Arrays.sort(array);

        int max = 0;
        int v;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                v = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = v;
            }
        }



        for (int i = 0; i < array.length; i++) {
            resp.getWriter().write(array[i]);
        }
        resp.getWriter().write(max + "");
        resp.getWriter().write("**");

    }


    public abstract void  doGet()
}