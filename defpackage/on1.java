package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: on1  reason: default package */
public final class on1 implements Iterator<Map.Entry<K, V>> {
    private int a;
    private Iterator<Map.Entry<K, V>> b;
    private final /* synthetic */ ln1 c;

    private on1(ln1 ln1) {
        this.c = ln1;
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

    public /* synthetic */ on1(ln1 ln1, nn1 nn1) {
        this(ln1);
    }
}
