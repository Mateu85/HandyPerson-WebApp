<%
    int id = Integer.parseInt(request.getParameter("id"));
    out.println("<p>Get more info of an assignment by id " + id);
%>
<p>Task Details <%= id %></p>