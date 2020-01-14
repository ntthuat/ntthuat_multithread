package com.ntthuat.multithread.synchronized_example;

/**
 * @author ntthuat
 */
public class ServiceTwo extends Thread {

    Table t;

    ServiceTwo(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(100);
    }
}
