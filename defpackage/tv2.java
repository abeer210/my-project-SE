package defpackage;

import java.util.Collection;
import java.util.Iterator;
import vigqyno.C0201;

/* renamed from: tv2  reason: default package */
/* compiled from: MutableCollections.kt */
public class tv2 extends sv2 {
    public static final <T> boolean g(Collection<? super T> collection, Iterable<? extends T> iterable) {
        ow2.c(collection, C0201.m82(31558));
        ow2.c(iterable, C0201.m82(31559));
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z = false;
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (collection.add((Object) it.next())) {
                z = true;
            }
        }
        return z;
    }
}
