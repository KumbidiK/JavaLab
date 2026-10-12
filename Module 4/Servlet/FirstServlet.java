// FirstServlet.java - Servlet Chaining (Roll 25, Q3)
// Processes request and forwards/includes to SecondServlet

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FirstServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Servlet Chaining</title></head>");
        out.println("<body>");
        out.println("<h2>First Servlet</h2>");
        out.println("<p>Processing in FirstServlet...</p>");

        // Set an attribute for the second servlet
        request.setAttribute("message",
            "Hello from FirstServlet!");

        // Forward to second servlet
        out.println("<p>Forwarding to SecondServlet...</p>");

        RequestDispatcher rd =
            request.getRequestDispatcher("/second");

        // Use include to include output of second servlet
        rd.include(request, response);

        out.println("<p>Back in FirstServlet after " +
                    "include</p>");
        out.println("</body>");
        out.println("</html>");
    }
}

/*
web.xml configuration:

<servlet>
    <servlet-name>FirstServlet</servlet-name>
    <servlet-class>FirstServlet</servlet-class>
</servlet>
<servlet-mapping>
    <servlet-name>FirstServlet</servlet-name>
    <url-pattern>/first</url-pattern>
</servlet-mapping>
*/
