package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import vigqyno.C0201;

/* renamed from: bd  reason: default package */
/* compiled from: BaseAnimatableValue */
public abstract class bd<V, O> implements ad<V, O> {
    public final List<bg<V>> a;

    public bd(V v) {
        this(Collections.singletonList(new bg(v)));
    }

    @Override // defpackage.ad
    public List<bg<V>> b() {
        return this.a;
    }

    @Override // defpackage.ad
    public boolean c() {
        return this.a.isEmpty() || (this.a.size() == 1 && this.a.get(0).h());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.a.isEmpty()) {
            sb.append(C0201.m82(5131));
            sb.append(Arrays.toString(this.a.toArray()));
        }
        return sb.toString();
    }

    public bd(List<bg<V>> list) {
        this.a = list;
    }
}
