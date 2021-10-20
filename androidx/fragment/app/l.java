package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.p;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import vigqyno.C0201;

/* compiled from: FragmentManagerViewModel */
public class l extends p {
    private static final q.a h = new a();
    private final HashSet<Fragment> b = new HashSet<>();
    private final HashMap<String, l> c = new HashMap<>();
    private final HashMap<String, r> d = new HashMap<>();
    private final boolean e;
    private boolean f = false;
    private boolean g = false;

    /* compiled from: FragmentManagerViewModel */
    static class a implements q.a {
        @Override // androidx.lifecycle.q.a
        public <T extends p> T a(Class<T> cls) {
            return new l(true);
        }
    }

    public l(boolean z) {
        this.e = z;
    }

    public static l g(r rVar) {
        return (l) new q(rVar, h).a(l.class);
    }

    @Override // androidx.lifecycle.p
    public void c() {
        if (j.K) {
            Log.d(C0201.m82(18467), C0201.m82(18466) + this);
        }
        this.f = true;
    }

    public boolean d(Fragment fragment) {
        return this.b.add(fragment);
    }

    public void e(Fragment fragment) {
        if (j.K) {
            Log.d(C0201.m82(18469), C0201.m82(18468) + fragment);
        }
        l lVar = this.c.get(fragment.mWho);
        if (lVar != null) {
            lVar.c();
            this.c.remove(fragment.mWho);
        }
        r rVar = this.d.get(fragment.mWho);
        if (rVar != null) {
            rVar.a();
            this.d.remove(fragment.mWho);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        if (!this.b.equals(lVar.b) || !this.c.equals(lVar.c) || !this.d.equals(lVar.d)) {
            return false;
        }
        return true;
    }

    public l f(Fragment fragment) {
        l lVar = this.c.get(fragment.mWho);
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this.e);
        this.c.put(fragment.mWho, lVar2);
        return lVar2;
    }

    public Collection<Fragment> h() {
        return this.b;
    }

    public int hashCode() {
        return (((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public r i(Fragment fragment) {
        r rVar = this.d.get(fragment.mWho);
        if (rVar != null) {
            return rVar;
        }
        r rVar2 = new r();
        this.d.put(fragment.mWho, rVar2);
        return rVar2;
    }

    public boolean j() {
        return this.f;
    }

    public boolean k(Fragment fragment) {
        return this.b.remove(fragment);
    }

    public boolean l(Fragment fragment) {
        if (!this.b.contains(fragment)) {
            return true;
        }
        if (this.e) {
            return this.f;
        }
        return !this.g;
    }

    public String toString() {
        String r3;
        StringBuilder sb = new StringBuilder(C0201.m82(18470));
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(C0201.m82(18471));
        Iterator<Fragment> it = this.b.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            r3 = C0201.m82(18472);
            if (!hasNext) {
                break;
            }
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(r3);
            }
        }
        sb.append(C0201.m82(18473));
        Iterator<String> it2 = this.c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(r3);
            }
        }
        sb.append(C0201.m82(18474));
        Iterator<String> it3 = this.d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(r3);
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
