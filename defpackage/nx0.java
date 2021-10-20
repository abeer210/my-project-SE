package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: nx0  reason: default package */
public final class nx0 implements Iterator<Map.Entry<K, V>> {
    private int a;
    private Iterator<Map.Entry<K, V>> b;
    private final /* synthetic */ lx0 c;

    private nx0(lx0 lx0) {
        this.c = lx0;
        this.a = this.c.b.size();
    }

    public /* synthetic */ nx0(lx0 lx0, mx0 mx0) {
        this(lx0);
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
        Object obj;
        if (a().hasNext()) {
            obj = a().next();
        } else {
            List list = this.c.b;
            int i = this.a - 1;
            this.a = i;
            obj = list.get(i);
        }
        return (Map.Entry) obj;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
