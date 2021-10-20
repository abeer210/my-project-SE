package defpackage;

import com.dynatrace.android.agent.u;
import vigqyno.C0201;

/* renamed from: r20  reason: default package */
/* compiled from: UserPrivacyOptions */
public final class r20 {
    private static final String d = (u.b + C0201.m82(6248));
    private final f20 a;
    private final boolean b;
    private final boolean c;

    /* renamed from: r20$b */
    /* compiled from: UserPrivacyOptions */
    public static class b {
        private f20 a;
        private boolean b;
        private boolean c;

        public r20 d() {
            return new r20(this);
        }

        public b e(boolean z) {
            this.b = z;
            return this;
        }

        public b f(f20 f20) {
            if (f20 == null) {
                if (u.c) {
                    s30.t(r20.d, C0201.m82(32107));
                }
                return this;
            }
            this.a = f20;
            return this;
        }

        public b() {
            this.a = f20.OFF;
            this.b = false;
            this.c = false;
        }

        private b(r20 r20) {
            this.a = r20.a;
            this.b = r20.b;
            this.c = r20.c;
        }
    }

    public static b e() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r20.class != obj.getClass()) {
            return false;
        }
        r20 r20 = (r20) obj;
        if (this.a == r20.a && this.b == r20.b && this.c == r20.c) {
            return true;
        }
        return false;
    }

    public f20 f() {
        return this.a;
    }

    public boolean g() {
        return this.c;
    }

    public boolean h() {
        return this.b;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0);
    }

    public b i() {
        return new b();
    }

    public String toString() {
        return C0201.m82(6249) + this.a + C0201.m82(6250) + this.b + C0201.m82(6251) + this.c + '}';
    }

    private r20(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
    }
}
