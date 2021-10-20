package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;

@SuppressLint({"ViewConstructor"})
/* compiled from: GroupView */
public class k extends a0 {
    public ReadableMap r0;
    private i s0;

    public k(ReactContext reactContext) {
        super(reactContext);
    }

    private static <T> T N(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    @Override // com.horcrux.svg.a0
    public void B() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof a0) {
                ((a0) childAt).B();
            }
        }
    }

    public void G(Canvas canvas, Paint paint, float f) {
        M();
        e0 svgView = getSvgView();
        RectF rectF = new RectF();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (!(childAt instanceof p)) {
                if (childAt instanceof w0) {
                    w0 w0Var = (w0) childAt;
                    boolean z = w0Var instanceof a0;
                    if (z) {
                        ((a0) w0Var).z(this);
                    }
                    int u = w0Var.u(canvas, this.c);
                    w0Var.s(canvas, paint, this.b * f);
                    RectF clientRect = w0Var.getClientRect();
                    if (clientRect != null) {
                        rectF.union(clientRect);
                    }
                    w0Var.t(canvas, u);
                    if (z) {
                        ((a0) w0Var).B();
                    }
                    if (w0Var.o()) {
                        svgView.n();
                    }
                } else if (childAt instanceof e0) {
                    e0 e0Var = (e0) childAt;
                    e0Var.l(canvas);
                    if (e0Var.u()) {
                        svgView.n();
                    }
                }
            }
        }
        setClientRect(rectF);
        L();
    }

    public void H(Canvas canvas, Paint paint, float f) {
        super.j(canvas, paint, f);
    }

    public i I() {
        return this.s0;
    }

    public Path J(Canvas canvas, Paint paint, Region.Op op) {
        Path path;
        Path path2;
        Path path3 = new Path();
        int i = 0;
        if (Build.VERSION.SDK_INT >= 19) {
            Path.Op valueOf = Path.Op.valueOf(op.name());
            while (i < getChildCount()) {
                View childAt = getChildAt(i);
                if (!(childAt instanceof p) && (childAt instanceof w0)) {
                    w0 w0Var = (w0) childAt;
                    Matrix matrix = w0Var.d;
                    if (w0Var instanceof k) {
                        path2 = ((k) w0Var).J(canvas, paint, op);
                    } else {
                        path2 = w0Var.m(canvas, paint);
                    }
                    path2.transform(matrix);
                    path3.op(path2, valueOf);
                }
                i++;
            }
        } else {
            Region region = new Region(canvas.getClipBounds());
            Region region2 = new Region();
            while (i < getChildCount()) {
                View childAt2 = getChildAt(i);
                if (!(childAt2 instanceof p) && (childAt2 instanceof w0)) {
                    w0 w0Var2 = (w0) childAt2;
                    Matrix matrix2 = w0Var2.d;
                    if (w0Var2 instanceof k) {
                        path = ((k) w0Var2).J(canvas, paint, op);
                    } else {
                        path = w0Var2.m(canvas, paint);
                    }
                    if (matrix2 != null) {
                        path.transform(matrix2);
                    }
                    Region region3 = new Region();
                    region3.setPath(path, region);
                    region2.op(region3, op);
                }
                i++;
            }
            path3.addPath(region2.getBoundaryPath());
        }
        return path3;
    }

    public i K() {
        k textRoot = getTextRoot();
        N(textRoot);
        return textRoot.I();
    }

    public void L() {
        K().n();
    }

    public void M() {
        K().o(this, this.r0);
    }

    public void O(Canvas canvas) {
        RectF rectF = new RectF(canvas.getClipBounds());
        Matrix matrix = this.d;
        if (matrix != null) {
            matrix.mapRect(rectF);
        }
        Matrix matrix2 = this.e;
        if (matrix2 != null) {
            matrix2.mapRect(rectF);
        }
        this.s0 = new i(this.u, rectF.width(), rectF.height());
    }

    @Override // com.horcrux.svg.w0, com.horcrux.svg.a0
    public void j(Canvas canvas, Paint paint, float f) {
        O(canvas);
        if (f > 0.01f) {
            i(canvas, paint);
            G(canvas, paint, f);
        }
    }

    @Override // com.horcrux.svg.w0
    public Path m(Canvas canvas, Paint paint) {
        Path path = this.G;
        if (path != null) {
            return path;
        }
        this.G = new Path();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (!(childAt instanceof p) && (childAt instanceof w0)) {
                w0 w0Var = (w0) childAt;
                this.G.addPath(w0Var.m(canvas, paint), w0Var.d);
            }
        }
        return this.G;
    }

    @Override // com.horcrux.svg.w0, com.horcrux.svg.a0
    public int n(float[] fArr) {
        int b;
        w0 w0Var;
        int n;
        if (this.i && this.j) {
            float[] fArr2 = new float[2];
            this.g.mapPoints(fArr2, fArr);
            this.h.mapPoints(fArr2);
            int round = Math.round(fArr2[0]);
            int round2 = Math.round(fArr2[1]);
            Path clipPath = getClipPath();
            if (clipPath != null) {
                if (this.K != clipPath) {
                    this.K = clipPath;
                    RectF rectF = new RectF();
                    this.P = rectF;
                    clipPath.computeBounds(rectF, true);
                    this.T = w(clipPath, this.P);
                }
                if (!this.T.contains(round, round2)) {
                    return -1;
                }
            }
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = getChildAt(childCount);
                if (childAt instanceof w0) {
                    if (!(childAt instanceof p) && (n = (w0Var = (w0) childAt).n(fArr2)) != -1) {
                        return (w0Var.o() || n != childAt.getId()) ? n : getId();
                    }
                } else if ((childAt instanceof e0) && (b = ((e0) childAt).b(fArr2[0], fArr2[1])) != childAt.getId()) {
                    return b;
                }
            }
        }
        return -1;
    }

    @xj0(name = "font")
    public void setFont(ReadableMap readableMap) {
        this.r0 = readableMap;
        invalidate();
    }

    @Override // com.horcrux.svg.w0
    public void v() {
        if (this.x != null) {
            getSvgView().k(this, this.x);
        }
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof w0) {
                ((w0) childAt).v();
            }
        }
    }
}
