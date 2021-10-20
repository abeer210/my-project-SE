package defpackage;

import com.google.firebase.components.d;
import com.google.firebase.components.e;
import com.google.firebase.components.n;
import java.util.Iterator;
import java.util.Set;

/* renamed from: b22  reason: default package */
/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
public class b22 implements f22 {
    private final String a;
    private final c22 b;

    public b22(Set<d22> set, c22 c22) {
        this.a = d(set);
        this.b = c22;
    }

    public static d<f22> b() {
        d.b a2 = d.a(f22.class);
        a2.b(n.f(d22.class));
        a2.f(a22.b());
        return a2.d();
    }

    public static /* synthetic */ f22 c(e eVar) {
        return new b22(eVar.d(d22.class), c22.a());
    }

    private static String d(Set<d22> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<d22> it = set.iterator();
        while (it.hasNext()) {
            d22 next = it.next();
            sb.append(next.b());
            sb.append('/');
            sb.append(next.c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // defpackage.f22
    public String a() {
        if (this.b.b().isEmpty()) {
            return this.a;
        }
        return this.a + ' ' + d(this.b.b());
    }
}
