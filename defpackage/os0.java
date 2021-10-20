package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.i;
import defpackage.bo0;
import vigqyno.C0201;

/* renamed from: os0  reason: default package */
public final class os0 extends i<ps0> {
    private final bo0.a E;

    public os0(Context context, Looper looper, e eVar, bo0.a aVar, f.b bVar, f.c cVar) {
        super(context, looper, 68, eVar, bVar, cVar);
        this.E = aVar;
    }

    @Override // com.google.android.gms.common.internal.c
    public final Bundle B() {
        bo0.a aVar = this.E;
        return aVar == null ? new Bundle() : aVar.a();
    }

    @Override // com.google.android.gms.common.internal.c
    public final String m() {
        return C0201.m82(21113);
    }

    @Override // com.google.android.gms.common.internal.c
    public final /* synthetic */ IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(C0201.m82(21114));
        if (queryLocalInterface instanceof ps0) {
            return (ps0) queryLocalInterface;
        }
        return new qs0(iBinder);
    }

    @Override // com.google.android.gms.common.internal.i, com.google.android.gms.common.api.a.f, com.google.android.gms.common.internal.c
    public final int p() {
        return 12800000;
    }

    @Override // com.google.android.gms.common.internal.c
    public final String t() {
        return C0201.m82(21115);
    }
}
