package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import vigqyno.C0201;

@SuppressLint({"ViewConstructor"})
/* renamed from: s5  reason: default package */
/* compiled from: GhostViewPort */
public class s5 extends ViewGroup implements p5 {
    public ViewGroup a;
    public View b;
    public final View c;
    public int d;
    private Matrix e;
    private final ViewTreeObserver.OnPreDrawListener f = new a();

    /* renamed from: s5$a */
    /* compiled from: GhostViewPort */
    class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        public boolean onPreDraw() {
            View view;
            k3.Z(s5.this);
            s5 s5Var = s5.this;
            ViewGroup viewGroup = s5Var.a;
            if (viewGroup == null || (view = s5Var.b) == null) {
                return true;
            }
            viewGroup.endViewTransition(view);
            k3.Z(s5.this.a);
            s5 s5Var2 = s5.this;
            s5Var2.a = null;
            s5Var2.b = null;
            return true;
        }
    }

    public s5(View view) {
        super(view.getContext());
        this.c = view;
        setWillNotDraw(false);
        setLayerType(2, null);
    }

    public static s5 b(View view, ViewGroup viewGroup, Matrix matrix) {
        q5 q5Var;
        if (view.getParent() instanceof ViewGroup) {
            q5 b2 = q5.b(viewGroup);
            s5 e2 = e(view);
            int i = 0;
            if (!(e2 == null || (q5Var = (q5) e2.getParent()) == b2)) {
                i = e2.d;
                q5Var.removeView(e2);
                e2 = null;
            }
            if (e2 == null) {
                if (matrix == null) {
                    matrix = new Matrix();
                    c(view, viewGroup, matrix);
                }
                e2 = new s5(view);
                e2.h(matrix);
                if (b2 == null) {
                    b2 = new q5(viewGroup);
                } else {
                    b2.g();
                }
                d(viewGroup, b2);
                d(viewGroup, e2);
                b2.a(e2);
                e2.d = i;
            } else if (matrix != null) {
                e2.h(matrix);
            }
            e2.d++;
            return e2;
        }
        throw new IllegalArgumentException(C0201.m82(1938));
    }

    public static void c(View view, ViewGroup viewGroup, Matrix matrix) {
        ViewGroup viewGroup2 = (ViewGroup) view.getParent();
        matrix.reset();
        v6.j(viewGroup2, matrix);
        matrix.preTranslate((float) (-viewGroup2.getScrollX()), (float) (-viewGroup2.getScrollY()));
        v6.k(viewGroup, matrix);
    }

    public static void d(View view, View view2) {
        v6.g(view2, view2.getLeft(), view2.getTop(), view2.getLeft() + view.getWidth(), view2.getTop() + view.getHeight());
    }

    public static s5 e(View view) {
        return (s5) view.getTag(z5.ghost_view);
    }

    public static void f(View view) {
        s5 e2 = e(view);
        if (e2 != null) {
            int i = e2.d - 1;
            e2.d = i;
            if (i <= 0) {
                ((q5) e2.getParent()).removeView(e2);
            }
        }
    }

    public static void g(View view, s5 s5Var) {
        view.setTag(z5.ghost_view, s5Var);
    }

    @Override // defpackage.p5
    public void a(ViewGroup viewGroup, View view) {
        this.a = viewGroup;
        this.b = view;
    }

    public void h(Matrix matrix) {
        this.e = matrix;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        g(this.c, this);
        this.c.getViewTreeObserver().addOnPreDrawListener(this.f);
        v6.i(this.c, 4);
        if (this.c.getParent() != null) {
            ((View) this.c.getParent()).invalidate();
        }
    }

    public void onDetachedFromWindow() {
        this.c.getViewTreeObserver().removeOnPreDrawListener(this.f);
        v6.i(this.c, 0);
        g(this.c, null);
        if (this.c.getParent() != null) {
            ((View) this.c.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    public void onDraw(Canvas canvas) {
        j5.a(canvas, true);
        canvas.setMatrix(this.e);
        v6.i(this.c, 0);
        this.c.invalidate();
        v6.i(this.c, 4);
        drawChild(canvas, this.c, getDrawingTime());
        j5.a(canvas, false);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // defpackage.p5
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (e(this.c) == this) {
            v6.i(this.c, i == 0 ? 4 : 0);
        }
    }
}
