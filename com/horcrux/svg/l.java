package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import java.util.concurrent.atomic.AtomicBoolean;
import vigqyno.C0201;

@SuppressLint({"ViewConstructor"})
/* compiled from: ImageView */
public class l extends a0 {
    private final AtomicBoolean A0 = new AtomicBoolean(false);
    private b0 r0;
    private b0 s0;
    private b0 t0;
    private b0 u0;
    private String v0;
    private int w0;
    private int x0;
    private String y0;
    private int z0;

    /* access modifiers changed from: package-private */
    /* compiled from: ImageView */
    public class a extends je0 {
        public a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [n70] */
        @Override // defpackage.m70
        public void e(n70<v60<ye0>> n70) {
            l.this.A0.set(false);
            f60.D(C0201.m82(8497), n70.c(), C0201.m82(8498), new Object[0]);
        }

        @Override // defpackage.je0
        public void g(Bitmap bitmap) {
            l.this.A0.set(false);
            e0 svgView = l.this.getSvgView();
            if (svgView != null) {
                svgView.invalidate();
            }
        }
    }

    public l(ReactContext reactContext) {
        super(reactContext);
    }

    private void H(Canvas canvas, Paint paint, Bitmap bitmap, float f) {
        if (this.w0 == 0 || this.x0 == 0) {
            this.w0 = bitmap.getWidth();
            this.x0 = bitmap.getHeight();
        }
        RectF I = I();
        RectF rectF = new RectF(0.0f, 0.0f, (float) this.w0, (float) this.x0);
        v0.a(rectF, I, this.y0, this.z0).mapRect(rectF);
        canvas.clipPath(m(canvas, paint));
        Path l = l(canvas, paint);
        if (l != null) {
            canvas.clipPath(l);
        }
        Paint paint2 = new Paint();
        paint2.setAlpha((int) (f * 255.0f));
        canvas.drawBitmap(bitmap, (Rect) null, rectF, paint2);
        this.c.mapRect(rectF);
        setClientRect(rectF);
    }

    private RectF I() {
        double r = r(this.r0);
        double p = p(this.s0);
        double r2 = r(this.t0);
        double p2 = p(this.u0);
        if (r2 == 0.0d) {
            r2 = (double) (((float) this.w0) * this.u);
        }
        if (p2 == 0.0d) {
            p2 = (double) (((float) this.x0) * this.u);
        }
        return new RectF((float) r, (float) p, (float) (r + r2), (float) (p + p2));
    }

    private void J(be0 be0, ih0 ih0) {
        this.A0.set(true);
        be0.d(ih0, this.a).g(new a(), n50.g());
    }

    private void K(be0 be0, ih0 ih0, Canvas canvas, Paint paint, float f) {
        n70<v60<ye0>> g = be0.g(ih0, this.a);
        try {
            v60<ye0> f2 = g.f();
            if (f2 == null) {
                g.close();
                return;
            }
            try {
                ye0 w = f2.w();
                if (!(w instanceof xe0)) {
                    v60.s(f2);
                    g.close();
                    return;
                }
                Bitmap n = ((xe0) w).n();
                if (n == null) {
                    v60.s(f2);
                    g.close();
                    return;
                }
                H(canvas, paint, n, f);
                v60.s(f2);
                g.close();
            } catch (Exception e) {
                throw new IllegalStateException(e);
            } catch (Throwable th) {
                v60.s(f2);
                throw th;
            }
        } catch (Exception e2) {
            throw new IllegalStateException(e2);
        } catch (Throwable th2) {
            g.close();
            throw th2;
        }
    }

    @Override // com.horcrux.svg.w0, com.horcrux.svg.a0
    public void j(Canvas canvas, Paint paint, float f) {
        if (!this.A0.get()) {
            be0 a2 = c80.a();
            ih0 a3 = ih0.a(new nl0(this.a, this.v0).e());
            if (a2.m(a3)) {
                K(a2, a3, canvas, paint, f * this.b);
            } else {
                J(a2, a3);
            }
        }
    }

    @Override // com.horcrux.svg.w0
    public Path m(Canvas canvas, Paint paint) {
        Path path = new Path();
        this.G = path;
        path.addRect(I(), Path.Direction.CW);
        return this.G;
    }

    @xj0(name = "align")
    public void setAlign(String str) {
        this.y0 = str;
        invalidate();
    }

    @xj0(name = "height")
    public void setHeight(Dynamic dynamic) {
        this.u0 = b0.b(dynamic);
        invalidate();
    }

    @xj0(name = "meetOrSlice")
    public void setMeetOrSlice(int i) {
        this.z0 = i;
        invalidate();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @xj0(name = "src")
    public void setSrc(ReadableMap readableMap) {
        if (readableMap != null) {
            String string = readableMap.getString(C0201.m82(25545));
            this.v0 = string;
            if (string != null && !string.isEmpty()) {
                String r02 = C0201.m82(25546);
                if (readableMap.hasKey(r02)) {
                    String r1 = C0201.m82(25547);
                    if (readableMap.hasKey(r1)) {
                        this.w0 = readableMap.getInt(r02);
                        this.x0 = readableMap.getInt(r1);
                        if (Uri.parse(this.v0).getScheme() != null) {
                            pl0.a().d(this.a, this.v0);
                            return;
                        }
                        return;
                    }
                }
                this.w0 = 0;
                this.x0 = 0;
                if (Uri.parse(this.v0).getScheme() != null) {
                }
            }
        }
    }

    @xj0(name = "width")
    public void setWidth(Dynamic dynamic) {
        this.t0 = b0.b(dynamic);
        invalidate();
    }

    @xj0(name = "x")
    public void setX(Dynamic dynamic) {
        this.r0 = b0.b(dynamic);
        invalidate();
    }

    @xj0(name = "y")
    public void setY(Dynamic dynamic) {
        this.s0 = b0.b(dynamic);
        invalidate();
    }
}
