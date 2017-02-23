package com.amoseui.ruffjava.singleton;

public class EnumInitializationTest extends SingletonTestBase<EnumInitialization> {

    public EnumInitializationTest() {
        super(EnumInitialization::getInstance);
    }
}
