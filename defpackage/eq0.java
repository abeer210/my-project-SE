package defpackage;

import android.os.Process;

/* renamed from: eq0  reason: default package */
/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class eq0 implements Runnable {
    private final Runnable a;
    private final int b;

    public eq0(Runnable runnable, int i) {
        this.a = runnable;
        this.b = i;
    }

    public final void run() {
        Process.setThreadPriority(this.b);
        this.a.run();
    }
}
