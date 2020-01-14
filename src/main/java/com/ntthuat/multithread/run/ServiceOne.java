package com.ntthuat.multithread.run;

/**
 * @author ntthuat
 */
public class ServiceOne implements Runnable {
    @Override
    public void run() {
        System.out.println("Started service One");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finished service One");
    }
}
