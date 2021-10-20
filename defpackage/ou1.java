package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.vision.b;
import com.google.android.gms.vision.d;
import java.nio.ByteBuffer;
import java.util.HashSet;
import vigqyno.C0201;

/* renamed from: ou1  reason: default package */
public final class ou1 extends com.google.android.gms.vision.a<nu1> {
    public static final String a = null;
    public static final String b = null;
    private final d c;
    private final uu1 d;
    private final Object e;
    private boolean f;

    /* renamed from: ou1$a */
    public static class a {
        private final Context a;
        private int b = 0;
        private boolean c = false;
        private int d = 0;
        private boolean e = true;
        private int f = 0;
        private float g = -1.0f;

        public a(Context context) {
            this.a = context;
        }

        public ou1 a() {
            wu1 wu1 = new wu1();
            wu1.a = this.f;
            wu1.b = this.b;
            wu1.c = this.d;
            wu1.d = this.c;
            wu1.e = this.e;
            wu1.f = this.g;
            if (ou1.d(wu1)) {
                return new ou1(new uu1(this.a, wu1));
            }
            throw new IllegalArgumentException(C0201.m82(21889));
        }

        public a b(int i) {
            if (i == 0 || i == 1) {
                this.d = i;
                return this;
            }
            StringBuilder sb = new StringBuilder(40);
            sb.append(C0201.m82(21890));
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }

        public a c(int i) {
            if (i == 0 || i == 1 || i == 2) {
                this.b = i;
                return this;
            }
            StringBuilder sb = new StringBuilder(34);
            sb.append(C0201.m82(21891));
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }

        public a d(float f2) {
            if (f2 < 0.0f || f2 > 1.0f) {
                StringBuilder sb = new StringBuilder(47);
                sb.append(C0201.m82(21892));
                sb.append(f2);
                throw new IllegalArgumentException(sb.toString());
            }
            this.g = f2;
            return this;
        }

        public a e(int i) {
            if (i == 0 || i == 1 || i == 2) {
                this.f = i;
                return this;
            }
            StringBuilder sb = new StringBuilder(25);
            sb.append(C0201.m82(21893));
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }

        public a f(boolean z) {
            this.e = z;
            return this;
        }
    }

    static {
        C0201.m83(ou1.class, 83);
    }

    private ou1(uu1 uu1) {
        this.c = new d();
        this.e = new Object();
        this.f = true;
        this.d = uu1;
    }

    /* access modifiers changed from: private */
    public static boolean d(wu1 wu1) {
        boolean z;
        int i = wu1.a;
        String r2 = C0201.m82(26025);
        if (i == 2 || wu1.b != 2) {
            z = true;
        } else {
            Log.e(r2, C0201.m82(26026));
            z = false;
        }
        if (wu1.b != 2 || wu1.c != 1) {
            return z;
        }
        Log.e(r2, C0201.m82(26027));
        return false;
    }

    @Override // com.google.android.gms.vision.a
    public final void a() {
        super.a();
        synchronized (this.e) {
            if (this.f) {
                this.d.d();
                this.f = false;
            }
        }
    }

    public final SparseArray<nu1> b(b bVar) {
        ByteBuffer byteBuffer;
        nu1[] f2;
        if (bVar != null) {
            if (bVar.a() != null) {
                Bitmap a2 = bVar.a();
                int width = a2.getWidth();
                int height = a2.getHeight();
                int i = width * height;
                byteBuffer = ByteBuffer.allocateDirect(((((width + 1) / 2) * ((height + 1) / 2)) << 1) + i);
                int i2 = i;
                for (int i3 = 0; i3 < i; i3++) {
                    int i4 = i3 % width;
                    int i5 = i3 / width;
                    int pixel = a2.getPixel(i4, i5);
                    float red = (float) Color.red(pixel);
                    float green = (float) Color.green(pixel);
                    float blue = (float) Color.blue(pixel);
                    byteBuffer.put(i3, (byte) ((int) ((0.299f * red) + (0.587f * green) + (0.114f * blue))));
                    if (i5 % 2 == 0 && i4 % 2 == 0) {
                        int i6 = i2 + 1;
                        byteBuffer.put(i2, (byte) ((int) ((-0.169f * red) + (-0.331f * green) + (blue * 0.5f) + 128.0f)));
                        i2 = i6 + 1;
                        byteBuffer.put(i6, (byte) ((int) ((red * 0.5f) + (green * -0.419f) + (blue * -0.081f) + 128.0f)));
                    }
                }
            } else {
                byteBuffer = bVar.b();
            }
            synchronized (this.e) {
                if (this.f) {
                    f2 = this.d.f(byteBuffer, np1.o(bVar));
                } else {
                    throw new RuntimeException(b);
                }
            }
            HashSet hashSet = new HashSet();
            SparseArray<nu1> sparseArray = new SparseArray<>(f2.length);
            int i7 = 0;
            for (nu1 nu1 : f2) {
                int d2 = nu1.d();
                i7 = Math.max(i7, d2);
                if (hashSet.contains(Integer.valueOf(d2))) {
                    d2 = i7 + 1;
                    i7 = d2;
                }
                hashSet.add(Integer.valueOf(d2));
                sparseArray.append(this.c.a(d2), nu1);
            }
            return sparseArray;
        }
        throw new IllegalArgumentException(a);
    }

    public final boolean c() {
        return this.d.a();
    }

    public final void finalize() throws Throwable {
        try {
            synchronized (this.e) {
                if (this.f) {
                    Log.w(C0201.m82(26028), C0201.m82(26029));
                    a();
                }
            }
        } finally {
            super.finalize();
        }
    }
}
