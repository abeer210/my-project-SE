package com.facebook.react.uimanager;

import android.os.SystemClock;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.uimanager.events.d;
import com.facebook.systrace.b;
import com.facebook.yoga.h;
import java.util.Arrays;
import java.util.Map;
import vigqyno.C0201;

/* compiled from: UIImplementation */
public class o0 {
    public static final String k = null;
    public static final String l = null;
    public static final String m = null;
    public static final String n = null;
    public Object a;
    public final d b;
    public final ReactApplicationContext c;
    public final h0 d;
    private final a1 e;
    private final v0 f;
    private final n g;
    private final int[] h;
    private long i;
    public b j;

    /* access modifiers changed from: package-private */
    /* compiled from: UIImplementation */
    public class a implements Runnable {
        public final /* synthetic */ a0 a;

        public a(a0 a0Var) {
            this.a = a0Var;
        }

        public void run() {
            o0.this.d.b(this.a);
        }
    }

    /* compiled from: UIImplementation */
    public interface b {
        void a(a0 a0Var);
    }

    static {
        C0201.m83(o0.class, 9);
    }

    public o0(ReactApplicationContext reactApplicationContext, a1 a1Var, d dVar, int i2) {
        this(reactApplicationContext, a1Var, new v0(reactApplicationContext, new m(a1Var), i2), dVar);
    }

    private void A(int i2, int[] iArr) {
        a0 c2 = this.d.c(i2);
        if (c2 != null) {
            a0 parent = c2.getParent();
            if (parent != null) {
                B(c2, parent, iArr);
                return;
            }
            throw new g(C0201.m82(3619) + i2 + C0201.m82(3620));
        }
        throw new g(C0201.m82(3621) + i2 + C0201.m82(3622));
    }

    private void B(a0 a0Var, a0 a0Var2, int[] iArr) {
        int i2;
        int i3;
        if (a0Var != a0Var2) {
            i3 = Math.round(a0Var.getLayoutX());
            i2 = Math.round(a0Var.getLayoutY());
            for (a0 parent = a0Var.getParent(); parent != a0Var2; parent = parent.getParent()) {
                yh0.c(parent);
                c(parent);
                i3 += Math.round(parent.getLayoutX());
                i2 += Math.round(parent.getLayoutY());
            }
            c(a0Var2);
        } else {
            i3 = 0;
            i2 = 0;
        }
        iArr[0] = i3;
        iArr[1] = i2;
        iArr[2] = a0Var.getScreenWidth();
        iArr[3] = a0Var.getScreenHeight();
    }

    private void C(a0 a0Var) {
        if (a0Var.hasUpdates()) {
            for (int i2 = 0; i2 < a0Var.getChildCount(); i2++) {
                C(a0Var.getChildAt(i2));
            }
            a0Var.onBeforeLayout(this.g);
        }
    }

    private void M(a0 a0Var) {
        n.j(a0Var);
        this.d.g(a0Var.getReactTag());
        for (int childCount = a0Var.getChildCount() - 1; childCount >= 0; childCount--) {
            M(a0Var.getChildAt(childCount));
        }
        a0Var.removeAndDisposeAllChildren();
    }

    private void c(a0 a0Var) {
        ViewManager a2 = this.e.a(a0Var.getViewClass());
        yh0.c(a2);
        ViewManager viewManager = a2;
        if (viewManager instanceof f) {
            f fVar = (f) viewManager;
            if (fVar != null && fVar.needsCustomLayoutForChildren()) {
                throw new g(C0201.m82(3623) + a0Var.getViewClass() + C0201.m82(3624));
            }
            return;
        }
        throw new g(C0201.m82(3625) + a0Var.getViewClass() + C0201.m82(3626));
    }

    private void d(int i2, String str) {
        if (this.d.c(i2) == null) {
            throw new g(C0201.m82(3627) + str + C0201.m82(3628) + i2 + C0201.m82(3629));
        }
    }

    private void o() {
        if (this.f.X()) {
            n(-1);
        }
    }

    private void y(int i2, int i3, int[] iArr) {
        a0 c2 = this.d.c(i2);
        a0 c3 = this.d.c(i3);
        String r2 = C0201.m82(3630);
        if (c2 == null || c3 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(r2);
            if (c2 != null) {
                i2 = i3;
            }
            sb.append(i2);
            sb.append(C0201.m82(3632));
            throw new g(sb.toString());
        }
        if (c2 != c3) {
            for (a0 parent = c2.getParent(); parent != c3; parent = parent.getParent()) {
                if (parent == null) {
                    throw new g(r2 + i3 + C0201.m82(3631) + i2);
                }
            }
        }
        B(c2, c3, iArr);
    }

