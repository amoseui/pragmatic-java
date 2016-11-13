package com.amoseui.pragmaticjava.singleton;

public class ThreadSafeInitializationTest extends SingletonTestBase<ThreadSafeInitialization> {

    public ThreadSafeInitializationTest() {
        super(ThreadSafeInitialization::getInstance);
    }
}
