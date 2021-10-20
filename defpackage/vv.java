package defpackage;

import vigqyno.C0201;

/* renamed from: vv  reason: default package */
/* compiled from: GifAnimationDescriptor */
public class vv extends as<wv> {
    public vv(wv wvVar) {
        super(wvVar);
    }

    @Override // defpackage.as
    public String f(int i) {
        if (i != 1) {
            return super.f(i);
        }
        return v();
    }

    public String v() {
        Integer l = ((wv) this.a).l(1);
        if (l == null) {
            return null;
        }
        if (l.intValue() == 0) {
            return C0201.m82(13473);
        }
        if (l.intValue() == 1) {
            return C0201.m82(13474);
        }
        if (l.intValue() == 2) {
            return C0201.m82(13475);
        }
        return l.toString() + C0201.m82(13476);
    }
}
