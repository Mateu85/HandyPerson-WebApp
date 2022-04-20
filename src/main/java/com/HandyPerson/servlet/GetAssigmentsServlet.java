package com.HandyPerson.servlet;


import com.HandyPerson.dao.Database;
import com.HandyPerson.dao.TaskDao;
import com.HandyPerson.domain.Task;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


@WebServlet("/taskList")
public class GetAssigmentsServlet extends HttpServlet {

    @Override

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<head>\n" +
                " <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\"> " +
                "  <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\"> " +
                " <link href=\"/JavaWebApp/css/style.css\" rel=\"stylesheet\"> " +
                "</head>");
        out.println("<body>");
        out.println("<button type=\"button\" class=\"btn btn-secondary btn-lg btn-block\"onClick=\"parent.location='index.jsp'\">Block level button</button>");
        out.println("<div class='container mt-5 w-25'>");
        out.println("<h5 class=\"text-secondary text-center\">List of Assignments In your Area</h5>");
        Database database = new Database();
        TaskDao taskDao = new TaskDao(database.getConnection());
        out.println("<ul class='list-group list-group-flush'>");
        List<Task> tasks = taskDao.findAll();
        for (Task task : tasks) {
            out.println("<li style=\"background-color: #e9ecef;;\" class=\"d-flex align-items-start d-flex list-group-item\">");
            out.println("<a class=\"text-secondary text-decoration-none\" href='task?id=" + task.getId() + "'>" + task.getTitle() + "</a>");
            out.println("</li>");
            out.println("<li class=\"d-flex justify-content-end mb-5 mt-1 \">");

            // <a href="delete-book?id=<%= task.getId() %>" class="btn btn-outline-danger">Delete</a>
            out.println("<a class=\"text-danger text-decoration-none\" href='delete-task?id=" + task.getId() + "'> DELETE</a>");
            //out.println("<button type=\"button\" class=\"btn btn-info\">+Info</button>");
            //out.println("<button type=\"button\" class=\"  btn btn-secondary\">MODIFY</button>");
            out.println("</li>");
        }
        out.println("</ul>");
        out.println("</div>");
        out.println("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>");
        out.println("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>");
        out.println("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>");
        out.println("</body>");
    }
}

