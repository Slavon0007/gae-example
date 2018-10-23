package com.servlets;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CountToTenServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Cookie[] cookies = request.getCookies();// мы получаем масив куки
        int b = 10;                             // обьявляем переменную
        if (cookies == null) {                  // задаем параметр если куки  равны нал
            Cookie cookie = new Cookie("q", "10");// создать новую переменную куки и записать параметры
            cookie.setMaxAge(10);                              // определяем время жизни куки
            response.addCookie(cookie);                       // добовляем куки в массив
            response.getWriter().print(10);                  // у респонса вызываем метод записать число 10
        } else {
            for (Cookie cookie : cookies) {                 // перебераем масив кук
                if (cookie.getName().equals("q")) {         // добовляем условия и сравниваем строковое значение
                    int a = Integer.parseInt(cookie.getValue());// записываем в числовое значения строку
                    int c = a + b;                              // создаем переменную
                    cookie.setValue(String.valueOf(c));         //  теперь в куки перезаписываем строковое значение
                    response.addCookie(cookie);                 // добовляем куки
                    response.getWriter().print(c);              //  добовляем метод написать значения пременной С
                }
            }
        }
    }

}


