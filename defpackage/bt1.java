package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: bt1  reason: default package */
public final class bt1 {
    public static final Executor a = new a();
    public static final Executor b = new tt1();

    /* renamed from: bt1$a */
    private static final class a implements Executor {
        private final Handler a = new Handler(Looper.getMainLooper());

        public final void execute(Runnable runnable) {
            this.a.post(runnable);
        }
    }
}
