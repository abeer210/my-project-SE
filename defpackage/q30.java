package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.dynatrace.android.agent.b;
import com.dynatrace.android.agent.u;
import com.dynatrace.android.agent.w;
import com.dynatrace.android.agent.x;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Locale;
import vigqyno.C0201;

/* renamed from: q30  reason: default package */
/* compiled from: AndroidMetrics */
public class q30 {
    private static final String r = (u.b + C0201.m82(16023));
    private static volatile q30 s = null;
    public Long a;
    public String b;
    public String c;
    public boolean d;
    public String e;
    public volatile r30 f = r30.OFFLINE;
    public volatile int g;
    public volatile int h;
    public volatile int i;
    public String j = null;
    public int k = 0;
    public String l;
    public String m;
    public int n = -1;
    public Long o;
    public String p;
    private Context q;

    /* access modifiers changed from: package-private */
    /* renamed from: q30$a */
    /* compiled from: AndroidMetrics */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            int[] iArr = new int[r30.values().length];
            a = iArr;
            iArr[r30.WIFI.ordinal()] = 1;
            a[r30.MOBILE.ordinal()] = 2;
            try {
                a[r30.LAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public q30(Context context) {
        this.q = context;
    }

    public static String a(Locale locale) {
        String language = locale.getLanguage();
        if (locale.getCountry().length() <= 0) {
            return language;
        }
        return language + C0201.m82(16024) + locale.getCountry();
    }

    private ActivityManager b() {
        try {
            return (ActivityManager) this.q.getSystemService(C0201.m82(16025));
        } catch (Exception e2) {
            if (u.c) {
                s30.w(r, e2.toString());
            }
            return null;
        }
    }

    public static q30 e() {
        if (s == null) {
            synchronized (q30.class) {
                if (s == null) {
                    s = new q30(b.d().c());
                    s.h();
                }
            }
        }
        return s;
    }

    private String f(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return C0201.m82(16029);
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return C0201.m82(16028);
            case 13:
            case 18:
            case 19:
                return C0201.m82(16027);
            case 20:
                return C0201.m82(16026);
            default:
                return networkInfo.getSubtypeName();
        }
    }

    private NetworkInfo g() {
        Context context = this.q;
        if (context == null) {
            return null;
        }
        try {
            return ((ConnectivityManager) context.getSystemService(C0201.m82(16030))).getActiveNetworkInfo();
        } catch (Exception e2) {
            if (!u.c) {
                return null;
            }
            s30.w(r, e2.toString());
            return null;
        }
    }

    private void h() {
        String str = Build.MANUFACTURER;
        if (str == null) {
            str = C0201.m82(16031);
        }
        this.b = s30.o(str, 250);
        this.d = w.d();
        this.l = C0201.m82(16032) + Build.VERSION.RELEASE;
        this.m = s30.b();
        this.p = Build.MODEL;
        this.c = a(Locale.getDefault());
        q();
        j();
        m();
    }

    private void k() {
        int i2;
        int i3;
        Context context = this.q;
        if (context != null) {
            try {
                Intent registerReceiver = context.registerReceiver(null, new IntentFilter(C0201.m82(16033)));
                int i4 = 0;
                if (registerReceiver != null) {
                    i4 = registerReceiver.getIntExtra(C0201.m82(16034), -1);
                    i2 = registerReceiver.getIntExtra(C0201.m82(16035), -1);
                } else {
                    i2 = 0;
                }
                if (i4 < 0 || i2 <= 0) {
                    i3 = -1;
                } else {
                    double d2 = (double) i2;
                    Double.isNaN(d2);
                    double d3 = (double) i4;
                    Double.isNaN(d3);
                    i3 = (int) ((100.0d / d2) * d3);
                }
                if (i3 < 0 || i3 > 100) {
                    this.n = -1;
                } else {
                    this.n = i3;
                }
            } catch (RuntimeException unused) {
                if (u.c) {
                    s30.w(r, C0201.m82(16036));
                }
            }
        }
    }

    private void l() {
        Context context = this.q;
        if (context != null) {
            this.e = null;
            try {
                String networkOperatorName = ((TelephonyManager) context.getSystemService(C0201.m82(16037))).getNetworkOperatorName();
                if (networkOperatorName != null) {
                    if (networkOperatorName == null) {
                        networkOperatorName = C0201.m82(16038);
                    }
                    this.e = s30.o(networkOperatorName, 250);
                }
            } catch (Exception e2) {
                if (u.c) {
                    s30.w(r, e2.toString());
                }
            }
        }
    }

    private void n() {
        NetworkInfo g2 = g();
        this.f = d(g2);
        int i2 = a.a[this.f.ordinal()];
        if (i2 == 1) {
            this.j = C0201.m82(16040);
        } else if (i2 == 2) {
            this.j = f(g2);
        } else if (i2 != 3) {
            this.j = null;
        } else {
            this.j = C0201.m82(16039);
        }
    }

    private void o() {
        ActivityManager b2 = b();
        if (b2 == null) {
            this.o = null;
            return;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        b2.getMemoryInfo(memoryInfo);
        this.o = Long.valueOf(memoryInfo.availMem / 1048576);
    }

    private void p() {
        Display defaultDisplay;
        Point point = new Point(this.g, this.h);
        Context context = this.q;
        if (context != null && (defaultDisplay = ((WindowManager) context.getSystemService(C0201.m82(16041))).getDefaultDisplay()) != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            if (Build.VERSION.SDK_INT <= 16) {
                defaultDisplay.getMetrics(displayMetrics);
            } else {
                defaultDisplay.getRealMetrics(displayMetrics);
            }
            this.i = displayMetrics.densityDpi;
            if (Build.VERSION.SDK_INT <= 16) {
                try {
                    Method method = Display.class.getMethod(C0201.m82(16042), new Class[0]);
                    point.x = ((Integer) Display.class.getMethod(C0201.m82(16043), new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                    point.y = ((Integer) method.invoke(defaultDisplay, new Object[0])).intValue();
                } catch (Exception e2) {
                    if (u.c) {
                        s30.u(r, C0201.m82(16044), e2);
                    }
                }
            } else {
                defaultDisplay.getRealSize(point);
            }
            int i2 = point.x;
            int i3 = point.y;
            if (i2 < i3) {
                this.g = i2;
                this.h = point.y;
                return;
            }
            this.g = i3;
            this.h = point.x;
        }
    }

    public r30 c() {
        return d(g());
    }

    public r30 d(NetworkInfo networkInfo) {
        if (networkInfo == null || !networkInfo.isAvailable() || !networkInfo.isConnected()) {
            return r30.OFFLINE;
        }
        switch (networkInfo.getType()) {
            case 0:
            case 2:
            case 3:
            case 4:
            case 5:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
                return r30.MOBILE;
            case 1:
            case 13:
                return r30.WIFI;
            case 6:
            case 7:
            case 8:
            default:
                return r30.OTHER;
            case 9:
                return r30.LAN;
        }
    }

    public boolean i() {
        NetworkInfo g2 = g();
        boolean z = g2 != null && (g2.isAvailable() || g2.isConnected());
        if (!z && u.c) {
            s30.v(r, C0201.m82(16045));
        }
        return z;
    }

    public void j() {
        Long l2 = 0L;
        if (u.c) {
            l2 = Long.valueOf(x.a());
        }
        l();
        if (u.c) {
            s30.r(r, String.format(C0201.m82(16046), Long.valueOf(x.a() - l2.longValue())));
        }
    }

    public void m() {
        Long l2 = 0L;
        if (u.c) {
            l2 = Long.valueOf(x.a());
        }
        n();
        p();
        Context context = this.q;
        if (context != null) {
            this.k = context.getResources().getConfiguration().orientation;
        }
        k();
        o();
        if (u.c) {
            s30.r(r, String.format(C0201.m82(16047), Long.valueOf(x.a() - l2.longValue())));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0066, code lost:
        if (com.dynatrace.android.agent.u.c == false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0068, code lost:
        defpackage.s30.s(defpackage.q30.r, r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a8, code lost:
        if (com.dynatrace.android.agent.u.c == false) goto L_0x00ab;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0083 A[Catch:{ all -> 0x00b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0091 A[SYNTHETIC, Splitter:B:38:0x0091] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a1 A[SYNTHETIC, Splitter:B:45:0x00a1] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b9 A[SYNTHETIC, Splitter:B:54:0x00b9] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00c9 A[SYNTHETIC, Splitter:B:61:0x00c9] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    public void q() {
        BufferedReader bufferedReader;
        Throwable th;
        FileReader fileReader;
        IOException e2;
        String r0 = C0201.m82(16048);
        long j2 = 0;
        Long l2 = 0L;
        if (u.c) {
            l2 = Long.valueOf(x.a());
        }
        if (this.a == null) {
            FileReader fileReader2 = null;
            try {
                fileReader = new FileReader(C0201.m82(16049));
                try {
                    bufferedReader = new BufferedReader(fileReader, 8192);
                } catch (IOException e3) {
                    bufferedReader = null;
                    e2 = e3;
                    try {
                        if (u.c) {
                        }
                        if (fileReader != null) {
                        }
                        if (bufferedReader != null) {
                        }
                        this.a = Long.valueOf(j2 / 1024);
                        if (!u.c) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileReader2 = fileReader;
                        if (fileReader2 != null) {
                            try {
                                fileReader2.close();
                            } catch (IOException e4) {
                                if (u.c) {
                                    s30.s(r, r0, e4);
                                }
                            }
                        }
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e5) {
                                if (u.c) {
                                    s30.s(r, r0, e5);
                                }
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bufferedReader = null;
                    fileReader2 = fileReader;
                    if (fileReader2 != null) {
                    }
                    if (bufferedReader != null) {
                    }
                    throw th;
                }
                try {
                    j2 = Long.valueOf(bufferedReader.readLine().split(C0201.m82(16050))[1]).longValue();
                    bufferedReader.close();
                    fileReader.close();
                    try {
                        fileReader.close();
                    } catch (IOException e6) {
                        if (u.c) {
                            s30.s(r, r0, e6);
                        }
                    }
                    try {
                        bufferedReader.close();
                    } catch (IOException e7) {
                        e = e7;
                    }
                } catch (IOException e8) {
                    e2 = e8;
                    if (u.c) {
                    }
                    if (fileReader != null) {
                    }
                    if (bufferedReader != null) {
                    }
                    this.a = Long.valueOf(j2 / 1024);
                    if (!u.c) {
                    }
                }
            } catch (IOException e9) {
                bufferedReader = null;
                e2 = e9;
                fileReader = null;
                if (u.c) {
                    s30.s(r, C0201.m82(16051), e2);
                }
                if (fileReader != null) {
                    try {
                        fileReader.close();
                    } catch (IOException e10) {
                        if (u.c) {
                            s30.s(r, r0, e10);
                        }
                    }
                }
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e11) {
                        e = e11;
                    }
                }
                this.a = Long.valueOf(j2 / 1024);
                if (!u.c) {
                }
            } catch (Throwable th4) {
                th = th4;
                bufferedReader = null;
                if (fileReader2 != null) {
                }
                if (bufferedReader != null) {
                }
                throw th;
            }
            this.a = Long.valueOf(j2 / 1024);
        }
        if (!u.c) {
            s30.r(r, String.format(C0201.m82(16052), Long.valueOf(x.a() - l2.longValue())));
        }
    }
}
