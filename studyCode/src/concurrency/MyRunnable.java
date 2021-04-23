package concurrency;

import java.util.Date;

/**
 * @Description
 * @Author 李泽坤5
 * @Date 2021 2021/4/23 16:57
 */
public class MyRunnable implements Runnable{

    private String command;

    public MyRunnable(String s){
        this.command = s;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+ "Start.Time = " + new Date());
        processCommand();
        System.out.println(Thread.currentThread().getName() + "End.Time = " + new Date());
    }

    private void processCommand() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "MyRunnable{" +
                "command='" + command + '\'' +
                '}';
    }
}
