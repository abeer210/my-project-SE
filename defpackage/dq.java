package defpackage;

import java.io.IOException;
import vigqyno.C0201;

/* renamed from: dq  reason: default package */
/* compiled from: PngChromaticities */
public class dq {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;

    public dq(byte[] bArr) throws kq {
        if (bArr.length == 32) {
            nr nrVar = new nr(bArr);
            try {
                this.a = nrVar.f();
                this.b = nrVar.f();
                this.c = nrVar.f();
                this.d = nrVar.f();
                this.e = nrVar.f();
                this.f = nrVar.f();
                this.g = nrVar.f();
                this.h = nrVar.f();
            } catch (IOException e2) {
                throw new kq(e2);
            }
        } else {
            throw new kq(C0201.m82(10811));
        }
    }

    public int a() {
        return this.g;
    }

    public int b() {
        return this.h;
    }

    public int c() {
        return this.e;
    }

    public int d() {
        return this.f;
    }

    public int e() {
        return this.c;
    }

    public int f() {
        return this.d;
    }

    public int g() {
        return this.a;
    }

    public int h() {
        return this.b;
    }
}
