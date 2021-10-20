package com.lwansbrough.RCTCamera;

import android.content.ContentValues;
import android.hardware.Camera;
import android.media.CamcorderProfile;
import android.media.MediaActionSound;
import android.media.MediaRecorder;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.lwansbrough.RCTCamera.a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import vigqyno.C0188;
import vigqyno.C0201;

public class RCTCameraModule extends ReactContextBaseJavaModule implements MediaRecorder.OnInfoListener, MediaRecorder.OnErrorListener, LifecycleEventListener {
    public static final int MEDIA_TYPE_IMAGE = 0;
    public static final int MEDIA_TYPE_VIDEO = 0;
    public static final int RCT_CAMERA_ASPECT_FILL = 0;
    public static final int RCT_CAMERA_ASPECT_FIT = 0;
    public static final int RCT_CAMERA_ASPECT_STRETCH = 0;
    public static final int RCT_CAMERA_CAPTURE_MODE_STILL = 0;
    public static final int RCT_CAMERA_CAPTURE_MODE_VIDEO = 0;
    public static final String RCT_CAMERA_CAPTURE_QUALITY_1080P = null;
    public static final String RCT_CAMERA_CAPTURE_QUALITY_480P = null;
    public static final String RCT_CAMERA_CAPTURE_QUALITY_720P = null;
    public static final String RCT_CAMERA_CAPTURE_QUALITY_HIGH = null;
    public static final String RCT_CAMERA_CAPTURE_QUALITY_LOW = null;
    public static final String RCT_CAMERA_CAPTURE_QUALITY_MEDIUM = null;
    public static final String RCT_CAMERA_CAPTURE_QUALITY_PREVIEW = null;
    public static final int RCT_CAMERA_CAPTURE_TARGET_CAMERA_ROLL = 0;
    public static final int RCT_CAMERA_CAPTURE_TARGET_DISK = 0;
    public static final int RCT_CAMERA_CAPTURE_TARGET_MEMORY = 0;
    public static final int RCT_CAMERA_CAPTURE_TARGET_TEMP = 0;
    public static final int RCT_CAMERA_FLASH_MODE_AUTO = 0;
    public static final int RCT_CAMERA_FLASH_MODE_OFF = 0;
    public static final int RCT_CAMERA_FLASH_MODE_ON = 0;
    public static final int RCT_CAMERA_ORIENTATION_AUTO = 0;
    public static final int RCT_CAMERA_ORIENTATION_LANDSCAPE_LEFT = 0;
    public static final int RCT_CAMERA_ORIENTATION_LANDSCAPE_RIGHT = 0;
    public static final int RCT_CAMERA_ORIENTATION_PORTRAIT = 0;
    public static final int RCT_CAMERA_ORIENTATION_PORTRAIT_UPSIDE_DOWN = 0;
    public static final int RCT_CAMERA_TORCH_MODE_AUTO = 0;
    public static final int RCT_CAMERA_TORCH_MODE_OFF = 0;
    public static final int RCT_CAMERA_TORCH_MODE_ON = 0;
    public static final int RCT_CAMERA_TYPE_BACK = 0;
    public static final int RCT_CAMERA_TYPE_FRONT = 0;
    private static final String TAG = null;
    private static ReactApplicationContext _reactContext;
    public static final String a = null;
    public static final String b = null;
    public static final String c = null;
    public static final String d = null;
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
    public static final String q = null;
    public static final String r = null;
    public static final String s = null;
    public static final String t = null;
    public static final String u = null;
    public static final String v = null;
    private long MRStartTime;
    private f _sensorOrientationChecker;
    private Camera mCamera = null;
    private MediaRecorder mMediaRecorder;
    private ReadableMap mRecordingOptions;
    private Promise mRecordingPromise = null;
    private Boolean mSafeToCapture = Boolean.TRUE;
    private File mVideoFile;

    class a extends HashMap<String, Object> {

