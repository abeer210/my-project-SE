package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: ox0  reason: default package */
public final class ox0 extends ux0 {
    private final /* synthetic */ lx0 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ox0(lx0 lx0) {
        super(lx0, null);
        this.b = lx0;
    }

    public /* synthetic */ ox0(lx0 lx0, mx0 mx0) {
        this(lx0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, defpackage.ux0, java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new nx0(this.b, null);
    }
}
