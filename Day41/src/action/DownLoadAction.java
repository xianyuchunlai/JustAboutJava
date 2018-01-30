package action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;
import java.io.InputStream;

public class DownLoadAction extends ActionSupport{

    private InputStream stream;
    private String filename;

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

    public String down(){
        filename = "gg.jpg";
        //获得在web下的图片
        ServletContext servletContext = ServletActionContext.getServletContext();
        stream = servletContext.getResourceAsStream("img/gg.jpg");
        return SUCCESS;
    }
}
