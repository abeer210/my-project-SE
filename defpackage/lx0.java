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

/* renamed from: lx0  reason: default package */
public class lx0<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private final int a;
    private List<sx0> b;
    private Map<K, V> c;
    private boolean d;
    private volatile ux0 e;
    private Map<K, V> f;
    private volatile ox0 g;

    private lx0(int i) {
        this.a = i;
        this.b = Collections.emptyList();
        this.c = Collections.emptyMap();
        this.f = Collections.emptyMap();
    }

    public /* synthetic */ lx0(int i, mx0 mx0) {
        this(i);
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

    public static <FieldDescriptorType extends ev0<FieldDescriptorType>> lx0<FieldDescriptorType, Object> f(int i) {
        return new mx0(i);
    }

    /* access modifiers changed from: private */
    public final V h(int i) {
        o();
        V v = (V) this.b.remove(i).getValue();
        if (!this.c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = p().entrySet().iterator();
            this.b.add(new sx0(this, it.next()));
            it.remove();
        }
        return v;
    }

    /* access modifiers changed from: private */
    public final void o() {
        if (this.d) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap<K, V> p() {
        o();
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
        o();
        if (!this.b.isEmpty()) {
            this.b.clear();
        }
        if (!this.c.isEmpty()) {
            this.c.clear();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: lx0<K extends java.lang.Comparable<K>, V> */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return b(comparable) >= 0 || this.c.containsKey(comparable);
    }

    /* renamed from: d */
    public final V put(K k, V v) {
        o();
        int b2 = b(k);
        if (b2 >= 0) {
            return (V) this.b.get(b2).setValue(v);
        }
        o();
        if (this.b.isEmpty() && !(this.b instanceof ArrayList)) {
            this.b = new ArrayList(this.a);
        }
        int i = -(b2 + 1);
        if (i >= this.a) {
            return p().put(k, v);
        }
        int size = this.b.size();
        int i2 = this.a;
        if (size == i2) {
            sx0 remove = this.b.remove(i2 - 1);
            p().put((K) ((Comparable) remove.getKey()), (V) remove.getValue());
        }
        this.b.add(i, new sx0(this, k, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.e == null) {
            this.e = new ux0(this, null);
        }
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lx0)) {
            return super.equals(obj);
        }
        lx0 lx0 = (lx0) obj;
        int size = size();
        if (size != lx0.size()) {
            return false;
        }
        int l = l();
        if (l != lx0.l()) {
            return entrySet().equals(lx0.entrySet());
        }
        for (int i = 0; i < l; i++) {
            if (!g(i).equals(lx0.g(i))) {
                return false;
            }
        }
        if (l != size) {
            return this.c.equals(lx0.c);
        }
        return true;
    }

    public final Map.Entry<K, V> g(int i) {
        return this.b.get(i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: lx0<K extends java.lang.Comparable<K>, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int b2 = b(comparable);
        return b2 >= 0 ? (V) this.b.get(b2).getValue() : this.c.get(comparable);
    }

    public int hashCode() {
        int l = l();
        int i = 0;
        for (int i2 = 0; i2 < l; i2++) {
            i += this.b.get(i2).hashCode();
        }
        return this.c.size() > 0 ? i + this.c.hashCode() : i;
    }

    public final int l() {
        return this.b.size();
    }

    public final Iterable<Map.Entry<K, V>> m() {
        return this.c.isEmpty() ? px0.a() : this.c.entrySet();
    }

    public final Set<Map.Entry<K, V>> n() {
        if (this.g == null) {
            this.g = new ox0(this, null);
        }
        return this.g;
    }

    public void q() {
        if (!this.d) {
            this.c = this.c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.c);
            this.f = this.f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f);
            this.d = true;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: lx0<K extends java.lang.Comparable<K>, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        o();
        Comparable comparable = (Comparable) obj;
        int b2 = b(comparable);
        if (b2 >= 0) {
            return (V) h(b2);
        }
        if (this.c.isEmpty()) {
            return null;
        }
        return this.c.remove(comparable);
    }

    public int size() {
        return this.b.size() + this.c.size();
    }
}
