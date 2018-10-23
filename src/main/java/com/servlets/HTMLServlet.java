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
public class HTMLServlet extends HttpServlet {
//////////////////////////////////////////////////////////////////////////////////////////////
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String num1 = req.getParameter("param1");// обьявляем строковые переменные
        String num2 = req.getParameter("param2");
        String num3 = req.getParameter("param3");
        String num4 = req.getParameter("param4");

        int a = Integer.parseInt(num1);// записываем строковые значения в числовую переменную
        int b = Integer.parseInt(num2);
        int c = Integer.parseInt(num3);
        int d = Integer.parseInt(num4);

        int[] array = new int[4];//записываем вчисловой массив значения
        array[0] = a;
        array[1] = b;
        array[2] = c;
        array[3] = d;

        Arrays.sort(array);//сортируем массив

        int max = 0;//обьявляем новые переменные
        int v;//
////////////////////////////////////////////////////////////////////////////////////////////////
        for (int i = 0; i < array.length; i++) { //через цыкл записываем в массив значения
            if (array[i] > max) {                //ставим новое условия
                max = array[i];
                v = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = v;
            }
        }


        for (int i = 0; i < array.length; i++) {
            resp.getWriter().write(array[i]); // в респонс вызываем метод написать индексовое значения
        }
        resp.getWriter().write(max + ""); //
        resp.getWriter().write("**");     //

    }

}