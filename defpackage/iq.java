package defpackage;

import java.io.IOException;
import vigqyno.C0201;

/* renamed from: iq  reason: default package */
/* compiled from: PngHeader */
public class iq {
    private int a;
    private int b;
    private byte c;
    private hq d;
    private byte e;
    private byte f;
    private byte g;

    public iq(byte[] bArr) throws kq {
        if (bArr.length == 13) {
            nr nrVar = new nr(bArr);
            try {
                this.a = nrVar.f();
                this.b = nrVar.f();
                this.c = nrVar.h();
                byte h = nrVar.h();
                hq b2 = hq.b(h);
                if (b2 != null) {
                    this.d = b2;
                    this.e = nrVar.h();
                    this.f = nrVar.h();
                    this.g = nrVar.h();
                    return;
                }
                throw new kq(C0201.m82(23022) + ((int) h));
            } catch (IOException e2) {
                throw new kq(e2);
            }
        } else {
            throw new kq(C0201.m82(23023));
        }
    }

    public byte a() {
        return this.c;
    }

    public hq b() {
        return this.d;
    }

    public byte c() {
        return this.e;
    }

    public byte d() {
        return this.f;
    }

    public int e() {
        return this.b;
    }

    public int f() {
        return this.a;
    }

    public byte g() {
        return this.g;
    }
}
