package com.google.firebase.components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
public class m {

    /* access modifiers changed from: private */
    /* compiled from: com.google.firebase:firebase-common@@17.1.0 */
    public static class b {
        private final d<?> a;
        private final Set<b> b = new HashSet();
        private final Set<b> c = new HashSet();

        public b(d<?> dVar) {
            this.a = dVar;
        }

        public void a(b bVar) {
            this.b.add(bVar);
        }

        public void b(b bVar) {
            this.c.add(bVar);
        }

        public d<?> c() {
            return this.a;
        }

        public Set<b> d() {
            return this.b;
        }

        public boolean e() {
            return this.b.isEmpty();
        }

        public boolean f() {
            return this.c.isEmpty();
        }

        public void g(b bVar) {
            this.c.remove(bVar);
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: com.google.firebase:firebase-common@@17.1.0 */
    public static class c {
        private final Class<?> a;
        private final boolean b;

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!cVar.a.equals(this.a) || cVar.b != this.b) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.b).hashCode();
        }

        private c(Class<?> cls, boolean z) {
            this.a = cls;
            this.b = z;
        }
    }

    public static void a(List<d<?>> list) {
        Set<b> c2 = c(list);
        Set<b> b2 = b(c2);
        int i = 0;
        while (!b2.isEmpty()) {
            b next = b2.iterator().next();
            b2.remove(next);
            i++;
            for (b bVar : next.d()) {
                bVar.g(next);
                if (bVar.f()) {
                    b2.add(bVar);
                }
            }
        }
        if (i != list.size()) {
            ArrayList arrayList = new ArrayList();
            for (b bVar2 : c2) {
                if (!bVar2.f() && !bVar2.e()) {
                    arrayList.add(bVar2.c());
                }
            }
            throw new o(arrayList);
        }
    }

    private static Set<b> b(Set<b> set) {
        HashSet hashSet = new HashSet();
        for (b bVar : set) {
            if (bVar.f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    private static Set<b> c(List<d<?>> list) {
        Set<b> set;
        HashMap hashMap = new HashMap(list.size());
        for (d<?> dVar : list) {
            b bVar = new b(dVar);
            Iterator<Class<? super Object>> it = dVar.e().iterator();
            while (true) {
                if (it.hasNext()) {
                    Class<? super Object> next = it.next();
                    c cVar = new c(next, !dVar.k());
                    if (!hashMap.containsKey(cVar)) {
                        hashMap.put(cVar, new HashSet());
                    }
                    Set set2 = (Set) hashMap.get(cVar);
                    if (set2.isEmpty() || cVar.b) {
                        set2.add(bVar);
                    } else {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", next));
                    }
                }
            }
        }
        for (Set<b> set3 : hashMap.values()) {
            for (b bVar2 : set3) {
                for (n nVar : bVar2.c().c()) {
                    if (nVar.b() && (set = (Set) hashMap.get(new c(nVar.a(), nVar.d()))) != null) {
                        for (b bVar3 : set) {
                            bVar2.a(bVar3);
                            bVar3.b(bVar2);
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Set set4 : hashMap.values()) {
            hashSet.addAll(set4);
        }
        return hashSet;
    }
}
