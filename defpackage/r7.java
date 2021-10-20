package defpackage;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import vigqyno.C0201;

/* renamed from: r7  reason: default package */
/* compiled from: BoltsExecutors */
public final class r7 {
    private static final r7 c = new r7();
    private final ExecutorService a;
    private final Executor b;

    /* renamed from: r7$b */
    /* compiled from: BoltsExecutors */
    private static class b implements Executor {
        private ThreadLocal<Integer> a;

        private b() {
            this.a = new ThreadLocal<>();
        }

        private int a() {
            Integer num = this.a.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.a.remove();
            } else {
                this.a.set(Integer.valueOf(intValue));
            }
            return intValue;
        }

        private int b() {
            Integer num = this.a.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() + 1;
            this.a.set(Integer.valueOf(intValue));
            return intValue;
        }

        public void execute(Runnable runnable) {
            if (b() <= 15) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    a();
                    throw th;
                }
            } else {
                r7.a().execute(runnable);
            }
            a();
        }
    }

    private r7() {
        this.a = !c() ? Executors.newCachedThreadPool() : q7.b();
        Executors.newSingleThreadScheduledExecutor();
        this.b = new b();
    }

    public static ExecutorService a() {
        return c.a;
    }

    public static Executor b() {
        return c.b;
    }

    private static boolean c() {
        String property = System.getProperty(C0201.m82(38721));
        if (property == null) {
            return false;
        }
        return property.toLowerCase(Locale.US).contains(C0201.m82(38722));
    }
}
