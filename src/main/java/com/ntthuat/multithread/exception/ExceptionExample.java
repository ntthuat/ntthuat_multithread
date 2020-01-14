package com.ntthuat.multithread.exception;

/**
 * @author ntthuat
 */
public class ExceptionExample {
    public static void main(String[] args) {

        Thread service1 = new Thread(new ServiceOne());
        Thread service2 = new Thread(new ServiceTwo());
        /*service1.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {

            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("exception " + e + " from thread " + t);
            }
        });*/
        service1.setUncaughtExceptionHandler((t, e) -> System.out.println("exception " + e + " from thread " + t));

        service1.start();
        service2.start();
    }
}
