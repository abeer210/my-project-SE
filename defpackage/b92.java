package defpackage;

import java.util.List;

/* renamed from: b92  reason: default package */
/* compiled from: BitArrayBuilder */
public final class b92 {
    public static b72 a(List<c92> list) {
        int size = (list.size() << 1) - 1;
        if (list.get(list.size() - 1).d() == null) {
            size--;
        }
        b72 b72 = new b72(size * 12);
        int i = 0;
        int b = list.get(0).d().b();
        for (int i2 = 11; i2 >= 0; i2--) {
            if (((1 << i2) & b) != 0) {
                b72.m(i);
            }
            i++;
        }
        for (int i3 = 1; i3 < list.size(); i3++) {
            c92 c92 = list.get(i3);
            int b2 = c92.c().b();
            for (int i4 = 11; i4 >= 0; i4--) {
                if (((1 << i4) & b2) != 0) {
                    b72.m(i);
                }
                i++;
            }
            if (c92.d() != null) {
                int b3 = c92.d().b();
                for (int i5 = 11; i5 >= 0; i5--) {
                    if (((1 << i5) & b3) != 0) {
                        b72.m(i);
                    }
                    i++;
                }
            }
        }
        return b72;
    }
}
