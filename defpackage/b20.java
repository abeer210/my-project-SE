package defpackage;

import java.security.KeyStore;
import java.util.Arrays;
import javax.net.ssl.KeyManager;
import vigqyno.C0201;

/* renamed from: b20  reason: default package */
/* compiled from: Configuration */
public class b20 {
    public final String a;
    public final String b;
    public final z10 c;
    public final boolean d;
    public final KeyStore e;
    public final KeyManager[] f;
    public final int g;
    public final int h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final String[] n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final o10 r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final i20 v;

    public b20(String str, String str2, z10 z10, boolean z, KeyStore keyStore, KeyManager[] keyManagerArr, int i2, int i3, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String[] strArr, boolean z7, boolean z8, boolean z9, boolean z11, o10 o10, boolean z12, boolean z13, i20 i20) {
        this.a = str;
        this.b = str2;
        this.c = z10;
        this.d = z;
        this.e = keyStore;
        this.f = keyManagerArr;
        this.g = i2;
        this.h = i3;
        this.i = z2;
        this.j = z3;
        this.k = z4;
        this.l = z5;
        this.m = z6;
        this.n = strArr;
        this.o = z7;
        this.p = z8;
        this.q = z9;
        this.s = z11;
        this.r = o10;
        this.t = z12;
        this.u = z13;
        this.v = i20;
    }

    public String a() {
        return this.b;
    }

    public String toString() {
        return C0201.m82(7840) + this.a + '\'' + C0201.m82(7841) + this.b + '\'' + C0201.m82(7842) + this.c + C0201.m82(7843) + this.d + C0201.m82(7844) + this.e + C0201.m82(7845) + Arrays.toString(this.f) + C0201.m82(7846) + this.g + C0201.m82(7847) + this.h + C0201.m82(7848) + this.i + C0201.m82(7849) + this.j + C0201.m82(7850) + this.k + C0201.m82(7851) + this.l + C0201.m82(7852) + this.m + C0201.m82(7853) + Arrays.toString(this.n) + C0201.m82(7854) + this.o + C0201.m82(7855) + this.p + C0201.m82(7856) + this.q + C0201.m82(7857) + this.s + C0201.m82(7858) + this.r + C0201.m82(7859) + this.t + C0201.m82(7860) + this.u + C0201.m82(7861) + this.v + '}';
    }
}
