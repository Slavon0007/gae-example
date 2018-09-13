package com.servlets;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.exception.MethodInvocationException;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.exception.ResourceNotFoundException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CreateUserServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        VelocityContext context = new VelocityContext();

        Template template = null;

        try
        {
            //создание обьекта типа Template с помощью метода getTemplate библиотеки Velocity который
            //в качестве аргумента принимает параметр типа String, который яляется путем к файлу шаблона
            template = Velocity.getTemplate("templates/login.html");
        }
        catch( ResourceNotFoundException e )
        {
            resp.getWriter().write(e.getMessage());
        }
        catch( ParseErrorException pee )
        {
            resp.getWriter().write(pee.getMessage());
        }
        catch( MethodInvocationException e )
        {
            resp.getWriter().write(e.getMessage());
        }

        template.merge( context, resp.getWriter() );

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws SecurityException, IOException {
        String password = request.getParameter("password");

        System.out.println("Password is: " + password);

        String user = request.getParameter("email");

        System.out.println("Login is; " + user);

        String name = request.getParameter("name");

        System.out.println("Login is; " + name);

        String confirmPassword = request.getParameter("confirm password");

        System.out.println("Login is; " + confirmPassword);
        

    }
 }

