package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.media.CamcorderProfile;
import android.media.MediaActionSound;
import android.media.MediaRecorder;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.SurfaceHolder;
import com.facebook.react.bridge.ReadableMap;
import defpackage.qn0;
import defpackage.tn0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.atomic.AtomicBoolean;
import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: mn0  reason: default package */
/* compiled from: Camera1 */
public class mn0 extends qn0 implements MediaRecorder.OnInfoListener, MediaRecorder.OnErrorListener, Camera.PreviewCallback {
    private static final y0<String> L;
    private static final y0<String> M;
    public static final String r = null;
    public static final String s = null;
    public static final String t = null;
    private int A;
    private int B;
    private int C = 0;
    private float D;
    private int E;
    private boolean F;
    private Boolean G;
    private Boolean H;
    private boolean I;
    private boolean J;
    private SurfaceTexture K;
    private int d;
    private String e;
    private final AtomicBoolean f = new AtomicBoolean(false);
    public Camera g;
    public MediaActionSound h = new MediaActionSound();
    private Camera.Parameters i;
    private final Camera.CameraInfo j = new Camera.CameraInfo();
    private MediaRecorder k;
    private String l;
    private final AtomicBoolean m = new AtomicBoolean(false);
    private final vn0 n = new vn0();
    private boolean o = false;
    private boolean p = true;
    private final vn0 q = new vn0();
    private un0 u;
    private ln0 v;
    private boolean w;
    private int x;
    private int y;
    private float z;

    /* renamed from: mn0$a */
    /* compiled from: Camera1 */
    class a implements tn0.a {

        /* renamed from: mn0$a$a  reason: collision with other inner class name */
        /* compiled from: Camera1 */
        class RunnableC0153a implements Runnable {
            public RunnableC0153a() {
            }

            public void run() {
                mn0.this.R();
            }
        }

        /* renamed from: mn0$a$b */
        /* compiled from: Camera1 */
        class b implements Runnable {
            public b() {
            }

            public void run() {
                mn0.this.S();
            }
        }

        public a() {
        }

        @Override // defpackage.tn0.a
        public void a() {
            synchronized (mn0.this) {
                if (mn0.this.g != null) {
                    mn0.this.J = true;
                    try {
                        mn0.this.g.setPreviewCallback(null);
                        mn0.this.g.setPreviewDisplay(null);
                    } catch (Exception e) {
                        Log.e(C0201.m82(23766), C0201.m82(23767), e);
                    }
                }
            }
            mn0.this.c.post(new b());
        }

        @Override // defpackage.tn0.a
        public void b() {
            synchronized (mn0.this) {
                if (!mn0.this.J) {
                    mn0.this.P0();
                } else {
                    mn0.this.c.post(new RunnableC0153a());
                }
            }
        }
    }

    /* renamed from: mn0$b */
    /* compiled from: Camera1 */
    class b implements Runnable {
        public final /* synthetic */ float a;
        public final /* synthetic */ float b;

        /* renamed from: mn0$b$a */
        /* compiled from: Camera1 */
        class a implements Camera.AutoFocusCallback {
            public a(b bVar) {
            }

            public void onAutoFocus(boolean z, Camera camera) {
            }
        }

        /* renamed from: mn0$b$b  reason: collision with other inner class name */
        /* compiled from: Camera1 */
        class C0154b implements Camera.AutoFocusCallback {
            public C0154b(b bVar) {
            }

            public void onAutoFocus(boolean z, Camera camera) {
            }
        }

        /* renamed from: mn0$b$c */
        /* compiled from: Camera1 */
        class c implements Camera.AutoFocusCallback {
            public c(b bVar) {
            }

            public void onAutoFocus(boolean z, Camera camera) {
            }
        }

        public b(float f, float f2) {
            this.a = f;
            this.b = f2;
        }

