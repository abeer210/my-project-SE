package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* renamed from: hg0  reason: default package */
/* compiled from: LocalFetchProducer */
public abstract class hg0 implements rg0<af0> {
    private final Executor a;
    private final r60 b;

    /* renamed from: hg0$a */
    /* compiled from: LocalFetchProducer */
    class a extends yg0<af0> {
        public final /* synthetic */ ih0 f;
        public final /* synthetic */ ug0 g;
        public final /* synthetic */ String h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(sf0 sf0, ug0 ug0, String str, String str2, ih0 ih0, ug0 ug02, String str3) {
            super(sf0, ug0, str, str2);
            this.f = ih0;
            this.g = ug02;
            this.h = str3;
        }

        /* renamed from: j */
        public void b(af0 af0) {
            af0.h(af0);
        }

        /* renamed from: k */
        public af0 c() throws Exception {
            af0 d = hg0.this.d(this.f);
            if (d == null) {
                this.g.e(this.h, hg0.this.f(), false);
                return null;
            }
            d.G();
            this.g.e(this.h, hg0.this.f(), true);
            return d;
        }
    }

    /* renamed from: hg0$b */
    /* compiled from: LocalFetchProducer */
    class b extends mf0 {
        public final /* synthetic */ yg0 a;

        public b(hg0 hg0, yg0 yg0) {
            this.a = yg0;
        }

        @Override // defpackage.tg0
        public void a() {
            this.a.a();
        }
    }

    public hg0(Executor executor, r60 r60) {
        this.a = executor;
        this.b = r60;
    }

    @Override // defpackage.rg0
    public void b(sf0<af0> sf0, sg0 sg0) {
        ug0 f = sg0.f();
        String t = sg0.t();
        a aVar = new a(sf0, f, f(), t, sg0.c(), f, t);
        sg0.d(new b(this, aVar));
        this.a.execute(aVar);
    }

    public af0 c(InputStream inputStream, int i) throws IOException {
        v60 v60;
        if (i <= 0) {
            try {
                v60 = v60.B(this.b.c(inputStream));
            } catch (Throwable th) {
                s50.b(inputStream);
                v60.s(null);
                throw th;
            }
        } else {
            v60 = v60.B(this.b.d(inputStream, i));
        }
        af0 af0 = new af0(v60);
        s50.b(inputStream);
        v60.s(v60);
        return af0;
    }

    public abstract af0 d(ih0 ih0) throws IOException;

    public af0 e(InputStream inputStream, int i) throws IOException {
        return c(inputStream, i);
    }

    public abstract String f();
}
