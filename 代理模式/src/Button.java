/**
 * @Author:chunLai
 * @Date: Created in 14:02 2018/1/19
 * @Ver.No: 1.0
 * @Description:
 * @param:
 * @ModifiedBy: NONE
 */
public class Button implements IFunction {
    private String btnName;

    public String getBtnName() {
        return btnName;
    }

    public Button(String btnName) {
        this.btnName = btnName;
    }

    @Override
    public void click() {
        System.out.println ( this.btnName + "按钮被点击了" );
    }
}
