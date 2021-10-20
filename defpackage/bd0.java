package defpackage;

import java.util.concurrent.TimeUnit;
import vigqyno.C0188;

/* renamed from: bd0  reason: default package */
/* compiled from: DefaultEncodedMemoryCacheParamsSupplier */
public class bd0 implements c60<hd0> {
    private static final long a = TimeUnit.MINUTES.toMillis(5);

    private int b() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min < 16777216) {
            return 1048576;
        }
        return min < 33554432 ? 2097152 : 4194304;
    }

    /* renamed from: a */
    public hd0 get() {
        int b = b();
        return new hd0(b, C0188.f24, b, C0188.f24, b / 8, a);
    }
}
