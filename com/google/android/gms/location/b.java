package com.google.android.gms.location;

import android.os.SystemClock;
import vigqyno.C0201;

public interface b {

    public static final class a {
        private String a = null;
        private int b = 0;
        private long c = Long.MIN_VALUE;
        private short d = -1;
        private double e;
        private double f;
        private float g;
        private int h = 0;
        private int i = -1;

        public final b a() {
            if (this.a != null) {
                int i2 = this.b;
                if (i2 == 0) {
                    throw new IllegalArgumentException(C0201.m82(39053));
                } else if ((i2 & 4) != 0 && this.i < 0) {
                    throw new IllegalArgumentException(C0201.m82(39049));
                } else if (this.c == Long.MIN_VALUE) {
                    throw new IllegalArgumentException(C0201.m82(39052));
                } else if (this.d == -1) {
                    throw new IllegalArgumentException(C0201.m82(39051));
                } else if (this.h >= 0) {
                    return new m21(this.a, this.b, 1, this.e, this.f, this.g, this.c, this.h, this.i);
                } else {
                    throw new IllegalArgumentException(C0201.m82(39050));
                }
            } else {
                throw new IllegalArgumentException(C0201.m82(39054));
            }
        }

        public final a b(double d2, double d3, float f2) {
            this.d = 1;
            this.e = d2;
            this.f = d3;
            this.g = f2;
            return this;
        }

        public final a c(long j) {
            if (j < 0) {
                this.c = -1;
            } else {
                this.c = SystemClock.elapsedRealtime() + j;
            }
            return this;
        }

        public final a d(String str) {
            this.a = str;
            return this;
        }

        public final a e(int i2) {
            this.b = i2;
            return this;
        }
    }

    String a();
}
