package defpackage;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;
import vigqyno.C0201;

/* renamed from: fp  reason: default package */
/* compiled from: Util */
public final class fp {
    private static final char[] a = C0201.m82(15431).toCharArray();
    private static final char[] b = new char[64];

    /* access modifiers changed from: package-private */
    /* renamed from: fp$a */
    /* compiled from: Util */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            a = iArr;
            iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            a[Bitmap.Config.RGB_565.ordinal()] = 2;
            a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            a[Bitmap.Config.RGBA_F16.ordinal()] = 4;
            a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
        }
    }

    public static void a() {
        if (!p()) {
            throw new IllegalArgumentException(C0201.m82(15432));
        }
    }

    public static boolean b(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        if (obj instanceof xj) {
            return ((xj) obj).a(obj2);
        }
        return obj.equals(obj2);
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    private static String d(byte[] bArr, char[] cArr) {
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            char[] cArr2 = a;
            cArr[i3] = cArr2[i2 >>> 4];
            cArr[i3 + 1] = cArr2[i2 & 15];
        }
        return new String(cArr);
    }

    public static <T> Queue<T> e(int i) {
        return new ArrayDeque(i);
    }

    public static int f(int i, int i2, Bitmap.Config config) {
        return i * i2 * h(config);
    }

    @TargetApi(19)
    public static int g(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            if (Build.VERSION.SDK_INT >= 19) {
                try {
                    return bitmap.getAllocationByteCount();
                } catch (NullPointerException unused) {
                }
            }
            return bitmap.getHeight() * bitmap.getRowBytes();
        }
        throw new IllegalStateException(C0201.m82(15433) + bitmap + C0201.m82(15434) + bitmap.getWidth() + C0201.m82(15435) + bitmap.getHeight() + C0201.m82(15436) + bitmap.getConfig());
    }

    private static int h(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = a.a[config.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2 || i == 3) {
            return 2;
        }
        return i != 4 ? 4 : 8;
    }

    public static <T> List<T> i(Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T t : collection) {
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static int j(float f) {
        return k(f, 17);
    }

    public static int k(float f, int i) {
        return l(Float.floatToIntBits(f), i);
    }

    public static int l(int i, int i2) {
        return (i2 * 31) + i;
    }

    public static int m(Object obj, int i) {
        return l(obj == null ? 0 : obj.hashCode(), i);
    }

    public static int n(boolean z, int i) {
        return l(z ? 1 : 0, i);
    }

    public static boolean o() {
        return !p();
    }

    public static boolean p() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    private static boolean q(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    public static boolean r(int i, int i2) {
        return q(i) && q(i2);
    }

    public static String s(byte[] bArr) {
        String d;
        synchronized (b) {
            d = d(bArr, b);
        }
        return d;
    }
}
