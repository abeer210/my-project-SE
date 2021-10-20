package defpackage;

import java.util.HashMap;
import vigqyno.C0201;

/* renamed from: qs  reason: default package */
/* compiled from: ExifIFD0Directory */
public class qs extends os {
    public static final HashMap<Integer, String> e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        e = hashMap;
        os.V(hashMap);
    }

    public qs() {
        E(new ps(this));
    }

    @Override // defpackage.tr
    public String n() {
        return C0201.m82(1939);
    }

    @Override // defpackage.tr
    public HashMap<Integer, String> w() {
        return e;
    }
}
