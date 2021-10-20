package defpackage;

import android.animation.Animator;
import android.view.View;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import vigqyno.C0201;

/* renamed from: so2  reason: default package */
/* compiled from: PropertyAnimatorCreator.kt */
public abstract class so2<T extends View> {
    private View a;
    private View b;

    public so2(View view, View view2) {
        ow2.c(view, C0201.m82(22223));
        ow2.c(view2, C0201.m82(22224));
        this.a = view;
        this.b = view2;
    }

    private final Class<T> c() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass != null) {
            Type type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
            if (type != null) {
                return (Class) type;
            }
            throw new fv2(C0201.m82(22225));
        }
        throw new fv2(C0201.m82(22226));
    }

    public abstract Animator a(ef2 ef2);

    public List<Class<?>> b() {
        return ov2.b();
    }

    public final View d() {
        return this.a;
    }

    public final View e() {
        return this.b;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: so2<T extends android.view.View> */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean f() {
        Class c = c();
        if (c.isInstance(this.a) && c.isInstance(this.b) && !b().contains(this.a.getClass()) && !b().contains(this.b.getClass())) {
            View view = this.a;
            String r1 = C0201.m82(22227);
            if (view != null) {
                View view2 = this.b;
                if (view2 == null) {
                    throw new fv2(r1);
                } else if (g(view, view2)) {
                    return true;
                }
            } else {
                throw new fv2(r1);
            }
        }
        return false;
    }

    public abstract boolean g(T t, T t2);
}
