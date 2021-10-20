package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: ba1  reason: default package */
public final class ba1<K> implements Iterator<Map.Entry<K, Object>> {
    private Iterator<Map.Entry<K, Object>> a;

    public ba1(Iterator<Map.Entry<K, Object>> it) {
        this.a = it;
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> next = this.a.next();
        return next.getValue() instanceof w91 ? new y91(next) : next;
    }

    public final void remove() {
        this.a.remove();
    }
}
