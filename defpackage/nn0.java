package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.Image;
import android.media.ImageReader;
import android.media.MediaActionSound;
import android.media.MediaRecorder;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Size;
import android.util.SparseIntArray;
import android.view.Surface;
import com.facebook.react.bridge.ReadableMap;
import defpackage.qn0;
import defpackage.tn0;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.SortedSet;
import vigqyno.C0188;
import vigqyno.C0201;

@TargetApi(21)
/* renamed from: nn0  reason: default package */
/* compiled from: Camera2 */
public class nn0 extends qn0 implements MediaRecorder.OnInfoListener, MediaRecorder.OnErrorListener {
    private static final SparseIntArray T;
    private final vn0 A = new vn0();
    private un0 B;
    private int C;
    private ln0 D = rn0.a;
    private ln0 E;
    private boolean F;
    private int G;
    private float H;
    private int I;
    private int J;
    private int K;
    private float L;
    private float M;
    private int N;
    private boolean O;
    private Boolean P;
    private Boolean Q;
    private Surface R;
    private Rect S;
    private final CameraManager d;
    private final CameraDevice.StateCallback e = new a();
    private final CameraCaptureSession.StateCallback f = new b();
    public j g = new c();
    private final ImageReader.OnImageAvailableListener h = new d();
    private String i;
    private String j;
    private CameraCharacteristics k;
    public CameraDevice l;
    public MediaActionSound m = new MediaActionSound();
    public CameraCaptureSession n;
    public CaptureRequest.Builder o;
    public Set<String> p = new HashSet();
    private ImageReader q;
    private ImageReader u;
    private int v;
    private MediaRecorder w;
    private String x;
    private boolean y;
    private final vn0 z = new vn0();

    /* renamed from: nn0$a */
    /* compiled from: Camera2 */
    class a extends CameraDevice.StateCallback {
        public a() {
        }

        public void onClosed(CameraDevice cameraDevice) {
            nn0.this.a.a();
        }

        public void onDisconnected(CameraDevice cameraDevice) {
            nn0.this.l = null;
        }

        public void onError(CameraDevice cameraDevice, int i) {
            Log.e(C0201.m82(20098), C0201.m82(20095) + cameraDevice.getId() + C0201.m82(20096) + i + C0201.m82(20097));
            nn0.this.l = null;
        }

        public void onOpened(CameraDevice cameraDevice) {
            nn0 nn0 = nn0.this;
            nn0.l = cameraDevice;
            nn0.a.d();
            nn0.this.q0();
        }
    }

