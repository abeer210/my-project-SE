package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.c;

public final class r extends hq1 {
    private final /* synthetic */ c.j a;

    public r(c cVar, c.j jVar) {
        this.a = jVar;
    }

    @Override // defpackage.gq1
    public final void onMapLoaded() throws RemoteException {
        this.a.onMapLoaded();
    }
}
