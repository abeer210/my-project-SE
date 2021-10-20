package defpackage;

import com.google.android.gms.common.internal.u;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import vigqyno.C0201;

/* renamed from: cq0  reason: default package */
/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public class cq0 implements ThreadFactory {
    private final String a;
    private final ThreadFactory b;

    public cq0(String str) {
        this(str, 0);
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = this.b.newThread(new eq0(runnable, 0));
        newThread.setName(this.a);
        return newThread;
    }

    private cq0(String str, int i) {
        this.b = Executors.defaultThreadFactory();
        u.l(str, C0201.m82(28334));
        this.a = str;
    }
}
