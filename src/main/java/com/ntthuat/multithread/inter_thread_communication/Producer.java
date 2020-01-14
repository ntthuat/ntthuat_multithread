package com.ntthuat.multithread.inter_thread_communication;

import lombok.extern.slf4j.Slf4j;

import java.util.Queue;

/**
 * @author ntthuat
 */
@Slf4j
public class Producer extends Thread {

    private final Queue sharedQ;

    public Producer(Queue sharedQ) {
        super("Producer");
        this.sharedQ = sharedQ;
    }

    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            synchronized (sharedQ) {
                //waiting condition - wait until Queue is not empty
                while (sharedQ.size() >= 1) {
                    try {
                        log.debug("Queue is full, waiting");
                        sharedQ.wait();
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
                sharedQ.add(i);
                log.debug("producing : " + i);
                sharedQ.notify();
            }
        }
    }

}
