package com.amoseui.ruffjava.singleton;

public class EagerInitializationTest extends SingletonTestBase<EagerInitialization> {

    public EagerInitializationTest() {
        super(EagerInitialization::getInstance);
    }
}
