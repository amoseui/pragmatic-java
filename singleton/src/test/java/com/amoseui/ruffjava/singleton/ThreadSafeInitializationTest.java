package com.amoseui.ruffjava.singleton;

public class ThreadSafeInitializationTest extends SingletonTestBase<ThreadSafeInitialization> {

    public ThreadSafeInitializationTest() {
        super(ThreadSafeInitialization::getInstance);
    }
}
