package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import vigqyno.C0201;

public final class m extends l<ParcelFileDescriptor> {
    public m(q qVar, d12<ParcelFileDescriptor> d12) {
        super(qVar, d12);
    }

    @Override // com.google.android.play.core.assetpacks.l, defpackage.rz1
    public final void x1(Bundle bundle, Bundle bundle2) throws RemoteException {
        super.x1(bundle, bundle2);
        this.a.e((ParcelFileDescriptor) bundle.getParcelable(C0201.m82(10350)));
    }
}
