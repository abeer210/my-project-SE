package defpackage;

import java.util.Map;
import vigqyno.C0201;

/* renamed from: xl1  reason: default package */
public final class xl1<K> implements Map.Entry<K, Object> {
    private Map.Entry<K, vl1> a;

    private xl1(Map.Entry<K, vl1> entry) {
        this.a = entry;
    }

    public final vl1 a() {
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
        vl1.e();
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof tm1) {
            return this.a.getValue().d((tm1) obj);
        }
        throw new IllegalArgumentException(C0201.m82(24160));
    }
}
