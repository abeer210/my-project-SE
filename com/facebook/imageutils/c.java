package com.facebook.imageutils;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: JfifUtil */
public class c {
    public static int a(int i) {
        return e.a(i);
    }

    public static int b(InputStream inputStream) {
        try {
            int d = d(inputStream);
            if (d == 0) {
                return 0;
            }
            return e.d(inputStream, d);
        } catch (IOException unused) {
            return 0;
        }
    }

    private static boolean c(int i) {
        switch (i) {
            case 192:
            case 193:
            case 194:
            case 195:
            case 197:
            case 198:
            case 199:
            case 201:
            case 202:
            case 203:
            case 205:
            case 206:
            case 207:
                return true;
            case 196:
            case 200:
            case 204:
            default:
                return false;
        }
    }

    private static int d(InputStream inputStream) throws IOException {
        int a;
        if (e(inputStream, 225) && (a = d.a(inputStream, 2, false) - 2) > 6) {
            int a2 = d.a(inputStream, 4, false);
            int a3 = d.a(inputStream, 2, false);
            int i = (a - 4) - 2;
            if (a2 == 1165519206 && a3 == 0) {
                return i;
            }
            return 0;
        }
        return 0;
    }

    public static boolean e(InputStream inputStream, int i) throws IOException {
        z50.g(inputStream);
        while (d.a(inputStream, 1, false) == 255) {
            int i2 = 255;
            while (i2 == 255) {
                i2 = d.a(inputStream, 1, false);
            }
            if ((i != 192 || !c(i2)) && i2 != i) {
                if (!(i2 == 216 || i2 == 1)) {
                    if (i2 == 217 || i2 == 218) {
                        break;
                    }
                    inputStream.skip((long) (d.a(inputStream, 2, false) - 2));
                }
            } else {
                return true;
            }
        }
        return false;
    }
}
