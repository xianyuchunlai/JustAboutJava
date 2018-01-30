/**
 * @Author:chunLai
 * @Date: Created in 14:48 2018/1/15
 * @Ver.No:
 * @Description:
 * @param:
 * @ModifiedBy:
 */
public class UserAction {
    /**
     * 因为对于User的操作
     * 肯定存在增删改查,或者其他的操作方式
     * 那么我们可以给UserAction写出对应的方法
     * 返回值我们可以自己定义
     * 在struts.xml中的result标签中
     * 可以找到对应的结果就可以了
     * @return
     */
    public String add() {
        return "add";
    }

    public String delete()  {
        return "delete";
    }

    public String modify(){
        return "modify";
    }
    public String query33(){
        return "queryOK";
    }
}
