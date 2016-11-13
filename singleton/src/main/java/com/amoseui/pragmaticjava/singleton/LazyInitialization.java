package com.amoseui.pragmaticjava.singleton;

public class LazyInitialization {

    private static LazyInitialization sInstance;

    private LazyInitialization() {}

    public static synchronized LazyInitialization getInstance() {
        if (sInstance == null) {
            sInstance = new LazyInitialization();
        }
        return sInstance;
    }
}
