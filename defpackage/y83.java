package defpackage;

import defpackage.d93;
import defpackage.f93;
import defpackage.g93;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;
import vigqyno.C0201;

/* renamed from: y83  reason: default package */
/* compiled from: BDS */
public final class y83 implements Serializable {
    private transient h93 a;
    private final int b;
    private final List<a93> c;
    private int d;
    private p93 e;
    private List<p93> f;
    private Map<Integer, LinkedList<p93>> g;
    private Stack<p93> h;
    private Map<Integer, p93> i;
    private int j;
    private boolean k;

    public y83(s93 s93, int i2) {
        this(s93.f(), s93.d(), s93.e());
        this.j = i2;
        this.k = true;
    }

    private a93 a() {
        a93 a93 = null;
        for (a93 a932 : this.c) {
            if (!a932.e() && a932.f()) {
                if (a93 == null || a932.a() < a93.a() || (a932.a() == a93.a() && a932.b() < a93.b())) {
                    a93 = a932;
                }
            }
        }
        return a93;
    }

    private void d(byte[] bArr, byte[] bArr2, g93 g93) {
        if (g93 != null) {
            f93 f93 = (f93) ((f93.b) ((f93.b) new f93.b().g(g93.b())).h(g93.c())).l();
            d93 d93 = (d93) ((d93.b) ((d93.b) new d93.b().g(g93.b())).h(g93.c())).k();
            for (int i2 = 0; i2 < (1 << this.b); i2++) {
                g93.b bVar = (g93.b) ((g93.b) new g93.b().g(g93.b())).h(g93.c());
                bVar.p(i2);
                bVar.n(g93.e());
                bVar.o(g93.f());
                g93 = (g93) ((g93.b) bVar.f(g93.a())).l();
                h93 h93 = this.a;
                h93.h(h93.g(bArr2, g93), bArr);
                k93 e2 = this.a.e(g93);
                f93.b bVar2 = (f93.b) ((f93.b) new f93.b().g(f93.b())).h(f93.c());
                bVar2.n(i2);
                bVar2.o(f93.f());
                bVar2.p(f93.g());
                f93 = (f93) ((f93.b) bVar2.f(f93.a())).l();
                p93 a2 = q93.a(this.a, e2, f93);
                d93.b bVar3 = (d93.b) ((d93.b) new d93.b().g(d93.b())).h(d93.c());
                bVar3.n(i2);
                d93 = (d93) ((d93.b) bVar3.f(d93.a())).k();
                while (!this.h.isEmpty() && this.h.peek().b() == a2.b()) {
                    int floor = (int) Math.floor((double) (i2 / (1 << a2.b())));
                    if (floor == 1) {
                        this.f.add(a2.clone());
                    }
                    if (floor == 3 && a2.b() < this.b - this.d) {
                        this.c.get(a2.b()).g(a2.clone());
                    }
                    if (floor >= 3 && (floor & 1) == 1 && a2.b() >= this.b - this.d && a2.b() <= this.b - 2) {
                        if (this.g.get(Integer.valueOf(a2.b())) == null) {
                            LinkedList<p93> linkedList = new LinkedList<>();
                            linkedList.add(a2.clone());
                            this.g.put(Integer.valueOf(a2.b()), linkedList);
                        } else {
                            this.g.get(Integer.valueOf(a2.b())).add(a2.clone());
                        }
                    }
                    d93.b bVar4 = (d93.b) ((d93.b) new d93.b().g(d93.b())).h(d93.c());
                    bVar4.m(d93.e());
                    bVar4.n((d93.f() - 1) / 2);
                    d93 d932 = (d93) ((d93.b) bVar4.f(d93.a())).k();
                    p93 b2 = q93.b(this.a, this.h.pop(), a2, d932);
                    p93 p93 = new p93(b2.b() + 1, b2.c());
                    d93.b bVar5 = (d93.b) ((d93.b) new d93.b().g(d932.b())).h(d932.c());
                    bVar5.m(d932.e() + 1);
                    bVar5.n(d932.f());
                    d93 = (d93) ((d93.b) bVar5.f(d932.a())).k();
                    a2 = p93;
                }
                this.h.push(a2);
            }
            this.e = this.h.pop();
            return;
        }
        throw new NullPointerException(C0201.m82(14977));
    }

