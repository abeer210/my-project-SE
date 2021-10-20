package org.reactnative.camera;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.CamcorderProfile;
import android.os.AsyncTask;
import android.os.Build;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.k0;
import defpackage.pn0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import vigqyno.C0188;
import vigqyno.C0201;

/* compiled from: RNCameraView */
public class d extends pn0 implements LifecycleEventListener, mz2, qz2, oz2, uz2, rz2 {
    public volatile boolean A;
    public volatile boolean B;
    public volatile boolean C;
    private n62 D;
    private org.reactnative.facedetector.b E;
    private xy2 F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private int L;
    private int M;
    private int N;
    private int O;
    private int P;
    private boolean Q;
    private int R;
    private int S;
    private boolean T;
    private float U;
    private float V;
    private float W;
    private float a0;
    private int b0;
    private int c0;
    private GestureDetector.SimpleOnGestureListener d0;
    private ScaleGestureDetector.OnScaleGestureListener e0;
    private k0 h;
    private Queue<Promise> i = new ConcurrentLinkedQueue();
    private Map<Promise, ReadableMap> j = new ConcurrentHashMap();
    private Map<Promise, File> k = new ConcurrentHashMap();
    private Promise l;
    private List<String> m = null;
    private boolean n = false;
    private ScaleGestureDetector o;
    private GestureDetector p;
    private boolean q = false;
    private boolean u = true;
    private boolean v = false;
    private Boolean w;
    private Boolean x;
    private boolean y;
    public volatile boolean z;

    /* compiled from: RNCameraView */
    class a extends pn0.b {
        public a() {
        }

        @Override // defpackage.pn0.b
        public void b(pn0 pn0) {
            e.e(pn0);
        }

        @Override // defpackage.pn0.b
        public void c(pn0 pn0, byte[] bArr, int i, int i2, int i3) {
            int q = e.q(i3, d.this.getFacing(), d.this.getCameraOrientation());
            boolean z = d.this.I && !d.this.z && (pn0 instanceof mz2);
            boolean z2 = d.this.G && !d.this.A && (pn0 instanceof qz2);
            boolean z3 = d.this.H && !d.this.B && (pn0 instanceof oz2);
            boolean z4 = d.this.J && !d.this.C && (pn0 instanceof uz2);
            if (z || z2 || z3 || z4) {
                double d = (double) i;
                Double.isNaN(d);
                double d2 = (double) i2;
                Double.isNaN(d2);
                if (((double) bArr.length) >= d * 1.5d * d2) {
                    if (z) {
                        d.this.z = true;
                        new lz2((mz2) pn0, d.this.D, bArr, i, i2, d.this.T, d.this.U, d.this.V, d.this.W, d.this.a0, d.this.b0, d.this.c0, d.this.getAspectRatio().k()).execute(new Void[0]);
                    }
                    if (z2) {
                        d.this.A = true;
                        new pz2((qz2) pn0, d.this.E, bArr, i, i2, q, d.this.getResources().getDisplayMetrics().density, d.this.getFacing(), d.this.getWidth(), d.this.getHeight(), d.this.R, d.this.S).execute(new Void[0]);
                    }
                    if (z3) {
                        d.this.B = true;
                        if (d.this.P == xy2.e) {
                            d.this.v = false;
                        } else if (d.this.P == xy2.f) {
                            d dVar = d.this;
                            dVar.v = !dVar.v;
                        } else if (d.this.P == xy2.g) {
                            d.this.v = true;
                        }
                        if (d.this.v) {
                            for (int i4 = 0; i4 < bArr.length; i4++) {
                                bArr[i4] = (byte) (bArr[i4] ^ -1);
                            }
                        }
                        new nz2((oz2) pn0, d.this.F, bArr, i, i2, q, d.this.getResources().getDisplayMetrics().density, d.this.getFacing(), d.this.getWidth(), d.this.getHeight(), d.this.R, d.this.S).execute(new Void[0]);
                    }
                    if (z4) {
                        d.this.C = true;
                        new tz2((uz2) pn0, d.this.h, bArr, i, i2, q, d.this.getResources().getDisplayMetrics().density, d.this.getFacing(), d.this.getWidth(), d.this.getHeight(), d.this.R, d.this.S).execute(new Void[0]);
                    }
                }
            }
        }

