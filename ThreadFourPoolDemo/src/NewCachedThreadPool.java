import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author:chunLai
 * @Date: Created in 14:03 2018/1/17
 * @Ver.No:
 * @Description:
 * @param:
 * @ModifiedBy:
 */
public class NewCachedThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService =
                Executors.newCachedThreadPool ();
        for (int i = 0; i < 10; i++) {
            final int index = i;
//            try {
//                Thread.sleep ( index * 2000 );
//            } catch (InterruptedException e) {
//                e.printStackTrace ();
//            }
            executorService.execute (
                    new Runnable () {
                        @Override
                        public void run() {
                            System.out.println ( index );
                            try {
                                Thread.sleep ( index * 2000 );
                            } catch (InterruptedException e) {
                                e.printStackTrace ();
                            }
                        }
                    }
            );
        }
    }
}
