import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Result;
import com.xianyuchunlai.util.VerifyCode;
import org.apache.struts2.ServletActionContext;

/**
 * @Author:chunLai
 * @Date: Created in 11:34 2018/1/16
 * @Ver.No:
 * @Description:
 * @param:
 * @ModifiedBy:
 */
public class CodeImgResult extends ActionSupport implements Result {

    @Override
    public void execute(ActionInvocation actionInvocation) throws Exception {
        String output = VerifyCode.getInstance ().output (
                ServletActionContext.getResponse ().getOutputStream () );
        System.out.println ( output );

    }
}
