package androidx.coordinatorlayout.widget;

import androidx.core.util.Pools$SimplePool;
import androidx.core.util.e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import vigqyno.C0201;

/* compiled from: DirectedAcyclicGraph */
public final class a<T> {
    private final e<ArrayList<T>> a = new Pools$SimplePool(10);
    private final x0<T, ArrayList<T>> b = new x0<>();
    private final ArrayList<T> c = new ArrayList<>();
    private final HashSet<T> d = new HashSet<>();

    private void e(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t)) {
            if (!hashSet.contains(t)) {
                hashSet.add(t);
                ArrayList<T> arrayList2 = this.b.get(t);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        e(arrayList2.get(i), arrayList, hashSet);
                    }
                }
                hashSet.remove(t);
                arrayList.add(t);
                return;
            }
            throw new RuntimeException(C0201.m82(28772));
        }
    }

    private ArrayList<T> f() {
        ArrayList<T> b2 = this.a.b();
        return b2 == null ? new ArrayList<>() : b2;
    }

    private void k(ArrayList<T> arrayList) {
        arrayList.clear();
        this.a.a(arrayList);
    }

    public void a(T t, T t2) {
        if (!this.b.containsKey(t) || !this.b.containsKey(t2)) {
            throw new IllegalArgumentException(C0201.m82(28773));
        }
        ArrayList<T> arrayList = this.b.get(t);
        if (arrayList == null) {
            arrayList = f();
            this.b.put(t, arrayList);
        }
        arrayList.add(t2);
    }

    public void b(T t) {
        if (!this.b.containsKey(t)) {
            this.b.put(t, null);
        }
    }

    public void c() {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> m = this.b.m(i);
            if (m != null) {
                k(m);
            }
        }
        this.b.clear();
    }

    public boolean d(T t) {
        return this.b.containsKey(t);
    }

    public List g(T t) {
        return this.b.get(t);
    }

    public List<T> h(T t) {
        int size = this.b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList<T> m = this.b.m(i);
            if (m != null && m.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.b.i(i));
            }
        }
        return arrayList;
    }

    public ArrayList<T> i() {
        this.c.clear();
        this.d.clear();
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            e(this.b.i(i), this.c, this.d);
        }
        return this.c;
    }

    public boolean j(T t) {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> m = this.b.m(i);
            if (m != null && m.contains(t)) {
                return true;
            }
        }
        return false;
    }
}
