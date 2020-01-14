package com.ntthuat.multithread;

import org.junit.jupiter.api.Test;

/**
 * @author ntthuat
 */
class FirstTest {

    @Test
    void testFirst() {
        MyThread myThread = new MyThread();
        myThread.setName("T1");

        Thread myRunnable = new Thread(new MyRunnable(), "T2");
        myThread.start();
        myRunnable.start();
    }
}
