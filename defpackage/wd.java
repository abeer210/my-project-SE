package defpackage;

import java.util.List;
import java.util.Locale;
import vigqyno.C0201;

/* renamed from: wd  reason: default package */
/* compiled from: Layer */
public class wd {
    private final List<dd> a;
    private final ea b;
    private final String c;
    private final long d;
    private final a e;
    private final long f;
    private final String g;
    private final List<id> h;
    private final zc i;
    private final int j;
    private final int k;
    private final int l;
    private final float m;
    private final float n;
    private final int o;
    private final int p;
    private final xc q;
    private final yc r;
    private final pc s;
    private final List<bg<Float>> t;
    private final b u;
    private final boolean v;

    /* renamed from: wd$a */
    /* compiled from: Layer */
    public enum a {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    /* renamed from: wd$b */
    /* compiled from: Layer */
    public enum b {
        NONE,
        ADD,
        INVERT,
        UNKNOWN
    }

    public wd(List<dd> list, ea eaVar, String str, long j2, a aVar, long j3, String str2, List<id> list2, zc zcVar, int i2, int i3, int i4, float f2, float f3, int i5, int i6, xc xcVar, yc ycVar, List<bg<Float>> list3, b bVar, pc pcVar, boolean z) {
        this.a = list;
        this.b = eaVar;
        this.c = str;
        this.d = j2;
        this.e = aVar;
        this.f = j3;
        this.g = str2;
        this.h = list2;
        this.i = zcVar;
        this.j = i2;
        this.k = i3;
        this.l = i4;
        this.m = f2;
        this.n = f3;
        this.o = i5;
        this.p = i6;
        this.q = xcVar;
        this.r = ycVar;
        this.t = list3;
        this.u = bVar;
        this.s = pcVar;
        this.v = z;
    }

    public ea a() {
        return this.b;
    }

    public long b() {
        return this.d;
    }

    public List<bg<Float>> c() {
        return this.t;
    }

    public a d() {
        return this.e;
    }

    public List<id> e() {
        return this.h;
    }

    public b f() {
        return this.u;
    }

    public String g() {
        return this.c;
    }

    public long h() {
        return this.f;
    }

    public int i() {
        return this.p;
    }

    public int j() {
        return this.o;
    }

    public String k() {
        return this.g;
    }

    public List<dd> l() {
        return this.a;
    }

    public int m() {
        return this.l;
    }

    public int n() {
        return this.k;
    }

    public int o() {
        return this.j;
    }

    public float p() {
        return this.n / this.b.e();
    }

    public xc q() {
        return this.q;
    }

    public yc r() {
        return this.r;
    }

    public pc s() {
        return this.s;
    }

    public float t() {
        return this.m;
    }

    public String toString() {
        return w(C0201.m82(14541));
    }

    public zc u() {
        return this.i;
    }

    public boolean v() {
        return this.v;
    }

    public String w(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(g());
        String r1 = C0201.m82(14542);
        sb.append(r1);
        wd s2 = this.b.s(h());
        if (s2 != null) {
            sb.append(C0201.m82(14543));
            sb.append(s2.g());
            wd s3 = this.b.s(s2.h());
            while (s3 != null) {
                sb.append(C0201.m82(14544));
                sb.append(s3.g());
                s3 = this.b.s(s3.h());
            }
            sb.append(str);
            sb.append(r1);
        }
        if (!e().isEmpty()) {
            sb.append(str);
            sb.append(C0201.m82(14545));
            sb.append(e().size());
            sb.append(r1);
        }
        if (!(o() == 0 || n() == 0)) {
            sb.append(str);
            sb.append(C0201.m82(14546));
            sb.append(String.format(Locale.US, C0201.m82(14547), Integer.valueOf(o()), Integer.valueOf(n()), Integer.valueOf(m())));
        }
        if (!this.a.isEmpty()) {
            sb.append(str);
            sb.append(C0201.m82(14548));
            for (dd ddVar : this.a) {
                sb.append(str);
                sb.append(C0201.m82(14549));
                sb.append(ddVar);
                sb.append(r1);
            }
        }
        return sb.toString();
    }
}
