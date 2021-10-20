package defpackage;

import defpackage.x40;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: wd0  reason: default package */
/* compiled from: DiskStorageCacheFactory */
public class wd0 implements ae0 {
    private xd0 a;

    public wd0(xd0 xd0) {
        this.a = xd0;
    }

    public static x40 b(v40 v40, w40 w40) {
        return c(v40, w40, Executors.newSingleThreadExecutor());
    }

    public static x40 c(v40 v40, w40 w40, Executor executor) {
        return new x40(w40, v40.h(), new x40.c(v40.k(), v40.j(), v40.f()), v40.d(), v40.c(), v40.g(), v40.e(), executor, v40.i());
    }

    @Override // defpackage.ae0
    public b50 a(v40 v40) {
        return b(v40, this.a.a(v40));
    }
}
