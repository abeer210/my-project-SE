package defpackage;

import java.io.IOException;

/* renamed from: oa1  reason: default package */
public final class oa1<K, V> {
    public static <K, V> int a(ma1<K, V> ma1, K k, V v) {
        return b91.e(ma1.a, 1, k) + b91.e(ma1.c, 2, v);
    }

    public static <K, V> void b(r81 r81, ma1<K, V> ma1, K k, V v) throws IOException {
        b91.g(r81, ma1.a, 1, k);
        b91.g(r81, ma1.c, 2, v);
    }
}
