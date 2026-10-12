// Controller - StudentServlet.java (MVC CRUD)

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class StudentServlet extends HttpServlet {

    private StudentDAO dao = new StudentDAO();

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("action");

        if (action == null) action = "list";

        switch (action) {
            case "delete":
                int id = Integer.parseInt(
                    request.getParameter("id")
                );
                dao.deleteStudent(id);
                response.sendRedirect("StudentServlet");
                break;

            default:
                List<Student> list = dao.getAllStudents();
                request.setAttribute("students", list);
                RequestDispatcher rd =
                    request.getRequestDispatcher("index.jsp");
                rd.forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("action");

        int id = Integer.parseInt(
            request.getParameter("id")
        );
        String name = request.getParameter("name");
        double marks = Double.parseDouble(
            request.getParameter("marks")
        );

        Student s = new Student(id, name, marks);

        if ("update".equals(action)) {
            dao.updateStudent(s);
        } else {
            dao.addStudent(s);
        }

        response.sendRedirect("StudentServlet");
    }
}
