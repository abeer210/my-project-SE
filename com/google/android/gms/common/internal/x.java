package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.api.a;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class x<T extends IInterface> extends i<T> {
    private final a.h<T> E;

    @Override // com.google.android.gms.common.internal.c
    public void L(int i, T t) {
        this.E.j(i, t);
    }

    @Override // com.google.android.gms.common.internal.c
    public String m() {
        return this.E.m();
    }

    @Override // com.google.android.gms.common.internal.c
    public T n(IBinder iBinder) {
        return this.E.n(iBinder);
    }

    public a.h<T> p0() {
        return this.E;
    }

    @Override // com.google.android.gms.common.internal.c
    public String t() {
        return this.E.t();
    }
}
