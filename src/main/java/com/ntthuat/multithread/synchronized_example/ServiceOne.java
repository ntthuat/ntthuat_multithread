package com.ntthuat.multithread.synchronized_example;

/**
 * @author ntthuat
 */
public class ServiceOne extends Thread {

    Table t;

    ServiceOne(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }
}
