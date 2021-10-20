package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import vigqyno.C0201;

/* renamed from: w0  reason: default package */
/* compiled from: MapCollections */
public abstract class w0<K, V> {
    public w0<K, V>.b a;
    public w0<K, V>.c b;
    public w0<K, V>.e c;

    /* renamed from: w0$a */
    /* compiled from: MapCollections */
    final class a<T> implements Iterator<T> {
        public final int a;
        public int b;
        public int c;
        public boolean d = false;

        public a(int i) {
            this.a = i;
            this.b = w0.this.d();
        }

        public boolean hasNext() {
            return this.c < this.b;
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                T t = (T) w0.this.b(this.c, this.a);
                this.c++;
                this.d = true;
                return t;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.d) {
                int i = this.c - 1;
                this.c = i;
                this.b--;
                this.d = false;
                w0.this.h(i);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w0$b */
    /* compiled from: MapCollections */
    public final class b implements Set<Map.Entry<K, V>> {
        public b() {
        }

        public boolean a(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            a((Map.Entry) obj);
            throw null;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: w0 */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Collection, java.util.Set
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int d = w0.this.d();
            Iterator<? extends Map.Entry<K, V>> it = collection.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                w0.this.g(entry.getKey(), entry.getValue());
            }
            return d != w0.this.d();
        }

        public void clear() {
            w0.this.a();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int e = w0.this.e(entry.getKey());
            if (e < 0) {
                return false;
            }
            return t0.c(w0.this.b(e, 1), entry.getValue());
        }

        @Override // java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            return w0.k(this, obj);
        }

        public int hashCode() {
            int i;
            int i2;
            int i3 = 0;
            for (int d = w0.this.d() - 1; d >= 0; d--) {
                Object b = w0.this.b(d, 0);
                Object b2 = w0.this.b(d, 1);
                if (b == null) {
                    i = 0;
                } else {
                    i = b.hashCode();
                }
                if (b2 == null) {
                    i2 = 0;
                } else {
                    i2 = b2.hashCode();
                }
                i3 += i ^ i2;
            }
            return i3;
        }

        public boolean isEmpty() {
            return w0.this.d() == 0;
        }

        @Override // java.util.Collection, java.util.Set, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return w0.this.d();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w0$c */
    /* compiled from: MapCollections */
    public final class c implements Set<K> {
        public c() {
        }

        @Override // java.util.Collection, java.util.Set
        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            w0.this.a();
        }

        public boolean contains(Object obj) {
            return w0.this.e(obj) >= 0;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return w0.j(w0.this.c(), collection);
        }

        public boolean equals(Object obj) {
            return w0.k(this, obj);
        }

        public int hashCode() {
            int i;
            int i2 = 0;
            for (int d = w0.this.d() - 1; d >= 0; d--) {
                Object b = w0.this.b(d, 0);
                if (b == null) {
                    i = 0;
                } else {
                    i = b.hashCode();
                }
                i2 += i;
            }
            return i2;
        }

        public boolean isEmpty() {
            return w0.this.d() == 0;
        }

        @Override // java.util.Collection, java.util.Set, java.lang.Iterable
        public Iterator<K> iterator() {
            return new a(0);
        }

        public boolean remove(Object obj) {
            int e = w0.this.e(obj);
            if (e < 0) {
                return false;
            }
            w0.this.h(e);
            return true;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return w0.o(w0.this.c(), collection);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return w0.p(w0.this.c(), collection);
        }

        public int size() {
            return w0.this.d();
        }

        public Object[] toArray() {
            return w0.this.q(0);
        }