    public void D() {
    }

    public void E() {
        this.f.Y();
    }

    public void F() {
        this.f.b0();
    }

    public void G(n0 n0Var) {
        this.f.Z(n0Var);
    }

    public void H() {
        this.f.a0();
    }

    public <T extends View> void I(T t, int i2, k0 k0Var) {
        synchronized (this.a) {
            a0 h2 = h();
            h2.setReactTag(i2);
            h2.setThemedContext(k0Var);
            k0Var.runOnNativeModulesQueueThread(new a(h2));
            this.f.y(i2, t);
        }
    }

    public void J(int i2) {
        synchronized (this.a) {
            this.d.h(i2);
        }
    }

    public void K(int i2) {
        J(i2);
        this.f.L(i2);
    }

    public final void L(a0 a0Var) {
        M(a0Var);
        a0Var.dispose();
    }

    public void N(int i2) {
        a0 c2 = this.d.c(i2);
        if (c2 != null) {
            WritableArray createArray = Arguments.createArray();
            for (int i3 = 0; i3 < c2.getChildCount(); i3++) {
                createArray.pushInt(i3);
            }
            u(i2, null, null, null, null, createArray);
            return;
        }
        throw new g(C0201.m82(3633) + i2);
    }

    public void O(int i2, int i3) {
        if (this.d.f(i2) || this.d.f(i3)) {
            throw new g(C0201.m82(3637));
        }
        a0 c2 = this.d.c(i2);
        if (c2 != null) {
            a0 parent = c2.getParent();
            if (parent != null) {
                int indexOf = parent.indexOf(c2);
                if (indexOf >= 0) {
                    WritableArray createArray = Arguments.createArray();
                    createArray.pushInt(i3);
                    WritableArray createArray2 = Arguments.createArray();
                    createArray2.pushInt(indexOf);
                    WritableArray createArray3 = Arguments.createArray();
                    createArray3.pushInt(indexOf);
                    u(parent.getReactTag(), null, null, createArray, createArray2, createArray3);
                    return;
                }
                throw new IllegalStateException(C0201.m82(3634));
            }
            throw new g(C0201.m82(3635) + i2);
        }
        throw new g(C0201.m82(3636) + i2);
    }

    public int P(int i2) {
        if (this.d.f(i2)) {
            return i2;
        }
        a0 Q = Q(i2);
        if (Q != null) {
            return Q.getRootTag();
        }
        f60.A(C0201.m82(3639), C0201.m82(3638) + i2);
        return 0;
    }

    public final a0 Q(int i2) {
        return this.d.c(i2);
    }

    public final ViewManager R(String str) {
        return this.e.c(str);
    }

    public void S(int i2, int i3) {
        this.f.M(i2, i3);
    }

    public void T(int i2, ReadableArray readableArray) {
        synchronized (this.a) {
            a0 c2 = this.d.c(i2);
            for (int i3 = 0; i3 < readableArray.size(); i3++) {
                a0 c3 = this.d.c(readableArray.getInt(i3));
                if (c3 != null) {
                    c2.addChildAt(c3, i3);
                } else {
                    throw new g(C0201.m82(3640) + readableArray.getInt(i3));
                }
            }
            this.g.k(c2, readableArray);
        }
    }

    public void U(int i2, boolean z) {
        a0 c2 = this.d.c(i2);
        if (c2 != null) {
            while (c2.getNativeKind() == l.NONE) {
                c2 = c2.getParent();
            }
            this.f.N(c2.getReactTag(), i2, z);
        }
    }

    public void V(boolean z) {
        this.f.O(z);
    }

    public void W(ak0 ak0) {
        this.f.c0(ak0);
    }

    public void X(int i2, Object obj) {
        a0 c2 = this.d.c(i2);
        if (c2 == null) {
            f60.A(C0201.m82(3642), C0201.m82(3641) + i2);
            return;
        }
        c2.setLocalData(obj);
        o();
    }

