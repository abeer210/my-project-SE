package com.facebook.imageutils;

import java.io.IOException;
import java.io.InputStream;
import vigqyno.C0201;

/* compiled from: TiffUtil */
public class e {
    private static final Class<?> a = e.class;

    /* access modifiers changed from: private */
    /* compiled from: TiffUtil */
    public static class b {
        public boolean a;
        public int b;
        public int c;

        private b() {
        }
    }

    public static int a(int i) {
        if (i == 3) {
            return 180;
        }
        if (i != 6) {
            return i != 8 ? 0 : 270;
        }
        return 90;
    }

    private static int b(InputStream inputStream, int i, boolean z) throws IOException {
        if (i < 10 || d.a(inputStream, 2, z) != 3 || d.a(inputStream, 4, z) != 1) {
            return 0;
        }
        int a2 = d.a(inputStream, 2, z);
        d.a(inputStream, 2, z);
        return a2;
    }

    private static int c(InputStream inputStream, int i, boolean z, int i2) throws IOException {
        if (i < 14) {
            return 0;
        }
        int a2 = d.a(inputStream, 2, z);
        int i3 = i - 2;
        while (true) {
            int i4 = a2 - 1;
            if (a2 <= 0 || i3 < 12) {
                return 0;
            }
            int i5 = i3 - 2;
            if (d.a(inputStream, 2, z) == i2) {
                return i5;
            }
            inputStream.skip(10);
            i3 = i5 - 10;
            a2 = i4;
        }
        return 0;
    }

    public static int d(InputStream inputStream, int i) throws IOException {
        b bVar = new b();
        int e = e(inputStream, i, bVar);
        int i2 = bVar.c - 8;
        if (e == 0 || i2 > e) {
            return 0;
        }
        inputStream.skip((long) i2);
        return b(inputStream, c(inputStream, e - i2, bVar.a, 274), bVar.a);
    }

    private static int e(InputStream inputStream, int i, b bVar) throws IOException {
        if (i <= 8) {
            return 0;
        }
        int a2 = d.a(inputStream, 4, false);
        bVar.b = a2;
        int i2 = i - 4;
        if (a2 == 1229531648 || a2 == 1296891946) {
            boolean z = bVar.b == 1229531648;
            bVar.a = z;
            int a3 = d.a(inputStream, 4, z);
            bVar.c = a3;
            int i3 = i2 - 4;
            if (a3 >= 8 && a3 - 8 <= i3) {
                return i3;
            }
            f60.e(a, C0201.m82(10533));
            return 0;
        }
        f60.e(a, C0201.m82(10532));
        return 0;
    }
}
