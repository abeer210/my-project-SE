package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import com.bumptech.glide.c;
import java.util.List;
import java.util.Map;

/* compiled from: GlideContext */
public class e extends ContextWrapper {
    public static final l<?, ?> k = new b();
    private final ni a;
    private final i b;
    private final ko c;
    private final c.a d;
    private final List<zn<Object>> e;
    private final Map<Class<?>, l<?, ?>> f;
    private final wh g;
    private final boolean h;
    private final int i;
    private ao j;

    public e(Context context, ni niVar, i iVar, ko koVar, c.a aVar, Map<Class<?>, l<?, ?>> map, List<zn<Object>> list, wh whVar, boolean z, int i2) {
        super(context.getApplicationContext());
        this.a = niVar;
        this.b = iVar;
        this.c = koVar;
        this.d = aVar;
        this.e = list;
        this.f = map;
        this.g = whVar;
        this.h = z;
        this.i = i2;
    }

    public <X> oo<ImageView, X> a(ImageView imageView, Class<X> cls) {
        return this.c.a(imageView, cls);
    }

    public ni b() {
        return this.a;
    }

    public List<zn<Object>> c() {
        return this.e;
    }

    public synchronized ao d() {
        if (this.j == null) {
            this.j = (ao) this.d.a().P();
        }
        return this.j;
    }

    public <T> l<?, T> e(Class<T> cls) {
        l<?, T> lVar = (l<?, T>) this.f.get(cls);
        if (lVar == null) {
            for (Map.Entry<Class<?>, l<?, ?>> entry : this.f.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    lVar = (l<?, T>) entry.getValue();
                }
            }
        }
        return lVar == null ? (l<?, T>) k : lVar;
    }

    public wh f() {
        return this.g;
    }

    public int g() {
        return this.i;
    }

    public i h() {
        return this.b;
    }

    public boolean i() {
        return this.h;
    }
}
