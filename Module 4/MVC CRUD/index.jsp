<%-- index.jsp - Student CRUD View --%>
<%@ page import="java.util.*" %>

<html>
<head>
    <title>Student Management</title>
</head>
<body>

<h2>Student Management - CRUD</h2>

<h3>Add Student</h3>

<form method="post" action="StudentServlet">
    ID:    <input type="text" name="id"><br><br>
    Name:  <input type="text" name="name"><br><br>
    Marks: <input type="text" name="marks"><br><br>
    <input type="hidden" name="action" value="add">
    <input type="submit" value="Add Student">
</form>

<hr>

<h3>Student List</h3>

<table border="1" cellpadding="5">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Marks</th>
        <th>Action</th>
    </tr>

    <%
        List<Student> list =
            (List<Student>) request.getAttribute("students");

        if (list != null) {
            for (Student s : list) {
    %>
    <tr>
        <td><%= s.getId() %></td>
        <td><%= s.getName() %></td>
        <td><%= s.getMarks() %></td>
        <td>
            <a href="StudentServlet?action=delete&id=<%= s.getId() %>">
                Delete
            </a>
        </td>
    </tr>
    <%
            }
        }
    %>
</table>

</body>
</html>
