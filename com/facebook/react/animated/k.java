package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import vigqyno.C0201;

/* compiled from: MultiplicationAnimatedNode */
public class k extends s {
    private final l i;
    private final int[] j;

    public k(ReadableMap readableMap, l lVar) {
        this.i = lVar;
        ReadableArray array = readableMap.getArray(C0201.m82(28582));
        this.j = new int[array.size()];
        int i2 = 0;
        while (true) {
            int[] iArr = this.j;
            if (i2 < iArr.length) {
                iArr[i2] = array.getInt(i2);
                i2++;
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.react.animated.b
    public void e() {
        this.f = 1.0d;
        int i2 = 0;
        while (true) {
            int[] iArr = this.j;
            if (i2 < iArr.length) {
                b l = this.i.l(iArr[i2]);
                if (l != null && (l instanceof s)) {
                    this.f *= ((s) l).i();
                    i2++;
                }
            } else {
                return;
            }
        }
        throw new JSApplicationCausedNativeException(C0201.m82(28583));
    }
}
