package com.facebook.react.modules.systeminfo;

import android.os.Build;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Locale;
import vigqyno.C0201;

/* compiled from: AndroidInfoHelpers */
public class a {
    private static final String a = null;
    private static String b;

    static {
        C0201.m83(a.class, 692);
    }

    public static String a() {
        if (e()) {
            return Build.MODEL;
        }
        return Build.MODEL + C0201.m82(8592) + Build.VERSION.RELEASE + C0201.m82(8593) + Build.VERSION.SDK_INT;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0055, code lost:
        if (r2 == null) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0057, code lost:
        r2.destroy();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x008c, code lost:
        if (r2 == null) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008f, code lost:
        r1 = com.facebook.react.modules.systeminfo.a.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0092, code lost:
        return r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0087 A[SYNTHETIC, Splitter:B:37:0x0087] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0096 A[SYNTHETIC, Splitter:B:46:0x0096] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x009d  */
    private static synchronized String b() {
        BufferedReader bufferedReader;
        Process process;
        Throwable th;
        Exception e;
        synchronized (a.class) {
            if (b != null) {
                return b;
            }
            try {
                process = Runtime.getRuntime().exec(new String[]{C0201.m82(8594), C0201.m82(8595)});
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream(), Charset.forName(C0201.m82(8596))));
                } catch (Exception e2) {
                    bufferedReader = null;
                    e = e2;
                    try {
                        f60.B(a, C0201.m82(8598), e);
                        b = C0201.m82(8599);
                        if (bufferedReader != null) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Exception unused) {
                            }
                        }
                        if (process != null) {
                            process.destroy();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    bufferedReader = null;
                    th = th3;
                    if (bufferedReader != null) {
                    }
                    if (process != null) {
                    }
                    throw th;
                }
                try {
                    String r1 = C0201.m82(8597);
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        r1 = readLine;
                    }
                    b = r1;
                    try {
                        bufferedReader.close();
                    } catch (Exception unused2) {
                    }
                } catch (Exception e3) {
                    e = e3;
                    f60.B(a, C0201.m82(8598), e);
                    b = C0201.m82(8599);
                    if (bufferedReader != null) {
                    }
                }
            } catch (Exception e4) {
                bufferedReader = null;
                e = e4;
                process = null;
                f60.B(a, C0201.m82(8598), e);
                b = C0201.m82(8599);
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (Exception unused3) {
                    }
                }
            } catch (Throwable th4) {
                bufferedReader = null;
                th = th4;
                process = null;
                if (bufferedReader != null) {
                }
                if (process != null) {
                }
                throw th;
            }
        }
    }

    public static String c(Integer num) {
        return d(num.intValue());
    }

    private static String d(int i) {
        String b2 = b();
        if (b2.equals(C0201.m82(8600))) {
            if (e()) {
                b2 = C0201.m82(8601);
            } else {
                b2 = f() ? C0201.m82(8602) : C0201.m82(8603);
            }
        }
        return String.format(Locale.US, C0201.m82(8604), b2, Integer.valueOf(i));
    }

    private static boolean e() {
        return Build.FINGERPRINT.contains(C0201.m82(8605));
    }

    private static boolean f() {
        return Build.FINGERPRINT.contains(C0201.m82(8606));
    }
}
