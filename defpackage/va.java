package defpackage;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* renamed from: va  reason: default package */
/* compiled from: CompoundTrimPathContent */
public class va {
    private List<mb> a = new ArrayList();

    public void a(mb mbVar) {
        this.a.add(mbVar);
    }

    public void b(Path path) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            ag.b(path, this.a.get(size));
        }
    }
}
