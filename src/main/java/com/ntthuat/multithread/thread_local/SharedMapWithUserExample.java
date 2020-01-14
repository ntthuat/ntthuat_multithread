package com.ntthuat.multithread.thread_local;

/**
 * @author ntthuat
 */
public class SharedMapWithUserExample {

    public static void main(String[] args) throws InterruptedException {
        SharedMapWithUserContext firstUser = new SharedMapWithUserContext(1);
        SharedMapWithUserContext secondUser = new SharedMapWithUserContext(2);
        Thread t1 = new Thread(firstUser);
        Thread t2 = new Thread(secondUser);
        t1.start();
        t2.start();

        t1.join();
        t2.join();


        System.out.println("Size: " + SharedMapWithUserContext.userContextPerUserId.size());
    }
}
