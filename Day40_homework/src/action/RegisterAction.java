package action;

import bean.User;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ServletRequestAware;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author:chunLai
 * @Date: Created in 19:12 2018/1/16
 * @Ver.No:
 * @Description:
 * @param:
 * @ModifiedBy:
 */
public class RegisterAction extends ActionSupport implements ServletRequestAware{
    private User user;

    @Override
    public String toString() {
        return "RegisterAction{" +
                "user=" + user +
                '}';
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public RegisterAction(User user) {

        this.user = user;
    }

    public String register(){
        List<User> users=   new ArrayList<> (  );
        users.add ( user );
        System.out.println (user);
        System.out.println (users.toString ());
        return SUCCESS;
    }

    @Override
    public void setServletRequest(HttpServletRequest httpServletRequest) {

    }
}
