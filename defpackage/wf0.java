package defpackage;

import defpackage.ih0;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import vigqyno.C0201;

/* renamed from: wf0  reason: default package */
/* compiled from: DiskCacheReadProducer */
public class wf0 implements rg0<af0> {
    private final vc0 a;
    private final vc0 b;
    private final wc0 c;
    private final rg0<af0> d;

    /* access modifiers changed from: package-private */
    /* renamed from: wf0$a */
    /* compiled from: DiskCacheReadProducer */
    public class a implements t7<af0, Void> {
        public final /* synthetic */ ug0 a;
        public final /* synthetic */ String b;
        public final /* synthetic */ sf0 c;
        public final /* synthetic */ sg0 d;

        public a(ug0 ug0, String str, sf0 sf0, sg0 sg0) {
            this.a = ug0;
            this.b = str;
            this.c = sf0;
            this.d = sg0;
        }

        /* renamed from: b */
        public Void a(v7<af0> v7Var) throws Exception {
            boolean f = wf0.f(v7Var);
            String r2 = C0201.m82(9066);
            if (f) {
                this.a.d(this.b, r2, null);
                this.c.b();
            } else if (v7Var.n()) {
                this.a.j(this.b, r2, v7Var.i(), null);
                wf0.this.d.b(this.c, this.d);
            } else {
                af0 j = v7Var.j();
                if (j != null) {
                    ug0 ug0 = this.a;
                    String str = this.b;
                    ug0.i(str, r2, wf0.e(ug0, str, true, j.z()));
                    this.a.e(this.b, r2, true);
                    this.c.c(1.0f);
                    this.c.d(j, 1);
                    j.close();
                } else {
                    ug0 ug02 = this.a;
                    String str2 = this.b;
                    ug02.i(str2, r2, wf0.e(ug02, str2, false, 0));
                    wf0.this.d.b(this.c, this.d);
                }
            }
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: wf0$b */
    /* compiled from: DiskCacheReadProducer */
    public class b extends mf0 {
        public final /* synthetic */ AtomicBoolean a;

        public b(wf0 wf0, AtomicBoolean atomicBoolean) {
            this.a = atomicBoolean;
        }

        @Override // defpackage.tg0
        public void a() {
            this.a.set(true);
        }
    }

    public wf0(vc0 vc0, vc0 vc02, wc0 wc0, rg0<af0> rg0) {
        this.a = vc0;
        this.b = vc02;
        this.c = wc0;
        this.d = rg0;
    }

    public static Map<String, String> e(ug0 ug0, String str, boolean z, int i) {
        if (!ug0.f(str)) {
            return null;
        }
        String r0 = C0201.m82(11837);
        if (!z) {
            return w50.b(r0, String.valueOf(z));
        }
        return w50.c(r0, String.valueOf(z), C0201.m82(11838), String.valueOf(i));
    }

    /* access modifiers changed from: private */
    public static boolean f(v7<?> v7Var) {
        return v7Var.l() || (v7Var.n() && (v7Var.i() instanceof CancellationException));
    }

    private void g(sf0<af0> sf0, sg0 sg0) {
        if (sg0.h().d() >= ih0.b.DISK_CACHE.d()) {
            sf0.d(null, 1);
        } else {
            this.d.b(sf0, sg0);
        }
    }

    private t7<af0, Void> h(sf0<af0> sf0, sg0 sg0) {
        return new a(sg0.f(), sg0.t(), sf0, sg0);
    }

    private void i(AtomicBoolean atomicBoolean, sg0 sg0) {
        sg0.d(new b(this, atomicBoolean));
    }

    @Override // defpackage.rg0
    public void b(sf0<af0> sf0, sg0 sg0) {
        ih0 c2 = sg0.c();
        if (!c2.t()) {
            g(sf0, sg0);
            return;
        }
        sg0.f().b(sg0.t(), C0201.m82(11839));
        m40 d2 = this.c.d(c2, sg0.a());
        vc0 vc0 = c2.c() == ih0.a.SMALL ? this.b : this.a;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        vc0.m(d2, atomicBoolean).e(h(sf0, sg0));
        i(atomicBoolean, sg0);
    }
}
