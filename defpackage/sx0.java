package defpackage;

import java.util.Map;
import vigqyno.C0201;

/* renamed from: sx0  reason: default package */
public final class sx0 implements Comparable<sx0>, Map.Entry<K, V> {
    private final K a;
    private V b;
    private final /* synthetic */ lx0 c;

    public sx0(lx0 lx0, K k, V v) {
        this.c = lx0;
        this.a = k;
        this.b = v;
    }

    public sx0(lx0 lx0, Map.Entry<K, V> entry) {
        this(lx0, entry.getKey(), entry.getValue());
    }

    private static boolean b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(sx0 sx0) {
        return ((Comparable) getKey()).compareTo((Comparable) sx0.getKey());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return b(this.a, entry.getKey()) && b(this.b, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.b;
    }

    public final int hashCode() {
        K k = this.a;
        int i = 0;
        int hashCode = k == null ? 0 : k.hashCode();
        V v = this.b;
        if (v != null) {
            i = v.hashCode();
        }
        return hashCode ^ i;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        this.c.o();
        V v2 = this.b;
        this.b = v;
        return v2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append(C0201.m82(8183));
        sb.append(valueOf2);
        return sb.toString();
    }
}
