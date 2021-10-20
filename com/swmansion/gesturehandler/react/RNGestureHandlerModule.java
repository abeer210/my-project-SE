package com.swmansion.gesturehandler.react;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.m;
import com.facebook.react.uimanager.n0;
import com.facebook.react.uimanager.q;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import vigqyno.C0201;

@pj0(name = "RNGestureHandlerModule")
public class RNGestureHandlerModule extends ReactContextBaseJavaModule {
    private static final String KEY_DIRECTION = null;
    private static final String KEY_ENABLED = null;
    private static final String KEY_HIT_SLOP = null;
    private static final String KEY_HIT_SLOP_BOTTOM = null;
    private static final String KEY_HIT_SLOP_HEIGHT = null;
    private static final String KEY_HIT_SLOP_HORIZONTAL = null;
    private static final String KEY_HIT_SLOP_LEFT = null;
    private static final String KEY_HIT_SLOP_RIGHT = null;
    private static final String KEY_HIT_SLOP_TOP = null;
    private static final String KEY_HIT_SLOP_VERTICAL = null;
    private static final String KEY_HIT_SLOP_WIDTH = null;
    private static final String KEY_LONG_PRESS_MAX_DIST = null;
    private static final String KEY_LONG_PRESS_MIN_DURATION_MS = null;
    private static final String KEY_NATIVE_VIEW_DISALLOW_INTERRUPTION = null;
    private static final String KEY_NATIVE_VIEW_SHOULD_ACTIVATE_ON_START = null;
    private static final String KEY_NUMBER_OF_POINTERS = null;
    private static final String KEY_PAN_ACTIVE_OFFSET_X_END = null;
    private static final String KEY_PAN_ACTIVE_OFFSET_X_START = null;
    private static final String KEY_PAN_ACTIVE_OFFSET_Y_END = null;
    private static final String KEY_PAN_ACTIVE_OFFSET_Y_START = null;
    private static final String KEY_PAN_AVG_TOUCHES = null;
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_X_END = null;
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_X_START = null;
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_Y_END = null;
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_Y_START = null;
    private static final String KEY_PAN_MAX_POINTERS = null;
    private static final String KEY_PAN_MIN_DIST = null;
    private static final String KEY_PAN_MIN_POINTERS = null;
    private static final String KEY_PAN_MIN_VELOCITY = null;
    private static final String KEY_PAN_MIN_VELOCITY_X = null;
    private static final String KEY_PAN_MIN_VELOCITY_Y = null;
    private static final String KEY_SHOULD_CANCEL_WHEN_OUTSIDE = null;
    private static final String KEY_TAP_MAX_DELAY_MS = null;
    private static final String KEY_TAP_MAX_DELTA_X = null;
    private static final String KEY_TAP_MAX_DELTA_Y = null;
    private static final String KEY_TAP_MAX_DIST = null;
    private static final String KEY_TAP_MAX_DURATION_MS = null;
    private static final String KEY_TAP_MIN_POINTERS = null;
    private static final String KEY_TAP_NUMBER_OF_TAPS = null;
    public static final String MODULE_NAME = null;
    private List<Integer> mEnqueuedRootViewInit = new ArrayList();
    private dq2 mEventListener = new a();
    private d[] mHandlerFactories = {new f(null), new j(null), new e(null), new g(null), new h(null), new i(null), new c(null)};
    private d mInteractionManager = new d();
    private final f mRegistry = new f();
    private List<g> mRoots = new ArrayList();

    class a implements dq2 {
        public a() {
        }

        @Override // defpackage.dq2
        public void a(wp2 wp2, int i, int i2) {
            RNGestureHandlerModule.this.onStateChange(wp2, i, i2);
        }

