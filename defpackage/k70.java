package defpackage;

import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import vigqyno.C0201;

/* renamed from: k70  reason: default package */
/* compiled from: WebpSupportStatus */
public class k70 {
    public static final boolean a = (Build.VERSION.SDK_INT <= 17);
    public static j70 b = null;
    private static boolean c = false;
    private static final byte[] d = a(C0201.m82(33677));
    private static final byte[] e = a(C0201.m82(33678));
    private static final byte[] f = a(C0201.m82(33679));
    private static final byte[] g = a(C0201.m82(33680));
    private static final byte[] h = a(C0201.m82(33681));

    static {
        int i = Build.VERSION.SDK_INT;
        e();
    }

    private static byte[] a(String str) {
        try {
            return str.getBytes(C0201.m82(33682));
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(C0201.m82(33683), e2);
        }
    }

    public static boolean b(byte[] bArr, int i) {
        return j(bArr, i + 12, h) && ((bArr[i + 20] & 2) == 2);
    }

    public static boolean c(byte[] bArr, int i, int i2) {
        return i2 >= 21 && j(bArr, i + 12, h);
    }

    public static boolean d(byte[] bArr, int i) {
        return j(bArr, i + 12, h) && ((bArr[i + 20] & 16) == 16);
    }

    private static boolean e() {
        int i = Build.VERSION.SDK_INT;
        if (i < 17) {
            return false;
        }
        if (i == 17) {
            byte[] decode = Base64.decode(C0201.m82(33684), 0);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
            if (!(options.outHeight == 1 && options.outWidth == 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean f(byte[] bArr, int i) {
        return j(bArr, i + 12, g);
    }

    public static boolean g(byte[] bArr, int i) {
        return j(bArr, i + 12, f);
    }

    public static boolean h(byte[] bArr, int i, int i2) {
        return i2 >= 20 && j(bArr, i, d) && j(bArr, i + 8, e);
    }

    public static j70 i() {
        if (c) {
            return b;
        }
        j70 j70 = null;
        try {
            j70 = (j70) Class.forName(C0201.m82(33685)).newInstance();
        } catch (Throwable unused) {
        }
        c = true;
        return j70;
    }

    private static boolean j(byte[] bArr, int i, byte[] bArr2) {
        if (bArr2 == null || bArr == null || bArr2.length + i > bArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if (bArr[i2 + i] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }
}
