package com.facebook.react.fabric.mounting.mountitems;

import vigqyno.C0201;

/* compiled from: InsertMountItem */
public class f implements g {
    private int a;
    private int b;
    private int c;

    public f(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.g
    public void a(jj0 jj0) {
        jj0.b(this.b, this.a, this.c);
        throw null;
    }

    public String toString() {
        return C0201.m82(35790) + this.a + C0201.m82(35791) + this.b + C0201.m82(35792) + this.c;
    }
}
