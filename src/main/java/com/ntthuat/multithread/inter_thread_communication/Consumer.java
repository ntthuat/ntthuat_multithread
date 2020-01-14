package com.ntthuat.multithread.inter_thread_communication;

import lombok.extern.slf4j.Slf4j;

import java.util.Queue;

/**
 * @author ntthuat
 */
@Slf4j
public class Consumer extends Thread {

    private final Queue sharedQ;

    public Consumer(Queue sharedQ) {
        super("Consumer");
        this.sharedQ = sharedQ;
    }

    @Override
    public void run() {
        while (true) {

            synchronized (sharedQ) {
                //waiting condition - wait until Queue is not empty
                while (sharedQ.size() == 0) {
                    try {
                        log.debug("Queue is empty, waiting");
                        sharedQ.wait();
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
                int number = (Integer) sharedQ.poll();
                log.debug("consuming : " + number);
                sharedQ.notify();

                //termination condition
                if (number == 3) {
                    break;
                }
            }
        }
    }

}
