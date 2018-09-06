package com.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserForm extends HTMLServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String name = req.getParameter("slavkaklimov");
        String pasword = "slavakava";

        StringBuilder builder = new StringBuilder();
        builder.append("<html>");
        builder.append("<head>");
        builder.append("<head>");
        builder.append("<body>");
        builder.append("<form action=\"/login\" method=\"post\">");
        builder.append("<div class=\"form-group\">");
        builder.append("<label for=\"email\">email</label>");
        builder.append("<input type=\"email\" class=\"form-control\" id=\"email\" name=\"email\">");
        builder.append(" </div>");
        builder.append(" <div class=\"form-group\">");
        builder.append(" <label for=\"pwd\">Password:</label>");
        builder.append("<input type=\"password\" class=\"form-control\" id=\"pwd\" name=\"password\">");
        builder.append(" </div>");
        builder.append("<div class=\"checkbox\">");
        builder.append(" <label><input type=\"checkbox\"> Remember me</label>");
        builder.append(" </div>");
        builder.append("<button type=\"submit\" class=\"btn btn-default\">Submit</button>");
        builder.append("</form>");
        builder.append("<body>");
        builder.append("</html>");

        resp.getWriter().write(builder.toString());
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

