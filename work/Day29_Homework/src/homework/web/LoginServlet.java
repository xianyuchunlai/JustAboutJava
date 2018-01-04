package homework.web;

import homework.dao.GetData;
import homework.mainDao.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "LoginServlet",urlPatterns = "/qs")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String uname = request.getParameter("uname");
        String password = request.getParameter("password");

        List<User> users = null;
        try {
            users = GetData.queryBeanList();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        for (User user : users) {
            if (user.getUname().equals(uname) && user.getPassword().equals(password)){
                response.sendRedirect("http://localhost:8080/123_login.html");

            }
        }

        RequestDispatcher rs = request.getRequestDispatcher("/show.html");
        rs.forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}
