package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
import com.swmansion.reanimated.b;
import com.swmansion.reanimated.d;
import java.util.Stack;

/* compiled from: ParamNode */
public class p extends u {
    private final Stack<Integer> b = new Stack<>();
    private String c;

    public p(int i, ReadableMap readableMap, b bVar) {
        super(i, readableMap, bVar);
    }

    @Override // com.swmansion.reanimated.nodes.u
    public void c(Object obj) {
        m o = this.mNodesManager.o(this.b.peek().intValue(), m.class);
        d dVar = this.mUpdateContext;
        String str = dVar.b;
        dVar.b = this.c;
        ((u) o).c(obj);
        this.mUpdateContext.b = str;
        forceUpdateMemoizedValue(obj);
    }

    public void d(Integer num, String str) {
        this.c = str;
        this.b.push(num);
    }

    public void e() {
        this.b.pop();
    }

    @Override // com.swmansion.reanimated.nodes.u, com.swmansion.reanimated.nodes.m
    public Object evaluate() {
        d dVar = this.mUpdateContext;
        String str = dVar.b;
        dVar.b = this.c;
        Object value = this.mNodesManager.o(this.b.peek().intValue(), m.class).value();
        this.mUpdateContext.b = str;
        return value;
    }

    public boolean f() {
        m o = this.mNodesManager.o(this.b.peek().intValue(), m.class);
        if (o instanceof p) {
            return ((p) o).f();
        }
        return ((e) o).a;
    }

    public void g() {
        m o = this.mNodesManager.o(this.b.peek().intValue(), m.class);
        if (o instanceof p) {
            ((p) o).g();
        } else {
            ((e) o).c();
        }
    }

    public void h() {
        m o = this.mNodesManager.o(this.b.peek().intValue(), m.class);
        if (o instanceof p) {
            ((p) o).h();
        } else {
            ((e) o).d();
        }
    }
}
