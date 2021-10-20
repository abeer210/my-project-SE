package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import vigqyno.C0201;

/* renamed from: sq2  reason: default package */
/* compiled from: COSArray */
public class sq2 extends tq2 implements Iterable<tq2> {
    private final List<tq2> a = new ArrayList();

    public int A(int i, int i2) {
        if (i >= size()) {
            return i2;
        }
        tq2 tq2 = this.a.get(i);
        return tq2 instanceof cr2 ? ((cr2) tq2).A() : i2;
    }

    public tq2 E(int i) {
        tq2 tq2 = this.a.get(i);
        if (tq2 instanceof dr2) {
            tq2 = ((dr2) tq2).x();
        } else if (tq2 instanceof br2) {
            tq2 = null;
        }
        return tq2;
    }

    public tq2 H(int i) {
        return this.a.remove(i);
    }

    public int getInt(int i) {
        return A(i, -1);
    }

    @Override // java.lang.Iterable
    public Iterator<tq2> iterator() {
        return this.a.iterator();
    }

    public void r(tq2 tq2) {
        this.a.add(tq2);
    }

    public int size() {
        return this.a.size();
    }

    public String toString() {
        return C0201.m82(27475) + this.a + C0201.m82(27476);
    }

    public tq2 x(int i) {
        return this.a.get(i);
    }
}
