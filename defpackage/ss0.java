package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.i;
import vigqyno.C0201;

/* renamed from: ss0  reason: default package */
public final class ss0 extends i<ts0> {
    private final Bundle E;

    public ss0(Context context, Looper looper, e eVar, do0 do0, f.b bVar, f.c cVar) {
        super(context, looper, 16, eVar, bVar, cVar);
        if (do0 == null) {
            this.E = new Bundle();
            return;
        }
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.common.internal.c
    public final Bundle B() {
        return this.E;
    }

    @Override // com.google.android.gms.common.internal.c
    public final String m() {
        return C0201.m82(31420);
    }

    @Override // com.google.android.gms.common.internal.c
    public final /* synthetic */ IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(C0201.m82(31421));
        if (queryLocalInterface instanceof ts0) {
            return (ts0) queryLocalInterface;
        }
        return new us0(iBinder);
    }

    @Override // com.google.android.gms.common.internal.i, com.google.android.gms.common.api.a.f, com.google.android.gms.common.internal.c
    public final int p() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.api.a.f, com.google.android.gms.common.internal.c
    public final boolean r() {
        e k0 = k0();
        return !TextUtils.isEmpty(k0.b()) && !k0.e(co0.c).isEmpty();
    }

    @Override // com.google.android.gms.common.internal.c
    public final String t() {
        return C0201.m82(31422);
    }
}
