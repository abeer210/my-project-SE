package com.reactnative.ivpusic.imagepicker;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.os.Environment;
import android.util.Log;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import vigqyno.C0201;

/* compiled from: Compression */
public class a {
    public File a(Context context, ReadableMap readableMap, String str, BitmapFactory.Options options) throws IOException {
        Integer num;
        Integer num2;
        String r2 = C0201.m82(2466);
        Double d = null;
        Integer valueOf = readableMap.hasKey(r2) ? Integer.valueOf(readableMap.getInt(r2)) : null;
        String r3 = C0201.m82(2467);
        Integer valueOf2 = readableMap.hasKey(r3) ? Integer.valueOf(readableMap.getInt(r3)) : null;
        String r5 = C0201.m82(2468);
        if (readableMap.hasKey(r5)) {
            d = Double.valueOf(readableMap.getDouble(r5));
        }
        boolean z = false;
        boolean z2 = d == null || d.doubleValue() == 1.0d;
        boolean z3 = valueOf == null || valueOf.intValue() >= options.outWidth;
        boolean z4 = valueOf2 == null || valueOf2.intValue() >= options.outHeight;
        List asList = Arrays.asList(C0201.m82(2469), C0201.m82(2470), C0201.m82(2471), C0201.m82(2472), C0201.m82(2473));
        String str2 = options.outMimeType;
        if (str2 != null && asList.contains(str2.toLowerCase())) {
            z = true;
        }
        String r52 = C0201.m82(2474);
        if (!z2 || !z3 || !z4 || !z) {
            Log.d(r52, C0201.m82(2476));
            int doubleValue = d != null ? (int) (d.doubleValue() * 100.0d) : 100;
            Log.d(r52, C0201.m82(2477) + doubleValue);
            if (valueOf == null) {
                num = Integer.valueOf(options.outWidth);
            } else {
                num = Integer.valueOf(Math.min(valueOf.intValue(), options.outWidth));
            }
            if (valueOf2 == null) {
                num2 = Integer.valueOf(options.outHeight);
            } else {
                num2 = Integer.valueOf(Math.min(valueOf2.intValue(), options.outHeight));
            }
            return d(context, str, num.intValue(), num2.intValue(), doubleValue);
        }
        Log.d(r52, C0201.m82(2475));
        return new File(str);
    }

    public synchronized void b(Activity activity, ReadableMap readableMap, String str, String str2, Promise promise) {
        promise.resolve(str);
    }

    public int c(int i) {
        if (i == 3) {
            return 180;
        }
        if (i != 6) {
            return i != 8 ? 0 : -90;
        }
        return 90;
    }

    public File d(Context context, String str, int i, int i2, int i3) throws IOException {
        int i4;
        int i5;
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        int width = decodeFile.getWidth();
        int height = decodeFile.getHeight();
        int attributeInt = new ExifInterface(str).getAttributeInt(C0201.m82(2478), 1);
        Matrix matrix = new Matrix();
        matrix.postRotate((float) c(attributeInt));
        float f = ((float) width) / ((float) height);
        float f2 = (float) i;
        float f3 = (float) i2;
        if (f2 / f3 > 1.0f) {
            i5 = (int) (f3 * f);
            i4 = i2;
        } else {
            i4 = (int) (f2 / f);
            i5 = i;
        }
        Bitmap createBitmap = Bitmap.createBitmap(Bitmap.createScaledBitmap(decodeFile, i5, i4, true), 0, 0, i5, i4, matrix, true);
        File externalFilesDir = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        if (!externalFilesDir.exists()) {
            Log.d(C0201.m82(2479), C0201.m82(2480));
            externalFilesDir.mkdirs();
        }
        File file = new File(externalFilesDir, UUID.randomUUID() + C0201.m82(2481));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        createBitmap.compress(Bitmap.CompressFormat.JPEG, i3, bufferedOutputStream);
        bufferedOutputStream.close();
        decodeFile.recycle();
        createBitmap.recycle();
        return file;
    }
}
