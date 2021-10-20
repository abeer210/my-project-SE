package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.location.b0;
import com.google.android.gms.location.g;
import com.google.android.gms.location.j;
import com.google.android.gms.location.l;
import vigqyno.C0201;

/* renamed from: d21  reason: default package */
public final class d21 extends t21 {
    private final w11 G;

    public d21(Context context, Looper looper, f.b bVar, f.c cVar, String str, e eVar) {
        super(context, looper, bVar, cVar, str, eVar);
        this.G = new w11(context, this.F);
    }

    @Override // com.google.android.gms.common.api.a.f, com.google.android.gms.common.internal.c
    public final void disconnect() {
        synchronized (this.G) {
            if (isConnected()) {
                try {
                    this.G.b();
                    this.G.f();
                } catch (Exception e) {
                    Log.e(C0201.m82(32918), C0201.m82(32919), e);
                }
            }
            super.disconnect();
        }
    }

    public final Location q0() throws RemoteException {
        return this.G.a();
    }

    public final void r0(i21 i21, k<g> kVar, n11 n11) throws RemoteException {
        synchronized (this.G) {
            this.G.c(i21, kVar, n11);
        }
    }

    public final void s0(com.google.android.gms.location.f fVar, PendingIntent pendingIntent, com.google.android.gms.common.api.internal.e<Status> eVar) throws RemoteException {
        w();
        u.l(fVar, C0201.m82(32920));
        u.l(pendingIntent, C0201.m82(32921));
        u.l(eVar, C0201.m82(32922));
        ((s11) E()).F3(fVar, pendingIntent, new f21(eVar));
    }

    public final void t0(j jVar, com.google.android.gms.common.api.internal.e<l> eVar, String str) throws RemoteException {
        w();
        boolean z = true;
        u.b(jVar != null, C0201.m82(32923));
        if (eVar == null) {
            z = false;
        }
        u.b(z, C0201.m82(32924));
        ((s11) E()).I3(jVar, new h21(eVar), str);
    }

    public final void u0(b0 b0Var, com.google.android.gms.common.api.internal.e<Status> eVar) throws RemoteException {
        w();
        u.l(b0Var, C0201.m82(32925));
        u.l(eVar, C0201.m82(32926));
        ((s11) E()).Y1(b0Var, new g21(eVar));
    }

    public final void v0(k.a<g> aVar, n11 n11) throws RemoteException {
        this.G.g(aVar, n11);
    }
}
