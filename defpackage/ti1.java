package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import vigqyno.C0201;

/* renamed from: ti1  reason: default package */
public final class ti1 extends WeakReference<Throwable> {
    private final int a;

    public ti1(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, null);
        if (th != null) {
            this.a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException(C0201.m82(1457));
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == ti1.class) {
            if (this == obj) {
                return true;
            }
            ti1 ti1 = (ti1) obj;
            return this.a == ti1.a && get() == ti1.get();
        }
    }

    public final int hashCode() {
        return this.a;
    }
}
