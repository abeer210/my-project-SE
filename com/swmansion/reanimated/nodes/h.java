package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
import com.swmansion.reanimated.a;
import com.swmansion.reanimated.b;
import vigqyno.C0201;

/* compiled from: CondNode */
public class h extends m {
    private final int a;
    private final int b;
    private final int c;

    public h(int i, ReadableMap readableMap, b bVar) {
        super(i, readableMap, bVar);
        this.a = a.a(readableMap, C0201.m82(24938), C0201.m82(24939));
        String r2 = C0201.m82(24940);
        String r4 = C0201.m82(24941);
        this.b = a.a(readableMap, r2, r4);
        String r22 = C0201.m82(24942);
        this.c = readableMap.hasKey(r22) ? a.a(readableMap, r22, r4) : -1;
    }

    @Override // com.swmansion.reanimated.nodes.m
    public Object evaluate() {
        Object p = this.mNodesManager.p(this.a);
        if (!(p instanceof Number) || ((Number) p).doubleValue() == 0.0d) {
            int i = this.c;
            return i != -1 ? this.mNodesManager.p(i) : m.ZERO;
        }
        int i2 = this.b;
        return i2 != -1 ? this.mNodesManager.p(i2) : m.ZERO;
    }
}
