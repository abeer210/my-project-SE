package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;
import vigqyno.C0201;

/* compiled from: ModulusAnimatedNode */
public class j extends s {
    private final l i;
    private final int j;
    private final double k;

    public j(ReadableMap readableMap, l lVar) {
        this.i = lVar;
        this.j = readableMap.getInt(C0201.m82(29161));
        this.k = readableMap.getDouble(C0201.m82(29162));
    }

    @Override // com.facebook.react.animated.b
    public void e() {
        b l = this.i.l(this.j);
        if (l == null || !(l instanceof s)) {
            throw new JSApplicationCausedNativeException(C0201.m82(29163));
        }
        double i2 = ((s) l).i();
        double d = this.k;
        this.f = ((i2 % d) + d) % d;
    }
}
