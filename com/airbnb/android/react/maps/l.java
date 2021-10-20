package com.airbnb.android.react.maps;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.location.Location;
import android.os.Build;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.k0;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.c;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.a0;
import com.google.android.gms.maps.model.r;
import com.google.android.gms.maps.model.s;
import com.google.android.gms.maps.model.u;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import org.xmlpull.v1.XmlPullParserException;
import vigqyno.C0201;

/* compiled from: AirMapView */
public class l extends com.google.android.gms.maps.e implements c.b, c.m, com.google.android.gms.maps.g, c.o, c.g {
    private static final String[] M = {C0201.m82(37172), C0201.m82(37173)};
    public static final String N = null;
    public static final String O = null;
    public static final String P = null;
    public static final String Q = null;
    public static final String a = null;
    public static final String r = null;
    public static final String s = null;
    public static final String t = null;
    private final Map<com.google.android.gms.maps.model.j, h> A = new HashMap();
    private final Map<a0, e> B = new HashMap();
    private final Map<a0, d> C = new HashMap();
    private final t2 D;
    private final AirMapManager E;
    private LifecycleEventListener F;
    private boolean G = false;
    private boolean H = false;
    private final k0 I;
    private final com.facebook.react.uimanager.events.d J;
    private o K;
    private v L;
    public com.google.android.gms.maps.c b;
    private n52 c;
    private ProgressBar d;
    private RelativeLayout e;
    private ImageView f;
    private Boolean g = Boolean.FALSE;
    private Integer h = null;
    private Integer i = null;
    private LatLngBounds j;
    private com.google.android.gms.maps.a k;
    private boolean l = false;
    private boolean m = false;
    private boolean n = true;
    private boolean o = false;
    private boolean p = false;
    private boolean q = false;
    private LatLngBounds u;
    private int v = 0;
    private final List<c> w = new ArrayList();
    private final Map<com.google.android.gms.maps.model.o, g> x = new HashMap();
    private final Map<u, j> y = new HashMap();
    private final Map<s, i> z = new HashMap();

    /* compiled from: AirMapView */
    class a implements c.f {
        public a() {
        }

        @Override // com.google.android.gms.maps.c.f
        public void a(com.google.android.gms.maps.model.j jVar) {
            WritableMap a0 = l.this.a0(jVar.a());
            a0.putString(C0201.m82(15938), C0201.m82(15939));
            l.this.E.pushEvent(l.this.I, (View) l.this.A.get(jVar), C0201.m82(15940), a0);
        }
    }

    /* compiled from: AirMapView */
    class b implements c.e {
        public b() {
        }

        @Override // com.google.android.gms.maps.c.e
        public void onCameraMoveStarted(int i) {
            l.this.v = i;
        }
    }

    /* compiled from: AirMapView */
    class c implements c.d {
        public final /* synthetic */ com.google.android.gms.maps.c a;

        public c(com.google.android.gms.maps.c cVar) {
            this.a = cVar;
        }

        @Override // com.google.android.gms.maps.c.d
        public void onCameraMove() {
            LatLngBounds latLngBounds = this.a.k().b().e;
            l.this.u = null;
            l.this.J.v(new t(l.this.getId(), latLngBounds, true, 1 == l.this.v));
        }
    }

    /* compiled from: AirMapView */
    class d implements c.AbstractC0062c {
        public final /* synthetic */ com.google.android.gms.maps.c a;

        public d(com.google.android.gms.maps.c cVar) {
            this.a = cVar;
        }

        @Override // com.google.android.gms.maps.c.AbstractC0062c
        public void onCameraIdle() {
            LatLngBounds latLngBounds = this.a.k().b().e;
            if (l.this.v == 0) {
                return;
            }
            if (l.this.u == null || r.a(latLngBounds, l.this.u)) {
                l.this.u = latLngBounds;
                boolean z = true;
                if (1 != l.this.v) {
                    z = false;
                }
                l.this.J.v(new t(l.this.getId(), latLngBounds, false, z));
            }
        }
    }

    /* compiled from: AirMapView */
    class e implements c.j {
        public final /* synthetic */ l a;

        public e(l lVar) {
            this.a = lVar;
        }

        @Override // com.google.android.gms.maps.c.j
        public void onMapLoaded() {
            l.this.g = Boolean.TRUE;
            l.this.E.pushEvent(l.this.I, this.a, C0201.m82(15690), new WritableNativeMap());
            l.this.P();
        }
    }

    /* compiled from: AirMapView */
    class f implements LifecycleEventListener {
        public final /* synthetic */ com.google.android.gms.maps.c a;

