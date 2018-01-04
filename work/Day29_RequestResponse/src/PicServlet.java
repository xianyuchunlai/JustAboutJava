import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;

@WebServlet(name = "PicServlet", urlPatterns = "/pic")
public class PicServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        FileInputStream fis =
                new FileInputStream("D:/AboutJAVA/work/Day29_RequestResponse/src/img/qq.gif");

        byte[] pics = new byte[1024 * 1024 * 1024];

        int length = fis.read(pics);

        fis.close();

        response.getOutputStream()
                .write(pics,0,length);
    }
}
