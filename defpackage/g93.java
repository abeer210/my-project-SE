package defpackage;

import defpackage.l93;

/* renamed from: g93  reason: default package */
/* compiled from: OTSHashAddress */
public final class g93 extends l93 {
    private final int e;
    private final int f;
    private final int g;

    /* renamed from: g93$b */
    /* compiled from: OTSHashAddress */
    protected static class b extends l93.a<b> {
        private int e = 0;
        private int f = 0;
        private int g = 0;

        public b() {
            super(0);
        }

        /* Return type fixed from 'l93$a' to match base method */
        @Override // defpackage.l93.a
        public /* bridge */ /* synthetic */ b e() {
            m();
            return this;
        }

        public l93 l() {
            return new g93(this);
        }

        public b m() {
            return this;
        }

        public b n(int i) {
            this.f = i;
            return this;
        }

        public b o(int i) {
            this.g = i;
            return this;
        }

        public b p(int i) {
            this.e = i;
            return this;
        }
    }

    @Override // defpackage.l93
    public byte[] d() {
        byte[] d = super.d();
        jb3.c(this.e, d, 16);
        jb3.c(this.f, d, 20);
        jb3.c(this.g, d, 24);
        return d;
    }

    public int e() {
        return this.f;
    }

    public int f() {
        return this.g;
    }

    public int g() {
        return this.e;
    }

    private g93(b bVar) {
        super(bVar);
        this.e = bVar.e;
        this.f = bVar.f;
        this.g = bVar.g;
    }
}