    public void Y(int i2, ReadableArray readableArray, Callback callback, Callback callback2) {
        d(i2, C0201.m82(3643));
        this.f.P(i2, readableArray, callback, callback2);
    }

    public void Z(int i2, c0 c0Var) {
        UiThreadUtil.assertOnUiThread();
        this.f.V().E(i2, c0Var);
    }

    public void a(n0 n0Var) {
        this.f.Q(n0Var);
    }

    public void a0(int i2, int i3, int i4) {
        a0 c2 = this.d.c(i2);
        if (c2 == null) {
            f60.A(C0201.m82(3645), C0201.m82(3644) + i2);
            return;
        }
        c2.setStyleWidth((float) i3);
        c2.setStyleHeight((float) i4);
        o();
    }

    public void b(a0 a0Var, float f2, float f3) {
        if (a0Var.hasUpdates()) {
            Iterable<? extends a0> calculateLayoutOnChildren = a0Var.calculateLayoutOnChildren();
            if (calculateLayoutOnChildren != null) {
                for (a0 a0Var2 : calculateLayoutOnChildren) {
                    b(a0Var2, a0Var.getLayoutX() + f2, a0Var.getLayoutY() + f3);
                }
            }
            int reactTag = a0Var.getReactTag();
            if (!this.d.f(reactTag) && a0Var.dispatchUpdates(f2, f3, this.f, this.g) && a0Var.shouldNotifyOnLayout()) {
                this.b.v(p.n(reactTag, a0Var.getScreenX(), a0Var.getScreenY(), a0Var.getScreenWidth(), a0Var.getScreenHeight()));
            }
            a0Var.markUpdateSeen();
            if (dj0.h) {
                this.g.p(a0Var);
            }
        }
    }

    public void b0(int i2, int i3, int i4) {
        a0 c2 = this.d.c(i2);
        if (c2 == null) {
            f60.A(C0201.m82(3647), C0201.m82(3646) + i2);
            return;
        }
        c0(c2, i3, i4);
    }

    public void c0(a0 a0Var, int i2, int i3) {
        a0Var.setMeasureSpecs(i2, i3);
    }

    public void d0(int i2, String str, ReadableMap readableMap) {
        if (this.e.a(str) != null) {
            a0 c2 = this.d.c(i2);
            if (c2 == null) {
                throw new g(C0201.m82(3648) + i2);
            } else if (readableMap != null) {
                c0 c0Var = new c0(readableMap);
                c2.updateProperties(c0Var);
                t(c2, str, c0Var);
            }
        } else {
            throw new g(C0201.m82(3649) + str);
        }
    }

