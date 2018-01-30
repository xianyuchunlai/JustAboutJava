package com.lanou3g.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;
import java.io.InputStream;

public class DownloadAction extends ActionSupport {

    private InputStream stream;

    public String down(){
//        获得在web下的图片
        ServletContext servletContext = ServletActionContext.getServletContext();
        stream = servletContext.getResourceAsStream("images/1.png");

        return SUCCESS;
    }

    public InputStream getStream() {
        return stream;
    }

    public void setStream(InputStream stream) {
        this.stream = stream;
    }
}
