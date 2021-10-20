package defpackage;

import java.io.IOException;
import vigqyno.C0201;

/* renamed from: tz0  reason: default package */
public final class tz0 extends yy0<tz0> implements Cloneable {
    private static volatile tz0[] e;
    private String c;
    private String d;

    public tz0() {
        String r0 = C0201.m82(1153);
        this.c = r0;
        this.d = r0;
        this.b = null;
        this.a = -1;
    }

    public static tz0[] g() {
        if (e == null) {
            synchronized (cz0.a) {
                if (e == null) {
                    e = new tz0[0];
                }
            }
        }
        return e;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final tz0 clone() {
        try {
            return (tz0) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // defpackage.yy0, defpackage.dz0
    public final void a(wy0 wy0) throws IOException {
        String str = this.c;
        String r1 = C0201.m82(1154);
        if (str != null && !str.equals(r1)) {
            wy0.c(1, this.c);
        }
        String str2 = this.d;
        if (str2 != null && !str2.equals(r1)) {
            wy0.c(2, this.d);
        }
        super.a(wy0);
    }

    @Override // defpackage.yy0, defpackage.dz0
    public final int d() {
        int d2 = super.d();
        String str = this.c;
        String r2 = C0201.m82(1155);
        if (str != null && !str.equals(r2)) {
            d2 += wy0.h(1, this.c);
        }
        String str2 = this.d;
        return (str2 == null || str2.equals(r2)) ? d2 : d2 + wy0.h(2, this.d);
    }

    @Override // defpackage.yy0, defpackage.dz0
    public final /* synthetic */ dz0 e() throws CloneNotSupportedException {
        return (tz0) clone();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tz0)) {
            return false;
        }
        tz0 tz0 = (tz0) obj;
        String str = this.c;
        if (str == null) {
            if (tz0.c != null) {
                return false;
            }
        } else if (!str.equals(tz0.c)) {
            return false;
        }
        String str2 = this.d;
        if (str2 == null) {
            if (tz0.d != null) {
                return false;
            }
        } else if (!str2.equals(tz0.d)) {
            return false;
        }
        az0 az0 = this.b;
        if (az0 != null && !az0.a()) {
            return this.b.equals(tz0.b);
        }
        az0 az02 = tz0.b;
        return az02 == null || az02.a();
    }

    /* Return type fixed from 'yy0' to match base method */
    @Override // defpackage.yy0
    public final /* synthetic */ tz0 f() throws CloneNotSupportedException {
        return (tz0) clone();
    }

    public final int hashCode() {
        int hashCode = (tz0.class.getName().hashCode() + 527) * 31;
        String str = this.c;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        az0 az0 = this.b;
        if (az0 != null && !az0.a()) {
            i = this.b.hashCode();
        }
        return hashCode3 + i;
    }
}
