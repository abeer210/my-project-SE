package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.m;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class t {
    private static final b a = new e0();

    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public interface a<R extends m, T> {
        T a(R r);
    }

    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public interface b {
        com.google.android.gms.common.api.b a(Status status);
    }

    public static <R extends m, T extends l<R>> zs1<T> a(h<R> hVar, T t) {
        return b(hVar, new f0(t));
    }

    public static <R extends m, T> zs1<T> b(h<R> hVar, a<R, T> aVar) {
        b bVar = a;
        at1 at1 = new at1();
        hVar.b(new g0(hVar, at1, aVar, bVar));
        return at1.a();
    }

    public static <R extends m> zs1<Void> c(h<R> hVar) {
        return b(hVar, new h0());
    }
}
