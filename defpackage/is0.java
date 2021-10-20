package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.api.internal.m;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.i;
import vigqyno.C0201;

/* renamed from: is0  reason: default package */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.4.0 */
public final class is0 extends i<es0> {
    public is0(Context context, Looper looper, e eVar, f fVar, m mVar) {
        super(context, looper, 126, eVar, fVar, mVar);
    }

    @Override // com.google.android.gms.common.internal.c
    public final String m() {
        return C0201.m82(29406);
    }

    @Override // com.google.android.gms.common.internal.c
    public final /* synthetic */ IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(C0201.m82(29407));
        if (queryLocalInterface instanceof es0) {
            return (es0) queryLocalInterface;
        }
        return new ds0(iBinder);
    }

    @Override // com.google.android.gms.common.internal.i, com.google.android.gms.common.api.a.f, com.google.android.gms.common.internal.c
    public final int p() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.c
    public final String t() {
        return C0201.m82(29408);
    }

    @Override // com.google.android.gms.common.internal.c
    public final xo0[] z() {
        return as0.d;
    }
}
