package com.google.firebase.components;

import com.google.android.gms.common.internal.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
public class l extends a {
    private static final x12<Set<Object>> e = k.a();
    private final Map<d<?>, s<?>> a = new HashMap();
    private final Map<Class<?>, s<?>> b = new HashMap();
    private final Map<Class<?>, s<Set<?>>> c = new HashMap();
    private final r d;

    public l(Executor executor, Iterable<h> iterable, d<?>... dVarArr) {
        this.d = new r(executor);
        ArrayList<d<?>> arrayList = new ArrayList();
        arrayList.add(d.n(this.d, r.class, v12.class, u12.class));
        for (h hVar : iterable) {
            arrayList.addAll(hVar.getComponents());
        }
        Collections.addAll(arrayList, dVarArr);
        m.a(arrayList);
        for (d<?> dVar : arrayList) {
            this.a.put(dVar, new s<>(i.a(this, dVar)));
        }
        h();
        i();
    }

    public static /* synthetic */ Set g(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(((s) it.next()).get());
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private void h() {
        for (Map.Entry<d<?>, s<?>> entry : this.a.entrySet()) {
            d<?> key = entry.getKey();
            if (key.k()) {
                s<?> value = entry.getValue();
                for (Class<? super Object> cls : key.e()) {
                    this.b.put(cls, value);
                }
            }
        }
        j();
    }

    private void i() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<d<?>, s<?>> entry : this.a.entrySet()) {
            d<?> key = entry.getKey();
            if (!key.k()) {
                s<?> value = entry.getValue();
                for (Class<? super Object> cls : key.e()) {
                    if (!hashMap.containsKey(cls)) {
                        hashMap.put(cls, new HashSet());
                    }
                    ((Set) hashMap.get(cls)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            this.c.put((Class) entry2.getKey(), new s<>(j.a((Set) entry2.getValue())));
        }
    }

    private void j() {
        for (d<?> dVar : this.a.keySet()) {
            Iterator<n> it = dVar.c().iterator();
            while (true) {
                if (it.hasNext()) {
                    n next = it.next();
                    if (next.c() && !this.b.containsKey(next.a())) {
                        throw new t(String.format("Unsatisfied dependency for component %s: %s", dVar, next.a()));
                    }
                }
            }
        }
    }

    @Override // com.google.firebase.components.e
    public <T> x12<T> b(Class<T> cls) {
        u.l(cls, "Null interface requested.");
        return this.b.get(cls);
    }

    @Override // com.google.firebase.components.e
    public <T> x12<Set<T>> c(Class<T> cls) {
        s<Set<?>> sVar = this.c.get(cls);
        return sVar != null ? sVar : (x12<Set<T>>) e;
    }

    public void e(boolean z) {
        for (Map.Entry<d<?>, s<?>> entry : this.a.entrySet()) {
            d<?> key = entry.getKey();
            s<?> value = entry.getValue();
            if (key.i() || (key.j() && z)) {
                value.get();
            }
        }
        this.d.c();
    }
}
