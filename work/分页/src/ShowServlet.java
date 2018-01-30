import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author:chunLai
 * @Date: Created in 20:44 2018/1/12
 * @Ver.No:
 * @Description:
 * @param:
 * @ModifiedBy:
 */
@WebServlet(name = "ShowServlet" ,urlPatterns = "/show")
public class ShowServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String pc = request.getParameter ( "pc" );

        PageBean pageBean= new PageBean (  );

       if (pc ==null){
           pc ="1";
       }
        System.out.println (pc);

        int p = Integer.parseInt ( pc );
        int begin =(p-1)* PageBean.getPageSize();
        int end = p * PageBean.getPageSize();
        StringBuilder sb = new StringBuilder (  );

        String name =request.getParameter ( "name" );
        String gender =request.getParameter ( "gender" );
        String age =request.getParameter ( "age" );
        String job =request.getParameter ( "job" );

        String[] ps = {"name","gender","age","job"};
        String[] pv={name,gender,age,job};

        String params = "";
        for (int i = 0; i < pv.length; i++) {
            if(pv[i] != null){
                params +="&"+ps[i]+"="+pv[i];
            }
        }
        PageBean.setParams(params);

        List<String> pl =new ArrayList<> (  );
        sb.append ( "select * from person" );
      if (name!=null||gender!=null||age!=null||job!=null){
          sb.append ( "where" );

      }



    }
}
