package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.internal.s;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class b<O extends a.d> {
    private final boolean a = true;
    private final int b;
    private final a<O> c;
    private final O d;

    private b(a<O> aVar, O o) {
        this.c = aVar;
        this.d = o;
        this.b = s.b(aVar, o);
    }

    public static <O extends a.d> b<O> b(a<O> aVar, O o) {
        return new b<>(aVar, o);
    }

    public static <O extends a.d> b<O> c(a<O> aVar) {
        return new b<>(aVar);
    }

    public final String a() {
        return this.c.b();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return !this.a && !bVar.a && s.a(this.c, bVar.c) && s.a(this.d, bVar.d);
    }

    public final int hashCode() {
        return this.b;
    }

    private b(a<O> aVar) {
        this.c = aVar;
        this.d = null;
        this.b = System.identityHashCode(this);
    }
}
