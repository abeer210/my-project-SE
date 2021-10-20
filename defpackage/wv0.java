package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: wv0  reason: default package */
public final class wv0<K> implements Iterator<Map.Entry<K, Object>> {
    private Iterator<Map.Entry<K, Object>> a;

    public wv0(Iterator<Map.Entry<K, Object>> it) {
        this.a = it;
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> next = this.a.next();
        return next.getValue() instanceof tv0 ? new vv0(next) : next;
    }

    public final void remove() {
        this.a.remove();
    }
}
