import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @Author:chunLai
 * @Date: Created in 14:27 2018/1/17
 * @Ver.No:
 * @Description:
 * @param:
 * @ModifiedBy:
 */
public class NewScheduledThreadPool1 {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService =
                Executors.newSingleThreadScheduledExecutor ();

        scheduledExecutorService.scheduleAtFixedRate ( new Runnable () {
            @Override
            public void run() {
                System.out.println ( "66666666" );
            }
        }, 2, 3, TimeUnit.SECONDS );
    }
}
