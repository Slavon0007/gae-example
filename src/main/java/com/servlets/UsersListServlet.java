package com.servlets;

import com.data.User;
import com.data.UsersDAO;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.exception.MethodInvocationException;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.exception.ResourceNotFoundException;

import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class UsersListServlet extends HttpServlet {



    @Override
    protected  void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {


        VelocityContext context = new VelocityContext();

        User user = new User();

        UsersDAO dao = new UsersDAO();

        List<User> users = dao.getAll();

        context.put("users", users);
        context.put("user",user);
        Template template;

        Cookie[] cookies = req.getCookies();

        for(Cookie cookie:cookies)
           cookie.getValue();



            try {
            //создание обьекта типа Template с помощью метода getTemplate библиотеки Velocity который
            //в качестве аргумента принимает параметр типа String, который яляется путем к файлу шаблона
            template = Velocity.getTemplate("templates/userList.html");

            template.merge(context, resp.getWriter());
        } catch (ResourceNotFoundException e) {

            resp.getWriter().write(e.getMessage());
        } catch (ParseErrorException pee) {

            resp.getWriter().write(pee.getMessage());
        } catch (MethodInvocationException e) {

            resp.getWriter().write(e.getMessage());
        }

    }
}
