// ErrorServlet.java - Servlet Error Handling (Roll 25, Q1)
// Generates an error and uses custom error page

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ErrorServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("action");

        if ("arithmetic".equals(action)) {
            // Intentional ArithmeticException
            int result = 10 / 0;
        }
        else if ("null".equals(action)) {
            // Intentional NullPointerException
            String str = null;
            str.length();
        }
        else if ("404".equals(action)) {
            response.sendError(
                HttpServletResponse.SC_NOT_FOUND,
                "Page not found"
            );
            return;
        }
        else {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            out.println("<html>");
            out.println("<head><title>Error Demo</title></head>");
            out.println("<body>");
            out.println("<h2>Error Handling Demo</h2>");
            out.println("<a href='error?action=arithmetic'>" +
                        "ArithmeticException</a><br><br>");
            out.println("<a href='error?action=null'>" +
                        "NullPointerException</a><br><br>");
            out.println("<a href='error?action=404'>" +
                        "404 Error</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}

/*
web.xml configuration:

<servlet>
    <servlet-name>ErrorServlet</servlet-name>
    <servlet-class>ErrorServlet</servlet-class>
</servlet>
<servlet-mapping>
    <servlet-name>ErrorServlet</servlet-name>
    <url-pattern>/error</url-pattern>
</servlet-mapping>

<!-- Custom Error Pages -->
<error-page>
    <exception-type>java.lang.ArithmeticException</exception-type>
    <location>/errorPage.jsp</location>
</error-page>
<error-page>
    <exception-type>java.lang.NullPointerException</exception-type>
    <location>/errorPage.jsp</location>
</error-page>
<error-page>
    <error-code>404</error-code>
    <location>/errorPage.jsp</location>
</error-page>

--- errorPage.jsp ---

<%@ page isErrorPage="true" %>
<html>
<head><title>Error Page</title></head>
<body>
    <h2>Custom Error Page</h2>
    <p>An error occurred!</p>
    <p>Error: <%= exception != null ? exception.getMessage() : "Unknown" %></p>
    <p>Status Code: <%= response.getStatus() %></p>
    <a href="error">Go Back</a>
</body>
</html>
*/
