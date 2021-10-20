package com.oblador.vectoricons;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.views.text.i;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

public class VectorIconsModule extends ReactContextBaseJavaModule {
    public static final String REACT_CLASS = null;
    private static final Map<String, Typeface> sTypefaceCache = new HashMap();

    static {
        C0201.m83(VectorIconsModule.class, 453);
    }

    public VectorIconsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0145 A[SYNTHETIC, Splitter:B:17:0x0145] */
    public String createGlyphImagePath(String str, String str2, Integer num, Integer num2) throws IOException, FileNotFoundException {
        Throwable th;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        File cacheDir = reactApplicationContext.getCacheDir();
        String str3 = cacheDir.getAbsolutePath() + C0201.m82(1631);
        float f = reactApplicationContext.getResources().getDisplayMetrics().density;
        StringBuilder sb = new StringBuilder();
        sb.append(C0201.m82(1632));
        int i = (int) f;
        sb.append(f == ((float) i) ? Integer.toString(i) : Float.toString(f));
        sb.append(C0201.m82(1633));
        String sb2 = sb.toString();
        int round = Math.round(((float) num.intValue()) * f);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        String r5 = C0201.m82(1634);
        sb3.append(r5);
        sb3.append(str2);
        sb3.append(r5);
        sb3.append(num2);
        String str4 = str3 + Integer.toString(sb3.toString().hashCode(), 32) + C0201.m82(1635) + Integer.toString(num.intValue()) + sb2 + C0201.m82(1636);
        String str5 = C0201.m82(1637) + str4;
        File file = new File(str4);
        if (file.exists()) {
            return str5;
        }
        FileOutputStream fileOutputStream = null;
        Typeface d = i.b().d(str, 0, reactApplicationContext.getAssets());
        Paint paint = new Paint();
        paint.setTypeface(d);
        paint.setColor(num2.intValue());
        paint.setTextSize((float) round);
        paint.setAntiAlias(true);
        paint.getTextBounds(str2, 0, str2.length(), new Rect());
        int i2 = round - ((int) paint.getFontMetrics().bottom);
        Bitmap createBitmap = Bitmap.createBitmap(round, round, Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawText(str2, (float) 0, (float) i2, paint);
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream2);
                fileOutputStream2.flush();
                fileOutputStream2.close();
                return str5;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream != null) {
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            throw th;
        }
    }

    @ReactMethod
    public void getImageForFont(String str, String str2, Integer num, Integer num2, Promise promise) {
        try {
            promise.resolve(createGlyphImagePath(str, str2, num, num2));
        } catch (Throwable th) {
            promise.reject(C0201.m82(1638), th);
        }
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getImageForFontSync(String str, String str2, Integer num, Integer num2) {
        try {
            return createGlyphImagePath(str, str2, num, num2);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(1639);
    }
}
