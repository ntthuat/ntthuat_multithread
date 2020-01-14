package com.ntthuat.multithread.thread_local;

/**
 * @author ntthuat
 */
public class ThreadLocalWithUserContext implements Runnable {

    private static ThreadLocal<Context> userContext = new ThreadLocal<>();
    private Integer userId;
    private UserRepository userRepository = new UserRepository();

    @Override
    public void run() {
        String userName = userRepository.getUserNameForUserId(userId);
        userContext.set(new Context(userName));
        System.out.println("thread context for given userId: " + userId + " is: " + userContext.get());
    }

    public ThreadLocalWithUserContext(Integer userId) {
        this.userId = userId;
    }
}
