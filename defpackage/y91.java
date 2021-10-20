package defpackage;

import java.util.Map;
import vigqyno.C0201;

/* renamed from: y91  reason: default package */
public final class y91<K> implements Map.Entry<K, Object> {
    private Map.Entry<K, w91> a;

    private y91(Map.Entry<K, w91> entry) {
        this.a = entry;
    }

    public final w91 a() {
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
        w91.e();
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof wa1) {
            return this.a.getValue().b((wa1) obj);
        }
        throw new IllegalArgumentException(C0201.m82(12005));
    }
}
