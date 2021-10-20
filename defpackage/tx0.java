package defpackage;

import java.util.Iterator;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: tx0  reason: default package */
public final class tx0 implements Iterator<Map.Entry<K, V>> {
    private int a;
    private boolean b;
    private Iterator<Map.Entry<K, V>> c;
    private final /* synthetic */ lx0 d;

    private tx0(lx0 lx0) {
        this.d = lx0;
        this.a = -1;
    }

    public /* synthetic */ tx0(lx0 lx0, mx0 mx0) {
        this(lx0);
    }

    private final Iterator<Map.Entry<K, V>> a() {
        if (this.c == null) {
            this.c = this.d.c.entrySet().iterator();
        }
        return this.c;
    }

    public final boolean hasNext() {
        return this.a + 1 < this.d.b.size() || (!this.d.c.isEmpty() && a().hasNext());
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.b = true;
        int i = this.a + 1;
        this.a = i;
        return (Map.Entry) (i < this.d.b.size() ? this.d.b.get(this.a) : a().next());
    }

    public final void remove() {
        if (this.b) {
            this.b = false;
            this.d.o();
            if (this.a < this.d.b.size()) {
                lx0 lx0 = this.d;
                int i = this.a;
                this.a = i - 1;
                Object unused = lx0.h(i);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException(C0201.m82(35415));
    }
}
