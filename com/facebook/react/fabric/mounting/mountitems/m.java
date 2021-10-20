package com.facebook.react.fabric.mounting.mountitems;

import android.annotation.TargetApi;
import vigqyno.C0201;

/* compiled from: UpdateLayoutMountItem */
public class m implements g {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;

    public m(int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = b(i6);
    }

    @TargetApi(19)
    private static int b(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        throw new IllegalArgumentException(C0201.m82(34834) + i);
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.g
    public void a(jj0 jj0) {
        jj0.o(this.a, this.b, this.c, this.d, this.e);
        throw null;
    }

    public String toString() {
        return C0201.m82(34835) + this.a + C0201.m82(34836) + this.b + C0201.m82(34837) + this.c + C0201.m82(34838) + this.e + C0201.m82(34839) + this.d + C0201.m82(34840) + this.f;
    }
}
