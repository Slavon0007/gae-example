package com.servlets;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.exception.MethodInvocationException;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.exception.ResourceNotFoundException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.StringWriter;

public class UserForm extends HTMLServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Velocity.init();

        VelocityContext context = new VelocityContext();

        Template template = null;

        try
        {
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

        String login = "slava@dot.com";
        String pass = "Slava";

        if (pass.equals(password) && login.equals(user)){
            response.sendRedirect("/users");
        } else {
            response.sendRedirect("/login");
        }
    }

}

