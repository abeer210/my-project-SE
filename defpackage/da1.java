package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: da1  reason: default package */
public final class da1 extends w71<String> implements ca1, RandomAccess {
    private static final da1 c;
    private final List<Object> b;

    static {
        da1 da1 = new da1();
        c = da1;
        da1.c0();
    }

    public da1() {
        this(10);
    }

    private static String b(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof c81) {
            return ((c81) obj).o();
        }
        return m91.i((byte[]) obj);
    }

    @Override // defpackage.ca1
    public final ca1 Q0() {
        return n0() ? new jc1(this) : this;
    }

    @Override // defpackage.ca1
    public final List<?> Y0() {
        return Collections.unmodifiableList(this.b);
    }

    @Override // defpackage.ca1
    public final void Z(c81 c81) {
        a();
        this.b.add(c81);
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.s91
    public final /* synthetic */ s91 Z0(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.b);
            return new da1(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ void add(int i, Object obj) {
        a();
        this.b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.w71, java.util.AbstractCollection, java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // defpackage.w71
    public final void clear() {
        a();
        this.b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object get(int i) {
        Object obj = this.b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof c81) {
            c81 c81 = (c81) obj;
            String o = c81.o();
            if (c81.p()) {
                this.b.set(i, o);
            }
            return o;
        }
        byte[] bArr = (byte[]) obj;
        String i2 = m91.i(bArr);
        if (m91.h(bArr)) {
            this.b.set(i, i2);
        }
        return i2;
    }

    @Override // defpackage.ca1
    public final Object m0(int i) {
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

    public da1(int i) {
        this(new ArrayList(i));
    }

    @Override // defpackage.w71, java.util.List, java.util.AbstractList
    public final boolean addAll(int i, Collection<? extends String> collection) {
        a();
        if (collection instanceof ca1) {
            collection = ((ca1) collection).Y0();
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

    private da1(ArrayList<Object> arrayList) {
        this.b = arrayList;
    }
}
