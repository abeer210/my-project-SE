package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: kn  reason: default package */
/* compiled from: TargetTracker */
public final class kn implements dn {
    private final Set<no<?>> a = Collections.newSetFromMap(new WeakHashMap());

    public void i() {
        this.a.clear();
    }

    public List<no<?>> j() {
        return fp.i(this.a);
    }

    public void k(no<?> noVar) {
        this.a.add(noVar);
    }

    public void l(no<?> noVar) {
        this.a.remove(noVar);
    }

    @Override // defpackage.dn
    public void onDestroy() {
        for (no noVar : fp.i(this.a)) {
            noVar.onDestroy();
        }
    }

    @Override // defpackage.dn
    public void onStart() {
        for (no noVar : fp.i(this.a)) {
            noVar.onStart();
        }
    }

    @Override // defpackage.dn
    public void onStop() {
        for (no noVar : fp.i(this.a)) {
            noVar.onStop();
        }
    }
}
