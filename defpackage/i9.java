package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
import vigqyno.C0201;

/* renamed from: i9  reason: default package */
public class i9 implements u8 {
    private u9 a;
    private String b = null;
    public boolean c = false;
    private Iterator d = null;

    /* renamed from: i9$a */
    private class a implements Iterator {
        private int a = 0;
        private l9 b;
        private String c;
        private Iterator d = null;
        private int e = 0;
        private Iterator f = Collections.EMPTY_LIST.iterator();
        private z9 g = null;

        /* access modifiers changed from: package-private */
        /* renamed from: i9$a$a  reason: collision with other inner class name */
        public class C0140a implements z9 {
            public final /* synthetic */ String a;
            public final /* synthetic */ String b;

            public C0140a(a aVar, l9 l9Var, String str, String str2, String str3) {
                this.a = str2;
                this.b = str3;
            }

            @Override // defpackage.z9
            public String a() {
                return this.a;
            }

            @Override // defpackage.z9
            public String getValue() {
                return this.b;
            }
        }

        public a() {
        }

        public a(l9 l9Var, String str, int i) {
            this.b = l9Var;
            this.a = 0;
            if (l9Var.v().o()) {
                i9.this.c(l9Var.t());
            }
            this.c = a(l9Var, str, i);
        }

        private boolean d(Iterator it) {
            i9 i9Var = i9.this;
            if (i9Var.c) {
                i9Var.c = false;
                this.f = Collections.EMPTY_LIST.iterator();
            }
            if (!this.f.hasNext() && it.hasNext()) {
                int i = this.e + 1;
                this.e = i;
                this.f = new a((l9) it.next(), this.c, i);
            }
            if (!this.f.hasNext()) {
                return false;
            }
            this.g = (z9) this.f.next();
            return true;
        }

        public String a(l9 l9Var, String str, int i) {
            String str2;
            String str3;
            if (l9Var.x() == null || l9Var.v().o()) {
                return null;
            }
            if (l9Var.x().v().i()) {
                str3 = C0201.m82(26606) + String.valueOf(i) + C0201.m82(26607);
                str2 = C0201.m82(26608);
            } else {
                str3 = l9Var.t();
                str2 = C0201.m82(26609);
            }
            if (str == null || str.length() == 0) {
                return str3;
            }
            if (i9.this.b().i()) {
                return !str3.startsWith(C0201.m82(26610)) ? str3 : str3.substring(1);
            }
            return str + str2 + str3;
        }

        public z9 b(l9 l9Var, String str, String str2) {
            return new C0140a(this, l9Var, str, str2, l9Var.v().o() ? null : l9Var.I());
        }

        public z9 c() {
            return this.g;
        }

        public boolean e() {
            this.a = 1;
            if (this.b.x() == null || (i9.this.b().j() && this.b.J())) {
                return hasNext();
            }
            this.g = b(this.b, i9.this.a(), this.c);
            return true;
        }

        public void f(z9 z9Var) {
            this.g = z9Var;
        }

        public boolean hasNext() {
            if (this.g != null) {
                return true;
            }
            int i = this.a;
            if (i == 0) {
                return e();
            }
            if (i == 1) {
                if (this.d == null) {
                    this.d = this.b.S();
                }
                boolean d2 = d(this.d);
                if (d2 || !this.b.K() || i9.this.b().k()) {
                    return d2;
                }
                this.a = 2;
                this.d = null;
                return hasNext();
            }
            if (this.d == null) {
                this.d = this.b.U();
            }
            return d(this.d);
        }

        @Override // java.util.Iterator
        public Object next() {
            if (hasNext()) {
                z9 z9Var = this.g;
                this.g = null;
                return z9Var;
            }
            throw new NoSuchElementException(C0201.m82(26611));
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: i9$b */
    private class b extends a {
        private String i;
        private Iterator j;
        private int k = 0;

        public b(l9 l9Var, String str) {
            super();
            if (l9Var.v().o()) {
                i9.this.c(l9Var.t());
            }
            this.i = a(l9Var, str, 1);
            this.j = l9Var.S();
        }

        @Override // defpackage.i9.a
        public boolean hasNext() {
            if (c() != null) {
                return true;
            }
            if (i9.this.c || !this.j.hasNext()) {
                return false;
            }
            l9 l9Var = (l9) this.j.next();
            this.k++;
            String str = null;
            if (l9Var.v().o()) {
                i9.this.c(l9Var.t());
            } else if (l9Var.x() != null) {
                str = a(l9Var, this.i, this.k);
            }
            if (i9.this.b().j() && l9Var.J()) {
                return hasNext();
            }
            f(b(l9Var, i9.this.a(), str));
            return true;
        }
    }

    public i9(j9 j9Var, String str, String str2, u9 u9Var) throws t8 {
        l9 l9Var;
        String str3 = null;
        this.a = u9Var == null ? new u9() : u9Var;
        boolean z = str != null && str.length() > 0;
        boolean z2 = str2 != null && str2.length() > 0;
        if (!z && !z2) {
            l9Var = j9Var.a();
        } else if (z && z2) {
            q9 a2 = r9.a(str, str2);
            q9 q9Var = new q9();
            for (int i = 0; i < a2.c() - 1; i++) {
                q9Var.a(a2.b(i));
            }
            l9Var = m9.g(j9Var.a(), a2, false, null);
            this.b = str;
            str3 = q9Var.toString();
        } else if (!z || z2) {
            throw new t8(C0201.m82(18415), 101);
        } else {
            l9Var = m9.j(j9Var.a(), str, false);
        }
        if (l9Var != null) {
            this.d = !this.a.h() ? new a(l9Var, str3, 1) : new b(l9Var, str3);
        } else {
            this.d = Collections.EMPTY_LIST.iterator();
        }
    }

    public String a() {
        return this.b;
    }

    public u9 b() {
        return this.a;
    }

    public void c(String str) {
        this.b = str;
    }

    public boolean hasNext() {
        return this.d.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        return this.d.next();
    }

    public void remove() {
        throw new UnsupportedOperationException(C0201.m82(18416));
    }
}
