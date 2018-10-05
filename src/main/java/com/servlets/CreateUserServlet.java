package com.servlets;

import com.data.User;
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

public class CreateUserServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("userKey", "mybest");
        cookie.setMaxAge(60);
        resp.addCookie(cookie);

        VelocityContext context = new VelocityContext();
        Template template;

        try {
            //создание обьекта типа Template с помощью метода getTemplate библиотеки Velocity который
            //в качестве аргумента принимает параметр типа String, который яляется путем к файлу шаблона
            template = Velocity.getTemplate("templates/createUser.html");
            template.merge(context, resp.getWriter());
        } catch (ResourceNotFoundException e) {
            resp.getWriter().write(e.getMessage());
        } catch (ParseErrorException pee) {
            resp.getWriter().write(pee.getMessage());
        } catch (MethodInvocationException e) {
            resp.getWriter().write(e.getMessage());
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws SecurityException, IOException {
        Cookie[] cookies = request.getCookies();

        if (cookies == null) {
            response.getWriter().write("No cookies. Access denied");
            return;
        }


        boolean isCookieValid = false;

        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("userKey") && cookie.getValue().equals("mybest")) {
                isCookieValid = true;
                break;
            }
        }

        if (!isCookieValid) {
            response.getWriter().write("Cookie is not valid");
            return;
        }

        User user = new User();

        String password = request.getParameter("password");
        user.setPassword(password);

        String email = request.getParameter("email");
        user.setEmail(email);

        String name = request.getParameter("name");
        user.setName(name);

        response.getWriter().write(user.toString());
    }
}