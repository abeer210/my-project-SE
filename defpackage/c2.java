package defpackage;

import android.os.Build;
import android.os.CancellationSignal;

/* renamed from: c2  reason: default package */
/* compiled from: CancellationSignal */
public final class c2 {
    private boolean a;
    private a b;
    private Object c;

    /* renamed from: c2$a */
    /* compiled from: CancellationSignal */
    public interface a {
        void onCancel();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r0.onCancel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0017, code lost:
        if (r1 == null) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001d, code lost:
        if (android.os.Build.VERSION.SDK_INT < 16) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001f, code lost:
        ((android.os.CancellationSignal) r1).cancel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0025, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x002e, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0032, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0033, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000f, code lost:
        if (r0 == null) goto L_0x0017;
     */
    public void a() {
        synchronized (this) {
            if (!this.a) {
                this.a = true;
                a aVar = this.b;
                Object obj = this.c;
            }
        }
    }

    public Object b() {
        Object obj;
        if (Build.VERSION.SDK_INT < 16) {
            return null;
        }
        synchronized (this) {
            if (this.c == null) {
                CancellationSignal cancellationSignal = new CancellationSignal();
                this.c = cancellationSignal;
                if (this.a) {
                    cancellationSignal.cancel();
                }
            }
            obj = this.c;
        }
        return obj;
    }

    public boolean c() {
        boolean z;
        synchronized (this) {
            z = this.a;
        }
        return z;
    }

    public void d() {
        if (c()) {
            throw new d2();
        }
    }
}
