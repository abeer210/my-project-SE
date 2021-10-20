package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import vigqyno.C0201;

/* renamed from: w90  reason: default package */
/* compiled from: ScalingUtils */
public class w90 {

    /* renamed from: w90$a */
    /* compiled from: ScalingUtils */
    public static abstract class a implements c {
        @Override // defpackage.w90.c
        public Matrix a(Matrix matrix, Rect rect, int i, int i2, float f, float f2) {
            b(matrix, rect, i, i2, f, f2, ((float) rect.width()) / ((float) i), ((float) rect.height()) / ((float) i2));
            return matrix;
        }

        public abstract void b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4);
    }

    /* renamed from: w90$c */
    /* compiled from: ScalingUtils */
    public interface c {
        public static final c a = k.j;
        public static final c b = j.j;
        public static final c c = h.j;
        public static final c d = i.j;
        public static final c e = d.j;
        public static final c f = f.j;
        public static final c g = e.j;
        public static final c h = l.j;
        public static final c i = g.j;

        Matrix a(Matrix matrix, Rect rect, int i2, int i3, float f2, float f3);
    }

    /* renamed from: w90$d */
    /* compiled from: ScalingUtils */
    private static class d extends a {
        public static final c j = new d();

        private d() {
        }

        @Override // defpackage.w90.a
        public void b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            matrix.setTranslate((float) ((int) (((float) rect.left) + (((float) (rect.width() - i)) * 0.5f) + 0.5f)), (float) ((int) (((float) rect.top) + (((float) (rect.height() - i2)) * 0.5f) + 0.5f)));
        }

        public String toString() {
            return C0201.m82(25522);
        }
    }

    /* renamed from: w90$e */
    /* compiled from: ScalingUtils */
    private static class e extends a {
        public static final c j = new e();

        private e() {
        }

        @Override // defpackage.w90.a
        public void b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float f5;
            float f6;
            if (f4 > f3) {
                f5 = ((float) rect.left) + ((((float) rect.width()) - (((float) i) * f4)) * 0.5f);
                f6 = (float) rect.top;
                f3 = f4;
            } else {
                f6 = ((((float) rect.height()) - (((float) i2) * f3)) * 0.5f) + ((float) rect.top);
                f5 = (float) rect.left;
            }
            matrix.setScale(f3, f3);
            matrix.postTranslate((float) ((int) (f5 + 0.5f)), (float) ((int) (f6 + 0.5f)));
        }

        public String toString() {
            return C0201.m82(26632);
        }
    }

    /* renamed from: w90$f */
    /* compiled from: ScalingUtils */
    private static class f extends a {
        public static final c j = new f();

        private f() {
        }

        @Override // defpackage.w90.a
        public void b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(Math.min(f3, f4), 1.0f);
            float width = ((float) rect.left) + ((((float) rect.width()) - (((float) i) * min)) * 0.5f);
            float height = ((float) rect.top) + ((((float) rect.height()) - (((float) i2) * min)) * 0.5f);
            matrix.setScale(min, min);
            matrix.postTranslate((float) ((int) (width + 0.5f)), (float) ((int) (height + 0.5f)));
        }

        public String toString() {
            return C0201.m82(26569);
        }
    }

    /* renamed from: w90$g */
    /* compiled from: ScalingUtils */
    private static class g extends a {
        public static final c j = new g();

        private g() {
        }

        @Override // defpackage.w90.a
        public void b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(f3, f4);
            matrix.setScale(min, min);
            matrix.postTranslate((float) ((int) (((float) rect.left) + 0.5f)), (float) ((int) (((float) rect.top) + (((float) rect.height()) - (((float) i2) * min)) + 0.5f)));
        }

        public String toString() {
            return C0201.m82(25218);
        }
    }

    /* renamed from: w90$h */
    /* compiled from: ScalingUtils */
    private static class h extends a {
        public static final c j = new h();

        private h() {
        }

        @Override // defpackage.w90.a
        public void b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(f3, f4);
            float width = ((float) rect.left) + ((((float) rect.width()) - (((float) i) * min)) * 0.5f);
            float height = ((float) rect.top) + ((((float) rect.height()) - (((float) i2) * min)) * 0.5f);
            matrix.setScale(min, min);
            matrix.postTranslate((float) ((int) (width + 0.5f)), (float) ((int) (height + 0.5f)));
        }

        public String toString() {
            return C0201.m82(25192);
        }
    }

    /* renamed from: w90$i */
    /* compiled from: ScalingUtils */
    private static class i extends a {
        public static final c j = new i();

        private i() {
        }

        @Override // defpackage.w90.a
        public void b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(f3, f4);
            matrix.setScale(min, min);
            matrix.postTranslate((float) ((int) (((float) rect.left) + (((float) rect.width()) - (((float) i) * min)) + 0.5f)), (float) ((int) (((float) rect.top) + (((float) rect.height()) - (((float) i2) * min)) + 0.5f)));
        }

        public String toString() {
            return C0201.m82(25430);
        }
    }

    /* renamed from: w90$j */
    /* compiled from: ScalingUtils */
    private static class j extends a {
        public static final c j = new j();

        private j() {
        }

        @Override // defpackage.w90.a
        public void b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(f3, f4);
            matrix.setScale(min, min);
            matrix.postTranslate((float) ((int) (((float) rect.left) + 0.5f)), (float) ((int) (((float) rect.top) + 0.5f)));
        }

        public String toString() {
            return C0201.m82(25274);
        }
    }

    /* renamed from: w90$k */
    /* compiled from: ScalingUtils */
    private static class k extends a {
        public static final c j = new k();

        private k() {
        }

        @Override // defpackage.w90.a
        public void b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            matrix.setScale(f3, f4);
            matrix.postTranslate((float) ((int) (((float) rect.left) + 0.5f)), (float) ((int) (((float) rect.top) + 0.5f)));
        }

        public String toString() {
            return C0201.m82(26804);
        }
    }

    /* renamed from: w90$l */
    /* compiled from: ScalingUtils */
    private static class l extends a {
        public static final c j = new l();

        private l() {
        }

        @Override // defpackage.w90.a
        public void b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float f5;
            float f6;
            if (f4 > f3) {
                float f7 = ((float) i) * f4;
                f5 = ((float) rect.left) + Math.max(Math.min((((float) rect.width()) * 0.5f) - (f * f7), 0.0f), ((float) rect.width()) - f7);
                f6 = (float) rect.top;
                f3 = f4;
            } else {
                f5 = (float) rect.left;
                float f8 = ((float) i2) * f3;
                f6 = Math.max(Math.min((((float) rect.height()) * 0.5f) - (f2 * f8), 0.0f), ((float) rect.height()) - f8) + ((float) rect.top);
            }
            matrix.setScale(f3, f3);
            matrix.postTranslate((float) ((int) (f5 + 0.5f)), (float) ((int) (f6 + 0.5f)));
        }

        public String toString() {
            return C0201.m82(26773);
        }
    }

    /* renamed from: w90$m */
    /* compiled from: ScalingUtils */
    public interface m {
        Object getState();
    }

    public static v90 a(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof v90) {
            return (v90) drawable;
        }
        if (drawable instanceof h90) {
            return a(((h90) drawable).l());
        }
        if (drawable instanceof f90) {
            f90 f90 = (f90) drawable;
            int f2 = f90.f();
            for (int i2 = 0; i2 < f2; i2++) {
                v90 a2 = a(f90.c(i2));
                if (a2 != null) {
                    return a2;
                }
            }
        }
        return null;
    }

    /* renamed from: w90$b */
    /* compiled from: ScalingUtils */
    public static class b implements c, m {
        private final c j;
        private final c k;
        private final Rect l;
        private final Rect m;
        private final PointF n;
        private final PointF o;
        private final float[] p;
        private final float[] q;
        private final float[] r;
        private float s;

        public b(c cVar, c cVar2, Rect rect, Rect rect2, PointF pointF, PointF pointF2) {
            this.p = new float[9];
            this.q = new float[9];
            this.r = new float[9];
            this.j = cVar;
            this.k = cVar2;
            this.l = rect;
            this.m = rect2;
            this.n = pointF;
            this.o = pointF2;
        }

        @Override // defpackage.w90.c
        public Matrix a(Matrix matrix, Rect rect, int i, int i2, float f, float f2) {
            Rect rect2 = this.l;
            Rect rect3 = rect2 != null ? rect2 : rect;
            Rect rect4 = this.m;
            Rect rect5 = rect4 != null ? rect4 : rect;
            c cVar = this.j;
            PointF pointF = this.n;
            float f3 = pointF == null ? f : pointF.x;
            PointF pointF2 = this.n;
            cVar.a(matrix, rect3, i, i2, f3, pointF2 == null ? f2 : pointF2.y);
            matrix.getValues(this.p);
            c cVar2 = this.k;
            PointF pointF3 = this.o;
            float f4 = pointF3 == null ? f : pointF3.x;
            PointF pointF4 = this.o;
            cVar2.a(matrix, rect5, i, i2, f4, pointF4 == null ? f2 : pointF4.y);
            matrix.getValues(this.q);
            for (int i3 = 0; i3 < 9; i3++) {
                float[] fArr = this.r;
                float f5 = this.p[i3];
                float f6 = this.s;
                fArr[i3] = (f5 * (1.0f - f6)) + (this.q[i3] * f6);
            }
            matrix.setValues(this.r);
            return matrix;
        }

        public void b(float f) {
            this.s = f;
        }

        @Override // defpackage.w90.m
        public Object getState() {
            return Float.valueOf(this.s);
        }

        public String toString() {
            return String.format(C0201.m82(27568), String.valueOf(this.j), String.valueOf(this.n), String.valueOf(this.k), String.valueOf(this.o));
        }

        public b(c cVar, c cVar2, Rect rect, Rect rect2) {
            this(cVar, cVar2, rect, rect2, null, null);
        }
    }
}
