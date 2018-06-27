package com.servlets;

import com.data.User;
import com.data.UsersDAO;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class UsersServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        UsersDAO dao = new UsersDAO();
        List<User> users = dao.getAll();

        StringBuilder builder = new StringBuilder();

        builder.append("<html>");
        builder.append("<body>");

        builder.append("<table>");
        builder.append("<thead>");
        builder.append("<th>Email</th>");
        builder.append("<th>Password</th>");
        builder.append("<th>Name</th>");
        builder.append("</thead");

        builder.append("<tbody>");

        for (User user : users) {
            builder.append("<tr>");

            builder.append("<td>");
            builder.append(user.getEmail());
            builder.append("</td>");

            builder.append("<td>");
            builder.append(user.getPassword());
            builder.append("</td>");

            builder.append("<td>");
            builder.append(user.getName());
            builder.append("</td>");

            builder.append("</tr>");

            builder.append("<form action = \"/\">");
            builder.append(user.getName());
            builder.append(user.getPassword());
            builder.append("</form action>");

        }

        builder.append("</tbody>");
        builder.append("</table>");
        builder.append("</body>");
        builder.append("</html>");

        resp.getWriter().write(builder.toString());

    }
}
