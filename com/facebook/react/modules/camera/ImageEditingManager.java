package com.facebook.react.modules.camera;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.facebook.fbreact.specs.NativeImageEditorSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.List;
import vigqyno.C0201;

@pj0(name = "ImageEditingManager")
public class ImageEditingManager extends NativeImageEditorSpec {
    private static final int COMPRESS_QUALITY = 0;
    @SuppressLint({"InlinedApi"})
    private static final String[] EXIF_ATTRIBUTES = {C0201.m82(37778), C0201.m82(37779), C0201.m82(37780), C0201.m82(37781), C0201.m82(37782), C0201.m82(37783), C0201.m82(37784), C0201.m82(37785), C0201.m82(37786), C0201.m82(37787), C0201.m82(37788), C0201.m82(37789), C0201.m82(37790), C0201.m82(37791), C0201.m82(37792), C0201.m82(37793), C0201.m82(37794), C0201.m82(37795), C0201.m82(37796), C0201.m82(37797), C0201.m82(37798), C0201.m82(37799), C0201.m82(37800), C0201.m82(37801), C0201.m82(37802)};
    private static final List<String> LOCAL_URI_PREFIXES = Arrays.asList(C0201.m82(37776), C0201.m82(37777));
    public static final String NAME = null;
    private static final String TEMP_FILE_PREFIX = null;

    private static class b extends GuardedAsyncTask<Void, Void> {
        private final Context a;

        /* access modifiers changed from: package-private */
        public class a implements FilenameFilter {
            public a(b bVar) {
            }

            public boolean accept(File file, String str) {
                return str.startsWith(C0201.m82(12091));
            }
        }

