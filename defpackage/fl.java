package defpackage;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.h;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.j;
import defpackage.el;
import defpackage.ll;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import vigqyno.C0201;

/* renamed from: fl  reason: default package */
/* compiled from: Downsampler */
public final class fl {
    public static final h<com.bumptech.glide.load.b> f = h.f(C0201.m82(15173), com.bumptech.glide.load.b.c);
    public static final h<j> g = h.f(C0201.m82(15174), j.SRGB);
    public static final h<Boolean> h = h.f(C0201.m82(15175), Boolean.FALSE);
    public static final h<Boolean> i = h.f(C0201.m82(15176), Boolean.FALSE);
    private static final Set<String> j = Collections.unmodifiableSet(new HashSet(Arrays.asList(C0201.m82(15177), C0201.m82(15178))));
    private static final b k = new a();
    private static final Set<ImageHeaderParser.ImageType> l = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
    private static final Queue<BitmapFactory.Options> m = fp.e(0);
    private final qi a;
    private final DisplayMetrics b;
    private final ni c;
    private final List<ImageHeaderParser> d;
    private final kl e = kl.a();

    /* renamed from: fl$a */
    /* compiled from: Downsampler */
    class a implements b {
        @Override // defpackage.fl.b
        public void a(qi qiVar, Bitmap bitmap) {
        }

        @Override // defpackage.fl.b
        public void b() {
        }
    }

    /* renamed from: fl$b */
    /* compiled from: Downsampler */
    public interface b {
        void a(qi qiVar, Bitmap bitmap) throws IOException;

        void b();
    }

    static {
        h<el> hVar = el.f;
    }

    public fl(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, qi qiVar, ni niVar) {
        this.d = list;
        ep.d(displayMetrics);
        this.b = displayMetrics;
        ep.d(qiVar);
        this.a = qiVar;
        ep.d(niVar);
        this.c = niVar;
    }

    private static int a(double d2) {
        int l2 = l(d2);
        double d3 = (double) l2;
        Double.isNaN(d3);
        int x = x(d3 * d2);
        double d4 = (double) (((float) x) / ((float) l2));
        Double.isNaN(d4);
        double d5 = (double) x;
        Double.isNaN(d5);
        return x((d2 / d4) * d5);
    }

    private void b(ll llVar, com.bumptech.glide.load.b bVar, boolean z, boolean z2, BitmapFactory.Options options, int i2, int i3) {
        if (!this.e.e(i2, i3, options, z, z2)) {
            if (bVar == com.bumptech.glide.load.b.PREFER_ARGB_8888 || Build.VERSION.SDK_INT == 16) {
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                return;
            }
            boolean z3 = false;
            try {
                z3 = llVar.d().hasAlpha();
            } catch (IOException e2) {
                String r13 = C0201.m82(15179);
                if (Log.isLoggable(r13, 3)) {
                    Log.d(r13, C0201.m82(15180) + bVar, e2);
                }
            }
            Bitmap.Config config = z3 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
            options.inPreferredConfig = config;
            if (config == Bitmap.Config.RGB_565) {
                options.inDither = true;
            }
        }
    }

