<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Header</title>
<link href="/JavaWebApp/css/style.css" rel="stylesheet">
</head>

<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">HandyPerson</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarText">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
      <a class="nav-link" href="taskList">Task List</a>
      </li>
      <li class="nav-item">
       <a class="nav-link" href="addtask.jsp">Add Task</a>
      </li>
      <li class="nav-item">
      <a class="nav-link" href="search.jsp">Search</a>
      </li>
    </ul>
    <span class="navbar-text">
      Get your Job Done..!!
    </span>
  </div>
</nav>

    <!--<ul class="list-group list-group-flush mt-5 w-25">
     <h2 class="text-center text-secondary">HandyPerson</h2>
      <li class="list-group-item"><p><a class="text-decoration-none" href="taskList">Have a look at the Assignments In your Area</a></p></li>
      <li class="list-group-item"><p><a class="text-decoration-none" href="addtask.jsp">Register a new assignment into the platform</a></p></li>
      <li class="list-group-item"><p><a class="text-decoration-none" href="search.jsp">Search Assignments In your Area</a></p></li>
    </ul>
    -->


    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>