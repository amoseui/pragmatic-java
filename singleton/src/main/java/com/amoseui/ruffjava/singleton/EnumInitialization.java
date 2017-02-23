package com.amoseui.ruffjava.singleton;

public enum EnumInitialization {

    INSTANCE;

    public static EnumInitialization getInstance() {
        return INSTANCE;
    }
}
