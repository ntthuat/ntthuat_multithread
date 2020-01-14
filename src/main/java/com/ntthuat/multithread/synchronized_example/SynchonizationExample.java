package com.ntthuat.multithread.synchronized_example;

/**
 * @author ntthuat
 */
public class SynchonizationExample {

    public static void main(String[] args) {

        Table table = new Table();//only one object
        ServiceOne t1 = new ServiceOne(table);
        ServiceTwo t2 = new ServiceTwo(table);
        t1.start();
        t2.start();
    }
}
