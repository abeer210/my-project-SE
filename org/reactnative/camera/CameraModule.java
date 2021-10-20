package org.reactnative.camera;

import android.content.pm.PackageInfo;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.n0;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import vigqyno.C0201;

public class CameraModule extends ReactContextBaseJavaModule {
    public static final int GOOGLE_VISION_BARCODE_MODE_ALTERNATE = 0;
    public static final int GOOGLE_VISION_BARCODE_MODE_INVERTED = 0;
    public static final int GOOGLE_VISION_BARCODE_MODE_NORMAL = 0;
    private static final String TAG = null;
    public static final Map<String, Object> VALID_BARCODE_TYPES = Collections.unmodifiableMap(new e());
    public static final int VIDEO_1080P = 0;
    public static final int VIDEO_2160P = 0;
    public static final int VIDEO_480P = 0;
    public static final int VIDEO_4x3 = 0;
    public static final int VIDEO_720P = 0;
    private yz2 mScopedContext;

    class a implements n0 {
        public final /* synthetic */ int a;
        public final /* synthetic */ Promise b;

        public a(CameraModule cameraModule, int i, Promise promise) {
            this.a = i;
            this.b = promise;
        }

        @Override // com.facebook.react.uimanager.n0
        public void a(com.facebook.react.uimanager.m mVar) {
            try {
                d dVar = (d) mVar.w(this.a);
                WritableArray createArray = Arguments.createArray();
                if (dVar.p()) {
                    for (ln0 ln0 : dVar.getSupportedAspectRatios()) {
                        createArray.pushString(ln0.toString());
                    }
                    this.b.resolve(createArray);
                    return;
                }
                this.b.reject(C0201.m82(7302), C0201.m82(7303));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    class b implements n0 {
        public final /* synthetic */ int a;
        public final /* synthetic */ Promise b;

        public b(CameraModule cameraModule, int i, Promise promise) {
            this.a = i;
            this.b = promise;
        }

        @Override // com.facebook.react.uimanager.n0
        public void a(com.facebook.react.uimanager.m mVar) {
            String r0 = C0201.m82(7367);
            String r1 = C0201.m82(7368);
            try {
                WritableArray createArray = Arguments.createArray();
                for (Properties properties : ((d) mVar.w(this.a)).getCameraIds()) {
                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                    writableNativeMap.putString(r1, properties.getProperty(r1));
                    writableNativeMap.putInt(r0, Integer.valueOf(properties.getProperty(r0)).intValue());
                    createArray.pushMap(writableNativeMap);
                }
                this.b.resolve(createArray);
            } catch (Exception e) {
                e.printStackTrace();
                this.b.reject(C0201.m82(7369), e.getMessage());
            }
        }
    }

    class c implements n0 {
        public final /* synthetic */ int a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Promise c;

        public c(CameraModule cameraModule, int i, String str, Promise promise) {
            this.a = i;
            this.b = str;
            this.c = promise;
        }

        @Override // com.facebook.react.uimanager.n0
        public void a(com.facebook.react.uimanager.m mVar) {
            try {
                d dVar = (d) mVar.w(this.a);
                WritableArray createArray = Arguments.createArray();
                if (dVar.p()) {
                    for (un0 un0 : dVar.o(ln0.j(this.b))) {
                        createArray.pushString(un0.toString());
                    }
                    this.c.resolve(createArray);
                    return;
                }
                this.c.reject(C0201.m82(7396), C0201.m82(7397));
            } catch (Exception unused) {
                this.c.reject(C0201.m82(7398), C0201.m82(7399));
            }
        }
    }

    class d implements n0 {
        public final /* synthetic */ int a;
        public final /* synthetic */ Promise b;

        public d(CameraModule cameraModule, int i, Promise promise) {
            this.a = i;
            this.b = promise;
        }

        @Override // com.facebook.react.uimanager.n0
        public void a(com.facebook.react.uimanager.m mVar) {
            try {
                WritableArray createArray = Arguments.createArray();
                Iterator<int[]> it = ((d) mVar.w(this.a)).getSupportedPreviewFpsRange().iterator();
                while (it.hasNext()) {
                    int[] next = it.next();
                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                    writableNativeMap.putInt(C0201.m82(7463), next[0]);
                    writableNativeMap.putInt(C0201.m82(7464), next[1]);
                    createArray.pushMap(writableNativeMap);
                }
                this.b.resolve(createArray);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    static class e extends HashMap<String, Object> {
        public e() {
            put(C0201.m82(7539), f62.AZTEC.toString());
            put(C0201.m82(7540), f62.EAN_13.toString());
            put(C0201.m82(7541), f62.EAN_8.toString());
            put(C0201.m82(7542), f62.QR_CODE.toString());
            put(C0201.m82(7543), f62.PDF_417.toString());
            put(C0201.m82(7544), f62.UPC_E.toString());
            put(C0201.m82(7545), f62.DATA_MATRIX.toString());
            put(C0201.m82(7546), f62.CODE_39.toString());
            put(C0201.m82(7547), f62.CODE_93.toString());
            put(C0201.m82(7548), f62.ITF.toString());
            put(C0201.m82(7549), f62.CODABAR.toString());
            put(C0201.m82(7550), f62.CODE_128.toString());
            put(C0201.m82(7551), f62.MAXICODE.toString());
            put(C0201.m82(7552), f62.RSS_14.toString());
            put(C0201.m82(7553), f62.RSS_EXPANDED.toString());
            put(C0201.m82(7554), f62.UPC_A.toString());
            put(C0201.m82(7555), f62.UPC_EAN_EXTENSION.toString());
        }
    }

    class f extends HashMap<String, Object> {

        class a extends HashMap<String, Object> {

            /* access modifiers changed from: package-private */
            /* renamed from: org.reactnative.camera.CameraModule$f$a$a  reason: collision with other inner class name */
            public class C0162a extends HashMap<String, Object> {
                public C0162a() {
                    put(C0201.m82(2768), Integer.valueOf(org.reactnative.facedetector.b.m));
                    put(C0201.m82(2769), Integer.valueOf(org.reactnative.facedetector.b.l));
                }
            }

            /* access modifiers changed from: package-private */
            public class b extends HashMap<String, Object> {
                public b() {
                    put(C0201.m82(2699), Integer.valueOf(org.reactnative.facedetector.b.h));
                    put(C0201.m82(2700), Integer.valueOf(org.reactnative.facedetector.b.i));
                }
            }

            /* access modifiers changed from: package-private */
            public class c extends HashMap<String, Object> {
                public c() {
                    put(C0201.m82(3385), Integer.valueOf(org.reactnative.facedetector.b.j));
                    put(C0201.m82(3386), Integer.valueOf(org.reactnative.facedetector.b.k));
                }
            }

            public a() {
                put(C0201.m82(1975), c());
                put(C0201.m82(1976), b());
                put(C0201.m82(1977), a());
            }

            private Map<String, Object> a() {
                return Collections.unmodifiableMap(new b());
            }

            private Map<String, Object> b() {
                return Collections.unmodifiableMap(new c());
            }

            private Map<String, Object> c() {
                return Collections.unmodifiableMap(new C0162a());
            }
        }

        class b extends HashMap<String, Object> {
            public b() {
                put(C0201.m82(1591), wy2.b);
                put(C0201.m82(1592), f.this.e());
            }
        }

        class c extends HashMap<String, Object> {
            public c() {
                put(C0201.m82(1586), 0);
                put(C0201.m82(1587), 1);
                put(C0201.m82(1588), 2);
                put(C0201.m82(1589), 3);
                put(C0201.m82(1590), 4);
            }
        }

        /* access modifiers changed from: package-private */
        public class d extends HashMap<String, Object> {
            public d() {
                put(C0201.m82(1773), 1);
                put(C0201.m82(1774), 0);
            }
        }

        /* access modifiers changed from: package-private */
        public class e extends HashMap<String, Object> {
            public e() {
                put(C0201.m82(1738), 0);
                put(C0201.m82(1739), 1);
                put(C0201.m82(1740), 3);
                put(C0201.m82(1741), 2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: org.reactnative.camera.CameraModule$f$f  reason: collision with other inner class name */
        public class C0163f extends HashMap<String, Object> {
            public C0163f() {
                put(C0201.m82(1407), Boolean.TRUE);
                put(C0201.m82(1408), Boolean.FALSE);
            }
        }

        /* access modifiers changed from: package-private */
        public class g extends HashMap<String, Object> {
            public g() {
                put(C0201.m82(1354), 0);
                put(C0201.m82(1355), 1);
                put(C0201.m82(1356), 2);
                put(C0201.m82(1357), 3);
                put(C0201.m82(1358), 4);
                put(C0201.m82(1359), 5);
            }
        }

        /* access modifiers changed from: package-private */
        public class h extends HashMap<String, Object> {
            public h() {
                put(C0201.m82(1491), 0);
                put(C0201.m82(1492), 1);
                put(C0201.m82(1493), 2);
                put(C0201.m82(1494), 3);
                put(C0201.m82(1495), 4);
            }
        }

        /* access modifiers changed from: package-private */
        public class i extends HashMap<String, Object> {
            public i() {
                put(C0201.m82(1463), 0);
                put(C0201.m82(1464), 1);
                put(C0201.m82(1465), 2);
            }
        }

        public f(CameraModule cameraModule) {
            put(C0201.m82(7593), f());
            put(C0201.m82(7594), d());
            put(C0201.m82(7595), b());
            put(C0201.m82(7596), i());
            put(C0201.m82(7597), g());
            put(C0201.m82(7598), c());
            put(C0201.m82(7599), Collections.unmodifiableMap(new a()));
            put(C0201.m82(7600), Collections.unmodifiableMap(new b()));
            put(C0201.m82(7601), Collections.unmodifiableMap(new c()));
        }

        private Map<String, Object> b() {
            return Collections.unmodifiableMap(new C0163f());
        }

        private Map<String, Object> c() {
            return CameraModule.VALID_BARCODE_TYPES;
        }

        private Map<String, Object> d() {
            return Collections.unmodifiableMap(new e());
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private Map<String, Object> e() {
            return Collections.unmodifiableMap(new i());
        }

        private Map<String, Object> f() {
            return Collections.unmodifiableMap(new d());
        }

        private Map<String, Object> g() {
            return Collections.unmodifiableMap(new h());
        }

        private Map<String, Object> i() {
            return Collections.unmodifiableMap(new g());
        }
    }

    class g implements n0 {
        public final /* synthetic */ int a;

        public g(CameraModule cameraModule, int i) {
            this.a = i;
        }

        @Override // com.facebook.react.uimanager.n0
        public void a(com.facebook.react.uimanager.m mVar) {
            try {
                d dVar = (d) mVar.w(this.a);
                if (dVar.p()) {
                    dVar.q();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    class h implements n0 {
        public final /* synthetic */ int a;

        public h(CameraModule cameraModule, int i) {
            this.a = i;
        }

        @Override // com.facebook.react.uimanager.n0
        public void a(com.facebook.react.uimanager.m mVar) {
            try {
                d dVar = (d) mVar.w(this.a);
                if (dVar.p()) {
                    dVar.t();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    class i implements n0 {
        public final /* synthetic */ int a;
        public final /* synthetic */ ReadableMap b;
        public final /* synthetic */ Promise c;
        public final /* synthetic */ File d;

        public i(CameraModule cameraModule, int i, ReadableMap readableMap, Promise promise, File file) {
            this.a = i;
            this.b = readableMap;
            this.c = promise;
            this.d = file;
        }

        @Override // com.facebook.react.uimanager.n0
        public void a(com.facebook.react.uimanager.m mVar) {
            d dVar = (d) mVar.w(this.a);
            try {
                if (dVar.p()) {
                    dVar.t0(this.b, this.c, this.d);
                } else {
                    this.c.reject(C0201.m82(7690), C0201.m82(7691));
                }
            } catch (Exception e) {
                this.c.reject(C0201.m82(7692), e.getMessage());
            }
        }
    }

    class j implements n0 {
        public final /* synthetic */ int a;
        public final /* synthetic */ ReadableMap b;
        public final /* synthetic */ Promise c;
        public final /* synthetic */ File d;

        public j(CameraModule cameraModule, int i, ReadableMap readableMap, Promise promise, File file) {
            this.a = i;
            this.b = readableMap;
            this.c = promise;
            this.d = file;
        }

        @Override // com.facebook.react.uimanager.n0
        public void a(com.facebook.react.uimanager.m mVar) {
            try {
                d dVar = (d) mVar.w(this.a);
                if (dVar.p()) {
                    dVar.n0(this.b, this.c, this.d);
                } else {
                    this.c.reject(C0201.m82(7730), C0201.m82(7731));
                }
            } catch (Exception e) {
                this.c.reject(C0201.m82(7732), e.getMessage());
            }
        }
    }

    class k implements n0 {
        public final /* synthetic */ int a;

        public k(CameraModule cameraModule, int i) {
            this.a = i;
        }

        @Override // com.facebook.react.uimanager.n0
        public void a(com.facebook.react.uimanager.m mVar) {
            try {
                d dVar = (d) mVar.w(this.a);
                if (dVar.p()) {
                    dVar.y();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    class l implements n0 {
        public final /* synthetic */ int a;

        public l(CameraModule cameraModule, int i) {
            this.a = i;
        }

        @Override // com.facebook.react.uimanager.n0
        public void a(com.facebook.react.uimanager.m mVar) {
            try {
                d dVar = (d) mVar.w(this.a);
                if (dVar.p()) {
                    dVar.r();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    class m implements n0 {
        public final /* synthetic */ int a;

        public m(CameraModule cameraModule, int i) {
            this.a = i;
        }

        @Override // com.facebook.react.uimanager.n0
        public void a(com.facebook.react.uimanager.m mVar) {
            try {
                d dVar = (d) mVar.w(this.a);
                if (dVar.p()) {
                    dVar.u();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    static {
        C0201.m83(CameraModule.class, 250);
    }

    public CameraModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mScopedContext = new yz2(reactApplicationContext);
    }

    @ReactMethod
    public void checkIfRecordAudioPermissionsAreDefined(Promise promise) {
        try {
            PackageInfo packageInfo = getCurrentActivity().getPackageManager().getPackageInfo(getReactApplicationContext().getPackageName(), 4096);
            if (packageInfo.requestedPermissions != null) {
                for (String str : packageInfo.requestedPermissions) {
                    if (str.equals(C0201.m82(36438))) {
                        promise.resolve(Boolean.TRUE);
                        return;
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        promise.resolve(Boolean.FALSE);
    }

    @ReactMethod
    public void getAvailablePictureSizes(String str, int i2, Promise promise) {
        ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new c(this, i2, str, promise));
    }

    @ReactMethod
    public void getCameraIds(int i2, Promise promise) {
        ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new b(this, i2, promise));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return Collections.unmodifiableMap(new f(this));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(36439);
    }

    public yz2 getScopedContext() {
        return this.mScopedContext;
    }

    @ReactMethod
    public void getSupportedPreviewFpsRange(int i2, Promise promise) {
        ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new d(this, i2, promise));
    }

    @ReactMethod
    public void getSupportedRatios(int i2, Promise promise) {
        ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new a(this, i2, promise));
    }

    @ReactMethod
    public void pausePreview(int i2) {
        ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new g(this, i2));
    }

    @ReactMethod
    public void pauseRecording(int i2) {
        ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new l(this, i2));
    }

    @ReactMethod
    public void record(ReadableMap readableMap, int i2, Promise promise) {
        ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new j(this, i2, readableMap, promise, this.mScopedContext.b()));
    }

    @ReactMethod
    public void resumePreview(int i2) {
        ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new h(this, i2));
    }

    @ReactMethod
    public void resumeRecording(int i2) {
        ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new m(this, i2));
    }

    @ReactMethod
    public void stopRecording(int i2) {
        ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new k(this, i2));
    }

    @ReactMethod
    public void takePicture(ReadableMap readableMap, int i2, Promise promise) {
        ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new i(this, i2, readableMap, promise, this.mScopedContext.b()));
    }
}
