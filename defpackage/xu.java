package defpackage;

import vigqyno.C0201;

/* renamed from: xu  reason: default package */
/* compiled from: OlympusRawInfoMakernoteDescriptor */
public class xu extends as<yu> {
    public xu(yu yuVar) {
        super(yuVar);
    }

    @Override // defpackage.as
    public String f(int i) {
        if (i == 0) {
            return u(0, 4);
        }
        if (i == 512) {
            return v();
        }
        if (i == 1537) {
            return x();
        }
        if (i != 4096) {
            return super.f(i);
        }
        return w();
    }

    public String v() {
        int[] k = ((yu) this.a).k(512);
        if (k == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k.length; i++) {
            sb.append((int) ((short) k[i]));
            if (i < k.length - 1) {
                sb.append(C0201.m82(18325));
            }
        }
        if (sb.length() == 0) {
            return null;
        }
        return sb.toString();
    }

    public String w() {
        Integer l = ((yu) this.a).l(4096);
        if (l == null) {
            return null;
        }
        short shortValue = l.shortValue();
        if (shortValue == 0) {
            return C0201.m82(18339);
        }
        if (shortValue == 20) {
            return C0201.m82(18338);
        }
        if (shortValue == 22) {
            return C0201.m82(18337);
        }
        if (shortValue == 256) {
            return C0201.m82(18336);
        }
        if (shortValue == 512) {
            return C0201.m82(18335);
        }
        switch (shortValue) {
            case 16:
                return C0201.m82(18334);
            case 17:
                return C0201.m82(18333);
            case 18:
                return C0201.m82(18332);
            default:
                switch (shortValue) {
                    case 33:
                        return C0201.m82(18331);
                    case 34:
                        return C0201.m82(18330);
                    case 35:
                        return C0201.m82(18329);
                    case 36:
                        return C0201.m82(18328);
                    default:
                        return C0201.m82(18326) + l + C0201.m82(18327);
                }
        }
    }

    public String x() {
        int[] k = ((yu) this.a).k(1537);
        if (k == null) {
            return null;
        }
        int length = k.length / 2;
        mr[] mrVarArr = new mr[length];
        for (int i = 0; i < k.length / 2; i++) {
            int i2 = i * 2;
            mrVarArr[i] = new mr((long) ((short) k[i2]), (long) ((short) k[i2 + 1]));
        }
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < length; i3++) {
            sb.append(mrVarArr[i3].doubleValue());
            if (i3 < length - 1) {
                sb.append(C0201.m82(18340));
            }
        }
        if (sb.length() == 0) {
            return null;
        }
        return sb.toString();
    }
}
