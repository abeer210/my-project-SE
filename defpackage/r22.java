package defpackage;

import java.util.Map;
import java.util.Set;

/* renamed from: r22  reason: default package */
/* compiled from: JsonObject */
public final class r22 extends o22 {
    private final k32<String, o22> a = new k32<>();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof r22) && ((r22) obj).a.equals(this.a));
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public void i(String str, o22 o22) {
        if (o22 == null) {
            o22 = q22.a;
        }
        this.a.put(str, o22);
    }

    public Set<Map.Entry<String, o22>> j() {
        return this.a.entrySet();
    }
}
