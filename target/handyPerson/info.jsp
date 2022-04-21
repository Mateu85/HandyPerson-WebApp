<%
    String description = request.getParameter("description");
     String location = request.getParameter("location");
      String title = request.getParameter("title");

%>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
 <div>
 <button style="width: 100%;border-radius: 0px !important" type=button class="btn btn-secondary btn-lg btn-block" onClick="parent.location='index.jsp'">Back To Menu</button>
 <div>
<div class="card" style="width: 18rem;">
  <div class="card-body">
  <h5 class="card-title"><%= title %></h5>
    <h5 class="card-title">Location: <%= location %></h5>
    <h5 class="card-title">Description</h5>
    <p class="card-text"><%= description %></p>
  </div>
</div>
</body>