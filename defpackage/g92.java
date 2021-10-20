package defpackage;

import vigqyno.C0201;

/* renamed from: g92  reason: default package */
/* compiled from: AI01320xDecoder */
public final class g92 extends k92 {
    public g92(b72 b72) {
        super(b72);
    }

    @Override // defpackage.n92
    public void h(StringBuilder sb, int i) {
        if (i < 10000) {
            sb.append(C0201.m82(28111));
        } else {
            sb.append(C0201.m82(28112));
        }
    }

    @Override // defpackage.n92
    public int i(int i) {
        return i < 10000 ? i : i - 10000;
    }
}
