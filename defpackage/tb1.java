package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: tb1  reason: default package */
public final class tb1 implements Iterator<Map.Entry<K, V>> {
    private int a;
    private Iterator<Map.Entry<K, V>> b;
    private final /* synthetic */ rb1 c;

    private tb1(rb1 rb1) {
        this.c = rb1;
        this.a = this.c.b.size();
    }

    private final Iterator<Map.Entry<K, V>> a() {
        if (this.b == null) {
            this.b = this.c.f.entrySet().iterator();
        }
        return this.b;
    }

    public final boolean hasNext() {
        int i = this.a;
        return (i > 0 && i <= this.c.b.size()) || a().hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (a().hasNext()) {
            return (Map.Entry) a().next();
        }
        List list = this.c.b;
        int i = this.a - 1;
        this.a = i;
        return (Map.Entry) list.get(i);
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ tb1(rb1 rb1, qb1 qb1) {
        this(rb1);
    }
}
