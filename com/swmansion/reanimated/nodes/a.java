package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
import com.swmansion.reanimated.b;
import vigqyno.C0201;

/* compiled from: AlwaysNode */
public class a extends m implements j {
    private int a;

    public a(int i, ReadableMap readableMap, b bVar) {
        super(i, readableMap, bVar);
        this.a = com.swmansion.reanimated.a.a(readableMap, C0201.m82(24261), C0201.m82(24262));
    }

    @Override // com.swmansion.reanimated.nodes.j
    public void a() {
        value();
    }

    @Override // com.swmansion.reanimated.nodes.m
    public Double evaluate() {
        this.mNodesManager.o(this.a, m.class).value();
        return m.ZERO;
    }
}
