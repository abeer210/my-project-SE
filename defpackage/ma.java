package defpackage;

import java.util.Arrays;

/* renamed from: ma  reason: default package */
/* compiled from: LottieResult */
public final class ma<V> {
    private final V a;
    private final Throwable b;

    public ma(V v) {
        this.a = v;
        this.b = null;
    }

    public Throwable a() {
        return this.b;
    }

    public V b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ma)) {
            return false;
        }
        ma maVar = (ma) obj;
        if (b() != null && b().equals(maVar.b())) {
            return true;
        }
        if (a() == null || maVar.a() == null) {
            return false;
        }
        return a().toString().equals(a().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{b(), a()});
    }

    public ma(Throwable th) {
        this.b = th;
        this.a = null;
    }
}
