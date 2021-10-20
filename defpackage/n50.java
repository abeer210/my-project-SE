package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: n50  reason: default package */
/* compiled from: UiThreadImmediateExecutorService */
public class n50 extends k50 {
    private static n50 b;

    private n50() {
        super(new Handler(Looper.getMainLooper()));
    }

    public static n50 g() {
        if (b == null) {
            b = new n50();
        }
        return b;
    }

    @Override // defpackage.k50
    public void execute(Runnable runnable) {
        if (a()) {
            runnable.run();
        } else {
            super.execute(runnable);
        }
    }
}
