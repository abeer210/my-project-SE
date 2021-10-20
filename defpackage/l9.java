package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import vigqyno.C0201;

/* renamed from: l9  reason: default package */
public class l9 implements Comparable {
    private String a;
    private String b;
    private l9 c;
    private List d;
    private List e;
    private x9 f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;

    /* access modifiers changed from: package-private */
    /* renamed from: l9$a */
    public class a implements Iterator {
        public final /* synthetic */ Iterator a;

        public a(l9 l9Var, Iterator it) {
            this.a = it;
        }

        public boolean hasNext() {
            return this.a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return this.a.next();
        }

        public void remove() {
            throw new UnsupportedOperationException(C0201.m82(31136));
        }
    }

    public l9(String str, String str2, x9 x9Var) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.a = str;
        this.b = str2;
        this.f = x9Var;
    }

    public l9(String str, x9 x9Var) {
        this(str, null, x9Var);
    }

    private List C() {
        if (this.e == null) {
            this.e = new ArrayList(0);
        }
        return this.e;
    }

    private boolean N() {
        return C0201.m82(26582).equals(this.a);
    }

    private boolean O() {
        return C0201.m82(26583).equals(this.a);
    }

    private void f(String str) throws t8 {
        if (!C0201.m82(26584).equals(str) && k(str) != null) {
            throw new t8(C0201.m82(26585) + str + C0201.m82(26586), 203);
        }
    }

    private void g(String str) throws t8 {
        if (!C0201.m82(26587).equals(str) && l(str) != null) {
            throw new t8(C0201.m82(26588) + str + C0201.m82(26589), 203);
        }
    }

    private l9 j(List list, String str) {
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l9 l9Var = (l9) it.next();
            if (l9Var.t().equals(str)) {
                return l9Var;
            }
        }
        return null;
    }

    private List n() {
        if (this.d == null) {
            this.d = new ArrayList(0);
        }
        return this.d;
    }

    public l9 A(int i2) {
        return (l9) C().get(i2 - 1);
    }

    public int E() {
        List list = this.e;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public List H() {
        return Collections.unmodifiableList(new ArrayList(n()));
    }

    public String I() {
        return this.b;
    }

    public boolean J() {
        List list = this.d;
        return list != null && list.size() > 0;
    }

    public boolean K() {
        List list = this.e;
        return list != null && list.size() > 0;
    }

    public boolean L() {
        return this.i;
    }

    public boolean M() {
        return this.g;
    }

    public Iterator S() {
        return this.d != null ? n().iterator() : Collections.EMPTY_LIST.listIterator();
    }

    public Iterator U() {
        return this.e != null ? new a(this, C().iterator()) : Collections.EMPTY_LIST.iterator();
    }

    public void W(int i2) {
        n().remove(i2 - 1);
        h();
    }

    public void X(l9 l9Var) {
        n().remove(l9Var);
        h();
    }

    public void Y() {
        this.d = null;
    }

    public void Z(l9 l9Var) {
        x9 v = v();
        if (l9Var.N()) {
            v.w(false);
        } else if (l9Var.O()) {
            v.y(false);
        }
        C().remove(l9Var);
        if (this.e.isEmpty()) {
            v.x(false);
            this.e = null;
        }
    }

    public void a0() {
        x9 v = v();
        v.x(false);
        v.w(false);
        v.y(false);
        this.e = null;
    }

    public void b(int i2, l9 l9Var) throws t8 {
        f(l9Var.t());
        l9Var.n0(this);
        n().add(i2 - 1, l9Var);
    }

    public void b0(int i2, l9 l9Var) {
        l9Var.n0(this);
        n().set(i2 - 1, l9Var);
    }

    public void c0(boolean z) {
        this.i = z;
    }

    @Override // java.lang.Object
    public Object clone() {
        x9 x9Var;
        try {
            x9Var = new x9(v().d());
        } catch (t8 unused) {
            x9Var = new x9();
        }
        l9 l9Var = new l9(this.a, this.b, x9Var);
        i(l9Var);
        return l9Var;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        String str;
        String t;
        if (v().o()) {
            str = this.b;
            t = ((l9) obj).I();
        } else {
            str = this.a;
            t = ((l9) obj).t();
        }
        return str.compareTo(t);
    }

    public void d(l9 l9Var) throws t8 {
        f(l9Var.t());
        l9Var.n0(this);
        n().add(l9Var);
    }

    public void e(l9 l9Var) throws t8 {
        List C;
        boolean h2;
        g(l9Var.t());
        l9Var.n0(this);
        l9Var.v().z(true);
        v().x(true);
        if (l9Var.N()) {
            this.f.w(true);
            C = C();
            h2 = false;
        } else if (l9Var.O()) {
            this.f.y(true);
            C = C();
            h2 = this.f.h();
        } else {
            C().add(l9Var);
            return;
        }
        int i2 = h2 ? 1 : 0;
        int i3 = h2 ? 1 : 0;
        int i4 = h2 ? 1 : 0;
        C.add(i2, l9Var);
    }

    public void g0(boolean z) {
        this.h = z;
    }

    public void h() {
        if (this.d.isEmpty()) {
            this.d = null;
        }
    }

    public void h0(boolean z) {
        this.j = z;
    }

    public void i(l9 l9Var) {
        try {
            Iterator S = S();
            while (S.hasNext()) {
                l9Var.d((l9) ((l9) S.next()).clone());
            }
            Iterator U = U();
            while (U.hasNext()) {
                l9Var.e((l9) ((l9) U.next()).clone());
            }
        } catch (t8 unused) {
        }
    }

    public l9 k(String str) {
        return j(n(), str);
    }

    public void k0(boolean z) {
        this.g = z;
    }

    public l9 l(String str) {
        return j(this.e, str);
    }

    public void l0(String str) {
        this.a = str;
    }

    public l9 m(int i2) {
        return (l9) n().get(i2 - 1);
    }

    public void m0(x9 x9Var) {
        this.f = x9Var;
    }

    public void n0(l9 l9Var) {
        this.c = l9Var;
    }

    public void o0(String str) {
        this.b = str;
    }

    public int p() {
        List list = this.d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public boolean q() {
        return this.h;
    }

    public boolean r() {
        return this.j;
    }

    public String t() {
        return this.a;
    }

    public x9 v() {
        if (this.f == null) {
            this.f = new x9();
        }
        return this.f;
    }

    public l9 x() {
        return this.c;
    }
}