        @Override // defpackage.dq2
        public void b(wp2 wp2, MotionEvent motionEvent) {
            RNGestureHandlerModule.this.onTouchEvent(wp2, motionEvent);
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements n0 {
        public final /* synthetic */ int a;

        public b(int i) {
            this.a = i;
        }

        @Override // com.facebook.react.uimanager.n0
        public void a(m mVar) {
            View w = mVar.w(this.a);
            if (w instanceof a) {
                ((a) w).v();
            }
            synchronized (RNGestureHandlerModule.this.mEnqueuedRootViewInit) {
                RNGestureHandlerModule.this.mEnqueuedRootViewInit.remove(new Integer(this.a));
            }
        }
    }

    private static class c extends d<vp2> {
        private c() {
            super(null);
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        public String d() {
            return C0201.m82(19240);
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        public Class<vp2> e() {
            return vp2.class;
        }

        /* renamed from: f */
        public void b(vp2 vp2, ReadableMap readableMap) {
            super.b(vp2, readableMap);
            String r0 = C0201.m82(19241);
            if (readableMap.hasKey(r0)) {
                vp2.W(readableMap.getInt(r0));
            }
            String r02 = C0201.m82(19242);
            if (readableMap.hasKey(r02)) {
                vp2.V(readableMap.getInt(r02));
            }
        }

        /* renamed from: g */
        public vp2 c(Context context) {
            return new vp2();
        }

        /* renamed from: h */
        public void a(vp2 vp2, WritableMap writableMap) {
            super.a(vp2, writableMap);
            writableMap.putDouble(C0201.m82(19243), (double) q.a(vp2.m()));
            writableMap.putDouble(C0201.m82(19244), (double) q.a(vp2.n()));
            writableMap.putDouble(C0201.m82(19245), (double) q.a(vp2.k()));
            writableMap.putDouble(C0201.m82(19246), (double) q.a(vp2.l()));
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }

    /* access modifiers changed from: private */
    public static abstract class d<T extends wp2> implements c<T> {
        private d() {
        }

        @Override // com.swmansion.gesturehandler.react.c
        public void a(T t, WritableMap writableMap) {
            writableMap.putDouble(C0201.m82(18956), (double) t.o());
        }

        public void b(T t, ReadableMap readableMap) {
            String r0 = C0201.m82(18957);
            if (readableMap.hasKey(r0)) {
                t.L(readableMap.getBoolean(r0));
            }
            String r02 = C0201.m82(18958);
            if (readableMap.hasKey(r02)) {
                t.H(readableMap.getBoolean(r02));
            }
            if (readableMap.hasKey(C0201.m82(18959))) {
                RNGestureHandlerModule.handleHitSlopProperty(t, readableMap);
            }
        }

        public abstract T c(Context context);

        public abstract String d();

        public abstract Class<T> e();

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    private static class e extends d<bq2> {
        private e() {
            super(null);
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        public String d() {
            return C0201.m82(19344);
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        public Class<bq2> e() {
            return bq2.class;
        }

        /* renamed from: f */
        public void b(bq2 bq2, ReadableMap readableMap) {
            super.b(bq2, readableMap);
            String r0 = C0201.m82(19345);
            if (readableMap.hasKey(r0)) {
                bq2.V((long) readableMap.getInt(r0));
            }
            String r02 = C0201.m82(19346);
            if (readableMap.hasKey(r02)) {
                bq2.U(q.b(readableMap.getDouble(r02)));
            }
        }

        /* renamed from: g */
        public bq2 c(Context context) {
            return new bq2(context);
        }

        /* renamed from: h */
        public void a(bq2 bq2, WritableMap writableMap) {
            super.a(bq2, writableMap);
            writableMap.putDouble(C0201.m82(19347), (double) q.a(bq2.m()));
            writableMap.putDouble(C0201.m82(19348), (double) q.a(bq2.n()));
            writableMap.putDouble(C0201.m82(19349), (double) q.a(bq2.k()));
            writableMap.putDouble(C0201.m82(19350), (double) q.a(bq2.l()));
        }

        public /* synthetic */ e(a aVar) {
            this();
        }
    }

    private static class f extends d<cq2> {
        private f() {
            super(null);
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        public String d() {
            return C0201.m82(19269);
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        public Class<cq2> e() {
            return cq2.class;
        }

        /* renamed from: f */
        public void b(cq2 cq2, ReadableMap readableMap) {
            super.b(cq2, readableMap);
            String r0 = C0201.m82(19270);
            if (readableMap.hasKey(r0)) {
                cq2.V(readableMap.getBoolean(r0));
            }
            String r02 = C0201.m82(19271);
            if (readableMap.hasKey(r02)) {
                cq2.U(readableMap.getBoolean(r02));
            }
        }

        /* renamed from: g */
        public cq2 c(Context context) {
            return new cq2();
        }

        /* renamed from: h */
        public void a(cq2 cq2, WritableMap writableMap) {
            super.a(cq2, writableMap);
            writableMap.putBoolean(C0201.m82(19272), cq2.x());
        }

        public /* synthetic */ f(a aVar) {
            this();
        }
    }

    private static class g extends d<eq2> {
        private g() {
            super(null);
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        public String d() {
            return C0201.m82(15950);
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        public Class<eq2> e() {
            return eq2.class;
        }

        /* renamed from: f */
        public void b(eq2 eq2, ReadableMap readableMap) {
            boolean z;
            super.b(eq2, readableMap);
            String r0 = C0201.m82(15951);
            boolean z2 = true;
            if (readableMap.hasKey(r0)) {
                eq2.a0(q.b(readableMap.getDouble(r0)));
                z = true;
            } else {
                z = false;
            }
            String r1 = C0201.m82(15952);
            if (readableMap.hasKey(r1)) {
                eq2.Z(q.b(readableMap.getDouble(r1)));
                z = true;
            }
            String r12 = C0201.m82(15953);
            if (readableMap.hasKey(r12)) {
                eq2.f0(q.b(readableMap.getDouble(r12)));
                z = true;
            }
            String r13 = C0201.m82(15954);
            if (readableMap.hasKey(r13)) {
                eq2.e0(q.b(readableMap.getDouble(r13)));
                z = true;
            }
            String r14 = C0201.m82(15955);
            if (readableMap.hasKey(r14)) {
                eq2.c0(q.b(readableMap.getDouble(r14)));
                z = true;
            }
            String r15 = C0201.m82(15956);
            if (readableMap.hasKey(r15)) {
                eq2.b0(q.b(readableMap.getDouble(r15)));
                z = true;
            }
            String r16 = C0201.m82(15957);
            if (readableMap.hasKey(r16)) {
                eq2.h0(q.b(readableMap.getDouble(r16)));
                z = true;
            }
            String r17 = C0201.m82(15958);
            if (readableMap.hasKey(r17)) {
                eq2.g0(q.b(readableMap.getDouble(r17)));
                z = true;
            }
            String r18 = C0201.m82(15959);
            if (readableMap.hasKey(r18)) {
                eq2.l0(q.b(readableMap.getDouble(r18)));
                z = true;
            }
            String r19 = C0201.m82(15960);
            if (readableMap.hasKey(r19)) {
                eq2.m0(q.b(readableMap.getDouble(r19)));
                z = true;
            }
            String r110 = C0201.m82(15961);
            if (readableMap.hasKey(r110)) {
                eq2.n0(q.b(readableMap.getDouble(r110)));
            } else {
                z2 = z;
            }
            String r02 = C0201.m82(15962);
            if (readableMap.hasKey(r02)) {
                eq2.j0(q.b(readableMap.getDouble(r02)));
            } else if (z2) {
                eq2.j0(Float.MAX_VALUE);
            }
            String r03 = C0201.m82(15963);
            if (readableMap.hasKey(r03)) {
                eq2.k0(readableMap.getInt(r03));
            }
            String r04 = C0201.m82(15964);
            if (readableMap.hasKey(r04)) {
                eq2.i0(readableMap.getInt(r04));
            }
            String r05 = C0201.m82(15965);
            if (readableMap.hasKey(r05)) {
                eq2.d0(readableMap.getBoolean(r05));
            }
        }

        /* renamed from: g */
        public eq2 c(Context context) {
            return new eq2(context);
        }

        /* renamed from: h */
        public void a(eq2 eq2, WritableMap writableMap) {
            super.a(eq2, writableMap);
            writableMap.putDouble(C0201.m82(15966), (double) q.a(eq2.m()));
            writableMap.putDouble(C0201.m82(15967), (double) q.a(eq2.n()));
            writableMap.putDouble(C0201.m82(15968), (double) q.a(eq2.k()));
            writableMap.putDouble(C0201.m82(15969), (double) q.a(eq2.l()));
            writableMap.putDouble(C0201.m82(15970), (double) q.a(eq2.V()));
            writableMap.putDouble(C0201.m82(15971), (double) q.a(eq2.W()));
            writableMap.putDouble(C0201.m82(15972), (double) q.a(eq2.X()));
            writableMap.putDouble(C0201.m82(15973), (double) q.a(eq2.Y()));
        }

        public /* synthetic */ g(a aVar) {
            this();
        }
    }

    private static class h extends d<fq2> {
        private h() {
            super(null);
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        public String d() {
            return C0201.m82(15877);
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        public Class<fq2> e() {
            return fq2.class;
        }

        /* renamed from: f */
        public fq2 c(Context context) {
            return new fq2();
        }

        /* renamed from: g */
        public void a(fq2 fq2, WritableMap writableMap) {
            super.a(fq2, writableMap);
            writableMap.putDouble(C0201.m82(15878), fq2.c0());
            writableMap.putDouble(C0201.m82(15879), (double) q.a(fq2.a0()));
            writableMap.putDouble(C0201.m82(15880), (double) q.a(fq2.b0()));
            writableMap.putDouble(C0201.m82(15881), fq2.d0());
        }

        public /* synthetic */ h(a aVar) {
            this();
        }
    }

    private static class i extends d<iq2> {
        private i() {
            super(null);
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        public String d() {
            return C0201.m82(16099);
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        public Class<iq2> e() {
            return iq2.class;
        }

        /* renamed from: f */
        public iq2 c(Context context) {
            return new iq2();
        }

        /* renamed from: g */
        public void a(iq2 iq2, WritableMap writableMap) {
            super.a(iq2, writableMap);
            writableMap.putDouble(C0201.m82(16100), iq2.Z());
            writableMap.putDouble(C0201.m82(16101), (double) q.a(iq2.X()));
            writableMap.putDouble(C0201.m82(16102), (double) q.a(iq2.Y()));
            writableMap.putDouble(C0201.m82(16103), iq2.a0());
        }

        public /* synthetic */ i(a aVar) {
            this();
        }
    }

    private static class j extends d<jq2> {
        private j() {
            super(null);
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        public String d() {
            return C0201.m82(16011);
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        public Class<jq2> e() {
            return jq2.class;
        }

        /* renamed from: f */
        public void b(jq2 jq2, ReadableMap readableMap) {
            super.b(jq2, readableMap);
            String r0 = C0201.m82(16012);
            if (readableMap.hasKey(r0)) {
                jq2.b0(readableMap.getInt(r0));
            }
            String r02 = C0201.m82(16013);
            if (readableMap.hasKey(r02)) {
                jq2.X((long) readableMap.getInt(r02));
            }
            String r03 = C0201.m82(16014);
            if (readableMap.hasKey(r03)) {
                jq2.V((long) readableMap.getInt(r03));
            }
            String r04 = C0201.m82(16015);
            if (readableMap.hasKey(r04)) {
                jq2.Y(q.b(readableMap.getDouble(r04)));
            }
            String r05 = C0201.m82(16016);
            if (readableMap.hasKey(r05)) {
                jq2.Z(q.b(readableMap.getDouble(r05)));
            }
            String r06 = C0201.m82(16017);
            if (readableMap.hasKey(r06)) {
                jq2.W(q.b(readableMap.getDouble(r06)));
            }
            String r07 = C0201.m82(16018);
            if (readableMap.hasKey(r07)) {
                jq2.a0(readableMap.getInt(r07));
            }
        }

        /* renamed from: g */
        public jq2 c(Context context) {
            return new jq2();
        }

        /* renamed from: h */
        public void a(jq2 jq2, WritableMap writableMap) {
            super.a(jq2, writableMap);
            writableMap.putDouble(C0201.m82(16019), (double) q.a(jq2.m()));
            writableMap.putDouble(C0201.m82(16020), (double) q.a(jq2.n()));
            writableMap.putDouble(C0201.m82(16021), (double) q.a(jq2.k()));
            writableMap.putDouble(C0201.m82(16022), (double) q.a(jq2.l()));
        }

        public /* synthetic */ j(a aVar) {
            this();
        }
    }

    static {
        C0201.m83(RNGestureHandlerModule.class, 255);
    }

    public RNGestureHandlerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private d findFactoryForHandler(wp2 wp2) {
        int i2 = 0;
        while (true) {
            d[] dVarArr = this.mHandlerFactories;
            if (i2 >= dVarArr.length) {
                return null;
            }
            d dVar = dVarArr[i2];
            if (dVar.e().equals(wp2.getClass())) {
                return dVar;
            }
            i2++;
        }
    }

    private g findRootHelperForViewAncestor(int i2) {
        int resolveRootTagFromReactTag = ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).resolveRootTagFromReactTag(i2);
        if (resolveRootTagFromReactTag < 1) {
            return null;
        }
        synchronized (this.mRoots) {
            for (int i3 = 0; i3 < this.mRoots.size(); i3++) {
                g gVar = this.mRoots.get(i3);
                ViewGroup f2 = gVar.f();
                if ((f2 instanceof zi0) && ((zi0) f2).getRootViewTag() == resolveRootTagFromReactTag) {
                    return gVar;
                }
            }
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static void handleHitSlopProperty(wp2 wp2, ReadableMap readableMap) {
        float f2;
        float f3;
        float f4;
        float f5;
        String r0 = C0201.m82(12025);
        if (readableMap.getType(r0) == ReadableType.Number) {
            float b2 = q.b(readableMap.getDouble(r0));
            wp2.I(b2, b2, b2, b2, Float.NaN, Float.NaN);
            return;
        }
        ReadableMap map = readableMap.getMap(r0);
        String r02 = C0201.m82(12026);
        if (map.hasKey(r02)) {
            f3 = q.b(map.getDouble(r02));
            f2 = f3;
        } else {
            f3 = Float.NaN;
            f2 = Float.NaN;
        }
        String r3 = C0201.m82(12027);
        if (map.hasKey(r3)) {
            f5 = q.b(map.getDouble(r3));
            f4 = f5;
        } else {
            f5 = Float.NaN;
            f4 = Float.NaN;
        }
        String r5 = C0201.m82(12028);
        if (map.hasKey(r5)) {
            f3 = q.b(map.getDouble(r5));
        }
        String r03 = C0201.m82(12029);
        if (map.hasKey(r03)) {
            f5 = q.b(map.getDouble(r03));
        }
        String r04 = C0201.m82(12030);
        if (map.hasKey(r04)) {
            f2 = q.b(map.getDouble(r04));
        }
        String r05 = C0201.m82(12031);
        if (map.hasKey(r05)) {
            f4 = q.b(map.getDouble(r05));
        }
        String r06 = C0201.m82(12032);
        float b3 = map.hasKey(r06) ? q.b(map.getDouble(r06)) : Float.NaN;
        String r07 = C0201.m82(12033);
        wp2.I(f3, f5, f2, f4, b3, map.hasKey(r07) ? q.b(map.getDouble(r07)) : Float.NaN);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void onStateChange(wp2 wp2, int i2, int i3) {
        if (wp2.q() >= 0) {
            ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).getEventDispatcher().v(i.n(wp2, i2, i3, findFactoryForHandler(wp2)));
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void onTouchEvent(wp2 wp2, MotionEvent motionEvent) {
        if (wp2.q() >= 0 && wp2.p() == 4) {
            ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).getEventDispatcher().v(b.n(wp2, findFactoryForHandler(wp2)));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        r7 = r6.mEnqueuedRootViewInit;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        monitor-enter(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004a, code lost:
        if (r6.mEnqueuedRootViewInit.contains(java.lang.Integer.valueOf(r1)) == false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004c, code lost:
        monitor-exit(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004e, code lost:
        r6.mEnqueuedRootViewInit.add(java.lang.Integer.valueOf(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0057, code lost:
        monitor-exit(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0058, code lost:
        r0.addUIBlock(new com.swmansion.gesturehandler.react.RNGestureHandlerModule.b(r6, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0060, code lost:
        return;
     */
    private void tryInitializeHandlerForReactRootView(int i2) {
        UIManagerModule uIManagerModule = (UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class);
        int resolveRootTagFromReactTag = uIManagerModule.resolveRootTagFromReactTag(i2);
        if (resolveRootTagFromReactTag >= 1) {
            synchronized (this.mRoots) {
                for (int i3 = 0; i3 < this.mRoots.size(); i3++) {
                    ViewGroup f2 = this.mRoots.get(i3).f();
                    if ((f2 instanceof zi0) && ((zi0) f2).getRootViewTag() == resolveRootTagFromReactTag) {
                        return;
                    }
                }
            }
        } else {
            throw new JSApplicationIllegalArgumentException(C0201.m82(12034) + i2);
        }
    }

    @ReactMethod
    public void attachGestureHandler(int i2, int i3) {
        tryInitializeHandlerForReactRootView(i3);
        if (!this.mRegistry.b(i2, i3)) {
            throw new JSApplicationIllegalArgumentException(C0201.m82(12035) + i2 + C0201.m82(12036));
        }
    }

    @ReactMethod
    public void createGestureHandler(String str, int i2, ReadableMap readableMap) {
        int i3 = 0;
        while (true) {
            d[] dVarArr = this.mHandlerFactories;
            if (i3 < dVarArr.length) {
                d dVar = dVarArr[i3];
                if (dVar.d().equals(str)) {
                    wp2 c2 = dVar.c(getReactApplicationContext());
                    c2.M(i2);
                    c2.K(this.mEventListener);
                    this.mRegistry.h(c2);
                    this.mInteractionManager.e(c2, readableMap);
                    dVar.b(c2, readableMap);
                    return;
                }
                i3++;
            } else {
                throw new JSApplicationIllegalArgumentException(C0201.m82(12037) + str);
            }
        }
    }

    @ReactMethod
    public void dropGestureHandler(int i2) {
        this.mInteractionManager.g(i2);
        this.mRegistry.e(i2);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map getConstants() {
        return com.facebook.react.common.e.e(C0201.m82(12048), com.facebook.react.common.e.i(C0201.m82(12038), 0, C0201.m82(12039), 2, C0201.m82(12040), 4, C0201.m82(12041), 3, C0201.m82(12042), 1, C0201.m82(12043), 5), C0201.m82(12049), com.facebook.react.common.e.g(C0201.m82(12044), 1, C0201.m82(12045), 2, C0201.m82(12046), 4, C0201.m82(12047), 8));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(12050);
    }

    public f getRegistry() {
        return this.mRegistry;
    }

    @ReactMethod
    public void handleClearJSResponder() {
    }

    @ReactMethod
    public void handleSetJSResponder(int i2, boolean z) {
        g findRootHelperForViewAncestor;
        if (this.mRegistry != null && (findRootHelperForViewAncestor = findRootHelperForViewAncestor(i2)) != null) {
            findRootHelperForViewAncestor.g(i2, z);
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.mRegistry.d();
        this.mInteractionManager.h();
        synchronized (this.mRoots) {
            while (!this.mRoots.isEmpty()) {
                int size = this.mRoots.size();
                g gVar = this.mRoots.get(0);
                ViewGroup f2 = gVar.f();
                if (f2 instanceof a) {
                    ((a) f2).w();
                } else {
                    gVar.i();
                }
                if (this.mRoots.size() >= size) {
                    throw new IllegalStateException(C0201.m82(12051));
                }
            }
        }
        super.onCatalystInstanceDestroy();
    }

    public void registerRootHelper(g gVar) {
        synchronized (this.mRoots) {
            if (!this.mRoots.contains(gVar)) {
                this.mRoots.add(gVar);
            } else {
                throw new IllegalStateException(C0201.m82(12052) + gVar + C0201.m82(12053));
            }
        }
    }

    public void unregisterRootHelper(g gVar) {
        synchronized (this.mRoots) {
            this.mRoots.remove(gVar);
        }
    }

    @ReactMethod
    public void updateGestureHandler(int i2, ReadableMap readableMap) {
        d findFactoryForHandler;
        wp2 f2 = this.mRegistry.f(i2);
        if (f2 != null && (findFactoryForHandler = findFactoryForHandler(f2)) != null) {
            this.mInteractionManager.g(i2);
            this.mInteractionManager.e(f2, readableMap);
            findFactoryForHandler.b(f2, readableMap);
        }
    }
}
