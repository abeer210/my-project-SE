package defpackage;

import vigqyno.C0201;

/* renamed from: m20  reason: default package */
/* compiled from: ReplayConfiguration */
public final class m20 {
    public static final m20 b = b().b();
    private final boolean a;

    public static b b() {
        return new b();
    }

    public boolean c() {
        return this.a;
    }

    public b d() {
        return new b(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m20.class == obj.getClass() && this.a == ((m20) obj).a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a ? 1 : 0;
    }

    public String toString() {
        return C0201.m82(7823) + this.a + '}';
    }

    /* renamed from: m20$b */
    /* compiled from: ReplayConfiguration */
    public static class b {
        private boolean a;

        public b() {
            this.a = false;
        }

        public m20 b() {
            return new m20(this);
        }

        public b c(boolean z) {
            this.a = z;
            return this;
        }

        public b(m20 m20) {
            this.a = m20.a;
        }
    }

    private m20(b bVar) {
        this.a = bVar.a;
    }
}
