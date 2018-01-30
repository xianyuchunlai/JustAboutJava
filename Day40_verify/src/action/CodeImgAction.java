package action;

import com.opensymphony.xwork2.ActionSupport;
import com.xianyuchunlai.util.VerifyCode;
import org.apache.struts2.ServletActionContext;

import java.io.IOException;

/**
 * @Author:chunLai
 * @Date: Created in 11:27 2018/1/16
 * @Ver.No:
 * @Description:
 * @param:
 * @ModifiedBy:
 */
public class CodeImgAction extends ActionSupport {
    public String codeImg() throws IOException {
        String output = VerifyCode.getInstance ().output (
                ServletActionContext.getResponse ().getOutputStream ()
        );
        System.out.println (output);
        return SUCCESS;
    }

//    @Override
//    public String execute() throws Exception {
//        System.out.println ("-----");
//        return super.execute ();
//    }
}
