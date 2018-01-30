/**
 * @Author:chunLai
 * @Date: Created in 14:10 2018/1/19
 * @Ver.No: 1.0
 * @Description:
 * @param:
 * @ModifiedBy: NONE
 */
public class Test {
    public static void main(String[] args) {
        IFunction target =
                new Button ( "提交按钮" );
        // 代理之前的:
        target.click ();
        System.out.println ( "--------------------" );


        //代理之后
        IFunction proxy = new ProxyButton ( target, "管理员" );
        proxy.click ();
    }
}
