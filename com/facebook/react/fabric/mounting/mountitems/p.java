package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.bridge.ReadableMap;
import vigqyno.C0201;

/* compiled from: UpdatePropsMountItem */
public class p implements g {
    private final int a;
    private final ReadableMap b;

    public p(int i, ReadableMap readableMap) {
        this.a = i;
        this.b = readableMap;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.g
    public void a(jj0 jj0) {
        jj0.r(this.a, this.b);
        throw null;
    }

    public String toString() {
        return C0201.m82(35190) + this.a + C0201.m82(35191);
    }
}
