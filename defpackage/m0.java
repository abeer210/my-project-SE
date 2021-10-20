package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import defpackage.q0;

/* renamed from: m0  reason: default package */
/* compiled from: CardViewBaseImpl */
public class m0 implements o0 {
    public final RectF a = new RectF();

    /* renamed from: m0$a */
    /* compiled from: CardViewBaseImpl */
    class a implements q0.a {
        public a() {
        }

        @Override // defpackage.q0.a
        public void a(Canvas canvas, RectF rectF, float f, Paint paint) {
            float f2 = 2.0f * f;
            float width = (rectF.width() - f2) - 1.0f;
            float height = (rectF.height() - f2) - 1.0f;
            if (f >= 1.0f) {
                float f3 = f + 0.5f;
                float f4 = -f3;
                m0.this.a.set(f4, f4, f3, f3);
                int save = canvas.save();
                canvas.translate(rectF.left + f3, rectF.top + f3);
                canvas.drawArc(m0.this.a, 180.0f, 90.0f, true, paint);
                canvas.translate(width, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(m0.this.a, 180.0f, 90.0f, true, paint);
                canvas.translate(height, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(m0.this.a, 180.0f, 90.0f, true, paint);
                canvas.translate(width, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(m0.this.a, 180.0f, 90.0f, true, paint);
                canvas.restoreToCount(save);
                float f5 = rectF.top;
                canvas.drawRect((rectF.left + f3) - 1.0f, f5, (rectF.right - f3) + 1.0f, f5 + f3, paint);
                float f6 = rectF.bottom;
                canvas.drawRect((rectF.left + f3) - 1.0f, f6 - f3, (rectF.right - f3) + 1.0f, f6, paint);
            }
            canvas.drawRect(rectF.left, rectF.top + f, rectF.right, rectF.bottom - f, paint);
        }
    }

    private q0 n(n0 n0Var) {
        return (q0) n0Var.e();
    }

    @Override // defpackage.o0
    public void a(n0 n0Var, float f) {
        n(n0Var).p(f);
        o(n0Var);
    }

    @Override // defpackage.o0
    public float b(n0 n0Var) {
        return n(n0Var).l();
    }

    @Override // defpackage.o0
    public float c(n0 n0Var) {
        return n(n0Var).g();
    }

    @Override // defpackage.o0
    public void d(n0 n0Var) {
    }

    @Override // defpackage.o0
    public void e(n0 n0Var, float f) {
        n(n0Var).r(f);
    }

    @Override // defpackage.o0
    public float f(n0 n0Var) {
        return n(n0Var).i();
    }

    @Override // defpackage.o0
    public ColorStateList g(n0 n0Var) {
        return n(n0Var).f();
    }

    @Override // defpackage.o0
    public void h() {
        q0.r = new a();
    }

    @Override // defpackage.o0
    public float i(n0 n0Var) {
        return n(n0Var).j();
    }

    @Override // defpackage.o0
    public float j(n0 n0Var) {
        return n(n0Var).k();
    }

    @Override // defpackage.o0
    public void k(n0 n0Var) {
        n(n0Var).m(n0Var.c());
        o(n0Var);
    }

    @Override // defpackage.o0
    public void l(n0 n0Var, ColorStateList colorStateList) {
        n(n0Var).o(colorStateList);
    }

    @Override // defpackage.o0
    public void m(n0 n0Var, float f) {
        n(n0Var).q(f);
        o(n0Var);
    }

    public void o(n0 n0Var) {
        Rect rect = new Rect();
        n(n0Var).h(rect);
        n0Var.b((int) Math.ceil((double) j(n0Var)), (int) Math.ceil((double) i(n0Var)));
        n0Var.a(rect.left, rect.top, rect.right, rect.bottom);
    }
}
