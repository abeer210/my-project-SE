package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.bridge.ReadableArray;
import vigqyno.C0201;

/* compiled from: DispatchIntCommandMountItem */
public class d extends c {
    private final int b;
    private final int c;
    private final ReadableArray d;

    public d(int i, int i2, ReadableArray readableArray) {
        this.b = i;
        this.c = i2;
        this.d = readableArray;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.g
    public void a(jj0 jj0) {
        jj0.i(this.b, this.c, this.d);
        throw null;
    }

    public String toString() {
        return C0201.m82(36006) + this.b + C0201.m82(36007) + this.c;
    }
}
