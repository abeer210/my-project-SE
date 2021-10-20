package com.airbnb.android.react.maps;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;
import android.util.Base64;
import android.util.DisplayMetrics;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.m;
import com.facebook.react.uimanager.n0;
import com.google.android.gms.maps.c;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

@pj0(name = "AirMapModule")
public class AirMapModule extends ReactContextBaseJavaModule {
    public static final String NAME = null;
    private static final String SNAPSHOT_FORMAT_JPG = null;
    private static final String SNAPSHOT_FORMAT_PNG = null;
    private static final String SNAPSHOT_RESULT_BASE64 = null;
    private static final String SNAPSHOT_RESULT_FILE = null;

    class a implements n0 {
        public final /* synthetic */ int a;
        public final /* synthetic */ Promise b;
        public final /* synthetic */ Integer c;
        public final /* synthetic */ Integer d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;
        public final /* synthetic */ ReactApplicationContext g;
        public final /* synthetic */ Bitmap.CompressFormat h;
        public final /* synthetic */ double i;

        /* renamed from: com.airbnb.android.react.maps.AirMapModule$a$a  reason: collision with other inner class name */
        class C0031a implements c.r {
            public C0031a() {
            }

            @Override // com.google.android.gms.maps.c.r
            public void onSnapshotReady(Bitmap bitmap) {
                if (bitmap == null) {
                    a.this.b.reject(C0201.m82(33465));
                    return;
                }
                if (!(a.this.c.intValue() == 0 || a.this.d.intValue() == 0 || (a.this.c.intValue() == bitmap.getWidth() && a.this.d.intValue() == bitmap.getHeight()))) {
                    bitmap = Bitmap.createScaledBitmap(bitmap, a.this.c.intValue(), a.this.d.intValue(), true);
                }
                if (a.this.e.equals(C0201.m82(33466))) {
                    try {
                        String r0 = C0201.m82(33467);
                        File createTempFile = File.createTempFile(r0, C0201.m82(33468) + a.this.f, a.this.g.getCacheDir());
                        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                        a aVar = a.this;
                        bitmap.compress(aVar.h, (int) (aVar.i * 100.0d), fileOutputStream);
                        AirMapModule.closeQuietly(fileOutputStream);
                        a.this.b.resolve(Uri.fromFile(createTempFile).toString());
                    } catch (Exception e) {
                        a.this.b.reject(e);
                    }
                } else if (a.this.e.equals(C0201.m82(33469))) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    a aVar2 = a.this;
                    bitmap.compress(aVar2.h, (int) (aVar2.i * 100.0d), byteArrayOutputStream);
                    AirMapModule.closeQuietly(byteArrayOutputStream);
                    a.this.b.resolve(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2));
                }
            }
        }

        public a(AirMapModule airMapModule, int i2, Promise promise, Integer num, Integer num2, String str, String str2, ReactApplicationContext reactApplicationContext, Bitmap.CompressFormat compressFormat, double d2) {
            this.a = i2;
            this.b = promise;
            this.c = num;
            this.d = num2;
            this.e = str;
            this.f = str2;
            this.g = reactApplicationContext;
            this.h = compressFormat;
            this.i = d2;
        }

        @Override // com.facebook.react.uimanager.n0
        public void a(m mVar) {
            l lVar = (l) mVar.w(this.a);
            if (lVar == null) {
                this.b.reject(C0201.m82(7360));
                return;
            }
            com.google.android.gms.maps.c cVar = lVar.b;
            if (cVar == null) {
                this.b.reject(C0201.m82(7361));
            } else {
                cVar.O(new C0031a());
            }
        }
    }

    class b implements n0 {
        public final /* synthetic */ int a;
        public final /* synthetic */ Promise b;

        public b(AirMapModule airMapModule, int i, Promise promise) {
            this.a = i;
            this.b = promise;
        }

        @Override // com.facebook.react.uimanager.n0
        public void a(m mVar) {
            l lVar = (l) mVar.w(this.a);
            if (lVar == null) {
                this.b.reject(C0201.m82(7272));
                return;
            }
            com.google.android.gms.maps.c cVar = lVar.b;
            if (cVar == null) {
                this.b.reject(C0201.m82(7273));
                return;
            }
            CameraPosition i = cVar.i();
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble(C0201.m82(7274), i.a.a);
            writableNativeMap.putDouble(C0201.m82(7275), i.a.b);
            WritableNativeMap writableNativeMap2 = new WritableNativeMap();
            writableNativeMap2.putMap(C0201.m82(7276), writableNativeMap);
            writableNativeMap2.putDouble(C0201.m82(7277), (double) i.d);
            writableNativeMap2.putDouble(C0201.m82(7278), (double) i.b);
            writableNativeMap2.putDouble(C0201.m82(7279), (double) i.c);
            this.b.resolve(writableNativeMap2);
        }
    }

    class c implements n0 {
        public final /* synthetic */ int a;
        public final /* synthetic */ Promise b;
        public final /* synthetic */ LatLng c;
        public final /* synthetic */ double d;

        public c(AirMapModule airMapModule, int i, Promise promise, LatLng latLng, double d2) {
            this.a = i;
            this.b = promise;
            this.c = latLng;
            this.d = d2;
        }

        @Override // com.facebook.react.uimanager.n0
        public void a(m mVar) {
            l lVar = (l) mVar.w(this.a);
            if (lVar == null) {
                this.b.reject(C0201.m82(7234));
                return;
            }
            com.google.android.gms.maps.c cVar = lVar.b;
            if (cVar == null) {
                this.b.reject(C0201.m82(7235));
                return;
            }
            Point c2 = cVar.k().c(this.c);
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            double d2 = (double) c2.x;
            double d3 = this.d;
            Double.isNaN(d2);
            writableNativeMap.putDouble(C0201.m82(7236), d2 / d3);
            double d4 = (double) c2.y;
            double d5 = this.d;
            Double.isNaN(d4);
            writableNativeMap.putDouble(C0201.m82(7237), d4 / d5);
            this.b.resolve(writableNativeMap);
        }
    }

    class d implements n0 {
        public final /* synthetic */ int a;
        public final /* synthetic */ Promise b;
        public final /* synthetic */ Point c;

        public d(AirMapModule airMapModule, int i, Promise promise, Point point) {
            this.a = i;
            this.b = promise;
            this.c = point;
        }

        @Override // com.facebook.react.uimanager.n0
        public void a(m mVar) {
            l lVar = (l) mVar.w(this.a);
            if (lVar == null) {
                this.b.reject(C0201.m82(6402));
                return;
            }
            com.google.android.gms.maps.c cVar = lVar.b;
            if (cVar == null) {
                this.b.reject(C0201.m82(6403));
                return;
            }
            LatLng a2 = cVar.k().a(this.c);
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble(C0201.m82(6404), a2.a);
            writableNativeMap.putDouble(C0201.m82(6405), a2.b);
            this.b.resolve(writableNativeMap);
        }
    }

    class e implements n0 {
        public final /* synthetic */ int a;
        public final /* synthetic */ Promise b;

        public e(AirMapModule airMapModule, int i, Promise promise) {
            this.a = i;
            this.b = promise;
        }

        @Override // com.facebook.react.uimanager.n0
        public void a(m mVar) {
            l lVar = (l) mVar.w(this.a);
            if (lVar == null) {
                this.b.reject(C0201.m82(6312));
            } else if (lVar.b == null) {
                this.b.reject(C0201.m82(6313));
            } else {
                double[][] mapBoundaries = lVar.getMapBoundaries();
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                WritableNativeMap writableNativeMap2 = new WritableNativeMap();
                WritableNativeMap writableNativeMap3 = new WritableNativeMap();
                double d = mapBoundaries[0][0];
                String r4 = C0201.m82(6314);
                writableNativeMap2.putDouble(r4, d);
                double d2 = mapBoundaries[0][1];
                String r5 = C0201.m82(6315);
                writableNativeMap2.putDouble(r5, d2);
                writableNativeMap3.putDouble(r4, mapBoundaries[1][0]);
                writableNativeMap3.putDouble(r5, mapBoundaries[1][1]);
                writableNativeMap.putMap(C0201.m82(6316), writableNativeMap2);
                writableNativeMap.putMap(C0201.m82(6317), writableNativeMap3);
                this.b.resolve(writableNativeMap);
            }
        }
    }

    static {
        C0201.m83(AirMapModule.class, 504);
    }

    public AirMapModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @ReactMethod
    public void coordinateForPoint(int i, ReadableMap readableMap, Promise promise) {
        int i2;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        double d2 = (double) reactApplicationContext.getResources().getDisplayMetrics().density;
        String r4 = C0201.m82(7602);
        int i3 = 0;
        if (readableMap.hasKey(r4)) {
            double d3 = readableMap.getDouble(r4);
            Double.isNaN(d2);
            i2 = (int) (d3 * d2);
        } else {
            i2 = 0;
        }
        String r5 = C0201.m82(7603);
        if (readableMap.hasKey(r5)) {
            double d4 = readableMap.getDouble(r5);
            Double.isNaN(d2);
            i3 = (int) (d4 * d2);
        }
        ((UIManagerModule) reactApplicationContext.getNativeModule(UIManagerModule.class)).addUIBlock(new d(this, i, promise, new Point(i2, i3)));
    }

    public Activity getActivity() {
        return getCurrentActivity();
    }

    @ReactMethod
    public void getCamera(int i, Promise promise) {
        ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new b(this, i, promise));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put(C0201.m82(7604), C0201.m82(7605));
        return hashMap;
    }

    @ReactMethod
    public void getMapBoundaries(int i, Promise promise) {
        ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new e(this, i, promise));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(7606);
    }

    @ReactMethod
    public void pointForCoordinate(int i, ReadableMap readableMap, Promise promise) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        double d2 = (double) reactApplicationContext.getResources().getDisplayMetrics().density;
        String r1 = C0201.m82(7607);
        double d3 = 0.0d;
        double d4 = readableMap.hasKey(r1) ? readableMap.getDouble(r1) : 0.0d;
        String r5 = C0201.m82(7608);
        if (readableMap.hasKey(r5)) {
            d3 = readableMap.getDouble(r5);
        }
        ((UIManagerModule) reactApplicationContext.getNativeModule(UIManagerModule.class)).addUIBlock(new c(this, i, promise, new LatLng(d4, d3), d2));
    }

    @ReactMethod
    public void takeSnapshot(int i, ReadableMap readableMap, Promise promise) {
        Bitmap.CompressFormat compressFormat;
        int i2;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        String r1 = C0201.m82(7609);
        boolean hasKey = readableMap.hasKey(r1);
        String r3 = C0201.m82(7610);
        String string = hasKey ? readableMap.getString(r1) : r3;
        if (string.equals(r3)) {
            compressFormat = Bitmap.CompressFormat.PNG;
        } else {
            compressFormat = string.equals(C0201.m82(7611)) ? Bitmap.CompressFormat.JPEG : null;
        }
        String r12 = C0201.m82(7612);
        double d2 = readableMap.hasKey(r12) ? readableMap.getDouble(r12) : 1.0d;
        DisplayMetrics displayMetrics = reactApplicationContext.getResources().getDisplayMetrics();
        String r2 = C0201.m82(7613);
        int i3 = 0;
        if (readableMap.hasKey(r2)) {
            double d3 = (double) displayMetrics.density;
            double d4 = readableMap.getDouble(r2);
            Double.isNaN(d3);
            i2 = (int) (d3 * d4);
        } else {
            i2 = 0;
        }
        Integer valueOf = Integer.valueOf(i2);
        String r22 = C0201.m82(7614);
        if (readableMap.hasKey(r22)) {
            double d5 = (double) displayMetrics.density;
            double d6 = readableMap.getDouble(r22);
            Double.isNaN(d5);
            i3 = (int) (d5 * d6);
        }
        Integer valueOf2 = Integer.valueOf(i3);
        String r13 = C0201.m82(7615);
        ((UIManagerModule) reactApplicationContext.getNativeModule(UIManagerModule.class)).addUIBlock(new a(this, i, promise, valueOf, valueOf2, readableMap.hasKey(r13) ? readableMap.getString(r13) : C0201.m82(7616), string, reactApplicationContext, compressFormat, d2));
    }
}
