package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.common.util.n;
import vigqyno.C0201;

/* renamed from: n12  reason: default package */
/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
public final class n12 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;

    /* renamed from: n12$b */
    /* compiled from: com.google.firebase:firebase-common@@17.1.0 */
    public static final class b {
        private String a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;
        private String g;

        public n12 a() {
            return new n12(this.b, this.a, this.c, this.d, this.e, this.f, this.g);
        }

        public b b(String str) {
            u.h(str, C0201.m82(7718));
            this.a = str;
            return this;
        }

        public b c(String str) {
            u.h(str, C0201.m82(7719));
            this.b = str;
            return this;
        }

        public b d(String str) {
            this.c = str;
            return this;
        }

        public b e(String str) {
            this.e = str;
            return this;
        }

        public b f(String str) {
            this.g = str;
            return this;
        }

        public b g(String str) {
            this.f = str;
            return this;
        }
    }

    public static n12 a(Context context) {
        y yVar = new y(context);
        String a2 = yVar.a(C0201.m82(36939));
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        return new n12(a2, yVar.a(C0201.m82(36940)), yVar.a(C0201.m82(36941)), yVar.a(C0201.m82(36942)), yVar.a(C0201.m82(36943)), yVar.a(C0201.m82(36944)), yVar.a(C0201.m82(36945)));
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.c;
    }

    public String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof n12)) {
            return false;
        }
        n12 n12 = (n12) obj;
        if (!s.a(this.b, n12.b) || !s.a(this.a, n12.a) || !s.a(this.c, n12.c) || !s.a(this.d, n12.d) || !s.a(this.e, n12.e) || !s.a(this.f, n12.f) || !s.a(this.g, n12.g)) {
            return false;
        }
        return true;
    }

    public String f() {
        return this.g;
    }

    public String g() {
        return this.f;
    }

    public int hashCode() {
        return s.b(this.b, this.a, this.c, this.d, this.e, this.f, this.g);
    }

    public String toString() {
        s.a c2 = s.c(this);
        c2.a(C0201.m82(36946), this.b);
        c2.a(C0201.m82(36947), this.a);
        c2.a(C0201.m82(36948), this.c);
        c2.a(C0201.m82(36949), this.e);
        c2.a(C0201.m82(36950), this.f);
        c2.a(C0201.m82(36951), this.g);
        return c2.toString();
    }

    private n12(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        u.o(!n.a(str), C0201.m82(36938));
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }
}
