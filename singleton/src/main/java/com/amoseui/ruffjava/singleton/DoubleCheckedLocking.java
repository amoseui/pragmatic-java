package com.amoseui.ruffjava.singleton;

public class DoubleCheckedLocking {

    private static volatile DoubleCheckedLocking sInstance;

    private DoubleCheckedLocking() {
        if (sInstance != null) {
            throw new IllegalStateException("Already initialized.");
        }
    }

    public static DoubleCheckedLocking getInstance() {
        if (sInstance == null) {
            synchronized (DoubleCheckedLocking.class) {
                if (sInstance == null) {
                    sInstance = new DoubleCheckedLocking();
                }
            }
        }
        return sInstance;
    }
}
