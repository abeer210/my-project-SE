package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.fabric.c;
import com.facebook.react.uimanager.j0;
import com.facebook.react.uimanager.k0;
import vigqyno.C0201;

/* compiled from: PreAllocateViewMountItem */
public class h implements g {
    private final String a;
    private final int b;
    private final int c;
    private final ReadableMap d;
    private final j0 e;
    private final k0 f;
    private final boolean g;

    public h(k0 k0Var, int i, int i2, String str, ReadableMap readableMap, j0 j0Var, boolean z) {
        this.f = k0Var;
        this.a = str;
        this.b = i;
        this.d = readableMap;
        this.e = j0Var;
        this.c = i2;
        this.g = z;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.g
    public void a(jj0 jj0) {
        if (c.B) {
            f60.b(C0201.m82(36266), C0201.m82(36265) + toString());
        }
        jj0.h(this.f, this.a, this.c, this.d, this.e, this.g);
        throw null;
    }

    public String toString() {
        return C0201.m82(36267) + this.c + C0201.m82(36268) + this.a + C0201.m82(36269) + this.b + C0201.m82(36270) + this.g;
    }
}
