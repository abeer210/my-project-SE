package defpackage;

import java.util.HashMap;
import vigqyno.C0201;

/* renamed from: fs  reason: default package */
/* compiled from: AviDirectory */
public class fs extends tr {
    public static final HashMap<Integer, String> e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        e = hashMap;
        hashMap.put(1, C0201.m82(15749));
        e.put(2, C0201.m82(15750));
        e.put(3, C0201.m82(15751));
        e.put(4, C0201.m82(15752));
        e.put(5, C0201.m82(15753));
        e.put(6, C0201.m82(15754));
        e.put(7, C0201.m82(15755));
        e.put(8, C0201.m82(15756));
    }

    public fs() {
        E(new es(this));
    }

    @Override // defpackage.tr
    public String n() {
        return C0201.m82(15757);
    }

    @Override // defpackage.tr
    public HashMap<Integer, String> w() {
        return e;
    }
}
