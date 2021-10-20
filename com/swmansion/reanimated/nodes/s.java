package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.swmansion.reanimated.b;
import com.swmansion.reanimated.e;
import java.util.Map;
import vigqyno.C0201;

/* compiled from: StyleNode */
public class s extends m {
    private final Map<String, Integer> a;

    public s(int i, ReadableMap readableMap, b bVar) {
        super(i, readableMap, bVar);
        this.a = e.b(readableMap.getMap(C0201.m82(20665)));
    }

    /* renamed from: c */
    public WritableMap evaluate() {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        for (Map.Entry<String, Integer> entry : this.a.entrySet()) {
            m o = this.mNodesManager.o(entry.getValue().intValue(), m.class);
            if (o instanceof t) {
                javaOnlyMap.putArray(entry.getKey(), (WritableArray) o.value());
            } else {
                Object value = o.value();
                if (value instanceof Double) {
                    javaOnlyMap.putDouble(entry.getKey(), ((Double) value).doubleValue());
                } else if (value instanceof String) {
                    javaOnlyMap.putString(entry.getKey(), (String) value);
                } else {
                    throw new IllegalStateException(C0201.m82(20666));
                }
            }
        }
        return javaOnlyMap;
    }
}
