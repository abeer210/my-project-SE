package defpackage;

import defpackage.d93;
import defpackage.f93;
import defpackage.g93;
import java.io.Serializable;
import java.util.Stack;
import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: a93  reason: default package */
/* compiled from: BDSTreeHash */
public class a93 implements Serializable {
    private p93 a;
    private final int b;
    private int c;
    private int d;
    private boolean e = false;
    private boolean f = false;

    public a93(int i) {
        this.b = i;
    }

    public int a() {
        return (!this.e || this.f) ? C0188.f24 : this.c;
    }

    public int b() {
        return this.d;
    }

    public p93 c() {
        return this.a.clone();
    }

    public void d(int i) {
        this.a = null;
        this.c = this.b;
        this.d = i;
        this.e = true;
        this.f = false;
    }

    public boolean e() {
        return this.f;
    }

    public boolean f() {
        return this.e;
    }

    public void g(p93 p93) {
        this.a = p93;
        int b2 = p93.b();
        this.c = b2;
        if (b2 == this.b) {
            this.f = true;
        }
    }

    public void h(Stack<p93> stack, h93 h93, byte[] bArr, byte[] bArr2, g93 g93) {
        if (g93 == null) {
            throw new NullPointerException(C0201.m82(27409));
        } else if (this.f || !this.e) {
            throw new IllegalStateException(C0201.m82(27408));
        } else {
            g93.b bVar = (g93.b) ((g93.b) new g93.b().g(g93.b())).h(g93.c());
            bVar.p(this.d);
            bVar.n(g93.e());
            bVar.o(g93.f());
            g93 g932 = (g93) ((g93.b) bVar.f(g93.a())).l();
            f93.b bVar2 = (f93.b) ((f93.b) new f93.b().g(g932.b())).h(g932.c());
            bVar2.n(this.d);
            d93.b bVar3 = (d93.b) ((d93.b) new d93.b().g(g932.b())).h(g932.c());
            bVar3.n(this.d);
            d93 d93 = (d93) bVar3.k();
            h93.h(h93.g(bArr2, g932), bArr);
            p93 a2 = q93.a(h93, h93.e(g932), (f93) bVar2.l());
            while (!stack.isEmpty() && stack.peek().b() == a2.b() && stack.peek().b() != this.b) {
                d93.b bVar4 = (d93.b) ((d93.b) new d93.b().g(d93.b())).h(d93.c());
                bVar4.m(d93.e());
                bVar4.n((d93.f() - 1) / 2);
                d93 d932 = (d93) ((d93.b) bVar4.f(d93.a())).k();
                p93 b2 = q93.b(h93, stack.pop(), a2, d932);
                p93 p93 = new p93(b2.b() + 1, b2.c());
                d93.b bVar5 = (d93.b) ((d93.b) new d93.b().g(d932.b())).h(d932.c());
                bVar5.m(d932.e() + 1);
                bVar5.n(d932.f());
                d93 = (d93) ((d93.b) bVar5.f(d932.a())).k();
                a2 = p93;
            }
            p93 p932 = this.a;
            if (p932 == null) {
                this.a = a2;
            } else if (p932.b() == a2.b()) {
                d93.b bVar6 = (d93.b) ((d93.b) new d93.b().g(d93.b())).h(d93.c());
                bVar6.m(d93.e());
                bVar6.n((d93.f() - 1) / 2);
                d93 d933 = (d93) ((d93.b) bVar6.f(d93.a())).k();
                a2 = new p93(this.a.b() + 1, q93.b(h93, this.a, a2, d933).c());
                this.a = a2;
                d93.b bVar7 = (d93.b) ((d93.b) new d93.b().g(d933.b())).h(d933.c());
                bVar7.m(d933.e() + 1);
                bVar7.n(d933.f());
                d93 d934 = (d93) ((d93.b) bVar7.f(d933.a())).k();
            } else {
                stack.push(a2);
            }
            if (this.a.b() == this.b) {
                this.f = true;
                return;
            }
            this.c = a2.b();
            this.d++;
        }
    }
}
