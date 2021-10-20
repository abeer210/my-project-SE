package io.invertase.firebase.functions;

import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.functions.FirebaseFunctions;
import com.google.firebase.functions.FirebaseFunctionsException;
import com.google.firebase.functions.HttpsCallableResult;
import io.invertase.firebase.c;
import vigqyno.C0201;

public class RNFirebaseFunctions extends ReactContextBaseJavaModule {
    private static final String CODE_KEY = null;
    private static final String DATA_KEY = null;
    private static final String DETAILS_KEY = null;
    private static final String ERROR_KEY = null;
    private static final String MSG_KEY = null;
    private static final String TAG = null;

    class a implements vs1 {
        public final /* synthetic */ String a;
        public final /* synthetic */ Promise b;

        public a(RNFirebaseFunctions rNFirebaseFunctions, String str, Promise promise) {
            this.a = str;
            this.b = promise;
        }

        @Override // defpackage.vs1
        public void onFailure(Exception exc) {
            String str;
            String str2;
            Object obj;
            Log.d(C0201.m82(36115), C0201.m82(36114) + this.a, exc);
            WritableMap createMap = Arguments.createMap();
            if (exc instanceof FirebaseFunctionsException) {
                FirebaseFunctionsException firebaseFunctionsException = (FirebaseFunctionsException) exc;
                obj = firebaseFunctionsException.getDetails();
                str2 = firebaseFunctionsException.getCode().name();
                str = firebaseFunctionsException.getMessage();
            } else {
                str = exc.getMessage();
                obj = null;
                str2 = C0201.m82(36116);
            }
            c.g(C0201.m82(36117), str2, createMap);
            c.g(C0201.m82(36118), str, createMap);
            c.g(C0201.m82(36119), Boolean.TRUE, createMap);
            c.g(C0201.m82(36120), obj, createMap);
            this.b.resolve(createMap);
        }
    }

    class b implements ws1<HttpsCallableResult> {
        public final /* synthetic */ String a;
        public final /* synthetic */ Promise b;

        public b(RNFirebaseFunctions rNFirebaseFunctions, String str, Promise promise) {
            this.a = str;
            this.b = promise;
        }

        /* renamed from: a */
        public void onSuccess(HttpsCallableResult httpsCallableResult) {
            WritableMap createMap = Arguments.createMap();
            Object data = httpsCallableResult.getData();
            String r2 = C0201.m82(36211);
            Log.d(r2, C0201.m82(36210) + this.a);
            StringBuilder sb = new StringBuilder();
            sb.append(C0201.m82(36212));
            sb.append(this.a);
            String r3 = C0201.m82(36213);
            sb.append(r3);
            String r4 = C0201.m82(36214);
            sb.append(data != null ? data.getClass().getName() : r4);
            Log.d(r2, sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C0201.m82(36215));
            sb2.append(this.a);
            sb2.append(r3);
            if (data != null) {
                r4 = data.toString();
            }
            sb2.append(r4);
            Log.d(r2, sb2.toString());
            c.g(C0201.m82(36216), data, createMap);
            this.b.resolve(createMap);
        }
    }

    static {
        C0201.m83(RNFirebaseFunctions.class, 375);
    }

    public RNFirebaseFunctions(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Log.d(C0201.m82(5200), C0201.m82(5201));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(5202);
    }

    @ReactMethod
    public void httpsCallable(String str, String str2, String str3, ReadableMap readableMap, Promise promise) {
        Object obj = readableMap.toHashMap().get(C0201.m82(5203));
        StringBuilder sb = new StringBuilder();
        sb.append(C0201.m82(5204));
        sb.append(str3);
        sb.append(C0201.m82(5205));
        sb.append(obj != null ? obj.toString() : C0201.m82(5206));
        Log.d(C0201.m82(5207), sb.toString());
        zs1 call = FirebaseFunctions.getInstance(l12.l(str), str2).getHttpsCallable(str3).call(obj);
        call.f(new b(this, str3, promise));
        call.d(new a(this, str3, promise));
    }

    @ReactMethod
    public void useFunctionsEmulator(String str, String str2, String str3, Promise promise) {
        FirebaseFunctions.getInstance(l12.l(str), str2).useFunctionsEmulator(str3);
        promise.resolve(null);
    }
}
