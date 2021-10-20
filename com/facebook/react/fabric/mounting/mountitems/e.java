package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.bridge.ReadableArray;
import vigqyno.C0201;

/* compiled from: DispatchStringCommandMountItem */
public class e extends c {
    private final int b;
    private final String c;
    private final ReadableArray d;

    public e(int i, String str, ReadableArray readableArray) {
        this.b = i;
        this.c = str;
        this.d = readableArray;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.g
    public void a(jj0 jj0) {
        jj0.j(this.b, this.c, this.d);
        throw null;
    }

    public String toString() {
        return C0201.m82(35836) + this.b + C0201.m82(35837) + this.c;
    }
}
