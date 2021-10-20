package defpackage;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import vigqyno.C0201;

/* renamed from: kv2  reason: default package */
/* compiled from: _ArraysJvm.kt */
public class kv2 extends jv2 {
    public static final <T> List<T> a(T[] tArr) {
        ow2.c(tArr, C0201.m82(17197));
        List<T> a = lv2.a(tArr);
        ow2.b(a, C0201.m82(17198));
        return a;
    }

    public static final <T> void b(T[] tArr, Comparator<? super T> comparator) {
        ow2.c(tArr, C0201.m82(17199));
        ow2.c(comparator, C0201.m82(17200));
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }
}
