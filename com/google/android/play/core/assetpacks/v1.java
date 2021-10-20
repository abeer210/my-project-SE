package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.util.Base64;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import vigqyno.C0201;

public final class v1 {
    private static d a;

    public static synchronized d a(Context context) {
        d dVar;
        synchronized (v1.class) {
            if (a == null) {
                o0 o0Var = new o0(null);
                o0Var.b(new z2(l02.a(context)));
                a = o0Var.a();
            }
            dVar = a;
        }
        return dVar;
    }

    public static String b(List<File> list) throws NoSuchAlgorithmException, IOException {
        int read;
        MessageDigest instance = MessageDigest.getInstance(C0201.m82(25160));
        byte[] bArr = new byte[8192];
        for (File file : list) {
            FileInputStream fileInputStream = new FileInputStream(file);
            do {
                try {
                    read = fileInputStream.read(bArr);
                    if (read > 0) {
                        instance.update(bArr, 0, read);
                    }
                } catch (Throwable th) {
                    ez1.a(th, th);
                }
            } while (read != -1);
            fileInputStream.close();
        }
        return Base64.encodeToString(instance.digest(), 11);
        throw th;
    }

    public static boolean c(int i) {
        return i == 1 || i == 7 || i == 2 || i == 3;
    }

    public static boolean d(int i, int i2) {
        if (i == 5) {
            if (i2 != 5) {
                return true;
            }
            i = 5;
        }
        if (i == 6 && i2 != 6 && i2 != 5) {
            return true;
        }
        if (i == 4 && i2 != 4) {
            return true;
        }
        if (i == 3 && (i2 == 2 || i2 == 7 || i2 == 1 || i2 == 8)) {
            return true;
        }
        if (i == 2) {
            return i2 == 1 || i2 == 8;
        }
        return false;
    }

    public static long e(byte[] bArr, int i) {
        return ((long) ((g(bArr, i + 2) << 16) | g(bArr, i))) & 4294967295L;
    }

    public static boolean f(int i) {
        return i == 5 || i == 6 || i == 4;
    }

    public static int g(byte[] bArr, int i) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    public static boolean h(int i) {
        return i == 2 || i == 7 || i == 3;
    }
}
