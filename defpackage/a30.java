package defpackage;

import vigqyno.C0201;

/* renamed from: a30  reason: default package */
/* compiled from: StacktraceData */
public class a30 {
    private final String a;
    private final String b;
    private final String c;
    private final y20 d;

    public a30(String str, String str2, String str3, y20 y20) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = y20;
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public y20 d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a30.class != obj.getClass()) {
            return false;
        }
        a30 a30 = (a30) obj;
        String str = this.a;
        if (str == null ? a30.a != null : !str.equals(a30.a)) {
            return false;
        }
        String str2 = this.b;
        if (str2 == null ? a30.b != null : !str2.equals(a30.b)) {
            return false;
        }
        String str3 = this.c;
        if (str3 == null ? a30.c != null : !str3.equals(a30.c)) {
            return false;
        }
        if (this.d == a30.d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        y20 y20 = this.d;
        if (y20 != null) {
            i = y20.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return C0201.m82(12234) + this.a + '\'' + C0201.m82(12235) + this.b + '\'' + C0201.m82(12236) + this.c + '\'' + C0201.m82(12237) + this.d + '}';
    }
}
