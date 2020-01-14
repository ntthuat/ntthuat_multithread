package com.ntthuat.multithread.notify;

/**
 * @author ntthuat
 */
public class Action {

    private volatile boolean go = false;

    /*
     * wait and notify can only be called from synchronized method or bock
     */
    public synchronized void shouldGo() throws InterruptedException {
        while (go != true) {
            System.out.println(Thread.currentThread() + " is going to wait on this object");
            wait(); //release lock and reacquires on wakeup
            System.out.println(Thread.currentThread() + " is woken up");
        }
        go = false; //resetting condition*/
    }

    /*
     * both shouldGo() and go() are locked on current object referenced by "this" keyword
     */
    public synchronized void go() {
        while (go == false) {
            System.out.println(Thread.currentThread() + " is going to notify all or one thread waiting on this object");

            go = true; //making condition true for waiting thread
            notify(); // only one out of three waiting thread WT1, WT2,WT3 will woke up
            notifyAll(); // all waiting thread  WT1, WT2,WT3 will woke up
        }
    }
}
