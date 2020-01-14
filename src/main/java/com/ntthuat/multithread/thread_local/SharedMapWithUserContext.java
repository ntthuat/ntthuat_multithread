package com.ntthuat.multithread.thread_local;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author ntthuat
 */
public class SharedMapWithUserContext implements Runnable {

    public static Map<Integer, Context> userContextPerUserId = new ConcurrentHashMap<>();
    private Integer userId;
    private UserRepository userRepository = new UserRepository();

    @Override
    public void run() {
        String userName = userRepository.getUserNameForUserId(userId);
        userContextPerUserId.put(userId, new Context(userName));
    }

    public SharedMapWithUserContext(Integer userId) {
        this.userId = userId;
    }
}