        public void run() {
            synchronized (mn0.this) {
                if (mn0.this.g != null) {
                    Camera.Parameters parameters = mn0.this.i;
                    if (parameters != null) {
                        String focusMode = parameters.getFocusMode();
                        Rect p0 = mn0.this.p0(this.a, this.b);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new Camera.Area(p0, C0188.f18));
                        if (parameters.getMaxNumFocusAreas() != 0 && focusMode != null && (focusMode.equals(C0201.m82(23713)) || focusMode.equals(C0201.m82(23714)) || focusMode.equals(C0201.m82(23715)) || focusMode.equals(C0201.m82(23716)))) {
                            parameters.setFocusMode(C0201.m82(23717));
                            parameters.setFocusAreas(arrayList);
                            if (parameters.getMaxNumMeteringAreas() > 0) {
                                parameters.setMeteringAreas(arrayList);
                            }
                            if (parameters.getSupportedFocusModes().contains(C0201.m82(23718))) {
                                try {
                                    mn0.this.g.setParameters(parameters);
                                } catch (RuntimeException e) {
                                    Log.e(C0201.m82(23719), C0201.m82(23720), e);
                                }
                                try {
                                    mn0.this.g.autoFocus(new a(this));
                                } catch (RuntimeException e2) {
                                    Log.e(C0201.m82(23721), C0201.m82(23722), e2);
                                }
                            }
                        } else if (parameters.getMaxNumMeteringAreas() <= 0) {
                            try {
                                mn0.this.g.autoFocus(new c(this));
                            } catch (RuntimeException e3) {
                                Log.e(C0201.m82(23729), C0201.m82(23730), e3);
                            }
                        } else if (parameters.getSupportedFocusModes().contains(C0201.m82(23723))) {
                            parameters.setFocusMode(C0201.m82(23724));
                            parameters.setFocusAreas(arrayList);
                            parameters.setMeteringAreas(arrayList);
                            try {
                                mn0.this.g.setParameters(parameters);
                            } catch (RuntimeException e4) {
                                Log.e(C0201.m82(23725), C0201.m82(23726), e4);
                            }
                            try {
                                mn0.this.g.autoFocus(new C0154b(this));
                            } catch (RuntimeException e5) {
                                Log.e(C0201.m82(23727), C0201.m82(23728), e5);
                            }
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: mn0$c */
    /* compiled from: Camera1 */
    public class c implements Runnable {
        public c() {
        }

        public void run() {
            synchronized (mn0.this) {
                if (mn0.this.g != null) {
                    mn0.this.I = false;
                    mn0.this.J0();
                    mn0.this.m0();
                    if (mn0.this.p) {
                        mn0.this.M0();
                    }
                }
            }
        }
    }

    /* renamed from: mn0$d */
    /* compiled from: Camera1 */
    class d implements Runnable {
        public d() {
        }

        public void run() {
            synchronized (this) {
                mn0.this.p = true;
                mn0.this.M0();
            }
        }
    }

    /* renamed from: mn0$e */
    /* compiled from: Camera1 */
    class e implements Runnable {
        public e() {
        }

        public void run() {
            if (mn0.this.u()) {
                mn0.this.S();
                mn0.this.R();
            }
        }
    }

    /* renamed from: mn0$f */
    /* compiled from: Camera1 */
    class f implements Runnable {
        public f() {
        }

        public void run() {
            if (mn0.this.u()) {
                mn0.this.S();
                mn0.this.R();
            }
        }
    }

    /* renamed from: mn0$g */
    /* compiled from: Camera1 */
    class g implements Runnable {
        public g() {
        }

        public void run() {
            synchronized (mn0.this) {
                if (mn0.this.g != null) {
                    mn0.this.m0();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: mn0$h */
    /* compiled from: Camera1 */
    public class h implements Runnable {
        public h() {
        }

        public void run() {
            synchronized (mn0.this) {
                if (mn0.this.g != null) {
                    mn0.this.m0();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: mn0$i */
    /* compiled from: Camera1 */
    public class i implements Camera.PictureCallback {
        public final /* synthetic */ ReadableMap a;

        public i(ReadableMap readableMap) {
            this.a = readableMap;
        }

        public void onPictureTaken(byte[] bArr, Camera camera) {
            if (mn0.this.G.booleanValue()) {
                mn0.this.h.play(0);
            }
            synchronized (mn0.this) {
                if (mn0.this.g != null) {
                    if (!this.a.hasKey(C0201.m82(24207)) || this.a.getBoolean(C0201.m82(24208))) {
                        mn0.this.g.stopPreview();
                        mn0.this.o = false;
                        mn0.this.g.setPreviewCallback(null);
                    } else {
                        mn0.this.g.startPreview();
                        mn0.this.o = true;
                        if (mn0.this.F) {
                            mn0.this.g.setPreviewCallback(mn0.this);
                        }
                    }
                }
            }
            mn0.this.f.set(false);
            mn0.this.C = 0;
            mn0 mn0 = mn0.this;
            mn0.a.g(bArr, mn0.t0(mn0.B));
            if (mn0.this.I) {
                mn0.this.P0();
            }
        }
    }

    /* renamed from: mn0$j */
    /* compiled from: Camera1 */
    class j implements Runnable {
        public final /* synthetic */ SurfaceTexture a;

        public j(SurfaceTexture surfaceTexture) {
            this.a = surfaceTexture;
        }

        public void run() {
            try {
                if (mn0.this.g == null) {
                    mn0.this.K = this.a;
                    return;
                }
                mn0.this.g.stopPreview();
                mn0.this.o = false;
                if (this.a == null) {
                    mn0.this.g.setPreviewTexture((SurfaceTexture) mn0.this.b.g());
                } else {
                    mn0.this.g.setPreviewTexture(this.a);
                }
                mn0.this.K = this.a;
                mn0.this.M0();
            } catch (IOException e) {
                Log.e(C0201.m82(24158), C0201.m82(24159), e);
            }
        }
    }

    static {
        C0201.m83(mn0.class, 90);
        y0<String> y0Var = new y0<>();
        L = y0Var;
        y0Var.l(0, C0201.m82(28854));
        L.l(1, C0201.m82(28855));
        L.l(2, C0201.m82(28856));
        y0<String> y0Var2 = L;
        String r5 = C0201.m82(28857);
        y0Var2.l(3, r5);
        L.l(4, C0201.m82(28858));
        y0<String> y0Var3 = new y0<>();
        M = y0Var3;
        y0Var3.l(0, r5);
        M.l(1, C0201.m82(28859));
        M.l(2, C0201.m82(28860));
        M.l(3, C0201.m82(28861));
        M.l(4, C0201.m82(28862));
        M.l(5, C0201.m82(28863));
    }

    public mn0(qn0.a aVar, tn0 tn0, Handler handler) {
        super(aVar, tn0, handler);
        new Handler();
        Boolean bool = Boolean.FALSE;
        this.G = bool;
        this.H = bool;
        tn0.l(new a());
    }

    private void A0() {
        Camera camera = this.g;
        if (camera != null) {
            camera.release();
            this.g = null;
            this.a.a();
            this.f.set(false);
            this.m.set(false);
        }
    }

    private void B0() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.k.resume();
        }
    }

    private boolean C0(boolean z2) {
        this.w = z2;
        if (!u()) {
            return false;
        }
        List<String> supportedFocusModes = this.i.getSupportedFocusModes();
        if (z2) {
            String r4 = C0201.m82(28864);
            if (supportedFocusModes.contains(r4)) {
                this.i.setFocusMode(r4);
                return true;
            }
        }
        if (this.F) {
            String r42 = C0201.m82(28865);
            if (supportedFocusModes.contains(r42)) {
                this.i.setFocusMode(r42);
                return true;
            }
        }
        String r43 = C0201.m82(28866);
        if (supportedFocusModes.contains(r43)) {
            this.i.setFocusMode(r43);
            return true;
        }
        String r44 = C0201.m82(28867);
        if (supportedFocusModes.contains(r44)) {
            this.i.setFocusMode(r44);
            return true;
        }
        this.i.setFocusMode(supportedFocusModes.get(0));
        return true;
    }

    private void D0(CamcorderProfile camcorderProfile, boolean z2, int i2) {
        if (!v0(i2)) {
            i2 = camcorderProfile.videoFrameRate;
        }
        this.k.setOutputFormat(camcorderProfile.fileFormat);
        this.k.setVideoFrameRate(i2);
        this.k.setVideoSize(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
        this.k.setVideoEncodingBitRate(camcorderProfile.videoBitRate);
        this.k.setVideoEncoder(camcorderProfile.videoCodec);
        if (z2) {
            this.k.setAudioEncodingBitRate(camcorderProfile.audioBitRate);
            this.k.setAudioChannels(camcorderProfile.audioChannels);
            this.k.setAudioSamplingRate(camcorderProfile.audioSampleRate);
            this.k.setAudioEncoder(camcorderProfile.audioCodec);
        }
    }

    private boolean E0(float f2) {
        int minExposureCompensation;
        int maxExposureCompensation;
        this.z = f2;
        int i2 = 0;
        if (!u() || (minExposureCompensation = this.i.getMinExposureCompensation()) == (maxExposureCompensation = this.i.getMaxExposureCompensation())) {
            return false;
        }
        float f3 = this.z;
        if (f3 >= 0.0f && f3 <= 1.0f) {
            i2 = ((int) (f3 * ((float) (maxExposureCompensation - minExposureCompensation)))) + minExposureCompensation;
        }
        this.i.setExposureCompensation(i2);
        return true;
    }

    private boolean F0(int i2) {
        if (u()) {
            List<String> supportedFlashModes = this.i.getSupportedFlashModes();
            String e2 = L.e(i2);
            if (supportedFlashModes == null) {
                return false;
            }
            if (supportedFlashModes.contains(e2)) {
                this.i.setFlashMode(e2);
                this.y = i2;
                return true;
            } else if (supportedFlashModes.contains(L.e(this.y))) {
                return false;
            } else {
                this.i.setFlashMode(C0201.m82(28868));
                return true;
            }
        } else {
            this.y = i2;
            return false;
        }
    }

    private void G0(boolean z2) {
        this.G = Boolean.valueOf(z2);
        Camera camera = this.g;
        if (camera != null) {
            try {
                if (!camera.enableShutterSound(false)) {
                    this.G = Boolean.FALSE;
                }
            } catch (Exception e2) {
                Log.e(C0201.m82(28869), C0201.m82(28870), e2);
                this.G = Boolean.FALSE;
            }
        }
    }

    private void H0(boolean z2) {
        this.F = z2;
        if (!u()) {
            return;
        }
        if (this.F) {
            this.g.setPreviewCallback(this);
        } else {
            this.g.setPreviewCallback(null);
        }
    }

    private void I0(String str, int i2, int i3, boolean z2, CamcorderProfile camcorderProfile, int i4) {
        CamcorderProfile camcorderProfile2;
        this.k = new MediaRecorder();
        this.g.unlock();
        this.k.setCamera(this.g);
        this.k.setVideoSource(1);
        if (z2) {
            this.k.setAudioSource(5);
        }
        this.k.setOutputFile(str);
        this.l = str;
        if (CamcorderProfile.hasProfile(this.d, camcorderProfile.quality)) {
            camcorderProfile2 = CamcorderProfile.get(this.d, camcorderProfile.quality);
        } else {
            camcorderProfile2 = CamcorderProfile.get(this.d, 1);
        }
        camcorderProfile2.videoBitRate = camcorderProfile.videoBitRate;
        D0(camcorderProfile2, z2, i4);
        MediaRecorder mediaRecorder = this.k;
        int i5 = this.C;
        mediaRecorder.setOrientationHint(n0(i5 != 0 ? y0(i5) : this.B));
        if (i2 != -1) {
            this.k.setMaxDuration(i2);
        }
        if (i3 != -1) {
            this.k.setMaxFileSize((long) i3);
        }
        this.k.setOnInfoListener(this);
        this.k.setOnErrorListener(this);
    }

    private boolean K0(int i2) {
        this.E = i2;
        if (!u()) {
            return false;
        }
        List<String> supportedWhiteBalance = this.i.getSupportedWhiteBalance();
        String e2 = M.e(i2);
        if (supportedWhiteBalance == null || !supportedWhiteBalance.contains(e2)) {
            String e3 = M.e(this.E);
            if (supportedWhiteBalance != null && supportedWhiteBalance.contains(e3)) {
                return false;
            }
            this.i.setWhiteBalance(C0201.m82(28871));
            return true;
        }
        this.i.setWhiteBalance(e2);
        return true;
    }

    private boolean L0(float f2) {
        if (!u() || !this.i.isZoomSupported()) {
            this.D = f2;
            return false;
        }
        this.i.setZoom((int) (((float) this.i.getMaxZoom()) * f2));
        this.D = f2;
        return true;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void M0() {
        Camera camera;
        if (!this.o && (camera = this.g) != null) {
            try {
                this.o = true;
                camera.startPreview();
                if (this.F) {
                    this.g.setPreviewCallback(this);
                }
            } catch (Exception e2) {
                this.o = false;
                Log.e(C0201.m82(28872), C0201.m82(28873), e2);
            }
        }
    }

    private void N0() {
        synchronized (this) {
            if (this.k != null) {
                try {
                    this.k.stop();
                } catch (RuntimeException e2) {
                    Log.e(C0201.m82(28874), C0201.m82(28875), e2);
                }
                try {
                    this.k.reset();
                    this.k.release();
                } catch (RuntimeException e3) {
                    Log.e(C0201.m82(28876), C0201.m82(28877), e3);
                }
                this.k = null;
            }
            this.a.b();
            if (this.H.booleanValue()) {
                this.h.play(3);
            }
            int t0 = t0(this.B);
            if (this.l == null || !new File(this.l).exists()) {
                this.a.h(null, this.C != 0 ? this.C : t0, t0);
                return;
            }
            this.a.h(this.l, this.C != 0 ? this.C : t0, t0);
            this.l = null;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void P0() {
        if (this.g == null) {
            return;
        }
        if (this.f.get() || this.m.get()) {
            this.I = true;
        } else {
            this.c.post(new c());
        }
    }

    private int n0(int i2) {
        Camera.CameraInfo cameraInfo = this.j;
        if (cameraInfo.facing == 0) {
            return (cameraInfo.orientation + i2) % 360;
        }
        return ((this.j.orientation + i2) + (w0(i2) ? 180 : 0)) % 360;
    }

    private int o0(int i2) {
        Camera.CameraInfo cameraInfo = this.j;
        if (cameraInfo.facing == 1) {
            return (360 - ((cameraInfo.orientation + i2) % 360)) % 360;
        }
        return ((cameraInfo.orientation - i2) + 360) % 360;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private Rect p0(float f2, float f3) {
        int i2 = (int) (f2 * 2000.0f);
        int i3 = (int) (f3 * 2000.0f);
        int i4 = i2 - 150;
        int i5 = i3 - 150;
        int i6 = i2 + 150;
        int i7 = i3 + 150;
        if (i4 < 0) {
            i4 = 0;
        }
        if (i6 > 2000) {
            i6 = 2000;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        if (i7 > 2000) {
            i7 = 2000;
        }
        return new Rect(i4 - 1000, i5 - 1000, i6 - 1000, i7 - 1000);
    }

    private ln0 q0() {
        Iterator<ln0> it = this.n.d().iterator();
        ln0 ln0 = null;
        while (it.hasNext()) {
            ln0 = it.next();
            if (ln0.equals(rn0.a)) {
                break;
            }
        }
        return ln0;
    }

    private void r0() {
        String r0 = C0201.m82(28878);
        String str = this.e;
        if (str == null) {
            try {
                int numberOfCameras = Camera.getNumberOfCameras();
                if (numberOfCameras == 0) {
                    this.d = -1;
                    Log.w(r0, C0201.m82(28879));
                    return;
                }
                for (int i2 = 0; i2 < numberOfCameras; i2++) {
                    Camera.getCameraInfo(i2, this.j);
                    if (this.j.facing == this.x) {
                        this.d = i2;
                        return;
                    }
                }
                this.d = 0;
                Camera.getCameraInfo(0, this.j);
            } catch (Exception e2) {
                Log.e(r0, C0201.m82(28880), e2);
                this.d = -1;
            }
        } else {
            try {
                int parseInt = Integer.parseInt(str);
                this.d = parseInt;
                Camera.getCameraInfo(parseInt, this.j);
            } catch (Exception unused) {
                this.d = -1;
            }
        }
    }

    private un0 s0(SortedSet<un0> sortedSet) {
        if (!this.b.j()) {
            return sortedSet.first();
        }
        int i2 = this.b.i();
        int c2 = this.b.c();
        if (w0(this.A)) {
            c2 = i2;
            i2 = c2;
        }
        un0 un0 = null;
        Iterator<un0> it = sortedSet.iterator();
        while (it.hasNext()) {
            un0 = it.next();
            if (i2 <= un0.e() && c2 <= un0.d()) {
                break;
            }
        }
        return un0;
    }

    private un0 u0(int i2, int i3, SortedSet<un0> sortedSet) {
        if (sortedSet == null || sortedSet.isEmpty()) {
            return null;
        }
        un0 last = sortedSet.last();
        if (i2 == 0 || i3 == 0) {
            return last;
        }
        for (un0 un0 : sortedSet) {
            if (i2 <= un0.e() && i3 <= un0.d()) {
                return un0;
            }
        }
        return last;
    }

    private boolean v0(int i2) {
        boolean z2;
        ArrayList<int[]> q2 = q();
        int i3 = i2 * C0188.f18;
        Iterator<int[]> it = q2.iterator();
        do {
            z2 = false;
            if (it.hasNext()) {
                int[] next = it.next();
                boolean z3 = i3 >= next[0] && i3 <= next[1];
                boolean z4 = i3 > 0;
                if (z3 && z4) {
                    z2 = true;
                    continue;
                }
            } else {
                Log.w(C0201.m82(28881), C0201.m82(28882));
                return false;
            }
        } while (!z2);
        return true;
    }

    private boolean w0(int i2) {
        return i2 == 90 || i2 == 270;
    }

    private boolean x0() {
        if (this.g != null) {
            A0();
        }
        int i2 = this.d;
        if (i2 == -1) {
            return false;
        }
        try {
            Camera open = Camera.open(i2);
            this.g = open;
            this.i = open.getParameters();
            this.n.b();
            for (Camera.Size size : this.i.getSupportedPreviewSizes()) {
                this.n.a(new un0(size.width, size.height));
            }
            this.q.b();
            for (Camera.Size size2 : this.i.getSupportedPictureSizes()) {
                this.q.a(new un0(size2.width, size2.height));
            }
            for (ln0 ln0 : this.n.d()) {
                if (this.q.f(ln0) == null) {
                    this.n.e(ln0);
                }
            }
            if (this.v == null) {
                this.v = rn0.a;
            }
            m0();
            this.g.setDisplayOrientation(o0(this.A));
            this.a.d();
            return true;
        } catch (RuntimeException unused) {
            return false;
        }
    }

    private void z0() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.k.pause();
        }
    }

    @Override // defpackage.qn0
    public boolean A(ln0 ln0) {
        if (this.v == null || !u()) {
            this.v = ln0;
            return true;
        } else if (this.v.equals(ln0)) {
            return false;
        } else {
            if (this.n.f(ln0) == null) {
                Log.w(C0201.m82(28883), C0201.m82(28884));
                return false;
            }
            this.v = ln0;
            this.c.post(new h());
            return true;
        }
    }

    @Override // defpackage.qn0
    public void B(boolean z2) {
        if (this.w != z2) {
            synchronized (this) {
                if (C0(z2)) {
                    try {
                        if (this.g != null) {
                            this.g.setParameters(this.i);
                        }
                    } catch (RuntimeException e2) {
                        Log.e(C0201.m82(28885), C0201.m82(28886), e2);
                    }
                }
            }
        }
    }

    @Override // defpackage.qn0
    public void C(String str) {
        if (!wz2.a(this.e, str)) {
            this.e = str;
            if (!wz2.a(str, String.valueOf(this.d))) {
                this.c.post(new f());
            }
        }
    }

    @Override // defpackage.qn0
    public void D(int i2) {
        synchronized (this) {
            if (this.B != i2) {
                this.B = i2;
                if (u() && this.C == 0 && !this.m.get() && !this.f.get()) {
                    this.i.setRotation(n0(i2));
                    try {
                        this.g.setParameters(this.i);
                    } catch (RuntimeException e2) {
                        Log.e(C0201.m82(28887), C0201.m82(28888), e2);
                    }
                }
            }
        }
    }

    @Override // defpackage.qn0
    public void E(int i2) {
        synchronized (this) {
            if (this.A != i2) {
                this.A = i2;
                if (u()) {
                    boolean z2 = this.o && Build.VERSION.SDK_INT < 14;
                    if (z2) {
                        this.g.stopPreview();
                        this.o = false;
                    }
                    try {
                        this.g.setDisplayOrientation(o0(i2));
                    } catch (RuntimeException e2) {
                        Log.e(C0201.m82(28889), C0201.m82(28890), e2);
                    }
                    if (z2) {
                        M0();
                    }
                }
            }
        }
    }

    @Override // defpackage.qn0
    public void F(float f2) {
        if (f2 != this.z && E0(f2)) {
            try {
                if (this.g != null) {
                    this.g.setParameters(this.i);
                }
            } catch (RuntimeException e2) {
                Log.e(C0201.m82(28891), C0201.m82(28892), e2);
            }
        }
    }

    @Override // defpackage.qn0
    public void G(int i2) {
        if (this.x != i2) {
            this.x = i2;
            this.c.post(new e());
        }
    }

    @Override // defpackage.qn0
    public void H(int i2) {
        if (i2 != this.y && F0(i2)) {
            try {
                if (this.g != null) {
                    this.g.setParameters(this.i);
                }
            } catch (RuntimeException e2) {
                Log.e(C0201.m82(28893), C0201.m82(28894), e2);
            }
        }
    }

    @Override // defpackage.qn0
    public void I(float f2, float f3) {
        this.c.post(new b(f2, f3));
    }

    @Override // defpackage.qn0
    public void J(float f2) {
    }

    @SuppressLint({"NewApi"})
    public void J0() {
        try {
            this.J = false;
            if (this.g == null) {
                return;
            }
            if (this.K != null) {
                this.g.setPreviewTexture(this.K);
            } else if (this.b.d() == SurfaceHolder.class) {
                boolean z2 = this.o && Build.VERSION.SDK_INT < 14;
                if (z2) {
                    this.g.stopPreview();
                    this.o = false;
                }
                this.g.setPreviewDisplay(this.b.f());
                if (z2) {
                    M0();
                }
            } else {
                this.g.setPreviewTexture((SurfaceTexture) this.b.g());
            }
        } catch (Exception e2) {
            Log.e(C0201.m82(28895), C0201.m82(28896), e2);
        }
    }

    @Override // defpackage.qn0
    public void K(un0 un0) {
        if (un0 != null || this.u != null) {
            if (un0 == null || !un0.equals(this.u)) {
                this.u = un0;
                if (u()) {
                    this.c.post(new g());
                }
            }
        }
    }

    @Override // defpackage.qn0
    public void L(boolean z2) {
        if (z2 != this.G.booleanValue()) {
            G0(z2);
        }
    }

    @Override // defpackage.qn0
    public void M(boolean z2) {
        this.H = Boolean.valueOf(z2);
    }

    @Override // defpackage.qn0
    public void N(SurfaceTexture surfaceTexture) {
        this.c.post(new j(surfaceTexture));
    }

    @Override // defpackage.qn0
    public void O(boolean z2) {
        if (z2 != this.F) {
            H0(z2);
        }
    }

    public void O0(ReadableMap readableMap) {
        String r0 = C0201.m82(28897);
        String r1 = C0201.m82(28898);
        if (this.m.get() || !this.f.compareAndSet(false, true)) {
            throw new IllegalStateException(C0201.m82(28902));
        }
        try {
            boolean hasKey = readableMap.hasKey(r1);
            String r3 = C0201.m82(28899);
            if (hasKey && readableMap.getInt(r1) != 0) {
                int i2 = readableMap.getInt(r1);
                this.C = i2;
                this.i.setRotation(n0(y0(i2)));
                try {
                    this.g.setParameters(this.i);
                } catch (RuntimeException e2) {
                    Log.e(r3, C0201.m82(28900), e2);
                }
            }
            if (readableMap.hasKey(r0)) {
                this.i.setJpegQuality((int) (readableMap.getDouble(r0) * 100.0d));
                try {
                    this.g.setParameters(this.i);
                } catch (RuntimeException e3) {
                    Log.e(r3, C0201.m82(28901), e3);
                }
            }
            this.g.takePicture(null, null, null, new i(readableMap));
        } catch (Exception e4) {
            this.f.set(false);
            throw e4;
        }
    }

    @Override // defpackage.qn0
    public void P(int i2) {
        if (i2 != this.E && K0(i2)) {
            try {
                if (this.g != null) {
                    this.g.setParameters(this.i);
                }
            } catch (RuntimeException e2) {
                Log.e(C0201.m82(28903), C0201.m82(28904), e2);
            }
        }
    }

    @Override // defpackage.qn0
    public void Q(float f2) {
        if (f2 != this.D && L0(f2)) {
            try {
                if (this.g != null) {
                    this.g.setParameters(this.i);
                }
            } catch (RuntimeException e2) {
                Log.e(C0201.m82(28905), C0201.m82(28906), e2);
            }
        }
    }

    @Override // defpackage.qn0
    public boolean R() {
        synchronized (this) {
            r0();
            if (!x0()) {
                this.a.e();
                return true;
            }
            if (this.b.j()) {
                J0();
                if (this.p) {
                    M0();
                }
            }
            return true;
        }
    }

    @Override // defpackage.qn0
    public void S() {
        synchronized (this) {
            if (this.k != null) {
                try {
                    this.k.stop();
                } catch (RuntimeException e2) {
                    Log.e(C0201.m82(28907), C0201.m82(28908), e2);
                }
                try {
                    this.k.reset();
                    this.k.release();
                } catch (RuntimeException e3) {
                    Log.e(C0201.m82(28909), C0201.m82(28910), e3);
                }
                this.k = null;
                if (this.m.get()) {
                    this.a.b();
                    int t0 = t0(this.B);
                    this.a.h(this.l, this.C != 0 ? this.C : t0, t0);
                }
            }
            if (this.g != null) {
                this.o = false;
                try {
                    this.g.stopPreview();
                    this.g.setPreviewCallback(null);
                } catch (Exception e4) {
                    Log.e(C0201.m82(28911), C0201.m82(28912), e4);
                }
            }
            A0();
        }
    }

    @Override // defpackage.qn0
    public void T() {
        if (this.m.compareAndSet(true, false)) {
            N0();
            Camera camera = this.g;
            if (camera != null) {
                camera.lock();
            }
            if (this.I) {
                P0();
            }
        }
    }

    @Override // defpackage.qn0
    public void U(ReadableMap readableMap) {
        if (!u()) {
            throw new IllegalStateException(C0201.m82(28914));
        } else if (this.o) {
            O0(readableMap);
        } else {
            throw new IllegalStateException(C0201.m82(28913));
        }
    }

    @Override // defpackage.qn0
    public ln0 a() {
        return this.v;
    }

    @Override // defpackage.qn0
    public boolean b() {
        if (!u()) {
            return this.w;
        }
        String focusMode = this.i.getFocusMode();
        return focusMode != null && focusMode.contains(C0201.m82(28915));
    }

    @Override // defpackage.qn0
    public SortedSet<un0> c(ln0 ln0) {
        return this.q.f(ln0);
    }

    @Override // defpackage.qn0
    public String d() {
        return this.e;
    }

    @Override // defpackage.qn0
    public List<Properties> e() {
        ArrayList arrayList = new ArrayList();
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int numberOfCameras = Camera.getNumberOfCameras();
        for (int i2 = 0; i2 < numberOfCameras; i2++) {
            Properties properties = new Properties();
            Camera.getCameraInfo(i2, cameraInfo);
            properties.put(C0201.m82(28916), String.valueOf(i2));
            properties.put(C0201.m82(28917), String.valueOf(cameraInfo.facing));
            arrayList.add(properties);
        }
        return arrayList;
    }

    @Override // defpackage.qn0
    public int f() {
        return this.j.orientation;
    }

    @Override // defpackage.qn0
    public float g() {
        return this.z;
    }

    @Override // defpackage.qn0
    public int h() {
        return this.x;
    }

    @Override // defpackage.qn0
    public int i() {
        return this.y;
    }

    @Override // defpackage.qn0
    public float j() {
        return 0.0f;
    }

    @Override // defpackage.qn0
    public un0 k() {
        return this.u;
    }

    @Override // defpackage.qn0
    public boolean l() {
        return this.G.booleanValue();
    }

    @Override // defpackage.qn0
    public boolean m() {
        return this.H.booleanValue();
    }

    public void m0() {
        un0 un0;
        SortedSet<un0> f2 = this.n.f(this.v);
        String r1 = C0201.m82(28918);
        if (f2 == null) {
            Log.w(r1, C0201.m82(28919));
            ln0 q0 = q0();
            this.v = q0;
            f2 = this.n.f(q0);
        }
        un0 s0 = s0(f2);
        un0 un02 = this.u;
        if (un02 != null) {
            un0 = u0(un02.e(), this.u.d(), this.q.f(this.v));
        } else {
            un0 = u0(0, 0, this.q.f(this.v));
        }
        boolean z2 = this.o;
        if (z2) {
            this.g.stopPreview();
            this.o = false;
        }
        this.i.setPreviewSize(s0.e(), s0.d());
        this.i.setPictureSize(un0.e(), un0.d());
        int i2 = this.C;
        if (i2 != 0) {
            this.i.setRotation(n0(y0(i2)));
        } else {
            this.i.setRotation(n0(this.B));
        }
        C0(this.w);
        F0(this.y);
        E0(this.z);
        A(this.v);
        L0(this.D);
        K0(this.E);
        H0(this.F);
        G0(this.G.booleanValue());
        try {
            this.g.setParameters(this.i);
        } catch (RuntimeException e2) {
            Log.e(r1, C0201.m82(28920), e2);
        }
        if (z2) {
            M0();
        }
    }

    @Override // defpackage.qn0
    public un0 n() {
        Camera.Size previewSize = this.i.getPreviewSize();
        return new un0(previewSize.width, previewSize.height);
    }

    @Override // defpackage.qn0
    public boolean o() {
        return this.F;
    }

    public void onError(MediaRecorder mediaRecorder, int i2, int i3) {
        T();
    }

    public void onInfo(MediaRecorder mediaRecorder, int i2, int i3) {
        if (i2 == 800 || i2 == 801) {
            T();
        }
    }

    public void onPreviewFrame(byte[] bArr, Camera camera) {
        Camera.Size previewSize = this.i.getPreviewSize();
        this.a.c(bArr, previewSize.width, previewSize.height, this.B);
    }

    @Override // defpackage.qn0
    public Set<ln0> p() {
        vn0 vn0 = this.n;
        for (ln0 ln0 : vn0.d()) {
            if (this.q.f(ln0) == null) {
                vn0.e(ln0);
            }
        }
        return vn0.d();
    }

    @Override // defpackage.qn0
    public ArrayList<int[]> q() {
        return (ArrayList) this.i.getSupportedPreviewFpsRange();
    }

    @Override // defpackage.qn0
    public int s() {
        return this.E;
    }

    @Override // defpackage.qn0
    public float t() {
        return this.D;
    }

    public int t0(int i2) {
        if (i2 == 90) {
            return 4;
        }
        if (i2 != 180) {
            return i2 != 270 ? 1 : 3;
        }
        return 2;
    }

    @Override // defpackage.qn0
    public boolean u() {
        return this.g != null;
    }

    @Override // defpackage.qn0
    public void v() {
        synchronized (this) {
            this.o = false;
            this.p = false;
            if (this.g != null) {
                this.g.stopPreview();
            }
        }
    }

    @Override // defpackage.qn0
    public void w() {
        z0();
    }

    @Override // defpackage.qn0
    public boolean x(String str, int i2, int i3, boolean z2, CamcorderProfile camcorderProfile, int i4, int i5) {
        String str2 = r;
        if (!this.f.get() && this.m.compareAndSet(false, true)) {
            if (i4 != 0) {
                this.C = i4;
            }
            try {
                I0(str, i2, i3, z2, camcorderProfile, i5);
                this.k.prepare();
                this.k.start();
                try {
                    this.g.setParameters(this.i);
                } catch (Exception e2) {
                    Log.e(str2, t, e2);
                }
                int t0 = t0(this.B);
                this.a.f(str, this.C != 0 ? this.C : t0, t0);
                if (this.H.booleanValue()) {
                    this.h.play(2);
                }
                return true;
            } catch (Exception e3) {
                this.m.set(false);
                Log.e(str2, s, e3);
            }
        }
        return false;
    }

    @Override // defpackage.qn0
    public void y() {
        this.c.post(new d());
    }

    public int y0(int i2) {
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 180;
        }
        if (i2 != 3) {
            return i2 != 4 ? 1 : 90;
        }
        return 270;
    }

    @Override // defpackage.qn0
    public void z() {
        B0();
    }
}
