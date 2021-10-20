package defpackage;

import defpackage.aj;
import java.io.File;

/* renamed from: dj  reason: default package */
/* compiled from: DiskLruCacheFactory */
public class dj implements aj.a {
    private final long a;
    private final a b;

    /* renamed from: dj$a */
    /* compiled from: DiskLruCacheFactory */
    public interface a {
        File a();
    }

    public dj(a aVar, long j) {
        this.a = j;
        this.b = aVar;
    }

    @Override // defpackage.aj.a
    public aj a() {
        File a2 = this.b.a();
        if (a2 == null) {
            return null;
        }
        if (a2.mkdirs() || (a2.exists() && a2.isDirectory())) {
            return ej.c(a2, this.a);
        }
        return null;
    }
}
