package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Environment;
import android.util.Log;
import com.facebook.react.bridge.ReadableMap;
import com.imagepicker.d;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import java.util.UUID;
import vigqyno.C0201;

/* renamed from: wc2  reason: default package */
/* compiled from: MediaUtils */
public class wc2 {
    public static final String a = null;

    /* renamed from: wc2$a */
    /* compiled from: MediaUtils */
    static class a implements MediaScannerConnection.OnScanCompletedListener {
        public void onScanCompleted(String str, Uri uri) {
            Log.i(C0201.m82(26697), C0201.m82(26696) + str);
        }
    }

    /* renamed from: wc2$b */
    /* compiled from: MediaUtils */
    public static class b {
        public final int a;
        public final Throwable b;

        public b(int i, Throwable th) {
            this.a = i;
            this.b = th;
        }
    }

    /* renamed from: wc2$c */
    /* compiled from: MediaUtils */
    public static class c {
        public final sc2 a;
        public final Throwable b;

        public c(sc2 sc2, Throwable th) {
            this.a = sc2;
            this.b = th;
        }
    }

    static {
        C0201.m83(wc2.class, 16);
    }

    public static File a(Context context, ReadableMap readableMap, boolean z) {
        String str = C0201.m82(4900) + UUID.randomUUID().toString() + C0201.m82(4901);
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
        String r2 = C0201.m82(4902);
        if (xc2.c(readableMap, r2)) {
            ReadableMap map = readableMap.getMap(r2);
            String r7 = C0201.m82(4903);
            if (map.hasKey(r7) && map.getBoolean(r7)) {
                externalStoragePublicDirectory = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
            }
            String r5 = C0201.m82(4904);
            if (xc2.b(map, r5)) {
                externalStoragePublicDirectory = new File(externalStoragePublicDirectory, map.getString(r5));
            }
        } else if (z) {
            externalStoragePublicDirectory = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        }
        File file = new File(externalStoragePublicDirectory, str);
        try {
            externalStoragePublicDirectory.mkdirs();
            file.createNewFile();
            return file;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void b(Context context, String str) {
        if (context != null) {
            MediaScannerConnection.scanFile(context, new String[]{str}, null, new a());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0102, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0108, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0109, code lost:
        r0.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x010d, code lost:
        throw r0;
     */
    public static sc2 c(Context context, ReadableMap readableMap, sc2 sc2, int i, int i2, int i3) {
        int i4;
        int i5;
        sc2 sc22;
        int i6;
        BitmapFactory.Options options = new BitmapFactory.Options();
        boolean z = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        if (sc2.c != 0 || sc2.d != 0) {
            i5 = i;
            i4 = i2;
            while (true) {
                int i7 = sc2.c;
                if ((i7 != 0 && i5 <= i7 * 2) || ((i6 = sc2.d) != 0 && i4 <= i6 * 2)) {
                    break;
                }
                options.inSampleSize *= 2;
                i4 /= 2;
                i5 /= 2;
            }
        } else {
            i5 = i;
            i4 = i2;
        }
        Bitmap decodeFile = BitmapFactory.decodeFile(sc2.a.getAbsolutePath(), options);
        if (decodeFile == null) {
            return sc2;
        }
        int i8 = sc2.c;
        if (i8 == 0 || i8 > i5) {
            sc22 = sc2.e(i5);
        } else {
            sc22 = sc2;
        }
        if (sc2.d == 0 || sc2.c > i4) {
            sc22 = sc22.d(i4);
        }
        double d = (double) sc22.c;
        double d2 = (double) i5;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d / d2;
        double d4 = (double) sc22.d;
        double d5 = (double) i4;
        Double.isNaN(d4);
        Double.isNaN(d5);
        double d6 = d4 / d5;
        if (d3 >= d6) {
            d3 = d6;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate((float) sc22.f);
        float f = (float) d3;
        matrix.postScale(f, f);
        try {
            int attributeInt = new ExifInterface(sc22.a.getAbsolutePath()).getAttributeInt(a, 0);
            if (attributeInt == 3) {
                matrix.postRotate(180.0f);
            } else if (attributeInt == 6) {
                matrix.postRotate(90.0f);
            } else if (attributeInt == 8) {
                matrix.postRotate(270.0f);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Bitmap createBitmap = Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix, true);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        createBitmap.compress(Bitmap.CompressFormat.JPEG, sc22.e, byteArrayOutputStream);
        if (i3 == 13001) {
            z = true;
        }
        File a2 = a(context, readableMap, !z);
        if (a2 == null) {
            if (decodeFile != null) {
                decodeFile.recycle();
            }
            if (createBitmap != null) {
                createBitmap.recycle();
            }
            return sc2;
        }
        sc2 g = sc22.g(a2);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(g.b);
            byteArrayOutputStream.writeTo(fileOutputStream);
            fileOutputStream.close();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        if (decodeFile != null) {
            decodeFile.recycle();
        }
        if (createBitmap != null) {
            createBitmap.recycle();
        }
        return g;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003b A[SYNTHETIC, Splitter:B:18:0x003b] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0043 A[Catch:{ IOException -> 0x003f }] */
    private static void d(File file, File file2) throws IOException {
        FileChannel fileChannel;
        Throwable th;
        FileChannel fileChannel2 = null;
        try {
            FileChannel channel = new FileInputStream(file).getChannel();
            try {
                fileChannel2 = new FileOutputStream(file2).getChannel();
                channel.transferTo(0, channel.size(), fileChannel2);
                file.delete();
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                        return;
                    }
                }
                if (fileChannel2 != null) {
                    fileChannel2.close();
                }
            } catch (Throwable th2) {
                th = th2;
                fileChannel = fileChannel2;
                fileChannel2 = channel;
                if (fileChannel2 != null) {
                    try {
                        fileChannel2.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                        throw th;
                    }
                }
                if (fileChannel != null) {
                    fileChannel.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            fileChannel = null;
            if (fileChannel2 != null) {
            }
            if (fileChannel != null) {
            }
            throw th;
        }
    }

    public static b e(d dVar, sc2 sc2) {
        int i = 0;
        try {
            ExifInterface exifInterface = new ExifInterface(sc2.a.getAbsolutePath());
            float[] fArr = new float[2];
            exifInterface.getLatLong(fArr);
            float f = fArr[0];
            boolean z = true;
            float f2 = fArr[1];
            if (!(f == 0.0f && f2 == 0.0f)) {
                dVar.g(C0201.m82(4905), (double) f);
                dVar.g(C0201.m82(4906), (double) f2);
            }
            String attribute = exifInterface.getAttribute(C0201.m82(4907));
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(C0201.m82(4908));
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(C0201.m82(4909));
            simpleDateFormat2.setTimeZone(TimeZone.getTimeZone(C0201.m82(4910)));
            try {
                dVar.i(C0201.m82(4912), simpleDateFormat2.format(simpleDateFormat.parse(attribute)) + C0201.m82(4911));
            } catch (Exception unused) {
            }
            int attributeInt = exifInterface.getAttributeInt(C0201.m82(4913), 1);
            if (attributeInt != 3) {
                if (attributeInt == 6) {
                    i = 90;
                } else if (attributeInt == 8) {
                    i = 270;
                }
                z = false;
            } else {
                i = 180;
            }
            dVar.h(C0201.m82(4914), i);
            dVar.f(C0201.m82(4915), z);
            return new b(i, null);
        } catch (IOException e) {
            e.printStackTrace();
            return new b(0, e);
        }
    }

    public static void f(int i, sc2 sc2) {
        if (i == 13001) {
            File file = sc2.a;
            if (file != null && file.exists()) {
                sc2.a.delete();
            }
            File file2 = sc2.b;
            if (file2 != null && file2.exists()) {
                sc2.b.delete();
            }
        }
    }

    public static c g(sc2 sc2) {
        sc2 sc22;
        File file = sc2.b;
        if (file == null) {
            file = sc2.a;
        }
        File file2 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getPath(), file.getName());
        try {
            d(file, file2);
            if (sc2.b != null) {
                sc22 = sc2.g(file2);
            } else {
                sc22 = sc2.f(file2);
            }
            return new c(sc22, null);
        } catch (IOException e) {
            e.printStackTrace();
            return new c(sc2, e);
        }
    }
}
