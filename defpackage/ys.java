package defpackage;

import vigqyno.C0201;

/* renamed from: ys  reason: default package */
/* compiled from: ExifThumbnailDescriptor */
public class ys extends ns<zs> {
    public ys(zs zsVar) {
        super(zsVar);
    }

    public String Q0() {
        String r = ((zs) this.a).r(514);
        if (r == null) {
            return null;
        }
        return r + C0201.m82(20727);
    }

    public String R0() {
        String r = ((zs) this.a).r(513);
        if (r == null) {
            return null;
        }
        return r + C0201.m82(20728);
    }

    @Override // defpackage.as, defpackage.ns
    public String f(int i) {
        if (i == 513) {
            return R0();
        }
        if (i != 514) {
            return super.f(i);
        }
        return Q0();
    }
}
