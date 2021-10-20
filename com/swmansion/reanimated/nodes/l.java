package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.swmansion.reanimated.b;
import com.swmansion.reanimated.e;
import vigqyno.C0201;

/* compiled from: JSCallNode */
public class l extends m {
    private final int[] a;

    public l(int i, ReadableMap readableMap, b bVar) {
        super(i, readableMap, bVar);
        this.a = e.a(readableMap.getArray(C0201.m82(25136)));
    }

    @Override // com.swmansion.reanimated.nodes.m
    public Double evaluate() {
        WritableArray createArray = Arguments.createArray();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i < iArr.length) {
                m o = this.mNodesManager.o(iArr[i], m.class);
                if (o.value() == null) {
                    createArray.pushNull();
                } else {
                    Object value = o.value();
                    if (value instanceof String) {
                        createArray.pushString((String) value);
                    } else {
                        createArray.pushDouble(o.doubleValue().doubleValue());
                    }
                }
                i++;
            } else {
                WritableMap createMap = Arguments.createMap();
                createMap.putInt(C0201.m82(25137), this.mNodeID);
                createMap.putArray(C0201.m82(25138), createArray);
                this.mNodesManager.x(C0201.m82(25139), createMap);
                return m.ZERO;
            }
        }
    }
}
