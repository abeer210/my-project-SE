package vigqyno;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Thread;

/* renamed from: vigqyno.▐  reason: contains not printable characters */
public class C0208 {

    /* renamed from: ─  reason: not valid java name and contains not printable characters */
    private static Thread.UncaughtExceptionHandler f31 = null;

    /* renamed from: ━  reason: not valid java name and contains not printable characters */
    private static final String f32 = "Report";

    /* renamed from: │  reason: not valid java name and contains not printable characters */
    private static int f33 = -1;

    static {
        C0179.m19();
    }

    /* access modifiers changed from: private */
    /* renamed from: ─  reason: not valid java name and contains not printable characters */
    public static String m91() {
        BufferedReader bufferedReader;
        Throwable th;
        BufferedReader bufferedReader2;
        StringBuilder sb = new StringBuilder();
        try {
            bufferedReader2 = new BufferedReader(new InputStreamReader(new ParcelFileDescriptor.AutoCloseInputStream(ParcelFileDescriptor.adoptFd(f33))));
            try {
                char[] cArr = new char[1024];
                while (true) {
                    int read = bufferedReader2.read(cArr, 0, cArr.length);
                    if (read > 0) {
                        sb.append(cArr, 0, read);
                        if (sb.toString().endsWith("!")) {
                            sb.setLength(sb.length() - 1);
                            break;
                        }
                    }
                }
                try {
                    bufferedReader2.close();
                } catch (Exception e) {
                }
                if (sb.length() <= 0) {
                    return null;
                }
                return sb.toString();
            } catch (Exception e2) {
                try {
                    bufferedReader2.close();
                    return null;
                } catch (Exception e3) {
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = bufferedReader2;
                try {
                    bufferedReader.close();
                } catch (Exception e4) {
                }
                throw th;
            }
        } catch (Exception e5) {
            bufferedReader2 = null;
            bufferedReader2.close();
            return null;
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
            bufferedReader.close();
            throw th;
        }
    }

    /* renamed from: ─  reason: not valid java name and contains not printable characters */
    public static void m93(String str) {
        C0176 r0 = m95(str);
        if (Build.VERSION.SDK_INT >= 26) {
            Log.e(f32, "Exiting: ", r0);
        }
        f31.uncaughtException(Thread.currentThread(), r0);
    }

    /* renamed from: ━  reason: not valid java name and contains not printable characters */
    private static C0176 m95(String str) {
        if (str == null || str.isEmpty() || str.length() < 2) {
            return new C0186("!" + str);
        }
        switch (Integer.parseInt(str.substring(0, 2), 16)) {
            case 0:
                return new C0193(str);
            case 1:
                return new C0202(str);
            case 2:
                return new C0220(str);
            case 3:
                return new C0175(str);
            case 4:
                return new C0178(str);
            case 5:
                return new C0215(str);
            case 6:
                return new C0216(str);
            case 7:
                return new C0189(str);
            case 8:
                return new C0185(str);
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                return new C0187(str);
            case 18:
            case 19:
                return new C0194(str);
            case 20:
                return new C0183(str);
            case 21:
                return new C0206(str);
            case 22:
                return new C0218(str);
            case 23:
                return new C0175(str);
            default:
                return new C0186(str);
        }
    }

    /* renamed from: │  reason: not valid java name and contains not printable characters */
    public static void m96() {
        new C0209().start();
    }
}
