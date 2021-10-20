package defpackage;

import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: rn  reason: default package */
/* compiled from: LoadPathCache */
public class rn {
    private static final fi<?, ?, ?> c = new fi<>(Object.class, Object.class, Object.class, Collections.singletonList(new uh(Object.class, Object.class, Object.class, Collections.emptyList(), new um(), null)), null);
    private final r0<dp, fi<?, ?, ?>> a = new r0<>();
    private final AtomicReference<dp> b = new AtomicReference<>();

    private dp b(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        dp andSet = this.b.getAndSet(null);
        if (andSet == null) {
            andSet = new dp();
        }
        andSet.a(cls, cls2, cls3);
        return andSet;
    }

    public <Data, TResource, Transcode> fi<Data, TResource, Transcode> a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        fi<Data, TResource, Transcode> fiVar;
        dp b2 = b(cls, cls2, cls3);
        synchronized (this.a) {
            fiVar = (fi<Data, TResource, Transcode>) this.a.get(b2);
        }
        this.b.set(b2);
        return fiVar;
    }

    public boolean c(fi<?, ?, ?> fiVar) {
        return c.equals(fiVar);
    }

    public void d(Class<?> cls, Class<?> cls2, Class<?> cls3, fi<?, ?, ?> fiVar) {
        synchronized (this.a) {
            r0<dp, fi<?, ?, ?>> r0Var = this.a;
            dp dpVar = new dp(cls, cls2, cls3);
            if (fiVar == null) {
                fiVar = c;
            }
            r0Var.put(dpVar, fiVar);
        }
    }
}
