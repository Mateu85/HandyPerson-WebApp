<%@ page import="com.HandyPerson.servlet.dao.Database" %>
<%@ page import="com.HandyPerson.servlet.dao.TaskDao" %>
<%@ page import="com.HandyPerson.servlet.domain.Task" %>
<%@ page import="java.util.Optional" %>
<%@ page import="java.sql.SQLException" %>

<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
    <%
        String bookId = request.getParameter("id");
        Database db = new Database();
        BookDao bookDao = new BookDao(db.getConnection());
        Book book = null;
        try {
            Optional<Book> optionalBook = bookDao.findById(Integer.parseInt(bookId));
            book = optionalBook.get();

    %>
    <div class="container">
        <div class="card text-center">
          <div class="card-header">
            Task Details
          </div>
          <div class="card-body">
            <h5 class="card-title"><%= task.getTitle() %></h5>
            <p class="card-text">description <strong><%= task.getDescription() %></strong></p>

          </div>
          <div class="card-footer text-muted">
           Location <strong><%= task.getLocation() %></strong>
          </div>
        </div>
    </div>
    <%
        } catch (SQLException sqle) {
    %>
        <div class='alert alert-danger' role='alert'>ERROR</div>
    <%
        }
    %>
</body>
</html>
