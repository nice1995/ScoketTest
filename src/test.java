import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

//定时任务
public class test {
    public static void main(String[] args) {


        //定时任务：方法1
       /* Runnable runnable = new Runnable() {
            @Override
            public void run() {
                while (true){
                    System.out.println("22");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();*/
        //定时任务：方法2
        /*TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("555");
            }
        };
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(task,0,2*1000);*/

        //定时任务：方法3
       /* Runnable runnable = new Runnable(){

            @Override
            public void run() {
                System.out.println(2255);
            }
        };
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        service.scheduleAtFixedRate(runnable,0,1, TimeUnit.SECONDS);*/

       //定时任务：方法4  基于spring框架的定时任务来实现：

    }
}
