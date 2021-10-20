package defpackage;

import vigqyno.C0201;

/* renamed from: z12  reason: default package */
/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
public final class z12 extends d22 {
    private final String a;
    private final String b;

    public z12(String str, String str2) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                return;
            }
            throw new NullPointerException(C0201.m82(26799));
        }
        throw new NullPointerException(C0201.m82(26800));
    }

    @Override // defpackage.d22
    public String b() {
        return this.a;
    }

    @Override // defpackage.d22
    public String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d22)) {
            return false;
        }
        d22 d22 = (d22) obj;
        if (!this.a.equals(d22.b()) || !this.b.equals(d22.c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return C0201.m82(26801) + this.a + C0201.m82(26802) + this.b + C0201.m82(26803);
    }
}
