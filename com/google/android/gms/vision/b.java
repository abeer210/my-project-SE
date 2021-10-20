package com.google.android.gms.vision;

import android.graphics.Bitmap;
import android.graphics.Color;
import java.nio.ByteBuffer;
import vigqyno.C0201;

public class b {
    private C0064b a;
    private ByteBuffer b;
    private Bitmap c;

    public static class a {
        private b a = new b();

        public b a() {
            if (this.a.b != null || this.a.c != null) {
                return this.a;
            }
            throw new IllegalStateException(C0201.m82(21096));
        }

        public a b(Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            this.a.c = bitmap;
            C0064b c = this.a.c();
            c.a = width;
            c.b = height;
            return this;
        }

        public a c(ByteBuffer byteBuffer, int i, int i2, int i3) {
            if (byteBuffer == null) {
                throw new IllegalArgumentException(C0201.m82(21099));
            } else if (byteBuffer.capacity() < i * i2) {
                throw new IllegalArgumentException(C0201.m82(21098));
            } else if (i3 == 16 || i3 == 17 || i3 == 842094169) {
                this.a.b = byteBuffer;
                C0064b c = this.a.c();
                c.a = i;
                c.b = i2;
                c.f = i3;
                return this;
            } else {
                StringBuilder sb = new StringBuilder(37);
                sb.append(C0201.m82(21097));
                sb.append(i3);
                throw new IllegalArgumentException(sb.toString());
            }
        }

        public a d(int i) {
            this.a.c().e = i;
            return this;
        }
    }

    /* renamed from: com.google.android.gms.vision.b$b  reason: collision with other inner class name */
    public static class C0064b {
        private int a;
        private int b;
        private int c;
        private long d;
        private int e;
        private int f = -1;

        public int a() {
            return this.f;
        }

        public int b() {
            return this.b;
        }

        public int c() {
            return this.c;
        }

        public int d() {
            return this.e;
        }

        public long e() {
            return this.d;
        }

        public int f() {
            return this.a;
        }
    }

    private b() {
        this.a = new C0064b();
        this.b = null;
        this.c = null;
    }

    public Bitmap a() {
        return this.c;
    }

    public ByteBuffer b() {
        Bitmap bitmap = this.c;
        if (bitmap == null) {
            return this.b;
        }
        int width = bitmap.getWidth();
        int height = this.c.getHeight();
        int i = width * height;
        int[] iArr = new int[i];
        this.c.getPixels(iArr, 0, width, 0, 0, width, height);
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((int) ((((float) Color.red(iArr[i2])) * 0.299f) + (((float) Color.green(iArr[i2])) * 0.587f) + (((float) Color.blue(iArr[i2])) * 0.114f)));
        }
        return ByteBuffer.wrap(bArr);
    }

    public C0064b c() {
        return this.a;
    }
}
