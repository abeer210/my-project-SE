package defpackage;

import vigqyno.C0201;

/* renamed from: jv  reason: default package */
/* compiled from: SamsungType2MakernoteDescriptor */
public class jv extends as<kv> {
    public jv(kv kvVar) {
        super(kvVar);
    }

    private String v() {
        return j(67, C0201.m82(25462));
    }

    public String A() {
        Integer l = ((kv) this.a).l(3);
        if (l == null) {
            return null;
        }
        switch (l.intValue()) {
            case 16781340:
                return C0201.m82(25501);
            case 16781862:
                return C0201.m82(25500);
            case 16781875:
                return C0201.m82(25499);
            case 16781876:
                return C0201.m82(25498);
            case 16782092:
                return C0201.m82(25497);
            case 16782119:
                return C0201.m82(25496);
            case 24121422:
                return C0201.m82(25495);
            case 24121426:
                return C0201.m82(25494);
            case 24122112:
                return C0201.m82(25493);
            case 24122115:
                return C0201.m82(25492);
            case 33558598:
                return C0201.m82(25491);
            case 33559313:
                return C0201.m82(25490);
            case 33559317:
                return C0201.m82(25489);
            case 33559326:
                return C0201.m82(25488);
            case 40899351:
                return C0201.m82(25487);
            case 44040219:
                return C0201.m82(25486);
            case 50331648:
                return C0201.m82(25485);
            case 60817432:
                return C0201.m82(25484);
            case 67112991:
                return C0201.m82(25483);
            case 67112994:
                return C0201.m82(25482);
            case 67112997:
                return C0201.m82(25481);
            case 67113022:
                return C0201.m82(25480);
            case 67113025:
                return C0201.m82(25479);
            case 67113027:
                return C0201.m82(25478);
            case 67113738:
                return C0201.m82(25477);
            case 67113742:
                return C0201.m82(25476);
            case 67113747:
                return C0201.m82(25475);
            case 77594645:
                return C0201.m82(25474);
            case 77599579:
                return C0201.m82(25473);
            case 83886080:
                return C0201.m82(25472);
            case 83890232:
                return C0201.m82(25471);
            case 83890234:
                return C0201.m82(25470);
            case 83890236:
                return C0201.m82(25469);
            case 83891006:
                return C0201.m82(25468);
            case 94371855:
                return C0201.m82(25467);
            case 100667446:
                return C0201.m82(25466);
            case 117445404:
                return C0201.m82(25465);
            case 655519746:
                return C0201.m82(25464);
            default:
                return String.format(C0201.m82(25463), l);
        }
    }

    @Override // defpackage.as
    public String f(int i) {
        if (i == 1) {
            return z();
        }
        if (i == 2) {
            return w();
        }
        if (i == 3) {
            return A();
        }
        if (i == 67) {
            return v();
        }
        if (i == 256) {
            return x();
        }
        if (i != 288) {
            return super.f(i);
        }
        return y();
    }

    public String w() {
        Integer l = ((kv) this.a).l(2);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 4096) {
            return C0201.m82(25507);
        }
        if (intValue == 8192) {
            return C0201.m82(25506);
        }
        if (intValue == 12288) {
            return C0201.m82(25505);
        }
        if (intValue == 73728) {
            return C0201.m82(25504);
        }
        if (intValue == 3145728) {
            return C0201.m82(25503);
        }
        return String.format(C0201.m82(25502), l);
    }

    public String x() {
        return m(256, C0201.m82(25508), C0201.m82(25509));
    }

    public String y() {
        return m(288, C0201.m82(25510), C0201.m82(25511));
    }

    public String z() {
        return u(1, 2);
    }
}
