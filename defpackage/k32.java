package defpackage;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import vigqyno.C0201;

/* renamed from: k32  reason: default package */
/* compiled from: LinkedTreeMap */
public final class k32<K, V> extends AbstractMap<K, V> implements Serializable {
    private static final Comparator<Comparable> h = new a();
    public Comparator<? super K> a;
    public e<K, V> b;
    public int c;
    public int d;
    public final e<K, V> e;
    private k32<K, V>.b f;
    private k32<K, V>.c g;

    /* renamed from: k32$a */
    /* compiled from: LinkedTreeMap */
    static class a implements Comparator<Comparable> {
        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k32$b */
    /* compiled from: LinkedTreeMap */
    public class b extends AbstractSet<Map.Entry<K, V>> {

        /* renamed from: k32$b$a */
        /* compiled from: LinkedTreeMap */
        class a extends k32<K, V>.d {
            public a(b bVar) {
                super();
            }

            /* renamed from: b */
            public Map.Entry<K, V> next() {
                return a();
            }
        }

        public b() {
        }

        public void clear() {
            k32.this.clear();
        }

        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && k32.this.c((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a(this);
        }

        public boolean remove(Object obj) {
            e<K, V> c;
            if (!(obj instanceof Map.Entry) || (c = k32.this.c((Map.Entry) obj)) == null) {
                return false;
            }
            k32.this.f(c, true);
            return true;
        }

        public int size() {
            return k32.this.c;
        }
    }

    /* renamed from: k32$c */
    /* compiled from: LinkedTreeMap */
    final class c extends AbstractSet<K> {

        /* renamed from: k32$c$a */
        /* compiled from: LinkedTreeMap */
        class a extends k32<K, V>.d {
            public a(c cVar) {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return a().f;
            }
        }

        public c() {
        }

        public void clear() {
            k32.this.clear();
        }

