package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import vigqyno.C0201;

/* compiled from: DivisionAnimatedNode */
public class g extends s {
    private final l i;
    private final int[] j;

    public g(ReadableMap readableMap, l lVar) {
        this.i = lVar;
        ReadableArray array = readableMap.getArray(C0201.m82(29284));
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
                    double i3 = ((s) l).i();
                    if (i2 == 0) {
                        this.f = i3;
                    } else if (i3 != 0.0d) {
                        this.f /= i3;
                    } else {
                        throw new JSApplicationCausedNativeException(C0201.m82(29285));
                    }
                    i2++;
                }
            } else {
                return;
            }
        }
        throw new JSApplicationCausedNativeException(C0201.m82(29286));
    }
}
