package com.ntthuat.multithread.notify;

/**
 * @author ntthuat
 */
public class NotificationTest {
    public static void main(String[] args) throws InterruptedException {
        Action action = new Action();
        WaitTask waitTask = new WaitTask(action);
        NotifyTask notifyTask = new NotifyTask(action);
        Thread t1 = new Thread(waitTask, "WT1"); //will wait
        Thread t2 = new Thread(waitTask, "WT2"); //will wait
        Thread t3 = new Thread(waitTask, "WT3"); //will wait
        Thread t4 = new Thread(notifyTask, "NT1"); //will notify

        t1.start();
        t2.start();
        t3.start();

        //pause to ensure all waiting thread started successfully
        Thread.sleep(200);

        //starting notifying thread
        t4.start();

    }
}
