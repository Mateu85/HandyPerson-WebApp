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
import java.sql.SQLException;
import java.util.ArrayList;


@WebServlet("/search-books")

public class SearchTask extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String searchText = request.getParameter("searchtext");

        Database database = new Database();
        TaskDao taskDao = new TaskDao(database.getConnection());
        Task task = taskDao.findByTitle(searchText);
        StringBuilder result = new StringBuilder("<ul class='list-group'>");
        result.append("<li class='list-group-item'>").append(task.getTitle()).append("</li>");
        result.append("</ul>");
        out.println(result);
    }
}