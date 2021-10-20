package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.j0;
import com.facebook.react.uimanager.k0;
import vigqyno.C0201;

/* compiled from: CreateMountItem */
public class a implements g {
    private final String a;
    private final int b;
    private final int c;
    private final k0 d;
    private final ReadableMap e;
    private final j0 f;
    private final boolean g;

    public a(k0 k0Var, int i, int i2, String str, ReadableMap readableMap, j0 j0Var, boolean z) {
        this.d = k0Var;
        this.a = str;
        this.b = i;
        this.c = i2;
        this.e = readableMap;
        this.f = j0Var;
        this.g = z;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.g
    public void a(jj0 jj0) {
        jj0.d(this.d, this.a, this.c, this.e, this.f, this.g);
        throw null;
    }

    public String toString() {
        return C0201.m82(35648) + this.c + C0201.m82(35649) + this.a + C0201.m82(35650) + this.b + C0201.m82(35651) + this.g;
    }
}
