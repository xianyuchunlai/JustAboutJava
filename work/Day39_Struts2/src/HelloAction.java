import com.opensymphony.xwork2.ActionSupport;

/**
 * @Author:chunLai
 * @Date: Created in 9:31 2018/1/15
 * @Ver.No:
 * @Description:
 * @param:
 * @ModifiedBy:
 */
public class HelloAction extends ActionSupport {
    public String hello() {
        System.out.println ("执行了hello方法");
        return "success";
    }

    /**
     * 如果在struts.xml配置文件中
     * 未指定该action到底要执行Action类中的哪个方法
     * 则会默认调用execute方法
     * 这个方法调用super.execute时,会默认返回success
     *
     * @return
     * @throws Exception
     */

    @Override
    public String execute() throws Exception {
        return super.execute ();
    }
}
