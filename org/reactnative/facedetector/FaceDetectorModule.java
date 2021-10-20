package org.reactnative.facedetector;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

public class FaceDetectorModule extends ReactContextBaseJavaModule {
    private static final String TAG = null;
    private static ReactApplicationContext mScopedContext;

    class a extends HashMap<String, Object> {

        /* access modifiers changed from: package-private */
        /* renamed from: org.reactnative.facedetector.FaceDetectorModule$a$a  reason: collision with other inner class name */
        public class C0166a extends HashMap<String, Object> {
            public C0166a() {
                put(C0201.m82(333), Integer.valueOf(b.m));
                put(C0201.m82(334), Integer.valueOf(b.l));
            }
        }

        /* access modifiers changed from: package-private */
        public class b extends HashMap<String, Object> {
            public b() {
                put(C0201.m82(492), Integer.valueOf(b.h));
                put(C0201.m82(493), Integer.valueOf(b.i));
            }
        }

        /* access modifiers changed from: package-private */
        public class c extends HashMap<String, Object> {
            public c() {
                put(C0201.m82(1009), Integer.valueOf(b.j));
                put(C0201.m82(1010), Integer.valueOf(b.k));
            }
        }

        public a(FaceDetectorModule faceDetectorModule) {
            put(C0201.m82(8252), c());
            put(C0201.m82(8253), b());
            put(C0201.m82(8254), a());
        }

        private Map<String, Object> a() {
            return Collections.unmodifiableMap(new b());
        }

        private Map<String, Object> b() {
            return Collections.unmodifiableMap(new c());
        }

        private Map<String, Object> c() {
            return Collections.unmodifiableMap(new C0166a());
        }
    }

    static {
        C0201.m83(FaceDetectorModule.class, 471);
    }

    public FaceDetectorModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        mScopedContext = reactApplicationContext;
    }

    @ReactMethod
    public void detectFaces(ReadableMap readableMap, Promise promise) {
        new zz2(mScopedContext, readableMap, promise).execute(new Void[0]);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return Collections.unmodifiableMap(new a(this));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(26684);
    }
}