        public boolean contains(Object obj) {
            return k32.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
        public Iterator<K> iterator() {
            return new a(this);
        }

        public boolean remove(Object obj) {
            return k32.this.g(obj) != null;
        }

        public int size() {
            return k32.this.c;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k32$d */
    /* compiled from: LinkedTreeMap */
    public abstract class d<T> implements Iterator<T> {
        public e<K, V> a;
        public e<K, V> b = null;
        public int c;

        public d() {
            k32 k32 = k32.this;
            this.a = k32.e.d;
            this.c = k32.d;
        }

        public final e<K, V> a() {
            e<K, V> eVar = this.a;
            k32 k32 = k32.this;
            if (eVar == k32.e) {
                throw new NoSuchElementException();
            } else if (k32.d == this.c) {
                this.a = eVar.d;
                this.b = eVar;
                return eVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.a != k32.this.e;
        }

        public final void remove() {
            e<K, V> eVar = this.b;
            if (eVar != null) {
                k32.this.f(eVar, true);
                this.b = null;
                this.c = k32.this.d;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public k32() {
        this(h);
    }

    private boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    private void e(e<K, V> eVar, boolean z) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.b;
            e<K, V> eVar3 = eVar.c;
            int i = 0;
            int i2 = eVar2 != null ? eVar2.h : 0;
            int i3 = eVar3 != null ? eVar3.h : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                e<K, V> eVar4 = eVar3.b;
                e<K, V> eVar5 = eVar3.c;
                int i5 = eVar5 != null ? eVar5.h : 0;
                if (eVar4 != null) {
                    i = eVar4.h;
                }
                int i6 = i - i5;
                if (i6 == -1 || (i6 == 0 && !z)) {
                    i(eVar);
                } else {
                    j(eVar3);
                    i(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                e<K, V> eVar6 = eVar2.b;
                e<K, V> eVar7 = eVar2.c;
                int i7 = eVar7 != null ? eVar7.h : 0;
                if (eVar6 != null) {
                    i = eVar6.h;
                }
                int i8 = i - i7;
                if (i8 == 1 || (i8 == 0 && !z)) {
                    j(eVar);
                } else {
                    i(eVar2);
                    j(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                eVar.h = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                eVar.h = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            eVar = eVar.a;
        }
    }

    private void h(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.a;
        eVar.a = null;
        if (eVar2 != null) {
            eVar2.a = eVar3;
        }
        if (eVar3 == null) {
            this.b = eVar2;
        } else if (eVar3.b == eVar) {
            eVar3.b = eVar2;
        } else {
            eVar3.c = eVar2;
        }
    }

    private void i(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.b;
        e<K, V> eVar3 = eVar.c;
        e<K, V> eVar4 = eVar3.b;
        e<K, V> eVar5 = eVar3.c;
        eVar.c = eVar4;
        if (eVar4 != null) {
            eVar4.a = eVar;
        }
        h(eVar, eVar3);
        eVar3.b = eVar;
        eVar.a = eVar3;
        int i = 0;
        int max = Math.max(eVar2 != null ? eVar2.h : 0, eVar4 != null ? eVar4.h : 0) + 1;
        eVar.h = max;
        if (eVar5 != null) {
            i = eVar5.h;
        }
        eVar3.h = Math.max(max, i) + 1;
    }

    private void j(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.b;
        e<K, V> eVar3 = eVar.c;
        e<K, V> eVar4 = eVar2.b;
        e<K, V> eVar5 = eVar2.c;
        eVar.b = eVar5;
        if (eVar5 != null) {
            eVar5.a = eVar;
        }
        h(eVar, eVar2);
        eVar2.c = eVar;
        eVar.a = eVar2;
        int i = 0;
        int max = Math.max(eVar3 != null ? eVar3.h : 0, eVar5 != null ? eVar5.h : 0) + 1;
        eVar.h = max;
        if (eVar4 != null) {
            i = eVar4.h;
        }
        eVar2.h = Math.max(max, i) + 1;
    }

    public e<K, V> b(K k, boolean z) {
        int i;
        e<K, V> eVar;
        Comparator<? super K> comparator = this.a;
        e<K, V> eVar2 = this.b;
        if (eVar2 != null) {
            K k2 = comparator == h ? k : null;
            while (true) {
                if (k2 != null) {
                    i = k2.compareTo(eVar2.f);
                } else {
                    i = comparator.compare(k, eVar2.f);
                }
                if (i == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = i < 0 ? eVar2.b : eVar2.c;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        e<K, V> eVar4 = this.e;
        if (eVar2 != null) {
            eVar = new e<>(eVar2, k, eVar4, eVar4.e);
            if (i < 0) {
                eVar2.b = eVar;
            } else {
                eVar2.c = eVar;
            }
            e(eVar2, true);
        } else if (comparator != h || (k instanceof Comparable)) {
            eVar = new e<>(eVar2, k, eVar4, eVar4.e);
            this.b = eVar;
        } else {
            throw new ClassCastException(k.getClass().getName() + C0201.m82(25043));
        }
        this.c++;
        this.d++;
        return eVar;
    }

    public e<K, V> c(Map.Entry<?, ?> entry) {
        e<K, V> d2 = d(entry.getKey());
        if (d2 != null && a(d2.g, entry.getValue())) {
            return d2;
        }
        return null;
    }

    public void clear() {
        this.b = null;
        this.c = 0;
        this.d++;
        e<K, V> eVar = this.e;
        eVar.e = eVar;
        eVar.d = eVar;
    }

    public boolean containsKey(Object obj) {
        return d(obj) != null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    public e<K, V> d(Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return b(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        k32<K, V>.b bVar = this.f;
        if (bVar != null) {
            return bVar;
        }
        k32<K, V>.b bVar2 = new b();
        this.f = bVar2;
        return bVar2;
    }

    public void f(e<K, V> eVar, boolean z) {
        int i;
        if (z) {
            e<K, V> eVar2 = eVar.e;
            eVar2.d = eVar.d;
            eVar.d.e = eVar2;
        }
        e<K, V> eVar3 = eVar.b;
        e<K, V> eVar4 = eVar.c;
        e<K, V> eVar5 = eVar.a;
        int i2 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                h(eVar, eVar3);
                eVar.b = null;
            } else if (eVar4 != null) {
                h(eVar, eVar4);
                eVar.c = null;
            } else {
                h(eVar, null);
            }
            e(eVar5, false);
            this.c--;
            this.d++;
            return;
        }
        e<K, V> b2 = eVar3.h > eVar4.h ? eVar3.b() : eVar4.a();
        f(b2, false);
        e<K, V> eVar6 = eVar.b;
        if (eVar6 != null) {
            i = eVar6.h;
            b2.b = eVar6;
            eVar6.a = b2;
            eVar.b = null;
        } else {
            i = 0;
        }
        e<K, V> eVar7 = eVar.c;
        if (eVar7 != null) {
            i2 = eVar7.h;
            b2.c = eVar7;
            eVar7.a = b2;
            eVar.c = null;
        }
        b2.h = Math.max(i, i2) + 1;
        h(eVar, b2);
    }

    public e<K, V> g(Object obj) {
        e<K, V> d2 = d(obj);
        if (d2 != null) {
            f(d2, true);
        }
        return d2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        e<K, V> d2 = d(obj);
        if (d2 != null) {
            return d2.g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        k32<K, V>.c cVar = this.g;
        if (cVar != null) {
            return cVar;
        }
        k32<K, V>.c cVar2 = new c();
        this.g = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        if (k != null) {
            e<K, V> b2 = b(k, true);
            V v2 = b2.g;
            b2.g = v;
            return v2;
        }
        throw new NullPointerException(C0201.m82(25044));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        e<K, V> g2 = g(obj);
        if (g2 != null) {
            return g2.g;
        }
        return null;
    }

    public int size() {
        return this.c;
    }

    public k32(Comparator<? super K> comparator) {
        this.c = 0;
        this.d = 0;
        this.e = new e<>();
        this.a = comparator == null ? h : comparator;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k32$e */
    /* compiled from: LinkedTreeMap */
    public static final class e<K, V> implements Map.Entry<K, V> {
        public e<K, V> a;
        public e<K, V> b;
        public e<K, V> c;
        public e<K, V> d;
        public e<K, V> e;
        public final K f;
        public V g;
        public int h;

        public e() {
            this.f = null;
            this.e = this;
            this.d = this;
        }

        public e<K, V> a() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.b; eVar2 != null; eVar2 = eVar2.b) {
                eVar = eVar2;
            }
            return eVar;
        }

        public e<K, V> b() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.c; eVar2 != null; eVar2 = eVar2.c) {
                eVar = eVar2;
            }
            return eVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0031 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k = this.f;
            if (k == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k.equals(entry.getKey())) {
                return false;
            }
            V v = this.g;
            if (v == null) {
                if (entry.getValue() == null) {
                    return true;
                }
                return false;
            } else if (!v.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.g;
        }

        public int hashCode() {
            K k = this.f;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.g;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = this.g;
            this.g = v;
            return v2;
        }

        public String toString() {
            return ((Object) this.f) + C0201.m82(31764) + ((Object) this.g);
        }

        public e(e<K, V> eVar, K k, e<K, V> eVar2, e<K, V> eVar3) {
            this.a = eVar;
            this.f = k;
            this.h = 1;
            this.d = eVar2;
            this.e = eVar3;
            eVar3.d = this;
            eVar2.e = this;
        }
    }
}
