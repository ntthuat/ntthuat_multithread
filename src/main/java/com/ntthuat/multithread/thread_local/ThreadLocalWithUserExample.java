package com.ntthuat.multithread.thread_local;

/**
 * @author ntthuat
 */
public class ThreadLocalWithUserExample {

    public static void main(String[] args) throws InterruptedException {
        ThreadLocalWithUserContext firstUser = new ThreadLocalWithUserContext(1);
        ThreadLocalWithUserContext secondUser = new ThreadLocalWithUserContext(2);
        Thread t1 = new Thread(firstUser);
        Thread t2 = new Thread(secondUser);
        t1.start();
        t2.start();
    }
}
