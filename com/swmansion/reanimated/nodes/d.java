package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
import com.swmansion.reanimated.b;
import com.swmansion.reanimated.e;
import vigqyno.C0201;

/* compiled from: CallFuncNode */
public class d extends m {
    private String a;
    private final int b;
    private final int[] c;
    private final int[] d;

    public d(int i, ReadableMap readableMap, b bVar) {
        super(i, readableMap, bVar);
        this.b = readableMap.getInt(C0201.m82(24623));
        this.d = e.a(readableMap.getArray(C0201.m82(24624)));
        this.c = e.a(readableMap.getArray(C0201.m82(24625)));
    }

    private void c() {
        com.swmansion.reanimated.d dVar = this.mNodesManager.p;
        this.a = dVar.b;
        dVar.b = this.mNodesManager.p.b + '/' + String.valueOf(this.mNodeID);
        int i = 0;
        while (true) {
            int[] iArr = this.d;
            if (i < iArr.length) {
                ((p) this.mNodesManager.o(iArr[i], p.class)).d(Integer.valueOf(this.c[i]), this.a);
                i++;
            } else {
                return;
            }
        }
    }

    private void d() {
        int i = 0;
        while (true) {
            int[] iArr = this.d;
            if (i < iArr.length) {
                ((p) this.mNodesManager.o(iArr[i], p.class)).e();
                i++;
            } else {
                this.mNodesManager.p.b = this.a;
                return;
            }
        }
    }

    @Override // com.swmansion.reanimated.nodes.m
    public Object evaluate() {
        c();
        Object value = this.mNodesManager.o(this.b, m.class).value();
        d();
        return value;
    }
}
