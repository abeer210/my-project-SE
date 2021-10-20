package com.facebook.react.views.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.events.d;
import com.facebook.react.uimanager.q;
import com.facebook.react.uimanager.q0;
import defpackage.fa0;
import defpackage.ol0;
import defpackage.w90;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import vigqyno.C0188;
import vigqyno.C0201;

/* compiled from: ReactImageView */
public class g extends pa0 {
    private static float[] K = new float[4];
    private static final Matrix L = new Matrix();
    private static final Matrix M = new Matrix();
    private static final Matrix N = new Matrix();
    private final b A;
    private final c B;
    private hf0 C;
    private z80 D;
    private z80 E;
    private a F;
    private Object G;
    private int H = -1;
    private boolean I;
    private ReadableMap J;
    private c g = c.AUTO;
    private final List<nl0> h;
    private nl0 i;
    private nl0 j;
    private Drawable k;
    private Drawable l;
    private r90 m;
    private int n = 0;
    private int o;
    private int p;
    private float q;
    private float u = Float.NaN;
    private float[] v;
    private w90.c w = d.b();
    private Shader.TileMode x = d.a();
    private boolean y;
    private final x80 z;

    /* compiled from: ReactImageView */
    class a extends y80<bf0> {
        public final /* synthetic */ d b;

        public a(d dVar) {
            this.b = dVar;
        }

        @Override // defpackage.y80, defpackage.z80
        public void c(String str, Throwable th) {
            this.b.v(new b(g.this.getId(), 1, true, th.getMessage()));
        }

        @Override // defpackage.y80, defpackage.z80
        public void e(String str, Object obj) {
            this.b.v(new b(g.this.getId(), 4));
        }

        /* renamed from: h */
        public void b(String str, bf0 bf0, Animatable animatable) {
            if (bf0 != null) {
                this.b.v(new b(g.this.getId(), 2, g.this.i.d(), bf0.c(), bf0.a()));
                this.b.v(new b(g.this.getId(), 3));
            }
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: ReactImageView */
    public class b extends hh0 {
        private b() {
        }

        @Override // defpackage.hh0
        public void f(Bitmap bitmap, Bitmap bitmap2) {
            g.this.q(g.K);
            bitmap.setHasAlpha(true);
            if (!com.facebook.react.uimanager.d.a(g.K[0], 0.0f) || !com.facebook.react.uimanager.d.a(g.K[1], 0.0f) || !com.facebook.react.uimanager.d.a(g.K[2], 0.0f) || !com.facebook.react.uimanager.d.a(g.K[3], 0.0f)) {
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(bitmap2, tileMode, tileMode));
                Canvas canvas = new Canvas(bitmap);
                float[] fArr = new float[8];
                g(bitmap2, g.K, fArr);
                Path path = new Path();
                path.addRoundRect(new RectF(0.0f, 0.0f, (float) bitmap2.getWidth(), (float) bitmap2.getHeight()), fArr, Path.Direction.CW);
                canvas.drawPath(path, paint);
                return;
            }
            super.f(bitmap, bitmap2);
        }

        public void g(Bitmap bitmap, float[] fArr, float[] fArr2) {
            g.this.w.a(g.L, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), bitmap.getWidth(), bitmap.getHeight(), 0.0f, 0.0f);
            g.L.invert(g.M);
            fArr2[0] = g.M.mapRadius(fArr[0]);
            fArr2[1] = fArr2[0];
            fArr2[2] = g.M.mapRadius(fArr[1]);
            fArr2[3] = fArr2[2];
            fArr2[4] = g.M.mapRadius(fArr[2]);
            fArr2[5] = fArr2[4];
            fArr2[6] = g.M.mapRadius(fArr[3]);
            fArr2[7] = fArr2[6];
        }

