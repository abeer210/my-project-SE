package com.facebook.react.animated;

import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
import vigqyno.C0201;

/* compiled from: TrackingAnimatedNode */
public class q extends b {
    private final l e;
    private final int f;
    private final int g;
    private final int h;
    private final JavaOnlyMap i;

    public q(ReadableMap readableMap, l lVar) {
        this.e = lVar;
        this.f = readableMap.getInt(C0201.m82(28699));
        this.g = readableMap.getInt(C0201.m82(28700));
        this.h = readableMap.getInt(C0201.m82(28701));
        this.i = JavaOnlyMap.deepClone(readableMap.getMap(C0201.m82(28702)));
    }

    @Override // com.facebook.react.animated.b
    public void e() {
        b l = this.e.l(this.g);
        this.i.putDouble(C0201.m82(28703), ((s) l).i());
        this.e.t(this.f, this.h, this.i, null);
    }
}
