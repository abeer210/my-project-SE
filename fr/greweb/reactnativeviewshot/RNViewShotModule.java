package fr.greweb.reactnativeviewshot;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.DisplayMetrics;
import android.util.Log;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.UIManagerModule;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import vigqyno.C0201;

public class RNViewShotModule extends ReactContextBaseJavaModule {
    public static final String RNVIEW_SHOT = null;
    private static final String TEMP_FILE_PREFIX = null;
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
    private final ReactApplicationContext reactContext;

    private static class b extends GuardedAsyncTask<Void, Void> implements FilenameFilter {
        private final File a;
        private final File b;

        private void a(File file) {
            File[] listFiles = file.listFiles(this);
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2.delete()) {
                        Log.d(C0201.m82(13094), C0201.m82(13093) + file2.getAbsolutePath());
                    }
                }
            }
        }

        public final boolean accept(File file, String str) {
            return str.startsWith(C0201.m82(13095));
        }

        /* renamed from: b */
        public void doInBackgroundGuarded(Void... voidArr) {
            File file = this.a;
            if (file != null) {
                a(file);
            }
            File file2 = this.b;
            if (file2 != null) {
                a(file2);
            }
        }

        private b(ReactContext reactContext) {
            super(reactContext);
            this.a = reactContext.getCacheDir();
            this.b = reactContext.getExternalCacheDir();
        }
    }

    static {
        C0201.m83(RNViewShotModule.class, 0);
    }

    public RNViewShotModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    private File createTempFile(Context context, String str) throws IOException {
        File externalCacheDir = context.getExternalCacheDir();
        File cacheDir = context.getCacheDir();
        if (externalCacheDir == null && cacheDir == null) {
            throw new IOException(C0201.m82(1075));
        }
        if (externalCacheDir == null || (cacheDir != null && externalCacheDir.getFreeSpace() <= cacheDir.getFreeSpace())) {
            externalCacheDir = cacheDir;
        }
        return File.createTempFile(C0201.m82(1077), C0201.m82(1076) + str, externalCacheDir);
    }

    @ReactMethod
    public void captureRef(int i2, ReadableMap readableMap, Promise promise) {
        int i3;
        Integer num;
        Integer num2;
        DisplayMetrics displayMetrics = getReactApplicationContext().getResources().getDisplayMetrics();
        String string = readableMap.getString(c);
        if (d.equals(string)) {
            i3 = 0;
        } else if (m.equals(string)) {
            i3 = 2;
        } else {
            i3 = e.equals(string) ? -1 : 1;
        }
        double d2 = readableMap.getDouble(a);
        String str = f;
        if (readableMap.hasKey(str)) {
            double d3 = (double) displayMetrics.density;
            double d4 = readableMap.getDouble(str);
            Double.isNaN(d3);
            num = Integer.valueOf((int) (d3 * d4));
        } else {
            num = null;
        }
        String str2 = l;
        if (readableMap.hasKey(str2)) {
            double d5 = (double) displayMetrics.density;
            double d6 = readableMap.getDouble(str2);
            Double.isNaN(d5);
            num2 = Integer.valueOf((int) (d5 * d6));
        } else {
            num2 = null;
        }
        String string2 = readableMap.getString(g);
        try {
            ((UIManagerModule) this.reactContext.getNativeModule(UIManagerModule.class)).addUIBlock(new c(i2, string, i3, d2, num, num2, h.equals(string2) ? createTempFile(getReactApplicationContext(), string) : null, string2, Boolean.valueOf(readableMap.getBoolean(j)), this.reactContext, getCurrentActivity(), promise));
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder();
            String str3 = i;
            sb.append(str3);
            sb.append(i2);
            Log.e(k, sb.toString(), th);
            promise.reject(b, str3 + i2);
        }
    }

    @ReactMethod
    public void captureScreen(ReadableMap readableMap, Promise promise) {
        captureRef(-1, readableMap, promise);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return Collections.emptyMap();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(1078);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        new b(getReactApplicationContext()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @ReactMethod
    public void releaseCapture(String str) {
        String path = Uri.parse(str).getPath();
        if (path != null) {
            File file = new File(path);
            if (file.exists()) {
                File parentFile = file.getParentFile();
                if (parentFile.equals(this.reactContext.getExternalCacheDir()) || parentFile.equals(this.reactContext.getCacheDir())) {
                    file.delete();
                }
            }
        }
    }
}
