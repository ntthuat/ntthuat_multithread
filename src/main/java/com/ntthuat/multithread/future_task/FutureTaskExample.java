package com.ntthuat.multithread.future_task;

import java.util.concurrent.*;

/**
 * @author ntthuat
 */
public class FutureTaskExample {

    public static void main(String[] args) {
        MyCallable callable1 = new MyCallable(1000);
        MyCallable callable2 = new MyCallable(2000);

        FutureTask<String> futureTask1 = new FutureTask<>(callable1);
        FutureTask<String> futureTask2 = new FutureTask<>(callable2);

        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(futureTask1);
        executor.execute(futureTask2);

        while (true) {
            try {
                if (futureTask1.isDone() && futureTask2.isDone()) {
                    System.out.println("Done");
                    String result1 = futureTask1.get();
                    String result2 = futureTask2.get();
                    System.out.println("Result: ");
                    System.out.println(result1);
                    System.out.println(result2);
                    //shut down executor service
                    executor.shutdown();
                    return;
                }

                if (!futureTask1.isDone()) {
                    //wait indefinitely for future task to complete
                    System.out.println("FutureTask1 output=" + futureTask1.get());
                }

                System.out.println("Waiting for FutureTask2 to complete");
                String s = futureTask2.get(200L, TimeUnit.MILLISECONDS);
                if (s != null) {
                    System.out.println("FutureTask2 output=" + s);
                }
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            } catch (TimeoutException e) {
                //do nothing
            }
        }

    }
}