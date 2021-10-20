package com.christopherdro.htmltopdf;

import android.os.Environment;
import android.print.PrintAttributes;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import java.io.File;
import java.io.IOException;
import java.util.UUID;
import vigqyno.C0188;
import vigqyno.C0201;

public class RNHTMLtoPDFModule extends ReactContextBaseJavaModule {
    private static final String BASE_64 = null;
    private static final String BASE_URL = null;
    private static final String DIRECTORY = null;
    private static final String FILE_NAME = null;
    private static final String HEIGHT = null;
    private static final String HTML = null;
    private static final String PDF_EXTENSION = null;
    private static final String PDF_PREFIX = null;
    private static final String WIDTH = null;
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
    private final ReactApplicationContext mReactContext;

    static {
        C0201.m83(RNHTMLtoPDFModule.class, 108);
    }

    public RNHTMLtoPDFModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mReactContext = reactApplicationContext;
    }

    private void convertToPDF(String str, File file, boolean z, WritableMap writableMap, Promise promise, String str2, PrintAttributes printAttributes) throws Exception {
        a m2 = a.m();
        if (printAttributes != null) {
            m2.q(printAttributes);
        }
        m2.i(this.mReactContext, str, file, z, writableMap, promise, str2);
    }

    private File getTempFile(String str) throws IOException {
        return File.createTempFile(str, C0201.m82(35217), getReactApplicationContext().getCacheDir());
    }

    private boolean isFileNameValid(String str) throws Exception {
        return new File(str).getCanonicalFile().getName().equals(str);
    }

    @ReactMethod
    public void convert(ReadableMap readableMap, Promise promise) {
        String str;
        File file;
        PrintAttributes printAttributes;
        File file2;
        String str2 = i;
        String str3 = d;
        String str4 = e;
        String str5 = l;
        String str6 = a;
        String str7 = n;
        String str8 = o;
        String str9 = h;
        try {
            String string = readableMap.hasKey(str8) ? readableMap.getString(str8) : null;
            if (string == null) {
                promise.reject(new Exception(f));
                return;
            }
            if (readableMap.hasKey(str7)) {
                str = readableMap.getString(str7);
                if (!isFileNameValid(str)) {
                    promise.reject(new Exception(m));
                    return;
                }
            } else {
                str = j + UUID.randomUUID().toString();
            }
            if (readableMap.hasKey(str9)) {
                if (g.equals(Environment.getExternalStorageState())) {
                    file2 = new File(Environment.getExternalStorageDirectory(), readableMap.getString(str9));
                } else {
                    file2 = new File(this.mReactContext.getFilesDir(), readableMap.getString(str9));
                }
                if (file2.exists() || file2.mkdirs()) {
                    file = new File(file2, str + b);
                } else {
                    promise.reject(new Exception(k));
                    return;
                }
            } else {
                file = getTempFile(str);
            }
            if (!readableMap.hasKey(str6) || !readableMap.hasKey(str4)) {
                printAttributes = null;
            } else {
                PrintAttributes.Builder builder = new PrintAttributes.Builder();
                String str10 = p;
                String str11 = c;
                double d2 = (double) (readableMap.getInt(str4) * C0188.f18);
                Double.isNaN(d2);
                int i2 = (int) (d2 / 72.0d);
                double d3 = (double) (readableMap.getInt(str6) * C0188.f18);
                Double.isNaN(d3);
                printAttributes = builder.setMediaSize(new PrintAttributes.MediaSize(str10, str11, i2, (int) (d3 / 72.0d))).setResolution(new PrintAttributes.Resolution(str2, str2, 600, 600)).setMinMargins(PrintAttributes.Margins.NO_MARGINS).build();
            }
            convertToPDF(string, file, readableMap.hasKey(str5) && readableMap.getBoolean(str5), Arguments.createMap(), promise, readableMap.hasKey(str3) ? readableMap.getString(str3) : null, printAttributes);
        } catch (Exception e2) {
            promise.reject(e2);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(35218);
    }
}
