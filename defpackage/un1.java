package defpackage;

import java.util.Iterator;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: un1  reason: default package */
public final class un1 implements Iterator<Map.Entry<K, V>> {
    private int a;
    private boolean b;
    private Iterator<Map.Entry<K, V>> c;
    private final /* synthetic */ ln1 d;

    private un1(ln1 ln1) {
        this.d = ln1;
        this.a = -1;
    }

    private final Iterator<Map.Entry<K, V>> a() {
        if (this.c == null) {
            this.c = this.d.c.entrySet().iterator();
        }
        return this.c;
    }

    public final boolean hasNext() {
        if (this.a + 1 < this.d.b.size() || (!this.d.c.isEmpty() && a().hasNext())) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.b = true;
        int i = this.a + 1;
        this.a = i;
        if (i < this.d.b.size()) {
            return (Map.Entry) this.d.b.get(this.a);
        }
        return (Map.Entry) a().next();
    }

    public final void remove() {
        if (this.b) {
            this.b = false;
            this.d.p();
            if (this.a < this.d.b.size()) {
                ln1 ln1 = this.d;
                int i = this.a;
                this.a = i - 1;
                Object unused = ln1.i(i);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException(C0201.m82(5346));
    }

    public /* synthetic */ un1(ln1 ln1, nn1 nn1) {
        this(ln1);
    }
}
