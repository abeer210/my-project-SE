package defpackage;

import vigqyno.C0201;

/* renamed from: dt2  reason: default package */
/* compiled from: PDRectangle */
public class dt2 implements ct2 {
    public static final dt2 b = new dt2(612.0f, 792.0f);
    private final sq2 a;

    static {
        new dt2(612.0f, 1008.0f);
        new dt2(2383.937f, 3370.3938f);
        new dt2(1683.7795f, 2383.937f);
        new dt2(1190.5513f, 1683.7795f);
        new dt2(841.8898f, 1190.5513f);
        new dt2(595.27563f, 841.8898f);
        new dt2(419.52756f, 595.27563f);
        new dt2(297.63782f, 419.52756f);
    }

    public dt2(float f, float f2) {
        this(0.0f, 0.0f, f, f2);
    }

    public float a() {
        return ((cr2) this.a.x(0)).r();
    }

    public float b() {
        return ((cr2) this.a.x(1)).r();
    }

    public float c() {
        return ((cr2) this.a.x(2)).r();
    }

    public float d() {
        return ((cr2) this.a.x(3)).r();
    }

    @Override // defpackage.ct2
    public tq2 k() {
        return this.a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C0201.m82(28693));
        sb.append(a());
        String r1 = C0201.m82(28694);
        sb.append(r1);
        sb.append(b());
        sb.append(r1);
        sb.append(c());
        sb.append(r1);
        sb.append(d());
        sb.append(C0201.m82(28695));
        return sb.toString();
    }

    public dt2(float f, float f2, float f3, float f4) {
        sq2 sq2 = new sq2();
        this.a = sq2;
        sq2.r(new xq2(f));
        this.a.r(new xq2(f2));
        this.a.r(new xq2(f + f3));
        this.a.r(new xq2(f2 + f4));
    }
}
