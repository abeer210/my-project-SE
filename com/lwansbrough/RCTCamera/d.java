package com.lwansbrough.RCTCamera;

import android.content.Context;
import android.view.OrientationEventListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.List;
import vigqyno.C0201;

/* compiled from: RCTCameraView */
public class d extends ViewGroup {
    private final OrientationEventListener a;
    private final Context b;
    private e c = null;
    private int d = -1;
    private int e = 1;
    private int f = -1;
    private int g = -1;
    private int h = 0;
    private boolean i = false;

    /* compiled from: RCTCameraView */
    class a extends OrientationEventListener {
        public a(Context context, int i) {
            super(context, i);
        }

        public void onOrientationChanged(int i) {
            d dVar = d.this;
            if (dVar.g(dVar.b)) {
                d.this.e();
            }
        }
    }

    public d(Context context) {
        super(context);
        this.b = context;
        b.d(d(context));
        a aVar = new a(context, 3);
        this.a = aVar;
        if (aVar.canDetectOrientation()) {
            this.a.enable();
        } else {
            this.a.disable();
        }
    }

    private int d(Context context) {
        return ((WindowManager) context.getSystemService(C0201.m82(4660))).getDefaultDisplay().getOrientation();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void e() {
        f(getLeft(), getTop(), getRight(), getBottom());
    }

    private void f(int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        double d2;
        double d3;
        double d4;
        e eVar = this.c;
        if (eVar != null) {
            float f2 = (float) (i4 - i2);
            float f3 = (float) (i5 - i3);
            int i8 = this.e;
            if (i8 == 0) {
                d3 = eVar.f();
                double d5 = (double) f3;
                Double.isNaN(d5);
                d2 = d5 * d3;
                d4 = (double) f2;
                if (d2 < d4) {
                    Double.isNaN(d4);
                    i6 = (int) (d4 / d3);
                    i7 = (int) f2;
                    int i9 = (int) ((f2 - ((float) i7)) / 2.0f);
                    int i10 = (int) ((f3 - ((float) i6)) / 2.0f);
                    b.h().A(this.c.d(), (int) f2, (int) f3);
                    this.c.layout(i9, i10, i7 + i9, i6 + i10);
                    postInvalidate(getLeft(), getTop(), getRight(), getBottom());
                }
                i7 = (int) d2;
            } else if (i8 != 1) {
                i7 = (int) f2;
            } else {
                d3 = eVar.f();
                double d6 = (double) f3;
                Double.isNaN(d6);
                d2 = d6 * d3;
                d4 = (double) f2;
                if (d2 > d4) {
                    Double.isNaN(d4);
                    i6 = (int) (d4 / d3);
                    i7 = (int) f2;
                    int i92 = (int) ((f2 - ((float) i7)) / 2.0f);
                    int i102 = (int) ((f3 - ((float) i6)) / 2.0f);
                    b.h().A(this.c.d(), (int) f2, (int) f3);
                    this.c.layout(i92, i102, i7 + i92, i6 + i102);
                    postInvalidate(getLeft(), getTop(), getRight(), getBottom());
                }
                i7 = (int) d2;
            }
            i6 = (int) f3;
            int i922 = (int) ((f2 - ((float) i7)) / 2.0f);
            int i1022 = (int) ((f3 - ((float) i6)) / 2.0f);
            b.h().A(this.c.d(), (int) f2, (int) f3);
            this.c.layout(i922, i1022, i7 + i922, i6 + i1022);
            postInvalidate(getLeft(), getTop(), getRight(), getBottom());
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private boolean g(Context context) {
        int d2 = d(context);
        if (this.d == d2) {
            return false;
        }
        this.d = d2;
        b.h().r(this.d);
        return true;
    }

    public void h() {
        e eVar = this.c;
        if (eVar != null) {
            eVar.s();
        }
    }

    public void i() {
        e eVar = this.c;
        if (eVar != null) {
            eVar.u();
        }
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        f(i2, i3, i4, i5);
    }

    public void onViewAdded(View view) {
        e eVar = this.c;
        if (eVar != view) {
            removeView(eVar);
            addView(this.c, 0);
        }
    }

    public void setAspect(int i2) {
        this.e = i2;
        e();
    }

    public void setBarCodeTypes(List<String> list) {
        b.h().t(list);
    }

    public void setBarcodeScannerEnabled(boolean z) {
        b.h().u(z);
    }

    public void setCameraType(int i2) {
        e eVar = this.c;
        if (eVar != null) {
            eVar.k(i2);
            b.h().c(i2);
            return;
        }
        e eVar2 = new e(this.b, i2);
        this.c = eVar2;
        int i3 = this.g;
        if (-1 != i3) {
            eVar2.o(i3);
        }
        int i4 = this.f;
        if (-1 != i4) {
            this.c.p(i4);
        }
        int i5 = this.h;
        if (i5 != 0) {
            this.c.q(i5);
        }
        this.c.n(this.i);
        addView(this.c);
    }

    public void setCaptureMode(int i2) {
        e eVar = this.c;
        if (eVar != null) {
            eVar.l(i2);
        }
    }

    public void setCaptureQuality(String str) {
        e eVar = this.c;
        if (eVar != null) {
            eVar.m(str);
        }
    }

    public void setClearWindowBackground(boolean z) {
        this.i = z;
        e eVar = this.c;
        if (eVar != null) {
            eVar.n(z);
        }
    }

    public void setFlashMode(int i2) {
        this.g = i2;
        e eVar = this.c;
        if (eVar != null) {
            eVar.o(i2);
        }
    }

    public void setOrientation(int i2) {
        b.h().z(i2);
        if (this.c != null) {
            e();
        }
    }

    public void setTorchMode(int i2) {
        this.f = i2;
        e eVar = this.c;
        if (eVar != null) {
            eVar.p(i2);
        }
    }

    public void setZoom(int i2) {
        this.h = i2;
        e eVar = this.c;
        if (eVar != null) {
            eVar.q(i2);
        }
    }
}
