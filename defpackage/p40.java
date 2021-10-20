package defpackage;

import defpackage.j40;

/* renamed from: p40  reason: default package */
/* compiled from: NoOpCacheErrorLogger */
public class p40 implements j40 {
    private static p40 a;

    private p40() {
    }

    public static synchronized p40 b() {
        p40 p40;
        synchronized (p40.class) {
            if (a == null) {
                a = new p40();
            }
            p40 = a;
        }
        return p40;
    }

    @Override // defpackage.j40
    public void a(j40.a aVar, Class<?> cls, String str, Throwable th) {
    }
}
