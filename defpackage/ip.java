package defpackage;

import vigqyno.C0201;

/* renamed from: ip  reason: default package */
/* compiled from: StateVerifier */
public abstract class ip {

    /* renamed from: ip$b */
    /* compiled from: StateVerifier */
    private static class b extends ip {
        private volatile boolean a;

        public b() {
            super();
        }

        @Override // defpackage.ip
        public void b(boolean z) {
            this.a = z;
        }

        @Override // defpackage.ip
        public void c() {
            if (this.a) {
                throw new IllegalStateException(C0201.m82(25223));
            }
        }
    }

    public static ip a() {
        return new b();
    }

    public abstract void b(boolean z);

    public abstract void c();

    private ip() {
    }
}
