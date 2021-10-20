package defpackage;

import java.util.HashMap;
import vigqyno.C0201;

/* renamed from: ct  reason: default package */
/* compiled from: GpsDirectory */
public class ct extends os {
    public static final HashMap<Integer, String> e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        e = hashMap;
        os.V(hashMap);
        e.put(0, C0201.m82(8757));
        e.put(1, C0201.m82(8758));
        e.put(2, C0201.m82(8759));
        e.put(3, C0201.m82(8760));
        e.put(4, C0201.m82(8761));
        e.put(5, C0201.m82(8762));
        e.put(6, C0201.m82(8763));
        e.put(7, C0201.m82(8764));
        e.put(8, C0201.m82(8765));
        e.put(9, C0201.m82(8766));
        e.put(10, C0201.m82(8767));
        e.put(11, C0201.m82(8768));
        e.put(12, C0201.m82(8769));
        e.put(13, C0201.m82(8770));
        e.put(14, C0201.m82(8771));
        e.put(15, C0201.m82(8772));
        e.put(16, C0201.m82(8773));
        e.put(17, C0201.m82(8774));
        e.put(18, C0201.m82(8775));
        e.put(19, C0201.m82(8776));
        e.put(20, C0201.m82(8777));
        e.put(21, C0201.m82(8778));
        e.put(22, C0201.m82(8779));
        e.put(23, C0201.m82(8780));
        e.put(24, C0201.m82(8781));
        e.put(25, C0201.m82(8782));
        e.put(26, C0201.m82(8783));
        e.put(27, C0201.m82(8784));
        e.put(28, C0201.m82(8785));
        e.put(29, C0201.m82(8786));
        e.put(30, C0201.m82(8787));
    }

    public ct() {
        E(new bt(this));
    }

    public ir W() {
        mr[] q = q(2);
        mr[] q2 = q(4);
        String r = r(1);
        String r2 = r(3);
        if (!(q == null || q.length != 3 || q2 == null || q2.length != 3 || r == null || r2 == null)) {
            Double c = ir.c(q[0], q[1], q[2], r.equalsIgnoreCase(C0201.m82(8788)));
            Double c2 = ir.c(q2[0], q2[1], q2[2], r2.equalsIgnoreCase(C0201.m82(8789)));
            if (!(c == null || c2 == null)) {
                return new ir(c.doubleValue(), c2.doubleValue());
            }
        }
        return null;
    }

    @Override // defpackage.tr
    public String n() {
        return C0201.m82(8790);
    }

    @Override // defpackage.tr
    public HashMap<Integer, String> w() {
        return e;
    }
}
