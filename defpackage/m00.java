package defpackage;

import vigqyno.C0201;

/* renamed from: m00  reason: default package */
/* compiled from: PcxDescriptor */
public class m00 extends as<n00> {
    public m00(n00 n00) {
        super(n00);
    }

    @Override // defpackage.as
    public String f(int i) {
        if (i == 1) {
            return x();
        }
        if (i == 10) {
            return v();
        }
        if (i != 12) {
            return super.f(i);
        }
        return w();
    }

    public String v() {
        return l(10, 3, C0201.m82(2721), C0201.m82(2722));
    }

    public String w() {
        return l(12, 1, C0201.m82(2723), C0201.m82(2724));
    }

    public String x() {
        return m(1, C0201.m82(2725), null, C0201.m82(2726), C0201.m82(2727), C0201.m82(2728), C0201.m82(2729));
    }
}
