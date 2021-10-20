package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.HashSet;
import java.util.Set;

/* renamed from: t80  reason: default package */
/* compiled from: DeferredReleaser */
public class t80 {
    private static t80 d;
    private final Set<b> a = new HashSet();
    private final Handler b = new Handler(Looper.getMainLooper());
    private final Runnable c = new a();

    /* renamed from: t80$a */
    /* compiled from: DeferredReleaser */
    class a implements Runnable {
        public a() {
        }

        public void run() {
            t80.d();
            for (b bVar : t80.this.a) {
                bVar.release();
            }
            t80.this.a.clear();
        }
    }

    /* renamed from: t80$b */
    /* compiled from: DeferredReleaser */
    public interface b {
        void release();
    }

    /* access modifiers changed from: private */
    public static void d() {
        z50.i(Looper.getMainLooper().getThread() == Thread.currentThread());
    }

    public static synchronized t80 e() {
        t80 t80;
        synchronized (t80.class) {
            if (d == null) {
                d = new t80();
            }
            t80 = d;
        }
        return t80;
    }

    public void c(b bVar) {
        d();
        this.a.remove(bVar);
    }

    public void f(b bVar) {
        d();
        if (this.a.add(bVar) && this.a.size() == 1) {
            this.b.post(this.c);
        }
    }
}
