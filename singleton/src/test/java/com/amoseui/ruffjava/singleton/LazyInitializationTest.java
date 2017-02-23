package com.amoseui.ruffjava.singleton;

public class LazyInitializationTest extends SingletonTestBase<LazyInitialization> {

    public LazyInitializationTest() {
        super(LazyInitialization::getInstance);
    }
}
