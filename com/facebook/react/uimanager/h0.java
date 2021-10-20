package com.facebook.react.uimanager;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.facebook.react.common.f;
import vigqyno.C0201;

/* compiled from: ShadowNodeRegistry */
public class h0 {
    private final SparseArray<a0> a = new SparseArray<>();
    private final SparseBooleanArray b = new SparseBooleanArray();
    private final f c = new f();

    public void a(a0 a0Var) {
        this.c.a();
        this.a.put(a0Var.getReactTag(), a0Var);
    }

    public void b(a0 a0Var) {
        this.c.a();
        int reactTag = a0Var.getReactTag();
        this.a.put(reactTag, a0Var);
        this.b.put(reactTag, true);
    }

    public a0 c(int i) {
        this.c.a();
        return this.a.get(i);
    }

    public int d() {
        this.c.a();
        return this.b.size();
    }

    public int e(int i) {
        this.c.a();
        return this.b.keyAt(i);
    }

    public boolean f(int i) {
        this.c.a();
        return this.b.get(i);
    }

    public void g(int i) {
        this.c.a();
        if (!this.b.get(i)) {
            this.a.remove(i);
            return;
        }
        throw new g(C0201.m82(37244) + i + C0201.m82(37245));
    }

    public void h(int i) {
        this.c.a();
        if (i != -1) {
            if (this.b.get(i)) {
                this.a.remove(i);
                this.b.delete(i);
                return;
            }
            throw new g(C0201.m82(37246) + i + C0201.m82(37247));
        }
    }
}
