package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
import vigqyno.C0201;

/* compiled from: OperatorNode */
public class o extends m {
    private static final g0 A = new p();
    private static final g0 B = new q();
    private static final g0 C = new r();
    private static final g0 D = new s();
    private static final g0 E = new t();
    private static final g0 F = new u();
    private static final g0 G = new w();
    private static final g0 H = new x();
    private static final g0 d = new k();
    private static final g0 e = new v();
    private static final g0 f = new y();
    private static final g0 g = new z();
    private static final g0 h = new a0();
    private static final g0 i = new b0();
    private static final g0 j = new c0();
    private static final g0 k = new d0();
    private static final g0 l = new e0();
    private static final g0 m = new a();
    private static final g0 n = new b();
    private static final g0 o = new c();
    private static final g0 p = new d();
    private static final g0 q = new e();
    private static final g0 r = new f();
    private static final g0 s = new g();
    private static final g0 t = new h();
    private static final g0 u = new i();
    private static final g0 v = new j();
    private static final g0 w = new l();
    private static final g0 x = new m();
    private static final g0 y = new n();
    private static final g0 z = new C0131o();
    private final int[] a;
    private final m[] b;
    private final g0 c;

    /* compiled from: OperatorNode */
    static class a extends i0 {
        public a() {
            super(null);
        }

        @Override // com.swmansion.reanimated.nodes.o.i0
        public double b(Double d) {
            return Math.cos(d.doubleValue());
        }
    }

    /* compiled from: OperatorNode */
    static class a0 extends h0 {
        public a0() {
            super(null);
        }

        @Override // com.swmansion.reanimated.nodes.o.h0
        public double b(Double d, Double d2) {
            return Math.pow(d.doubleValue(), d2.doubleValue());
        }
    }

    /* compiled from: OperatorNode */
    static class b extends i0 {
        public b() {
            super(null);
        }

        @Override // com.swmansion.reanimated.nodes.o.i0
        public double b(Double d) {
            return Math.tan(d.doubleValue());
        }
    }

    /* compiled from: OperatorNode */
    static class b0 extends h0 {
        public b0() {
            super(null);
        }

        @Override // com.swmansion.reanimated.nodes.o.h0
        public double b(Double d, Double d2) {
            return ((d.doubleValue() % d2.doubleValue()) + d2.doubleValue()) % d2.doubleValue();
        }
    }

    /* compiled from: OperatorNode */
    static class c extends i0 {
        public c() {
            super(null);
        }

        @Override // com.swmansion.reanimated.nodes.o.i0
        public double b(Double d) {
            return Math.acos(d.doubleValue());
        }
    }

    /* compiled from: OperatorNode */
    static class c0 extends i0 {
        public c0() {
            super(null);
        }

        @Override // com.swmansion.reanimated.nodes.o.i0
        public double b(Double d) {
            return Math.sqrt(d.doubleValue());
        }
    }

    /* compiled from: OperatorNode */
    static class d extends i0 {
        public d() {
            super(null);
        }

        @Override // com.swmansion.reanimated.nodes.o.i0
        public double b(Double d) {
            return Math.asin(d.doubleValue());
        }
    }

    /* compiled from: OperatorNode */
    static class d0 extends i0 {
        public d0() {
            super(null);
        }

        @Override // com.swmansion.reanimated.nodes.o.i0
        public double b(Double d) {
            return Math.log(d.doubleValue());
        }
    }

    /* compiled from: OperatorNode */
    static class e extends i0 {
        public e() {
            super(null);
        }

        @Override // com.swmansion.reanimated.nodes.o.i0
        public double b(Double d) {
            return Math.atan(d.doubleValue());
        }
    }

    /* compiled from: OperatorNode */
    static class e0 extends i0 {
        public e0() {
            super(null);
        }

        @Override // com.swmansion.reanimated.nodes.o.i0
        public double b(Double d) {
            return Math.sin(d.doubleValue());
        }
    }

    /* compiled from: OperatorNode */
    static class f extends i0 {
        public f() {
            super(null);
        }

        @Override // com.swmansion.reanimated.nodes.o.i0
        public double b(Double d) {
            return Math.exp(d.doubleValue());
        }
    }

    /* compiled from: OperatorNode */
    private static abstract class f0 implements g0 {
        private f0() {
        }

        @Override // com.swmansion.reanimated.nodes.o.g0
        public double a(m[] mVarArr) {
            return b((Double) mVarArr[0].value(), (Double) mVarArr[1].value()) ? 1.0d : 0.0d;
        }

        public abstract boolean b(Double d, Double d2);

        public /* synthetic */ f0(k kVar) {
            this();
        }
    }

    /* compiled from: OperatorNode */
    static class g extends i0 {
        public g() {
            super(null);
        }

        @Override // com.swmansion.reanimated.nodes.o.i0
        public double b(Double d) {
            return (double) Math.round(d.doubleValue());
        }
    }

    /* compiled from: OperatorNode */
    private interface g0 {
        double a(m[] mVarArr);
    }

    /* compiled from: OperatorNode */
    static class h extends i0 {
        public h() {
            super(null);
        }

