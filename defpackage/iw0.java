package defpackage;

import java.io.IOException;

/* renamed from: iw0  reason: default package */
public final class iw0<K, V> {
    public static <K, V> int a(jw0<K, V> jw0, K k, V v) {
        return bv0.f(jw0.a, 1, k) + bv0.f(jw0.c, 2, v);
    }

    public static <K, V> void b(ru0 ru0, jw0<K, V> jw0, K k, V v) throws IOException {
        bv0.h(ru0, jw0.a, 1, k);
        bv0.h(ru0, jw0.c, 2, v);
    }
}
