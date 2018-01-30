package com.lanou3g.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;
import java.io.InputStream;

public class DownloadAction extends ActionSupport {

    private InputStream stream;
    private String filename;

    public String down() {
        filename = "dog.png";
//        获得在web下的图片
        ServletContext servletContext = ServletActionContext.getServletContext ();
        stream = servletContext.getResourceAsStream ( "img/dog.png" );

        return SUCCESS;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public InputStream getStream() {
        return stream;
    }

    public void setStream(InputStream stream) {
        this.stream = stream;
    }
}
