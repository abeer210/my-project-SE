package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
import vigqyno.C0201;

/* compiled from: ClockOpNode */
public abstract class f extends m {
    private int a;

    /* compiled from: ClockOpNode */
    public static class a extends f {
        public a(int i, ReadableMap readableMap, com.swmansion.reanimated.b bVar) {
            super(i, readableMap, bVar);
        }

        @Override // com.swmansion.reanimated.nodes.f
        public Double c(m mVar) {
            if (mVar instanceof p) {
                ((p) mVar).g();
            } else {
                ((e) mVar).c();
            }
            return m.ZERO;
        }

        @Override // com.swmansion.reanimated.nodes.f, com.swmansion.reanimated.nodes.m
        public /* bridge */ /* synthetic */ Object evaluate() {
            return f.super.evaluate();
        }
    }

    /* compiled from: ClockOpNode */
    public static class b extends f {
        public b(int i, ReadableMap readableMap, com.swmansion.reanimated.b bVar) {
            super(i, readableMap, bVar);
        }

        @Override // com.swmansion.reanimated.nodes.f
        public Double c(m mVar) {
            if (mVar instanceof p) {
                ((p) mVar).h();
            } else {
                ((e) mVar).d();
            }
            return m.ZERO;
        }

        @Override // com.swmansion.reanimated.nodes.f, com.swmansion.reanimated.nodes.m
        public /* bridge */ /* synthetic */ Object evaluate() {
            return f.super.evaluate();
        }
    }

    /* compiled from: ClockOpNode */
    public static class c extends f {
        public c(int i, ReadableMap readableMap, com.swmansion.reanimated.b bVar) {
            super(i, readableMap, bVar);
        }

        @Override // com.swmansion.reanimated.nodes.f
        public Double c(m mVar) {
            double d = 1.0d;
            if (mVar instanceof p) {
                if (!((p) mVar).f()) {
                    d = 0.0d;
                }
                return Double.valueOf(d);
            }
            if (!((e) mVar).a) {
                d = 0.0d;
            }
            return Double.valueOf(d);
        }

        @Override // com.swmansion.reanimated.nodes.f, com.swmansion.reanimated.nodes.m
        public /* bridge */ /* synthetic */ Object evaluate() {
            return f.super.evaluate();
        }
    }

    public f(int i, ReadableMap readableMap, com.swmansion.reanimated.b bVar) {
        super(i, readableMap, bVar);
        this.a = com.swmansion.reanimated.a.a(readableMap, C0201.m82(24778), C0201.m82(24779));
    }

    public abstract Double c(m mVar);

    @Override // com.swmansion.reanimated.nodes.m
    public Double evaluate() {
        return c(this.mNodesManager.o(this.a, m.class));
    }
}
