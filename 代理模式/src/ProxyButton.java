/**
 * @Author:chunLai
 * @Date: Created in 14:05 2018/1/19
 * @Ver.No: 1.0
 * @Description:
 * @param:
 * @ModifiedBy: NONE
 */
public class ProxyButton implements IFunction {
    //代理对象中必须要有被代理对象的引用
    private IFunction function;

    //角色名称
    private String roleName;

    public ProxyButton(IFunction function, String roleName) {
        this.function = function;
        this.roleName = roleName;
    }

    @Override
    public void click() {
        if ("管理员".equals ( roleName )){
            function.click ();

            System.out.println ( "校验合格" );
        }else {
            System.out.println ( "没有权限点击" + function.getBtnName ());
        }
    }

    @Override
    public String getBtnName() {
        return null;
    }
}