        @Override // defpackage.pn0.b
        public void d(pn0 pn0) {
            e.h(pn0, C0201.m82(35696));
        }

        @Override // defpackage.pn0.b
        public void e(pn0 pn0, byte[] bArr, int i) {
            Promise promise = (Promise) d.this.i.poll();
            ReadableMap readableMap = (ReadableMap) d.this.j.remove(promise);
            String r0 = C0201.m82(35697);
            if (readableMap.hasKey(r0) && readableMap.getBoolean(r0)) {
                promise.resolve(null);
            }
            File file = (File) d.this.k.remove(promise);
            if (Build.VERSION.SDK_INT >= 11) {
                new sz2(bArr, promise, readableMap, file, i, d.this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            } else {
                new sz2(bArr, promise, readableMap, file, i, d.this).execute(new Void[0]);
            }
            e.j(pn0);
        }

        @Override // defpackage.pn0.b
        public void f(pn0 pn0) {
            e.k(pn0);
        }

        @Override // defpackage.pn0.b
        public void g(pn0 pn0, String str, int i, int i2) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt(C0201.m82(35698), i);
            createMap.putInt(C0201.m82(35699), i2);
            createMap.putString(C0201.m82(35700), xz2.c(new File(str)).toString());
            e.l(pn0, createMap);
        }

        @Override // defpackage.pn0.b
        public void h(pn0 pn0, String str, int i, int i2) {
            if (d.this.l != null) {
                if (str != null) {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putBoolean(C0201.m82(35701), d.this.x.booleanValue());
                    createMap.putInt(C0201.m82(35702), i);
                    createMap.putInt(C0201.m82(35703), i2);
                    createMap.putString(C0201.m82(35704), xz2.c(new File(str)).toString());
                    d.this.l.resolve(createMap);
                } else {
                    d.this.l.reject(C0201.m82(35705), C0201.m82(35706));
                }
                d.this.w = Boolean.FALSE;
                d.this.x = Boolean.FALSE;
                d.this.l = null;
            }
        }
    }

    /* compiled from: RNCameraView */
    class b implements Runnable {
        public final /* synthetic */ Promise a;
        public final /* synthetic */ ReadableMap b;
        public final /* synthetic */ File c;

        public b(Promise promise, ReadableMap readableMap, File file) {
            this.a = promise;
            this.b = readableMap;
            this.c = file;
        }

        public void run() {
            d.this.i.add(this.a);
            d.this.j.put(this.a, this.b);
            d.this.k.put(this.a, this.c);
            try {
                d.super.z(this.b);
            } catch (Exception e) {
                d.this.i.remove(this.a);
                d.this.j.remove(this.a);
                d.this.k.remove(this.a);
                this.a.reject(C0201.m82(35727), e.getMessage());
            }
        }
    }

    /* compiled from: RNCameraView */
    class c implements Runnable {
        public static final String e = null;
        public static final String f = null;
        public static final String g = null;
        public static final String h = null;
        public static final String i = null;
        public static final String j = null;
        public static final String k = null;
        public static final String l = null;
        public static final String m = null;
        public static final String n = null;
        public static final String o = null;
        public static final String p = null;
        public final /* synthetic */ ReadableMap a;
        public final /* synthetic */ File b;
        public final /* synthetic */ Promise c;

        static {
            C0201.m83(c.class, 111);
        }

        public c(ReadableMap readableMap, File file, Promise promise) {
            this.a = readableMap;
            this.b = file;
            this.c = promise;
        }

