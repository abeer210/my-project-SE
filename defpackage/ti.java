package defpackage;

import defpackage.yi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: ti  reason: default package */
/* compiled from: GroupedLinkedMap */
public class ti<K extends yi, V> {
    private final a<K, V> a = new a<>();
    private final Map<K, a<K, V>> b = new HashMap();

    /* access modifiers changed from: private */
    /* renamed from: ti$a */
    /* compiled from: GroupedLinkedMap */
    public static class a<K, V> {
        public final K a;
        private List<V> b;
        public a<K, V> c;
        public a<K, V> d;

        public a() {
            this(null);
        }

        public void a(V v) {
            if (this.b == null) {
                this.b = new ArrayList();
            }
            this.b.add(v);
        }

        public V b() {
            int c2 = c();
            if (c2 > 0) {
                return this.b.remove(c2 - 1);
            }
            return null;
        }

        public int c() {
            List<V> list = this.b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public a(K k) {
            this.d = this;
            this.c = this;
            this.a = k;
        }
    }

    private void b(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.a;
        aVar.d = aVar2;
        aVar.c = aVar2.c;
        g(aVar);
    }

    private void c(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.a;
        aVar.d = aVar2.d;
        aVar.c = aVar2;
        g(aVar);
    }

    private static <K, V> void e(a<K, V> aVar) {
        a<K, V> aVar2 = aVar.d;
        aVar2.c = aVar.c;
        aVar.c.d = aVar2;
    }

    private static <K, V> void g(a<K, V> aVar) {
        aVar.c.d = aVar;
        aVar.d.c = aVar;
    }

    public V a(K k) {
        a<K, V> aVar = this.b.get(k);
        if (aVar == null) {
            aVar = new a<>(k);
            this.b.put(k, aVar);
        } else {
            k.a();
        }
        b(aVar);
        return aVar.b();
    }

    public void d(K k, V v) {
        a<K, V> aVar = this.b.get(k);
        if (aVar == null) {
            aVar = new a<>(k);
            c(aVar);
            this.b.put(k, aVar);
        } else {
            k.a();
        }
        aVar.a(v);
    }

    public V f() {
        for (a<K, V> aVar = this.a.d; !aVar.equals(this.a); aVar = aVar.d) {
            V b2 = aVar.b();
            if (b2 != null) {
                return b2;
            }
            e(aVar);
            this.b.remove(aVar.a);
            aVar.a.a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(C0201.m82(8023));
        boolean z = false;
        for (a<K, V> aVar = this.a.c; !aVar.equals(this.a); aVar = aVar.c) {
            z = true;
            sb.append('{');
            sb.append((Object) aVar.a);
            sb.append(':');
            sb.append(aVar.c());
            sb.append(C0201.m82(8024));
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(C0201.m82(8025));
        return sb.toString();
    }
}
