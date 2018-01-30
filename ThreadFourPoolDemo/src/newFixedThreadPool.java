import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author:chunLai
 * @Date: Created in 14:13 2018/1/17
 * @Ver.No:
 * @Description:
 * @param:
 * @ModifiedBy:
 */
public class newFixedThreadPool {
    public static void main(String[] args) {

        ExecutorService fixedThreadPool = Executors.newFixedThreadPool ( 3 );
        for (int i = 0; i < 10; i++) {

            final int index = i;
            fixedThreadPool.execute ( new Runnable () {
                @Override
                public void run() {
                    System.out.println ( index );
                    try {
                        Thread.sleep ( index * 2000 );
                    } catch (InterruptedException e) {
                        e.printStackTrace ();
                    }
                }
            } );
        }
    }
}
