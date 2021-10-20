package defpackage;

import java.util.List;
import vigqyno.C0201;

/* renamed from: ov2  reason: default package */
/* compiled from: Collections.kt */
public class ov2 extends nv2 {
    public static <T> List<T> b() {
        return yv2.a;
    }

    public static <T> List<T> c(T... tArr) {
        ow2.c(tArr, C0201.m82(32808));
        return tArr.length > 0 ? kv2.a(tArr) : b();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> d(List<? extends T> list) {
        ow2.c(list, C0201.m82(32809));
        int size = list.size();
        if (size == 0) {
            return b();
        }
        if (size != 1) {
            return list;
        }
        return nv2.a(list.get(0));
    }
}
