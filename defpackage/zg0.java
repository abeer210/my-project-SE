package defpackage;

/* renamed from: zg0  reason: default package */
/* compiled from: SwallowResultProducer */
public class zg0<T> implements rg0<Void> {
    private final rg0<T> a;

    /* renamed from: zg0$a */
    /* compiled from: SwallowResultProducer */
    class a extends vf0<T, Void> {
        public a(zg0 zg0, sf0 sf0) {
            super(sf0);
        }

        @Override // defpackage.jf0
        public void i(T t, int i) {
            if (jf0.e(i)) {
                p().d(null, i);
            }
        }
    }

    public zg0(rg0<T> rg0) {
        this.a = rg0;
    }

    @Override // defpackage.rg0
    public void b(sf0<Void> sf0, sg0 sg0) {
        this.a.b(new a(this, sf0), sg0);
    }
}
