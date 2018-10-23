package com.servlets;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.exception.MethodInvocationException;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.exception.ResourceNotFoundException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CountServlet extends HttpServlet {


    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        int value;

        Cookie[] cookies = request.getCookies(); //я взял с клиента значение куки
        if (cookies == null) {//если значения пустые создаю новый масивв куки и записываю новое куки
            Cookie cookie = new Cookie("a", "0");
            cookie.setMaxAge(30);
            cookies = new Cookie[]{cookie};
            response.addCookie(cookies[0]); // я ложу ноль что бы получить следующее значение
        } else {                            //циклом фор перебераю масив
            for (Cookie cookie : cookies) {
                value = Integer.parseInt(cookie.getValue());  // в переменную записываю значения куки и перевожу в инт
                value++;                                    // делаю инкрементацию
                cookie.setValue(String.valueOf(value));     //записываю в куки значения инкримента и перевожу в стринг
                response.getWriter().write(String.valueOf(value)); // вывожу значения на сервер в стринг
                response.addCookie(cookie);                  // ложу куки клиенту
            }
        }

        // response.setContentType("text/html");

    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }


}
