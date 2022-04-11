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

        Database database = new Database();
        TaskDao taskDao = new TaskDao(database.getConnection());
        out.println("<ul>");
        List<Task> tasks = taskDao.findAll();
        for (Task task : tasks) {
            out.println("<li><p><a href='task.jsp?id=" + task.getId() + "'>" + task.getTitle() + "</a></p></li>");
        }
        out.println("</ul>");
        database.close();
    }
}
