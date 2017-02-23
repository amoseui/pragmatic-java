package com.amoseui.ruffjava.singleton;

public class InitializationOnDemandHolderIdiom {

    private InitializationOnDemandHolderIdiom () {}

    private static class Singleton {
        private static final InitializationOnDemandHolderIdiom sInstance = new InitializationOnDemandHolderIdiom();
    }

    public static InitializationOnDemandHolderIdiom getInstance () {
        return Singleton.sInstance;
    }
}