    private void e(byte[] bArr, byte[] bArr2, g93 g93) {
        if (g93 == null) {
            throw new NullPointerException(C0201.m82(14980));
        } else if (this.k) {
            throw new IllegalStateException(C0201.m82(14979));
        } else if (this.j <= (1 << this.b) - 2) {
            f93 f93 = (f93) ((f93.b) ((f93.b) new f93.b().g(g93.b())).h(g93.c())).l();
            d93 d93 = (d93) ((d93.b) ((d93.b) new d93.b().g(g93.b())).h(g93.c())).k();
            int b2 = v93.b(this.j, this.b);
            if (((this.j >> (b2 + 1)) & 1) == 0 && b2 < this.b - 1) {
                this.i.put(Integer.valueOf(b2), this.f.get(b2).clone());
            }
            if (b2 == 0) {
                g93.b bVar = (g93.b) ((g93.b) new g93.b().g(g93.b())).h(g93.c());
                bVar.p(this.j);
                bVar.n(g93.e());
                bVar.o(g93.f());
                g93 = (g93) ((g93.b) bVar.f(g93.a())).l();
                h93 h93 = this.a;
                h93.h(h93.g(bArr2, g93), bArr);
                k93 e2 = this.a.e(g93);
                f93.b bVar2 = (f93.b) ((f93.b) new f93.b().g(f93.b())).h(f93.c());
                bVar2.n(this.j);
                bVar2.o(f93.f());
                bVar2.p(f93.g());
                this.f.set(0, q93.a(this.a, e2, (f93) ((f93.b) bVar2.f(f93.a())).l()));
            } else {
                d93.b bVar3 = (d93.b) ((d93.b) new d93.b().g(d93.b())).h(d93.c());
                int i2 = b2 - 1;
                bVar3.m(i2);
                bVar3.n(this.j >> b2);
                p93 b3 = q93.b(this.a, this.f.get(i2), this.i.get(Integer.valueOf(i2)), (d93) ((d93.b) bVar3.f(d93.a())).k());
                this.f.set(b2, new p93(b3.b() + 1, b3.c()));
                this.i.remove(Integer.valueOf(i2));
                for (int i3 = 0; i3 < b2; i3++) {
                    if (i3 < this.b - this.d) {
                        this.f.set(i3, this.c.get(i3).c());
                    } else {
                        this.f.set(i3, this.g.get(Integer.valueOf(i3)).removeFirst());
                    }
                }
                int min = Math.min(b2, this.b - this.d);
                for (int i4 = 0; i4 < min; i4++) {
                    int i5 = this.j + 1 + ((1 << i4) * 3);
                    if (i5 < (1 << this.b)) {
                        this.c.get(i4).d(i5);
                    }
                }
            }
            for (int i6 = 0; i6 < ((this.b - this.d) >> 1); i6++) {
                a93 a2 = a();
                if (a2 != null) {
                    a2.h(this.h, this.a, bArr, bArr2, g93);
                }
            }
            this.j++;
        } else {
            throw new IllegalStateException(C0201.m82(14978));
        }
    }

    public int b() {
        return this.j;
    }

    public y83 c(byte[] bArr, byte[] bArr2, g93 g93) {
        return new y83(this, bArr, bArr2, g93);
    }

    public void f(s93 s93) {
        if (this.b == s93.d()) {
            this.a = s93.f();
            return;
        }
        throw new IllegalStateException(C0201.m82(14981));
    }

    public void g() {
        if (this.f == null) {
            throw new IllegalStateException(C0201.m82(14987));
        } else if (this.g == null) {
            throw new IllegalStateException(C0201.m82(14986));
        } else if (this.h == null) {
            throw new IllegalStateException(C0201.m82(14985));
        } else if (this.c == null) {
            throw new IllegalStateException(C0201.m82(14984));
        } else if (this.i == null) {
            throw new IllegalStateException(C0201.m82(14983));
        } else if (!v93.l(this.b, (long) this.j)) {
            throw new IllegalStateException(C0201.m82(14982));
        }
    }

    public y83(s93 s93, byte[] bArr, byte[] bArr2, g93 g93) {
        this(s93.f(), s93.d(), s93.e());
        d(bArr, bArr2, g93);
    }

    public y83(s93 s93, byte[] bArr, byte[] bArr2, g93 g93, int i2) {
        this(s93.f(), s93.d(), s93.e());
        d(bArr, bArr2, g93);
        while (this.j < i2) {
            e(bArr, bArr2, g93);
            this.k = false;
        }
    }

    private y83(h93 h93, int i2, int i3) {
        this.a = h93;
        this.b = i2;
        this.d = i3;
        if (i3 <= i2 && i3 >= 2) {
            int i4 = i2 - i3;
            if (i4 % 2 == 0) {
                this.f = new ArrayList();
                this.g = new TreeMap();
                this.h = new Stack<>();
                this.c = new ArrayList();
                for (int i5 = 0; i5 < i4; i5++) {
                    this.c.add(new a93(i5));
                }
                this.i = new TreeMap();
                this.j = 0;
                this.k = false;
                return;
            }
        }
        throw new IllegalArgumentException(C0201.m82(14976));
    }

    private y83(y83 y83, byte[] bArr, byte[] bArr2, g93 g93) {
        this.a = y83.a;
        this.b = y83.b;
        this.d = y83.d;
        this.e = y83.e;
        this.f = new ArrayList(y83.f);
        this.g = y83.g;
        this.h = (Stack) y83.h.clone();
        this.c = y83.c;
        this.i = new TreeMap(y83.i);
        this.j = y83.j;
        e(bArr, bArr2, g93);
        y83.k = true;
    }
}
