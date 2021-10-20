package defpackage;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: v32  reason: default package */
/* compiled from: MapTypeAdapterFactory */
public final class v32 implements y22 {
    private final g32 a;
    public final boolean b;

    /* renamed from: v32$a */
    /* compiled from: MapTypeAdapterFactory */
    private final class a<K, V> extends x22<Map<K, V>> {
        private final x22<K> a;
        private final x22<V> b;

        public a(k22 k22, Type type, x22<K> x22, Type type2, x22<V> x222, l32<? extends Map<K, V>> l32) {
            this.a = new b42(k22, x22, type);
            this.b = new b42(k22, x222, type2);
        }

        private String d(o22 o22) {
            if (o22.g()) {
                t22 c2 = o22.c();
                if (c2.q()) {
                    return String.valueOf(c2.k());
                }
                if (c2.o()) {
                    return Boolean.toString(c2.i());
                }
                if (c2.s()) {
                    return c2.l();
                }
                throw new AssertionError();
            } else if (o22.e()) {
                return C0201.m82(28070);
            } else {
                throw new AssertionError();
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v5, resolved type: x22<V> */
        /* JADX DEBUG: Multi-variable search result rejected for r3v8, resolved type: x22<V> */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: e */
        public void c(h42 h42, Map<K, V> map) throws IOException {
            if (map == null) {
                h42.x();
            } else if (!v32.this.b) {
                h42.k();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    h42.u(String.valueOf(entry.getKey()));
                    this.b.c(h42, entry.getValue());
                }
                h42.o();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i = 0;
                boolean z = false;
                for (Map.Entry<K, V> entry2 : map.entrySet()) {
                    o22 b2 = this.a.b(entry2.getKey());
                    arrayList.add(b2);
                    arrayList2.add(entry2.getValue());
                    z |= b2.d() || b2.f();
                }
                if (z) {
                    h42.h();
                    int size = arrayList.size();
                    while (i < size) {
                        h42.h();
                        o32.a((o22) arrayList.get(i), h42);
                        this.b.c(h42, arrayList2.get(i));
                        h42.n();
                        i++;
                    }
                    h42.n();
                    return;
                }
                h42.k();
                int size2 = arrayList.size();
                while (i < size2) {
                    h42.u(d((o22) arrayList.get(i)));
                    this.b.c(h42, arrayList2.get(i));
                    i++;
                }
                h42.o();
            }
        }
    }

    public v32(g32 g32, boolean z) {
        this.a = g32;
        this.b = z;
    }

    private x22<?> b(k22 k22, Type type) {
        if (type == Boolean.TYPE || type == Boolean.class) {
            return c42.f;
        }
        return k22.f(g42.b(type));
    }

    @Override // defpackage.y22
    public <T> x22<T> a(k22 k22, g42<T> g42) {
        Type e = g42.e();
        if (!Map.class.isAssignableFrom(g42.c())) {
            return null;
        }
        Type[] j = f32.j(e, f32.k(e));
        return new a(k22, j[0], b(k22, j[0]), j[1], k22.f(g42.b(j[1])), this.a.a(g42));
    }
}