        private void a(File file) {
            File[] listFiles = file.listFiles(new a(this));
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    file2.delete();
                }
            }
        }

        /* renamed from: b */
        public void doInBackgroundGuarded(Void... voidArr) {
            a(this.a.getCacheDir());
            File externalCacheDir = this.a.getExternalCacheDir();
            if (externalCacheDir != null) {
                a(externalCacheDir);
            }
        }

        private b(ReactContext reactContext) {
            super(reactContext);
            this.a = reactContext;
        }
    }

    private static class c extends GuardedAsyncTask<Void, Void> {
        public static final String l = null;
        public final Context a;
        public final String b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final boolean g;
        public int h;
        public int i;
        public final Callback j;
        public final Callback k;

        static {
            C0201.m83(c.class, 107);
        }

        private Bitmap a(BitmapFactory.Options options) throws IOException {
            InputStream d2 = d();
            BitmapRegionDecoder newInstance = BitmapRegionDecoder.newInstance(d2, false);
            try {
                return newInstance.decodeRegion(new Rect(this.c, this.d, this.c + this.e, this.d + this.f), options);
            } finally {
                if (d2 != null) {
                    d2.close();
                }
                newInstance.recycle();
            }
        }

        private Bitmap b(int i2, int i3, BitmapFactory.Options options) throws IOException {
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            yh0.c(options);
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inJustDecodeBounds = true;
            InputStream d2 = d();
            try {
                BitmapFactory.decodeStream(d2, null, options2);
                if (d2 != null) {
                    d2.close();
                }
                int i4 = this.e;
                int i5 = this.f;
                float f7 = (float) i2;
                float f8 = (float) i3;
                float f9 = f7 / f8;
                if (((float) i4) / ((float) i5) > f9) {
                    f5 = ((float) i5) * f9;
                    f4 = (float) i5;
                    f2 = ((float) this.c) + ((((float) i4) - f5) / 2.0f);
                    f6 = (float) this.d;
                    f3 = f8 / ((float) i5);
                } else {
                    f5 = (float) i4;
                    float f10 = ((float) i4) / f9;
                    f2 = (float) this.c;
                    float f11 = (((float) i5) - f10) / 2.0f;
                    float f12 = f7 / ((float) i4);
                    f4 = f10;
                    f3 = f12;
                    f6 = f11 + ((float) this.d);
                }
                options.inSampleSize = ImageEditingManager.getDecodeSampleSize(this.e, this.f, i2, i3);
                options2.inJustDecodeBounds = false;
                d2 = d();
                try {
                    Bitmap decodeStream = BitmapFactory.decodeStream(d2, null, options);
                    if (decodeStream != null) {
                        float f13 = f3 * ((float) options.inSampleSize);
                        Matrix matrix = new Matrix();
                        matrix.setScale(f13, f13);
                        return Bitmap.createBitmap(decodeStream, (int) Math.floor((double) (f2 / ((float) options.inSampleSize))), (int) Math.floor((double) (f6 / ((float) options.inSampleSize))), (int) Math.floor((double) (f5 / ((float) options.inSampleSize))), (int) Math.floor((double) (f4 / ((float) options.inSampleSize))), matrix, true);
                    }
                    throw new IOException(l + this.b);
                } finally {
                }
            } finally {
                if (d2 != null) {
                    d2.close();
                }
            }
        }

        private InputStream d() throws IOException {
            InputStream inputStream;
            if (ImageEditingManager.isLocalUri(this.b)) {
                inputStream = this.a.getContentResolver().openInputStream(Uri.parse(this.b));
            } else {
                URLConnection openConnection = new URL(this.b).openConnection();
                w30.E(openConnection);
                inputStream = w30.b(openConnection);
            }
            if (inputStream != null) {
                return inputStream;
            }
            throw new IOException(C0201.m82(35193) + this.b);
        }

        /* renamed from: c */
        public void doInBackgroundGuarded(Void... voidArr) {
            Bitmap bitmap;
            File file;
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                if (this.h > 0 && this.i > 0) {
                    bitmap = b(this.h, this.i, options);
                } else {
                    bitmap = a(options);
                }
                String str = options.outMimeType;
                if (str == null || str.isEmpty()) {
                    throw new IOException(C0201.m82(35196));
                }
                try {
                    file = ImageEditingManager.writeBitmapToInternalCache(this.a, bitmap, str);
                } catch (Exception unused) {
                    if (this.g) {
                        file = ImageEditingManager.writeBitmapToExternalCache(this.a, bitmap, str);
                    } else {
                        throw new SecurityException(C0201.m82(35195));
                    }
                }
                if (str.equals(C0201.m82(35194))) {
                    ImageEditingManager.copyExif(this.a, Uri.parse(this.b), file);
                }
                this.j.invoke(Uri.fromFile(file).toString());
            } catch (Exception e2) {
                this.k.invoke(e2.getMessage());
            }
        }

        public void e(int i2, int i3) {
            if (i2 <= 0 || i3 <= 0) {
                throw new JSApplicationIllegalArgumentException(String.format(C0201.m82(35197), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            this.h = i2;
            this.i = i3;
        }

        private c(ReactContext reactContext, String str, int i2, int i3, int i4, int i5, boolean z, Callback callback, Callback callback2) {
            super(reactContext);
            this.h = 0;
            this.i = 0;
            if (i2 < 0 || i3 < 0 || i4 <= 0 || i5 <= 0) {
                throw new JSApplicationIllegalArgumentException(String.format(C0201.m82(35192), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)));
            }
            this.a = reactContext;
            this.b = str;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = i5;
            this.g = z;
            this.j = callback;
            this.k = callback2;
        }
    }

    static {
        C0201.m83(ImageEditingManager.class, 414);
    }

    public ImageEditingManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        new b(getReactApplicationContext()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* access modifiers changed from: private */
    public static void copyExif(Context context, Uri uri, File file) throws IOException {
        File fileFromUri = getFileFromUri(context, uri);
        if (fileFromUri == null) {
            f60.A(C0201.m82(37804), C0201.m82(37803) + uri);
            return;
        }
        ExifInterface exifInterface = new ExifInterface(fileFromUri.getAbsolutePath());
        ExifInterface exifInterface2 = new ExifInterface(file.getAbsolutePath());
        String[] strArr = EXIF_ATTRIBUTES;
        for (String str : strArr) {
            String attribute = exifInterface.getAttribute(str);
            if (attribute != null) {
                exifInterface2.setAttribute(str, attribute);
            }
        }
        exifInterface2.saveAttributes();
    }

    private static File createTempFile(File file, String str) throws IOException {
        if (file != null) {
            return File.createTempFile(C0201.m82(37805), getFileExtensionForType(str), file);
        }
        throw new IOException(C0201.m82(37806));
    }

    private static Bitmap.CompressFormat getCompressFormatForType(String str) {
        if (C0201.m82(37807).equals(str)) {
            return Bitmap.CompressFormat.PNG;
        }
        if (C0201.m82(37808).equals(str)) {
            return Bitmap.CompressFormat.WEBP;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    /* access modifiers changed from: private */
    public static int getDecodeSampleSize(int i, int i2, int i3, int i4) {
        int i5 = 1;
        if (i2 > i3 || i > i4) {
            int i6 = i2 / 2;
            int i7 = i / 2;
            while (i7 / i5 >= i3 && i6 / i5 >= i4) {
                i5 *= 2;
            }
        }
        return i5;
    }

    private static String getFileExtensionForType(String str) {
        if (C0201.m82(37809).equals(str)) {
            return C0201.m82(37810);
        }
        return C0201.m82(37811).equals(str) ? C0201.m82(37812) : C0201.m82(37813);
    }

    private static File getFileFromUri(Context context, Uri uri) {
        Cursor query;
        if (uri.getScheme().equals(C0201.m82(37814))) {
            return new File(uri.getPath());
        }
        if (!uri.getScheme().equals(C0201.m82(37815)) || (query = context.getContentResolver().query(uri, new String[]{C0201.m82(37816)}, null, null, null)) == null) {
            return null;
        }
        try {
            if (query.moveToFirst()) {
                String string = query.getString(0);
                if (!TextUtils.isEmpty(string)) {
                    return new File(string);
                }
            }
            query.close();
            return null;
        } finally {
            query.close();
        }
    }

    /* access modifiers changed from: private */
    public static boolean isLocalUri(String str) {
        for (String str2 : LOCAL_URI_PREFIXES) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static File writeBitmapToExternalCache(Context context, Bitmap bitmap, String str) throws IOException {
        File createTempFile = createTempFile(context.getExternalCacheDir(), str);
        writeCompressedBitmapToFile(bitmap, str, createTempFile);
        return createTempFile;
    }

    /* access modifiers changed from: private */
    public static File writeBitmapToInternalCache(Context context, Bitmap bitmap, String str) throws IOException {
        File createTempFile = createTempFile(context.getCacheDir(), str);
        writeCompressedBitmapToFile(bitmap, str, createTempFile);
        return createTempFile;
    }

    private static void writeCompressedBitmapToFile(Bitmap bitmap, String str, File file) throws IOException {
        bitmap.compress(getCompressFormatForType(str), 90, new FileOutputStream(file));
    }

    @Override // com.facebook.fbreact.specs.NativeImageEditorSpec
    public void cropImage(String str, ReadableMap readableMap, Callback callback, Callback callback2) {
        String r1 = C0201.m82(37817);
        ReadableMap readableMap2 = null;
        ReadableMap map = readableMap.hasKey(r1) ? readableMap.getMap(r1) : null;
        String r2 = C0201.m82(37818);
        if (readableMap.hasKey(r2)) {
            readableMap2 = readableMap.getMap(r2);
        }
        String r22 = C0201.m82(37819);
        boolean z = readableMap.hasKey(r22) ? readableMap.getBoolean(r22) : true;
        if (!(map == null || readableMap2 == null)) {
            String r23 = C0201.m82(37820);
            if (map.hasKey(r23)) {
                String r4 = C0201.m82(37821);
                if (map.hasKey(r4)) {
                    String r15 = C0201.m82(37822);
                    if (readableMap2.hasKey(r15)) {
                        String r14 = C0201.m82(37823);
                        if (readableMap2.hasKey(r14)) {
                            if (str == null || str.isEmpty()) {
                                throw new JSApplicationIllegalArgumentException(C0201.m82(37825));
                            }
                            c cVar = new c(getReactApplicationContext(), str, (int) map.getDouble(r23), (int) map.getDouble(r4), (int) readableMap2.getDouble(r15), (int) readableMap2.getDouble(r14), z, callback, callback2);
                            String r12 = C0201.m82(37824);
                            if (readableMap.hasKey(r12)) {
                                ReadableMap map2 = readableMap.getMap(r12);
                                cVar.e((int) map2.getDouble(r15), (int) map2.getDouble(r14));
                            }
                            cVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
                            return;
                        }
                    }
                }
            }
        }
        throw new JSApplicationIllegalArgumentException(C0201.m82(37826));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(37827);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        new b(getReactApplicationContext()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
}
