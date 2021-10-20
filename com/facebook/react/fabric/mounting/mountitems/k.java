package com.facebook.react.fabric.mounting.mountitems;

import vigqyno.C0201;

/* compiled from: SendAccessibilityEvent */
public class k implements g {
    private final int a;
    private final int b;

    public k(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.g
    public void a(jj0 jj0) {
        jj0.l(this.a, this.b);
        throw null;
    }

    public String toString() {
        return C0201.m82(36173) + this.a + C0201.m82(36174) + this.b;
    }
}
