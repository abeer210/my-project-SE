package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.c;
import vigqyno.C0201;

public final class h3 extends c<b3> {
    public h3(Context context, Looper looper, c.a aVar, c.b bVar) {
        super(context, looper, 93, aVar, bVar, null);
    }

    @Override // com.google.android.gms.common.internal.c
    public final String m() {
        return C0201.m82(38881);
    }

    /* Return type fixed from 'android.os.IInterface' to match base method */
    @Override // com.google.android.gms.common.internal.c
    public final /* synthetic */ b3 n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(C0201.m82(38882));
        if (queryLocalInterface instanceof b3) {
            return (b3) queryLocalInterface;
        }
        return new d3(iBinder);
    }

    @Override // com.google.android.gms.common.internal.c
    public final int p() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.c
    public final String t() {
        return C0201.m82(38883);
    }
}
