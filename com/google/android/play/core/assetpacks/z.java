package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Arrays;
import vigqyno.C0201;

public final class z extends sz1 {
    private final gy1 a = new gy1(C0201.m82(28988));
    private final Context b;
    private final AssetPackExtractionService c;
    private final b0 d;

    public z(Context context, AssetPackExtractionService assetPackExtractionService, b0 b0Var) {
        this.b = context;
        this.c = assetPackExtractionService;
        this.d = b0Var;
    }

    @Override // defpackage.tz1
    public final void T0(vz1 vz1) throws RemoteException {
        this.d.z();
        vz1.b(new Bundle());
    }

    @Override // defpackage.tz1
    public final void m0(Bundle bundle, vz1 vz1) throws RemoteException {
        String[] packagesForUid;
        this.a.c(C0201.m82(28989), new Object[0]);
        if (!uy1.a(this.b) || (packagesForUid = this.b.getPackageManager().getPackagesForUid(Binder.getCallingUid())) == null || !Arrays.asList(packagesForUid).contains(C0201.m82(28990))) {
            vz1.a(new Bundle());
            this.c.b();
            return;
        }
        vz1.a(this.c.a(bundle), new Bundle());
    }
}
