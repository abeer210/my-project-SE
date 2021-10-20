package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import vigqyno.C0201;

public final class w7 implements Runnable {
    private final /* synthetic */ s7 a;

    public w7(s7 s7Var) {
        this.a = s7Var;
    }

    public final void run() {
        a7 a7Var = this.a.c;
        Context context = this.a.c.getContext();
        this.a.c.a();
        a7Var.E(new ComponentName(context, C0201.m82(32583)));
    }
}
