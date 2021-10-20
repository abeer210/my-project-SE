package com.google.android.gms.common.util;

import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public class m {
    private static String a;
    private static int b;

    public static String a() {
        if (a == null) {
            if (b == 0) {
                b = Process.myPid();
            }
            a = b(b);
        }
        return a;
    }

    private static String b(int i) {
        BufferedReader bufferedReader;
        Throwable th;
        String str = null;
        if (i <= 0) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder(25);
            sb.append(C0201.m82(21298));
            sb.append(i);
            sb.append(C0201.m82(21299));
            bufferedReader = c(sb.toString());
            try {
                str = bufferedReader.readLine().trim();
                k.a(bufferedReader);
            } catch (IOException unused) {
                k.a(bufferedReader);
                return str;
            } catch (Throwable th2) {
                th = th2;
                k.a(bufferedReader);
                throw th;
            }
        } catch (IOException unused2) {
            bufferedReader = null;
            k.a(bufferedReader);
            return str;
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
            k.a(bufferedReader);
            throw th;
        }
        return str;
    }

    private static BufferedReader c(String str) throws IOException {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return new BufferedReader(new FileReader(str));
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
}
