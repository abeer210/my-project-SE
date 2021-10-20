package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
import com.swmansion.reanimated.a;
import com.swmansion.reanimated.b;
import vigqyno.C0201;

/* compiled from: SetNode */
public class r extends m {
    private int a;
    private int b;

    public r(int i, ReadableMap readableMap, b bVar) {
        super(i, readableMap, bVar);
        this.a = a.a(readableMap, C0201.m82(20763), C0201.m82(20764));
        this.b = a.a(readableMap, C0201.m82(20765), C0201.m82(20766));
    }

    @Override // com.swmansion.reanimated.nodes.m
    public Object evaluate() {
        Object p = this.mNodesManager.p(this.b);
        ((u) this.mNodesManager.o(this.a, u.class)).c(p);
        return p;
    }
}