        /* access modifiers changed from: package-private */
        /* renamed from: com.lwansbrough.RCTCamera.RCTCameraModule$a$a  reason: collision with other inner class name */
        public class C0118a extends HashMap<String, Object> {
            public C0118a() {
                put(C0201.m82(19184), 2);
                put(C0201.m82(19185), 1);
                put(C0201.m82(19186), 0);
            }
        }

        /* access modifiers changed from: package-private */
        public class b extends HashMap<String, Object> {
            public b() {
            }
        }

        /* access modifiers changed from: package-private */
        public class c extends HashMap<String, Object> {
            public c() {
                put(C0201.m82(20191), 1);
                put(C0201.m82(20192), 2);
            }
        }

        /* access modifiers changed from: package-private */
        public class d extends HashMap<String, Object> {
            public d() {
                String r2 = C0201.m82(20229);
                put(r2, r2);
                String r22 = C0201.m82(20230);
                put(r22, r22);
                String r23 = C0201.m82(20231);
                put(r23, r23);
                put(C0201.m82(20232), r23);
                String r24 = C0201.m82(20233);
                put(r24, r24);
                String r25 = C0201.m82(20234);
                put(r25, r25);
                String r26 = C0201.m82(20235);
                put(r26, r26);
                String r27 = C0201.m82(20236);
                put(r27, r27);
            }
        }

        /* access modifiers changed from: package-private */
        public class e extends HashMap<String, Object> {
            public e() {
                put(C0201.m82(19988), 0);
                put(C0201.m82(19989), 1);
            }
        }

        /* access modifiers changed from: package-private */
        public class f extends HashMap<String, Object> {
            public f() {
                put(C0201.m82(20041), 0);
                put(C0201.m82(20042), 1);
                put(C0201.m82(20043), 2);
                put(C0201.m82(20044), 3);
            }
        }

        /* access modifiers changed from: package-private */
        public class g extends HashMap<String, Object> {
            public g() {
                put(C0201.m82(19869), Integer.valueOf((int) C0188.f24));
                put(C0201.m82(19870), 1);
                put(C0201.m82(19871), 3);
                put(C0201.m82(19872), 0);
                put(C0201.m82(19873), 2);
            }
        }

        /* access modifiers changed from: package-private */
        public class h extends HashMap<String, Object> {
            public h() {
                put(C0201.m82(19889), 0);
                put(C0201.m82(19890), 1);
                put(C0201.m82(19891), 2);
            }
        }

        /* access modifiers changed from: package-private */
        public class i extends HashMap<String, Object> {
            public i() {
                put(C0201.m82(19785), 0);
                put(C0201.m82(19786), 1);
                put(C0201.m82(19787), 2);
            }
        }

        public a(RCTCameraModule rCTCameraModule) {
            put(C0201.m82(3305), a());
            put(C0201.m82(3306), b());
            put(C0201.m82(3307), j());
            put(C0201.m82(3308), d());
            put(C0201.m82(3309), c());
            put(C0201.m82(3310), e());
            put(C0201.m82(3311), g());
            put(C0201.m82(3312), f());
            put(C0201.m82(3313), i());
        }

        private Map<String, Object> a() {
            return Collections.unmodifiableMap(new C0118a());
        }

        private Map<String, Object> b() {
            return Collections.unmodifiableMap(new b());
        }

        private Map<String, Object> c() {
            return Collections.unmodifiableMap(new e());
        }

        private Map<String, Object> d() {
            return Collections.unmodifiableMap(new d());
        }

        private Map<String, Object> e() {
            return Collections.unmodifiableMap(new f());
        }

        private Map<String, Object> f() {
            return Collections.unmodifiableMap(new h());
        }

        private Map<String, Object> g() {
            return Collections.unmodifiableMap(new g());
        }

        private Map<String, Object> i() {
            return Collections.unmodifiableMap(new i());
        }

        private Map<String, Object> j() {
            return Collections.unmodifiableMap(new c());
        }
    }