        public f(com.google.android.gms.maps.c cVar) {
            this.a = cVar;
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostDestroy() {
            l.this.R();
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostPause() {
            if (l.this.Z()) {
                this.a.w(false);
            }
            synchronized (l.this) {
                if (!l.this.H) {
                    l.this.l();
                }
                l.this.G = true;
            }
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostResume() {
            if (l.this.Z()) {
                this.a.w(l.this.l);
                this.a.r(l.this.K);
            }
            synchronized (l.this) {
                if (!l.this.H) {
                    l.this.m();
                }
                l.this.G = false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: AirMapView */
    public class g implements c.r {
        public final /* synthetic */ ImageView a;
        public final /* synthetic */ RelativeLayout b;

        public g(ImageView imageView, RelativeLayout relativeLayout) {
            this.a = imageView;
            this.b = relativeLayout;
        }

        @Override // com.google.android.gms.maps.c.r
        public void onSnapshotReady(Bitmap bitmap) {
            this.a.setImageBitmap(bitmap);
            this.a.setVisibility(0);
            this.b.setVisibility(4);
        }
    }

    /* compiled from: AirMapView */
    class h extends GestureDetector.SimpleOnGestureListener {
        public h() {
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            l.this.b0(motionEvent);
            return false;
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (!l.this.m) {
                return false;
            }
            l.this.c0(motionEvent2);
            return false;
        }
    }

    /* compiled from: AirMapView */
    class i implements View.OnLayoutChangeListener {
        public i() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (!l.this.G) {
                l.this.P();
            }
        }
    }

    /* compiled from: AirMapView */
    class j implements c.n {
        public final /* synthetic */ l a;

        public j(l lVar) {
            this.a = lVar;
        }

        @Override // com.google.android.gms.maps.c.n
        public void a(Location location) {
            WritableMap writableNativeMap = new WritableNativeMap();
            WritableNativeMap writableNativeMap2 = new WritableNativeMap();
            writableNativeMap2.putDouble(C0201.m82(15396), location.getLatitude());
            writableNativeMap2.putDouble(C0201.m82(15397), location.getLongitude());
            writableNativeMap2.putDouble(C0201.m82(15398), location.getAltitude());
            writableNativeMap2.putDouble(C0201.m82(15399), (double) location.getTime());
            writableNativeMap2.putDouble(C0201.m82(15400), (double) location.getAccuracy());
            writableNativeMap2.putDouble(C0201.m82(15401), (double) location.getSpeed());
            writableNativeMap2.putDouble(C0201.m82(15402), (double) location.getBearing());
            if (Build.VERSION.SDK_INT >= 18) {
                writableNativeMap2.putBoolean(C0201.m82(15403), location.isFromMockProvider());
            }
            writableNativeMap.putMap(C0201.m82(15404), writableNativeMap2);
            l.this.E.pushEvent(l.this.I, this.a, C0201.m82(15405), writableNativeMap);
        }
    }

    /* compiled from: AirMapView */
    class k implements c.l {
        public final /* synthetic */ l a;

        public k(l lVar) {
            this.a = lVar;
        }

        @Override // com.google.android.gms.maps.c.l
        public boolean a(com.google.android.gms.maps.model.o oVar) {
            g X = l.this.X(oVar);
            WritableMap a0 = l.this.a0(oVar.a());
            String r2 = C0201.m82(15505);
            String r3 = C0201.m82(15506);
            a0.putString(r2, r3);
            String identifier = X.getIdentifier();
            String r5 = C0201.m82(15507);
            a0.putString(r5, identifier);
            l.this.E.pushEvent(l.this.I, this.a, C0201.m82(15508), a0);
            WritableMap a02 = l.this.a0(oVar.a());
            a02.putString(r2, r3);
            a02.putString(r5, X.getIdentifier());
            l.this.E.pushEvent(l.this.I, X, C0201.m82(15509), a02);
            if (this.a.n) {
                return false;
            }
            oVar.r();
            return true;
        }
    }

    /* renamed from: com.airbnb.android.react.maps.l$l  reason: collision with other inner class name */
    /* compiled from: AirMapView */
    class C0032l implements c.p {
        public C0032l() {
        }

        @Override // com.google.android.gms.maps.c.p
        public void a(s sVar) {
            WritableMap a0 = l.this.a0(sVar.a().get(0));
            a0.putString(C0201.m82(15443), C0201.m82(15444));
            l.this.E.pushEvent(l.this.I, (View) l.this.z.get(sVar), C0201.m82(15445), a0);
        }
    }

    /* compiled from: AirMapView */
    class m implements c.q {
        public m() {
        }

        @Override // com.google.android.gms.maps.c.q
        public void a(u uVar) {
            WritableMap a0 = l.this.a0(uVar.a().get(0));
            a0.putString(C0201.m82(15140), C0201.m82(15141));
            l.this.E.pushEvent(l.this.I, (View) l.this.y.get(uVar), C0201.m82(15142), a0);
        }
    }

    /* compiled from: AirMapView */
    class n implements c.h {
        public final /* synthetic */ l a;

        public n(l lVar) {
            this.a = lVar;
        }

        @Override // com.google.android.gms.maps.c.h
        public void a(com.google.android.gms.maps.model.o oVar) {
            WritableMap a0 = l.this.a0(oVar.a());
            String r1 = C0201.m82(15125);
            String r2 = C0201.m82(15126);
            a0.putString(r1, r2);
            AirMapManager airMapManager = l.this.E;
            k0 k0Var = l.this.I;
            l lVar = this.a;
            String r6 = C0201.m82(15127);
            airMapManager.pushEvent(k0Var, lVar, r6, a0);
            WritableMap a02 = l.this.a0(oVar.a());
            a02.putString(r1, r2);
            g X = l.this.X(oVar);
            l.this.E.pushEvent(l.this.I, X, r6, a02);
            WritableMap a03 = l.this.a0(oVar.a());
            a03.putString(r1, r2);
            a calloutView = X.getCalloutView();
            if (calloutView != null) {
                l.this.E.pushEvent(l.this.I, calloutView, C0201.m82(15128), a03);
            }
        }
    }

    /* compiled from: AirMapView */
    class o implements c.i {
        public final /* synthetic */ l a;

        public o(l lVar) {
            this.a = lVar;
        }

        @Override // com.google.android.gms.maps.c.i
        public void j(LatLng latLng) {
            WritableMap a0 = l.this.a0(latLng);
            a0.putString(C0201.m82(15265), C0201.m82(15266));
            l.this.E.pushEvent(l.this.I, this.a, C0201.m82(15267), a0);
        }
    }

    /* compiled from: AirMapView */
    class p implements c.k {
        public final /* synthetic */ l a;

        public p(l lVar) {
            this.a = lVar;
        }

        @Override // com.google.android.gms.maps.c.k
        public void h(LatLng latLng) {
            l.this.a0(latLng).putString(C0201.m82(15233), C0201.m82(15234));
            l.this.E.pushEvent(l.this.I, this.a, C0201.m82(15235), l.this.a0(latLng));
        }
    }

    static {
        C0201.m83(l.class, 115);
    }

    public l(k0 k0Var, ReactApplicationContext reactApplicationContext, AirMapManager airMapManager, GoogleMapOptions googleMapOptions) {
        super(Y(k0Var, reactApplicationContext), googleMapOptions);
        this.E = airMapManager;
        this.I = k0Var;
        super.j(null);
        super.m();
        super.i(this);
        this.K = new o(this.I);
        this.D = new t2(k0Var, new h());
        addOnLayoutChangeListener(new i());
        this.J = ((UIManagerModule) k0Var.getNativeModule(UIManagerModule.class)).getEventDispatcher();
        this.L = new v(this.I);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, 0);
        layoutParams.width = 0;
        layoutParams.height = 0;
        layoutParams.leftMargin = 99999999;
        layoutParams.topMargin = 99999999;
        this.L.setLayoutParams(layoutParams);
        addView(this.L);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void P() {
        if (this.o) {
            ImageView cacheImageView = getCacheImageView();
            RelativeLayout mapLoadingLayoutView = getMapLoadingLayoutView();
            cacheImageView.setVisibility(4);
            mapLoadingLayoutView.setVisibility(0);
            if (this.g.booleanValue()) {
                this.b.O(new g(cacheImageView, mapLoadingLayoutView));
                return;
            }
            return;
        }
        d0();
        if (this.g.booleanValue()) {
            f0();
        }
    }

    private static boolean Q(Context context) {
        return context == null || context.getResources() == null || context.getResources().getConfiguration() == null;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private g X(com.google.android.gms.maps.model.o oVar) {
        g gVar = this.x.get(oVar);
        if (gVar != null) {
            return gVar;
        }
        for (Map.Entry<com.google.android.gms.maps.model.o, g> entry : this.x.entrySet()) {
            if (entry.getKey().a().equals(oVar.a()) && entry.getKey().c().equals(oVar.c())) {
                return entry.getValue();
            }
        }
        return gVar;
    }

    private static Context Y(k0 k0Var, ReactApplicationContext reactApplicationContext) {
        if (!Q(reactApplicationContext.getCurrentActivity())) {
            return reactApplicationContext.getCurrentActivity();
        }
        if (!Q(k0Var)) {
            return k0Var;
        }
        if (!Q(k0Var.getCurrentActivity())) {
            return k0Var.getCurrentActivity();
        }
        return !Q(k0Var.getApplicationContext()) ? k0Var.getApplicationContext() : k0Var;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private boolean Z() {
        if (androidx.core.content.c.c(getContext(), M[0]) == 0 || androidx.core.content.c.c(getContext(), M[1]) == 0) {
            return true;
        }
        return false;
    }

    private void d0() {
        ImageView imageView = this.f;
        if (imageView != null) {
            ((ViewGroup) imageView.getParent()).removeView(this.f);
            this.f = null;
        }
    }

    private void f0() {
        g0();
        RelativeLayout relativeLayout = this.e;
        if (relativeLayout != null) {
            ((ViewGroup) relativeLayout.getParent()).removeView(this.e);
            this.e = null;
        }
    }

    private void g0() {
        ProgressBar progressBar = this.d;
        if (progressBar != null) {
            ((ViewGroup) progressBar.getParent()).removeView(this.d);
            this.d = null;
        }
    }

    private ImageView getCacheImageView() {
        if (this.f == null) {
            ImageView imageView = new ImageView(getContext());
            this.f = imageView;
            addView(imageView, new ViewGroup.LayoutParams(-1, -1));
            this.f.setVisibility(4);
        }
        return this.f;
    }

    private RelativeLayout getMapLoadingLayoutView() {
        if (this.e == null) {
            RelativeLayout relativeLayout = new RelativeLayout(getContext());
            this.e = relativeLayout;
            relativeLayout.setBackgroundColor(-3355444);
            addView(this.e, new ViewGroup.LayoutParams(-1, -1));
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            this.e.addView(getMapLoadingProgressBar(), layoutParams);
            this.e.setVisibility(4);
        }
        setLoadingBackgroundColor(this.h);
        return this.e;
    }

    private ProgressBar getMapLoadingProgressBar() {
        if (this.d == null) {
            ProgressBar progressBar = new ProgressBar(getContext());
            this.d = progressBar;
            progressBar.setIndeterminate(true);
        }
        Integer num = this.i;
        if (num != null) {
            setLoadingIndicatorColor(num);
        }
        return this.d;
    }

    public void I(View view, int i2) {
        if (view instanceof g) {
            g gVar = (g) view;
            gVar.n(this.b);
            this.w.add(i2, gVar);
            int visibility = gVar.getVisibility();
            gVar.setVisibility(4);
            ViewGroup viewGroup = (ViewGroup) gVar.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(gVar);
            }
            this.L.addView(gVar);
            gVar.setVisibility(visibility);
            this.x.put((com.google.android.gms.maps.model.o) gVar.getFeature(), gVar);
        } else if (view instanceof j) {
            j jVar = (j) view;
            jVar.f(this.b);
            this.w.add(i2, jVar);
            this.y.put((u) jVar.getFeature(), jVar);
        } else if (view instanceof d) {
            d dVar = (d) view;
            dVar.f(this.b);
            this.w.add(i2, dVar);
            this.C.put((a0) dVar.getFeature(), dVar);
        } else if (view instanceof i) {
            i iVar = (i) view;
            iVar.f(this.b);
            this.w.add(i2, iVar);
            this.z.put((s) iVar.getFeature(), iVar);
        } else if (view instanceof b) {
            b bVar = (b) view;
            bVar.f(this.b);
            this.w.add(i2, bVar);
        } else if (view instanceof k) {
            k kVar = (k) view;
            kVar.j(this.b);
            this.w.add(i2, kVar);
        } else if (view instanceof m) {
            m mVar = (m) view;
            mVar.j(this.b);
            this.w.add(i2, mVar);
        } else if (view instanceof f) {
            f fVar = (f) view;
            fVar.f(this.b);
            this.w.add(i2, fVar);
        } else if (view instanceof h) {
            h hVar = (h) view;
            hVar.f(this.b);
            this.w.add(i2, hVar);
            this.A.put((com.google.android.gms.maps.model.j) hVar.getFeature(), hVar);
        } else if (view instanceof e) {
            e eVar = (e) view;
            eVar.f(this.b);
            this.w.add(i2, eVar);
            this.B.put((a0) eVar.getFeature(), eVar);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup2.getChildCount(); i3++) {
                I(viewGroup2.getChildAt(i3), i2);
            }
        } else {
            addView(view, i2);
        }
    }

    public void J(float f2, int i2) {
        com.google.android.gms.maps.c cVar = this.b;
        if (cVar != null) {
            CameraPosition.a aVar = new CameraPosition.a(cVar.i());
            aVar.a(f2);
            this.b.h(com.google.android.gms.maps.b.a(aVar.b()), i2, null);
        }
    }

    public void K(ReadableMap readableMap, int i2) {
        com.google.android.gms.maps.c cVar = this.b;
        if (cVar != null) {
            CameraPosition.a aVar = new CameraPosition.a(cVar.i());
            String r0 = C0201.m82(37174);
            if (readableMap.hasKey(r0)) {
                aVar.e((float) readableMap.getDouble(r0));
            }
            String r02 = C0201.m82(37175);
            if (readableMap.hasKey(r02)) {
                aVar.a((float) readableMap.getDouble(r02));
            }
            String r03 = C0201.m82(37176);
            if (readableMap.hasKey(r03)) {
                aVar.d((float) readableMap.getDouble(r03));
            }
            String r04 = C0201.m82(37177);
            if (readableMap.hasKey(r04)) {
                ReadableMap map = readableMap.getMap(r04);
                aVar.c(new LatLng(map.getDouble(C0201.m82(37178)), map.getDouble(C0201.m82(37179))));
            }
            com.google.android.gms.maps.a a2 = com.google.android.gms.maps.b.a(aVar.b());
            if (i2 <= 0) {
                this.b.m(a2);
            } else {
                this.b.h(a2, i2, null);
            }
        }
    }

    public void L(LatLng latLng, int i2) {
        com.google.android.gms.maps.c cVar = this.b;
        if (cVar != null) {
            cVar.h(com.google.android.gms.maps.b.b(latLng), i2, null);
        }
    }

    public void M(LatLng latLng, float f2, float f3, int i2) {
        com.google.android.gms.maps.c cVar = this.b;
        if (cVar != null) {
            CameraPosition.a aVar = new CameraPosition.a(cVar.i());
            aVar.a(f2);
            aVar.d(f3);
            aVar.c(latLng);
            this.b.h(com.google.android.gms.maps.b.a(aVar.b()), i2, null);
        }
    }

    public void N(LatLngBounds latLngBounds, int i2) {
        com.google.android.gms.maps.c cVar = this.b;
        if (cVar != null) {
            cVar.h(com.google.android.gms.maps.b.c(latLngBounds, 0), i2, null);
        }
    }

    public void O(float f2, int i2) {
        com.google.android.gms.maps.c cVar = this.b;
        if (cVar != null) {
            CameraPosition.a aVar = new CameraPosition.a(cVar.i());
            aVar.d(f2);
            this.b.h(com.google.android.gms.maps.b.a(aVar.b()), i2, null);
        }
    }

    public synchronized void R() {
        if (!this.H) {
            this.H = true;
            if (!(this.F == null || this.I == null)) {
                this.I.removeLifecycleEventListener(this.F);
                this.F = null;
            }
            if (!this.G) {
                l();
                this.G = true;
            }
            k();
        }
    }

    public void S(boolean z2) {
        if (z2 && !this.g.booleanValue()) {
            getMapLoadingLayoutView().setVisibility(0);
        }
    }

    public void T(ReadableArray readableArray, ReadableMap readableMap, boolean z2) {
        if (this.b != null) {
            LatLngBounds.a aVar = new LatLngBounds.a();
            for (int i2 = 0; i2 < readableArray.size(); i2++) {
                ReadableMap map = readableArray.getMap(i2);
                aVar.b(new LatLng(Double.valueOf(map.getDouble(C0201.m82(37180))).doubleValue(), Double.valueOf(map.getDouble(C0201.m82(37181))).doubleValue()));
            }
            com.google.android.gms.maps.a c2 = com.google.android.gms.maps.b.c(aVar.a(), 50);
            if (readableMap != null) {
                this.b.M(readableMap.getInt(C0201.m82(37182)), readableMap.getInt(C0201.m82(37183)), readableMap.getInt(C0201.m82(37184)), readableMap.getInt(C0201.m82(37185)));
            }
            if (z2) {
                this.b.g(c2);
            } else {
                this.b.m(c2);
            }
            this.b.M(0, 0, 0, 0);
        }
    }

    public void U(boolean z2) {
        if (this.b != null) {
            LatLngBounds.a aVar = new LatLngBounds.a();
            boolean z3 = false;
            for (c cVar : this.w) {
                if (cVar instanceof g) {
                    aVar.b(((com.google.android.gms.maps.model.o) cVar.getFeature()).a());
                    z3 = true;
                }
            }
            if (z3) {
                com.google.android.gms.maps.a c2 = com.google.android.gms.maps.b.c(aVar.a(), 50);
                if (z2) {
                    this.b.g(c2);
                } else {
                    this.b.m(c2);
                }
            }
        }
    }

    public void V(ReadableArray readableArray, ReadableMap readableMap, boolean z2) {
        if (this.b != null) {
            LatLngBounds.a aVar = new LatLngBounds.a();
            String[] strArr = new String[readableArray.size()];
            boolean z3 = false;
            for (int i2 = 0; i2 < readableArray.size(); i2++) {
                strArr[i2] = readableArray.getString(i2);
            }
            List asList = Arrays.asList(strArr);
            for (c cVar : this.w) {
                if (cVar instanceof g) {
                    String identifier = ((g) cVar).getIdentifier();
                    com.google.android.gms.maps.model.o oVar = (com.google.android.gms.maps.model.o) cVar.getFeature();
                    if (asList.contains(identifier)) {
                        aVar.b(oVar.a());
                        z3 = true;
                    }
                }
            }
            if (z3) {
                com.google.android.gms.maps.a c2 = com.google.android.gms.maps.b.c(aVar.a(), 50);
                if (readableMap != null) {
                    this.b.M(readableMap.getInt(C0201.m82(37186)), readableMap.getInt(C0201.m82(37187)), readableMap.getInt(C0201.m82(37188)), readableMap.getInt(C0201.m82(37189)));
                }
                if (z2) {
                    this.b.g(c2);
                } else {
                    this.b.m(c2);
                }
            }
        }
    }

    public View W(int i2) {
        return this.w.get(i2);
    }

    @Override // com.google.android.gms.maps.c.b
    public View a(com.google.android.gms.maps.model.o oVar) {
        return X(oVar).getInfoContents();
    }

    public WritableMap a0(LatLng latLng) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        WritableNativeMap writableNativeMap2 = new WritableNativeMap();
        writableNativeMap2.putDouble(C0201.m82(37190), latLng.a);
        writableNativeMap2.putDouble(C0201.m82(37191), latLng.b);
        writableNativeMap.putMap(C0201.m82(37192), writableNativeMap2);
        Point c2 = this.b.k().c(latLng);
        WritableNativeMap writableNativeMap3 = new WritableNativeMap();
        writableNativeMap3.putDouble(C0201.m82(37193), (double) c2.x);
        writableNativeMap3.putDouble(C0201.m82(37194), (double) c2.y);
        writableNativeMap.putMap(C0201.m82(37195), writableNativeMap3);
        return writableNativeMap;
    }

    @Override // com.google.android.gms.maps.c.m
    public void b(com.google.android.gms.maps.model.o oVar) {
        this.E.pushEvent(this.I, this, C0201.m82(37196), a0(oVar.a()));
        this.E.pushEvent(this.I, X(oVar), C0201.m82(37197), a0(oVar.a()));
    }

    public void b0(MotionEvent motionEvent) {
        this.E.pushEvent(this.I, this, C0201.m82(37198), a0(this.b.k().a(new Point((int) motionEvent.getX(), (int) motionEvent.getY()))));
    }

    @Override // com.google.android.gms.maps.c.m
    public void c(com.google.android.gms.maps.model.o oVar) {
        this.E.pushEvent(this.I, this, C0201.m82(37199), a0(oVar.a()));
        this.E.pushEvent(this.I, X(oVar), C0201.m82(37200), a0(oVar.a()));
    }

    public void c0(MotionEvent motionEvent) {
        this.E.pushEvent(this.I, this, C0201.m82(37201), a0(this.b.k().a(new Point((int) motionEvent.getX(), (int) motionEvent.getY()))));
    }

    @Override // com.google.android.gms.maps.c.b
    public View d(com.google.android.gms.maps.model.o oVar) {
        return X(oVar).getCallout();
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.D.a(motionEvent);
        int c2 = z2.c(motionEvent);
        boolean z2 = false;
        if (c2 == 0) {
            ViewParent parent = getParent();
            com.google.android.gms.maps.c cVar = this.b;
            if (cVar != null && cVar.l().a()) {
                z2 = true;
            }
            parent.requestDisallowInterceptTouchEvent(z2);
        } else if (c2 == 1) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    @Override // com.google.android.gms.maps.c.o
    public void e(r rVar) {
        WritableMap a0 = a0(rVar.a);
        a0.putString(C0201.m82(37202), rVar.b);
        a0.putString(C0201.m82(37203), rVar.c);
        this.E.pushEvent(this.I, this, C0201.m82(37204), a0);
    }

    public void e0(int i2) {
        c remove = this.w.remove(i2);
        if (remove instanceof g) {
            this.x.remove(remove.getFeature());
        } else if (remove instanceof e) {
            this.B.remove(remove.getFeature());
        }
        remove.e(this.b);
    }

    @Override // com.google.android.gms.maps.c.m
    public void f(com.google.android.gms.maps.model.o oVar) {
        this.E.pushEvent(this.I, this, C0201.m82(37205), a0(oVar.a()));
        this.E.pushEvent(this.I, X(oVar), C0201.m82(37206), a0(oVar.a()));
    }

    @Override // com.google.android.gms.maps.g
    public void g(com.google.android.gms.maps.c cVar) {
        if (!this.H) {
            this.b = cVar;
            cVar.p(this);
            this.b.H(this);
            this.b.J(this);
            this.b.B(this);
            this.E.pushEvent(this.I, this, C0201.m82(37207), new WritableNativeMap());
            cVar.I(new j(this));
            cVar.G(new k(this));
            cVar.K(new C0032l());
            cVar.L(new m());
            cVar.C(new n(this));
            cVar.D(new o(this));
            cVar.F(new p(this));
            cVar.A(new a());
            cVar.z(new b());
            cVar.y(new c(cVar));
            cVar.x(new d(cVar));
            cVar.E(new e(this));
            f fVar = new f(cVar);
            this.F = fVar;
            this.I.addLifecycleEventListener(fVar);
        }
    }

    public int getFeatureCount() {
        return this.w.size();
    }

    public double[][] getMapBoundaries() {
        LatLngBounds latLngBounds = this.b.k().b().e;
        LatLng latLng = latLngBounds.b;
        LatLng latLng2 = latLngBounds.a;
        return new double[][]{new double[]{latLng.b, latLng.a}, new double[]{latLng2.b, latLng2.a}};
    }

    @Override // com.google.android.gms.maps.c.g
    public void h(com.google.android.gms.maps.model.l lVar) {
        int a2;
        if (lVar != null && (a2 = lVar.a()) >= 0 && a2 < lVar.b().size()) {
            com.google.android.gms.maps.model.m mVar = lVar.b().get(a2);
            WritableMap createMap = Arguments.createMap();
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putInt(C0201.m82(37208), a2);
            createMap2.putString(C0201.m82(37209), mVar.b());
            createMap2.putString(C0201.m82(37210), mVar.c());
            createMap.putMap(C0201.m82(37211), createMap2);
            this.E.pushEvent(this.I, this, C0201.m82(37212), createMap);
        }
    }

    public void h0(ReadableMap readableMap, ReadableMap readableMap2) {
        if (this.b != null) {
            LatLngBounds.a aVar = new LatLngBounds.a();
            String r1 = C0201.m82(37213);
            Double valueOf = Double.valueOf(readableMap.getDouble(r1));
            String r3 = C0201.m82(37214);
            aVar.b(new LatLng(valueOf.doubleValue(), Double.valueOf(readableMap.getDouble(r3)).doubleValue()));
            aVar.b(new LatLng(Double.valueOf(readableMap2.getDouble(r1)).doubleValue(), Double.valueOf(readableMap2.getDouble(r3)).doubleValue()));
            this.b.q(aVar.a());
        }
    }

    public void i0(Object obj) {
        if (this.j != null) {
            HashMap hashMap = (HashMap) obj;
            String r0 = C0201.m82(37215);
            int intValue = hashMap.get(r0) == null ? 0 : ((Float) hashMap.get(r0)).intValue();
            String r2 = C0201.m82(37216);
            int intValue2 = hashMap.get(r2) == null ? 0 : ((Float) hashMap.get(r2)).intValue();
            if (intValue <= 0 || intValue2 <= 0) {
                this.b.m(com.google.android.gms.maps.b.c(this.j, 0));
            } else {
                this.b.m(com.google.android.gms.maps.b.d(this.j, intValue, intValue2, 0));
            }
            this.j = null;
            this.k = null;
            return;
        }
        com.google.android.gms.maps.a aVar = this.k;
        if (aVar != null) {
            this.b.m(aVar);
            this.k = null;
        }
    }

    @Override // com.google.android.gms.maps.c.g
    public void onIndoorBuildingFocused() {
        com.google.android.gms.maps.model.l j2 = this.b.j();
        String r1 = C0201.m82(37217);
        String r2 = C0201.m82(37218);
        String r3 = C0201.m82(37219);
        String r4 = C0201.m82(37220);
        String r5 = C0201.m82(37221);
        int i2 = 0;
        if (j2 != null) {
            List<com.google.android.gms.maps.model.m> b2 = j2.b();
            WritableArray createArray = Arguments.createArray();
            for (com.google.android.gms.maps.model.m mVar : b2) {
                WritableMap createMap = Arguments.createMap();
                createMap.putInt(C0201.m82(37222), i2);
                createMap.putString(C0201.m82(37223), mVar.b());
                createMap.putString(C0201.m82(37224), mVar.c());
                createArray.pushMap(createMap);
                i2++;
            }
            WritableMap createMap2 = Arguments.createMap();
            WritableMap createMap3 = Arguments.createMap();
            createMap3.putArray(r5, createArray);
            createMap3.putInt(r4, j2.a());
            createMap3.putBoolean(r3, j2.c());
            createMap2.putMap(r2, createMap3);
            this.E.pushEvent(this.I, this, r1, createMap2);
            return;
        }
        WritableMap createMap4 = Arguments.createMap();
        WritableArray createArray2 = Arguments.createArray();
        WritableMap createMap5 = Arguments.createMap();
        createMap5.putArray(r5, createArray2);
        createMap5.putInt(r4, 0);
        createMap5.putBoolean(r3, false);
        createMap4.putMap(r2, createMap5);
        this.E.pushEvent(this.I, this, r1, createMap4);
    }

    public void setCacheEnabled(boolean z2) {
        this.o = z2;
        P();
    }

    public void setCamera(ReadableMap readableMap) {
        if (readableMap != null) {
            CameraPosition.a aVar = new CameraPosition.a();
            ReadableMap map = readableMap.getMap(C0201.m82(37225));
            if (map != null) {
                aVar.c(new LatLng(Double.valueOf(map.getDouble(C0201.m82(37227))).doubleValue(), Double.valueOf(map.getDouble(C0201.m82(37226))).doubleValue()));
            }
            aVar.d((float) readableMap.getDouble(C0201.m82(37228)));
            aVar.a((float) readableMap.getDouble(C0201.m82(37229)));
            aVar.e((float) readableMap.getInt(C0201.m82(37230)));
            com.google.android.gms.maps.a a2 = com.google.android.gms.maps.b.a(aVar.b());
            if (super.getHeight() <= 0 || super.getWidth() <= 0) {
                this.k = a2;
                return;
            }
            this.b.m(a2);
            this.k = null;
        }
    }

    public void setHandlePanDrag(boolean z2) {
        this.m = z2;
    }

    public void setIndoorActiveLevelIndex(int i2) {
        com.google.android.gms.maps.model.m mVar;
        com.google.android.gms.maps.model.l j2 = this.b.j();
        if (j2 != null && i2 >= 0 && i2 < j2.b().size() && (mVar = j2.b().get(i2)) != null) {
            mVar.a();
        }
    }

    public void setInitialCamera(ReadableMap readableMap) {
        if (!this.q && readableMap != null) {
            setCamera(readableMap);
            this.q = true;
        }
    }

    public void setInitialRegion(ReadableMap readableMap) {
        if (!this.p && readableMap != null) {
            setRegion(readableMap);
            this.p = true;
        }
    }

    public void setKmlSrc(String str) {
        String str2 = O;
        String str3 = a;
        try {
            InputStream inputStream = (InputStream) new n(this.I).execute(str).get();
            if (inputStream != null) {
                n52 n52 = new n52(this.b, inputStream, this.I);
                this.c = n52;
                n52.d();
                WritableMap writableNativeMap = new WritableNativeMap();
                WritableNativeArray writableNativeArray = new WritableNativeArray();
                Iterable<j52> b2 = this.c.b();
                String str4 = r;
                if (b2 == null) {
                    this.E.pushEvent(this.I, this, str4, writableNativeMap);
                    return;
                }
                j52 next = this.c.b().iterator().next();
                if (next == null || next.a() == null) {
                    this.E.pushEvent(this.I, this, str4, writableNativeMap);
                    return;
                }
                if (next.a().iterator().hasNext()) {
                    next = next.a().iterator().next();
                }
                Integer num = 0;
                for (r52 r52 : next.c()) {
                    com.google.android.gms.maps.model.p pVar = new com.google.android.gms.maps.model.p();
                    if (r52.g() != null) {
                        pVar = r52.h();
                    } else {
                        pVar.Q(com.google.android.gms.maps.model.b.a());
                    }
                    LatLng latLng = (LatLng) r52.a().d();
                    boolean f2 = r52.f(str2);
                    String str5 = s;
                    String d2 = f2 ? r52.d(str2) : str5;
                    if (r52.f(str3)) {
                        str5 = r52.d(str3);
                    }
                    pVar.e0(latLng);
                    pVar.i0(d2);
                    pVar.g0(str5);
                    g gVar = new g(this.I, pVar, this.E.getMarkerManager());
                    if (r52.g() != null && r52.g().o() != null) {
                        gVar.setImage(r52.g().o());
                    } else if (next.f(r52.k()) != null) {
                        gVar.setImage(next.f(r52.k()).o());
                    }
                    String str6 = d2 + t + num;
                    gVar.setIdentifier(str6);
                    Integer valueOf = Integer.valueOf(num.intValue() + 1);
                    I(gVar, num.intValue());
                    WritableMap a0 = a0(latLng);
                    a0.putString(P, str6);
                    a0.putString(Q, d2);
                    a0.putString(str3, str5);
                    writableNativeArray.pushMap(a0);
                    num = valueOf;
                    str2 = str2;
                }
                writableNativeMap.putArray(N, writableNativeArray);
                this.E.pushEvent(this.I, this, str4, writableNativeMap);
            }
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        } catch (IOException e3) {
            e3.printStackTrace();
        } catch (InterruptedException e4) {
            e4.printStackTrace();
        } catch (ExecutionException e5) {
            e5.printStackTrace();
        }
    }

    public void setLoadingBackgroundColor(Integer num) {
        this.h = num;
        RelativeLayout relativeLayout = this.e;
        if (relativeLayout == null) {
            return;
        }
        if (num == null) {
            relativeLayout.setBackgroundColor(-1);
        } else {
            relativeLayout.setBackgroundColor(num.intValue());
        }
    }

    public void setLoadingIndicatorColor(Integer num) {
        this.i = num;
        if (this.d != null) {
            Integer valueOf = num == null ? Integer.valueOf(Color.parseColor(C0201.m82(37231))) : num;
            if (Build.VERSION.SDK_INT >= 21) {
                ColorStateList valueOf2 = ColorStateList.valueOf(num.intValue());
                ColorStateList valueOf3 = ColorStateList.valueOf(num.intValue());
                ColorStateList valueOf4 = ColorStateList.valueOf(num.intValue());
                this.d.setProgressTintList(valueOf2);
                this.d.setSecondaryProgressTintList(valueOf3);
                this.d.setIndeterminateTintList(valueOf4);
                return;
            }
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            if (Build.VERSION.SDK_INT <= 10) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (this.d.getIndeterminateDrawable() != null) {
                this.d.getIndeterminateDrawable().setColorFilter(valueOf.intValue(), mode);
            }
            if (this.d.getProgressDrawable() != null) {
                this.d.getProgressDrawable().setColorFilter(valueOf.intValue(), mode);
            }
        }
    }

    public void setMoveOnMarkerPress(boolean z2) {
        this.n = z2;
    }

    public void setRegion(ReadableMap readableMap) {
        if (readableMap != null) {
            Double valueOf = Double.valueOf(readableMap.getDouble(C0201.m82(37232)));
            Double valueOf2 = Double.valueOf(readableMap.getDouble(C0201.m82(37233)));
            Double valueOf3 = Double.valueOf(readableMap.getDouble(C0201.m82(37234)));
            Double valueOf4 = Double.valueOf(readableMap.getDouble(C0201.m82(37235)));
            LatLngBounds latLngBounds = new LatLngBounds(new LatLng(valueOf2.doubleValue() - (valueOf4.doubleValue() / 2.0d), valueOf.doubleValue() - (valueOf3.doubleValue() / 2.0d)), new LatLng(valueOf2.doubleValue() + (valueOf4.doubleValue() / 2.0d), valueOf.doubleValue() + (valueOf3.doubleValue() / 2.0d)));
            if (super.getHeight() <= 0 || super.getWidth() <= 0) {
                this.b.m(com.google.android.gms.maps.b.e(new LatLng(valueOf2.doubleValue(), valueOf.doubleValue()), 10.0f));
                this.j = latLngBounds;
                return;
            }
            this.b.m(com.google.android.gms.maps.b.c(latLngBounds, 0));
            this.j = null;
        }
    }

    public void setShowsMyLocationButton(boolean z2) {
        if (Z() || !z2) {
            this.b.l().e(z2);
        }
    }

    public void setShowsUserLocation(boolean z2) {
        this.l = z2;
        if (Z()) {
            this.b.r(this.K);
            this.b.w(z2);
        }
    }

    public void setToolbarEnabled(boolean z2) {
        if (Z() || !z2) {
            this.b.l().d(z2);
        }
    }

    public void setUserLocationFastestInterval(int i2) {
        this.K.b(i2);
    }

    public void setUserLocationPriority(int i2) {
        this.K.d(i2);
    }

    public void setUserLocationUpdateInterval(int i2) {
        this.K.c(i2);
    }
}
