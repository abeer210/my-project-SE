package defpackage;

import defpackage.l93;

/* renamed from: f93  reason: default package */
/* compiled from: LTreeAddress */
public final class f93 extends l93 {
    private final int e;
    private final int f;
    private final int g;

    /* renamed from: f93$b */
    /* compiled from: LTreeAddress */
    protected static class b extends l93.a<b> {
        private int e = 0;
        private int f = 0;
        private int g = 0;

        public b() {
            super(1);
        }

        /* Return type fixed from 'l93$a' to match base method */
        @Override // defpackage.l93.a
        public /* bridge */ /* synthetic */ b e() {
            m();
            return this;
        }

        public l93 l() {
            return new f93(this);
        }

        public b m() {
            return this;
        }

        public b n(int i) {
            this.e = i;
            return this;
        }

        public b o(int i) {
            this.f = i;
            return this;
        }

        public b p(int i) {
            this.g = i;
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
        return this.e;
    }

    public int f() {
        return this.f;
    }

    public int g() {
        return this.g;
    }

    private f93(b bVar) {
        super(bVar);
        this.e = bVar.e;
        this.f = bVar.f;
        this.g = bVar.g;
    }
}
