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
        out.println("<div class='container'>");
        out.println("<h1>Listado de libros</h1>");
        Database database = new Database();
        TaskDao taskDao = new TaskDao(database.getConnection());
        out.println("<ul class='list-group'>");
        List<Task> tasks = taskDao.findAll();
        for (Task task : tasks) {
            out.println("<li class='list-group-item'><a href='book.jsp?id=" + task.getId() + "'>" + task.getTitle() + "</a></li>");
        }
        out.println("</ul>");
        out.println("</div>");
    }
}

