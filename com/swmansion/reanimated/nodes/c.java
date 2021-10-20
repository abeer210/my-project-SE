package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
import com.swmansion.reanimated.b;
import com.swmansion.reanimated.e;
import vigqyno.C0201;

/* compiled from: BlockNode */
public class c extends m {
    private final int[] a;

    public c(int i, ReadableMap readableMap, b bVar) {
        super(i, readableMap, bVar);
        this.a = e.a(readableMap.getArray(C0201.m82(24328)));
    }

    @Override // com.swmansion.reanimated.nodes.m
    public Object evaluate() {
        Object obj = null;
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                return obj;
            }
            obj = this.mNodesManager.o(iArr[i], m.class).value();
            i++;
        }
    }
}
