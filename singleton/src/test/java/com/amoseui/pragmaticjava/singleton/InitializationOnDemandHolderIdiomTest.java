package com.amoseui.pragmaticjava.singleton;

public class InitializationOnDemandHolderIdiomTest extends SingletonTestBase<InitializationOnDemandHolderIdiom> {

    public InitializationOnDemandHolderIdiomTest() {
        super(InitializationOnDemandHolderIdiom::getInstance);
    }
}
