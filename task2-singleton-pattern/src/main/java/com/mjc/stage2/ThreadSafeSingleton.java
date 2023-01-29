package com.mjc.stage2;

public class ThreadSafeSingleton {

    private static volatile ThreadSafeSingleton instance = null;

    public static ThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }

        return instance;
    }
    // Write your code here!
}
