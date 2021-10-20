package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: bq0  reason: default package */
/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public class bq0 implements Executor {
    private final Handler a;

    public bq0(Looper looper) {
        this.a = new k01(looper);
    }

    public void execute(Runnable runnable) {
        this.a.post(runnable);
    }
}
