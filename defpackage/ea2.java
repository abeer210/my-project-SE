package defpackage;

import vigqyno.C0201;

/* renamed from: ea2  reason: default package */
/* compiled from: Codeword */
public final class ea2 {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private int e = -1;

    public ea2(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public int a() {
        return this.c;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.e;
    }

    public int d() {
        return this.a;
    }

    public int e() {
        return this.d;
    }

    public int f() {
        return this.b - this.a;
    }

    public boolean g() {
        return h(this.e);
    }

    public boolean h(int i) {
        return i != -1 && this.c == (i % 3) * 3;
    }

    public void i(int i) {
        this.e = i;
    }

    public void j() {
        this.e = ((this.d / 30) * 3) + (this.c / 3);
    }

    public String toString() {
        return this.e + C0201.m82(11141) + this.d;
    }
}
