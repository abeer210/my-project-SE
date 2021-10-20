package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import vigqyno.C0201;

public final class n7 implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ String b;
    private final /* synthetic */ d9 c;
    private final /* synthetic */ jh1 d;
    private final /* synthetic */ a7 e;

    public n7(a7 a7Var, String str, String str2, d9 d9Var, jh1 jh1) {
        this.e = a7Var;
        this.a = str;
        this.b = str2;
        this.c = d9Var;
        this.d = jh1;
    }

    public final void run() {
        String r0 = C0201.m82(13933);
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            b3 W = a7.W(this.e);
            if (W == null) {
                this.e.e().E().b(r0, this.a, this.b);
                return;
            }
            ArrayList<Bundle> o0 = y8.o0(W.q1(this.a, this.b, this.c));
            a7.Z(this.e);
            this.e.m().F(this.d, o0);
        } catch (RemoteException e2) {
            this.e.e().E().c(r0, this.a, this.b, e2);
        } finally {
            this.e.m().F(this.d, arrayList);
        }
    }
}
