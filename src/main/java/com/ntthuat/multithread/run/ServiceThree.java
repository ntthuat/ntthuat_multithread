package com.ntthuat.multithread.run;

/**
 * @author ntthuat
 */
public class ServiceThree implements Runnable {
    @Override
    public void run() {
        System.out.println("Started service Three");
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finished service Three");
    }
}
