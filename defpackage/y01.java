package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import vigqyno.C0201;

/* renamed from: y01  reason: default package */
public final class y01 extends WeakReference<Throwable> {
    private final int a;

    public y01(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException(C0201.m82(31055));
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == y01.class) {
            if (this == obj) {
                return true;
            }
            y01 y01 = (y01) obj;
            return this.a == y01.a && get() == y01.get();
        }
    }

    public final int hashCode() {
        return this.a;
    }
}
