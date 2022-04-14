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
                "    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n" +
                "</head>");
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
    }
}

