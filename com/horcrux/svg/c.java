package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.react.bridge.ReactContext;
import vigqyno.C0201;

@SuppressLint({"ViewConstructor"})
/* compiled from: ClipPathView */
public class c extends k {
    public c(ReactContext reactContext) {
        super(reactContext);
        this.l = 1;
    }

    @Override // com.horcrux.svg.k, com.horcrux.svg.a0
    public void B() {
    }

    @Override // com.horcrux.svg.w0, com.horcrux.svg.k, com.horcrux.svg.a0
    public void j(Canvas canvas, Paint paint, float f) {
        f60.A(C0201.m82(29515), C0201.m82(29516));
    }

    @Override // com.horcrux.svg.w0, com.horcrux.svg.k, com.horcrux.svg.a0
    public int n(float[] fArr) {
        return -1;
    }

    @Override // com.horcrux.svg.w0
    public boolean o() {
        return false;
    }

    @Override // com.horcrux.svg.w0, com.horcrux.svg.k
    public void v() {
        getSvgView().h(this, this.x);
    }

    @Override // com.horcrux.svg.a0
    public void z(a0 a0Var) {
    }
}
