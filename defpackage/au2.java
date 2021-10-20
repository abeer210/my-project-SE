package defpackage;

import android.content.Context;
import android.os.Build;
import defpackage.xt2;
import defpackage.zt2;

/* renamed from: au2  reason: default package */
/* compiled from: AndroidFingerprint */
public class au2 extends zt2 {
    private c2 k;
    private xt2 l;

    /* renamed from: au2$a */
    /* compiled from: AndroidFingerprint */
    class a extends xt2.b {
        public a() {
        }

        @Override // defpackage.xt2.b
        public void a(int i, CharSequence charSequence) {
            super.a(i, charSequence);
            if (i != 5 && i != 10) {
                au2.this.j(i == 7 || i == 9);
            }
        }

        @Override // defpackage.xt2.b
        public void b() {
            super.b();
            au2.this.k();
        }

        @Override // defpackage.xt2.b
        public void d(xt2.c cVar) {
            super.d(cVar);
            au2.this.l();
        }
    }

    public au2(Context context, zt2.d dVar, boolean z) {
        super(context, dVar);
        if (z || Build.VERSION.SDK_INT >= 23) {
            try {
                xt2 b = xt2.b(this.a);
                this.l = b;
                o(b.d());
                p(this.l.c());
            } catch (Throwable th) {
                i(th);
            }
        }
    }

    @Override // defpackage.zt2
    public void c() {
        try {
            if (this.k != null) {
                this.k.a();
            }
        } catch (Throwable th) {
            i(th);
        }
    }

    @Override // defpackage.zt2
    public void d() {
        try {
            c2 c2Var = new c2();
            this.k = c2Var;
            this.l.a(null, 0, c2Var, new a(), null);
        } catch (Throwable th) {
            i(th);
            j(false);
        }
    }

    @Override // defpackage.zt2
    public boolean h() {
        return false;
    }
}
