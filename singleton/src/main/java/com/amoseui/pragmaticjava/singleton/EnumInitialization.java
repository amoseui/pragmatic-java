package com.amoseui.pragmaticjava.singleton;

public enum EnumInitialization {

    INSTANCE;

    public static EnumInitialization getInstance() {
        return INSTANCE;
    }
}
