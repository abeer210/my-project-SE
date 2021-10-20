package com.dynatrace.android.agent;

import java.util.concurrent.atomic.AtomicInteger;
import vigqyno.C0201;

/* compiled from: CustomSegment */
public class m {
    public static AtomicInteger n = new AtomicInteger(0);
    public String a;
    public long b;
    public long c;
    public long d;
    public boolean e;
    public boolean f;
    public int g;
    public g30 h;
    public int i;
    public t j;
    private String k;
    private int l;
    private long m;

    /* access modifiers changed from: package-private */
    /* compiled from: CustomSegment */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            int[] iArr = new int[t.values().length];
            a = iArr;
            iArr[t.VALUE_DOUBLE.ordinal()] = 1;
            a[t.VALUE_STRING.ordinal()] = 2;
            a[t.VALUE_INT64.ordinal()] = 3;
            a[t.NAMED_EVENT.ordinal()] = 4;
            a[t.IDENTIFY_USER.ordinal()] = 5;
            a[t.ERROR_INT.ordinal()] = 6;
            try {
                a[t.SELF_MONITORING_EVENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public m(String str, int i2, t tVar, long j2, int i3, long j3, long j4, g30 g30, int i4) {
        this.b = -1;
        this.c = -1;
        this.d = 0;
        this.e = false;
        this.f = true;
        this.k = C0201.m82(3574);
        this.m = 0;
        this.h = g30;
        this.l = i2;
        this.j = tVar;
        this.b = j3;
        this.c = j4;
        this.d = j2;
        this.m = 0;
        this.g = i3;
        this.i = i4;
        this.e = true;
        z(str);
        if (j2 == 0) {
            g30.m(x.a());
        }
    }

    private void k(StringBuilder sb) {
        sb.append(C0201.m82(3576));
        sb.append(s30.q(o()));
        sb.append(C0201.m82(3577));
        sb.append(Thread.currentThread().getId());
        sb.append(C0201.m82(3578));
        sb.append(q());
        sb.append(C0201.m82(3579));
        sb.append(n());
        sb.append(C0201.m82(3580));
        sb.append(t());
    }

    public void A(long j2) {
        this.d = j2;
    }

    public void B(long j2) {
        this.b = j2;
    }

    public void C() {
        long p = p();
        if (p > 0) {
            D(p);
        } else {
            D(s());
        }
    }

    public void D(long j2) {
        if (!this.e) {
            this.c = j2;
            this.e = true;
            if (this.d == 0) {
                this.h.m(x.a());
            }
        }
    }

    public void h(StringBuilder sb, String str, String str2) {
        if (str2 != null) {
            sb.append(str);
            if (!str2.isEmpty()) {
                sb.append(str2);
            }
        }
    }

    public StringBuilder i() {
        StringBuilder sb = new StringBuilder();
        sb.append(C0201.m82(3581));
        sb.append(this.j.d());
        int i2 = a.a[this.j.ordinal()];
        String r2 = C0201.m82(3582);
        switch (i2) {
            case 1:
                k(sb);
                sb.append(r2);
                sb.append(s30.q(this.a));
                break;
            case 2:
                k(sb);
                h(sb, r2, s30.q(this.a));
                break;
            case 3:
                k(sb);
                sb.append(r2);
                sb.append(s30.q(this.a));
                break;
            case 4:
                k(sb);
                break;
            case 5:
                k(sb);
                break;
            case 6:
                k(sb);
                sb.append(C0201.m82(3586));
                sb.append(s30.q(this.a));
                sb.append(C0201.m82(3587));
                sb.append(y20.CUSTOM.b());
                break;
            case 7:
                sb.append(C0201.m82(3583));
                sb.append(s30.q(o()));
                h(sb, C0201.m82(3584), s30.q(this.a));
                sb.append(C0201.m82(3585));
                sb.append(t());
                break;
        }
        return sb;
    }

    public void j() {
        this.f = false;
        this.e = true;
    }

    public long l() {
        return this.c;
    }

    public t m() {
        return this.j;
    }

    public int n() {
        return this.g;
    }

    public String o() {
        return this.k;
    }

    public long p() {
        return 0;
    }

    public long q() {
        return this.d;
    }

    public int r() {
        return this.i;
    }

    public long s() {
        return this.h.d();
    }

    public long t() {
        return this.b;
    }

    public long u() {
        return this.m;
    }

    public int v() {
        return this.l;
    }

    public boolean w() {
        return this.f;
    }

    public boolean x() {
        return this.e;
    }

    public boolean y() {
        String str = this.k;
        return str == null || str.isEmpty();
    }

    public void z(String str) {
        if (str == null) {
            this.k = C0201.m82(3588);
        } else {
            this.k = s30.o(str, 250);
        }
    }

    public m(String str, int i2, t tVar, long j2, g30 g30, int i3) {
        this.b = -1;
        this.c = -1;
        this.d = 0;
        boolean z = false;
        this.e = false;
        this.f = true;
        this.k = C0201.m82(3575);
        this.m = 0;
        this.h = g30;
        this.l = i2;
        this.j = tVar;
        long d2 = g30.d();
        this.b = d2;
        this.c = d2;
        this.d = j2;
        this.m = s30.d();
        this.g = s30.c();
        this.i = i3;
        this.e = i2 != 5 ? true : z;
        z(str);
        if (j2 == 0) {
            g30.m(x.a());
        }
    }
}
