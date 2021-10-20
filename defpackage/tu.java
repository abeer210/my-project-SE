package defpackage;

import java.util.HashMap;
import vigqyno.C0201;

/* renamed from: tu  reason: default package */
/* compiled from: OlympusRawDevelopment2MakernoteDescriptor */
public class tu extends as<uu> {
    private static final HashMap<Integer, String> b;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        b = hashMap;
        hashMap.put(0, C0201.m82(8665));
        b.put(1, C0201.m82(8666));
        b.put(2, C0201.m82(8667));
        b.put(3, C0201.m82(8668));
        b.put(4, C0201.m82(8669));
        b.put(5, C0201.m82(8670));
        b.put(6, C0201.m82(8671));
        b.put(9, C0201.m82(8672));
        b.put(10, C0201.m82(8673));
        b.put(12, C0201.m82(8674));
        b.put(13, C0201.m82(8675));
        b.put(14, C0201.m82(8676));
        b.put(15, C0201.m82(8677));
        b.put(16, C0201.m82(8678));
        b.put(17, C0201.m82(8679));
        b.put(18, C0201.m82(8680));
        b.put(19, C0201.m82(8681));
        b.put(20, C0201.m82(8682));
        b.put(21, C0201.m82(8683));
        b.put(22, C0201.m82(8684));
        b.put(23, C0201.m82(8685));
        b.put(24, C0201.m82(8686));
        b.put(25, C0201.m82(8687));
        b.put(26, C0201.m82(8688));
        b.put(27, C0201.m82(8689));
        b.put(28, C0201.m82(8690));
        b.put(29, C0201.m82(8691));
        b.put(31, C0201.m82(8692));
        b.put(32, C0201.m82(8693));
        b.put(33, C0201.m82(8694));
        b.put(34, C0201.m82(8695));
        b.put(35, C0201.m82(8696));
        b.put(36, C0201.m82(8697));
        b.put(37, C0201.m82(8698));
        b.put(38, C0201.m82(8699));
        b.put(39, C0201.m82(8700));
        b.put(40, C0201.m82(8701));
        b.put(41, C0201.m82(8702));
    }

    public tu(uu uuVar) {
        super(uuVar);
    }

    public String A() {
        Integer l = ((uu) this.a).l(266);
        if (l == null) {
            return null;
        }
        if (l.intValue() == 0) {
            return C0201.m82(8703);
        }
        StringBuilder sb = new StringBuilder();
        int intValue = l.intValue();
        if ((intValue & 1) != 0) {
            sb.append(C0201.m82(8704));
        }
        if (((intValue >> 1) & 1) != 0) {
            sb.append(C0201.m82(8705));
        }
        if (((intValue >> 2) & 1) != 0) {
            sb.append(C0201.m82(8706));
        }
        return sb.substring(0, sb.length() - 2);
    }

    public String B() {
        Integer l = ((uu) this.a).l(268);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 1) {
            return C0201.m82(8713);
        }
        if (intValue == 2) {
            return C0201.m82(8712);
        }
        if (intValue == 3) {
            return C0201.m82(8711);
        }
        if (intValue == 256) {
            return C0201.m82(8710);
        }
        if (intValue == 512) {
            return C0201.m82(8709);
        }
        return C0201.m82(8707) + l + C0201.m82(8708);
    }

    public String C() {
        return m(272, C0201.m82(8714), C0201.m82(8715), C0201.m82(8716), C0201.m82(8717), C0201.m82(8718));
    }

    public String D() {
        return m(273, C0201.m82(8719), C0201.m82(8720), C0201.m82(8721), C0201.m82(8722), C0201.m82(8723));
    }

    public String E() {
        return u(0, 4);
    }

    @Override // defpackage.as
    public String f(int i) {
        if (i == 0) {
            return E();
        }
        if (i == 256) {
            return z();
        }
        if (i == 289) {
            return w();
        }
        if (i == 272) {
            return C();
        }
        if (i == 273) {
            return D();
        }
        switch (i) {
            case 265:
                return x();
            case 266:
                return A();
            case 267:
                return y();
            case 268:
                return B();
            default:
                return super.f(i);
        }
    }

    public String v(int i) {
        int[] k = ((uu) this.a).k(i);
        if (k == null || k.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < k.length; i2++) {
            String r3 = C0201.m82(8724);
            if (i2 == 0) {
                sb.append(b.containsKey(Integer.valueOf(k[i2])) ? b.get(Integer.valueOf(k[i2])) : C0201.m82(8725));
            } else {
                sb.append(k[i2]);
                sb.append(r3);
            }
            sb.append(r3);
        }
        return sb.substring(0, sb.length() - 2);
    }

    public String w() {
        return v(289);
    }

    public String x() {
        return m(265, C0201.m82(8726), C0201.m82(8727), C0201.m82(8728));
    }

    public String y() {
        return m(267, C0201.m82(8729), C0201.m82(8730), C0201.m82(8731), C0201.m82(8732));
    }

    public String z() {
        return l(256, 1, C0201.m82(8733), C0201.m82(8734));
    }
}
