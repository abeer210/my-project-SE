package defpackage;

import java.util.HashMap;
import vigqyno.C0201;

/* renamed from: sv  reason: default package */
/* compiled from: SonyType6MakernoteDirectory */
public class sv extends tr {
    public static final HashMap<Integer, String> e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        e = hashMap;
        hashMap.put(1299, C0201.m82(6330));
        e.put(1300, C0201.m82(6331));
        e.put(8192, C0201.m82(6332));
    }

    public sv() {
        E(new rv(this));
    }

    @Override // defpackage.tr
    public String n() {
        return C0201.m82(6333);
    }

    @Override // defpackage.tr
    public HashMap<Integer, String> w() {
        return e;
    }
}
