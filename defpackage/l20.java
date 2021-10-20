package defpackage;

import com.dynatrace.android.agent.t;
import defpackage.r20;

/* renamed from: l20  reason: default package */
/* compiled from: PrivacyRules */
public class l20 {
    public static final l20 b;
    public static final r20 c;
    private r20 a;

    static {
        r20.b bVar = new r20.b();
        bVar.f(f20.USER_BEHAVIOR);
        bVar.e(true);
        b = new l20(bVar.d());
        r20.b bVar2 = new r20.b();
        bVar2.f(f20.OFF);
        bVar2.e(false);
        c = bVar2.d();
    }

    public l20(r20 r20) {
        this.a = r20;
    }

    public boolean a() {
        return this.a.f() == f20.USER_BEHAVIOR;
    }

    public boolean b() {
        return this.a.f().ordinal() >= f20.PERFORMANCE.ordinal();
    }

    public r20 c() {
        return this.a;
    }

    public boolean d() {
        return this.a.f() == f20.USER_BEHAVIOR;
    }

    public boolean e(t tVar) {
        if (tVar == t.CRASH) {
            return this.a.h();
        }
        if (tVar == t.ACTION_AUTO_LOADING_APP) {
            if (this.a.f() == f20.OFF) {
                return true;
            }
            return false;
        } else if (tVar.b().ordinal() <= this.a.f().ordinal()) {
            return true;
        } else {
            return false;
        }
    }
}
