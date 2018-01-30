import com.opensymphony.xwork2.ActionSupport;
import jdk.internal.org.objectweb.asm.util.Printer;
import net.sf.json.JSONObject;
import org.apache.struts2.ServletActionContext;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author:chunLai
 * @Date: Created in 14:01 2018/1/23
 * @Ver.No: 1.0
 * @Description: 原生js获得json数据 2018-1-23 14:21:08
 * @param:
 * @ModifiedBy: NONE
 */
public class TestAction extends ActionSupport {
    public String test() throws IOException {
        javax.servlet.http.HttpServletResponse response = ServletActionContext.getResponse ();


        String name = "{'name':'zhangsan'}";
        JSONObject jsonObject = JSONObject.fromObject ( name );
        response.setContentType ( "text/html;charset=utf-8" );
         PrintWriter witer= response.getWriter ();

         witer.write ( jsonObject.toString () );

         witer.close ();

        return SUCCESS;
    }

}
