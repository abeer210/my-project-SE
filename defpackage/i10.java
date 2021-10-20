package defpackage;

import java.util.HashMap;
import vigqyno.C0201;

/* renamed from: i10  reason: default package */
/* compiled from: WebpDirectory */
public class i10 extends tr {
    public static final HashMap<Integer, String> e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        e = hashMap;
        hashMap.put(1, C0201.m82(33801));
        e.put(2, C0201.m82(33802));
        e.put(3, C0201.m82(33803));
        e.put(4, C0201.m82(33804));
    }

    public i10() {
        E(new h10(this));
    }

    @Override // defpackage.tr
    public String n() {
        return C0201.m82(33805);
    }

    @Override // defpackage.tr
    public HashMap<Integer, String> w() {
        return e;
    }
}
