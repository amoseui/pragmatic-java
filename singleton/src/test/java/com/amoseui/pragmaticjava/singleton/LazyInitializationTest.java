package com.amoseui.pragmaticjava.singleton;

public class LazyInitializationTest extends SingletonTestBase<LazyInitialization> {

    public LazyInitializationTest() {
        super(LazyInitialization::getInstance);
    }
}
