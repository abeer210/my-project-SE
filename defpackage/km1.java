package defpackage;

import java.io.IOException;

/* renamed from: km1  reason: default package */
public final class km1<K, V> {
    public static <K, V> int a(lm1<K, V> lm1, K k, V v) {
        return bl1.f(lm1.a, 1, k) + bl1.f(lm1.c, 2, v);
    }

    public static <K, V> void b(qk1 qk1, lm1<K, V> lm1, K k, V v) throws IOException {
        bl1.h(qk1, lm1.a, 1, k);
        bl1.h(qk1, lm1.c, 2, v);
    }
}
