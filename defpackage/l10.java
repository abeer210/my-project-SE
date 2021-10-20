package defpackage;

import java.util.HashMap;
import vigqyno.C0201;

/* renamed from: l10  reason: default package */
/* compiled from: XmpDirectory */
public class l10 extends tr {
    public static final HashMap<Integer, String> f;
    private v8 e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f = hashMap;
        hashMap.put(65535, C0201.m82(12941));
    }

    public l10() {
        E(new k10(this));
    }

    public v8 V() {
        if (this.e == null) {
            this.e = new j9();
        }
        return this.e;
    }

    public void W(v8 v8Var) {
        this.e = v8Var;
        int i = 0;
        try {
            u8 it = v8Var.iterator();
            while (it.hasNext()) {
                if (((z9) it.next()).a() != null) {
                    i++;
                }
            }
            J(65535, i);
        } catch (t8 unused) {
        }
    }

    @Override // defpackage.tr
    public String n() {
        return C0201.m82(12942);
    }

    @Override // defpackage.tr
    public HashMap<Integer, String> w() {
        return f;
    }
}
