package defpackage;

import java.io.IOException;

/* renamed from: md1  reason: default package */
public abstract class md1 {
    public volatile int a = -1;

    public abstract md1 a(bd1 bd1) throws IOException;

    public void b(ed1 ed1) throws IOException {
    }

    public int c() {
        return 0;
    }

    public final int d() {
        int c = c();
        this.a = c;
        return c;
    }

    /* renamed from: e */
    public md1 clone() throws CloneNotSupportedException {
        return (md1) super.clone();
    }

    public String toString() {
        return ld1.b(this);
    }
}
