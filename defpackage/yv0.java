package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: yv0  reason: default package */
public final class yv0 extends yt0<String> implements zv0, RandomAccess {
    private static final yv0 c;
    private final List<Object> b;

    static {
        yv0 yv0 = new yv0();
        c = yv0;
        yv0.L0();
    }

    public yv0() {
        this(10);
    }

    public yv0(int i) {
        this(new ArrayList(i));
    }

    private yv0(ArrayList<Object> arrayList) {
        this.b = arrayList;
    }

    private static String b(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof fu0 ? ((fu0) obj).o() : mv0.h((byte[]) obj);
    }

    @Override // defpackage.pv0
    public final /* synthetic */ pv0 B0(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.b);
            return new yv0(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.zv0
    public final List<?> K() {
        return Collections.unmodifiableList(this.b);
    }

    @Override // defpackage.zv0
    public final zv0 W0() {
        return E0() ? new ey0(this) : this;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ void add(int i, Object obj) {
        a();
        this.b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.List, defpackage.yt0, java.util.AbstractList
    public final boolean addAll(int i, Collection<? extends String> collection) {
        a();
        if (collection instanceof zv0) {
            collection = ((zv0) collection).K();
        }
        boolean addAll = this.b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // java.util.AbstractCollection, java.util.List, defpackage.yt0, java.util.Collection
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // defpackage.yt0
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
        if (obj instanceof fu0) {
            fu0 fu0 = (fu0) obj;
            String o = fu0.o();
            if (fu0.e()) {
                this.b.set(i, o);
            }
            return o;
        }
        byte[] bArr = (byte[]) obj;
        String h = mv0.h(bArr);
        if (mv0.g(bArr)) {
            this.b.set(i, h);
        }
        return h;
    }

    @Override // defpackage.zv0
    public final Object m(int i) {
        return this.b.get(i);
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object remove(int i) {
        a();
        Object remove = this.b.remove(i);
        ((AbstractList) this).modCount++;
        return b(remove);
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object set(int i, Object obj) {
        a();
        return b(this.b.set(i, (String) obj));
    }

    public final int size() {
        return this.b.size();
    }
}
