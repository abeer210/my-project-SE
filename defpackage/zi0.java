package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.appregistry.AppRegistry;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.c;
import com.facebook.react.uimanager.f0;
import com.facebook.react.uimanager.g;
import com.facebook.react.uimanager.h;
import com.facebook.react.uimanager.q;
import com.facebook.react.uimanager.q0;
import com.facebook.react.uimanager.y;
import vigqyno.C0201;

/* renamed from: zi0  reason: default package */
/* compiled from: ReactRootView */
public class zi0 extends FrameLayout implements f0, y {
    private si0 a;
    private String b;
    private Bundle c;
    private String d;
    private a e;
    private b f;
    private int g;
    private boolean h;
    private boolean i;
    private h j;
    private final pi0 k = new pi0(this);
    private boolean l = false;
    private int m = View.MeasureSpec.makeMeasureSpec(0, 0);
    private int n = View.MeasureSpec.makeMeasureSpec(0, 0);
    private int o = 0;
    private int p = 0;
    private int q = 1;
    private final boolean u = false;

    /* access modifiers changed from: private */
    /* renamed from: zi0$a */
    /* compiled from: ReactRootView */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        private final Rect a;
        private final int b;
        private int c = 0;
        private int d = 0;

        public a() {
            c.h(zi0.this.getContext().getApplicationContext());
            this.a = new Rect();
            this.b = (int) q.c(60.0f);
        }

        private void a() {
            f();
        }

        private void b() {
            int rotation = ((WindowManager) zi0.this.getContext().getSystemService(C0201.m82(10753))).getDefaultDisplay().getRotation();
            if (this.d != rotation) {
                this.d = rotation;
                e(rotation);
            }
        }

        private void c() {
            zi0.this.getRootView().getWindowVisibleDisplayFrame(this.a);
            int i = c.f().heightPixels - this.a.bottom;
            boolean z = true;
            if (this.c != i && i > this.b) {
                this.c = i;
                zi0.this.q(C0201.m82(10754), d((double) q.a((float) this.a.bottom), (double) q.a((float) this.a.left), (double) q.a((float) this.a.width()), (double) q.a((float) this.c)));
                return;
            }
            if (this.c == 0 || i > this.b) {
                z = false;
            }
            if (z) {
                this.c = 0;
                zi0 zi0 = zi0.this;
                zi0.q(C0201.m82(10755), d((double) q.a((float) zi0.p), 0.0d, (double) q.a((float) this.a.width()), 0.0d));
            }
        }

        private WritableMap d(double d2, double d3, double d4, double d5) {
            WritableMap createMap = Arguments.createMap();
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putDouble(C0201.m82(10756), d5);
            createMap2.putDouble(C0201.m82(10757), d3);
            createMap2.putDouble(C0201.m82(10758), d4);
            createMap2.putDouble(C0201.m82(10759), d2);
            createMap.putMap(C0201.m82(10760), createMap2);
            createMap.putString(C0201.m82(10761), C0201.m82(10762));
            createMap.putDouble(C0201.m82(10763), 0.0d);
            return createMap;
        }

        private void e(int i) {
            String str;
            double d2;
            double d3;
            boolean z = true;
            if (i != 0) {
                if (i == 1) {
                    d2 = -90.0d;
                    str = C0201.m82(10766);
                } else if (i == 2) {
                    d3 = 180.0d;
                    str = C0201.m82(10765);
                } else if (i == 3) {
                    d2 = 90.0d;
                    str = C0201.m82(10764);
                } else {
                    return;
                }
                WritableMap createMap = Arguments.createMap();
                createMap.putString(C0201.m82(10768), str);
                createMap.putDouble(C0201.m82(10769), d2);
                createMap.putBoolean(C0201.m82(10770), z);
                zi0.this.q(C0201.m82(10771), createMap);
            }
            d3 = 0.0d;
            str = C0201.m82(10767);
            d2 = d3;
            z = false;
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putString(C0201.m82(10768), str);
            createMap2.putDouble(C0201.m82(10769), d2);
            createMap2.putBoolean(C0201.m82(10770), z);
            zi0.this.q(C0201.m82(10771), createMap2);
        }

