package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.i;
import vigqyno.C0201;

/* renamed from: t21  reason: default package */
public class t21 extends i<s11> {
    private final String E;
    public final o21<s11> F = new u21(this);

    public t21(Context context, Looper looper, f.b bVar, f.c cVar, String str, e eVar) {
        super(context, looper, 23, eVar, bVar, cVar);
        this.E = str;
    }

    @Override // com.google.android.gms.common.internal.c
    public Bundle B() {
        Bundle bundle = new Bundle();
        bundle.putString(C0201.m82(31769), this.E);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.c
    public String m() {
        return C0201.m82(31770);
    }

    @Override // com.google.android.gms.common.internal.c
    public /* synthetic */ IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(C0201.m82(31771));
        return queryLocalInterface instanceof s11 ? (s11) queryLocalInterface : new t11(iBinder);
    }

    @Override // com.google.android.gms.common.internal.i, com.google.android.gms.common.api.a.f, com.google.android.gms.common.internal.c
    public int p() {
        return 11925000;
    }

    @Override // com.google.android.gms.common.internal.c
    public String t() {
        return C0201.m82(31772);
    }
}
