package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.i;
import vigqyno.C0201;

/* renamed from: tp0  reason: default package */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class tp0 extends i<yp0> {
    public tp0(Context context, Looper looper, e eVar, f.b bVar, f.c cVar) {
        super(context, looper, 39, eVar, bVar, cVar);
    }

    @Override // com.google.android.gms.common.internal.c
    public final String m() {
        return C0201.m82(17425);
    }

    @Override // com.google.android.gms.common.internal.c
    public final /* synthetic */ IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(C0201.m82(17426));
        if (queryLocalInterface instanceof yp0) {
            return (yp0) queryLocalInterface;
        }
        return new xp0(iBinder);
    }

    @Override // com.google.android.gms.common.internal.c
    public final String t() {
        return C0201.m82(17427);
    }
}
