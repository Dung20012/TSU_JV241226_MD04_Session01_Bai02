package ra.session_01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "InfoServlet", value = "/info")
public class InfoServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // gửi dữ liệu sang JSP
        request.setAttribute("id", 1);
        request.setAttribute("name", "Huấn");
        request.setAttribute("email", "huanrose@gmail.com");
        request.setAttribute("age", 18);

        // điều hướng qua file info.jsp
        request.getRequestDispatcher("info.jsp").forward(request, response);
    }
}
