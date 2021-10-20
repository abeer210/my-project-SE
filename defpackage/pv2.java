package defpackage;

import java.util.Collection;
import vigqyno.C0201;

/* renamed from: pv2  reason: default package */
/* compiled from: Iterables.kt */
public class pv2 extends ov2 {
    public static <T> int e(Iterable<? extends T> iterable, int i) {
        ow2.c(iterable, C0201.m82(21244));
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }
}
