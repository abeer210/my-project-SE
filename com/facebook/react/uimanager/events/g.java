package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import androidx.core.util.f;
import com.facebook.react.bridge.SoftAssertions;
import vigqyno.C0201;

/* compiled from: TouchEvent */
public class g extends c<g> {
    private static final f<g> k = new f<>(3);
    private MotionEvent f;
    private i g;
    private short h;
    private float i;
    private float j;

    /* compiled from: TouchEvent */
    static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            int[] iArr = new int[i.values().length];
            a = iArr;
            iArr[i.START.ordinal()] = 1;
            a[i.END.ordinal()] = 2;
            a[i.CANCEL.ordinal()] = 3;
            try {
                a[i.MOVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private g() {
    }

    private void p(int i2, i iVar, MotionEvent motionEvent, long j2, float f2, float f3, h hVar) {
        super.j(i2);
        short s = 0;
        SoftAssertions.assertCondition(j2 != Long.MIN_VALUE, C0201.m82(24929));
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            hVar.a(j2);
        } else if (action == 1) {
            hVar.e(j2);
        } else if (action == 2) {
            s = hVar.b(j2);
        } else if (action == 3) {
            hVar.e(j2);
        } else if (action == 5 || action == 6) {
            hVar.d(j2);
        } else {
            throw new RuntimeException(C0201.m82(24930) + action);
        }
        this.g = iVar;
        this.f = MotionEvent.obtain(motionEvent);
        this.h = s;
        this.i = f2;
        this.j = f3;
    }

    public static g q(int i2, i iVar, MotionEvent motionEvent, long j2, float f2, float f3, h hVar) {
        g b = k.b();
        if (b == null) {
            b = new g();
        }
        b.p(i2, iVar, motionEvent, j2, f2, f3, hVar);
        return b;
    }

    @Override // com.facebook.react.uimanager.events.c
    public boolean a() {
        int[] iArr = a.a;
        i iVar = this.g;
        yh0.c(iVar);
        int i2 = iArr[iVar.ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            return false;
        }
        if (i2 == 4) {
            return true;
        }
        throw new RuntimeException(C0201.m82(24931) + this.g);
    }

    @Override // com.facebook.react.uimanager.events.c
    public void c(RCTEventEmitter rCTEventEmitter) {
        i iVar = this.g;
        yh0.c(iVar);
        j.b(rCTEventEmitter, iVar, i(), this);
    }

    @Override // com.facebook.react.uimanager.events.c
    public short e() {
        return this.h;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String f() {
        i iVar = this.g;
        yh0.c(iVar);
        return i.b(iVar);
    }

    @Override // com.facebook.react.uimanager.events.c
    public void l() {
        MotionEvent motionEvent = this.f;
        yh0.c(motionEvent);
        motionEvent.recycle();
        this.f = null;
        k.a(this);
    }

    public MotionEvent m() {
        yh0.c(this.f);
        return this.f;
    }

    public float n() {
        return this.i;
    }

    public float o() {
        return this.j;
    }
}
