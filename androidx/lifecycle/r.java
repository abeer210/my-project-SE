package androidx.lifecycle;

import java.util.HashMap;

/* compiled from: ViewModelStore */
public class r {
    private final HashMap<String, p> a = new HashMap<>();

    public final void a() {
        for (p pVar : this.a.values()) {
            pVar.a();
        }
        this.a.clear();
    }

    public final p b(String str) {
        return this.a.get(str);
    }

    public final void c(String str, p pVar) {
        p put = this.a.put(str, pVar);
        if (put != null) {
            put.c();
        }
    }
}
