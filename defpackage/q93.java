package defpackage;

import defpackage.d93;
import defpackage.f93;
import vigqyno.C0201;

/* renamed from: q93  reason: default package */
/* compiled from: XMSSNodeUtil */
public class q93 {
    public static p93 a(h93 h93, k93 k93, f93 f93) {
        double d;
        if (k93 == null) {
            throw new NullPointerException(C0201.m82(30546));
        } else if (f93 != null) {
            int c = h93.d().c();
            byte[][] a = k93.a();
            p93[] p93Arr = new p93[a.length];
            for (int i = 0; i < a.length; i++) {
                p93Arr[i] = new p93(0, a[i]);
            }
            f93.b bVar = (f93.b) ((f93.b) new f93.b().g(f93.b())).h(f93.c());
            bVar.n(f93.e());
            bVar.o(0);
            bVar.p(f93.g());
            l93 l = ((f93.b) bVar.f(f93.a())).l();
            while (true) {
                f93 f932 = (f93) l;
                if (c <= 1) {
                    return p93Arr[0];
                }
                int i2 = 0;
                while (true) {
                    d = (double) (c / 2);
                    if (i2 >= ((int) Math.floor(d))) {
                        break;
                    }
                    f93.b bVar2 = (f93.b) ((f93.b) new f93.b().g(f932.b())).h(f932.c());
                    bVar2.n(f932.e());
                    bVar2.o(f932.f());
                    bVar2.p(i2);
                    f932 = (f93) ((f93.b) bVar2.f(f932.a())).l();
                    int i3 = i2 * 2;
                    p93Arr[i2] = b(h93, p93Arr[i3], p93Arr[i3 + 1], f932);
                    i2++;
                }
                if (c % 2 == 1) {
                    p93Arr[(int) Math.floor(d)] = p93Arr[c - 1];
                }
                double d2 = (double) c;
                Double.isNaN(d2);
                c = (int) Math.ceil(d2 / 2.0d);
                f93.b bVar3 = (f93.b) ((f93.b) new f93.b().g(f932.b())).h(f932.c());
                bVar3.n(f932.e());
                bVar3.o(f932.f() + 1);
                bVar3.p(f932.g());
                l = ((f93.b) bVar3.f(f932.a())).l();
            }
        } else {
            throw new NullPointerException(C0201.m82(30545));
        }
    }

    public static p93 b(h93 h93, p93 p93, p93 p932, l93 l93) {
        if (p93 == null) {
            throw new NullPointerException(C0201.m82(30550));
        } else if (p932 == null) {
            throw new NullPointerException(C0201.m82(30549));
        } else if (p93.b() != p932.b()) {
            throw new IllegalStateException(C0201.m82(30548));
        } else if (l93 != null) {
            byte[] f = h93.f();
            if (l93 instanceof f93) {
                f93 f93 = (f93) l93;
                f93.b bVar = (f93.b) ((f93.b) new f93.b().g(f93.b())).h(f93.c());
                bVar.n(f93.e());
                bVar.o(f93.f());
                bVar.p(f93.g());
                l93 = (f93) ((f93.b) bVar.f(0)).l();
            } else if (l93 instanceof d93) {
                d93 d93 = (d93) l93;
                d93.b bVar2 = (d93.b) ((d93.b) new d93.b().g(d93.b())).h(d93.c());
                bVar2.m(d93.e());
                bVar2.n(d93.f());
                l93 = (d93) ((d93.b) bVar2.f(0)).k();
            }
            byte[] c = h93.c().c(f, l93.d());
            if (l93 instanceof f93) {
                f93 f932 = (f93) l93;
                f93.b bVar3 = (f93.b) ((f93.b) new f93.b().g(f932.b())).h(f932.c());
                bVar3.n(f932.e());
                bVar3.o(f932.f());
                bVar3.p(f932.g());
                l93 = (f93) ((f93.b) bVar3.f(1)).l();
            } else if (l93 instanceof d93) {
                d93 d932 = (d93) l93;
                d93.b bVar4 = (d93.b) ((d93.b) new d93.b().g(d932.b())).h(d932.c());
                bVar4.m(d932.e());
                bVar4.n(d932.f());
                l93 = (d93) ((d93.b) bVar4.f(1)).k();
            }
            byte[] c2 = h93.c().c(f, l93.d());
            if (l93 instanceof f93) {
                f93 f933 = (f93) l93;
                f93.b bVar5 = (f93.b) ((f93.b) new f93.b().g(f933.b())).h(f933.c());
                bVar5.n(f933.e());
                bVar5.o(f933.f());
                bVar5.p(f933.g());
                l93 = (f93) ((f93.b) bVar5.f(2)).l();
            } else if (l93 instanceof d93) {
                d93 d933 = (d93) l93;
                d93.b bVar6 = (d93.b) ((d93.b) new d93.b().g(d933.b())).h(d933.c());
                bVar6.m(d933.e());
                bVar6.n(d933.f());
                l93 = (d93) ((d93.b) bVar6.f(2)).k();
            }
            byte[] c3 = h93.c().c(f, l93.d());
            int b = h93.d().b();
            byte[] bArr = new byte[(b * 2)];
            for (int i = 0; i < b; i++) {
                bArr[i] = (byte) (p93.c()[i] ^ c2[i]);
            }
            for (int i2 = 0; i2 < b; i2++) {
                bArr[i2 + b] = (byte) (p932.c()[i2] ^ c3[i2]);
            }
            return new p93(p93.b(), h93.c().b(c, bArr));
        } else {
            throw new NullPointerException(C0201.m82(30547));
        }
    }
}