        @Override // com.swmansion.reanimated.nodes.o.i0
        public double b(Double d) {
            return Math.abs(d.doubleValue());
        }
    }

    /* compiled from: OperatorNode */
    private static abstract class h0 implements g0 {
        private h0() {
        }

        @Override // com.swmansion.reanimated.nodes.o.g0
        public double a(m[] mVarArr) {
            double doubleValue = mVarArr[0].doubleValue().doubleValue();
            for (int i = 1; i < mVarArr.length; i++) {
                doubleValue = b(Double.valueOf(doubleValue), mVarArr[i].doubleValue());
            }
            return doubleValue;
        }

        public abstract double b(Double d, Double d2);

        public /* synthetic */ h0(k kVar) {
            this();
        }
    }

    /* compiled from: OperatorNode */
    static class i extends i0 {
        public i() {
            super(null);
        }

        @Override // com.swmansion.reanimated.nodes.o.i0
        public double b(Double d) {
            return Math.floor(d.doubleValue());
        }
    }

    /* compiled from: OperatorNode */
    private static abstract class i0 implements g0 {
        private i0() {
        }

        @Override // com.swmansion.reanimated.nodes.o.g0
        public double a(m[] mVarArr) {
            return b((Double) mVarArr[0].value());
        }

        public abstract double b(Double d);

        public /* synthetic */ i0(k kVar) {
            this();
        }
    }

    /* compiled from: OperatorNode */
    static class j extends i0 {
        public j() {
            super(null);
        }

        @Override // com.swmansion.reanimated.nodes.o.i0
        public double b(Double d) {
            return Math.ceil(d.doubleValue());
        }
    }

    /* compiled from: OperatorNode */
    static class k extends h0 {
        public k() {
            super(null);
        }

        @Override // com.swmansion.reanimated.nodes.o.h0
        public double b(Double d, Double d2) {
            return d.doubleValue() + d2.doubleValue();
        }
    }

    /* compiled from: OperatorNode */
    static class l extends h0 {
        public l() {
            super(null);
        }

        @Override // com.swmansion.reanimated.nodes.o.h0
        public double b(Double d, Double d2) {
            return Math.min(d.doubleValue(), d2.doubleValue());
        }
    }

    /* compiled from: OperatorNode */
    static class m extends h0 {
        public m() {
            super(null);
        }

        @Override // com.swmansion.reanimated.nodes.o.h0
        public double b(Double d, Double d2) {
            return Math.max(d.doubleValue(), d2.doubleValue());
        }
    }

    /* compiled from: OperatorNode */
    static class n implements g0 {
        @Override // com.swmansion.reanimated.nodes.o.g0
        public double a(m[] mVarArr) {
            boolean d = o.d(mVarArr[0].value());
            for (int i = 1; i < mVarArr.length && d; i++) {
                d = d && o.d(mVarArr[i].value());
            }
            return d ? 1.0d : 0.0d;
        }
    }

    /* renamed from: com.swmansion.reanimated.nodes.o$o  reason: collision with other inner class name */
    /* compiled from: OperatorNode */
    static class C0131o implements g0 {
        @Override // com.swmansion.reanimated.nodes.o.g0
        public double a(m[] mVarArr) {
            boolean d = o.d(mVarArr[0].value());
            for (int i = 1; i < mVarArr.length && !d; i++) {
                d = d || o.d(mVarArr[i].value());
            }
            return d ? 1.0d : 0.0d;
        }
    }

    /* compiled from: OperatorNode */
    static class p implements g0 {
        @Override // com.swmansion.reanimated.nodes.o.g0
        public double a(m[] mVarArr) {
            return o.d(mVarArr[0].value()) ? 0.0d : 1.0d;
        }
    }

    /* compiled from: OperatorNode */
    static class q implements g0 {
        @Override // com.swmansion.reanimated.nodes.o.g0
        public double a(m[] mVarArr) {
            Object value = mVarArr[0].value();
            return (value == null || ((value instanceof Double) && ((Double) value).isNaN())) ? 0.0d : 1.0d;
        }
    }

    /* compiled from: OperatorNode */
    static class r extends f0 {
        public r() {
            super(null);
        }

        @Override // com.swmansion.reanimated.nodes.o.f0
        public boolean b(Double d, Double d2) {
            return (d == null || d2 == null || d.doubleValue() >= d2.doubleValue()) ? false : true;
        }
    }

    /* compiled from: OperatorNode */
    static class s extends f0 {
        public s() {
            super(null);
        }

        @Override // com.swmansion.reanimated.nodes.o.f0
        public boolean b(Double d, Double d2) {
            return (d == null || d2 == null) ? d == d2 : d.doubleValue() == d2.doubleValue();
        }
    }

    /* compiled from: OperatorNode */
    static class t extends f0 {
        public t() {
            super(null);
        }

        @Override // com.swmansion.reanimated.nodes.o.f0
        public boolean b(Double d, Double d2) {
            return (d == null || d2 == null || d.doubleValue() <= d2.doubleValue()) ? false : true;
        }
    }

