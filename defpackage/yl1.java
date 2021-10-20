package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: yl1  reason: default package */
public final class yl1<K> implements Iterator<Map.Entry<K, Object>> {
    private Iterator<Map.Entry<K, Object>> a;

    public yl1(Iterator<Map.Entry<K, Object>> it) {
        this.a = it;
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> next = this.a.next();
        return next.getValue() instanceof vl1 ? new xl1(next) : next;
    }

    public final void remove() {
        this.a.remove();
    }
}
