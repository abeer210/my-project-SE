package com.lwansbrough.RCTCamera;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.AsyncTask;
import android.util.Log;
import android.view.MotionEvent;
import android.view.TextureView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import vigqyno.C0188;
import vigqyno.C0201;

/* compiled from: RCTCameraViewFinder */
public class e extends TextureView implements TextureView.SurfaceTextureListener, Camera.PreviewCallback {
    public static volatile boolean l;
    private int a;
    private int b;
    private SurfaceTexture c;
    private int d;
    private int e;
    private boolean f;
    private boolean g;
    private Camera h;
    private boolean i = false;
    private float j;
    private final n62 k = new n62();

    /* access modifiers changed from: package-private */
    /* compiled from: RCTCameraViewFinder */
    public class a implements Runnable {
        public final /* synthetic */ int a;

        public a(int i) {
            this.a = i;
        }

        public void run() {
            e.this.u();
            e.this.a = this.a;
            e.this.s();
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: RCTCameraViewFinder */
    public class b implements Camera.AutoFocusCallback {
        public b() {
        }

        public void onAutoFocus(boolean z, Camera camera) {
            if (z) {
                camera.cancelAutoFocus();
            }
        }
    }

    /* compiled from: RCTCameraViewFinder */
    private class c extends AsyncTask<Void, Void, Void> {
        private byte[] a;
        private final Camera b;

        public c(Camera camera, byte[] bArr) {
            this.b = camera;
            this.a = bArr;
        }

        private t62 b(int i, int i2, boolean z) {
            h62 h62;
            try {
                p62 p62 = new p62(this.a, i, i2, 0, 0, i, i2, false);
                if (z) {
                    h62 = new h62(new k72(p62.e()));
                } else {
                    h62 = new h62(new k72(p62));
                }
                t62 d = e.this.k.d(h62);
                e.this.k.a();
                return d;
            } catch (Throwable unused) {
                e.this.k.a();
                return null;
            }
        }

        private t62 c() {
            Camera.Size previewSize = this.b.getParameters().getPreviewSize();
            int i = previewSize.width;
            int i2 = previewSize.height;
            t62 b2 = b(i, i2, false);
            if (b2 != null) {
                return b2;
            }
            t62 b3 = b(i, i2, true);
            if (b3 != null) {
                return b3;
            }
            d(i, i2);
            int i3 = previewSize.height;
            int i4 = previewSize.width;
            t62 b4 = b(i3, i4, false);
            if (b4 != null) {
                return b4;
            }
            return b(i3, i4, true);
        }

        private void d(int i, int i2) {
            byte[] bArr = new byte[this.a.length];
            for (int i3 = 0; i3 < i; i3++) {
                for (int i4 = 0; i4 < i2; i4++) {
                    int i5 = (i3 * i2) + i4;
                    int i6 = (((i4 * i) + i) - i3) - 1;
                    if (i5 >= 0) {
                        byte[] bArr2 = this.a;
                        if (i5 < bArr2.length && i6 >= 0 && i6 < bArr2.length) {
                            bArr[i6] = bArr2[i5];
                        }
                    }
                }
            }
            this.a = bArr;
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            if (isCancelled()) {
                return null;
            }
            try {
                t62 c2 = c();
                if (c2 != null) {
                    ReactApplicationContext reactContextSingleton = RCTCameraModule.getReactContextSingleton();
                    WritableMap createMap = Arguments.createMap();
                    WritableArray createArray = Arguments.createArray();
                    v62[] e = c2.e();
                    if (e != null) {
                        for (v62 v62 : e) {
                            WritableMap createMap2 = Arguments.createMap();
                            createMap2.putString(C0201.m82(27481), String.valueOf(v62.c()));
                            createMap2.putString(C0201.m82(27482), String.valueOf(v62.d()));
                            createArray.pushMap(createMap2);
                        }
                    }
                    createMap.putArray(C0201.m82(27483), createArray);
                    createMap.putString(C0201.m82(27484), c2.f());
                    createMap.putString(C0201.m82(27485), c2.b().toString());
                    ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContextSingleton.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(C0201.m82(27486), createMap);
                    e.this.k.a();
                    e.l = false;
                    return null;
                }
                throw new Exception();
            } catch (Throwable unused) {
            }
        }
    }

    static {
        C0201.m83(e.class, 209);
    }

    public e(Context context, int i2) {
        super(context);
        setSurfaceTextureListener(this);
        this.a = i2;
        i(b.h().e());
    }

    private Activity c() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    private float e(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((double) ((x * x) + (y * y)));
    }

    private void h(MotionEvent motionEvent, Camera.Parameters parameters) {
        int maxZoom = parameters.getMaxZoom();
        int zoom = parameters.getZoom();
        float e2 = e(motionEvent);
        float f2 = this.j;
        if (e2 > f2) {
            if (zoom < maxZoom) {
                zoom++;
            }
        } else if (e2 < f2 && zoom > 0) {
            zoom--;
        }
        this.j = e2;
        parameters.setZoom(zoom);
        try {
            this.h.setParameters(parameters);
        } catch (RuntimeException e3) {
            Log.e(C0201.m82(4496), C0201.m82(4497), e3);
        }
    }

    private void i(List<String> list) {
        EnumMap enumMap = new EnumMap(j62.class);
        EnumSet noneOf = EnumSet.noneOf(f62.class);
        if (list != null) {
            for (String str : list) {
                f62 j2 = j(str);
                if (j2 != null) {
                    noneOf.add(j2);
                }
            }
        }
        enumMap.put((Enum) j62.POSSIBLE_FORMATS, (Object) noneOf);
        this.k.e(enumMap);
    }

    private f62 j(String str) {
        if (C0201.m82(4498).equals(str)) {
            return f62.AZTEC;
        }
        if (C0201.m82(4499).equals(str)) {
            return f62.EAN_13;
        }
        if (C0201.m82(4500).equals(str)) {
            return f62.EAN_8;
        }
        if (C0201.m82(4501).equals(str)) {
            return f62.QR_CODE;
        }
        if (C0201.m82(4502).equals(str)) {
            return f62.PDF_417;
        }
        if (C0201.m82(4503).equals(str)) {
            return f62.UPC_E;
        }
        if (C0201.m82(4504).equals(str)) {
            return f62.DATA_MATRIX;
        }
        if (C0201.m82(4505).equals(str)) {
            return f62.CODE_39;
        }
        if (C0201.m82(4506).equals(str)) {
            return f62.CODE_93;
        }
        if (C0201.m82(4507).equals(str)) {
            return f62.ITF;
        }
        if (C0201.m82(4508).equals(str)) {
            return f62.CODABAR;
        }
        if (C0201.m82(4509).equals(str)) {
            return f62.CODE_128;
        }
        if (C0201.m82(4510).equals(str)) {
            return f62.MAXICODE;
        }
        if (C0201.m82(4511).equals(str)) {
            return f62.RSS_14;
        }
        if (C0201.m82(4512).equals(str)) {
            return f62.RSS_EXPANDED;
        }
        if (C0201.m82(4513).equals(str)) {
            return f62.UPC_A;
        }
        if (C0201.m82(4514).equals(str)) {
            return f62.UPC_EAN_EXTENSION;
        }
        Log.v(C0201.m82(4517), C0201.m82(4515) + str + C0201.m82(4516));
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c4, code lost:
        android.util.Log.e(vigqyno.C0201.m82(4525), vigqyno.C0201.m82(4526), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0119, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x011b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r0.printStackTrace();
        t();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0128, code lost:
        r7.f = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x012a, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x011b A[ExcHandler: Exception (r0v4 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:6:0x0009] */
    private synchronized void r() {
        List<Camera.Size> list;
        Activity c2;
        if (!this.f) {
            boolean z = true;
            this.f = true;
            try {
                Camera a2 = b.h().a(this.a);
                this.h = a2;
                Camera.Parameters parameters = a2.getParameters();
                boolean z2 = this.b == 0;
                if (this.b != 1) {
                    z = false;
                }
                if (!z2) {
                    if (!z) {
                        throw new RuntimeException(C0201.m82(4518) + this.b);
                    }
                }
                List<String> supportedFocusModes = parameters.getSupportedFocusModes();
                if (z2 && supportedFocusModes.contains(C0201.m82(4519))) {
                    parameters.setFocusMode(C0201.m82(4520));
                } else if (z && supportedFocusModes.contains(C0201.m82(4521))) {
                    parameters.setFocusMode(C0201.m82(4522));
                } else if (supportedFocusModes.contains(C0201.m82(4523))) {
                    parameters.setFocusMode(C0201.m82(4524));
                }
                if (z2) {
                    list = parameters.getSupportedPictureSizes();
                } else if (z) {
                    list = b.h().o(this.h);
                } else {
                    throw new RuntimeException(C0201.m82(4527) + this.b);
                }
                Camera.Size f2 = b.h().f(list, C0188.f24, C0188.f24);
                parameters.setPictureSize(f2.width, f2.height);
                this.h.setParameters(parameters);
                this.h.setPreviewTexture(this.c);
                this.h.startPreview();
                if (this.i && (c2 = c()) != null) {
                    c2.getWindow().setBackgroundDrawable(null);
                }
                this.h.setPreviewCallback(this);
            } catch (NullPointerException e2) {
                e2.printStackTrace();
            } catch (Exception e3) {
            }
            this.f = false;
        }
    }

    private synchronized void t() {
        if (!this.g) {
            this.g = true;
            try {
                if (this.h != null) {
                    this.h.stopPreview();
                    this.h.setPreviewCallback(null);
                    b.h().q(this.a);
                    this.h = null;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            } catch (Throwable th) {
                this.g = false;
                throw th;
            }
            this.g = false;
        }
    }

    public int d() {
        return this.a;
    }

    public double f() {
        return (double) (((float) b.h().m(this.a)) / ((float) b.h().j(this.a)));
    }

    public void g(MotionEvent motionEvent, Camera.Parameters parameters) {
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (supportedFocusModes != null) {
            String r1 = C0201.m82(4528);
            if (supportedFocusModes.contains(r1) && parameters.getMaxNumFocusAreas() != 0) {
                this.h.cancelAutoFocus();
                try {
                    Camera.Area a2 = c.a(motionEvent, this.d, this.e);
                    parameters.setFocusMode(r1);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(a2);
                    parameters.setFocusAreas(arrayList);
                    if (parameters.getMaxNumMeteringAreas() > 0) {
                        parameters.setMeteringAreas(arrayList);
                    }
                    try {
                        this.h.setParameters(parameters);
                    } catch (RuntimeException e2) {
                        Log.e(C0201.m82(4529), C0201.m82(4530), e2);
                    }
                    try {
                        this.h.autoFocus(new b());
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                } catch (RuntimeException e4) {
                    e4.printStackTrace();
                }
            }
        }
    }

    public void k(int i2) {
        if (this.a != i2) {
            new Thread(new a(i2)).start();
        }
    }

    public void l(int i2) {
        b.h().v(this.a, i2);
        this.b = i2;
    }

    public void m(String str) {
        b.h().w(this.a, str);
    }

    public void n(boolean z) {
        this.i = z;
    }

    public void o(int i2) {
        b.h().y(this.a, i2);
    }

    public void onPreviewFrame(byte[] bArr, Camera camera) {
        if (b.h().p() && !l) {
            l = true;
            new c(camera, bArr).execute(new Void[0]);
        }
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        this.c = surfaceTexture;
        this.d = i2;
        this.e = i3;
        r();
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.c = null;
        this.d = 0;
        this.e = 0;
        t();
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        this.d = i2;
        this.e = i3;
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        Camera camera = this.h;
        if (camera == null) {
            return false;
        }
        Camera.Parameters parameters = camera.getParameters();
        int action = motionEvent.getAction();
        if (motionEvent.getPointerCount() > 1) {
            if (action == 5) {
                this.j = e(motionEvent);
            } else if (action == 2 && parameters.isZoomSupported()) {
                this.h.cancelAutoFocus();
                h(motionEvent, parameters);
            }
        } else if (action == 1) {
            g(motionEvent, parameters);
        }
        return true;
    }

    public void p(int i2) {
        b.h().B(this.a, i2);
    }

    public void q(int i2) {
        b.h().C(this.a, i2);
    }

    public void s() {
        if (this.c != null) {
            r();
        }
    }

    public void u() {
        if (this.h != null) {
            t();
        }
    }
}
