package defpackage;

import java.util.HashMap;
import vigqyno.C0201;

/* renamed from: zs  reason: default package */
/* compiled from: ExifThumbnailDirectory */
public class zs extends os {
    public static final HashMap<Integer, String> e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        e = hashMap;
        os.V(hashMap);
        e.put(513, C0201.m82(23087));
        e.put(514, C0201.m82(23088));
    }

    public zs() {
        E(new ys(this));
    }

    @Override // defpackage.tr
    public String n() {
        return C0201.m82(23089);
    }

    @Override // defpackage.tr
    public HashMap<Integer, String> w() {
        return e;
    }
}
