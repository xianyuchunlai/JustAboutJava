import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author:chunLai
 * @Date: Created in 14:31 2018/1/17
 * @Ver.No:
 * @Description:
 * @param:
 * @ModifiedBy:
 */
public class NewSingleThreadExecutor {
    public static void main(String[] args) {
        ExecutorService singleThreadExecutor =
                Executors.newSingleThreadExecutor ();
        for (int i = 0; i < 1000000; i++) {
            final int index = i;
            singleThreadExecutor.execute ( new Runnable () {
                @Override
                public void run() {
                    System.out.println ( index );
                    try {
                        Thread.sleep ( 1);
                    } catch (InterruptedException e) {
                        e.printStackTrace ();
                    }
                }
            } );

        }
    }
}
