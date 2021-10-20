package defpackage;

import java.util.Map;
import vigqyno.C0201;

/* renamed from: vv0  reason: default package */
public final class vv0<K> implements Map.Entry<K, Object> {
    private Map.Entry<K, tv0> a;

    private vv0(Map.Entry<K, tv0> entry) {
        this.a = entry;
    }

    public final tv0 a() {
        return this.a.getValue();
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.a.getValue() == null) {
            return null;
        }
        tv0.e();
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof qw0) {
            return this.a.getValue().c((qw0) obj);
        }
        throw new IllegalArgumentException(C0201.m82(17349));
    }
}
