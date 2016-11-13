package com.amoseui.pragmaticjava.singleton;

public class EnumInitializationTest extends SingletonTestBase<EnumInitialization> {

    public EnumInitializationTest() {
        super(EnumInitialization::getInstance);
    }
}
