package defpackage;

import android.graphics.drawable.Animatable;
import com.facebook.common.time.b;

/* renamed from: q80  reason: default package */
/* compiled from: ImagePerfControllerListener */
public class q80 extends y80<bf0> {
    private final b b;
    private final p80 c;
    private final o80 d;

    public q80(b bVar, p80 p80, o80 o80) {
        this.b = bVar;
        this.c = p80;
        this.d = o80;
    }

    private void j(long j) {
        this.c.w(false);
        this.c.p(j);
        this.d.d(this.c, 2);
    }

    @Override // defpackage.y80, defpackage.z80
    public void c(String str, Throwable th) {
        long now = this.b.now();
        this.c.e(now);
        this.c.g(str);
        this.d.e(this.c, 5);
        j(now);
    }

    @Override // defpackage.y80, defpackage.z80
    public void d(String str) {
        super.d(str);
        long now = this.b.now();
        int a = this.c.a();
        if (!(a == 3 || a == 5)) {
            this.c.d(now);
            this.c.g(str);
            this.d.e(this.c, 4);
        }
        j(now);
    }

    @Override // defpackage.y80, defpackage.z80
    public void e(String str, Object obj) {
        long now = this.b.now();
        this.c.i(now);
        this.c.g(str);
        this.c.c(obj);
        this.d.e(this.c, 0);
        k(now);
    }

    /* renamed from: h */
    public void b(String str, bf0 bf0, Animatable animatable) {
        long now = this.b.now();
        this.c.f(now);
        this.c.n(now);
        this.c.g(str);
        this.c.j(bf0);
        this.d.e(this.c, 3);
    }

    /* renamed from: i */
    public void a(String str, bf0 bf0) {
        this.c.h(this.b.now());
        this.c.g(str);
        this.c.j(bf0);
        this.d.e(this.c, 2);
    }

    public void k(long j) {
        this.c.w(true);
        this.c.v(j);
        this.d.d(this.c, 1);
    }
}
