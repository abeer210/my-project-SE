package com.swmansion.reanimated.nodes;

import android.graphics.PointF;
import com.facebook.react.bridge.ReadableMap;
import vigqyno.C0201;

/* compiled from: BezierNode */
public class b extends m {
    private final int a;
    private final a b;

    public b(int i, ReadableMap readableMap, com.swmansion.reanimated.b bVar) {
        super(i, readableMap, bVar);
        this.a = com.swmansion.reanimated.a.a(readableMap, C0201.m82(24548), C0201.m82(24549));
        this.b = new a((float) readableMap.getDouble(C0201.m82(24550)), (float) readableMap.getDouble(C0201.m82(24551)), (float) readableMap.getDouble(C0201.m82(24552)), (float) readableMap.getDouble(C0201.m82(24553)));
    }

    @Override // com.swmansion.reanimated.nodes.m
    public Double evaluate() {
        return Double.valueOf((double) this.b.c(((Double) this.mNodesManager.p(this.a)).floatValue()));
    }

    /* access modifiers changed from: private */
    /* compiled from: BezierNode */
    public static class a {
        public PointF a;
        public PointF b;
        public PointF c;
        public PointF d;
        public PointF e;

        public a(PointF pointF, PointF pointF2) {
            this.c = new PointF();
            this.d = new PointF();
            this.e = new PointF();
            this.a = pointF;
            this.b = pointF2;
        }

        private float a(float f) {
            PointF pointF = this.e;
            PointF pointF2 = this.a;
            float f2 = pointF2.x * 3.0f;
            pointF.x = f2;
            PointF pointF3 = this.d;
            float f3 = ((this.b.x - pointF2.x) * 3.0f) - f2;
            pointF3.x = f3;
            PointF pointF4 = this.c;
            float f4 = (1.0f - pointF.x) - f3;
            pointF4.x = f4;
            return f * (pointF.x + ((pointF3.x + (f4 * f)) * f));
        }

        private float d(float f) {
            return this.e.x + (f * ((this.d.x * 2.0f) + (this.c.x * 3.0f * f)));
        }

        public float b(float f) {
            PointF pointF = this.e;
            PointF pointF2 = this.a;
            float f2 = pointF2.y * 3.0f;
            pointF.y = f2;
            PointF pointF3 = this.d;
            float f3 = ((this.b.y - pointF2.y) * 3.0f) - f2;
            pointF3.y = f3;
            PointF pointF4 = this.c;
            float f4 = (1.0f - pointF.y) - f3;
            pointF4.y = f4;
            return f * (pointF.y + ((pointF3.y + (f4 * f)) * f));
        }

        public float c(float f) {
            return b(e(f));
        }

        public float e(float f) {
            float f2 = f;
            for (int i = 1; i < 14; i++) {
                float a2 = a(f2) - f;
                if (((double) Math.abs(a2)) < 0.001d) {
                    break;
                }
                f2 -= a2 / d(f2);
            }
            return f2;
        }

        public a(float f, float f2, float f3, float f4) {
            this(new PointF(f, f2), new PointF(f3, f4));
        }
    }
}
