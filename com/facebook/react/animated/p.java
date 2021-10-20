package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import vigqyno.C0201;

/* compiled from: SubtractionAnimatedNode */
public class p extends s {
    private final l i;
    private final int[] j;

    public p(ReadableMap readableMap, l lVar) {
        this.i = lVar;
        ReadableArray array = readableMap.getArray(C0201.m82(28929));
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
        int i2 = 0;
        while (true) {
            int[] iArr = this.j;
            if (i2 < iArr.length) {
                b l = this.i.l(iArr[i2]);
                if (l != null && (l instanceof s)) {
                    s sVar = (s) l;
                    double i3 = sVar.i();
                    if (i2 == 0) {
                        this.f = i3;
                    } else {
                        this.f -= sVar.i();
                    }
                    i2++;
                }
            } else {
                return;
            }
        }
        throw new JSApplicationCausedNativeException(C0201.m82(28930));
    }
}
