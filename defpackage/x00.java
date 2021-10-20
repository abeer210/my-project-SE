package defpackage;

import java.util.HashMap;
import vigqyno.C0201;

/* renamed from: x00  reason: default package */
/* compiled from: PsdHeaderDirectory */
public class x00 extends tr {
    public static final HashMap<Integer, String> e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        e = hashMap;
        hashMap.put(1, C0201.m82(3379));
        e.put(2, C0201.m82(3380));
        e.put(3, C0201.m82(3381));
        e.put(4, C0201.m82(3382));
        e.put(5, C0201.m82(3383));
    }

    public x00() {
        E(new w00(this));
    }

    @Override // defpackage.tr
    public String n() {
        return C0201.m82(3384);
    }

    @Override // defpackage.tr
    public HashMap<Integer, String> w() {
        return e;
    }
}
