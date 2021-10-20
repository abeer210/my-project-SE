package defpackage;

import com.google.android.gms.common.internal.u;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import vigqyno.C0201;

/* renamed from: dq0  reason: default package */
/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public class dq0 implements ThreadFactory {
    private final String a;
    private final AtomicInteger b;
    private final ThreadFactory c;

    public dq0(String str) {
        this(str, 0);
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = this.c.newThread(new eq0(runnable, 0));
        String str = this.a;
        int andIncrement = this.b.getAndIncrement();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
        sb.append(str);
        sb.append(C0201.m82(16115));
        sb.append(andIncrement);
        sb.append(C0201.m82(16116));
        newThread.setName(sb.toString());
        return newThread;
    }

    private dq0(String str, int i) {
        this.b = new AtomicInteger();
        this.c = Executors.defaultThreadFactory();
        u.l(str, C0201.m82(16114));
        this.a = str;
    }
}
