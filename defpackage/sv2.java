package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import vigqyno.C0201;

/* renamed from: sv2  reason: default package */
/* compiled from: MutableCollectionsJVM.kt */
public class sv2 extends rv2 {
    public static <T> void f(List<T> list, Comparator<? super T> comparator) {
        ow2.c(list, C0201.m82(3961));
        ow2.c(comparator, C0201.m82(3962));
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
