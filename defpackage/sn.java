package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: sn  reason: default package */
/* compiled from: ModelToResourceClassCache */
public class sn {
    private final AtomicReference<dp> a = new AtomicReference<>();
    private final r0<dp, List<Class<?>>> b = new r0<>();

    public List<Class<?>> a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        List<Class<?>> list;
        dp andSet = this.a.getAndSet(null);
        if (andSet == null) {
            andSet = new dp(cls, cls2, cls3);
        } else {
            andSet.a(cls, cls2, cls3);
        }
        synchronized (this.b) {
            list = this.b.get(andSet);
        }
        this.a.set(andSet);
        return list;
    }

    public void b(Class<?> cls, Class<?> cls2, Class<?> cls3, List<Class<?>> list) {
        synchronized (this.b) {
            this.b.put(new dp(cls, cls2, cls3), list);
        }
    }
}
