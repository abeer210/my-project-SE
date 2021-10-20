package androidx.lifecycle;

import androidx.lifecycle.a;
import androidx.lifecycle.d;

public class ReflectiveGenericLifecycleObserver implements e {
    private final Object a;
    private final a.C0018a b;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.a = obj;
        this.b = a.c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.e
    public void c(g gVar, d.a aVar) {
        this.b.a(gVar, aVar, this.a);
    }
}
