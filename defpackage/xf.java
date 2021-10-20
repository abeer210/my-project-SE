package defpackage;

import android.view.Choreographer;
import vigqyno.C0201;

/* renamed from: xf  reason: default package */
/* compiled from: LottieValueAnimator */
public class xf extends tf implements Choreographer.FrameCallback {
    private float c = 1.0f;
    private boolean d = false;
    private long e = 0;
    private float f = 0.0f;
    private int g = 0;
    private float h = -2.14748365E9f;
    private float i = 2.14748365E9f;
    private ea j;
    public boolean k = false;

    private void I() {
        if (this.j != null) {
            float f2 = this.f;
            if (f2 < this.h || f2 > this.i) {
                throw new IllegalStateException(String.format(C0201.m82(17327), Float.valueOf(this.h), Float.valueOf(this.i), Float.valueOf(this.f)));
            }
        }
    }

    private float l() {
        ea eaVar = this.j;
        if (eaVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / eaVar.h()) / Math.abs(this.c);
    }

    private boolean q() {
        return o() < 0.0f;
    }

    public void B(float f2) {
        if (this.f != f2) {
            this.f = zf.b(f2, n(), m());
            this.e = 0;
            e();
        }
    }

    public void C(float f2) {
        D(this.h, f2);
    }

    public void D(float f2, float f3) {
        if (f2 <= f3) {
            ea eaVar = this.j;
            float o = eaVar == null ? -3.4028235E38f : eaVar.o();
            ea eaVar2 = this.j;
            float f4 = eaVar2 == null ? Float.MAX_VALUE : eaVar2.f();
            this.h = zf.b(f2, o, f4);
            this.i = zf.b(f3, o, f4);
            B((float) ((int) zf.b(this.f, f2, f3)));
            return;
        }
        throw new IllegalArgumentException(String.format(C0201.m82(17328), Float.valueOf(f2), Float.valueOf(f3)));
    }

    public void F(int i2) {
        D((float) i2, (float) ((int) this.i));
    }

    public void G(float f2) {
        this.c = f2;
    }

    public void cancel() {
        a();
        v();
    }

    public void doFrame(long j2) {
        u();
        if (this.j != null && isRunning()) {
            String r0 = C0201.m82(17329);
            ca.a(r0);
            long j3 = this.e;
            long j4 = 0;
            if (j3 != 0) {
                j4 = j2 - j3;
            }
            float l = ((float) j4) / l();
            float f2 = this.f;
            if (q()) {
                l = -l;
            }
            float f3 = f2 + l;
            this.f = f3;
            boolean z = !zf.d(f3, n(), m());
            this.f = zf.b(this.f, n(), m());
            this.e = j2;
            e();
            if (z) {
                if (getRepeatCount() == -1 || this.g < getRepeatCount()) {
                    c();
                    this.g++;
                    if (getRepeatMode() == 2) {
                        this.d = !this.d;
                        y();
                    } else {
                        this.f = q() ? m() : n();
                    }
                    this.e = j2;
                } else {
                    this.f = this.c < 0.0f ? n() : m();
                    v();
                    b(q());
                }
            }
            I();
            ca.b(r0);
        }
    }

    public void f() {
        this.j = null;
        this.h = -2.14748365E9f;
        this.i = 2.14748365E9f;
    }

    public void g() {
        v();
        b(q());
    }

    public float getAnimatedFraction() {
        float n;
        float m;
        float n2;
        if (this.j == null) {
            return 0.0f;
        }
        if (q()) {
            n = m() - this.f;
            m = m();
            n2 = n();
        } else {
            n = this.f - n();
            m = m();
            n2 = n();
        }
        return n / (m - n2);
    }

    public Object getAnimatedValue() {
        return Float.valueOf(i());
    }

    public long getDuration() {
        ea eaVar = this.j;
        if (eaVar == null) {
            return 0;
        }
        return (long) eaVar.d();
    }

    public float i() {
        ea eaVar = this.j;
        if (eaVar == null) {
            return 0.0f;
        }
        return (this.f - eaVar.o()) / (this.j.f() - this.j.o());
    }

    public boolean isRunning() {
        return this.k;
    }

    public float j() {
        return this.f;
    }

    public float m() {
        ea eaVar = this.j;
        if (eaVar == null) {
            return 0.0f;
        }
        float f2 = this.i;
        return f2 == 2.14748365E9f ? eaVar.f() : f2;
    }

    public float n() {
        ea eaVar = this.j;
        if (eaVar == null) {
            return 0.0f;
        }
        float f2 = this.h;
        return f2 == -2.14748365E9f ? eaVar.o() : f2;
    }

    public float o() {
        return this.c;
    }

    public void s() {
        v();
    }

    public void setRepeatMode(int i2) {
        super.setRepeatMode(i2);
        if (i2 != 2 && this.d) {
            this.d = false;
            y();
        }
    }

    public void t() {
        this.k = true;
        d(q());
        B((float) ((int) (q() ? m() : n())));
        this.e = 0;
        this.g = 0;
        u();
    }

    public void u() {
        if (isRunning()) {
            w(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public void v() {
        w(true);
    }

    public void w(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.k = false;
        }
    }

    public void x() {
        this.k = true;
        u();
        this.e = 0;
        if (q() && j() == n()) {
            this.f = m();
        } else if (!q() && j() == m()) {
            this.f = n();
        }
    }

    public void y() {
        G(-o());
    }

    public void z(ea eaVar) {
        boolean z = this.j == null;
        this.j = eaVar;
        if (z) {
            D((float) ((int) Math.max(this.h, eaVar.o())), (float) ((int) Math.min(this.i, eaVar.f())));
        } else {
            D((float) ((int) eaVar.o()), (float) ((int) eaVar.f()));
        }
        float f2 = this.f;
        this.f = 0.0f;
        B((float) ((int) f2));
        e();
    }
}
