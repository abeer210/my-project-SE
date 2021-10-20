package com.facebook.react.common;

import vigqyno.C0201;

/* compiled from: LongArray */
public class d {
    private long[] a;
    private int b = 0;

    private d(int i) {
        this.a = new long[i];
    }

    public static d b(int i) {
        return new d(i);
    }

    private void e() {
        int i = this.b;
        if (i == this.a.length) {
            double d = (double) i;
            Double.isNaN(d);
            long[] jArr = new long[Math.max(i + 1, (int) (d * 1.8d))];
            System.arraycopy(this.a, 0, jArr, 0, this.b);
            this.a = jArr;
        }
    }

    public void a(long j) {
        e();
        long[] jArr = this.a;
        int i = this.b;
        this.b = i + 1;
        jArr[i] = j;
    }

    public void c(int i) {
        int i2 = this.b;
        if (i <= i2) {
            this.b = i2 - i;
            return;
        }
        throw new IndexOutOfBoundsException(C0201.m82(29495) + i + C0201.m82(29496) + this.b);
    }

    public long d(int i) {
        if (i < this.b) {
            return this.a[i];
        }
        throw new IndexOutOfBoundsException(C0201.m82(29497) + i + C0201.m82(29498) + this.b);
    }

    public void f(int i, long j) {
        if (i < this.b) {
            this.a[i] = j;
            return;
        }
        throw new IndexOutOfBoundsException(C0201.m82(29499) + i + C0201.m82(29500) + this.b);
    }

    public int g() {
        return this.b;
    }
}
