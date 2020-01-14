package com.ntthuat.multithread.thread_local;

/**
 * @author ntthuat
 */
public class Context {
    private String userName;

    public Context(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Context{" +
                "userNameSecret='" + userName + '\'' +
                '}';
    }
}
