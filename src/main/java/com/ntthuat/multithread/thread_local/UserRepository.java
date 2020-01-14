package com.ntthuat.multithread.thread_local;

/**
 * @author ntthuat
 */
public class UserRepository {
    public String getUserNameForUserId(Integer userId) {
        return userId.toString();
    }
}
