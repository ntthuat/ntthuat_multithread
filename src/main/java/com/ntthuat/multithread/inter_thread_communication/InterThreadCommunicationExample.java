package com.ntthuat.multithread.inter_thread_communication;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ntthuat
 */
public class InterThreadCommunicationExample {

    public static void main(String[] args) {

        final Queue sharedQ = new LinkedList();
        Thread producer = new Producer(sharedQ);
        Thread consumer = new Consumer(sharedQ);
        producer.start();
        consumer.start();
    }
}