    /* renamed from: nn0$b */
    /* compiled from: Camera2 */
    class b extends CameraCaptureSession.StateCallback {
        public b() {
        }

        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            CameraCaptureSession cameraCaptureSession2 = nn0.this.n;
            if (cameraCaptureSession2 != null && cameraCaptureSession2.equals(cameraCaptureSession)) {
                nn0.this.n = null;
            }
        }

        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            Log.e(C0201.m82(17755), C0201.m82(17756));
        }

        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            String r0 = C0201.m82(17757);
            nn0 nn0 = nn0.this;
            if (nn0.l != null) {
                nn0.n = cameraCaptureSession;
                nn0.S = (Rect) nn0.o.get(CaptureRequest.SCALER_CROP_REGION);
                nn0.this.u0();
                nn0.this.v0();
                nn0.this.w0();
                nn0.this.x0();
                nn0.this.y0();
                try {
                    nn0.this.n.setRepeatingRequest(nn0.this.o.build(), nn0.this.g, null);
                } catch (CameraAccessException e) {
                    Log.e(r0, C0201.m82(17759), e);
                } catch (IllegalStateException e2) {
                    Log.e(r0, C0201.m82(17758), e2);
                }
            }
        }
    }

    /* renamed from: nn0$c */
    /* compiled from: Camera2 */
    class c extends j {
        public c() {
        }

        @Override // defpackage.nn0.j
        public void b() {
            nn0.this.o.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
            f(3);
            try {
                nn0.this.n.capture(nn0.this.o.build(), this, null);
                nn0.this.o.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 0);
            } catch (CameraAccessException e) {
                Log.e(C0201.m82(17650), C0201.m82(17651), e);
            }
        }

        @Override // defpackage.nn0.j
        public void c() {
            nn0.this.Z();
        }
    }

    /* renamed from: nn0$d */
    /* compiled from: Camera2 */
    class d implements ImageReader.OnImageAvailableListener {
        public d() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
            if (r6 != null) goto L_0x004e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
            r6.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0052, code lost:
            r6 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
            r0.addSuppressed(r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0056, code lost:
            throw r1;
         */
        public void onImageAvailable(ImageReader imageReader) {
            Image acquireNextImage = imageReader.acquireNextImage();
            Image.Plane[] planes = acquireNextImage.getPlanes();
            if (planes.length > 0) {
                ByteBuffer buffer = planes[0].getBuffer();
                byte[] bArr = new byte[buffer.remaining()];
                buffer.get(bArr);
                if (acquireNextImage.getFormat() == 256) {
                    nn0.this.a.g(bArr, 0);
                } else {
                    nn0.this.a.c(bArr, acquireNextImage.getWidth(), acquireNextImage.getHeight(), nn0.this.J);
                }
                acquireNextImage.close();
            }
            if (acquireNextImage != null) {
                acquireNextImage.close();
            }
        }
    }

    /* renamed from: nn0$e */
    /* compiled from: Camera2 */
    class e extends CameraManager.AvailabilityCallback {
        public e() {
        }

        public void onCameraAvailable(String str) {
            super.onCameraAvailable(str);
            nn0.this.p.add(str);
        }

        public void onCameraUnavailable(String str) {
            super.onCameraUnavailable(str);
            nn0.this.p.remove(str);
        }
    }

    /* renamed from: nn0$f */
    /* compiled from: Camera2 */
    class f implements tn0.a {
        public f() {
        }

        @Override // defpackage.tn0.a
        public void a() {
            nn0.this.S();
        }

        @Override // defpackage.tn0.a
        public void b() {
            nn0.this.q0();
        }
    }

    /* renamed from: nn0$g */
    /* compiled from: Camera2 */
    class g implements Runnable {
        public g() {
        }

        public void run() {
            CameraCaptureSession cameraCaptureSession = nn0.this.n;
            if (cameraCaptureSession != null) {
                cameraCaptureSession.close();
                nn0.this.n = null;
            }
            nn0.this.q0();
        }
    }

    /* renamed from: nn0$h */
    /* compiled from: Camera2 */
    class h extends CameraCaptureSession.CaptureCallback {
        public h() {
        }

        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
            if (captureRequest.getTag() == C0201.m82(18154)) {
                nn0.this.o.set(CaptureRequest.CONTROL_AF_TRIGGER, null);
                try {
                    nn0.this.n.setRepeatingRequest(nn0.this.o.build(), null, null);
                } catch (CameraAccessException e) {
                    Log.e(C0201.m82(18155), C0201.m82(18156), e);
                }
            }
        }

        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            Log.e(C0201.m82(18158), C0201.m82(18157) + captureFailure);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: nn0$i */
    /* compiled from: Camera2 */
    public class i extends CameraCaptureSession.CaptureCallback {
        public i() {
        }

        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            ReadableMap a2 = nn0.this.g.a();
            String r2 = C0201.m82(18038);
            if (a2.hasKey(r2) && !nn0.this.g.a().getBoolean(r2)) {
                nn0.this.t0();
            }
            if (nn0.this.P.booleanValue()) {
                nn0.this.m.play(0);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: nn0$j */
    /* compiled from: Camera2 */
    public static abstract class j extends CameraCaptureSession.CaptureCallback {
        private int a;
        private ReadableMap b = null;

        private void d(CaptureResult captureResult) {
            int i = this.a;
            if (i == 1) {
                Integer num = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num != null) {
                    if (num.intValue() == 4 || num.intValue() == 5) {
                        Integer num2 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                        if (num2 == null || num2.intValue() == 2) {
                            f(5);
                            c();
                            return;
                        }
                        f(2);
                        b();
                    }
                }
            } else if (i == 3) {
                Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                if (num3 == null || num3.intValue() == 5 || num3.intValue() == 4 || num3.intValue() == 2) {
                    f(4);
                }
            } else if (i == 4) {
                Integer num4 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                if (num4 == null || num4.intValue() != 5) {
                    f(5);
                    c();
                }
            }
        }

        public ReadableMap a() {
            return this.b;
        }

        public abstract void b();

        public abstract void c();

        public void e(ReadableMap readableMap) {
            this.b = readableMap;
        }

        public void f(int i) {
            this.a = i;
        }

        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            d(totalCaptureResult);
        }

        public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            d(captureResult);
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        T = sparseIntArray;
        sparseIntArray.put(0, 1);
        T.put(1, 0);
    }

    public nn0(qn0.a aVar, tn0 tn0, Context context, Handler handler) {
        super(aVar, tn0, handler);
        Boolean bool = Boolean.FALSE;
        this.P = bool;
        this.Q = bool;
        CameraManager cameraManager = (CameraManager) context.getSystemService(C0201.m82(16727));
        this.d = cameraManager;
        cameraManager.registerAvailabilityCallback(new e(), (Handler) null);
        this.v = this.O ? 35 : 256;
        this.b.l(new f());
    }

    private MeteringRectangle Y(float f2, float f3) {
        Rect rect = (Rect) this.k.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        return new MeteringRectangle(Math.max(((int) (f2 * ((float) rect.width()))) - 150, 0), Math.max(((int) (f3 * ((float) rect.height()))) - 150, 0), C0188.f19, C0188.f19, 999);
    }

    private boolean a0() {
        String str = this.j;
        String r1 = C0201.m82(16728);
        String r2 = C0201.m82(16729);
        if (str == null) {
            try {
                int i2 = T.get(this.C);
                String[] cameraIdList = this.d.getCameraIdList();
                if (cameraIdList.length == 0) {
                    Log.e(r2, C0201.m82(16730));
                    return false;
                }
                for (String str2 : cameraIdList) {
                    CameraCharacteristics cameraCharacteristics = this.d.getCameraCharacteristics(str2);
                    Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                    if (num == null) {
                        Log.e(r2, r1);
                    } else if (num.intValue() == i2) {
                        this.i = str2;
                        this.k = cameraCharacteristics;
                        return true;
                    }
                }
                String str3 = cameraIdList[0];
                this.i = str3;
                CameraCharacteristics cameraCharacteristics2 = this.d.getCameraCharacteristics(str3);
                this.k = cameraCharacteristics2;
                Integer num2 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.LENS_FACING);
                if (num2 == null) {
                    Log.e(r2, r1);
                    return false;
                }
                int size = T.size();
                for (int i3 = 0; i3 < size; i3++) {
                    if (T.valueAt(i3) == num2.intValue()) {
                        this.C = T.keyAt(i3);
                        return true;
                    }
                }
                this.C = 0;
                return true;
            } catch (CameraAccessException e2) {
                Log.e(r2, C0201.m82(16731), e2);
                return false;
            }
        } else {
            try {
                CameraCharacteristics cameraCharacteristics3 = this.d.getCameraCharacteristics(str);
                this.k = cameraCharacteristics3;
                Integer num3 = (Integer) cameraCharacteristics3.get(CameraCharacteristics.LENS_FACING);
                if (num3 == null) {
                    Log.e(r2, r1);
                    return false;
                }
                int size2 = T.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size2) {
                        break;
                    } else if (T.valueAt(i4) == num3.intValue()) {
                        this.C = T.keyAt(i4);
                        break;
                    } else {
                        i4++;
                    }
                }
                this.i = this.j;
                return true;
            } catch (Exception e3) {
                Log.e(r2, C0201.m82(16732), e3);
                return false;
            }
        }
    }

    private un0 b0() {
        int i2 = this.b.i();
        int c2 = this.b.c();
        if (i2 < c2) {
            c2 = i2;
            i2 = c2;
        }
        SortedSet<un0> f2 = this.z.f(this.D);
        for (un0 un0 : f2) {
            if (un0.e() >= i2 && un0.d() >= c2) {
                return un0;
            }
        }
        return f2.last();
    }

    private void c0() {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.k.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap != null) {
            this.z.b();
            Size[] outputSizes = streamConfigurationMap.getOutputSizes(this.b.d());
            for (Size size : outputSizes) {
                int width = size.getWidth();
                int height = size.getHeight();
                if (width <= 1920 && height <= 1080) {
                    this.z.a(new un0(width, height));
                }
            }
            this.A.b();
            d0(this.A, streamConfigurationMap);
            if (this.B == null) {
                this.B = this.A.f(this.D).last();
            }
            for (ln0 ln0 : this.z.d()) {
                if (!this.A.d().contains(ln0)) {
                    this.z.e(ln0);
                }
            }
            if (!this.z.d().contains(this.D)) {
                this.D = this.z.d().iterator().next();
            }
            this.I = ((Integer) this.k.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
            return;
        }
        throw new IllegalStateException(C0201.m82(16733) + this.i);
    }

    private int e0() {
        int intValue = ((Integer) this.k.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        if (this.C == 0) {
            return (intValue + this.K) % 360;
        }
        return ((intValue + this.K) + (g0(this.K) ? 180 : 0)) % 360;
    }

    private boolean g0(int i2) {
        return i2 == 90 || i2 == 270;
    }

    public static boolean h0(Context context) {
        String r0 = C0201.m82(16734);
        try {
            CameraManager cameraManager = (CameraManager) context.getSystemService(C0201.m82(16735));
            for (String str : cameraManager.getCameraIdList()) {
                Integer num = (Integer) cameraManager.getCameraCharacteristics(str).get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
                if (num != null) {
                    if (num.intValue() != 2) {
                    }
                }
                Log.w(r0, C0201.m82(16736));
                return true;
            }
            return false;
        } catch (CameraAccessException e2) {
            Log.e(r0, C0201.m82(16737), e2);
            return true;
        }
    }

    private boolean i0() {
        return ((Integer) this.k.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() >= 1;
    }

    private void j0() {
        this.o.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        try {
            this.g.f(1);
            this.n.capture(this.o.build(), this.g, null);
        } catch (CameraAccessException e2) {
            Log.e(C0201.m82(16738), C0201.m82(16739), e2);
        }
    }

    private void k0() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.w.pause();
        }
    }

    private void l0() {
        ImageReader imageReader = this.u;
        if (imageReader != null) {
            imageReader.close();
        }
        un0 last = this.z.f(this.D).last();
        ImageReader newInstance = ImageReader.newInstance(last.e(), last.d(), 35, 1);
        this.u = newInstance;
        newInstance.setOnImageAvailableListener(this.h, null);
    }

    private void m0() {
        ImageReader imageReader = this.q;
        if (imageReader != null) {
            imageReader.close();
        }
        ImageReader newInstance = ImageReader.newInstance(this.B.e(), this.B.d(), 256, 1);
        this.q = newInstance;
        newInstance.setOnImageAvailableListener(this.h, null);
    }

    private void n0() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.w.resume();
        }
    }

    private void o0(CamcorderProfile camcorderProfile, boolean z2) {
        this.w.setOutputFormat(camcorderProfile.fileFormat);
        this.w.setVideoFrameRate(camcorderProfile.videoFrameRate);
        this.w.setVideoSize(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
        this.w.setVideoEncodingBitRate(camcorderProfile.videoBitRate);
        this.w.setVideoEncoder(camcorderProfile.videoCodec);
        if (z2) {
            this.w.setAudioEncodingBitRate(camcorderProfile.audioBitRate);
            this.w.setAudioChannels(camcorderProfile.audioChannels);
            this.w.setAudioSamplingRate(camcorderProfile.audioSampleRate);
            this.w.setAudioEncoder(camcorderProfile.audioCodec);
        }
    }

    private void p0(String str, int i2, int i3, boolean z2, CamcorderProfile camcorderProfile) {
        MediaRecorder mediaRecorder = new MediaRecorder();
        this.w = mediaRecorder;
        mediaRecorder.setVideoSource(2);
        if (z2) {
            this.w.setAudioSource(1);
        }
        this.w.setOutputFile(str);
        this.x = str;
        CamcorderProfile camcorderProfile2 = !CamcorderProfile.hasProfile(Integer.parseInt(this.i), camcorderProfile.quality) ? CamcorderProfile.get(1) : camcorderProfile;
        camcorderProfile2.videoBitRate = camcorderProfile.videoBitRate;
        o0(camcorderProfile2, z2);
        this.w.setOrientationHint(e0());
        if (i2 != -1) {
            this.w.setMaxDuration(i2);
        }
        if (i3 != -1) {
            this.w.setMaxFileSize((long) i3);
        }
        this.w.setOnInfoListener(this);
        this.w.setOnErrorListener(this);
    }

    private void r0() {
        try {
            this.d.openCamera(this.i, this.e, (Handler) null);
        } catch (CameraAccessException e2) {
            throw new RuntimeException(C0201.m82(16740) + this.i, e2);
        }
    }

    private void s0() {
        this.y = false;
        try {
            this.n.stopRepeating();
            this.n.abortCaptures();
            this.w.stop();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.w.reset();
        this.w.release();
        this.w = null;
        this.a.b();
        if (this.Q.booleanValue()) {
            this.m.play(3);
        }
        if (this.x == null || !new File(this.x).exists()) {
            this.a.h(null, 0, 0);
            return;
        }
        this.a.h(this.x, 0, 0);
        this.x = null;
    }

    @Override // defpackage.qn0
    public boolean A(ln0 ln0) {
        if (ln0 != null && this.z.c()) {
            this.E = ln0;
            return false;
        } else if (ln0 == null || ln0.equals(this.D) || !this.z.d().contains(ln0)) {
            return false;
        } else {
            this.D = ln0;
            m0();
            l0();
            CameraCaptureSession cameraCaptureSession = this.n;
            if (cameraCaptureSession == null) {
                return true;
            }
            cameraCaptureSession.close();
            this.n = null;
            q0();
            return true;
        }
    }

    @Override // defpackage.qn0
    public void B(boolean z2) {
        if (this.F != z2) {
            this.F = z2;
            if (this.o != null) {
                u0();
                CameraCaptureSession cameraCaptureSession = this.n;
                if (cameraCaptureSession != null) {
                    try {
                        cameraCaptureSession.setRepeatingRequest(this.o.build(), this.g, null);
                    } catch (CameraAccessException unused) {
                        this.F = !this.F;
                    }
                }
            }
        }
    }

    @Override // defpackage.qn0
    public void C(String str) {
        if (!wz2.a(this.j, str)) {
            this.j = str;
            if (!wz2.a(str, this.i) && u()) {
                S();
                R();
            }
        }
    }

    @Override // defpackage.qn0
    public void D(int i2) {
        this.K = i2;
    }

    @Override // defpackage.qn0
    public void E(int i2) {
        this.J = i2;
        this.b.m(i2);
    }

    @Override // defpackage.qn0
    public void F(float f2) {
        Log.e(C0201.m82(16741), C0201.m82(16742));
    }

    @Override // defpackage.qn0
    public void G(int i2) {
        if (this.C != i2) {
            this.C = i2;
            if (u()) {
                S();
                R();
            }
        }
    }

    @Override // defpackage.qn0
    public void H(int i2) {
        int i3 = this.G;
        if (i3 != i2) {
            this.G = i2;
            if (this.o != null) {
                v0();
                CameraCaptureSession cameraCaptureSession = this.n;
                if (cameraCaptureSession != null) {
                    try {
                        cameraCaptureSession.setRepeatingRequest(this.o.build(), this.g, null);
                    } catch (CameraAccessException unused) {
                        this.G = i3;
                    }
                }
            }
        }
    }

    @Override // defpackage.qn0
    public void I(float f2, float f3) {
        String r0 = C0201.m82(16743);
        String r1 = C0201.m82(16744);
        if (this.n != null) {
            h hVar = new h();
            try {
                this.n.stopRepeating();
            } catch (CameraAccessException e2) {
                Log.e(r1, r0, e2);
            }
            this.o.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            this.o.set(CaptureRequest.CONTROL_AF_MODE, 0);
            try {
                this.n.capture(this.o.build(), hVar, null);
            } catch (CameraAccessException e3) {
                Log.e(r1, r0, e3);
            }
            if (i0()) {
                MeteringRectangle Y = Y(f2, f3);
                this.o.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{Y});
            }
            this.o.set(CaptureRequest.CONTROL_MODE, 1);
            this.o.set(CaptureRequest.CONTROL_AF_MODE, 1);
            this.o.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
            this.o.setTag(C0201.m82(16745));
            try {
                this.n.capture(this.o.build(), hVar, null);
            } catch (CameraAccessException e4) {
                Log.e(r1, r0, e4);
            }
        }
    }

    @Override // defpackage.qn0
    public void J(float f2) {
        float f3 = this.L;
        if (f3 != f2) {
            this.L = f2;
            if (this.n != null) {
                w0();
                try {
                    this.n.setRepeatingRequest(this.o.build(), this.g, null);
                } catch (CameraAccessException unused) {
                    this.L = f3;
                }
            }
        }
    }

    @Override // defpackage.qn0
    public void K(un0 un0) {
        CameraCaptureSession cameraCaptureSession = this.n;
        if (cameraCaptureSession != null) {
            try {
                cameraCaptureSession.stopRepeating();
            } catch (CameraAccessException e2) {
                e2.printStackTrace();
            }
            this.n.close();
            this.n = null;
        }
        ImageReader imageReader = this.q;
        if (imageReader != null) {
            imageReader.close();
        }
        if (un0 == null) {
            ln0 ln0 = this.D;
            if (ln0 != null && this.B != null) {
                this.A.f(ln0).last();
            } else {
                return;
            }
        } else {
            this.B = un0;
        }
        m0();
        q0();
    }

    @Override // defpackage.qn0
    public void L(boolean z2) {
        this.P = Boolean.valueOf(z2);
    }

    @Override // defpackage.qn0
    public void M(boolean z2) {
        this.Q = Boolean.valueOf(z2);
    }

    @Override // defpackage.qn0
    public void N(SurfaceTexture surfaceTexture) {
        if (surfaceTexture != null) {
            this.R = new Surface(surfaceTexture);
        } else {
            this.R = null;
        }
        new Handler(Looper.getMainLooper()).post(new g());
    }

    @Override // defpackage.qn0
    public void O(boolean z2) {
        if (this.O != z2) {
            this.O = z2;
            if (!z2) {
                this.v = 256;
            } else {
                this.v = 35;
            }
            CameraCaptureSession cameraCaptureSession = this.n;
            if (cameraCaptureSession != null) {
                cameraCaptureSession.close();
                this.n = null;
            }
            q0();
        }
    }

    @Override // defpackage.qn0
    public void P(int i2) {
        int i3 = this.N;
        if (i3 != i2) {
            this.N = i2;
            if (this.n != null) {
                x0();
                try {
                    this.n.setRepeatingRequest(this.o.build(), this.g, null);
                } catch (CameraAccessException unused) {
                    this.N = i3;
                }
            }
        }
    }

    @Override // defpackage.qn0
    public void Q(float f2) {
        float f3 = this.M;
        if (f3 != f2) {
            this.M = f2;
            if (this.n != null) {
                y0();
                try {
                    this.n.setRepeatingRequest(this.o.build(), this.g, null);
                } catch (CameraAccessException unused) {
                    this.M = f3;
                }
            }
        }
    }

    @Override // defpackage.qn0
    public boolean R() {
        if (!a0()) {
            this.D = this.E;
            this.a.e();
            return false;
        }
        c0();
        A(this.E);
        this.E = null;
        m0();
        l0();
        r0();
        return true;
    }

    @Override // defpackage.qn0
    public void S() {
        CameraCaptureSession cameraCaptureSession = this.n;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.n = null;
        }
        CameraDevice cameraDevice = this.l;
        if (cameraDevice != null) {
            cameraDevice.close();
            this.l = null;
        }
        ImageReader imageReader = this.q;
        if (imageReader != null) {
            imageReader.close();
            this.q = null;
        }
        ImageReader imageReader2 = this.u;
        if (imageReader2 != null) {
            imageReader2.close();
            this.u = null;
        }
        MediaRecorder mediaRecorder = this.w;
        if (mediaRecorder != null) {
            mediaRecorder.stop();
            this.w.reset();
            this.w.release();
            this.w = null;
            if (this.y) {
                this.a.b();
                this.a.h(this.x, 0, 0);
                this.y = false;
            }
        }
    }

    @Override // defpackage.qn0
    public void T() {
        if (this.y) {
            s0();
            CameraCaptureSession cameraCaptureSession = this.n;
            if (cameraCaptureSession != null) {
                cameraCaptureSession.close();
                this.n = null;
            }
            q0();
        }
    }

    @Override // defpackage.qn0
    public void U(ReadableMap readableMap) {
        this.g.e(readableMap);
        if (this.F) {
            j0();
        } else {
            Z();
        }
    }

    public void Z() {
        String r0 = C0201.m82(16746);
        try {
            CaptureRequest.Builder createCaptureRequest = this.l.createCaptureRequest(2);
            if (this.O) {
                this.v = 256;
                createCaptureRequest.removeTarget(this.u.getSurface());
            }
            createCaptureRequest.addTarget(this.q.getSurface());
            createCaptureRequest.set(CaptureRequest.CONTROL_AF_MODE, this.o.get(CaptureRequest.CONTROL_AF_MODE));
            int i2 = this.G;
            if (i2 == 0) {
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 1);
                createCaptureRequest.set(CaptureRequest.FLASH_MODE, 0);
            } else if (i2 == 1) {
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 3);
            } else if (i2 == 2) {
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 1);
                createCaptureRequest.set(CaptureRequest.FLASH_MODE, 2);
            } else if (i2 == 3) {
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 2);
            } else if (i2 == 4) {
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 2);
            }
            createCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, Integer.valueOf(e0()));
            if (this.g.a().hasKey(r0)) {
                createCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf((byte) ((int) (this.g.a().getDouble(r0) * 100.0d))));
            }
            createCaptureRequest.set(CaptureRequest.SCALER_CROP_REGION, this.o.get(CaptureRequest.SCALER_CROP_REGION));
            this.n.stopRepeating();
            this.n.capture(createCaptureRequest.build(), new i(), null);
        } catch (CameraAccessException e2) {
            Log.e(C0201.m82(16747), C0201.m82(16748), e2);
        }
    }

    @Override // defpackage.qn0
    public ln0 a() {
        return this.D;
    }

    @Override // defpackage.qn0
    public boolean b() {
        return this.F;
    }

    @Override // defpackage.qn0
    public SortedSet<un0> c(ln0 ln0) {
        return this.A.f(ln0);
    }

    @Override // defpackage.qn0
    public String d() {
        return this.j;
    }

    public void d0(vn0 vn0, StreamConfigurationMap streamConfigurationMap) {
        Size[] outputSizes = streamConfigurationMap.getOutputSizes(this.v);
        for (Size size : outputSizes) {
            this.A.a(new un0(size.getWidth(), size.getHeight()));
        }
    }

    @Override // defpackage.qn0
    public List<Properties> e() {
        try {
            ArrayList arrayList = new ArrayList();
            String[] cameraIdList = this.d.getCameraIdList();
            for (String str : cameraIdList) {
                Properties properties = new Properties();
                properties.put(C0201.m82(16749), str);
                properties.put(C0201.m82(16750), String.valueOf(((Integer) this.d.getCameraCharacteristics(str).get(CameraCharacteristics.LENS_FACING)).intValue() == 0 ? 1 : 0));
                arrayList.add(properties);
            }
            return arrayList;
        } catch (CameraAccessException e2) {
            throw new RuntimeException(C0201.m82(16751), e2);
        }
    }

    @Override // defpackage.qn0
    public int f() {
        return this.I;
    }

    public Surface f0() {
        Surface surface = this.R;
        if (surface != null) {
            return surface;
        }
        return this.b.e();
    }

    @Override // defpackage.qn0
    public float g() {
        return this.H;
    }

    @Override // defpackage.qn0
    public int h() {
        return this.C;
    }

    @Override // defpackage.qn0
    public int i() {
        return this.G;
    }

    @Override // defpackage.qn0
    public float j() {
        return this.L;
    }

    @Override // defpackage.qn0
    public un0 k() {
        return this.B;
    }

    @Override // defpackage.qn0
    public boolean l() {
        return this.P.booleanValue();
    }

    @Override // defpackage.qn0
    public boolean m() {
        return this.Q.booleanValue();
    }

    @Override // defpackage.qn0
    public un0 n() {
        return new un0(this.b.i(), this.b.c());
    }

    @Override // defpackage.qn0
    public boolean o() {
        return this.O;
    }

    public void onError(MediaRecorder mediaRecorder, int i2, int i3) {
        T();
    }

    public void onInfo(MediaRecorder mediaRecorder, int i2, int i3) {
        if (i2 == 800 || i2 == 801) {
            T();
        }
    }

    @Override // defpackage.qn0
    public Set<ln0> p() {
        return this.z.d();
    }

    @Override // defpackage.qn0
    public ArrayList<int[]> q() {
        Log.e(C0201.m82(16752), C0201.m82(16753));
        return new ArrayList<>();
    }

    public void q0() {
        if (u() && this.b.j() && this.q != null && this.u != null) {
            un0 b0 = b0();
            this.b.k(b0.e(), b0.d());
            Surface f0 = f0();
            try {
                CaptureRequest.Builder createCaptureRequest = this.l.createCaptureRequest(1);
                this.o = createCaptureRequest;
                createCaptureRequest.addTarget(f0);
                if (this.O) {
                    this.o.addTarget(this.u.getSurface());
                }
                this.l.createCaptureSession(Arrays.asList(f0, this.q.getSurface(), this.u.getSurface()), this.f, null);
            } catch (CameraAccessException e2) {
                Log.e(C0201.m82(16754), C0201.m82(16755), e2);
                this.a.e();
            }
        }
    }

    @Override // defpackage.qn0
    public int s() {
        return this.N;
    }

    @Override // defpackage.qn0
    public float t() {
        return this.M;
    }

    public void t0() {
        this.o.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
        try {
            this.n.capture(this.o.build(), this.g, null);
            u0();
            v0();
            if (this.O) {
                this.v = 35;
                q0();
                return;
            }
            this.o.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
            this.n.setRepeatingRequest(this.o.build(), this.g, null);
            this.g.f(0);
        } catch (CameraAccessException e2) {
            Log.e(C0201.m82(16756), C0201.m82(16757), e2);
        }
    }

    @Override // defpackage.qn0
    public boolean u() {
        return this.l != null;
    }

    public void u0() {
        if (this.F) {
            int[] iArr = (int[]) this.k.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
            if (iArr == null || iArr.length == 0 || (iArr.length == 1 && iArr[0] == 0)) {
                this.F = false;
                this.o.set(CaptureRequest.CONTROL_AF_MODE, 0);
                return;
            }
            this.o.set(CaptureRequest.CONTROL_AF_MODE, 4);
            return;
        }
        this.o.set(CaptureRequest.CONTROL_AF_MODE, 0);
    }

    @Override // defpackage.qn0
    public void v() {
        try {
            this.n.stopRepeating();
        } catch (CameraAccessException e2) {
            e2.printStackTrace();
        }
    }

    public void v0() {
        int i2 = this.G;
        if (i2 == 0) {
            this.o.set(CaptureRequest.CONTROL_AE_MODE, 1);
            this.o.set(CaptureRequest.FLASH_MODE, 0);
        } else if (i2 == 1) {
            this.o.set(CaptureRequest.CONTROL_AE_MODE, 3);
            this.o.set(CaptureRequest.FLASH_MODE, 0);
        } else if (i2 == 2) {
            this.o.set(CaptureRequest.CONTROL_AE_MODE, 1);
            this.o.set(CaptureRequest.FLASH_MODE, 2);
        } else if (i2 == 3) {
            this.o.set(CaptureRequest.CONTROL_AE_MODE, 2);
            this.o.set(CaptureRequest.FLASH_MODE, 0);
        } else if (i2 == 4) {
            this.o.set(CaptureRequest.CONTROL_AE_MODE, 4);
            this.o.set(CaptureRequest.FLASH_MODE, 0);
        }
    }

    @Override // defpackage.qn0
    public void w() {
        k0();
    }

    public void w0() {
        if (!this.F) {
            Float f2 = (Float) this.k.get(CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE);
            if (f2 != null) {
                this.o.set(CaptureRequest.LENS_FOCUS_DISTANCE, Float.valueOf(this.L * f2.floatValue()));
                return;
            }
            throw new NullPointerException(C0201.m82(16758));
        }
    }

    @Override // defpackage.qn0
    public boolean x(String str, int i2, int i3, boolean z2, CamcorderProfile camcorderProfile, int i4, int i5) {
        if (!this.y) {
            p0(str, i2, i3, z2, camcorderProfile);
            try {
                this.w.prepare();
                if (this.n != null) {
                    this.n.close();
                    this.n = null;
                }
                un0 b0 = b0();
                this.b.k(b0.e(), b0.d());
                Surface f0 = f0();
                Surface surface = this.w.getSurface();
                CaptureRequest.Builder createCaptureRequest = this.l.createCaptureRequest(3);
                this.o = createCaptureRequest;
                createCaptureRequest.addTarget(f0);
                this.o.addTarget(surface);
                this.l.createCaptureSession(Arrays.asList(f0, surface), this.f, null);
                this.w.start();
                this.y = true;
                this.a.f(this.x, 0, 0);
                if (this.Q.booleanValue()) {
                    this.m.play(2);
                }
                return true;
            } catch (CameraAccessException | IOException e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }

    public void x0() {
        int i2 = this.N;
        if (i2 == 0) {
            this.o.set(CaptureRequest.CONTROL_AWB_MODE, 1);
        } else if (i2 == 1) {
            this.o.set(CaptureRequest.CONTROL_AWB_MODE, 6);
        } else if (i2 == 2) {
            this.o.set(CaptureRequest.CONTROL_AWB_MODE, 5);
        } else if (i2 == 3) {
            this.o.set(CaptureRequest.CONTROL_AWB_MODE, 8);
        } else if (i2 == 4) {
            this.o.set(CaptureRequest.CONTROL_AWB_MODE, 3);
        } else if (i2 == 5) {
            this.o.set(CaptureRequest.CONTROL_AWB_MODE, 2);
        }
    }

    @Override // defpackage.qn0
    public void y() {
        t0();
    }

    public void y0() {
        float floatValue = (this.M * (((Float) this.k.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue() - 1.0f)) + 1.0f;
        Rect rect = (Rect) this.k.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if (rect != null) {
            int width = rect.width();
            int height = rect.height();
            int i2 = (width - ((int) (((float) width) / floatValue))) / 2;
            int i3 = (height - ((int) (((float) height) / floatValue))) / 2;
            Rect rect2 = new Rect(rect.left + i2, rect.top + i3, rect.right - i2, rect.bottom - i3);
            if (floatValue != 1.0f) {
                this.o.set(CaptureRequest.SCALER_CROP_REGION, rect2);
            } else {
                this.o.set(CaptureRequest.SCALER_CROP_REGION, this.S);
            }
        }
    }

    @Override // defpackage.qn0
    public void z() {
        n0();
    }
}
