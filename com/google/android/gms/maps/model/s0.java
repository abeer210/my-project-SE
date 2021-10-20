package com.google.android.gms.maps.model;

import android.os.RemoteException;

public final class s0 implements c0 {
    private final f31 b = this.c.a;
    private final /* synthetic */ b0 c;

    public s0(b0 b0Var) {
        this.c = b0Var;
    }

    @Override // com.google.android.gms.maps.model.c0
    public final z getTile(int i, int i2, int i3) {
        try {
            return this.b.getTile(i, i2, i3);
        } catch (RemoteException unused) {
            return null;
        }
    }
}
