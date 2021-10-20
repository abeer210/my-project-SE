package defpackage;

import defpackage.id;
import java.io.IOException;
import vigqyno.C0201;

/* renamed from: ye  reason: default package */
/* compiled from: MaskParser */
public class ye {
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0085  */
    public static id a(qf qfVar, ea eaVar) throws IOException {
        char c;
        qfVar.h();
        id.a aVar = null;
        vc vcVar = null;
        rc rcVar = null;
        boolean z = false;
        while (qfVar.o()) {
            String u = qfVar.u();
            int hashCode = u.hashCode();
            char c2 = 65535;
            if (hashCode != 111) {
                if (hashCode != 3588) {
                    if (hashCode != 104433) {
                        if (hashCode == 3357091 && u.equals(C0201.m82(19677))) {
                            c = 0;
                            if (c == 0) {
                                String w = qfVar.w();
                                int hashCode2 = w.hashCode();
                                if (hashCode2 != 97) {
                                    if (hashCode2 != 105) {
                                        if (hashCode2 != 110) {
                                            if (hashCode2 == 115 && w.equals(C0201.m82(19681))) {
                                                c2 = 1;
                                            }
                                        } else if (w.equals(C0201.m82(19682))) {
                                            c2 = 2;
                                        }
                                    } else if (w.equals(C0201.m82(19683))) {
                                        c2 = 3;
                                    }
                                } else if (w.equals(C0201.m82(19684))) {
                                    c2 = 0;
                                }
                                if (c2 == 0) {
                                    aVar = id.a.MASK_MODE_ADD;
                                } else if (c2 == 1) {
                                    aVar = id.a.MASK_MODE_SUBTRACT;
                                } else if (c2 == 2) {
                                    aVar = id.a.MASK_MODE_NONE;
                                } else if (c2 != 3) {
                                    wf.c(C0201.m82(19685) + u + C0201.m82(19686));
                                    aVar = id.a.MASK_MODE_ADD;
                                } else {
                                    eaVar.a(C0201.m82(19687));
                                    aVar = id.a.MASK_MODE_INTERSECT;
                                }
                            } else if (c == 1) {
                                vcVar = he.k(qfVar, eaVar);
                            } else if (c == 2) {
                                rcVar = he.h(qfVar, eaVar);
                            } else if (c != 3) {
                                qfVar.D();
                            } else {
                                z = qfVar.p();
                            }
                        }
                    } else if (u.equals(C0201.m82(19678))) {
                        c = 3;
                        if (c == 0) {
                        }
                    }
                } else if (u.equals(C0201.m82(19679))) {
                    c = 1;
                    if (c == 0) {
                    }
                }
            } else if (u.equals(C0201.m82(19680))) {
                c = 2;
                if (c == 0) {
                }
            }
            c = 65535;
            if (c == 0) {
            }
        }
        qfVar.m();
        return new id(aVar, vcVar, rcVar, z);
    }
}
