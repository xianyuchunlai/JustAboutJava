import com.xianyuchunlai.util.VerifyCode;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * @Author:chunLai
 * @Date: Created in 20:33 2018/1/16
 * @Ver.No:
 * @Description:
 * @param:
 * @ModifiedBy:
 */
class test {
    public static void main(String[] args) throws IOException {
        VerifyCode code = new VerifyCode ();
        BufferedImage image = code.createImage();
        ImageIO.write(image,"jpg",new File ("C:\\Users\\lanou\\Desktop\\Day40"));
    }
}
