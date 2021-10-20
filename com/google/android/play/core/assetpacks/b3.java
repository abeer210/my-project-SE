package com.google.android.play.core.assetpacks;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class b3 implements iz1<Executor> {
    public static Executor b() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(x2.a);
        ty1.g(newSingleThreadExecutor);
        return newSingleThreadExecutor;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.iz1
    public final /* bridge */ /* synthetic */ Executor a() {
        return b();
    }
}
