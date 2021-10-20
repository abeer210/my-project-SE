package defpackage;

import java.util.HashMap;
import vigqyno.C0201;

/* renamed from: rw  reason: default package */
/* compiled from: JfifDirectory */
public class rw extends tr {
    public static final HashMap<Integer, String> e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        e = hashMap;
        hashMap.put(5, C0201.m82(4353));
        e.put(7, C0201.m82(4354));
        e.put(10, C0201.m82(4355));
        e.put(8, C0201.m82(4356));
        e.put(12, C0201.m82(4357));
        e.put(13, C0201.m82(4358));
    }

    public rw() {
        E(new qw(this));
    }

    @Override // defpackage.tr
    public String n() {
        return C0201.m82(4359);
    }

    @Override // defpackage.tr
    public HashMap<Integer, String> w() {
        return e;
    }
}
