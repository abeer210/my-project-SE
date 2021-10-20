package org.wonday.pdf;

import android.graphics.Canvas;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.k0;
import defpackage.tm0;
import defpackage.xl0;
import java.io.File;
import vigqyno.C0201;

/* compiled from: PdfView */
public class a extends xl0 implements jm0, hm0, gm0, nm0, fm0, lm0 {
    private static a n0;
    private int T = 1;
    private boolean U = false;
    private float V = 1.0f;
    private float W = 1.0f;
    private float a0 = 3.0f;
    private String b0;
    private int c0 = 10;
    private String d0 = C0201.m82(24880);
    private boolean e0 = true;
    private boolean f0 = true;
    private boolean g0 = false;
    private boolean h0 = false;
    private boolean i0 = false;
    private boolean j0 = false;
    private um0 k0 = um0.WIDTH;
    private float l0 = 0.0f;
    private float m0 = 0.0f;

    public a(k0 k0Var, AttributeSet attributeSet) {
        super(k0Var, attributeSet);
        n0 = this;
    }

    private Uri l0(String str) {
        Uri parse = Uri.parse(str);
        if (parse.getScheme() == null || parse.getScheme().isEmpty()) {
            return Uri.fromFile(new File(str));
        }
        return parse;
    }

    private void m0(String str) {
        Log.d(C0201.m82(24881), str);
    }

    @Override // defpackage.gm0
    public void a(Throwable th) {
        WritableMap createMap = Arguments.createMap();
        boolean contains = th.getMessage().contains(C0201.m82(24882));
        String r2 = C0201.m82(24883);
        if (contains) {
            createMap.putString(r2, C0201.m82(24884));
        } else {
            createMap.putString(r2, C0201.m82(24885) + th.getMessage());
        }
        ((RCTEventEmitter) ((ReactContext) getContext()).getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), C0201.m82(24886), createMap);
    }

    @Override // defpackage.nm0
    public boolean b(MotionEvent motionEvent) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString(C0201.m82(24888), C0201.m82(24887) + this.T);
        ((RCTEventEmitter) ((ReactContext) getContext()).getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), C0201.m82(24889), createMap);
        return true;
    }

    @Override // defpackage.jm0
    public void c(int i, int i2) {
        int i3 = i + 1;
        this.T = i3;
        m0(String.format(C0201.m82(24890), this.b0, Integer.valueOf(i3), Integer.valueOf(i2)));
        WritableMap createMap = Arguments.createMap();
        createMap.putString(C0201.m82(24893), C0201.m82(24891) + i3 + C0201.m82(24892) + i2);
        ((RCTEventEmitter) ((ReactContext) getContext()).getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), C0201.m82(24894), createMap);
    }

    @Override // defpackage.lm0
    public void d(int i, float f) {
        tm0.b.b = this.W;
        tm0.b.a = this.a0;
    }

    @Override // defpackage.hm0
    public void e(int i) {
        h0(this.V);
        WritableMap createMap = Arguments.createMap();
        k22 k22 = new k22();
        StringBuilder sb = new StringBuilder();
        sb.append(C0201.m82(24895));
        sb.append(i);
        String r7 = C0201.m82(24896);
        sb.append(r7);
        sb.append((float) getWidth());
        sb.append(r7);
        sb.append((float) getHeight());
        sb.append(r7);
        sb.append(k22.l(getTableOfContents()));
        createMap.putString(C0201.m82(24897), sb.toString());
        ((RCTEventEmitter) ((ReactContext) getContext()).getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), C0201.m82(24898), createMap);
    }

    @Override // defpackage.fm0
    public void f(Canvas canvas, float f, float f2, int i) {
        float f3 = this.l0;
        if (f3 > 0.0f) {
            float f4 = this.m0;
            if (f4 > 0.0f && !(f == f3 && f2 == f4)) {
                tm0.b.b = this.W;
                tm0.b.a = this.a0;
                WritableMap createMap = Arguments.createMap();
                createMap.putString(C0201.m82(24900), C0201.m82(24899) + (f / this.l0));
                ((RCTEventEmitter) ((ReactContext) getContext()).getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), C0201.m82(24901), createMap);
            }
        }
        this.l0 = f;
        this.m0 = f2;
    }

    public void k0() {
        m0(String.format(C0201.m82(24902), this.b0, Integer.valueOf(this.T)));
        if (this.b0 != null) {
            setMinZoom(this.W);
            setMaxZoom(this.a0);
            setMidZoom((this.a0 + this.W) / 2.0f);
            tm0.b.b = this.W;
            tm0.b.a = this.a0;
            xl0.b B = B(l0(this.b0));
            B.b(this.T - 1);
            B.q(this.U);
            B.i(this);
            B.h(this);
            B.g(this);
            B.k(this);
            B.f(this);
            B.j(this);
            B.p(this.c0);
            B.o(this.d0);
            B.d(this.e0);
            B.l(this.k0);
            B.n(this.j0);
            B.a(this.h0);
            B.m(this.i0);
            B.c(this.f0);
            B.e();
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (F()) {
            k0();
        }
    }

    public void setEnableAnnotationRendering(boolean z) {
        this.f0 = z;
    }

    public void setEnableAntialiasing(boolean z) {
        this.e0 = z;
    }

    public void setEnablePaging(boolean z) {
        this.g0 = z;
        if (z) {
            this.h0 = true;
            this.i0 = true;
            this.j0 = true;
            return;
        }
        this.h0 = false;
        this.i0 = false;
        this.j0 = false;
    }

    public void setFitPolicy(int i) {
        if (i == 0) {
            this.k0 = um0.WIDTH;
        } else if (i != 1) {
            this.k0 = um0.BOTH;
        } else {
            this.k0 = um0.HEIGHT;
        }
    }

    public void setHorizontal(boolean z) {
        this.U = z;
    }

    public void setMaxScale(float f) {
        this.a0 = f;
    }

    public void setMinScale(float f) {
        this.W = f;
    }

    public void setPage(int i) {
        if (i <= 1) {
            i = 1;
        }
        this.T = i;
    }

    public void setPassword(String str) {
        this.d0 = str;
    }

    public void setPath(String str) {
        this.b0 = str;
    }

    public void setScale(float f) {
        this.V = f;
    }

    public void setSpacing(int i) {
        this.c0 = i;
    }
}
