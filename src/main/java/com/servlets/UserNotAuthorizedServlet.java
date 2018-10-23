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

public class UserNotAuthorizedServlet extends HttpServlet {

    @Override
    public  void  doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
////////////////////////////////////////////////////////////////////////////////////////////////
        VelocityContext context = new VelocityContext();
        Template template;
/////////////////////////////////////////////////////////////////////////////////////////////////
        try
        {
            //создание обьекта типа Template с помощью метода getTemplate библиотеки Velocity который
            //в качестве аргумента принимает параметр типа String, который яляется путем к файлу шаблона
            template = Velocity.getTemplate("templates/UserNotAuthorized.html");
            template.merge( context, response.getWriter() );
        }
        catch( ResourceNotFoundException e )
        {
            response.getWriter().write(e.getMessage());
        }
        catch( ParseErrorException pee )
        {
            response.getWriter().write(pee.getMessage());
        }
        catch( MethodInvocationException e )
        {
            response.getWriter().write(e.getMessage());
        }

    }
}