    public void e(a0 a0Var) {
        float f2;
        b.AbstractC0053b a2 = com.facebook.systrace.b.a(0, C0201.m82(3650));
        a2.a(C0201.m82(3651), a0Var.getReactTag());
        a2.c();
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            int intValue = a0Var.getWidthMeasureSpec().intValue();
            int intValue2 = a0Var.getHeightMeasureSpec().intValue();
            float f3 = Float.NaN;
            if (View.MeasureSpec.getMode(intValue) == 0) {
                f2 = Float.NaN;
            } else {
                f2 = (float) View.MeasureSpec.getSize(intValue);
            }
            if (View.MeasureSpec.getMode(intValue2) != 0) {
                f3 = (float) View.MeasureSpec.getSize(intValue2);
            }
            a0Var.calculateLayout(f2, f3);
        } finally {
            com.facebook.systrace.a.g(0);
            this.i = SystemClock.uptimeMillis() - uptimeMillis;
        }
    }

    /* JADX INFO: finally extract failed */
    public void e0() {
        String r0 = C0201.m82(3652);
        com.facebook.systrace.a.c(0, C0201.m82(3653));
        for (int i2 = 0; i2 < this.d.d(); i2++) {
            try {
                a0 c2 = this.d.c(this.d.e(i2));
                if (!(c2.getWidthMeasureSpec() == null || c2.getHeightMeasureSpec() == null)) {
                    b.AbstractC0053b a2 = com.facebook.systrace.b.a(0, C0201.m82(3654));
                    a2.a(r0, c2.getReactTag());
                    a2.c();
                    try {
                        C(c2);
                        com.facebook.systrace.a.g(0);
                        e(c2);
                        b.AbstractC0053b a3 = com.facebook.systrace.b.a(0, C0201.m82(3655));
                        a3.a(r0, c2.getReactTag());
                        a3.c();
                        try {
                            b(c2, 0.0f, 0.0f);
                            com.facebook.systrace.a.g(0);
                            if (this.j != null) {
                                this.f.H(c2, this.j);
                            }
                        } catch (Throwable th) {
                            com.facebook.systrace.a.g(0);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        com.facebook.systrace.a.g(0);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                com.facebook.systrace.a.g(0);
                throw th3;
            }
        }
        com.facebook.systrace.a.g(0);
    }

    public void f() {
        this.f.A();
    }

    @Deprecated
    public void f0(int i2, int i3, Callback callback) {
        a0 c2 = this.d.c(i2);
        a0 c3 = this.d.c(i3);
        if (c2 == null || c3 == null) {
            callback.invoke(Boolean.FALSE);
            return;
        }
        callback.invoke(Boolean.valueOf(c2.isDescendantOf(c3)));
    }

    public void g(ReadableMap readableMap, Callback callback) {
        this.f.B(readableMap, callback);
    }

    public a0 h() {
        b0 b0Var = new b0();
        if (com.facebook.react.modules.i18nmanager.a.d().g(this.c)) {
            b0Var.setLayoutDirection(h.RTL);
        }
        b0Var.setViewClassName(C0201.m82(3656));
        return b0Var;
    }

    public a0 i(String str) {
        return this.e.a(str).createShadowNodeInstance(this.c);
    }

    public void j(int i2, String str, int i3, ReadableMap readableMap) {
        synchronized (this.a) {
            a0 i4 = i(str);
            a0 c2 = this.d.c(i3);
            yh0.d(c2, C0201.m82(3657) + i3 + C0201.m82(3658));
            i4.setReactTag(i2);
            i4.setViewClassName(str);
            i4.setRootTag(c2.getReactTag());
            i4.setThemedContext(c2.getThemedContext());
            this.d.a(i4);
            c0 c0Var = null;
            if (readableMap != null) {
                c0Var = new c0(readableMap);
                i4.updateProperties(c0Var);
            }
            s(i4, i3, c0Var);
        }
    }

    public void k() {
        this.f.D();
    }

    @Deprecated
    public void l(int i2, int i3, ReadableArray readableArray) {
        d(i2, C0201.m82(3659));
        this.f.E(i2, i3, readableArray);
    }

    public void m(int i2, String str, ReadableArray readableArray) {
        d(i2, C0201.m82(3660));
        this.f.F(i2, str, readableArray);
    }

    public void n(int i2) {
        b.AbstractC0053b a2 = com.facebook.systrace.b.a(0, C0201.m82(3661));
        a2.a(C0201.m82(3662), i2);
        a2.c();
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            e0();
            this.g.o();
            this.f.z(i2, uptimeMillis, this.i);
        } finally {
            com.facebook.systrace.a.g(0);
        }
    }

    public void p(int i2, float f2, float f3, Callback callback) {
        this.f.G(i2, f2, f3, callback);
    }

    public Map<String, Long> q() {
        return this.f.W();
    }

    public v0 r() {
        return this.f;
    }

    public void s(a0 a0Var, int i2, c0 c0Var) {
        if (!a0Var.isVirtual()) {
            this.g.g(a0Var, a0Var.getThemedContext(), c0Var);
        }
    }

    public void t(a0 a0Var, String str, c0 c0Var) {
        if (!a0Var.isVirtual()) {
            this.g.m(a0Var, str, c0Var);
        }
    }

    public void u(int i2, ReadableArray readableArray, ReadableArray readableArray2, ReadableArray readableArray3, ReadableArray readableArray4, ReadableArray readableArray5) {
        Throwable th;
        int i3;
        int i4;
        int i5;
        ReadableArray readableArray6 = readableArray;
        synchronized (this.a) {
            try {
                a0 c2 = this.d.c(i2);
                if (readableArray6 == null) {
                    i3 = 0;
                } else {
                    i3 = readableArray.size();
                }
                if (readableArray3 == null) {
                    i4 = 0;
                } else {
                    i4 = readableArray3.size();
                }
                if (readableArray5 == null) {
                    i5 = 0;
                } else {
                    i5 = readableArray5.size();
                }
                if (i3 != 0) {
                    if (readableArray2 == null || i3 != readableArray2.size()) {
                        throw new g(m);
                    }
                }
                if (i4 != 0) {
                    if (readableArray4 == null || i4 != readableArray4.size()) {
                        throw new g(k);
                    }
                }
                int i6 = i3 + i4;
                w0[] w0VarArr = new w0[i6];
                int i7 = i3 + i5;
                int[] iArr = new int[i7];
                try {
                    int[] iArr2 = new int[i7];
                    int[] iArr3 = new int[i5];
                    if (i3 > 0) {
                        yh0.c(readableArray);
                        yh0.c(readableArray2);
                        int i8 = 0;
                        while (i8 < i3) {
                            int i9 = readableArray6.getInt(i8);
                            int reactTag = c2.getChildAt(i9).getReactTag();
                            w0VarArr[i8] = new w0(reactTag, readableArray2.getInt(i8));
                            iArr[i8] = i9;
                            iArr2[i8] = reactTag;
                            i8++;
                            readableArray6 = readableArray;
                            i7 = i7;
                            iArr3 = iArr3;
                            c2 = c2;
                        }
                    }
                    a0 a0Var = c2;
                    if (i4 > 0) {
                        yh0.c(readableArray3);
                        yh0.c(readableArray4);
                        for (int i10 = 0; i10 < i4; i10++) {
                            w0VarArr[i3 + i10] = new w0(readableArray3.getInt(i10), readableArray4.getInt(i10));
                        }
                    }
                    if (i5 > 0) {
                        yh0.c(readableArray5);
                        int i11 = 0;
                        while (i11 < i5) {
                            int i12 = readableArray5.getInt(i11);
                            int reactTag2 = a0Var.getChildAt(i12).getReactTag();
                            int i13 = i3 + i11;
                            iArr[i13] = i12;
                            iArr2[i13] = reactTag2;
                            iArr3[i11] = reactTag2;
                            i11++;
                            a0Var = a0Var;
                        }
                    }
                    Arrays.sort(w0VarArr, w0.c);
                    Arrays.sort(iArr);
                    int i14 = -1;
                    for (int i15 = i7 - 1; i15 >= 0; i15--) {
                        if (iArr[i15] != i14) {
                            a0Var.removeChildAt(iArr[i15]);
                            i14 = iArr[i15];
                        } else {
                            throw new g(l + i2);
                        }
                    }
                    int i16 = 0;
                    for (int i17 = i6; i16 < i17; i17 = i17) {
                        w0 w0Var = w0VarArr[i16];
                        a0 c3 = this.d.c(w0Var.a);
                        if (c3 != null) {
                            a0Var.addChildAt(c3, w0Var.b);
                            i16++;
                            iArr2 = iArr2;
                        } else {
                            throw new g(n + w0Var.a);
                        }
                    }
                    this.g.i(a0Var, iArr, iArr2, w0VarArr, iArr3);
                    for (int i18 = 0; i18 < i5; i18++) {
                        L(this.d.c(iArr3[i18]));
                    }
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        }
    }

    public void v(int i2, Callback callback) {
        this.f.J(i2, callback);
    }

    public void w(int i2, Callback callback) {
        this.f.K(i2, callback);
    }

    public void x(int i2, int i3, Callback callback, Callback callback2) {
        try {
            y(i2, i3, this.h);
            callback2.invoke(Float.valueOf(q.a((float) this.h[0])), Float.valueOf(q.a((float) this.h[1])), Float.valueOf(q.a((float) this.h[2])), Float.valueOf(q.a((float) this.h[3])));
        } catch (g e2) {
            callback.invoke(e2.getMessage());
        }
    }

    public void z(int i2, Callback callback, Callback callback2) {
        try {
            A(i2, this.h);
            callback2.invoke(Float.valueOf(q.a((float) this.h[0])), Float.valueOf(q.a((float) this.h[1])), Float.valueOf(q.a((float) this.h[2])), Float.valueOf(q.a((float) this.h[3])));
        } catch (g e2) {
            callback.invoke(e2.getMessage());
        }
    }

    public o0(ReactApplicationContext reactApplicationContext, a1 a1Var, v0 v0Var, d dVar) {
        this.a = new Object();
        h0 h0Var = new h0();
        this.d = h0Var;
        this.h = new int[4];
        this.i = 0;
        this.c = reactApplicationContext;
        this.e = a1Var;
        this.f = v0Var;
        this.g = new n(v0Var, h0Var);
        this.b = dVar;
    }
}
