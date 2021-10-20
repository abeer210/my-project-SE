package defpackage;

import android.os.Process;
import com.dynatrace.android.agent.u;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

/* renamed from: v20  reason: default package */
/* compiled from: CrashCatcher */
public class v20 {
    private static final String a = (u.b + C0201.m82(17421));
    public static volatile boolean b = false;
    private static List<w20> c = new ArrayList();
    private static Thread.UncaughtExceptionHandler d = null;
    private static Throwable e = null;

    /* access modifiers changed from: private */
    /* renamed from: v20$a */
    /* compiled from: CrashCatcher */
    public static class a implements Thread.UncaughtExceptionHandler {
        private static a a = new a();

        private a() {
        }

        public static a a() {
            return a;
        }

        private void b(Thread thread, Throwable th) {
            for (w20 w20 : v20.c) {
                try {
                    w20.b(thread, th);
                } catch (Throwable th2) {
                    if (u.c) {
                        String str = v20.a;
                        s30.u(str, C0201.m82(27970) + w20.toString(), th2);
                    }
                }
            }
        }

        public void uncaughtException(Thread thread, Throwable th) {
            if (u.c) {
                s30.v(v20.a, String.format(C0201.m82(27971), thread.getClass().getName(), thread.getName(), Long.valueOf(thread.getId()), Integer.valueOf(Process.myPid())));
            }
            if (v20.e != th) {
                Throwable unused = v20.e = th;
                b(thread, th);
            }
            if (v20.d != null) {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = v20.d;
                if (u.c) {
                    String str = v20.a;
                    s30.v(str, C0201.m82(27972) + uncaughtExceptionHandler.getClass().getName());
                }
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        }
    }

    public static void f() {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler == null || !(defaultUncaughtExceptionHandler instanceof a)) {
            d = defaultUncaughtExceptionHandler;
            Thread.setDefaultUncaughtExceptionHandler(a.a());
            if (u.c) {
                s30.r(a, C0201.m82(17423));
            }
            b = true;
        } else if (u.c) {
            s30.r(a, C0201.m82(17422));
        }
    }

    public static void g(String str, String str2, String str3, String str4) {
        for (w20 w20 : c) {
            try {
                w20.a(str, str2, str3, str4);
            } catch (Throwable th) {
                if (u.c) {
                    String str5 = a;
                    s30.u(str5, C0201.m82(17424) + w20.toString(), th);
                }
            }
        }
    }

    public static void h(w20 w20) {
        if (w20 != null) {
            c.add(w20);
        }
    }
}
