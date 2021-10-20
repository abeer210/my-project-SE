package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.core.content.b;
import defpackage.xm;
import vigqyno.C0201;

/* renamed from: an  reason: default package */
/* compiled from: DefaultConnectivityMonitorFactory */
public class an implements ym {
    @Override // defpackage.ym
    public xm a(Context context, xm.a aVar) {
        boolean z = b.a(context, C0201.m82(3523)) == 0;
        String r2 = C0201.m82(3524);
        if (Log.isLoggable(r2, 3)) {
            Log.d(r2, z ? C0201.m82(3525) : C0201.m82(3526));
        }
        if (z) {
            return new zm(context, aVar);
        }
        return new en();
    }
}