    class b implements g {
        public final /* synthetic */ ReadableMap a;
        public final /* synthetic */ Promise b;

        public b(ReadableMap readableMap, Promise promise) {
            this.a = readableMap;
            this.b = promise;
        }

        @Override // com.lwansbrough.RCTCamera.g
        public void a() {
            int b2 = RCTCameraModule.this._sensorOrientationChecker.b();
            RCTCameraModule.this._sensorOrientationChecker.f();
            RCTCameraModule.this._sensorOrientationChecker.c();
            RCTCameraModule.this.captureWithOrientation(this.a, this.b, b2);
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements Camera.PictureCallback {
        public final /* synthetic */ ReadableMap a;
        public final /* synthetic */ Promise b;

        class a implements Runnable {
            public final /* synthetic */ byte[] a;

            public a(byte[] bArr) {
                this.a = bArr;
            }

            public void run() {
                RCTCameraModule rCTCameraModule = RCTCameraModule.this;
                a aVar = new a(this.a);
                c cVar = c.this;
                rCTCameraModule.processImage(aVar, cVar.a, cVar.b);
            }
        }

        public c(ReadableMap readableMap, Promise promise) {
            this.a = readableMap;
            this.b = promise;
        }

        public void onPictureTaken(byte[] bArr, Camera camera) {
            camera.stopPreview();
            camera.startPreview();
            AsyncTask.execute(new a(bArr));
            RCTCameraModule.this.mSafeToCapture = Boolean.TRUE;
        }
    }

    /* access modifiers changed from: package-private */
    public class d implements Camera.ShutterCallback {
        public final /* synthetic */ Camera a;

        public d(RCTCameraModule rCTCameraModule, Camera camera) {
            this.a = camera;
        }

        public void onShutter() {
            try {
                this.a.setPreviewCallback(null);
                this.a.setPreviewTexture(null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class e implements MediaScannerConnection.OnScanCompletedListener {
        public final /* synthetic */ WritableMap a;
        public final /* synthetic */ Promise b;

        public e(RCTCameraModule rCTCameraModule, WritableMap writableMap, Promise promise) {
            this.a = writableMap;
            this.b = promise;
        }

        public void onScanCompleted(String str, Uri uri) {
            if (uri != null) {
                this.a.putString(C0201.m82(3502), uri.toString());
            }
            this.b.resolve(this.a);
        }
    }

    static {
        C0201.m83(RCTCameraModule.class, 99);
    }

    public RCTCameraModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        _reactContext = reactApplicationContext;
        this._sensorOrientationChecker = new f(reactApplicationContext);
        _reactContext.addLifecycleEventListener(this);
    }

    private void addToMediaStore(String str) {
        MediaScannerConnection.scanFile(_reactContext, new String[]{str}, null, null);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void captureWithOrientation(ReadableMap readableMap, Promise promise, int i2) {
        b h2 = b.h();
        String r1 = C0201.m82(32160);
        Camera a2 = h2.a(readableMap.getInt(r1));
        if (a2 == null) {
            promise.reject(C0201.m82(32161));
        } else if (readableMap.getInt(C0201.m82(32162)) == 1) {
            record(readableMap, promise, i2);
        } else {
            b h3 = b.h();
            int i3 = readableMap.getInt(r1);
            String r4 = C0201.m82(32163);
            h3.w(i3, readableMap.getString(r4));
            String r2 = C0201.m82(32164);
            if (readableMap.hasKey(r2) && readableMap.getBoolean(r2)) {
                new MediaActionSound().play(0);
            }
            if (readableMap.hasKey(r4)) {
                b.h().w(readableMap.getInt(r1), readableMap.getString(r4));
            }
            b.h().b(readableMap.getInt(r1), i2);
            a2.setPreviewCallback(null);
            c cVar = new c(readableMap, promise);
            d dVar = new d(this, a2);
            if (this.mSafeToCapture.booleanValue()) {
                try {
                    a2.takePicture(dVar, null, cVar);
                    this.mSafeToCapture = Boolean.FALSE;
                } catch (RuntimeException e2) {
                    Log.e(C0201.m82(32165), C0201.m82(32166), e2);
                }
            }
        }
    }

    public static byte[] convertFileToByteArray(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[8192];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private File getOutputCameraRollFile(int i2) {
        return getOutputFile(i2, Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM));
    }

    private File getOutputFile(int i2, File file) {
        String str;
        boolean exists = file.exists();
        String r2 = C0201.m82(32167);
        if (exists || file.mkdirs()) {
            String format = String.format(C0201.m82(32170), new SimpleDateFormat(C0201.m82(32169)).format(new Date()));
            if (i2 == 1) {
                str = String.format(C0201.m82(32171), format);
            } else if (i2 == 2) {
                str = String.format(C0201.m82(32172), format);
            } else {
                Log.e(r2, C0201.m82(32174) + i2);
                return null;
            }
            return new File(String.format(C0201.m82(32173), file.getPath(), File.separator, str));
        }
        Log.e(r2, C0201.m82(32168) + file.getAbsolutePath());
        return null;
    }

    private File getOutputMediaFile(int i2) {
        String str;
        if (i2 == 1) {
            str = Environment.DIRECTORY_PICTURES;
        } else if (i2 == 2) {
            str = Environment.DIRECTORY_MOVIES;
        } else {
            Log.e(C0201.m82(32176), C0201.m82(32175) + i2);
            return null;
        }
        return getOutputFile(i2, Environment.getExternalStoragePublicDirectory(str));
    }

    public static ReactApplicationContext getReactContextSingleton() {
        return _reactContext;
    }

    private File getTempMediaFile(int i2) {
        String r0 = C0201.m82(32177);
        try {
            String format = new SimpleDateFormat(C0201.m82(32178)).format(new Date());
            File cacheDir = _reactContext.getCacheDir();
            if (i2 == 1) {
                return File.createTempFile(C0201.m82(32179) + format, C0201.m82(32180), cacheDir);
            } else if (i2 == 2) {
                return File.createTempFile(C0201.m82(32181) + format, C0201.m82(32182), cacheDir);
            } else {
                Log.e(r0, C0201.m82(32183) + i2);
                return null;
            }
        } catch (Exception e2) {
            Log.e(r0, e2.getMessage());
            return null;
        }
    }

    private Throwable prepareMediaRecorder(ReadableMap readableMap, int i2) {
        CamcorderProfile x = b.h().x(readableMap.getInt(C0201.m82(32184)), readableMap.getString(C0201.m82(32185)));
        if (x == null) {
            return new RuntimeException(C0201.m82(32186));
        }
        this.mCamera.unlock();
        MediaRecorder mediaRecorder = new MediaRecorder();
        this.mMediaRecorder = mediaRecorder;
        mediaRecorder.setOnInfoListener(this);
        this.mMediaRecorder.setOnErrorListener(this);
        this.mMediaRecorder.setCamera(this.mCamera);
        this.mMediaRecorder.setAudioSource(5);
        this.mMediaRecorder.setVideoSource(1);
        if (i2 == 0) {
            this.mMediaRecorder.setOrientationHint(90);
        } else if (i2 == 1) {
            this.mMediaRecorder.setOrientationHint(0);
        } else if (i2 == 2) {
            this.mMediaRecorder.setOrientationHint(270);
        } else if (i2 == 3) {
            this.mMediaRecorder.setOrientationHint(180);
        }
        x.fileFormat = 2;
        this.mMediaRecorder.setProfile(x);
        this.mVideoFile = null;
        int i3 = readableMap.getInt(C0201.m82(32187));
        if (i3 == 0) {
            this.mVideoFile = getTempMediaFile(2);
        } else if (i3 == 2) {
            this.mVideoFile = getOutputCameraRollFile(2);
        } else if (i3 != 3) {
            this.mVideoFile = getOutputMediaFile(2);
        } else {
            this.mVideoFile = getTempMediaFile(2);
        }
        File file = this.mVideoFile;
        if (file == null) {
            return new RuntimeException(C0201.m82(32188));
        }
        this.mMediaRecorder.setOutputFile(file.getPath());
        String r0 = C0201.m82(32189);
        if (readableMap.hasKey(r0)) {
            this.mMediaRecorder.setMaxDuration(readableMap.getInt(r0) * C0188.f18);
        }
        String r02 = C0201.m82(32190);
        if (readableMap.hasKey(r02)) {
            this.mMediaRecorder.setMaxFileSize((long) readableMap.getInt(r02));
        }
        try {
            this.mMediaRecorder.prepare();
            return null;
        } catch (Exception e2) {
            Log.e(C0201.m82(32191), C0201.m82(32192), e2);
            releaseMediaRecorder();
            return e2;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private synchronized void processImage(a aVar, ReadableMap readableMap, Promise promise) {
        boolean z;
        boolean z2 = false;
        if (readableMap.hasKey(v) && readableMap.getBoolean(i)) {
            try {
                aVar.c();
            } catch (a.b e2) {
                promise.reject(l, e2);
            }
        }
        double e3 = (double) aVar.e();
        double d2 = (double) aVar.d();
        Double.isNaN(e3);
        Double.isNaN(d2);
        double d3 = e3 / d2;
        try {
            int i2 = readableMap.getInt(h);
            double l2 = (double) b.h().l(i2);
            double k2 = (double) b.h().k(i2);
            Double.isNaN(l2);
            Double.isNaN(k2);
            double d4 = l2 / k2;
            z = ((d4 > 1.0d ? 1 : (d4 == 1.0d ? 0 : -1)) > 0) != ((d3 > 1.0d ? 1 : (d3 == 1.0d ? 0 : -1)) > 0);
            d3 = d4;
        } catch (IllegalArgumentException unused) {
            z = false;
        }
        if (readableMap.hasKey(j) && readableMap.getBoolean(q)) {
            if (z) {
                d3 = 1.0d / d3;
            }
            try {
                aVar.b(d3);
            } catch (IllegalArgumentException e4) {
                promise.reject(b, e4);
            }
        }
        if (readableMap.hasKey(p) && readableMap.getBoolean(s)) {
            z2 = true;
        }
        if (z2) {
            try {
                aVar.f();
            } catch (a.b e5) {
                promise.reject(c, e5);
            }
        }
        int i3 = 80;
        if (readableMap.hasKey(e)) {
            i3 = readableMap.getInt(t);
        }
        int d5 = z ? aVar.d() : aVar.e();
        int e6 = z ? aVar.e() : aVar.d();
        int i4 = readableMap.getInt(u);
        if (i4 == 0) {
            String j2 = aVar.j(i3);
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString(r, j2);
            writableNativeMap.putInt(g, d5);
            writableNativeMap.putInt(d, e6);
            promise.resolve(writableNativeMap);
        } else if (i4 == 1) {
            File outputMediaFile = getOutputMediaFile(1);
            if (outputMediaFile == null) {
                promise.reject(a);
                return;
            }
            try {
                aVar.m(outputMediaFile, readableMap, i3);
                resolveImage(outputMediaFile, d5, e6, promise, false);
            } catch (IOException e7) {
                promise.reject(f, e7);
            }
        } else if (i4 == 2) {
            File outputCameraRollFile = getOutputCameraRollFile(1);
            if (outputCameraRollFile == null) {
                promise.reject(k);
                return;
            }
            try {
                aVar.m(outputCameraRollFile, readableMap, i3);
                addToMediaStore(outputCameraRollFile.getAbsolutePath());
                resolveImage(outputCameraRollFile, d5, e6, promise, true);
            } catch (IOException | NullPointerException e8) {
                promise.reject(o, e8);
            }
        } else if (i4 == 3) {
            File tempMediaFile = getTempMediaFile(1);
            if (tempMediaFile == null) {
                promise.reject(n);
                return;
            }
            try {
                aVar.m(tempMediaFile, readableMap, i3);
                resolveImage(tempMediaFile, d5, e6, promise, false);
            } catch (IOException e9) {
                promise.reject(m, e9);
            }
        }
    }

    private void record(ReadableMap readableMap, Promise promise, int i2) {
        if (this.mRecordingPromise == null) {
            Camera a2 = b.h().a(readableMap.getInt(C0201.m82(32193)));
            this.mCamera = a2;
            if (a2 == null) {
                promise.reject(new RuntimeException(C0201.m82(32194)));
                return;
            }
            Throwable prepareMediaRecorder = prepareMediaRecorder(readableMap, i2);
            if (prepareMediaRecorder != null) {
                promise.reject(prepareMediaRecorder);
                return;
            }
            try {
                this.mMediaRecorder.start();
                this.MRStartTime = System.currentTimeMillis();
                this.mRecordingOptions = readableMap;
                this.mRecordingPromise = promise;
            } catch (Exception e2) {
                Log.e(C0201.m82(32195), C0201.m82(32196), e2);
                promise.reject(e2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009e, code lost:
        if (r4 != 3) goto L_0x018b;
     */
    private void releaseMediaRecorder() {
        long currentTimeMillis = System.currentTimeMillis() - this.MRStartTime;
        String r2 = C0201.m82(32197);
        if (currentTimeMillis < 1500) {
            try {
                Thread.sleep(1500 - currentTimeMillis);
            } catch (InterruptedException e2) {
                Log.e(r2, C0201.m82(32198), e2);
            }
        }
        MediaRecorder mediaRecorder = this.mMediaRecorder;
        if (mediaRecorder != null) {
            try {
                mediaRecorder.stop();
            } catch (RuntimeException e3) {
                Log.e(r2, C0201.m82(32199), e3);
            }
            this.mMediaRecorder.reset();
            this.mMediaRecorder.release();
            this.mMediaRecorder = null;
        }
        Camera camera = this.mCamera;
        if (camera != null) {
            camera.lock();
        }
        if (this.mRecordingPromise != null) {
            File file = new File(this.mVideoFile.getPath());
            if (!file.exists()) {
                this.mRecordingPromise.reject(new RuntimeException(C0201.m82(32200)));
                this.mRecordingPromise = null;
                return;
            }
            file.setReadable(true, false);
            file.setWritable(true, false);
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            int i2 = this.mRecordingOptions.getInt(C0201.m82(32201));
            if (i2 != 0) {
                String r0 = C0201.m82(32202);
                if (i2 != 1) {
                    if (i2 == 2) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(C0201.m82(32203), this.mVideoFile.getPath());
                        ReadableMap readableMap = this.mRecordingOptions;
                        String r5 = C0201.m82(32204);
                        contentValues.put(r5, readableMap.hasKey(r5) ? this.mRecordingOptions.getString(r5) : C0201.m82(32205));
                        ReadableMap readableMap2 = this.mRecordingOptions;
                        String r52 = C0201.m82(32206);
                        if (readableMap2.hasKey(r52)) {
                            contentValues.put(r52, Boolean.valueOf(this.mRecordingOptions.hasKey(r52)));
                        }
                        ReadableMap readableMap3 = this.mRecordingOptions;
                        String r53 = C0201.m82(32207);
                        if (readableMap3.hasKey(r53)) {
                            contentValues.put(r53, this.mRecordingOptions.getString(r53));
                        }
                        ReadableMap readableMap4 = this.mRecordingOptions;
                        String r54 = C0201.m82(32208);
                        if (readableMap4.hasKey(r54)) {
                            contentValues.put(r54, this.mRecordingOptions.getString(r54));
                        }
                        contentValues.put(C0201.m82(32209), C0201.m82(32210));
                        _reactContext.getContentResolver().insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues);
                        addToMediaStore(this.mVideoFile.getAbsolutePath());
                        writableNativeMap.putString(r0, Uri.fromFile(this.mVideoFile).toString());
                        this.mRecordingPromise.resolve(writableNativeMap);
                    }
                }
                writableNativeMap.putString(r0, Uri.fromFile(this.mVideoFile).toString());
                this.mRecordingPromise.resolve(writableNativeMap);
            } else {
                writableNativeMap.putString(C0201.m82(32211), new String(convertFileToByteArray(this.mVideoFile), 2));
                this.mRecordingPromise.resolve(writableNativeMap);
                file.delete();
            }
            this.mRecordingPromise = null;
        }
    }

    private void resolveImage(File file, int i2, int i3, Promise promise, boolean z) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString(C0201.m82(32212), Uri.fromFile(file).toString());
        writableNativeMap.putInt(C0201.m82(32213), i2);
        writableNativeMap.putInt(C0201.m82(32214), i3);
        if (z) {
            MediaScannerConnection.scanFile(_reactContext, new String[]{file.getAbsolutePath()}, null, new e(this, writableNativeMap, promise));
            return;
        }
        promise.resolve(writableNativeMap);
    }

    @ReactMethod
    public void capture(ReadableMap readableMap, Promise promise) {
        if (b.h() == null) {
            promise.reject(C0201.m82(32215));
            return;
        }
        String r0 = C0201.m82(32216);
        int i2 = readableMap.hasKey(r0) ? readableMap.getInt(r0) : b.h().i();
        if (i2 == Integer.MAX_VALUE) {
            this._sensorOrientationChecker.d();
            this._sensorOrientationChecker.e(new b(readableMap, promise));
            return;
        }
        captureWithOrientation(readableMap, promise, i2);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return Collections.unmodifiableMap(new a(this));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(32217);
    }

    @ReactMethod
    public void hasFlash(ReadableMap readableMap, Promise promise) {
        Camera a2 = b.h().a(readableMap.getInt(C0201.m82(32218)));
        if (a2 == null) {
            promise.reject(C0201.m82(32219));
            return;
        }
        List<String> supportedFlashModes = a2.getParameters().getSupportedFlashModes();
        promise.resolve(Boolean.valueOf(supportedFlashModes != null && !supportedFlashModes.isEmpty()));
    }

    public void onError(MediaRecorder mediaRecorder, int i2, int i3) {
        if (this.mRecordingPromise != null) {
            releaseMediaRecorder();
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        if (this.mRecordingPromise != null) {
            releaseMediaRecorder();
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.mSafeToCapture = Boolean.TRUE;
    }

    public void onInfo(MediaRecorder mediaRecorder, int i2, int i3) {
        if ((i2 == 800 || i2 == 801) && this.mRecordingPromise != null) {
            releaseMediaRecorder();
        }
    }

    @ReactMethod
    public void setZoom(ReadableMap readableMap, int i2) {
        Camera a2;
        b h2 = b.h();
        if (h2 != null && (a2 = h2.a(readableMap.getInt(C0201.m82(32220)))) != null) {
            Camera.Parameters parameters = a2.getParameters();
            int maxZoom = parameters.getMaxZoom();
            if (parameters.isZoomSupported() && i2 >= 0 && i2 < maxZoom) {
                parameters.setZoom(i2);
                try {
                    a2.setParameters(parameters);
                } catch (RuntimeException e2) {
                    Log.e(C0201.m82(32221), C0201.m82(32222), e2);
                }
            }
        }
    }

    @ReactMethod
    public void stopCapture(Promise promise) {
        if (this.mRecordingPromise != null) {
            releaseMediaRecorder();
            promise.resolve(C0201.m82(32223));
            return;
        }
        promise.resolve(C0201.m82(32224));
    }
}
