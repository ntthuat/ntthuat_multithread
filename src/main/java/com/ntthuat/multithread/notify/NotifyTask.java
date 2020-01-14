package com.ntthuat.multithread.notify;

import lombok.extern.slf4j.Slf4j;

/**
 * @author ntthuat
 */
@Slf4j
public class NotifyTask implements Runnable {

    private final Action action;

    public NotifyTask(Action action) {
        this.action = action;
    }

    @Override
    public void run() {
        action.go();
        System.out.println(Thread.currentThread() + " finished Execution");
    }
}
