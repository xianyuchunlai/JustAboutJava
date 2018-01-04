import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PricticeServlet",urlPatterns = "/prictice")
public class PricticeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//       Long
        Object count = getServletContext().getAttribute("count");

        if (count == null) {

            getServletContext().setAttribute("count", 1L);
            System.out.println("这是第一次");
        } else {

//            long l =Long.parseLong(count.toString());
            long l = (long) count;
            l++;
            String c = String.valueOf(l);
            System.out.println("这是"+l+"次");

//            自动装箱----Long
            getServletContext().setAttribute("count", l);
        }
    }
}
