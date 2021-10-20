package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: m22  reason: default package */
/* compiled from: JsonArray */
public final class m22 extends o22 implements Iterable<o22> {
    private final List<o22> a = new ArrayList();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof m22) && ((m22) obj).a.equals(this.a));
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public void i(o22 o22) {
        if (o22 == null) {
            o22 = q22.a;
        }
        this.a.add(o22);
    }

    @Override // java.lang.Iterable
    public Iterator<o22> iterator() {
        return this.a.iterator();
    }
}
