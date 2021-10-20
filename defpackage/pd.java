package defpackage;

import java.util.Arrays;
import java.util.List;
import vigqyno.C0201;

/* renamed from: pd  reason: default package */
/* compiled from: ShapeGroup */
public class pd implements dd {
    private final String a;
    private final List<dd> b;
    private final boolean c;

    public pd(String str, List<dd> list, boolean z) {
        this.a = str;
        this.b = list;
        this.c = z;
    }

    @Override // defpackage.dd
    public wa a(ga gaVar, td tdVar) {
        return new xa(gaVar, tdVar, this);
    }

    public List<dd> b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public boolean d() {
        return this.c;
    }

    public String toString() {
        return C0201.m82(36837) + this.a + C0201.m82(36838) + Arrays.toString(this.b.toArray()) + '}';
    }
}
