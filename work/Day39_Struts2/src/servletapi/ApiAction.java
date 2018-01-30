package servletapi;

import bean.User;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:chunLai
 * @Date: Created in 16:05 2018/1/15
 * @Ver.No:
 * @Description:
 * @param:
 * @ModifiedBy:
 */
public class ApiAction extends ActionSupport {
    public String api() {
        List<User> users = new ArrayList<> ();
        for (int i = 0; i < 10; i++) {
            User user = new User ();
            user.setAge ( ""+i );
            user.setUsername ( "名字" + i );
            users.add ( user );
        }

        ServletActionContext.getRequest ()
                .setAttribute ( "users", users );
        return SUCCESS;
    }

}
