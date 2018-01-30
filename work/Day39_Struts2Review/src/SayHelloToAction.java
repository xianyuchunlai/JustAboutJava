import com.opensymphony.xwork2.ActionSupport;

/**
 * @Author:chunLai
 * @Date: Created in 17:52 2018/1/15
 * @Ver.No:
 * @Description:
 * @param:
 * @ModifiedBy:
 */
public class SayHelloToAction extends ActionSupport {
    public  String s(){
        System.out.println ("hello");
        return "s";
    }
}
