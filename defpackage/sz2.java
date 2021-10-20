package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Base64;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.reactnative.camera.e;
import vigqyno.C0201;

/* renamed from: sz2  reason: default package */
/* compiled from: ResolveTakenPictureAsyncTask */
public class sz2 extends AsyncTask<Void, Void, WritableMap> {
    public static final String h = null;
    public static final String i = null;
    public static final String j = null;
    public static final String k = null;
    public static final String l = null;
    public static final String m = null;
    public static final String n = null;
    public static final String o = null;
    public static final String p = null;
    public static final String q = null;
    public static final String r = null;
    public static final String s = null;
    public static final String t = null;
    public static final String u = null;
    public static final String v = null;
    public static final String w = null;
    private Promise a;
    private Bitmap b;
    private byte[] c;
    private ReadableMap d;
    private File e;
    private int f;
    private rz2 g;

    /* access modifiers changed from: package-private */
    /* renamed from: sz2$a */
    /* compiled from: ResolveTakenPictureAsyncTask */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            int[] iArr = new int[ReadableType.values().length];
            a = iArr;
            iArr[ReadableType.Boolean.ordinal()] = 1;
            a[ReadableType.Map.ordinal()] = 2;
        }
    }

    static {
        C0201.m83(sz2.class, 43);
    }

    public sz2(byte[] bArr, Promise promise, ReadableMap readableMap, File file, int i2, rz2 rz2) {
        this.a = promise;
        this.d = readableMap;
        this.c = bArr;
        this.e = file;
        this.f = i2;
        this.g = rz2;
    }

    private Bitmap b(Bitmap bitmap) {
        Matrix matrix = new Matrix();
        matrix.preScale(-1.0f, 1.0f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    private String c() throws IOException {
        ReadableMap readableMap = this.d;
        String r1 = C0201.m82(13373);
        if (readableMap.hasKey(r1)) {
            return this.d.getString(r1);
        }
        return xz2.b(this.e, C0201.m82(13374));
    }

    private int d(int i2) {
        if (i2 == 3) {
            return 180;
        }
        if (i2 != 6) {
            return i2 != 8 ? 0 : 270;
        }
        return 90;
    }

    private int e() {
        return (int) (this.d.getDouble(C0201.m82(13375)) * 100.0d);
    }

    private void f() throws IOException {
        if (this.b == null) {
            byte[] bArr = this.c;
            this.b = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        }
        if (this.b == null) {
            throw new IOException(C0201.m82(13376));
        }
    }

    private Bitmap h(Bitmap bitmap, int i2) {
        return Bitmap.createScaledBitmap(bitmap, i2, (int) (((float) bitmap.getHeight()) * (((float) i2) / ((float) bitmap.getWidth()))), true);
    }

    private Bitmap i(Bitmap bitmap, int i2) {
        Matrix matrix = new Matrix();
        matrix.postRotate((float) i2);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        r4 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0026, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0035, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0036, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x001b A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x0001] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x002b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0031 A[SYNTHETIC, Splitter:B:28:0x0031] */
    private String j(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        String str;
        IOException e2;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        r0 = null;
        IOException iOException = null;
        try {
            str = c();
            fileOutputStream = new FileOutputStream(str);
            try {
                byteArrayOutputStream.writeTo(fileOutputStream);
                try {
                    fileOutputStream.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            } catch (IOException e4) {
                e2 = e4;
                iOException = e2;
                try {
                    iOException.printStackTrace();
                    if (fileOutputStream != null) {
                    }
                    if (iOException != null) {
                    }
                } catch (Throwable th) {
                    Throwable th2 = th;
                    fileOutputStream2 = fileOutputStream;
                    if (fileOutputStream2 != null) {
                    }
                    throw th2;
                }
            }
        } catch (IOException e5) {
            e2 = e5;
            str = null;
            fileOutputStream = null;
            iOException = e2;
            iOException.printStackTrace();
            if (fileOutputStream != null) {
            }
            if (iOException != null) {
            }
        } catch (Throwable th3) {
        }
        if (iOException != null) {
            return str;
        }
        throw iOException;
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x0255 A[SYNTHETIC, Splitter:B:108:0x0255] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0277 A[SYNTHETIC, Splitter:B:120:0x0277] */
    /* JADX WARNING: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e3 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ec A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01c4  */
    /* renamed from: a */
    public WritableMap doInBackground(Void... voidArr) {
        ByteArrayInputStream byteArrayInputStream;
        Throwable th;
        ByteArrayInputStream byteArrayInputStream2;
        Resources.NotFoundException e2;
        IOException e3;
        boolean z;
        k4 k4Var;
        boolean z2;
        ReadableMap readableMap;
        boolean z3;
        WritableMap writableMap;
        Bitmap bitmap;
        String str = v;
        String str2 = k;
        String str3 = s;
        String str4 = q;
        String str5 = u;
        String str6 = h;
        WritableMap createMap = Arguments.createMap();
        createMap.putInt(w, this.f);
        ReadableMap readableMap2 = this.d;
        String str7 = i;
        createMap.putInt(n, readableMap2.hasKey(str7) ? this.d.getInt(str7) : this.f);
        try {
            byteArrayInputStream2 = new ByteArrayInputStream(this.c);
            try {
                boolean hasKey = this.d.hasKey(str2);
                String str8 = o;
                if (!hasKey || !this.d.getBoolean(str2)) {
                    k4Var = null;
                } else {
                    k4Var = new k4(byteArrayInputStream2);
                    int k2 = k4Var.k(str8, 0);
                    if (k2 != 0) {
                        f();
                        this.b = i(this.b, d(k2));
                        z = true;
                        if (this.d.hasKey(str6)) {
                            f();
                            this.b = h(this.b, this.d.getInt(str6));
                        }
                        if (this.d.hasKey(str) && this.d.getBoolean(str)) {
                            f();
                            this.b = b(this.b);
                        }
                        z2 = !this.d.hasKey(str4) && this.d.getBoolean(str4);
                        if (this.d.hasKey(str5)) {
                            int i2 = a.a[this.d.getType(str5).ordinal()];
                            if (i2 == 1) {
                                z3 = this.d.getBoolean(str5);
                                readableMap = null;
                                String str9 = t;
                                if (!z2) {
                                }
                                if (this.b == null) {
                                }
                                if (k4Var == null) {
                                }
                                writableMap = e.r(k4Var);
                                if (readableMap != null) {
                                }
                                if (this.b != null) {
                                }
                                if (z2) {
                                }
                                bitmap = this.b;
                                String str10 = l;
                                String str11 = m;
                                String str12 = r;
                                if (bitmap != null) {
                                }
                                byteArrayInputStream2.close();
                                return createMap;
                            } else if (i2 == 2) {
                                readableMap = this.d.getMap(str5);
                                z3 = true;
                                String str92 = t;
                                if (!z2 || z3) {
                                    if (this.b == null || readableMap != null || z2) {
                                        if (k4Var == null) {
                                            k4Var = new k4(byteArrayInputStream2);
                                        }
                                        writableMap = e.r(k4Var);
                                        if (readableMap != null) {
                                            writableMap.merge(readableMap);
                                        }
                                    } else {
                                        writableMap = null;
                                    }
                                    if (this.b != null) {
                                        writableMap.putInt(str6, this.b.getWidth());
                                        writableMap.putInt(str92, this.b.getHeight());
                                        if (z) {
                                            writableMap.putInt(str8, 1);
                                        }
                                    }
                                    if (z2) {
                                        WritableMap createMap2 = Arguments.createMap();
                                        createMap2.merge(writableMap);
                                        createMap.putMap(str4, createMap2);
                                    }
                                } else {
                                    writableMap = null;
                                }
                                bitmap = this.b;
                                String str102 = l;
                                String str112 = m;
                                String str122 = r;
                                if (bitmap != null) {
                                    BitmapFactory.Options options = new BitmapFactory.Options();
                                    options.inJustDecodeBounds = true;
                                    BitmapFactory.decodeByteArray(this.c, 0, this.c.length, options);
                                    createMap.putInt(str6, options.outWidth);
                                    createMap.putInt(str92, options.outHeight);
                                    if (!this.d.hasKey(str112) || !this.d.getBoolean(str112)) {
                                        File file = new File(c());
                                        file.createNewFile();
                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                        fileOutputStream.write(this.c);
                                        fileOutputStream.flush();
                                        fileOutputStream.close();
                                        if (z3 && readableMap != null) {
                                            k4 k4Var2 = new k4(file.getAbsolutePath());
                                            e.t(k4Var2, readableMap);
                                            k4Var2.Q();
                                        } else if (!z3) {
                                            k4 k4Var3 = new k4(file.getAbsolutePath());
                                            e.a(k4Var3);
                                            k4Var3.Q();
                                        }
                                        createMap.putString(str102, Uri.fromFile(file).toString());
                                    }
                                    if (this.d.hasKey(str122) && this.d.getBoolean(str122)) {
                                        createMap.putString(str122, Base64.encodeToString(this.c, 2));
                                    }
                                } else {
                                    createMap.putInt(str6, this.b.getWidth());
                                    createMap.putInt(str92, this.b.getHeight());
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    this.b.compress(Bitmap.CompressFormat.JPEG, e(), byteArrayOutputStream);
                                    if (!this.d.hasKey(str112) || !this.d.getBoolean(str112)) {
                                        String j2 = j(byteArrayOutputStream);
                                        if (z3 && writableMap != null) {
                                            k4 k4Var4 = new k4(j2);
                                            e.t(k4Var4, writableMap);
                                            k4Var4.Q();
                                        }
                                        createMap.putString(str102, Uri.fromFile(new File(j2)).toString());
                                    }
                                    if (this.d.hasKey(str122) && this.d.getBoolean(str122)) {
                                        createMap.putString(str122, Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2));
                                    }
                                }
                                byteArrayInputStream2.close();
                                return createMap;
                            }
                        }
                        z3 = true;
                        readableMap = null;
                        String str922 = t;
                        if (!z2) {
                        }
                        if (this.b == null) {
                        }
                        if (k4Var == null) {
                        }
                        writableMap = e.r(k4Var);
                        if (readableMap != null) {
                        }
                        if (this.b != null) {
                        }
                        if (z2) {
                        }
                        bitmap = this.b;
                        String str1022 = l;
                        String str1122 = m;
                        String str1222 = r;
                        if (bitmap != null) {
                        }
                        byteArrayInputStream2.close();
                        return createMap;
                    }
                }
                z = false;
                if (this.d.hasKey(str6)) {
                }
                f();
                this.b = b(this.b);
                if (!this.d.hasKey(str4)) {
                }
                if (this.d.hasKey(str5)) {
                }
                z3 = true;
                readableMap = null;
                String str9222 = t;
                if (!z2) {
                }
                if (this.b == null) {
                }
                if (k4Var == null) {
                }
                writableMap = e.r(k4Var);
                if (readableMap != null) {
                }
                if (this.b != null) {
                }
                if (z2) {
                }
                bitmap = this.b;
                String str10222 = l;
                String str11222 = m;
                String str12222 = r;
                if (bitmap != null) {
                }
                try {
                    byteArrayInputStream2.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
                return createMap;
            } catch (Resources.NotFoundException e5) {
                e2 = e5;
                this.a.reject(str3, p, e2);
                e2.printStackTrace();
                if (byteArrayInputStream2 != null) {
                    return null;
                }
                byteArrayInputStream2.close();
                return null;
            } catch (IOException e6) {
                e3 = e6;
                try {
                    this.a.reject(str3, j, e3);
                    e3.printStackTrace();
                    if (byteArrayInputStream2 != null) {
                        return null;
                    }
                    try {
                        byteArrayInputStream2.close();
                        return null;
                    } catch (IOException e7) {
                        e7.printStackTrace();
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayInputStream = byteArrayInputStream2;
                    if (byteArrayInputStream != null) {
                        try {
                            byteArrayInputStream.close();
                        } catch (IOException e8) {
                            e8.printStackTrace();
                        }
                    }
                    throw th;
                }
            }
        } catch (Resources.NotFoundException e9) {
            e2 = e9;
            byteArrayInputStream2 = null;
            this.a.reject(str3, p, e2);
            e2.printStackTrace();
            if (byteArrayInputStream2 != null) {
            }
        } catch (IOException e10) {
            e3 = e10;
            byteArrayInputStream2 = null;
            this.a.reject(str3, j, e3);
            e3.printStackTrace();
            if (byteArrayInputStream2 != null) {
            }
        } catch (Throwable th3) {
            th = th3;
            byteArrayInputStream = null;
            if (byteArrayInputStream != null) {
            }
            throw th;
        }
    }

    /* renamed from: g */
    public void onPostExecute(WritableMap writableMap) {
        super.onPostExecute(writableMap);
        if (writableMap != null) {
            ReadableMap readableMap = this.d;
            String r1 = C0201.m82(13377);
            if (!readableMap.hasKey(r1) || !this.d.getBoolean(r1)) {
                this.a.resolve(writableMap);
                return;
            }
            WritableMap createMap = Arguments.createMap();
            ReadableMap readableMap2 = this.d;
            String r2 = C0201.m82(13378);
            createMap.putInt(r2, readableMap2.getInt(r2));
            createMap.putMap(C0201.m82(13379), writableMap);
            this.g.h(createMap);
        }
    }
}
