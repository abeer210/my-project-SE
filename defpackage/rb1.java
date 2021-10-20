package defpackage;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: rb1  reason: default package */
public class rb1<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private final int a;
    private List<wb1> b;
    private Map<K, V> c;
    private boolean d;
    private volatile yb1 e;
    private Map<K, V> f;
    private volatile sb1 g;

    private rb1(int i) {
        this.a = i;
        this.b = Collections.emptyList();
        this.c = Collections.emptyMap();
        this.f = Collections.emptyMap();
    }

    private final int b(K k) {
        int size = this.b.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) this.b.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo((Comparable) this.b.get(i2).getKey());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    public static <FieldDescriptorType extends d91<FieldDescriptorType>> rb1<FieldDescriptorType, Object> h(int i) {
        return new qb1(i);
    }

    /* access modifiers changed from: private */
    public final V j(int i) {
        p();
        V v = (V) this.b.remove(i).getValue();
        if (!this.c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = q().entrySet().iterator();
            this.b.add(new wb1(this, it.next()));
            it.remove();
        }
        return v;
    }

    /* access modifiers changed from: private */
    public final void p() {
        if (this.d) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap<K, V> q() {
        p();
        if (this.c.isEmpty() && !(this.c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.c = treeMap;
            this.f = treeMap.descendingMap();
        }
        return (SortedMap) this.c;
    }

    public final boolean a() {
        return this.d;
    }

    public void clear() {
        p();
        if (!this.b.isEmpty()) {
            this.b.clear();
        }
        if (!this.c.isEmpty()) {
            this.c.clear();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: rb1<K extends java.lang.Comparable<K>, V> */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return b(comparable) >= 0 || this.c.containsKey(comparable);
    }

    /* renamed from: d */
    public final V put(K k, V v) {
        p();
        int b2 = b(k);
        if (b2 >= 0) {
            return (V) this.b.get(b2).setValue(v);
        }
        p();
        if (this.b.isEmpty() && !(this.b instanceof ArrayList)) {
            this.b = new ArrayList(this.a);
        }
        int i = -(b2 + 1);
        if (i >= this.a) {
            return q().put(k, v);
        }
        int size = this.b.size();
        int i2 = this.a;
        if (size == i2) {
            wb1 remove = this.b.remove(i2 - 1);
            q().put((K) ((Comparable) remove.getKey()), (V) remove.getValue());
        }
        this.b.add(i, new wb1(this, k, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.e == null) {
            this.e = new yb1(this, null);
        }
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rb1)) {
            return super.equals(obj);
        }
        rb1 rb1 = (rb1) obj;
        int size = size();
        if (size != rb1.size()) {
            return false;
        }
        int m = m();
        if (m != rb1.m()) {
            return entrySet().equals(rb1.entrySet());
        }
        for (int i = 0; i < m; i++) {
            if (!i(i).equals(rb1.i(i))) {
                return false;
            }
        }
        if (m != size) {
            return this.c.equals(rb1.c);
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: rb1<K extends java.lang.Comparable<K>, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int b2 = b(comparable);
        return b2 >= 0 ? (V) this.b.get(b2).getValue() : this.c.get(comparable);
    }

    public int hashCode() {
        int m = m();
        int i = 0;
        for (int i2 = 0; i2 < m; i2++) {
            i += this.b.get(i2).hashCode();
        }
        return this.c.size() > 0 ? i + this.c.hashCode() : i;
    }

    public final Map.Entry<K, V> i(int i) {
        return this.b.get(i);
    }

    public void l() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.d) {
            if (this.c.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.c);
            }
            this.c = map;
            if (this.f.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f);
            }
            this.f = map2;
            this.d = true;
        }
    }

    public final int m() {
        return this.b.size();
    }

    public final Iterable<Map.Entry<K, V>> n() {
        if (this.c.isEmpty()) {
            return vb1.a();
        }
        return this.c.entrySet();
    }

    public final Set<Map.Entry<K, V>> o() {
        if (this.g == null) {
            this.g = new sb1(this, null);
        }
        return this.g;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: rb1<K extends java.lang.Comparable<K>, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        p();
        Comparable comparable = (Comparable) obj;
        int b2 = b(comparable);
        if (b2 >= 0) {
            return (V) j(b2);
        }
        if (this.c.isEmpty()) {
            return null;
        }
        return this.c.remove(comparable);
    }

    public int size() {
        return this.b.size() + this.c.size();
    }

    public /* synthetic */ rb1(int i, qb1 qb1) {
        this(i);
    }
}
