package defpackage;

import android.content.Context;
import defpackage.zt2;

/* renamed from: wt2  reason: default package */
/* compiled from: FingerprintIdentify */
public class wt2 {
    public Context a;
    public zt2.d b;
    public boolean c = false;
    public zt2 d;
    public zt2 e;

    public wt2(Context context) {
        this.a = context;
    }

    public void a() {
        zt2 zt2 = this.d;
        if (zt2 != null) {
            zt2.b();
        }
    }

    public void b() {
        au2 au2 = new au2(this.a, this.b, this.c);
        if (au2.f()) {
            this.e = au2;
            if (au2.g()) {
                this.d = au2;
                return;
            }
        }
        cu2 cu2 = new cu2(this.a, this.b);
        if (cu2.f()) {
            this.e = cu2;
            if (cu2.g()) {
                this.d = cu2;
                return;
            }
        }
        bu2 bu2 = new bu2(this.a, this.b);
        if (bu2.f()) {
            this.e = bu2;
            if (bu2.g()) {
                this.d = bu2;
            }
        }
    }

    public boolean c() {
        zt2 zt2 = this.d;
        return zt2 != null && zt2.e();
    }

    public boolean d() {
        zt2 zt2;
        return c() || ((zt2 = this.e) != null && zt2.f());
    }

    public boolean e() {
        zt2 zt2;
        return c() || ((zt2 = this.e) != null && zt2.g());
    }

    public void f() {
        if (c()) {
            this.d.m();
        }
    }

    public void g(zt2.d dVar) {
        this.b = dVar;
    }

    public void h(boolean z) {
        this.c = z;
    }

    public void i(int i, zt2.e eVar) {
        if (c()) {
            this.d.q(i, eVar);
        }
    }
}
