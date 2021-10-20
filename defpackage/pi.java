package defpackage;

import defpackage.yi;
import java.util.Queue;

/* renamed from: pi  reason: default package */
/* compiled from: BaseKeyPool */
public abstract class pi<T extends yi> {
    private final Queue<T> a = fp.e(20);

    public abstract T a();

    public T b() {
        T poll = this.a.poll();
        return poll == null ? a() : poll;
    }

    public void c(T t) {
        if (this.a.size() < 20) {
            this.a.offer(t);
        }
    }
}
