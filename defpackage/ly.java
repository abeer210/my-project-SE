package defpackage;

import java.util.HashMap;
import vigqyno.C0201;

/* renamed from: ly  reason: default package */
/* compiled from: QuickTimeSoundDirectory */
public class ly extends kx {
    public static final HashMap<Integer, String> f;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f = hashMap;
        gy.V(hashMap);
        f.put(769, C0201.m82(30429));
        f.put(770, C0201.m82(30430));
        f.put(771, C0201.m82(30431));
        f.put(772, C0201.m82(30432));
        f.put(773, C0201.m82(30433));
    }

    public ly() {
        E(new ky(this));
    }

    @Override // defpackage.kx, defpackage.tr
    public String n() {
        return C0201.m82(30434);
    }

    @Override // defpackage.kx, defpackage.tr
    public HashMap<Integer, String> w() {
        return f;
    }
}
