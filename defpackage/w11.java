package defpackage;

import android.content.Context;
import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.location.g;
import com.google.android.gms.location.h;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: w11  reason: default package */
public final class w11 {
    private final o21<s11> a;
    private final Context b;
    private boolean c = false;
    private final Map<k.a<h>, b21> d = new HashMap();
    private final Map<k.a<Object>, a21> e = new HashMap();
    private final Map<k.a<g>, x11> f = new HashMap();

    public w11(Context context, o21<s11> o21) {
        this.b = context;
        this.a = o21;
    }

    private final x11 e(k<g> kVar) {
        x11 x11;
        synchronized (this.f) {
            x11 = this.f.get(kVar.b());
            if (x11 == null) {
                x11 = new x11(kVar);
            }
            this.f.put(kVar.b(), x11);
        }
        return x11;
    }

    public final Location a() throws RemoteException {
        this.a.a();
        return this.a.getService().R2(this.b.getPackageName());
    }

    public final void b() throws RemoteException {
        synchronized (this.d) {
            for (b21 b21 : this.d.values()) {
                if (b21 != null) {
                    this.a.getService().O2(k21.p(b21, null));
                }
            }
            this.d.clear();
        }
        synchronized (this.f) {
            for (x11 x11 : this.f.values()) {
                if (x11 != null) {
                    this.a.getService().O2(k21.o(x11, null));
                }
            }
            this.f.clear();
        }
        synchronized (this.e) {
            for (a21 a21 : this.e.values()) {
                if (a21 != null) {
                    this.a.getService().B1(new x21(2, null, a21.asBinder(), null));
                }
            }
            this.e.clear();
        }
    }

    public final void c(i21 i21, k<g> kVar, n11 n11) throws RemoteException {
        this.a.a();
        this.a.getService().O2(new k21(1, i21, null, null, e(kVar).asBinder(), n11 != null ? n11.asBinder() : null));
    }

    public final void d(boolean z) throws RemoteException {
        this.a.a();
        this.a.getService().B2(z);
        this.c = z;
    }

    public final void f() throws RemoteException {
        if (this.c) {
            d(false);
        }
    }

    public final void g(k.a<g> aVar, n11 n11) throws RemoteException {
        this.a.a();
        u.l(aVar, C0201.m82(13049));
        synchronized (this.f) {
            x11 remove = this.f.remove(aVar);
            if (remove != null) {
                remove.V3();
                this.a.getService().O2(k21.o(remove, n11));
            }
        }
    }
}
