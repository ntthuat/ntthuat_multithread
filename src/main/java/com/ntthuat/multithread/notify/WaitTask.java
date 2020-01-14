package com.ntthuat.multithread.notify;

import lombok.extern.slf4j.Slf4j;

/**
 * @author ntthuat
 */
@Slf4j
public class WaitTask implements Runnable {

    private final Action action;

    public WaitTask(Action action) {
        this.action = action;
    }

    @Override
    public void run() {
        try {
            action.shouldGo();
        } catch (InterruptedException ex) {
            log.error("Error");
            ex.printStackTrace();
        }
        System.out.println(Thread.currentThread() + " finished Execution");
    }
}
