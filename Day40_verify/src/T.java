
import com.xianyuchunlai.util.VerifyCode;
import org.junit.Test;

/**
 * @Author:chunLai
 * @Date: Created in 9:51 2018/1/16
 * @Ver.No:
 * @Description:
 * @param:
 * @ModifiedBy:
 */
public class T {
    @Test
    public void t() {
        String output = VerifyCode.getInstance ().output (
                "C:\\Users\\lanou\\Desktop\\Day40\\show.jpg" );
        System.out.println ( output );
    }

}
