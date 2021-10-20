package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: g12  reason: default package */
public final class g12 implements Executor {
    private final Handler a = new Handler(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.a.post(runnable);
    }
}
