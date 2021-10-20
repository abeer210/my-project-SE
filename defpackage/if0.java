package defpackage;

/* renamed from: if0  reason: default package */
/* compiled from: AddImageTransformMetaDataProducer */
public class if0 implements rg0<af0> {
    private final rg0<af0> a;

    /* renamed from: if0$b */
    /* compiled from: AddImageTransformMetaDataProducer */
    private static class b extends vf0<af0, af0> {
        /* renamed from: q */
        public void i(af0 af0, int i) {
            if (af0 == null) {
                p().d(null, i);
                return;
            }
            if (!af0.D(af0)) {
                af0.G();
            }
            p().d(af0, i);
        }

        private b(sf0<af0> sf0) {
            super(sf0);
        }
    }

    public if0(rg0<af0> rg0) {
        this.a = rg0;
    }

    @Override // defpackage.rg0
    public void b(sf0<af0> sf0, sg0 sg0) {
        this.a.b(new b(sf0), sg0);
    }
}
