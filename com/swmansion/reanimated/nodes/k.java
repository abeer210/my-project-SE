package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
import com.swmansion.reanimated.b;
import vigqyno.C0201;

/* compiled from: FunctionNode */
public class k extends m {
    private final int a;

    public k(int i, ReadableMap readableMap, b bVar) {
        super(i, readableMap, bVar);
        this.a = readableMap.getInt(C0201.m82(24999));
    }

    @Override // com.swmansion.reanimated.nodes.m
    public Object evaluate() {
        return this.mNodesManager.o(this.a, m.class).value();
    }
}
