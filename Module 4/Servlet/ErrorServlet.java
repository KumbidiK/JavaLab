import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ErrorServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("action");

        if ("arithmetic".equals(action)) {

            int result = 10 / Integer.parseInt("0");
        }
        else if ("null".equals(action)) {

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
