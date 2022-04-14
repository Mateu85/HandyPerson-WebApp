<%@ page import="com.svalero.amazonwebapp.dao.Database" %>
<%@ page import="com.svalero.amazonwebapp.dao.BookDao" %>
<%@ page import="com.svalero.amazonwebapp.domain.Book" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.util.List" %>

<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <h2>See every Assignments In your Area</a>h2>
        <ul class="list-group">
            <%
                Database database = new Database();
                TaskDao taskDao = new TaskDao(database.getConnection());
                try {
                    List<Task> tasks = taskDao.findAll();
                    for (Task task : tasks) {
            %>
                        <li class="list-group-item"><a target="_blank" href="task?id=<%= task.getId() %>"><%= task.getTitle() %></a></li>
            <%
                    }
               } catch (SQLException sqle) {
            %>
                    <div class="alert alert-danger" role="alert">
                      Error conectando con la base de datos
                    </div>
            <%
               }
            %>
        </ul>
    </div>
</body>
</html>