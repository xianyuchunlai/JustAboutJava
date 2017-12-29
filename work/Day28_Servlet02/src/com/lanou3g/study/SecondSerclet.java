package com.lanou3g.study;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

public class SecondSerclet extends GenericServlet {
    /**
     * Servlet在web.xml文件的配置内容
     * 会被抽象成一个ServletConfig对象
     * 这个对象会在tomcat帮我们调用
     * init（ServletConfig）的时候传入
     * <p>
     * <p>
     * GenericServlet帮我们封装好了一步
     * this.ServletConfig =  ServletConfig
     * <p>
     * init()不是生命周期
     *
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */


    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }
}
