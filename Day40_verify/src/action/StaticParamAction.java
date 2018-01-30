package action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @Author:chunLai
 * @Date: Created in 14:31 2018/1/16
 * @Ver.No: 1.0
 * @Description:
 * @param:
 * @ModifiedBy:
 */
public class StaticParamAction extends ActionSupport {
    private String username;
    private String password;

    @Override
    public String execute() throws Exception {
        System.out.println ( username );
        System.out.println ( password );

        return super.execute ();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
