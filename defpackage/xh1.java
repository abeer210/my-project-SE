package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.i;
import vigqyno.C0201;

/* renamed from: xh1  reason: default package */
public final class xh1 extends i<uh1> {
    public xh1(Context context, Looper looper, e eVar, f.b bVar, f.c cVar) {
        super(context, looper, 51, eVar, bVar, cVar);
    }

    @Override // com.google.android.gms.common.internal.c
    public final String m() {
        return C0201.m82(14179);
    }

    @Override // com.google.android.gms.common.internal.c
    public final /* synthetic */ IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(C0201.m82(14180));
        return queryLocalInterface instanceof uh1 ? (uh1) queryLocalInterface : new vh1(iBinder);
    }

    @Override // com.google.android.gms.common.internal.i, com.google.android.gms.common.api.a.f, com.google.android.gms.common.internal.c
    public final int p() {
        return 11925000;
    }

    @Override // com.google.android.gms.common.internal.c
    public final String t() {
        return C0201.m82(14181);
    }
}
