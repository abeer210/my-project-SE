package com.google.android.gms.maps;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.gms.maps.c;

public final class x extends br1 {
    private final /* synthetic */ c.r a;

    public x(c cVar, c.r rVar) {
        this.a = rVar;
    }

    @Override // defpackage.ar1
    public final void Q1(yq0 yq0) throws RemoteException {
        this.a.onSnapshotReady((Bitmap) ar0.V3(yq0));
    }

    @Override // defpackage.ar1
    public final void onSnapshotReady(Bitmap bitmap) throws RemoteException {
        this.a.onSnapshotReady(bitmap);
    }
}
