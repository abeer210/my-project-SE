package com.google.firebase.iid;

import java.util.concurrent.Executor;

public final /* synthetic */ class m0 implements Executor {
    public static final Executor a = new m0();

    private m0() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
