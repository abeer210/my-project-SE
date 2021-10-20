package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;

@SuppressLint({"ViewConstructor"})
/* compiled from: TextView */
public class t0 extends k {
    private ArrayList<b0> A0;
    private ArrayList<b0> B0;
    private ArrayList<b0> C0;
    public double D0 = Double.NaN;
    public b0 t0 = null;
    public b0 u0 = null;
    private String v0 = null;
    public o0 w0 = o0.spacing;
    private i0 x0;
    private ArrayList<b0> y0;
    private ArrayList<b0> z0;

    public t0(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.k
    public Path J(Canvas canvas, Paint paint, Region.Op op) {
        return m(canvas, paint);
    }

    @Override // com.horcrux.svg.k
    public void M() {
        K().p(!(this instanceof h0) && !(this instanceof g0), this, this.r0, this.y0, this.z0, this.B0, this.C0, this.A0);
    }

    public i0 P() {
        i0 i0Var;
        if (this.x0 == null) {
            for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
                if ((parent instanceof t0) && (i0Var = ((t0) parent).x0) != null) {
                    this.x0 = i0Var;
                    return i0Var;
                }
            }
        }
        if (this.x0 == null) {
            this.x0 = i0.baseline;
        }
        return this.x0;
    }

    public String Q() {
        String str;
        if (this.v0 == null) {
            for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
                if ((parent instanceof t0) && (str = ((t0) parent).v0) != null) {
                    this.v0 = str;
                    return str;
                }
            }
        }
        return this.v0;
    }

    public Path R(Canvas canvas, Paint paint) {
        Path path = this.G;
        if (path != null) {
            return path;
        }
        M();
        this.G = super.m(canvas, paint);
        L();
        return this.G;
    }

    public double S(Paint paint) {
        if (!Double.isNaN(this.D0)) {
            return this.D0;
        }
        double d = 0.0d;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof t0) {
                d += ((t0) childAt).S(paint);
            }
        }
        this.D0 = d;
        return d;
    }

    public t0 T() {
        ArrayList<h> arrayList = K().a;
        ViewParent parent = getParent();
        int size = arrayList.size() - 1;
        t0 t0Var = this;
        while (size >= 0 && (parent instanceof t0) && arrayList.get(size).j != m0.start && t0Var.y0 == null) {
            t0Var = (t0) parent;
            parent = t0Var.getParent();
            size--;
        }
        return t0Var;
    }

    public t0 U() {
        ViewParent parent = getParent();
        t0 t0Var = this;
        while (parent instanceof t0) {
            t0Var = (t0) parent;
            parent = t0Var.getParent();
        }
        return t0Var;
    }

    @Override // com.horcrux.svg.w0
    public void e() {
        this.D0 = Double.NaN;
        super.e();
    }

    @Override // com.horcrux.svg.w0
    public void invalidate() {
        if (this.G != null) {
            super.invalidate();
            U().f();
        }
    }

    @Override // com.horcrux.svg.w0, com.horcrux.svg.k, com.horcrux.svg.a0
    public void j(Canvas canvas, Paint paint, float f) {
        if (f > 0.01f) {
            O(canvas);
            i(canvas, paint);
            R(canvas, paint);
            M();
            G(canvas, paint, f);
            L();
        }
    }

    @Override // com.horcrux.svg.w0, com.horcrux.svg.k
    public Path m(Canvas canvas, Paint paint) {
        Path path = this.G;
        if (path != null) {
            return path;
        }
        O(canvas);
        return R(canvas, paint);
    }

    @xj0(name = "baselineShift")
    public void setBaselineShift(Dynamic dynamic) {
        this.v0 = b0.c(dynamic);
        invalidate();
    }

    @xj0(name = "dx")
    public void setDeltaX(Dynamic dynamic) {
        this.B0 = b0.a(dynamic);
        invalidate();
    }

    @xj0(name = "dy")
    public void setDeltaY(Dynamic dynamic) {
        this.C0 = b0.a(dynamic);
        invalidate();
    }

    @xj0(name = "inlineSize")
    public void setInlineSize(Dynamic dynamic) {
        this.t0 = b0.b(dynamic);
        invalidate();
    }

    @xj0(name = "lengthAdjust")
    public void setLengthAdjust(String str) {
        this.w0 = o0.valueOf(str);
        invalidate();
    }

    @xj0(name = "alignmentBaseline")
    public void setMethod(String str) {
        this.x0 = i0.b(str);
        invalidate();
    }

    @xj0(name = "x")
    public void setPositionX(Dynamic dynamic) {
        this.y0 = b0.a(dynamic);
        invalidate();
    }

    @xj0(name = "y")
    public void setPositionY(Dynamic dynamic) {
        this.z0 = b0.a(dynamic);
        invalidate();
    }

    @xj0(name = "rotate")
    public void setRotate(Dynamic dynamic) {
        this.A0 = b0.a(dynamic);
        invalidate();
    }

    @xj0(name = "textLength")
    public void setTextLength(Dynamic dynamic) {
        this.u0 = b0.b(dynamic);
        invalidate();
    }

    @xj0(name = "verticalAlign")
    public void setVerticalAlign(String str) {
        if (str != null) {
            String trim = str.trim();
            int lastIndexOf = trim.lastIndexOf(32);
            try {
                this.x0 = i0.b(trim.substring(lastIndexOf));
            } catch (IllegalArgumentException unused) {
                this.x0 = i0.baseline;
            }
            try {
                this.v0 = trim.substring(0, lastIndexOf);
            } catch (IndexOutOfBoundsException unused2) {
                this.v0 = null;
            }
        } else {
            this.x0 = i0.baseline;
            this.v0 = null;
        }
        invalidate();
    }
}
