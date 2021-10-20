package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: zo  reason: default package */
/* compiled from: Executors */
public final class zo {
    private static final Executor a = new a();
    private static final Executor b = new b();

    /* renamed from: zo$a */
    /* compiled from: Executors */
    class a implements Executor {
        private final Handler a = new Handler(Looper.getMainLooper());

        public void execute(Runnable runnable) {
            this.a.post(runnable);
        }
    }

    /* renamed from: zo$b */
    /* compiled from: Executors */
    class b implements Executor {
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    public static Executor a() {
        return b;
    }

    public static Executor b() {
        return a;
    }
}
