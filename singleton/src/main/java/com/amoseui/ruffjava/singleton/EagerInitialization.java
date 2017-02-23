package com.amoseui.ruffjava.singleton;

public class EagerInitialization {

    private static EagerInitialization sInstance = new EagerInitialization();

    private EagerInitialization () {}

    public static EagerInitialization getInstance () {
        return sInstance;
    }
}