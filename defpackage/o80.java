package defpackage;

import android.graphics.Rect;
import com.facebook.common.time.b;
import java.util.LinkedList;
import java.util.List;

/* renamed from: o80  reason: default package */
/* compiled from: ImagePerfMonitor */
public class o80 {
    private final d80 a;
    private final b b;
    private final p80 c = new p80();
    private k80 d;
    private j80 e;
    private s80 f;
    private q80 g;
    private ff0 h;
    private List<n80> i;
    private boolean j;

    public o80(b bVar, d80 d80) {
        this.b = bVar;
        this.a = d80;
    }

    private void h() {
        if (this.g == null) {
            this.g = new q80(this.b, this.c, this);
        }
        if (this.f == null) {
            this.f = new s80(this.b, this.c);
        }
        if (this.e == null) {
            this.e = new r80(this.c, this);
        }
        k80 k80 = this.d;
        if (k80 == null) {
            this.d = new k80(this.a.r(), this.e);
        } else {
            k80.l(this.a.r());
        }
        if (this.h == null) {
            this.h = new ff0(this.f, this.d);
        }
    }

    public void a(n80 n80) {
        if (n80 != null) {
            if (this.i == null) {
                this.i = new LinkedList();
            }
            this.i.add(n80);
        }
    }

    public void b() {
        ja0 c2 = this.a.c();
        if (c2 != null && c2.f() != null) {
            Rect bounds = c2.f().getBounds();
            this.c.r(bounds.width());
            this.c.q(bounds.height());
        }
    }

    public void c() {
        List<n80> list = this.i;
        if (list != null) {
            list.clear();
        }
    }

    public void d(p80 p80, int i2) {
        List<n80> list;
        if (!(!this.j || (list = this.i) == null || list.isEmpty())) {
            m80 x = p80.x();
            for (n80 n80 : this.i) {
                n80.b(x, i2);
            }
        }
    }

    public void e(p80 p80, int i2) {
        List<n80> list;
        p80.k(i2);
        if (!(!this.j || (list = this.i) == null || list.isEmpty())) {
            if (i2 == 3) {
                b();
            }
            m80 x = p80.x();
            for (n80 n80 : this.i) {
                n80.a(x, i2);
            }
        }
    }

    public void f() {
        c();
        g(false);
        this.c.b();
    }

    public void g(boolean z) {
        this.j = z;
        if (z) {
            h();
            j80 j80 = this.e;
            if (j80 != null) {
                this.a.R(j80);
            }
            q80 q80 = this.g;
            if (q80 != null) {
                this.a.j(q80);
            }
            ff0 ff0 = this.h;
            if (ff0 != null) {
                this.a.S(ff0);
                return;
            }
            return;
        }
        j80 j802 = this.e;
        if (j802 != null) {
            this.a.g0(j802);
        }
        q80 q802 = this.g;
        if (q802 != null) {
            this.a.I(q802);
        }
        ff0 ff02 = this.h;
        if (ff02 != null) {
            this.a.h0(ff02);
        }
    }
}
