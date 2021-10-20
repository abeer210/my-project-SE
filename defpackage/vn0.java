package defpackage;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/* renamed from: vn0  reason: default package */
/* compiled from: SizeMap */
public class vn0 {
    private final r0<ln0, SortedSet<un0>> a = new r0<>();

    public boolean a(un0 un0) {
        for (ln0 ln0 : this.a.keySet()) {
            if (ln0.h(un0)) {
                SortedSet<un0> sortedSet = this.a.get(ln0);
                if (sortedSet.contains(un0)) {
                    return false;
                }
                sortedSet.add(un0);
                return true;
            }
        }
        TreeSet treeSet = new TreeSet();
        treeSet.add(un0);
        this.a.put(ln0.i(un0.e(), un0.d()), treeSet);
        return true;
    }

    public void b() {
        this.a.clear();
    }

    public boolean c() {
        return this.a.isEmpty();
    }

    public Set<ln0> d() {
        return this.a.keySet();
    }

    public void e(ln0 ln0) {
        this.a.remove(ln0);
    }

    public SortedSet<un0> f(ln0 ln0) {
        return this.a.get(ln0);
    }
}
