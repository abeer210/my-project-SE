package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.swmansion.reanimated.b;
import vigqyno.C0201;

/* compiled from: ValueNode */
public class u extends m {
    private Object a;

    public u(int i, ReadableMap readableMap, b bVar) {
        super(i, readableMap, bVar);
        if (readableMap != null) {
            String r5 = C0201.m82(20793);
            if (readableMap.hasKey(r5)) {
                ReadableType type = readableMap.getType(r5);
                if (type == ReadableType.String) {
                    this.a = readableMap.getString(r5);
                    return;
                } else if (type == ReadableType.Number) {
                    this.a = Double.valueOf(readableMap.getDouble(r5));
                    return;
                } else if (type == ReadableType.Null) {
                    this.a = null;
                    return;
                } else {
                    throw new IllegalStateException(C0201.m82(20794));
                }
            }
        }
        this.a = null;
    }

    public void c(Object obj) {
        this.a = obj;
        forceUpdateMemoizedValue(obj);
    }

    @Override // com.swmansion.reanimated.nodes.m
    public Object evaluate() {
        return this.a;
    }
}
