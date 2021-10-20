package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
import com.swmansion.reanimated.b;

/* compiled from: ClockNode */
public class e extends m implements b.d {
    public boolean a;

    public e(int i, ReadableMap readableMap, b bVar) {
        super(i, readableMap, bVar);
    }

    @Override // com.swmansion.reanimated.b.d
    public void b() {
        if (this.a) {
            markUpdated();
            this.mNodesManager.v(this);
        }
    }

    public void c() {
        if (!this.a) {
            this.a = true;
            this.mNodesManager.v(this);
        }
    }

    public void d() {
        this.a = false;
    }

    @Override // com.swmansion.reanimated.nodes.m
    public Double evaluate() {
        return Double.valueOf(this.mNodesManager.o);
    }
}
