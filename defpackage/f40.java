package defpackage;

import vigqyno.C0201;

/* renamed from: f40  reason: default package */
/* compiled from: WebReqStateParms */
public abstract class f40 {
    public String a;
    public y30 b;
    public z30 c;
    public int d;
    public String e;
    public long f = -1;
    public long g = -1;
    public boolean h = true;

    public f40(y30 y30, z30 z30, int i) {
        this.b = y30;
        this.c = z30;
        this.d = i;
    }

    public abstract String a();

    public String b(Object obj) {
        return obj != null ? obj.getClass().getSimpleName() : C0201.m82(23790);
    }

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public String toString() {
        return String.format(C0201.m82(23791), this.c, a(), this.b, c());
    }
}
