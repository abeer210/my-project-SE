package defpackage;

import defpackage.l93;

/* renamed from: d93  reason: default package */
/* compiled from: HashTreeAddress */
public final class d93 extends l93 {
    private final int e;
    private final int f;
    private final int g;

    /* renamed from: d93$b */
    /* compiled from: HashTreeAddress */
    protected static class b extends l93.a<b> {
        private int e = 0;
        private int f = 0;

        public b() {
            super(2);
        }

        /* Return type fixed from 'l93$a' to match base method */
        @Override // defpackage.l93.a
        public /* bridge */ /* synthetic */ b e() {
            l();
            return this;
        }

        public l93 k() {
            return new d93(this);
        }

        public b l() {
            return this;
        }

        public b m(int i) {
            this.e = i;
            return this;
        }

        public b n(int i) {
            this.f = i;
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

    private d93(b bVar) {
        super(bVar);
        this.e = 0;
        this.f = bVar.e;
        this.g = bVar.f;
    }
}
