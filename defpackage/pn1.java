package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: pn1  reason: default package */
public final class pn1 extends vn1 {
    private final /* synthetic */ ln1 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private pn1(ln1 ln1) {
        super(ln1, null);
        this.b = ln1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.vn1, java.util.Set, java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new on1(this.b, null);
    }

    public /* synthetic */ pn1(ln1 ln1, nn1 nn1) {
        this(ln1);
    }
}
