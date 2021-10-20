package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: vm  reason: default package */
/* compiled from: ActivityFragmentLifecycle */
public class vm implements cn {
    private final Set<dn> a = Collections.newSetFromMap(new WeakHashMap());
    private boolean b;
    private boolean c;

    @Override // defpackage.cn
    public void a(dn dnVar) {
        this.a.add(dnVar);
        if (this.c) {
            dnVar.onDestroy();
        } else if (this.b) {
            dnVar.onStart();
        } else {
            dnVar.onStop();
        }
    }

    @Override // defpackage.cn
    public void b(dn dnVar) {
        this.a.remove(dnVar);
    }

    public void c() {
        this.c = true;
        for (dn dnVar : fp.i(this.a)) {
            dnVar.onDestroy();
        }
    }

    public void d() {
        this.b = true;
        for (dn dnVar : fp.i(this.a)) {
            dnVar.onStart();
        }
    }

    public void e() {
        this.b = false;
        for (dn dnVar : fp.i(this.a)) {
            dnVar.onStop();
        }
    }
}
