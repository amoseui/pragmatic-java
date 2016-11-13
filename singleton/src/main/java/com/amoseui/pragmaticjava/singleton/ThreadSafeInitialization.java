package com.amoseui.pragmaticjava.singleton;

public class ThreadSafeInitialization {

    private static ThreadSafeInitialization sInstance;

    private ThreadSafeInitialization () {}

    public static synchronized ThreadSafeInitialization getInstance () {
        if (sInstance == null) {
            sInstance = new ThreadSafeInitialization();
        }
        return sInstance;
    }
}
