package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import vigqyno.C0201;

/* renamed from: i0  reason: default package */
/* compiled from: SafeIterableMap */
public class i0<K, V> implements Iterable<Map.Entry<K, V>> {
    public c<K, V> a;
    private c<K, V> b;
    private WeakHashMap<f<K, V>, Boolean> c = new WeakHashMap<>();
    private int d = 0;

    /* access modifiers changed from: package-private */
    /* renamed from: i0$a */
    /* compiled from: SafeIterableMap */
    public static class a<K, V> extends e<K, V> {
        public a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // defpackage.i0.e
        public c<K, V> b(c<K, V> cVar) {
            return cVar.d;
        }

        @Override // defpackage.i0.e
        public c<K, V> c(c<K, V> cVar) {
            return cVar.c;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i0$b */
    /* compiled from: SafeIterableMap */
    public static class b<K, V> extends e<K, V> {
        public b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // defpackage.i0.e
        public c<K, V> b(c<K, V> cVar) {
            return cVar.c;
        }

        @Override // defpackage.i0.e
        public c<K, V> c(c<K, V> cVar) {
            return cVar.d;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i0$c */
    /* compiled from: SafeIterableMap */
    public static class c<K, V> implements Map.Entry<K, V> {
        public final K a;
        public final V b;
        public c<K, V> c;
        public c<K, V> d;

        public c(K k, V v) {
            this.a = k;
            this.b = v;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!this.a.equals(cVar.a) || !this.b.equals(cVar.b)) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.b;
        }

        public int hashCode() {
            return this.a.hashCode() ^ this.b.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException(C0201.m82(20093));
        }

        public String toString() {
            return ((Object) this.a) + C0201.m82(20094) + ((Object) this.b);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i0$d */
    /* compiled from: SafeIterableMap */
    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {
        private c<K, V> a;
        private boolean b = true;

        public d() {
        }

        @Override // defpackage.i0.f
        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.a;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.d;
                this.a = cVar3;
                this.b = cVar3 == null;
            }
        }

        /* renamed from: b */
        public Map.Entry<K, V> next() {
            if (this.b) {
                this.b = false;
                this.a = i0.this.a;
            } else {
                c<K, V> cVar = this.a;
                this.a = cVar != null ? cVar.c : null;
            }
            return this.a;
        }

        public boolean hasNext() {
            if (!this.b) {
                c<K, V> cVar = this.a;
                if (cVar == null || cVar.c == null) {
                    return false;
                }
                return true;
            } else if (i0.this.a != null) {
                return true;
            } else {
                return false;
            }
        }
    }

    /* renamed from: i0$e */
    /* compiled from: SafeIterableMap */
    private static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {
        public c<K, V> a;
        public c<K, V> b;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.a = cVar2;
            this.b = cVar;
        }

        private c<K, V> e() {
            c<K, V> cVar = this.b;
            c<K, V> cVar2 = this.a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return c(cVar);
        }

        @Override // defpackage.i0.f
        public void a(c<K, V> cVar) {
            if (this.a == cVar && cVar == this.b) {
                this.b = null;
                this.a = null;
            }
            c<K, V> cVar2 = this.a;
            if (cVar2 == cVar) {
                this.a = b(cVar2);
            }
            if (this.b == cVar) {
                this.b = e();
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> c(c<K, V> cVar);

        /* renamed from: d */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.b;
            this.b = e();
            return cVar;
        }

        public boolean hasNext() {
            return this.b != null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i0$f */
    /* compiled from: SafeIterableMap */
    public interface f<K, V> {
        void a(c<K, V> cVar);
    }

    public Map.Entry<K, V> a() {
        return this.a;
    }

    public c<K, V> b(K k) {
        c<K, V> cVar = this.a;
        while (cVar != null && !cVar.a.equals(k)) {
            cVar = cVar.c;
        }
        return cVar;
    }

    public i0<K, V>.d c() {
        i0<K, V>.d dVar = new d();
        this.c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Map.Entry<K, V> d() {
        return this.b;
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        b bVar = new b(this.b, this.a);
        this.c.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public c<K, V> e(K k, V v) {
        c<K, V> cVar = new c<>(k, v);
        this.d++;
        c<K, V> cVar2 = this.b;
        if (cVar2 == null) {
            this.a = cVar;
            this.b = cVar;
            return cVar;
        }
        cVar2.c = cVar;
        cVar.d = cVar2;
        this.b = cVar;
        return cVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        if (size() != i0Var.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = i0Var.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        if (it.hasNext() || it2.hasNext()) {
            return false;
        }
        return true;
    }

    public V f(K k, V v) {
        c<K, V> b2 = b(k);
        if (b2 != null) {
            return b2.b;
        }
        e(k, v);
        return null;
    }

    public V g(K k) {
        c<K, V> b2 = b(k);
        if (b2 == null) {
            return null;
        }
        this.d--;
        if (!this.c.isEmpty()) {
            for (f<K, V> fVar : this.c.keySet()) {
                fVar.a(b2);
            }
        }
        c<K, V> cVar = b2.d;
        if (cVar != null) {
            cVar.c = b2.c;
        } else {
            this.a = b2.c;
        }
        c<K, V> cVar2 = b2.c;
        if (cVar2 != null) {
            cVar2.d = b2.d;
        } else {
            this.b = b2.d;
        }
        b2.c = null;
        b2.d = null;
        return b2.b;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().hashCode();
        }
        return i;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.a, this.b);
        this.c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public int size() {
        return this.d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C0201.m82(17765));
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(C0201.m82(17766));
            }
        }
        sb.append(C0201.m82(17767));
        return sb.toString();
    }
}
