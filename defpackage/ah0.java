package defpackage;

import vigqyno.C0201;

/* renamed from: ah0  reason: default package */
/* compiled from: ThreadHandoffProducer */
public class ah0<T> implements rg0<T> {
    private final rg0<T> a;
    private final bh0 b;

    /* renamed from: ah0$a */
    /* compiled from: ThreadHandoffProducer */
    class a extends yg0<T> {
        public final /* synthetic */ ug0 f;
        public final /* synthetic */ String g;
        public final /* synthetic */ sf0 h;
        public final /* synthetic */ sg0 i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(sf0 sf0, ug0 ug0, String str, String str2, ug0 ug02, String str3, sf0 sf02, sg0 sg0) {
            super(sf0, ug0, str, str2);
            this.f = ug02;
            this.g = str3;
            this.h = sf02;
            this.i = sg0;
        }

        @Override // defpackage.m50
        public void b(T t) {
        }

        @Override // defpackage.m50
        public T c() throws Exception {
            return null;
        }

        @Override // defpackage.yg0, defpackage.m50
        public void f(T t) {
            this.f.i(this.g, C0201.m82(2291), null);
            ah0.this.a.b(this.h, this.i);
        }
    }

    /* renamed from: ah0$b */
    /* compiled from: ThreadHandoffProducer */
    class b extends mf0 {
        public final /* synthetic */ yg0 a;

        public b(yg0 yg0) {
            this.a = yg0;
        }

        @Override // defpackage.tg0
        public void a() {
            this.a.a();
            ah0.this.b.b(this.a);
        }
    }

    public ah0(rg0<T> rg0, bh0 bh0) {
        z50.g(rg0);
        this.a = rg0;
        this.b = bh0;
    }

    @Override // defpackage.rg0
    public void b(sf0<T> sf0, sg0 sg0) {
        ug0 f = sg0.f();
        String t = sg0.t();
        a aVar = new a(sf0, f, C0201.m82(16994), t, f, t, sf0, sg0);
        sg0.d(new b(aVar));
        this.b.a(aVar);
    }
}
