package com.facebook.react.animated;

import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

/* compiled from: StyleAnimatedNode */
public class o extends b {
    private final l e;
    private final Map<String, Integer> f = new HashMap();

    public o(ReadableMap readableMap, l lVar) {
        ReadableMap map = readableMap.getMap(C0201.m82(28798));
        ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            this.f.put(nextKey, Integer.valueOf(map.getInt(nextKey)));
        }
        this.e = lVar;
    }

    public void f(JavaOnlyMap javaOnlyMap) {
        for (Map.Entry<String, Integer> entry : this.f.entrySet()) {
            b l = this.e.l(entry.getValue().intValue());
            if (l == null) {
                throw new IllegalArgumentException(C0201.m82(28800));
            } else if (l instanceof r) {
                ((r) l).f(javaOnlyMap);
            } else if (l instanceof s) {
                javaOnlyMap.putDouble(entry.getKey(), ((s) l).i());
            } else {
                throw new IllegalArgumentException(C0201.m82(28799) + l.getClass());
            }
        }
    }
}
