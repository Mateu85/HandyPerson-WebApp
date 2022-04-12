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
import java.util.ArrayList;

@WebServlet("/searchAssignment")
public class SearchaSsigmentServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String searchAssignment = request.getParameter("searchAssignment");

        Database database = new Database();
        TaskDao taskDao = new TaskDao(database.getConnection());
        ArrayList<Task> books = taskDao.findAll();
        StringBuilder result = new StringBuilder("<ul class='list-group'>");
        for (Task book : books) {
            result.append("<li class='list-group-item'>").append(book.getTitle()).append("</li>");
        }
        result.append("</ul>");
        out.println(result);
    }
}