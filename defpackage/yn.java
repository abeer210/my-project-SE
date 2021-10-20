package defpackage;

/* renamed from: yn  reason: default package */
/* compiled from: RequestCoordinator */
public interface yn {

    /* renamed from: yn$a */
    /* compiled from: RequestCoordinator */
    public enum a {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);
        
        private final boolean a;

        private a(boolean z) {
            this.a = z;
        }

        public boolean b() {
            return this.a;
        }
    }

    void a(xn xnVar);

    boolean b();

    yn c();

    boolean g(xn xnVar);

    boolean i(xn xnVar);

    void j(xn xnVar);

    boolean l(xn xnVar);
}
