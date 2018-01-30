import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @Author:chunLai
 * @Date: Created in 14:18 2018/1/17
 * @Ver.No:
 * @Description:
 * @param:
 * @ModifiedBy:
 */
public class NewScheduledThreadPool {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService =
                Executors.newSingleThreadScheduledExecutor ();

//        scheduledExecutorService.schedule ( new Runnable () {
//            @Override
//            public void run() {
//                System.out.println ("6666");
//            }
//        } ,2, TimeUnit.SECONDS);




    }
}
