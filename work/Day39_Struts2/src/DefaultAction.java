import com.opensymphony.xwork2.ActionSupport;

/**
 * @Author:chunLai
 * @Date: Created in 14:28 2018/1/15
 * @Ver.No:
 * @Description:
 * @param:
 * @ModifiedBy:
 */
public class DefaultAction extends ActionSupport {
    @Override
    public String execute() throws Exception {
        System.out.println ("执行了默认的类");
        return super.execute ();
    }


}
