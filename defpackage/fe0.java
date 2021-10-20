package defpackage;

import android.os.Process;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import vigqyno.C0201;

/* renamed from: fe0  reason: default package */
/* compiled from: PriorityThreadFactory */
public class fe0 implements ThreadFactory {
    private final int a;
    private final String b;
    private final boolean c;
    private final AtomicInteger d = new AtomicInteger(1);

    /* renamed from: fe0$a */
    /* compiled from: PriorityThreadFactory */
    class a implements Runnable {
        public final /* synthetic */ Runnable a;

        public a(Runnable runnable) {
            this.a = runnable;
        }

        public void run() {
            try {
                Process.setThreadPriority(fe0.this.a);
            } catch (Throwable unused) {
            }
            this.a.run();
        }
    }

    public fe0(int i, String str, boolean z) {
        this.a = i;
        this.b = str;
        this.c = z;
    }

    public Thread newThread(Runnable runnable) {
        String str;
        a aVar = new a(runnable);
        if (this.c) {
            str = this.b + C0201.m82(18246) + this.d.getAndIncrement();
        } else {
            str = this.b;
        }
        return new Thread(aVar, str);
    }
}
