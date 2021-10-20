package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;
import vigqyno.C0201;

/* compiled from: DiffClampAnimatedNode */
public class f extends s {
    private final l i;
    private final int j;
    private final double k;
    private final double l;
    private double m = 0.0d;

    public f(ReadableMap readableMap, l lVar) {
        this.i = lVar;
        this.j = readableMap.getInt(C0201.m82(29238));
        this.k = readableMap.getDouble(C0201.m82(29239));
        this.l = readableMap.getDouble(C0201.m82(29240));
        this.f = 0.0d;
    }

    private double l() {
        b l2 = this.i.l(this.j);
        if (l2 != null && (l2 instanceof s)) {
            return ((s) l2).i();
        }
        throw new JSApplicationCausedNativeException(C0201.m82(29241));
    }

    @Override // com.facebook.react.animated.b
    public void e() {
        double l2 = l();
        double d = l2 - this.m;
        this.m = l2;
        this.f = Math.min(Math.max(this.f + d, this.k), this.l);
    }
}
