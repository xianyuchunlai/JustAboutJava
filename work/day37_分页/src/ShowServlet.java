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
 * @Date: Created in 10:41 2018/1/12
 * @Ver.No: 1..0
 * @Description:
 * @param:
 * @ModifiedBy:
 */
@WebServlet(name = "ShowServlet", urlPatterns = "/show")
public class ShowServlet extends HttpServlet {

//    private List<Book> books;

//    @Override
//    public void init() throws ServletException {
//
//        books = new ArrayList<> ();
//        for (int i = 0; i < 200; i++) {
//            Book book = new Book ( "西游记" +
//                    i, "吴承恩",
//                    i + "",
//                    "武侠小说" );
//            books.add ( book );
//        }
//    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获得前端给的当前页码的参数
        //pc=pageCode

        String pc = request.getParameter ( "pc" );

        //?一页取8个
        //第8页是什么地方到什么地方
        /*
        *56-63
        * 0-7
        * 8-15
        * 从哪开始 (pc-1)*pageSize
        * 到什么地方pc*pageSize
        * limit
         */

        PageBean pageBean = new PageBean ();



        int p = Integer.parseInt ( pc );
        int begin = (p - 1) * pageBean.getPageSize ();
        int end = p * pageBean.getPageSize ();
//        String sql = "select * from book limit ?,?";
//        qr.query(connection,sql,begin,end);


        List<Book> bookList = this.books.subList ( begin, end );


        System.out.println ( bookList.size () );

        pageBean.setBooks ( bookList );
        pageBean.setTotalDate ( 200 );
        pageBean.setPageCode ( p );

        request.setAttribute ( "pageBean", pageBean );
//       response.getWriter ().write ( "{}" );
        request.getRequestDispatcher ( "index.jsp" )
                .forward ( request, response );
    }

}

