package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import vigqyno.C0201;

/* renamed from: kc2  reason: default package */
public class kc2 {
    private static final String a = null;
    private static final Uri b = Uri.parse(C0201.m82(12202));
    private static final String[] c = {C0201.m82(12203), C0201.m82(12204)};
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
    public static final String q = null;
    public static final String r = null;
    public static final String s = null;
    public static final String t = null;
    public static final String u = null;

    static {
        C0201.m83(kc2.class, 39);
    }

    private kc2() {
    }

    private static String a(byte[] bArr) {
        String r0 = C0201.m82(12205);
        if (bArr == null || bArr.length == 0) {
            return r0;
        }
        try {
            return f(MessageDigest.getInstance(C0201.m82(12206)).digest(bArr));
        } catch (NoSuchAlgorithmException e2) {
            String str = a;
            Log.e(str, C0201.m82(12207) + e2.getMessage());
            return r0;
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0059 */
    private static void b(InputStream inputStream, Context context) {
        Throwable th;
        if (inputStream != null && context != null) {
            String e2 = e(context);
            if (!new File(e2).exists()) {
                d(e2);
            }
            File file = new File(e2, C0201.m82(12208));
            if (file.exists()) {
                file.delete();
            }
            FileOutputStream fileOutputStream = null;
            pc2.c(a, C0201.m82(12209));
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[2048];
                while (true) {
                    int read = inputStream.read(bArr, 0, 2048);
                    if (read != -1) {
                        fileOutputStream2.write(bArr, 0, read);
                    } else {
                        oc2.b(fileOutputStream2);
                        return;
                    }
                }
            } catch (IOException unused) {
                fileOutputStream = fileOutputStream2;
                try {
                    pc2.e(a, C0201.m82(12210));
                    oc2.b(fileOutputStream);
                } catch (Throwable th2) {
                    th = th2;
                    oc2.b(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = fileOutputStream2;
                oc2.b(fileOutputStream);
                throw th;
            }
        }
    }

    private static boolean c(Context context, String str) {
        byte[] j2 = j(context, str);
        for (String str2 : c) {
            if (str2.equalsIgnoreCase(a(j2))) {
                return true;
            }
        }
        return false;
    }

    private static int d(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        File file = new File(str);
        if (file.exists()) {
            pc2.d(a, C0201.m82(12211));
            return 1;
        } else if (file.mkdirs()) {
            pc2.b(a, C0201.m82(12212));
            return 0;
        } else {
            pc2.e(a, C0201.m82(12213));
            return -1;
        }
    }

    private static String e(Context context) {
        int i2 = Build.VERSION.SDK_INT;
        String r1 = C0201.m82(12214);
        if (i2 >= 24) {
            return context.createDeviceProtectedStorageContext().getFilesDir() + File.separator + r1;
        }
        return context.getApplicationContext().getFilesDir() + File.separator + r1;
    }

    private static String f(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return C0201.m82(12215);
        }
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    private static boolean g(Context context, String str) {
        return C0201.m82(12216).equalsIgnoreCase(a(j(context, str)));
    }

    private static boolean h(Context context) {
        return new File(e(context) + File.separator + C0201.m82(12217)).exists();
    }

    private static boolean i(String str) {
        int i2;
        int i3;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String str2 = a;
        pc2.c(str2, C0201.m82(12218) + str);
        String r0 = C0201.m82(12219);
        String[] split = str.split(r0);
        String[] split2 = C0201.m82(12220).split(r0);
        int length = split.length;
        int length2 = split2.length;
        int max = Math.max(length, length2);
        for (int i4 = 0; i4 < max; i4++) {
            if (i4 < length) {
                try {
                    i2 = Integer.parseInt(split[i4]);
                } catch (Exception e2) {
                    String str3 = a;
                    pc2.e(str3, C0201.m82(12221) + e2.getMessage());
                    if (i4 >= length2) {
                        return true;
                    }
                    return false;
                }
            } else {
                i2 = 0;
            }
            if (i4 < length2) {
                i3 = Integer.parseInt(split2[i4]);
            } else {
                i3 = 0;
            }
            if (i2 < i3) {
                return false;
            }
            if (i2 > i3) {
                return true;
            }
        }
        return true;
    }

    private static byte[] j(Context context, String str) {
        PackageInfo packageInfo;
        if (context == null || TextUtils.isEmpty(str)) {
            Log.e(a, C0201.m82(12224));
            return new byte[0];
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (!(packageManager == null || (packageInfo = packageManager.getPackageInfo(str, 64)) == null)) {
                return packageInfo.signatures[0].toByteArray();
            }
        } catch (PackageManager.NameNotFoundException e2) {
            String str2 = a;
            Log.e(str2, C0201.m82(12223) + e2.getMessage());
        } catch (Exception e3) {
            String str3 = a;
            Log.e(str3, C0201.m82(12222) + e3.getMessage());
        }
        return new byte[0];
    }

    private static String k(Context context) {
        return e(context) + File.separator + C0201.m82(12225);
    }

    private static void l(Context context) {
        String str = a;
        pc2.c(str, C0201.m82(12226) + new SimpleDateFormat(C0201.m82(12227)).format(Long.valueOf(rc2.b(C0201.m82(12228), 0, context))));
    }

    public static synchronized InputStream m(Context context) {
        synchronized (kc2.class) {
            pc2.c(a, m);
            if (context != null) {
                mc2.b(context);
            }
            Context a2 = mc2.a();
            if (a2 == null) {
                pc2.e(a, i);
                return null;
            } else if (!qc2.a(l) && !qc2.a(s)) {
                pc2.e(a, u);
                return null;
            } else if (!i(qc2.b(h)) && !i(qc2.b(o))) {
                String str = a;
                pc2.e(str, k + qc2.b(f));
                return null;
            } else if (c(a2, q) || g(a2, e)) {
                try {
                    InputStream openInputStream = a2.getContentResolver().openInputStream(Uri.withAppendedPath(b, p));
                    long b2 = rc2.b(t, 0, a2);
                    long currentTimeMillis = System.currentTimeMillis();
                    if (h(a2) && currentTimeMillis - b2 <= 604800000) {
                        if (b2 != 0) {
                            pc2.c(a, r);
                            return openInputStream;
                        }
                    }
                    rc2.a(d, currentTimeMillis, a2);
                    b(openInputStream, a2);
                    pc2.c(a, j);
                    if (openInputStream != null) {
                        oc2.c(openInputStream);
                    }
                    return n(a2);
                } catch (Exception unused) {
                    pc2.e(a, n);
                    return null;
                }
            } else {
                pc2.e(a, g);
                return null;
            }
        }
    }

    public static InputStream n(Context context) {
        if (!h(context)) {
            return null;
        }
        l(context);
        try {
            return new FileInputStream(k(context));
        } catch (FileNotFoundException unused) {
            pc2.e(a, C0201.m82(12229));
            return null;
        }
    }
}
