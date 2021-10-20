package com.facebook.imagepipeline.memory;

/* compiled from: FlexByteArrayPool */
public class q {
    private final x60<byte[]> a;
    public final b b;

    /* compiled from: FlexByteArrayPool */
    class a implements x60<byte[]> {
        public a() {
        }

        /* renamed from: b */
        public void a(byte[] bArr) {
            q.this.b(bArr);
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: FlexByteArrayPool */
    public static class b extends r {
        public b(m60 m60, g0 g0Var, h0 h0Var) {
            super(m60, g0Var, h0Var);
        }

        @Override // com.facebook.imagepipeline.memory.a
        public f<byte[]> s(int i) {
            k(i);
            return new c0(i, this.c.e, 0);
        }
    }

    public q(m60 m60, g0 g0Var) {
        z50.b(g0Var.e > 0);
        this.b = new b(m60, g0Var, b0.h());
        this.a = new a();
    }

    public v60<byte[]> a(int i) {
        return v60.F(this.b.get(i), this.a);
    }

    public void b(byte[] bArr) {
        this.b.a(bArr);
    }
}
