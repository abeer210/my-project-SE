package com.google.android.play.core.assetpacks;

import java.util.Arrays;

public final class x1 {
    private byte[] a = new byte[4096];
    private int b;
    private long c;
    private long d;
    private int e;
    private int f;
    private int g;
    private boolean h;
    private String i;

    public x1() {
        e();
    }

    private final int a(int i2, byte[] bArr, int i3, int i4) {
        int i5 = this.b;
        if (i5 >= i2) {
            return 0;
        }
        int min = Math.min(i4, i2 - i5);
        System.arraycopy(bArr, i3, this.a, this.b, min);
        int i6 = this.b + min;
        this.b = i6;
        if (i6 < i2) {
            return -1;
        }
        return min;
    }

    public final int b(byte[] bArr, int i2, int i3) {
        int a2 = a(30, bArr, i2, i3);
        if (a2 == -1) {
            return -1;
        }
        if (this.c == -1) {
            long e2 = v1.e(this.a, 0);
            this.c = e2;
            if (e2 == 67324752) {
                this.h = false;
                this.d = v1.e(this.a, 18);
                this.g = v1.g(this.a, 8);
                this.e = v1.g(this.a, 26);
                int g2 = this.e + 30 + v1.g(this.a, 28);
                this.f = g2;
                int length = this.a.length;
                if (length < g2) {
                    do {
                        length += length;
                    } while (length < g2);
                    this.a = Arrays.copyOf(this.a, length);
                }
            } else {
                this.h = true;
            }
        }
        int a3 = a(this.f, bArr, i2 + a2, i3 - a2);
        if (a3 == -1) {
            return -1;
        }
        int i4 = a2 + a3;
        if (!this.h && this.i == null) {
            this.i = new String(this.a, 30, this.e);
        }
        return i4;
    }

    public final r2 c() {
        int i2 = this.b;
        int i3 = this.f;
        if (i2 < i3) {
            return r2.a(this.i, this.d, this.g, true, Arrays.copyOf(this.a, i2), this.h);
        }
        r2 a2 = r2.a(this.i, this.d, this.g, false, Arrays.copyOf(this.a, i3), this.h);
        e();
        return a2;
    }

    public final int d() {
        return this.f;
    }

    public final void e() {
        this.b = 0;
        this.e = -1;
        this.c = -1;
        this.h = false;
        this.f = 30;
        this.d = -1;
        this.g = -1;
        this.i = null;
    }
}
