package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* renamed from: v50  reason: default package */
/* compiled from: ImmutableList */
public class v50<E> extends ArrayList<E> {
    private v50(int i) {
        super(i);
    }

    public static <E> v50<E> a(E... eArr) {
        v50<E> v50 = new v50<>(eArr.length);
        Collections.addAll(v50, eArr);
        return v50;
    }
}
