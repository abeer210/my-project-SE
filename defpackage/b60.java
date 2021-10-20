package defpackage;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: b60  reason: default package */
/* compiled from: Sets */
public final class b60 {
    public static <E> CopyOnWriteArraySet<E> a() {
        return new CopyOnWriteArraySet<>();
    }

    public static <E> Set<E> b() {
        return c(new IdentityHashMap());
    }

    public static <E> Set<E> c(Map<E, Boolean> map) {
        return Collections.newSetFromMap(map);
    }
}