        public void run() {
            String str = k;
            String str2 = i;
            String str3 = j;
            String str4 = n;
            String str5 = p;
            String str6 = h;
            String str7 = m;
            String str8 = f;
            String str9 = g;
            try {
                String string = this.a.hasKey(str9) ? this.a.getString(str9) : xz2.b(this.b, e);
                int i2 = this.a.hasKey(str7) ? this.a.getInt(str7) : -1;
                int i3 = this.a.hasKey(str6) ? this.a.getInt(str6) : -1;
                int i4 = this.a.hasKey(str5) ? this.a.getInt(str5) : -1;
                CamcorderProfile o2 = this.a.hasKey(str4) ? e.o(this.a.getInt(str4)) : CamcorderProfile.get(1);
                if (this.a.hasKey(str3)) {
                    o2.videoBitRate = this.a.getInt(str3);
                }
                if (d.super.s(string, i2 * C0188.f18, i3, this.a.hasKey(str2) ? !this.a.getBoolean(str2) : true, o2, this.a.hasKey(str) ? this.a.getInt(str) : 0, i4)) {
                    d.this.w = Boolean.TRUE;
                    d.this.l = this.c;
                    return;
                }
                this.c.reject(str8, l);
            } catch (IOException unused) {
                this.c.reject(str8, o);
            }
        }
    }

    /* renamed from: org.reactnative.camera.d$d  reason: collision with other inner class name */
    /* compiled from: RNCameraView */
    class RunnableC0164d implements Runnable {
        public RunnableC0164d() {
        }

        public void run() {
            if ((d.this.q && !d.this.p()) || d.this.u) {
                d.this.q = false;
                d.this.u = false;
                d.this.w();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: RNCameraView */
    public class e implements Runnable {
        public e() {
        }

        public void run() {
            d.this.x();
            d.this.m();
        }
    }

    /* compiled from: RNCameraView */
    class f extends GestureDetector.SimpleOnGestureListener {
        public f() {
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            d dVar = d.this;
            e.n(dVar, true, dVar.o0(motionEvent.getX()), d.this.o0(motionEvent.getY()));
            return true;
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            d dVar = d.this;
            e.n(dVar, false, dVar.o0(motionEvent.getX()), d.this.o0(motionEvent.getY()));
            return true;
        }
    }

    /* compiled from: RNCameraView */
    class g implements ScaleGestureDetector.OnScaleGestureListener {
        public g() {
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            d.this.m0(scaleGestureDetector.getScaleFactor());
            return true;
        }

        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            d.this.m0(scaleGestureDetector.getScaleFactor());
            return true;
        }

        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }
    }

    public d(k0 k0Var) {
        super(k0Var, true);
        Boolean bool = Boolean.FALSE;
        this.w = bool;
        this.x = bool;
        this.y = false;
        this.z = false;
        this.A = false;
        this.B = false;
        this.C = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = false;
        this.L = org.reactnative.facedetector.b.m;
        this.M = org.reactnative.facedetector.b.k;
        this.N = org.reactnative.facedetector.b.i;
        this.O = xy2.h;
        this.P = xy2.e;
        this.Q = true;
        this.T = false;
        this.U = 0.0f;
        this.V = 0.0f;
        this.W = 0.0f;
        this.a0 = 0.0f;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = new f();
        this.e0 = new g();
        this.h = k0Var;
        k0Var.addLifecycleEventListener(this);
        l(new a());
    }

    private boolean k0() {
        if (Build.VERSION.SDK_INT < 23 || androidx.core.content.b.a(getContext(), C0201.m82(31847)) == 0) {
            return true;
        }
        return false;
    }

