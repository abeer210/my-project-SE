package defpackage;

import android.view.MotionEvent;
import defpackage.hq2;

/* renamed from: iq2  reason: default package */
/* compiled from: RotationGestureHandler */
public class iq2 extends wp2<iq2> {
    private hq2 B;
    private double C;
    private double D;
    private hq2.a E = new a();

    /* renamed from: iq2$a */
    /* compiled from: RotationGestureHandler */
    class a implements hq2.a {
        public a() {
        }

        @Override // defpackage.hq2.a
        public void a(hq2 hq2) {
            iq2.this.g();
        }

        @Override // defpackage.hq2.a
        public boolean b(hq2 hq2) {
            double d = iq2.this.C;
            iq2.this.C += hq2.d();
            long e = hq2.e();
            if (e > 0) {
                iq2 iq2 = iq2.this;
                double d2 = iq2.C - d;
                double d3 = (double) e;
                Double.isNaN(d3);
                iq2.D = d2 / d3;
            }
            if (Math.abs(iq2.this.C) < 0.08726646259971647d || iq2.this.p() != 2) {
                return true;
            }
            iq2.this.a();
            return true;
        }

        @Override // defpackage.hq2.a
        public boolean c(hq2 hq2) {
            return true;
        }
    }

    public iq2() {
        L(false);
    }

    @Override // defpackage.wp2
    public void C(MotionEvent motionEvent) {
        int p = p();
        if (p == 0) {
            this.D = 0.0d;
            this.C = 0.0d;
            this.B = new hq2(this.E);
            c();
        }
        hq2 hq2 = this.B;
        if (hq2 != null) {
            hq2.f(motionEvent);
        }
        if (motionEvent.getActionMasked() != 1) {
            return;
        }
        if (p == 4) {
            g();
        } else {
            h();
        }
    }

    @Override // defpackage.wp2
    public void D() {
        this.B = null;
        this.D = 0.0d;
        this.C = 0.0d;
    }

    public float X() {
        hq2 hq2 = this.B;
        if (hq2 == null) {
            return Float.NaN;
        }
        return hq2.b();
    }

    public float Y() {
        hq2 hq2 = this.B;
        if (hq2 == null) {
            return Float.NaN;
        }
        return hq2.c();
    }

    public double Z() {
        return this.C;
    }

    public double a0() {
        return this.D;
    }
}
