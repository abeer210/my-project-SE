package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import vigqyno.C0201;

/* renamed from: wr  reason: default package */
/* compiled from: Metadata */
public final class wr {
    private final List<tr> a = new ArrayList();

    public <T extends tr> void a(T t) {
        this.a.add(t);
    }

    public Iterable<tr> b() {
        return this.a;
    }

    public <T extends tr> Collection<T> c(Class<T> cls) {
        ArrayList arrayList = new ArrayList();
        for (tr trVar : this.a) {
            if (cls.isAssignableFrom(trVar.getClass())) {
                arrayList.add(trVar);
            }
        }
        return arrayList;
    }

    public int d() {
        return this.a.size();
    }

    public <T extends tr> T e(Class<T> cls) {
        Iterator<tr> it = this.a.iterator();
        while (it.hasNext()) {
            T t = (T) it.next();
            if (cls.isAssignableFrom(t.getClass())) {
                return t;
            }
        }
        return null;
    }

    public String toString() {
        int d = d();
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(d);
        objArr[1] = d == 1 ? C0201.m82(15440) : C0201.m82(15441);
        return String.format(C0201.m82(15442), objArr);
    }
}
