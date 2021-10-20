package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.ReactContext;

@SuppressLint({"ViewConstructor"})
/* compiled from: PathView */
public class s extends a0 {
    private Path r0 = new Path();

    public s(ReactContext reactContext) {
        super(reactContext);
        r.a = this.u;
    }

    @Override // com.horcrux.svg.w0
    public Path m(Canvas canvas, Paint paint) {
        return this.r0;
    }

    @xj0(name = "d")
    public void setD(String str) {
        this.r0 = r.o(str);
        this.U = r.f;
        invalidate();
    }
}
