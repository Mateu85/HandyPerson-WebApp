<%
    String description = request.getParameter("description");
    String location = request.getParameter("location");

%>

<p>Location<%= location %></p>
<p>Info<%= description %></p>