import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ServletRequestAware;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author:chunLai
 * @Date: Created in 11:21 2018/1/17
 * @Ver.No:
 * @Description:
 * @param:
 * @ModifiedBy:
 */
public class OgnlAction extends ActionSupport implements ServletRequestAware {

    private HttpServletRequest request;
    public String hello(){
        request.setAttribute ( "hello","dadas" );
        return SUCCESS;
    }

    public HttpServletRequest getRequest() {
        return request;
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }

    @Override
    public void setServletRequest(HttpServletRequest httpServletRequest) {
        this.request = httpServletRequest;
    }
}
