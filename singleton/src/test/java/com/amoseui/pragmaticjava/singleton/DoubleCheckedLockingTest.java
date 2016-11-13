package com.amoseui.pragmaticjava.singleton;

public class DoubleCheckedLockingTest extends SingletonTestBase<DoubleCheckedLocking> {

    public DoubleCheckedLockingTest() {
        super(DoubleCheckedLocking::getInstance);
    }
}
