package com.facebook.react.views.text;

import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.uimanager.q;
import vigqyno.C0201;

/* compiled from: TextAttributes */
public class y {
    private boolean a = true;
    private float b = Float.NaN;
    private float c = Float.NaN;
    private float d = Float.NaN;
    private float e = Float.NaN;
    private float f = Float.NaN;
    private c0 g = c0.UNSET;

    public y a(y yVar) {
        y yVar2 = new y();
        yVar2.a = this.a;
        yVar2.b = !Float.isNaN(yVar.b) ? yVar.b : this.b;
        yVar2.c = !Float.isNaN(yVar.c) ? yVar.c : this.c;
        yVar2.d = !Float.isNaN(yVar.d) ? yVar.d : this.d;
        yVar2.e = !Float.isNaN(yVar.e) ? yVar.e : this.e;
        yVar2.f = !Float.isNaN(yVar.f) ? yVar.f : this.f;
        c0 c0Var = yVar.g;
        if (c0Var == c0.UNSET) {
            c0Var = this.g;
        }
        yVar2.g = c0Var;
        return yVar2;
    }

    public boolean b() {
        return this.a;
    }

    public int c() {
        double d2;
        float f2 = !Float.isNaN(this.b) ? this.b : 14.0f;
        if (this.a) {
            d2 = Math.ceil((double) q.f(f2, f()));
        } else {
            d2 = Math.ceil((double) q.c(f2));
        }
        return (int) d2;
    }

    public float d() {
        float f2;
        if (Float.isNaN(this.d)) {
            return Float.NaN;
        }
        if (this.a) {
            f2 = q.f(this.d, f());
        } else {
            f2 = q.c(this.d);
        }
        return f2 / ((float) c());
    }

    public float e() {
        float f2;
        if (Float.isNaN(this.c)) {
            return Float.NaN;
        }
        if (this.a) {
            f2 = q.f(this.c, f());
        } else {
            f2 = q.c(this.c);
        }
        return !Float.isNaN(this.f) && (this.f > f2 ? 1 : (this.f == f2 ? 0 : -1)) > 0 ? this.f : f2;
    }

    public float f() {
        if (!Float.isNaN(this.e)) {
            return this.e;
        }
        return 0.0f;
    }

    public float g() {
        return this.b;
    }

    public float h() {
        return this.f;
    }

    public float i() {
        return this.d;
    }

    public float j() {
        return this.c;
    }

    public float k() {
        return this.e;
    }

    public c0 l() {
        return this.g;
    }

    public void m(boolean z) {
        this.a = z;
    }

    public void n(float f2) {
        this.b = f2;
    }

    public void o(float f2) {
        this.f = f2;
    }

    public void p(float f2) {
        this.d = f2;
    }

    public void q(float f2) {
        this.c = f2;
    }

    public void r(float f2) {
        if (f2 == 0.0f || f2 >= 1.0f) {
            this.e = f2;
            return;
        }
        throw new JSApplicationIllegalArgumentException(C0201.m82(38674));
    }

    public void s(c0 c0Var) {
        this.g = c0Var;
    }

    public String toString() {
        return C0201.m82(38675) + b() + C0201.m82(38676) + g() + C0201.m82(38677) + c() + C0201.m82(38678) + h() + C0201.m82(38679) + i() + C0201.m82(38680) + d() + C0201.m82(38681) + j() + C0201.m82(38682) + e() + C0201.m82(38683) + l() + C0201.m82(38684) + k() + C0201.m82(38685) + f() + C0201.m82(38686);
    }
}
