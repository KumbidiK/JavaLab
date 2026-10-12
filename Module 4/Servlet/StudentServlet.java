// StudentServlet.java - Basic Servlet (Roll 23, Q3)
// Displays student information on Apache Tomcat

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class StudentServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Student Info</title></head>");
        out.println("<body>");
        out.println("<h2>Student Information</h2>");

        out.println("<table border='1' cellpadding='5'>");
        out.println("<tr><th>Roll No</th><th>Name</th>" +
                    "<th>Course</th><th>Marks</th></tr>");

        out.println("<tr><td>101</td><td>Achyuth</td>" +
                    "<td>MCA</td><td>88.5</td></tr>");

        out.println("<tr><td>102</td><td>Naveen</td>" +
                    "<td>MCA</td><td>92.0</td></tr>");

        out.println("<tr><td>103</td><td>Priya</td>" +
                    "<td>MCA</td><td>85.0</td></tr>");

        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
    }
}

/*
web.xml configuration:

<web-app>
    <servlet>
        <servlet-name>StudentServlet</servlet-name>
        <servlet-class>StudentServlet</servlet-class>
    </servlet>
    <servlet-mapping>
        <servlet-name>StudentServlet</servlet-name>
        <url-pattern>/student</url-pattern>
    </servlet-mapping>
</web-app>
*/
