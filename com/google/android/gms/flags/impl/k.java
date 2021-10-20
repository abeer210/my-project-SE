package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Callable;
import vigqyno.C0201;

public final class k implements Callable<SharedPreferences> {
    private final /* synthetic */ Context a;

    public k(Context context) {
        this.a = context;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ SharedPreferences call() throws Exception {
        return this.a.getSharedPreferences(C0201.m82(31202), 0);
    }
}