        @Override // java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) w0.this.r(tArr, 0);
        }
    }

    /* renamed from: w0$d */
    /* compiled from: MapCollections */
    final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {
        public int a;
        public int b;
        public boolean c = false;

        public d() {
            this.a = w0.this.d() - 1;
            this.b = -1;
        }

        public Map.Entry<K, V> a() {
            if (hasNext()) {
                this.b++;
                this.c = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public boolean equals(Object obj) {
            if (!this.c) {
                throw new IllegalStateException(C0201.m82(26685));
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                if (!t0.c(entry.getKey(), w0.this.b(this.b, 0)) || !t0.c(entry.getValue(), w0.this.b(this.b, 1))) {
                    return false;
                }
                return true;
            }
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.c) {
                return (K) w0.this.b(this.b, 0);
            }
            throw new IllegalStateException(C0201.m82(26686));
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.c) {
                return (V) w0.this.b(this.b, 1);
            }
            throw new IllegalStateException(C0201.m82(26687));
        }

        public boolean hasNext() {
            return this.b < this.a;
        }

        public int hashCode() {
            int i;
            if (this.c) {
                int i2 = 0;
                Object b2 = w0.this.b(this.b, 0);
                Object b3 = w0.this.b(this.b, 1);
                if (b2 == null) {
                    i = 0;
                } else {
                    i = b2.hashCode();
                }
                if (b3 != null) {
                    i2 = b3.hashCode();
                }
                return i ^ i2;
            }
            throw new IllegalStateException(C0201.m82(26688));
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            a();
            return this;
        }

        public void remove() {
            if (this.c) {
                w0.this.h(this.b);
                this.b--;
                this.a--;
                this.c = false;
                return;
            }
            throw new IllegalStateException();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            if (this.c) {
                return (V) w0.this.i(this.b, v);
            }
            throw new IllegalStateException(C0201.m82(26689));
        }

        public String toString() {
            return getKey() + C0201.m82(26690) + getValue();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w0$e */
    /* compiled from: MapCollections */
    public final class e implements Collection<V> {
        public e() {
        }

        @Override // java.util.Collection
        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            w0.this.a();
        }

        public boolean contains(Object obj) {
            return w0.this.f(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return w0.this.d() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new a(1);
        }

        public boolean remove(Object obj) {
            int f = w0.this.f(obj);
            if (f < 0) {
                return false;
            }
            w0.this.h(f);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int d = w0.this.d();
            int i = 0;
            boolean z = false;
            while (i < d) {
                if (collection.contains(w0.this.b(i, 1))) {
                    w0.this.h(i);
                    i--;
                    d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int d = w0.this.d();
            int i = 0;
            boolean z = false;
            while (i < d) {
                if (!collection.contains(w0.this.b(i, 1))) {
                    w0.this.h(i);
                    i--;
                    d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public int size() {
            return w0.this.d();
        }

        public Object[] toArray() {
            return w0.this.q(1);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) w0.this.r(tArr, 1);
        }
    }

    public static <K, V> boolean j(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean k(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() != set2.size() || !set.containsAll(set2)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <K, V> boolean o(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    public static <K, V> boolean p(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public abstract void a();

    public abstract Object b(int i, int i2);

    public abstract Map<K, V> c();

    public abstract int d();

    public abstract int e(Object obj);

    public abstract int f(Object obj);

    public abstract void g(K k, V v);

    public abstract void h(int i);

    public abstract V i(int i, V v);

    public Set<Map.Entry<K, V>> l() {
        if (this.a == null) {
            this.a = new b();
        }
        return this.a;
    }

    public Set<K> m() {
        if (this.b == null) {
            this.b = new c();
        }
        return this.b;
    }

    public Collection<V> n() {
        if (this.c == null) {
            this.c = new e();
        }
        return this.c;
    }

    public Object[] q(int i) {
        int d2 = d();
        Object[] objArr = new Object[d2];
        for (int i2 = 0; i2 < d2; i2++) {
            objArr[i2] = b(i2, i);
        }
        return objArr;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v9, resolved type: T[] */
    /* JADX WARN: Multi-variable type inference failed */
    public <T> T[] r(T[] tArr, int i) {
        int d2 = d();
        if (tArr.length < d2) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), d2));
        }
        for (int i2 = 0; i2 < d2; i2++) {
            tArr[i2] = b(i2, i);
        }
        if (tArr.length > d2) {
            tArr[d2] = null;
        }
        return tArr;
    }
}
