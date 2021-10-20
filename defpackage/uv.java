package defpackage;

import java.util.HashMap;
import vigqyno.C0201;

/* renamed from: uv  reason: default package */
/* compiled from: FileTypeDirectory */
public class uv extends tr {
    public static final HashMap<Integer, String> e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        e = hashMap;
        hashMap.put(1, C0201.m82(10824));
        e.put(2, C0201.m82(10825));
        e.put(3, C0201.m82(10826));
        e.put(4, C0201.m82(10827));
    }

    public uv(jp jpVar) {
        E(new tv(this));
        R(1, jpVar.f());
        R(2, jpVar.d());
        if (jpVar.e() != null) {
            R(3, jpVar.e());
        }
        if (jpVar.b() != null) {
            R(4, jpVar.b());
        }
    }

    @Override // defpackage.tr
    public String n() {
        return C0201.m82(10828);
    }

    @Override // defpackage.tr
    public HashMap<Integer, String> w() {
        return e;
    }
}
