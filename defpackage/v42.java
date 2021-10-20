package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: v42  reason: default package */
/* compiled from: BiMultiMap */
public class v42<K> extends HashMap<K, Object> {
    private final Map<Object, K> a = new HashMap();

    /* renamed from: a */
    public v42<K> clone() {
        v42<K> v42 = new v42<>();
        v42.putAll((Map) super.clone());
        return v42;
    }

    public void clear() {
        super.clear();
        this.a.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
    public Object put(K k, Object obj) {
        this.a.put(obj, k);
        return super.put(k, obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: v42<K> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
    public void putAll(Map<? extends K, ?> map) {
        for (Map.Entry<? extends K, ?> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
    public Object remove(Object obj) {
        Object remove = super.remove(obj);
        if (remove instanceof Collection) {
            for (Object obj2 : (Collection) remove) {
                this.a.remove(obj2);
            }
        } else {
            this.a.remove(remove);
        }
        return remove;
    }
}
