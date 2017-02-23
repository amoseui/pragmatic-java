package com.amoseui.ruffjava.singleton;

public class DoubleCheckedLockingTest extends SingletonTestBase<DoubleCheckedLocking> {

    public DoubleCheckedLockingTest() {
        super(DoubleCheckedLocking::getInstance);
    }
}