    /* compiled from: OperatorNode */
    static class u extends f0 {
        public u() {
            super(null);
        }

        @Override // com.swmansion.reanimated.nodes.o.f0
        public boolean b(Double d, Double d2) {
            return d.doubleValue() <= d2.doubleValue();
        }
    }

    /* compiled from: OperatorNode */
    static class v extends h0 {
        public v() {
            super(null);
        }

        @Override // com.swmansion.reanimated.nodes.o.h0
        public double b(Double d, Double d2) {
            return d.doubleValue() - d2.doubleValue();
        }
    }

    /* compiled from: OperatorNode */
    static class w extends f0 {
        public w() {
            super(null);
        }

        @Override // com.swmansion.reanimated.nodes.o.f0
        public boolean b(Double d, Double d2) {
            return d.doubleValue() >= d2.doubleValue();
        }
    }

    /* compiled from: OperatorNode */
    static class x extends f0 {
        public x() {
            super(null);
        }

        @Override // com.swmansion.reanimated.nodes.o.f0
        public boolean b(Double d, Double d2) {
            return (d == null || d2 == null) ? d == d2 : d.doubleValue() != d2.doubleValue();
        }
    }

    /* compiled from: OperatorNode */
    static class y extends h0 {
        public y() {
            super(null);
        }

        @Override // com.swmansion.reanimated.nodes.o.h0
        public double b(Double d, Double d2) {
            return d.doubleValue() * d2.doubleValue();
        }
    }

    /* compiled from: OperatorNode */
    static class z extends h0 {
        public z() {
            super(null);
        }

        @Override // com.swmansion.reanimated.nodes.o.h0
        public double b(Double d, Double d2) {
            return d.doubleValue() / d2.doubleValue();
        }
    }

    public o(int i2, ReadableMap readableMap, com.swmansion.reanimated.b bVar) {
        super(i2, readableMap, bVar);
        int[] a2 = com.swmansion.reanimated.e.a(readableMap.getArray(C0201.m82(20254)));
        this.a = a2;
        this.b = new m[a2.length];
        String string = readableMap.getString(C0201.m82(20255));
        if (C0201.m82(20256).equals(string)) {
            this.c = d;
        } else if (C0201.m82(20257).equals(string)) {
            this.c = e;
        } else if (C0201.m82(20258).equals(string)) {
            this.c = f;
        } else if (C0201.m82(20259).equals(string)) {
            this.c = g;
        } else if (C0201.m82(20260).equals(string)) {
            this.c = h;
        } else if (C0201.m82(20261).equals(string)) {
            this.c = i;
        } else if (C0201.m82(20262).equals(string)) {
            this.c = j;
        } else if (C0201.m82(20263).equals(string)) {
            this.c = k;
        } else if (C0201.m82(20264).equals(string)) {
            this.c = l;
        } else if (C0201.m82(20265).equals(string)) {
            this.c = m;
        } else if (C0201.m82(20266).equals(string)) {
            this.c = n;
        } else if (C0201.m82(20267).equals(string)) {
            this.c = o;
        } else if (C0201.m82(20268).equals(string)) {
            this.c = p;
        } else if (C0201.m82(20269).equals(string)) {
            this.c = q;
        } else if (C0201.m82(20270).equals(string)) {
            this.c = r;
        } else if (C0201.m82(20271).equals(string)) {
            this.c = s;
        } else if (C0201.m82(20272).equals(string)) {
            this.c = y;
        } else if (C0201.m82(20273).equals(string)) {
            this.c = z;
        } else if (C0201.m82(20274).equals(string)) {
            this.c = A;
        } else if (C0201.m82(20275).equals(string)) {
            this.c = B;
        } else if (C0201.m82(20276).equals(string)) {
            this.c = C;
        } else if (C0201.m82(20277).equals(string)) {
            this.c = D;
        } else if (C0201.m82(20278).equals(string)) {
            this.c = E;
        } else if (C0201.m82(20279).equals(string)) {
            this.c = F;
        } else if (C0201.m82(20280).equals(string)) {
            this.c = G;
        } else if (C0201.m82(20281).equals(string)) {
            this.c = H;
        } else if (C0201.m82(20282).equals(string)) {
            this.c = t;
        } else if (C0201.m82(20283).equals(string)) {
            this.c = u;
        } else if (C0201.m82(20284).equals(string)) {
            this.c = v;
        } else if (C0201.m82(20285).equals(string)) {
            this.c = x;
        } else if (C0201.m82(20286).equals(string)) {
            this.c = w;
        } else {
            throw new JSApplicationIllegalArgumentException(C0201.m82(20287) + string);
        }
    }

    /* access modifiers changed from: private */
    public static boolean d(Object obj) {
        return obj != null && !obj.equals(Double.valueOf(0.0d));
    }

    @Override // com.swmansion.reanimated.nodes.m
    public Object evaluate() {
        int i2 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i2 >= iArr.length) {
                return Double.valueOf(this.c.a(this.b));
            }
            this.b[i2] = this.mNodesManager.o(iArr[i2], m.class);
            i2++;
        }
    }
}
