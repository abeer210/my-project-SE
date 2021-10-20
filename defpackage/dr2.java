package defpackage;

import java.io.IOException;
import vigqyno.C0201;

/* renamed from: dr2  reason: default package */
/* compiled from: COSObject */
public class dr2 extends tq2 {
    private tq2 a;
    private long b;
    private int c;

    public dr2(tq2 tq2) throws IOException {
        H(tq2);
    }

    public long A() {
        return this.b;
    }

    public void E(int i) {
        this.c = i;
    }

    public final void H(tq2 tq2) throws IOException {
        this.a = tq2;
    }

    public void g0(long j) {
        this.b = j;
    }

    public int r() {
        return this.c;
    }

    public String toString() {
        return C0201.m82(24144) + Long.toString(this.b) + C0201.m82(24145) + Integer.toString(this.c) + C0201.m82(24146);
    }

    public tq2 x() {
        return this.a;
    }
}
