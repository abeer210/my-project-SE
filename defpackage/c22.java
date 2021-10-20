package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: c22  reason: default package */
/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
public class c22 {
    private static volatile c22 b;
    private final Set<d22> a = new HashSet();

    public static c22 a() {
        c22 c22 = b;
        if (c22 == null) {
            synchronized (c22.class) {
                c22 = b;
                if (c22 == null) {
                    c22 = new c22();
                    b = c22;
                }
            }
        }
        return c22;
    }

    public Set<d22> b() {
        Set<d22> unmodifiableSet;
        synchronized (this.a) {
            unmodifiableSet = Collections.unmodifiableSet(this.a);
        }
        return unmodifiableSet;
    }
}
