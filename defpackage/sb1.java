package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: sb1  reason: default package */
public final class sb1 extends yb1 {
    private final /* synthetic */ rb1 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private sb1(rb1 rb1) {
        super(rb1, null);
        this.b = rb1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.yb1, java.util.Set, java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new tb1(this.b, null);
    }

    public /* synthetic */ sb1(rb1 rb1, qb1 qb1) {
        this(rb1);
    }
}