        private void f() {
            ((DeviceInfoModule) zi0.this.a.v().getNativeModule(DeviceInfoModule.class)).emitUpdateDimensionsEvent();
        }

        public void onGlobalLayout() {
            if (zi0.this.a != null && zi0.this.h && zi0.this.a.v() != null) {
                c();
                b();
                a();
            }
        }
    }

    /* renamed from: zi0$b */
    /* compiled from: ReactRootView */
    public interface b {
        void a(zi0 zi0);
    }

    public zi0(Context context) {
        super(context);
        n();
    }

    private a getCustomGlobalLayoutListener() {
        if (this.e == null) {
            this.e = new a();
        }
        return this.e;
    }

    private void l() {
        com.facebook.systrace.a.c(0, C0201.m82(36175));
        if (!this.h) {
            try {
                this.h = true;
                si0 si0 = this.a;
                yh0.c(si0);
                si0.l(this);
                getViewTreeObserver().addOnGlobalLayoutListener(getCustomGlobalLayoutListener());
            } finally {
                com.facebook.systrace.a.g(0);
            }
        }
    }

    private void m(MotionEvent motionEvent) {
        si0 si0 = this.a;
        String r1 = C0201.m82(36176);
        if (si0 == null || !this.h || si0.v() == null) {
            f60.A(r1, C0201.m82(36178));
        } else if (this.j == null) {
            f60.A(r1, C0201.m82(36177));
        } else {
            this.j.c(motionEvent, ((UIManagerModule) this.a.v().getNativeModule(UIManagerModule.class)).getEventDispatcher());
        }
    }

    private void n() {
        setClipChildren(false);
    }

    private void p() {
        getViewTreeObserver().removeOnGlobalLayoutListener(getCustomGlobalLayoutListener());
    }

    private void u(int i2, int i3) {
        UIManager d2;
        si0 si0 = this.a;
        if (si0 == null) {
            f60.A(C0201.m82(36179), C0201.m82(36180));
            return;
        }
        ReactContext v = si0.v();
        if (v != null && (d2 = q0.d(v, getUIManagerType())) != null) {
            d2.updateRootLayoutSpecs(getRootViewTag(), i2, i3);
        }
    }

    @Override // com.facebook.react.uimanager.f0
    public void c(Throwable th) {
        si0 si0 = this.a;
        if (si0 == null || si0.v() == null) {
            throw new RuntimeException(th);
        }
        this.a.v().handleException(new g(th.getMessage(), this, th));
    }

    public void dispatchDraw(Canvas canvas) {
        try {
            super.dispatchDraw(canvas);
        } catch (StackOverflowError e2) {
            c(e2);
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        si0 si0 = this.a;
        if (si0 == null || !this.h || si0.v() == null) {
            f60.A(C0201.m82(36181), C0201.m82(36182));
            return super.dispatchKeyEvent(keyEvent);
        }
        this.k.d(keyEvent);
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // com.facebook.react.uimanager.y
    public void e(int i2) {
        if (i2 == 101) {
            o();
        }
    }

    @Override // java.lang.Object
    public void finalize() throws Throwable {
        super.finalize();
        yh0.b(!this.h, C0201.m82(36183));
    }

    @Override // com.facebook.react.uimanager.f0
    public void g(MotionEvent motionEvent) {
        si0 si0 = this.a;
        String r1 = C0201.m82(36184);
        if (si0 == null || !this.h || si0.v() == null) {
            f60.A(r1, C0201.m82(36186));
        } else if (this.j == null) {
            f60.A(r1, C0201.m82(36185));
        } else {
            this.j.d(motionEvent, ((UIManagerModule) this.a.v().getNativeModule(UIManagerModule.class)).getEventDispatcher());
        }
    }

    @Override // com.facebook.react.uimanager.y
    public Bundle getAppProperties() {
        return this.c;
    }

    @Override // com.facebook.react.uimanager.y
    public int getHeightMeasureSpec() {
        return this.n;
    }

    @Override // com.facebook.react.uimanager.y
    public String getInitialUITemplate() {
        return this.d;
    }

    public String getJSModuleName() {
        String str = this.b;
        yh0.c(str);
        return str;
    }

    public si0 getReactInstanceManager() {
        return this.a;
    }

    @Override // com.facebook.react.uimanager.y
    public ViewGroup getRootViewGroup() {
        return this;
    }

    @Override // com.facebook.react.uimanager.y
    public int getRootViewTag() {
        return this.g;
    }

    @Override // com.facebook.react.uimanager.y
    public String getSurfaceID() {
        Bundle appProperties = getAppProperties();
        if (appProperties != null) {
            return appProperties.getString(C0201.m82(36187));
        }
        return null;
    }

    @Override // com.facebook.react.uimanager.y
    public int getUIManagerType() {
        return this.q;
    }

    @Override // com.facebook.react.uimanager.y
    public int getWidthMeasureSpec() {
        return this.m;
    }

    @Override // com.facebook.react.uimanager.y
    public void h() {
        com.facebook.systrace.a.c(0, C0201.m82(36188));
        try {
            if (this.a != null) {
                if (this.h) {
                    ReactContext v = this.a.v();
                    if (v == null) {
                        com.facebook.systrace.a.g(0);
                        return;
                    }
                    CatalystInstance catalystInstance = v.getCatalystInstance();
                    String jSModuleName = getJSModuleName();
                    if (!this.u) {
                        if (this.l) {
                            u(this.m, this.n);
                        }
                        WritableNativeMap writableNativeMap = new WritableNativeMap();
                        writableNativeMap.putDouble(C0201.m82(36189), (double) getRootViewTag());
                        Bundle appProperties = getAppProperties();
                        if (appProperties != null) {
                            writableNativeMap.putMap(C0201.m82(36190), Arguments.fromBundle(appProperties));
                        }
                        this.i = true;
                        f60.i(C0201.m82(36191), C0201.m82(36192));
                        ((AppRegistry) catalystInstance.getJSModule(AppRegistry.class)).runApplication(jSModuleName, writableNativeMap);
                    }
                    com.facebook.systrace.a.g(0);
                }
            }
        } finally {
            com.facebook.systrace.a.g(0);
        }
    }

    public void o() {
        this.j = new h(this);
        b bVar = this.f;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h) {
            p();
            getViewTreeObserver().addOnGlobalLayoutListener(getCustomGlobalLayoutListener());
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.h) {
            p();
        }
    }

    public void onFocusChanged(boolean z, int i2, Rect rect) {
        si0 si0 = this.a;
        if (si0 == null || !this.h || si0.v() == null) {
            f60.A(C0201.m82(36193), C0201.m82(36194));
            super.onFocusChanged(z, i2, rect);
            return;
        }
        this.k.a();
        super.onFocusChanged(z, i2, rect);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        if (this.u) {
            super.onLayout(z, i2, i3, i4, i5);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002e A[Catch:{ all -> 0x00b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003e A[Catch:{ all -> 0x00b9 }, LOOP:0: B:19:0x0038->B:21:0x003e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0062 A[Catch:{ all -> 0x00b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0071 A[Catch:{ all -> 0x00b9 }, LOOP:1: B:28:0x006b->B:30:0x0071, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0098 A[Catch:{ all -> 0x00b9 }] */
    public void onMeasure(int i2, int i3) {
        boolean z;
        int mode;
        int i4;
        int mode2;
        int i5;
        int i6;
        if (this.u) {
            super.onMeasure(i2, i3);
            return;
        }
        com.facebook.systrace.a.c(0, C0201.m82(36195));
        try {
            if (i2 == this.m) {
                if (i3 == this.n) {
                    z = false;
                    this.m = i2;
                    this.n = i3;
                    mode = View.MeasureSpec.getMode(i2);
                    if (mode != Integer.MIN_VALUE) {
                        if (mode != 0) {
                            i4 = View.MeasureSpec.getSize(i2);
                            mode2 = View.MeasureSpec.getMode(i3);
                            if (mode2 != Integer.MIN_VALUE) {
                                if (mode2 != 0) {
                                    i5 = View.MeasureSpec.getSize(i3);
                                    setMeasuredDimension(i4, i5);
                                    this.l = true;
                                    if (this.a == null && !this.h) {
                                        l();
                                    } else if (!(!z && this.o == i4 && this.p == i5)) {
                                        u(this.m, this.n);
                                    }
                                    this.o = i4;
                                    this.p = i5;
                                }
                            }
                            i5 = 0;
                            for (int i7 = 0; i7 < getChildCount(); i7++) {
                                View childAt = getChildAt(i7);
                                i5 = Math.max(i5, childAt.getTop() + childAt.getMeasuredHeight() + childAt.getPaddingTop() + childAt.getPaddingBottom());
                            }
                            setMeasuredDimension(i4, i5);
                            this.l = true;
                            if (this.a == null) {
                            }
                            u(this.m, this.n);
                            this.o = i4;
                            this.p = i5;
                        }
                    }
                    i4 = 0;
                    for (i6 = 0; i6 < getChildCount(); i6++) {
                        View childAt2 = getChildAt(i6);
                        i4 = Math.max(i4, childAt2.getLeft() + childAt2.getMeasuredWidth() + childAt2.getPaddingLeft() + childAt2.getPaddingRight());
                    }
                    mode2 = View.MeasureSpec.getMode(i3);
                    if (mode2 != Integer.MIN_VALUE) {
                    }
                    i5 = 0;
                    while (i7 < getChildCount()) {
                    }
                    setMeasuredDimension(i4, i5);
                    this.l = true;
                    if (this.a == null) {
                    }
                    u(this.m, this.n);
                    this.o = i4;
                    this.p = i5;
                }
            }
            z = true;
            this.m = i2;
            this.n = i3;
            mode = View.MeasureSpec.getMode(i2);
            if (mode != Integer.MIN_VALUE) {
            }
            i4 = 0;
            while (i6 < getChildCount()) {
            }
            mode2 = View.MeasureSpec.getMode(i3);
            if (mode2 != Integer.MIN_VALUE) {
            }
            i5 = 0;
            while (i7 < getChildCount()) {
            }
            setMeasuredDimension(i4, i5);
            this.l = true;
            if (this.a == null) {
            }
            u(this.m, this.n);
            this.o = i4;
            this.p = i5;
        } finally {
            com.facebook.systrace.a.g(0);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        m(motionEvent);
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (this.i) {
            this.i = false;
            String str = this.b;
            if (str != null) {
                ReactMarker.logMarker(ReactMarkerConstants.CONTENT_APPEARED, str, this.g);
            }
        }
    }

    public void q(String str, WritableMap writableMap) {
        si0 si0 = this.a;
        if (si0 != null) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) si0.v().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
        }
    }

    public void r(si0 si0, String str, Bundle bundle) {
        s(si0, str, bundle, null);
    }

    public void requestChildFocus(View view, View view2) {
        si0 si0 = this.a;
        if (si0 == null || !this.h || si0.v() == null) {
            f60.A(C0201.m82(36196), C0201.m82(36197));
            super.requestChildFocus(view, view2);
            return;
        }
        this.k.e(view2);
        super.requestChildFocus(view, view2);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(z);
        }
    }

    public void s(si0 si0, String str, Bundle bundle, String str2) {
        com.facebook.systrace.a.c(0, C0201.m82(36198));
        try {
            UiThreadUtil.assertOnUiThread();
            yh0.b(this.a == null, C0201.m82(36199));
            this.a = si0;
            this.b = str;
            this.c = bundle;
            this.d = str2;
            si0.r();
            l();
        } finally {
            com.facebook.systrace.a.g(0);
        }
    }

    public void setAppProperties(Bundle bundle) {
        UiThreadUtil.assertOnUiThread();
        this.c = bundle;
        if (getRootViewTag() != 0) {
            h();
        }
    }

    public void setEventListener(b bVar) {
        this.f = bVar;
    }

    public void setIsFabric(boolean z) {
        this.q = z ? 2 : 1;
    }

    @Override // com.facebook.react.uimanager.y
    public void setRootViewTag(int i2) {
        this.g = i2;
    }

    @Override // com.facebook.react.uimanager.y
    public void setShouldLogContentAppeared(boolean z) {
        this.i = z;
    }

    public void t() {
        UiThreadUtil.assertOnUiThread();
        si0 si0 = this.a;
        if (si0 != null && this.h) {
            si0.t(this);
            this.h = false;
        }
        this.a = null;
        this.i = false;
    }
}
