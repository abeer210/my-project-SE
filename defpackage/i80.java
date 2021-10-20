package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import vigqyno.C0201;

/* renamed from: i80  reason: default package */
/* compiled from: ForwardingImageOriginListener */
public class i80 implements j80 {
    private final List<j80> a;

    public i80(j80... j80Arr) {
        ArrayList arrayList = new ArrayList(j80Arr.length);
        this.a = arrayList;
        Collections.addAll(arrayList, j80Arr);
    }

    @Override // defpackage.j80
    public synchronized void a(String str, int i, boolean z, String str2) {
        int size = this.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            j80 j80 = this.a.get(i2);
            if (j80 != null) {
                try {
                    j80.a(str, i, z, str2);
                } catch (Exception e) {
                    f60.j(C0201.m82(5990), C0201.m82(5991), e);
                }
            }
        }
    }

    public synchronized void b(j80 j80) {
        this.a.add(j80);
    }

    public synchronized void c(j80 j80) {
        this.a.remove(j80);
    }
}
