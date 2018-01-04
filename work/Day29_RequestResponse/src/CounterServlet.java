import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CounterServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ServletContext context = getServletContext();   // 获得ServletContext对象
        Integer count = (Integer)context.getAttribute("counter");   // 从ServletContext中获得计数器对象
        if(count == null){      // 如果为空，则在ServletContext中设置一个计数器的属性.即在第一次提交请求时创建该属性
            count = 1;
            context.setAttribute("counter", count);
        }else{      // 之后的请求，每次对计数器值加1
            context.setAttribute("counter", count+1);
        }

        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
        out.println("<HTML>");
        out.println("  <HEAD><TITLE>统计网站访问次数</TITLE></HEAD>");
        out.println("  <BODY>");
        out.print("<h2><font color='gray'> ");
        out.print("您是第 "+context.getAttribute("counter")+" 位访客");
        out.println("</font></h2>");
        out.println("  </BODY>");
        out.println("</HTML>");
        out.flush();
        out.close();
    }

}