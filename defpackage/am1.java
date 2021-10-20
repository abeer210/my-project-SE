package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: am1  reason: default package */
public final class am1 extends uj1<String> implements bm1, RandomAccess {
    private static final am1 c;
    private final List<Object> b;

    static {
        am1 am1 = new am1();
        c = am1;
        am1.h();
    }

    public am1() {
        this(10);
    }

    private static String b(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof bk1) {
            return ((bk1) obj).l();
        }
        return nl1.i((byte[]) obj);
    }

    @Override // defpackage.rl1
    public final /* synthetic */ rl1 C0(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.b);
            return new am1(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.bm1
    public final List<?> I0() {
        return Collections.unmodifiableList(this.b);
    }

    @Override // defpackage.bm1
    public final bm1 U() {
        return n() ? new eo1(this) : this;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ void add(int i, Object obj) {
        a();
        this.b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, defpackage.uj1
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // defpackage.uj1
    public final void clear() {
        a();
        this.b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.bm1
    public final void d1(bk1 bk1) {
        a();
        this.b.add(bk1);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object get(int i) {
        Object obj = this.b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof bk1) {
            bk1 bk1 = (bk1) obj;
            String l = bk1.l();
            if (bk1.o()) {
                this.b.set(i, l);
            }
            return l;
        }
        byte[] bArr = (byte[]) obj;
        String i2 = nl1.i(bArr);
        if (nl1.g(bArr)) {
            this.b.set(i, i2);
        }
        return i2;
    }

    @Override // defpackage.bm1
    public final Object m(int i) {
        return this.b.get(i);
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object set(int i, Object obj) {
        a();
        return b(this.b.set(i, (String) obj));
    }

    public final int size() {
        return this.b.size();
    }

    public am1(int i) {
        this(new ArrayList(i));
    }

    @Override // java.util.List, java.util.AbstractList, defpackage.uj1
    public final boolean addAll(int i, Collection<? extends String> collection) {
        a();
        if (collection instanceof bm1) {
            collection = ((bm1) collection).I0();
        }
        boolean addAll = this.b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object remove(int i) {
        a();
        Object remove = this.b.remove(i);
        ((AbstractList) this).modCount++;
        return b(remove);
    }

    private am1(ArrayList<Object> arrayList) {
        this.b = arrayList;
    }
}
