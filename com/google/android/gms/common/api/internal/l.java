package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.common.internal.u;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class l {
    private final Set<k<?>> a = Collections.newSetFromMap(new WeakHashMap());

    public static <L> k<L> a(L l, Looper looper, String str) {
        u.l(l, C0201.m82(39068));
        u.l(looper, C0201.m82(39069));
        u.l(str, C0201.m82(39070));
        return new k<>(looper, l, str);
    }

    public static <L> k.a<L> b(L l, String str) {
        u.l(l, C0201.m82(39071));
        u.l(str, C0201.m82(39072));
        u.h(str, C0201.m82(39073));
        return new k.a<>(l, str);
    }

    public final void c() {
        for (k<?> kVar : this.a) {
            kVar.a();
        }
        this.a.clear();
    }
}
