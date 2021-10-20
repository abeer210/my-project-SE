package com.swmansion.reanimated.nodes;

import android.util.Log;
import com.facebook.react.bridge.ReadableMap;
import com.swmansion.reanimated.a;
import com.swmansion.reanimated.b;
import vigqyno.C0201;

/* compiled from: DebugNode */
public class i extends m {
    private final String a;
    private final int b;

    public i(int i, ReadableMap readableMap, b bVar) {
        super(i, readableMap, bVar);
        this.a = a.b(readableMap, C0201.m82(24807), C0201.m82(24808));
        this.b = a.a(readableMap, C0201.m82(24809), C0201.m82(24810));
    }

    @Override // com.swmansion.reanimated.nodes.m
    public Object evaluate() {
        Object value = this.mNodesManager.o(this.b, m.class).value();
        Log.d(C0201.m82(24812), String.format(C0201.m82(24811), this.a, value));
        return value;
    }
}
