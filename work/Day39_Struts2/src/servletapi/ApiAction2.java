package servletapi;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ServletRequestAware;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author:chunLai
 * @Date: Created in 16:42 2018/1/15
 * @Ver.No:
 * @Description:
 * @param:
 * @ModifiedBy:
 */
public class ApiAction2 extends ActionSupport implements ServletRequestAware {

    //实现XXXAware接口的方式,获得ServletAPI

    private HttpServletRequest request;

    @Override
    public void setServletRequest(HttpServletRequest httpServletRequest) {
        this.request = httpServletRequest;
    }

    public String api2() {
        //要在这里使用request
        this.request.setAttribute ( "", "" );

        return SUCCESS;
    }

}
