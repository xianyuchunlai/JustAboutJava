package action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @Author:chunLai
 * @Date: Created in 10:42 2018/1/16
 * @Ver.No:
 * @Description:
 * @param:
 * @ModifiedBy:
 */
public class ResultAction extends ActionSupport {
    public String plaintext() {
        return SUCCESS;
    }

    public String toGlobal() {
        System.out.println ( "请求转发到:Global包下的gr" );
        return SUCCESS;
    }
}