    private void l0() {
        this.D = new n62();
        EnumMap enumMap = new EnumMap(j62.class);
        EnumSet noneOf = EnumSet.noneOf(f62.class);
        List<String> list = this.m;
        if (list != null) {
            for (String str : list) {
                String str2 = (String) CameraModule.VALID_BARCODE_TYPES.get(str);
                if (str2 != null) {
                    noneOf.add(f62.valueOf(str2));
                }
            }
        }
        enumMap.put((Enum) j62.POSSIBLE_FORMATS, (Object) noneOf);
        this.D.e(enumMap);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void m0(float f2) {
        float zoom = getZoom();
        float f3 = (f2 - 1.0f) + zoom;
        if (f3 > zoom) {
            setZoom(Math.min(f3, 1.0f));
        } else {
            setZoom(Math.max(f3, 0.0f));
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private int o0(float f2) {
        Resources resources = getResources();
        resources.getConfiguration();
        return (int) (f2 / resources.getDisplayMetrics().density);
    }

    private void r0() {
        xy2 xy2 = new xy2(this.h);
        this.F = xy2;
        xy2.f(this.O);
    }

    private void s0() {
        org.reactnative.facedetector.b bVar = new org.reactnative.facedetector.b(this.h);
        this.E = bVar;
        bVar.h(this.L);
        this.E.g(this.M);
        this.E.f(this.N);
        this.E.i(this.Q);
    }

    @Override // defpackage.oz2
    public void a(WritableArray writableArray, int i2, int i3, byte[] bArr) {
        byte[] bArr2;
        if (this.H) {
            if (this.n) {
                try {
                    YuvImage yuvImage = new YuvImage(bArr, 17, i2, i3, null);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    yuvImage.compressToJpeg(new Rect(0, 0, i2, i3), 100, byteArrayOutputStream);
                    bArr2 = byteArrayOutputStream.toByteArray();
                } catch (Exception e2) {
                    throw new RuntimeException(String.format(C0201.m82(31848), Integer.valueOf(bArr.length)), e2);
                }
            } else {
                bArr2 = null;
            }
            e.d(this, writableArray, bArr2);
        }
    }

    @Override // defpackage.qz2
    public void b(org.reactnative.facedetector.b bVar) {
        if (this.G) {
            e.f(this, bVar);
        }
    }

    @Override // defpackage.qz2
    public void c(WritableArray writableArray) {
        if (this.G) {
            e.g(this, writableArray);
        }
    }

    @Override // defpackage.mz2
    public void d(t62 t62, int i2, int i3, byte[] bArr) {
        byte[] bArr2;
        String str = t62.b().toString();
        if (this.I && this.m.contains(str)) {
            if (this.n) {
                try {
                    YuvImage yuvImage = new YuvImage(bArr, 17, i2, i3, null);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    yuvImage.compressToJpeg(new Rect(0, 0, i2, i3), 100, byteArrayOutputStream);
                    bArr2 = byteArrayOutputStream.toByteArray();
                } catch (Exception e2) {
                    throw new RuntimeException(String.format(C0201.m82(31849), Integer.valueOf(bArr.length)), e2);
                }
            } else {
                bArr2 = null;
            }
            e.b(this, t62, i2, i3, bArr2);
        }
    }

    @Override // defpackage.oz2
    public void e(xy2 xy2) {
        if (this.H) {
            e.c(this, xy2);
        }
    }

    @Override // defpackage.uz2
    public void f() {
        this.C = false;
    }

    @Override // defpackage.mz2
    public void g() {
        this.z = false;
        n62 n62 = this.D;
        if (n62 != null) {
            n62.a();
        }
    }

    @Override // defpackage.rz2
    public void h(WritableMap writableMap) {
        e.i(this, writableMap);
    }

    @Override // defpackage.qz2
    public void i() {
        this.A = false;
    }

    @Override // defpackage.uz2
    public void j(WritableArray writableArray) {
        if (this.J) {
            e.m(this, writableArray);
        }
    }

    @Override // defpackage.oz2
    public void k() {
        this.B = false;
    }

    public void n0(ReadableMap readableMap, Promise promise, File file) {
        this.g.post(new c(readableMap, file, promise));
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        org.reactnative.facedetector.b bVar = this.E;
        if (bVar != null) {
            bVar.d();
        }
        xy2 xy2 = this.F;
        if (xy2 != null) {
            xy2.d();
        }
        this.D = null;
        this.h.removeLifecycleEventListener(this);
        this.g.post(new e());
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        if (this.w.booleanValue()) {
            this.x = Boolean.TRUE;
        }
        if (!this.q && p()) {
            this.q = true;
            x();
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        if (k0()) {
            this.g.post(new RunnableC0164d());
        } else {
            e.h(this, C0201.m82(31850));
        }
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        View view = getView();
        if (view != null) {
            float f2 = (float) (i4 - i2);
            float f3 = (float) (i5 - i3);
            float k2 = getAspectRatio().k();
            int i8 = getResources().getConfiguration().orientation;
            setBackgroundColor(-16777216);
            if (i8 == 2) {
                float f4 = k2 * f3;
                if (f4 < f2) {
                    i7 = (int) (f2 / k2);
                } else {
                    i6 = (int) f4;
                    i7 = (int) f3;
                    int i9 = (int) ((f2 - ((float) i6)) / 2.0f);
                    int i10 = (int) ((f3 - ((float) i7)) / 2.0f);
                    this.R = i9;
                    this.S = i10;
                    view.layout(i9, i10, i6 + i9, i7 + i10);
                }
            } else {
                float f5 = k2 * f2;
                if (f5 > f3) {
                    i7 = (int) f5;
                } else {
                    i6 = (int) (f3 / k2);
                    i7 = (int) f3;
                    int i92 = (int) ((f2 - ((float) i6)) / 2.0f);
                    int i102 = (int) ((f3 - ((float) i7)) / 2.0f);
                    this.R = i92;
                    this.S = i102;
                    view.layout(i92, i102, i6 + i92, i7 + i102);
                }
            }
            i6 = (int) f2;
            int i922 = (int) ((f2 - ((float) i6)) / 2.0f);
            int i1022 = (int) ((f3 - ((float) i7)) / 2.0f);
            this.R = i922;
            this.S = i1022;
            view.layout(i922, i1022, i6 + i922, i7 + i1022);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.y) {
            this.o.onTouchEvent(motionEvent);
        }
        if (!this.K) {
            return true;
        }
        this.p.onTouchEvent(motionEvent);
        return true;
    }

    public void p0(int i2, int i3) {
        this.b0 = i2;
        this.c0 = i3;
    }

    public void q0(float f2, float f3, float f4, float f5) {
        this.T = true;
        this.U = f2;
        this.V = f3;
        this.W = f4;
        this.a0 = f5;
    }

    @SuppressLint({"all"})
    public void requestLayout() {
    }

    public void setBarCodeTypes(List<String> list) {
        this.m = list;
        l0();
    }

    public void setDetectedImageInEvent(boolean z2) {
        this.n = z2;
    }

    public void setFaceDetectionClassifications(int i2) {
        this.N = i2;
        org.reactnative.facedetector.b bVar = this.E;
        if (bVar != null) {
            bVar.f(i2);
        }
    }

    public void setFaceDetectionLandmarks(int i2) {
        this.M = i2;
        org.reactnative.facedetector.b bVar = this.E;
        if (bVar != null) {
            bVar.g(i2);
        }
    }

    public void setFaceDetectionMode(int i2) {
        this.L = i2;
        org.reactnative.facedetector.b bVar = this.E;
        if (bVar != null) {
            bVar.h(i2);
        }
    }

    public void setGoogleVisionBarcodeMode(int i2) {
        this.P = i2;
    }

    public void setGoogleVisionBarcodeType(int i2) {
        this.O = i2;
        xy2 xy2 = this.F;
        if (xy2 != null) {
            xy2.f(i2);
        }
    }

    public void setShouldDetectFaces(boolean z2) {
        if (z2 && this.E == null) {
            s0();
        }
        this.G = z2;
        setScanning(z2 || this.H || this.I || this.J);
    }

    public void setShouldDetectTouches(boolean z2) {
        if (this.K || !z2) {
            this.p = null;
        } else {
            this.p = new GestureDetector(this.h, this.d0);
        }
        this.K = z2;
    }

    public void setShouldGoogleDetectBarcodes(boolean z2) {
        if (z2 && this.F == null) {
            r0();
        }
        this.H = z2;
        setScanning(this.G || z2 || this.I || this.J);
    }

    public void setShouldRecognizeText(boolean z2) {
        this.J = z2;
        setScanning(this.G || this.H || this.I || z2);
    }

    public void setShouldScanBarCodes(boolean z2) {
        if (z2 && this.D == null) {
            l0();
        }
        this.I = z2;
        setScanning(this.G || this.H || z2 || this.J);
    }

    public void setTracking(boolean z2) {
        this.Q = z2;
        org.reactnative.facedetector.b bVar = this.E;
        if (bVar != null) {
            bVar.i(z2);
        }
    }

    public void setUseNativeZoom(boolean z2) {
        if (this.y || !z2) {
            this.o = null;
        } else {
            this.o = new ScaleGestureDetector(this.h, this.e0);
        }
        this.y = z2;
    }

    public void t0(ReadableMap readableMap, Promise promise, File file) {
        this.g.post(new b(promise, readableMap, file));
    }
}
