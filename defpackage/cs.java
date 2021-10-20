package defpackage;

import java.util.HashMap;
import vigqyno.C0201;

/* renamed from: cs  reason: default package */
/* compiled from: AdobeJpegDirectory */
public class cs extends tr {
    private static final HashMap<Integer, String> e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        e = hashMap;
        hashMap.put(0, C0201.m82(8585));
        e.put(1, C0201.m82(8586));
        e.put(2, C0201.m82(8587));
        e.put(3, C0201.m82(8588));
    }

    public cs() {
        E(new bs(this));
    }

    @Override // defpackage.tr
    public String n() {
        return C0201.m82(8589);
    }

    @Override // defpackage.tr
    public HashMap<Integer, String> w() {
        return e;
    }
}