        public /* synthetic */ b(g gVar, a aVar) {
            this();
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: ReactImageView */
    public class c extends hh0 {
        private c() {
        }

        @Override // defpackage.hh0, defpackage.kh0
        public v60<Bitmap> b(Bitmap bitmap, oc0 oc0) {
            Rect rect = new Rect(0, 0, g.this.getWidth(), g.this.getHeight());
            g.this.w.a(g.N, rect, bitmap.getWidth(), bitmap.getHeight(), 0.0f, 0.0f);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            BitmapShader bitmapShader = new BitmapShader(bitmap, g.this.x, g.this.x);
            bitmapShader.setLocalMatrix(g.N);
            paint.setShader(bitmapShader);
            v60<Bitmap> a = oc0.a(g.this.getWidth(), g.this.getHeight());
            try {
                new Canvas(a.w()).drawRect(rect, paint);
                return a.clone();
            } finally {
                v60.s(a);
            }
        }

        public /* synthetic */ c(g gVar, a aVar) {
            this();
        }
    }

    public g(Context context, x80 x80, a aVar, Object obj) {
        super(context, p(context));
        this.z = x80;
        this.A = new b(this, null);
        this.B = new c(this, null);
        this.F = aVar;
        this.G = obj;
        this.h = new LinkedList();
    }

    private static ba0 p(Context context) {
        ca0 ca0 = new ca0(context.getResources());
        ca0.J(fa0.a(0.0f));
        return ca0.a();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void q(float[] fArr) {
        float f = !com.facebook.yoga.g.a(this.u) ? this.u : 0.0f;
        float[] fArr2 = this.v;
        fArr[0] = (fArr2 == null || com.facebook.yoga.g.a(fArr2[0])) ? f : this.v[0];
        float[] fArr3 = this.v;
        fArr[1] = (fArr3 == null || com.facebook.yoga.g.a(fArr3[1])) ? f : this.v[1];
        float[] fArr4 = this.v;
        fArr[2] = (fArr4 == null || com.facebook.yoga.g.a(fArr4[2])) ? f : this.v[2];
        float[] fArr5 = this.v;
        if (fArr5 != null && !com.facebook.yoga.g.a(fArr5[3])) {
            f = this.v[3];
        }
        fArr[3] = f;
    }

    private boolean r() {
        return this.h.size() > 1;
    }

    private boolean s() {
        return this.x != Shader.TileMode.CLAMP;
    }

    private void v() {
        this.i = null;
        if (this.h.isEmpty()) {
            this.h.add(new nl0(getContext(), C0201.m82(31839)));
        } else if (r()) {
            ol0.b a2 = ol0.a(getWidth(), getHeight(), this.h);
            this.i = a2.a();
            this.j = a2.b();
            return;
        }
        this.i = this.h.get(0);
    }

    private boolean w(nl0 nl0) {
        c cVar = this.g;
        if (cVar != c.AUTO) {
            return cVar == c.RESIZE;
        }
        if (h70.h(nl0.e()) || h70.i(nl0.e())) {
            return true;
        }
        return false;
    }

    private void y(String str) {
    }

    public boolean hasOverlappingRendering() {
        return false;
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 > 0 && i3 > 0) {
            this.y = this.y || r() || s();
            t();
        }
    }

    public void setBackgroundColor(int i2) {
        if (this.n != i2) {
            this.n = i2;
            this.m = new r90(i2);
            this.y = true;
        }
    }

    public void setBlurRadius(float f) {
        int c2 = (int) q.c(f);
        if (c2 == 0) {
            this.C = null;
        } else {
            this.C = new hf0(c2);
        }
        this.y = true;
    }

    public void setBorderColor(int i2) {
        this.o = i2;
        this.y = true;
    }

    public void setBorderRadius(float f) {
        if (!com.facebook.react.uimanager.d.a(this.u, f)) {
            this.u = f;
            this.y = true;
        }
    }

    public void setBorderWidth(float f) {
        this.q = q.c(f);
        this.y = true;
    }

    public void setControllerListener(z80 z80) {
        this.E = z80;
        this.y = true;
        t();
    }

    public void setDefaultSource(String str) {
        this.k = pl0.a().b(getContext(), str);
        this.y = true;
    }

    public void setFadeDuration(int i2) {
        this.H = i2;
    }

    public void setHeaders(ReadableMap readableMap) {
        this.J = readableMap;
    }

    public void setLoadingIndicatorSource(String str) {
        Drawable b2 = pl0.a().b(getContext(), str);
        this.l = b2 != null ? new g90(b2, C0188.f18) : null;
        this.y = true;
    }

    public void setOverlayColor(int i2) {
        this.p = i2;
        this.y = true;
    }

    public void setProgressiveRenderingEnabled(boolean z2) {
        this.I = z2;
    }

    public void setResizeMethod(c cVar) {
        this.g = cVar;
        this.y = true;
    }

    public void setScaleType(w90.c cVar) {
        this.w = cVar;
        this.y = true;
    }

    public void setShouldNotifyLoadEvents(boolean z2) {
        if (!z2) {
            this.D = null;
        } else {
            this.D = new a(q0.b((ReactContext) getContext(), getId()));
        }
        this.y = true;
    }

    public void setSource(ReadableArray readableArray) {
        this.h.clear();
        if (readableArray == null || readableArray.size() == 0) {
            this.h.add(new nl0(getContext(), C0201.m82(31843)));
        } else {
            int size = readableArray.size();
            String r2 = C0201.m82(31840);
            if (size == 1) {
                String string = readableArray.getMap(0).getString(r2);
                nl0 nl0 = new nl0(getContext(), string);
                this.h.add(nl0);
                if (Uri.EMPTY.equals(nl0.e())) {
                    y(string);
                }
            } else {
                for (int i2 = 0; i2 < readableArray.size(); i2++) {
                    ReadableMap map = readableArray.getMap(i2);
                    String string2 = map.getString(r2);
                    nl0 nl02 = new nl0(getContext(), string2, map.getDouble(C0201.m82(31841)), map.getDouble(C0201.m82(31842)));
                    this.h.add(nl02);
                    if (Uri.EMPTY.equals(nl02.e())) {
                        y(string2);
                    }
                }
            }
        }
        this.y = true;
    }

    public void setTileMode(Shader.TileMode tileMode) {
        this.x = tileMode;
        this.y = true;
    }

    public void t() {
        if (this.y) {
            if (!r() || (getWidth() > 0 && getHeight() > 0)) {
                v();
                nl0 nl0 = this.i;
                if (nl0 != null) {
                    boolean w2 = w(nl0);
                    if (w2 && (getWidth() <= 0 || getHeight() <= 0)) {
                        return;
                    }
                    if (!s() || (getWidth() > 0 && getHeight() > 0)) {
                        ba0 ba0 = (ba0) getHierarchy();
                        ba0.u(this.w);
                        Drawable drawable = this.k;
                        if (drawable != null) {
                            ba0.y(drawable, this.w);
                        }
                        Drawable drawable2 = this.l;
                        if (drawable2 != null) {
                            ba0.y(drawable2, w90.c.e);
                        }
                        w90.c cVar = this.w;
                        boolean z2 = (cVar == w90.c.g || cVar == w90.c.h) ? false : true;
                        fa0 p2 = ba0.p();
                        q(K);
                        float[] fArr = K;
                        p2.o(fArr[0], fArr[1], fArr[2], fArr[3]);
                        r90 r90 = this.m;
                        if (r90 != null) {
                            r90.a(this.o, this.q);
                            this.m.m(p2.d());
                            ba0.v(this.m);
                        }
                        if (z2) {
                            p2.p(0.0f);
                        }
                        p2.l(this.o, this.q);
                        int i2 = this.p;
                        if (i2 != 0) {
                            p2.q(i2);
                        } else {
                            p2.t(fa0.a.BITMAP_ONLY);
                        }
                        ba0.A(p2);
                        int i3 = this.H;
                        if (i3 < 0) {
                            i3 = this.i.f() ? 0 : C0188.f19;
                        }
                        ba0.x(i3);
                        LinkedList linkedList = new LinkedList();
                        if (z2) {
                            linkedList.add(this.A);
                        }
                        hf0 hf0 = this.C;
                        if (hf0 != null) {
                            linkedList.add(hf0);
                        }
                        if (s()) {
                            linkedList.add(this.B);
                        }
                        kh0 d = e.d(linkedList);
                        rd0 rd0 = w2 ? new rd0(getWidth(), getHeight()) : null;
                        jh0 r = jh0.r(this.i.e());
                        r.y(d);
                        r.C(rd0);
                        r.s(true);
                        r.z(this.I);
                        com.facebook.react.modules.fresco.a w3 = com.facebook.react.modules.fresco.a.w(r, this.J);
                        a aVar = this.F;
                        if (aVar != null) {
                            aVar.a(this.i.e());
                        }
                        this.z.x();
                        x80 x80 = this.z;
                        x80.y(true);
                        x80.z(this.G);
                        x80.D(getController());
                        x80.B(w3);
                        nl0 nl02 = this.j;
                        if (nl02 != null) {
                            jh0 r2 = jh0.r(nl02.e());
                            r2.y(d);
                            r2.C(rd0);
                            r2.s(true);
                            r2.z(this.I);
                            this.z.C(r2.a());
                        }
                        if (this.D == null || this.E == null) {
                            z80 z80 = this.E;
                            if (z80 != null) {
                                this.z.A(z80);
                            } else {
                                z80 z802 = this.D;
                                if (z802 != null) {
                                    this.z.A(z802);
                                }
                            }
                        } else {
                            b90 b90 = new b90();
                            b90.g(this.D);
                            b90.g(this.E);
                            this.z.A(b90);
                        }
                        setController(this.z.a());
                        this.y = false;
                        this.z.x();
                    }
                }
            }
        }
    }

    public void u(float f, int i2) {
        if (this.v == null) {
            float[] fArr = new float[4];
            this.v = fArr;
            Arrays.fill(fArr, Float.NaN);
        }
        if (!com.facebook.react.uimanager.d.a(this.v[i2], f)) {
            this.v[i2] = f;
            this.y = true;
        }
    }

    public void x(Object obj) {
        this.G = obj;
        this.y = true;
    }
}
