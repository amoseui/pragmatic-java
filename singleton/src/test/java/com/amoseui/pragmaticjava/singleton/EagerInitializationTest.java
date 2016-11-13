package com.amoseui.pragmaticjava.singleton;

public class EagerInitializationTest extends SingletonTestBase<EagerInitialization> {

    public EagerInitializationTest() {
        super(EagerInitialization::getInstance);
    }
}
