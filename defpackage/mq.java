package defpackage;

import defpackage.kx;
import java.io.IOException;

/* renamed from: mq  reason: default package */
/* compiled from: QuickTimeHandler */
public abstract class mq<T extends kx> {
    public wr a;
    public T b;

    public mq(wr wrVar) {
        this.a = wrVar;
        T b2 = b();
        this.b = b2;
        wrVar.a(b2);
    }

    public void a(String str) {
        this.b.a(str);
    }

    public abstract T b();

    public abstract mq c(ox oxVar, byte[] bArr) throws IOException;

    public mq d(ox oxVar) throws IOException {
        return c(oxVar, null);
    }

    public abstract boolean e(ox oxVar);

    public abstract boolean f(ox oxVar);
}
