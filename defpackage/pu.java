package defpackage;

import vigqyno.C0201;

/* renamed from: pu  reason: default package */
/* compiled from: OlympusImageProcessingMakernoteDescriptor */
public class pu extends as<qu> {
    public pu(qu quVar) {
        super(quVar);
    }

    public String A() {
        return m(6401, C0201.m82(38723), C0201.m82(38724));
    }

    public String B() {
        int[] k = ((qu) this.a).k(4124);
        if (k == null) {
            Integer l = ((qu) this.a).l(4124);
            if (l == null) {
                return null;
            }
            k = new int[]{l.intValue()};
        }
        if (k.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        short s = (short) k[0];
        if (s == 0) {
            sb.append(C0201.m82(38729));
        } else if (s == 2) {
            sb.append(C0201.m82(38728));
        } else if (s != 3) {
            sb.append(C0201.m82(38725));
            sb.append((int) ((short) k[0]));
            sb.append(C0201.m82(38726));
        } else {
            sb.append(C0201.m82(38727));
        }
        if (k.length > 1) {
            sb.append(C0201.m82(38730));
            sb.append((int) ((short) k[1]));
        }
        return sb.toString();
    }

    public String C() {
        Integer l = ((qu) this.a).l(4112);
        if (l == null) {
            return null;
        }
        if (l.intValue() == 0) {
            return C0201.m82(38731);
        }
        StringBuilder sb = new StringBuilder();
        short shortValue = l.shortValue();
        if ((shortValue & 1) != 0) {
            sb.append(C0201.m82(38732));
        }
        if (((shortValue >> 1) & 1) != 0) {
            sb.append(C0201.m82(38733));
        }
        if (((shortValue >> 2) & 1) != 0) {
            sb.append(C0201.m82(38734));
        }
        return sb.substring(0, sb.length() - 2);
    }

    public String D() {
        return m(4114, C0201.m82(38735), C0201.m82(38736));
    }

    @Override // defpackage.as
    public String f(int i) {
        if (i == 0) {
            return y();
        }
        if (i == 512) {
            return w();
        }
        if (i == 4124) {
            return B();
        }
        if (i == 4370) {
            return v();
        }
        if (i == 6400) {
            return z();
        }
        if (i == 6401) {
            return A();
        }
        switch (i) {
            case 4112:
                return C();
            case 4113:
                return x();
            case 4114:
                return D();
            default:
                return super.f(i);
        }
    }

    public String v() {
        byte[] e = ((qu) this.a).e(4370);
        if (e == null || e.length < 2) {
            return null;
        }
        String format = String.format(C0201.m82(38737), Byte.valueOf(e[0]), Byte.valueOf(e[1]));
        if (format.equals(C0201.m82(38738))) {
            return C0201.m82(38739);
        }
        if (format.equals(C0201.m82(38740))) {
            return C0201.m82(38741);
        }
        if (format.equals(C0201.m82(38742))) {
            return C0201.m82(38743);
        }
        if (format.equals(C0201.m82(38744))) {
            return C0201.m82(38745);
        }
        if (format.equals(C0201.m82(38746))) {
            return C0201.m82(38747);
        }
        if (format.equals(C0201.m82(38748))) {
            return C0201.m82(38749);
        }
        if (format.equals(C0201.m82(38750))) {
            return C0201.m82(38751);
        }
        if (format.equals(C0201.m82(38752))) {
            return C0201.m82(38753);
        }
        if (format.equals(C0201.m82(38754))) {
            return C0201.m82(38755);
        }
        if (format.equals(C0201.m82(38756))) {
            return C0201.m82(38757);
        }
        if (format.equals(C0201.m82(38758))) {
            return C0201.m82(38759);
        }
        if (format.equals(C0201.m82(38760))) {
            return C0201.m82(38761);
        }
        if (format.equals(C0201.m82(38762))) {
            return C0201.m82(38763);
        }
        if (format.equals(C0201.m82(38764))) {
            return C0201.m82(38765);
        }
        return C0201.m82(38766) + format + C0201.m82(38767);
    }

    public String w() {
        int[] k = ((qu) this.a).k(512);
        if (k == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k.length; i++) {
            if (i != 0) {
                sb.append(C0201.m82(38768));
            }
            sb.append((int) ((short) k[i]));
        }
        return sb.toString();
    }

    public String x() {
        return m(4113, C0201.m82(38769), C0201.m82(38770));
    }

    public String y() {
        return u(0, 4);
    }

    public String z() {
        byte[] e = ((qu) this.a).e(6400);
        if (e == null || e.length < 2) {
            return null;
        }
        String format = String.format(C0201.m82(38771), Byte.valueOf(e[0]), Byte.valueOf(e[1]));
        if (format.equals(C0201.m82(38772))) {
            return C0201.m82(38773);
        }
        if (format.equals(C0201.m82(38774))) {
            return C0201.m82(38775);
        }
        return C0201.m82(38776) + format + C0201.m82(38777);
    }
}
