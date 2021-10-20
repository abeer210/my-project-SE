package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import com.dynatrace.android.agent.b;
import com.dynatrace.android.agent.u;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import vigqyno.C0201;

@SuppressLint({"SimpleDateFormat"})
/* renamed from: s30  reason: default package */
/* compiled from: Utility */
public class s30 {
    private static final String a = (u.b + C0201.m82(1562));
    private static AtomicInteger b = new AtomicInteger(1);
    private static AtomicLong c = new AtomicLong(0);

    public static int a(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0);
            if (applicationInfo != null) {
                return applicationInfo.targetSdkVersion;
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009a A[SYNTHETIC, Splitter:B:42:0x009a] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a5  */
    public static String b() {
        InputStream inputStream;
        InputStream inputStream2;
        Throwable th;
        String r0 = C0201.m82(1563);
        Process process = null;
        try {
            Process start = new ProcessBuilder(C0201.m82(1564), C0201.m82(1565)).start();
            try {
                InputStream inputStream3 = start.getInputStream();
                byte[] bArr = new byte[1024];
                String str = r0;
                while (inputStream3.read(bArr) != -1) {
                    str = str + new String(bArr).trim();
                }
                String[] split = str.split(C0201.m82(1566));
                if (split != null) {
                    if (split.length >= 1) {
                        int length = split.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                break;
                            }
                            String g = g(split[i]);
                            if (g != null) {
                                r0 = g;
                                break;
                            }
                            i++;
                        }
                        if (start != null) {
                            start.destroy();
                        }
                        if (inputStream3 != null) {
                            try {
                                inputStream3.close();
                            } catch (IOException unused) {
                            }
                        }
                        return r0;
                    }
                }
                if (start != null) {
                    start.destroy();
                }
                if (inputStream3 != null) {
                    try {
                        inputStream3.close();
                    } catch (IOException unused2) {
                    }
                }
                return r0;
            } catch (IOException unused3) {
                inputStream = null;
                process = start;
                if (process != null) {
                    process.destroy();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                return r0;
            } catch (Throwable th2) {
                th = th2;
                inputStream2 = null;
                process = start;
                if (process != null) {
                    process.destroy();
                }
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (IOException unused5) {
            inputStream = null;
            if (process != null) {
            }
            if (inputStream != null) {
            }
            return r0;
        } catch (Throwable th3) {
            th = th3;
            inputStream2 = null;
            if (process != null) {
            }
            if (inputStream2 != null) {
            }
            throw th;
        }
    }

    public static int c() {
        return b.getAndIncrement();
    }

    public static long d() {
        return c.incrementAndGet();
    }

    @SuppressLint({"DefaultLocale"})
    private static String e() {
        return String.format(C0201.m82(1567), Long.valueOf(Thread.currentThread().getId()));
    }

    public static boolean f(Context context) {
        if (context == null) {
            context = b.d().c();
        }
        if (context == null) {
            return false;
        }
        try {
            context.registerReceiver(null, new IntentFilter());
            return true;
        } catch (RuntimeException unused) {
            if (u.c) {
                t(a, String.format(C0201.m82(1568), Arrays.toString(u.a), Boolean.TRUE));
            }
            return false;
        }
    }

    private static String g(String str) {
        String[] split;
        String trim;
        if (str == null || (split = str.split(C0201.m82(1569))) == null || split.length <= 1 || split[0] == null) {
            return null;
        }
        if (split[0].startsWith(C0201.m82(1570))) {
            if (split[1] == null) {
                return null;
            }
            trim = split[1].replaceAll(C0201.m82(1571), C0201.m82(1572)).trim();
        } else if (!split[0].startsWith(C0201.m82(1573)) || split[1] == null) {
            return null;
        } else {
            trim = split[1].trim();
        }
        return trim;
    }

    public static int h(String str, String str2, int i, int i2, int i3) {
        return i(str, str2, i, i2, i3, false);
    }

    public static int i(String str, String str2, int i, int i2, int i3, boolean z) {
        if (str2 != null && !str2.isEmpty()) {
            try {
                int parseInt = Integer.parseInt(str2);
                String r6 = C0201.m82(1574);
                if (parseInt < i) {
                    if (u.c) {
                        r(a, String.format(r6, str, str2, Integer.valueOf(i), Integer.valueOf(i2)));
                    }
                    return z ? i3 : i;
                } else if (parseInt <= i2) {
                    return parseInt;
                } else {
                    if (u.c) {
                        r(a, String.format(r6, str, str2, Integer.valueOf(i), Integer.valueOf(i2)));
                    }
                    return z ? i3 : i2;
                }
            } catch (NumberFormatException e) {
                if (u.c) {
                    u(a, str, e);
                }
            }
        }
        return i3;
    }

    public static int j(Map<String, String> map, String str, int i, int i2, int i3) {
        return h(str, map.get(str), i, i2, i3);
    }

    public static int k(Map<String, String> map, String str, int i, int i2, int i3, boolean z) {
        return i(str, map.get(str), i, i2, i3, z);
    }

    public static Map<String, String> l(String str) {
        HashMap hashMap = new HashMap();
        for (String str2 : str.split(C0201.m82(1575))) {
            String[] split = str2.split(C0201.m82(1576));
            if (split.length != 2) {
                return null;
            }
            hashMap.put(split[0], split[1]);
        }
        return hashMap;
    }

    public static byte[] m(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static void n() {
        b.set(1);
    }

    public static String o(String str, int i) {
        if (str == null) {
            return null;
        }
        return str.length() > i ? str.substring(0, i) : str;
    }

    public static String p(String str) {
        if (str == null) {
            return null;
        }
        int i = 250;
        int indexOf = str.indexOf(C0201.m82(1577));
        if (indexOf >= 0 && 250 >= indexOf) {
            i = indexOf;
        }
        return str.length() > i ? str.substring(0, i) : str;
    }

    public static String q(String str) {
        if (str == null) {
            return null;
        }
        try {
            return URLEncoder.encode(str, C0201.m82(1578));
        } catch (UnsupportedEncodingException e) {
            if (u.c) {
                t(a, e.toString());
            }
            return str.replaceAll(C0201.m82(1579), C0201.m82(1580)).replaceAll(C0201.m82(1581), C0201.m82(1582));
        }
    }

    public static void r(String str, String str2) {
        String str3 = e() + str2;
        int length = (str3.length() - 1) / 4000;
        int i = 0;
        while (i < length) {
            int i2 = i * 4000;
            i++;
            Log.d(str, str3.substring(i2, i * 4000));
        }
        Log.d(str, str3.substring(i * 4000));
    }

    public static void s(String str, String str2, Throwable th) {
        Log.d(str, e() + str2, th);
    }

    public static void t(String str, String str2) {
        Log.e(str, e() + str2);
    }

    public static void u(String str, String str2, Throwable th) {
        Log.e(str, e() + str2, th);
    }

    public static void v(String str, String str2) {
        Log.i(str, e() + str2);
    }

    public static void w(String str, String str2) {
        Log.w(str, e() + str2);
    }
}
