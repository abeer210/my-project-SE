package defpackage;

import androidx.core.util.e;
import defpackage.gp;
import vigqyno.C0201;

/* renamed from: gi  reason: default package */
/* compiled from: LockedResource */
public final class gi<Z> implements hi<Z>, gp.f {
    private static final e<gi<?>> e = gp.d(20, new a());
    private final ip a = ip.a();
    private hi<Z> b;
    private boolean c;
    private boolean d;

    /* renamed from: gi$a */
    /* compiled from: LockedResource */
    class a implements gp.d<gi<?>> {
        /* renamed from: a */
        public gi<?> create() {
            return new gi<>();
        }
    }

    private void c(hi<Z> hiVar) {
        this.d = false;
        this.c = true;
        this.b = hiVar;
    }

    public static <Z> gi<Z> d(hi<Z> hiVar) {
        gi<?> b2 = e.b();
        ep.d(b2);
        gi<Z> giVar = (gi<Z>) b2;
        giVar.c(hiVar);
        return giVar;
    }

    private void e() {
        this.b = null;
        e.a(this);
    }

    @Override // defpackage.hi
    public int a() {
        return this.b.a();
    }

    @Override // defpackage.hi
    public Class<Z> b() {
        return this.b.b();
    }

    @Override // defpackage.gp.f
    public ip f() {
        return this.a;
    }

    public synchronized void g() {
        this.a.c();
        if (this.c) {
            this.c = false;
            if (this.d) {
                recycle();
            }
        } else {
            throw new IllegalStateException(C0201.m82(17556));
        }
    }

    @Override // defpackage.hi
    public Z get() {
        return this.b.get();
    }

    @Override // defpackage.hi
    public synchronized void recycle() {
        this.a.c();
        this.d = true;
        if (!this.c) {
            this.b.recycle();
            e();
        }
    }
}
