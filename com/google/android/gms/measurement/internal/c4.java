package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import vigqyno.C0201;

public final class c4 implements ServiceConnection {
    private final String a;
    public final /* synthetic */ z3 b;

    public c4(z3 z3Var, String str) {
        this.b = z3Var;
        this.a = str;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.b.a.e().H().d(C0201.m82(5836));
            return;
        }
        try {
            n91 U3 = m81.U3(iBinder);
            if (U3 == null) {
                this.b.a.e().H().d(C0201.m82(5837));
                return;
            }
            this.b.a.e().K().d(C0201.m82(5838));
            this.b.a.c().y(new b4(this, U3, this));
        } catch (Exception e) {
            this.b.a.e().H().a(C0201.m82(5839), e);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.b.a.e().K().d(C0201.m82(5840));
    }
}