    private static void c(ImageHeaderParser.ImageType imageType, ll llVar, b bVar, qi qiVar, el elVar, int i2, int i3, int i4, int i5, int i6, BitmapFactory.Options options) throws IOException {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        double d2;
        String r7 = C0201.m82(15181);
        String r8 = C0201.m82(15182);
        String r9 = C0201.m82(15183);
        if (i3 > 0 && i4 > 0) {
            if (r(i2)) {
                i7 = i3;
                i8 = i4;
            } else {
                i8 = i3;
                i7 = i4;
            }
            float b2 = elVar.b(i8, i7, i5, i6);
            if (b2 > 0.0f) {
                el.e a2 = elVar.a(i8, i7, i5, i6);
                if (a2 != null) {
                    float f2 = (float) i8;
                    float f3 = (float) i7;
                    int x = i8 / x((double) (b2 * f2));
                    int x2 = i7 / x((double) (b2 * f3));
                    if (a2 == el.e.MEMORY) {
                        i9 = Math.max(x, x2);
                    } else {
                        i9 = Math.min(x, x2);
                    }
                    if (Build.VERSION.SDK_INT > 23 || !j.contains(options.outMimeType)) {
                        i10 = Math.max(1, Integer.highestOneBit(i9));
                        if (a2 == el.e.MEMORY && ((float) i10) < 1.0f / b2) {
                            i10 <<= 1;
                        }
                    } else {
                        i10 = 1;
                    }
                    options.inSampleSize = i10;
                    if (imageType == ImageHeaderParser.ImageType.JPEG) {
                        float min = (float) Math.min(i10, 8);
                        i11 = (int) Math.ceil((double) (f2 / min));
                        i12 = (int) Math.ceil((double) (f3 / min));
                        int i13 = i10 / 8;
                        if (i13 > 0) {
                            i11 /= i13;
                            i12 /= i13;
                        }
                    } else {
                        if (imageType == ImageHeaderParser.ImageType.PNG || imageType == ImageHeaderParser.ImageType.PNG_A) {
                            float f4 = (float) i10;
                            i11 = (int) Math.floor((double) (f2 / f4));
                            d2 = Math.floor((double) (f3 / f4));
                        } else if (imageType == ImageHeaderParser.ImageType.WEBP || imageType == ImageHeaderParser.ImageType.WEBP_A) {
                            if (Build.VERSION.SDK_INT >= 24) {
                                float f5 = (float) i10;
                                i11 = Math.round(f2 / f5);
                                i12 = Math.round(f3 / f5);
                            } else {
                                float f6 = (float) i10;
                                i11 = (int) Math.floor((double) (f2 / f6));
                                d2 = Math.floor((double) (f3 / f6));
                            }
                        } else if (i8 % i10 == 0 && i7 % i10 == 0) {
                            i11 = i8 / i10;
                            i12 = i7 / i10;
                        } else {
                            int[] m2 = m(llVar, options, bVar, qiVar);
                            i11 = m2[0];
                            i12 = m2[1];
                        }
                        i12 = (int) d2;
                    }
                    double b3 = (double) elVar.b(i11, i12, i5, i6);
                    if (Build.VERSION.SDK_INT >= 19) {
                        options.inTargetDensity = a(b3);
                        options.inDensity = l(b3);
                    }
                    if (s(options)) {
                        options.inScaled = true;
                    } else {
                        options.inTargetDensity = 0;
                        options.inDensity = 0;
                    }
                    if (Log.isLoggable(r8, 2)) {
                        Log.v(r8, C0201.m82(15184) + i3 + r9 + i4 + C0201.m82(15185) + i2 + C0201.m82(15186) + i5 + r9 + i6 + C0201.m82(15187) + i11 + r9 + i12 + C0201.m82(15188) + b2 + C0201.m82(15189) + i10 + C0201.m82(15190) + b3 + C0201.m82(15191) + options.inTargetDensity + C0201.m82(15192) + options.inDensity);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException(C0201.m82(15193));
            }
            throw new IllegalArgumentException(C0201.m82(15194) + b2 + C0201.m82(15195) + elVar + C0201.m82(15196) + i3 + r9 + i4 + C0201.m82(15197) + i5 + r9 + i6 + r7);
        } else if (Log.isLoggable(r8, 3)) {
            Log.d(r8, C0201.m82(15198) + imageType + C0201.m82(15199) + i5 + r9 + i6 + r7);
        }
    }

    private hi<Bitmap> e(ll llVar, int i2, int i3, i iVar, b bVar) throws IOException {
        byte[] bArr = (byte[]) this.c.e(65536, byte[].class);
        BitmapFactory.Options k2 = k();
        k2.inTempStorage = bArr;
        com.bumptech.glide.load.b bVar2 = (com.bumptech.glide.load.b) iVar.c(f);
        j jVar = (j) iVar.c(g);
        try {
            return xk.d(h(llVar, k2, (el) iVar.c(el.f), bVar2, jVar, iVar.c(i) != null && ((Boolean) iVar.c(i)).booleanValue(), i2, i3, ((Boolean) iVar.c(h)).booleanValue(), bVar), this.a);
        } finally {
            v(k2);
            this.c.c(bArr);
        }
    }

    private Bitmap h(ll llVar, BitmapFactory.Options options, el elVar, com.bumptech.glide.load.b bVar, j jVar, boolean z, int i2, int i3, boolean z2, b bVar2) throws IOException {
        int i4;
        int i5;
        fl flVar;
        int i6;
        ColorSpace colorSpace;
        int i7;
        int i8;
        long b2 = ap.b();
        int[] m2 = m(llVar, options, bVar2, this.a);
        boolean z3 = false;
        int i9 = m2[0];
        int i10 = m2[1];
        String str = options.outMimeType;
        boolean z4 = (i9 == -1 || i10 == -1) ? false : z;
        int a2 = llVar.a();
        int g2 = sl.g(a2);
        boolean j2 = sl.j(a2);
        if (i2 == Integer.MIN_VALUE) {
            i5 = i3;
            i4 = r(g2) ? i10 : i9;
        } else {
            i5 = i3;
            i4 = i2;
        }
        int i11 = i5 == Integer.MIN_VALUE ? r(g2) ? i9 : i10 : i5;
        ImageHeaderParser.ImageType d2 = llVar.d();
        c(d2, llVar, bVar2, this.a, elVar, g2, i9, i10, i4, i11, options);
        b(llVar, bVar, z4, j2, options, i4, i11);
        boolean z5 = Build.VERSION.SDK_INT >= 19;
        int i12 = options.inSampleSize;
        String r2 = C0201.m82(15200);
        if (i12 == 1 || z5) {
            flVar = this;
            if (flVar.z(d2)) {
                if (i9 < 0 || i10 < 0 || !z2 || !z5) {
                    float f2 = s(options) ? ((float) options.inTargetDensity) / ((float) options.inDensity) : 1.0f;
                    int i13 = options.inSampleSize;
                    float f3 = (float) i13;
                    i8 = Math.round(((float) ((int) Math.ceil((double) (((float) i9) / f3)))) * f2);
                    i7 = Math.round(((float) ((int) Math.ceil((double) (((float) i10) / f3)))) * f2);
                    if (Log.isLoggable(r2, 2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(C0201.m82(15201));
                        sb.append(i8);
                        String r8 = C0201.m82(15202);
                        sb.append(r8);
                        sb.append(i7);
                        sb.append(C0201.m82(15203));
                        sb.append(i9);
                        sb.append(r8);
                        sb.append(i10);
                        sb.append(C0201.m82(15204));
                        sb.append(i13);
                        sb.append(C0201.m82(15205));
                        sb.append(options.inTargetDensity);
                        sb.append(C0201.m82(15206));
                        sb.append(options.inDensity);
                        sb.append(C0201.m82(15207));
                        sb.append(f2);
                        Log.v(r2, sb.toString());
                    }
                } else {
                    i8 = i4;
                    i7 = i11;
                }
                if (i8 > 0 && i7 > 0) {
                    y(options, flVar.a, i8, i7);
                }
            }
        } else {
            flVar = this;
        }
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 28) {
            if (jVar == j.DISPLAY_P3 && (colorSpace = options.outColorSpace) != null && colorSpace.isWideGamut()) {
                z3 = true;
            }
            options.inPreferredColorSpace = ColorSpace.get(z3 ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
        } else if (i14 >= 26) {
            options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        Bitmap i15 = i(llVar, options, bVar2, flVar.a);
        bVar2.a(flVar.a, i15);
        if (Log.isLoggable(r2, 2)) {
            i6 = a2;
            t(i9, i10, str, options, i15, i2, i3, b2);
        } else {
            i6 = a2;
        }
        Bitmap bitmap = null;
        if (i15 != null) {
            i15.setDensity(flVar.b.densityDpi);
            bitmap = sl.k(flVar.a, i15, i6);
            if (!i15.equals(bitmap)) {
                flVar.a.c(i15);
            }
        }
        return bitmap;
    }

    private static Bitmap i(ll llVar, BitmapFactory.Options options, b bVar, qi qiVar) throws IOException {
        String r0 = C0201.m82(15208);
        if (!options.inJustDecodeBounds) {
            bVar.b();
            llVar.c();
        }
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        String str = options.outMimeType;
        sl.f().lock();
        try {
            return llVar.b(options);
        } catch (IllegalArgumentException e2) {
            IOException u = u(e2, i2, i3, str, options);
            if (Log.isLoggable(r0, 3)) {
                Log.d(r0, C0201.m82(15209), u);
            }
            if (options.inBitmap != null) {
                try {
                    qiVar.c(options.inBitmap);
                    options.inBitmap = null;
                    return i(llVar, options, bVar, qiVar);
                } catch (IOException unused) {
                    throw u;
                }
            } else {
                throw u;
            }
        } finally {
            sl.f().unlock();
        }
    }

    @TargetApi(19)
    private static String j(Bitmap bitmap) {
        String str;
        if (bitmap == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            str = C0201.m82(15210) + bitmap.getAllocationByteCount() + C0201.m82(15211);
        } else {
            str = C0201.m82(15212);
        }
        return C0201.m82(15213) + bitmap.getWidth() + C0201.m82(15214) + bitmap.getHeight() + C0201.m82(15215) + bitmap.getConfig() + str;
    }

    private static synchronized BitmapFactory.Options k() {
        BitmapFactory.Options poll;
        synchronized (fl.class) {
            synchronized (m) {
                poll = m.poll();
            }
            if (poll == null) {
                poll = new BitmapFactory.Options();
                w(poll);
            }
        }
        return poll;
    }

    private static int l(double d2) {
        if (d2 > 1.0d) {
            d2 = 1.0d / d2;
        }
        return (int) Math.round(d2 * 2.147483647E9d);
    }

    private static int[] m(ll llVar, BitmapFactory.Options options, b bVar, qi qiVar) throws IOException {
        options.inJustDecodeBounds = true;
        i(llVar, options, bVar, qiVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    private static String n(BitmapFactory.Options options) {
        return j(options.inBitmap);
    }

    private static boolean r(int i2) {
        return i2 == 90 || i2 == 270;
    }

    private static boolean s(BitmapFactory.Options options) {
        int i2;
        int i3 = options.inTargetDensity;
        return i3 > 0 && (i2 = options.inDensity) > 0 && i3 != i2;
    }

    private static void t(int i2, int i3, String str, BitmapFactory.Options options, Bitmap bitmap, int i4, int i5, long j2) {
        StringBuilder sb = new StringBuilder();
        sb.append(C0201.m82(15216));
        sb.append(j(bitmap));
        sb.append(C0201.m82(15217));
        sb.append(i2);
        String r2 = C0201.m82(15218);
        sb.append(r2);
        sb.append(i3);
        sb.append(C0201.m82(15219));
        sb.append(str);
        sb.append(C0201.m82(15220));
        sb.append(n(options));
        sb.append(C0201.m82(15221));
        sb.append(i4);
        sb.append(r2);
        sb.append(i5);
        sb.append(C0201.m82(15222));
        sb.append(options.inSampleSize);
        sb.append(C0201.m82(15223));
        sb.append(options.inDensity);
        sb.append(C0201.m82(15224));
        sb.append(options.inTargetDensity);
        sb.append(C0201.m82(15225));
        sb.append(Thread.currentThread().getName());
        sb.append(C0201.m82(15226));
        sb.append(ap.a(j2));
        Log.v(C0201.m82(15227), sb.toString());
    }

    private static IOException u(IllegalArgumentException illegalArgumentException, int i2, int i3, String str, BitmapFactory.Options options) {
        return new IOException(C0201.m82(15228) + i2 + C0201.m82(15229) + i3 + C0201.m82(15230) + str + C0201.m82(15231) + n(options), illegalArgumentException);
    }

    private static void v(BitmapFactory.Options options) {
        w(options);
        synchronized (m) {
            m.offer(options);
        }
    }

    private static void w(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    private static int x(double d2) {
        return (int) (d2 + 0.5d);
    }

    @TargetApi(26)
    private static void y(BitmapFactory.Options options, qi qiVar, int i2, int i3) {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT < 26) {
            config = null;
        } else if (options.inPreferredConfig != Bitmap.Config.HARDWARE) {
            config = options.outConfig;
        } else {
            return;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = qiVar.e(i2, i3, config);
    }

    private boolean z(ImageHeaderParser.ImageType imageType) {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return l.contains(imageType);
    }

    public hi<Bitmap> d(ParcelFileDescriptor parcelFileDescriptor, int i2, int i3, i iVar) throws IOException {
        return e(new ll.b(parcelFileDescriptor, this.d, this.c), i2, i3, iVar, k);
    }

    public hi<Bitmap> f(InputStream inputStream, int i2, int i3, i iVar) throws IOException {
        return g(inputStream, i2, i3, iVar, k);
    }

    public hi<Bitmap> g(InputStream inputStream, int i2, int i3, i iVar, b bVar) throws IOException {
        return e(new ll.a(inputStream, this.d, this.c), i2, i3, iVar, bVar);
    }

    public boolean o(ParcelFileDescriptor parcelFileDescriptor) {
        return eh.c();
    }

    public boolean p(InputStream inputStream) {
        return true;
    }

    public boolean q(ByteBuffer byteBuffer) {
        return true;
    }
}
