package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import vigqyno.C0201;

/* renamed from: ix  reason: default package */
/* compiled from: QuickTimeDescriptor */
public class ix extends as<kx> {
    public ix(kx kxVar) {
        super(kxVar);
    }

    private String v() {
        String[] s = ((kx) this.a).s(4098);
        if (s == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : s) {
            String a = jx.a(4096, str);
            if (a != null) {
                str = a;
            }
            arrayList.add(str);
        }
        return Arrays.toString(arrayList.toArray());
    }

    private String w() {
        Long m = ((kx) this.a).m(259);
        if (m == null) {
            return null;
        }
        double longValue = (double) m.longValue();
        double pow = Math.pow(60.0d, 2.0d);
        Double.isNaN(longValue);
        Integer valueOf = Integer.valueOf((int) (longValue / pow));
        double longValue2 = (double) m.longValue();
        double pow2 = Math.pow(60.0d, 1.0d);
        Double.isNaN(longValue2);
        double d = longValue2 / pow2;
        double intValue = (double) (valueOf.intValue() * 60);
        Double.isNaN(intValue);
        Integer valueOf2 = Integer.valueOf((int) (d - intValue));
        double longValue3 = (double) m.longValue();
        double pow3 = Math.pow(60.0d, 0.0d);
        Double.isNaN(longValue3);
        double d2 = longValue3 / pow3;
        double intValue2 = (double) (valueOf2.intValue() * 60);
        Double.isNaN(intValue2);
        return String.format(C0201.m82(23712), valueOf, valueOf2, Integer.valueOf((int) Math.ceil(d2 - intValue2)));
    }

    private String x() {
        byte[] e = ((kx) this.a).e(4096);
        if (e == null) {
            return null;
        }
        return jx.a(4096, new String(e));
    }

    @Override // defpackage.as
    public String f(int i) {
        if (i == 259) {
            return w();
        }
        if (i == 4096) {
            return x();
        }
        if (i != 4098) {
            return super.f(i);
        }
        return v();
    }
}
