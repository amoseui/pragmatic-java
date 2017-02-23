package com.amoseui.ruffjava.singleton;

public class InitializationOnDemandHolderIdiomTest extends SingletonTestBase<InitializationOnDemandHolderIdiom> {

    public InitializationOnDemandHolderIdiomTest() {
        super(InitializationOnDemandHolderIdiom::getInstance);
    }
}
