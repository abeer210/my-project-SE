package defpackage;

import defpackage.gz;
import java.io.IOException;

/* renamed from: zp  reason: default package */
/* compiled from: Mp4Handler */
public abstract class zp<T extends gz> {
    public wr a;
    public T b;

    public zp(wr wrVar) {
        this.a = wrVar;
        T b2 = b();
        this.b = b2;
        wrVar.a(b2);
    }

    public void a(String str) {
        this.b.a(str);
    }

    public abstract T b();

    public abstract zp c(kz kzVar, byte[] bArr) throws IOException;

    public zp d(kz kzVar) throws IOException {
        return c(kzVar, null);
    }

    public abstract boolean e(kz kzVar);

    public abstract boolean f(kz kzVar);
}
