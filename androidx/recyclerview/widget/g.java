package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import vigqyno.C0201;

/* compiled from: LinearSmoothScroller */
public class g extends RecyclerView.z {
    public final LinearInterpolator i = new LinearInterpolator();
    public final DecelerateInterpolator j = new DecelerateInterpolator();
    public PointF k;
    private final DisplayMetrics l;
    private boolean m = false;
    private float n;
    public int o = 0;
    public int p = 0;

    public g(Context context) {
        this.l = context.getResources().getDisplayMetrics();
    }

    private float A() {
        if (!this.m) {
            this.n = v(this.l);
            this.m = true;
        }
        return this.n;
    }

    private int y(int i2, int i3) {
        int i4 = i2 - i3;
        if (i2 * i4 <= 0) {
            return 0;
        }
        return i4;
    }

    public int B() {
        PointF pointF = this.k;
        if (pointF != null) {
            float f = pointF.y;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    public void C(RecyclerView.z.a aVar) {
        PointF a = a(f());
        if (a == null || (a.x == 0.0f && a.y == 0.0f)) {
            aVar.b(f());
            r();
            return;
        }
        i(a);
        this.k = a;
        this.o = (int) (a.x * 10000.0f);
        this.p = (int) (a.y * 10000.0f);
        aVar.d((int) (((float) this.o) * 1.2f), (int) (((float) this.p) * 1.2f), (int) (((float) x(10000)) * 1.2f), this.i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z
    public void l(int i2, int i3, RecyclerView.a0 a0Var, RecyclerView.z.a aVar) {
        if (c() == 0) {
            r();
            return;
        }
        this.o = y(this.o, i2);
        int y = y(this.p, i3);
        this.p = y;
        if (this.o == 0 && y == 0) {
            C(aVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z
    public void m() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z
    public void n() {
        this.p = 0;
        this.o = 0;
        this.k = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z
    public void o(View view, RecyclerView.a0 a0Var, RecyclerView.z.a aVar) {
        int t = t(view, z());
        int u = u(view, B());
        int w = w((int) Math.sqrt((double) ((t * t) + (u * u))));
        if (w > 0) {
            aVar.d(-t, -u, w, this.j);
        }
    }

    public int s(int i2, int i3, int i4, int i5, int i6) {
        if (i6 == -1) {
            return i4 - i2;
        }
        if (i6 == 0) {
            int i7 = i4 - i2;
            if (i7 > 0) {
                return i7;
            }
            int i8 = i5 - i3;
            if (i8 < 0) {
                return i8;
            }
            return 0;
        } else if (i6 == 1) {
            return i5 - i3;
        } else {
            throw new IllegalArgumentException(C0201.m82(15236));
        }
    }

    public int t(View view, int i2) {
        RecyclerView.o e = e();
        if (e == null || !e.k()) {
            return 0;
        }
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        return s(e.Q(view) - ((ViewGroup.MarginLayoutParams) pVar).leftMargin, e.T(view) + ((ViewGroup.MarginLayoutParams) pVar).rightMargin, e.e0(), e.o0() - e.f0(), i2);
    }

    public int u(View view, int i2) {
        RecyclerView.o e = e();
        if (e == null || !e.l()) {
            return 0;
        }
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        return s(e.U(view) - ((ViewGroup.MarginLayoutParams) pVar).topMargin, e.O(view) + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin, e.g0(), e.W() - e.d0(), i2);
    }

    public float v(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    public int w(int i2) {
        double x = (double) x(i2);
        Double.isNaN(x);
        return (int) Math.ceil(x / 0.3356d);
    }

    public int x(int i2) {
        return (int) Math.ceil((double) (((float) Math.abs(i2)) * A()));
    }

    public int z() {
        PointF pointF = this.k;
        if (pointF != null) {
            float f = pointF.x;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }
}
