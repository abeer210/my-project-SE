package defpackage;

import java.io.IOException;
import java.util.Set;

/* renamed from: v00  reason: default package */
/* compiled from: PhotoshopTiffHandler */
public class v00 extends at {
    public v00(wr wrVar, tr trVar) {
        super(wrVar, trVar);
    }

    @Override // defpackage.at, defpackage.uq
    public boolean g(int i, Set<Integer> set, int i2, kr krVar, int i3, int i4) throws IOException {
        if (i3 == 700) {
            new m10().f(krVar.c(i, i4), this.d);
            return true;
        } else if (i3 == 34377) {
            new u00().c(new nr(krVar.c(i, i4)), i4, this.d);
            return true;
        } else if (i3 != 34675) {
            return super.g(i, set, i2, krVar, i3, i4);
        } else {
            new iw().c(new br(krVar.c(i, i4)), this.d);
            return true;
        }
    }
}
