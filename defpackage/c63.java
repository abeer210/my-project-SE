package defpackage;

import java.io.IOException;
import vigqyno.C0201;

/* renamed from: c63  reason: default package */
/* compiled from: RecipientInformation */
public abstract class c63 {
    public b63 a;
    public o43 b;
    public o43 c;
    public k53 d;
    private c53 e;
    private e63 f;

    public c63(o43 o43, o43 o432, k53 k53, c53 c53) {
        this.b = o43;
        this.c = o432;
        this.d = k53;
        this.e = c53;
    }

    public byte[] a(a63 a63) throws h53 {
        try {
            return m53.c(b(a63).a());
        } catch (IOException e2) {
            throw new h53(C0201.m82(5284) + e2.getMessage(), e2);
        }
    }

    public l53 b(a63 a63) throws h53, IOException {
        e63 d2 = d(a63);
        this.f = d2;
        if (this.e != null) {
            return new l53(this.d.a());
        }
        return new l53(d2.a(this.d.a()));
    }

    public b63 c() {
        return this.a;
    }

    public abstract e63 d(a63 a63) throws h53, IOException;
}
