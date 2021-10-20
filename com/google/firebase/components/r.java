package com.google.firebase.components;

import com.google.android.gms.common.internal.u;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
public class r implements v12, u12 {
    private final Map<Class<?>, ConcurrentHashMap<t12<Object>, Executor>> a = new HashMap();
    private Queue<s12<?>> b = new ArrayDeque();
    private final Executor c;

    public r(Executor executor) {
        this.c = executor;
    }

    private synchronized Set<Map.Entry<t12<Object>, Executor>> d(s12<?> s12) {
        ConcurrentHashMap<t12<Object>, Executor> concurrentHashMap;
        concurrentHashMap = this.a.get(s12.b());
        return concurrentHashMap == null ? Collections.emptySet() : concurrentHashMap.entrySet();
    }

    @Override // defpackage.v12
    public <T> void a(Class<T> cls, t12<? super T> t12) {
        b(cls, this.c, t12);
    }

    @Override // defpackage.v12
    public synchronized <T> void b(Class<T> cls, Executor executor, t12<? super T> t12) {
        u.k(cls);
        u.k(t12);
        u.k(executor);
        if (!this.a.containsKey(cls)) {
            this.a.put(cls, new ConcurrentHashMap<>());
        }
        this.a.get(cls).put(t12, executor);
    }

    public void c() {
        Queue<s12<?>> queue;
        synchronized (this) {
            queue = null;
            if (this.b != null) {
                Queue<s12<?>> queue2 = this.b;
                this.b = null;
                queue = queue2;
            }
        }
        if (queue != null) {
            for (s12<?> s12 : queue) {
                f(s12);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r0.hasNext() == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        r1 = r0.next();
        r1.getValue().execute(com.google.firebase.components.q.a(r1, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        r0 = d(r4).iterator();
     */
    public void f(s12<?> s12) {
        u.k(s12);
        synchronized (this) {
            if (this.b != null) {
                this.b.add(s12);
            }
        }
    }
}
