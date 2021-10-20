package defpackage;

/* renamed from: l93  reason: default package */
/* compiled from: XMSSAddress */
public abstract class l93 {
    private final int a;
    private final long b;
    private final int c;
    private final int d;

    /* access modifiers changed from: protected */
    /* renamed from: l93$a */
    /* compiled from: XMSSAddress */
    public static abstract class a<T extends a> {
        private final int a;
        private int b = 0;
        private long c = 0;
        private int d = 0;

        public a(int i) {
            this.a = i;
        }

        public abstract T e();

        public T f(int i) {
            this.d = i;
            return e();
        }

        public T g(int i) {
            this.b = i;
            return e();
        }

        public T h(long j) {
            this.c = j;
            return e();
        }
    }

    public l93(a aVar) {
        this.a = aVar.b;
        this.b = aVar.c;
        this.c = aVar.a;
        this.d = aVar.d;
    }

    public final int a() {
        return this.d;
    }

    public final int b() {
        return this.a;
    }

    public final long c() {
        return this.b;
    }

    public byte[] d() {
        byte[] bArr = new byte[32];
        jb3.c(this.a, bArr, 0);
        jb3.h(this.b, bArr, 4);
        jb3.c(this.c, bArr, 12);
        jb3.c(this.d, bArr, 28);
        return bArr;
    }
}
