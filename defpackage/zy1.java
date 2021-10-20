package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: zy1  reason: default package */
public final class zy1 extends WeakReference<Throwable> {
    private final int a;

    public zy1(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        this.a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == zy1.class) {
            if (this == obj) {
                return true;
            }
            zy1 zy1 = (zy1) obj;
            return this.a == zy1.a && get() == zy1.get();
        }
    }

    public final int hashCode() {
        return this.a;
    }
}
