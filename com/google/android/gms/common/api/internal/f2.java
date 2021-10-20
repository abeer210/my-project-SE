package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.t;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class f2 {
    public static final Status d = new Status(8, C0201.m82(7720));
    private static final BasePendingResult<?>[] e = new BasePendingResult[0];
    public final Set<BasePendingResult<?>> a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
    private final g2 b = new e2(this);
    private final Map<a.c<?>, a.f> c;

    public f2(Map<a.c<?>, a.f> map) {
        this.c = map;
    }

    public final void a() {
        BasePendingResult[] basePendingResultArr = (BasePendingResult[]) this.a.toArray(e);
        for (BasePendingResult basePendingResult : basePendingResultArr) {
            t tVar = null;
            basePendingResult.n(null);
            if (basePendingResult.r() != null) {
                basePendingResult.d(null);
                IBinder s = this.c.get(((d) basePendingResult).w()).s();
                if (basePendingResult.i()) {
                    basePendingResult.n(new h2(basePendingResult, null, s, null));
                } else if (s == null || !s.isBinderAlive()) {
                    basePendingResult.n(null);
                    basePendingResult.e();
                    tVar.a(basePendingResult.r().intValue());
                } else {
                    h2 h2Var = new h2(basePendingResult, null, s, null);
                    basePendingResult.n(h2Var);
                    try {
                        s.linkToDeath(h2Var, 0);
                    } catch (RemoteException unused) {
                        basePendingResult.e();
                        tVar.a(basePendingResult.r().intValue());
                    }
                }
                this.a.remove(basePendingResult);
            } else if (basePendingResult.s()) {
                this.a.remove(basePendingResult);
            }
        }
    }

    public final void b() {
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.a.toArray(e)) {
            basePendingResult.q(d);
        }
    }

    public final void c(BasePendingResult<? extends m> basePendingResult) {
        this.a.add(basePendingResult);
        basePendingResult.n(this.b);
    }
}
