package com.facebook.imagepipeline.memory;

import java.util.LinkedList;
import java.util.Queue;
import vigqyno.C0201;

/* compiled from: Bucket */
public class f<V> {
    public final int a;
    public final int b;
    public final Queue c;
    private final boolean d;
    private int e;

    public f(int i, int i2, int i3, boolean z) {
        boolean z2 = true;
        z50.i(i > 0);
        z50.i(i2 >= 0);
        z50.i(i3 < 0 ? false : z2);
        this.a = i;
        this.b = i2;
        this.c = new LinkedList();
        this.e = i3;
        this.d = z;
    }

    public void a(V v) {
        this.c.add(v);
    }

    public void b() {
        z50.i(this.e > 0);
        this.e--;
    }

    @Deprecated
    public V c() {
        V g = g();
        if (g != null) {
            this.e++;
        }
        return g;
    }

    public int d() {
        return this.c.size();
    }

    public void e() {
        this.e++;
    }

    public boolean f() {
        return this.e + d() > this.b;
    }

    public V g() {
        return (V) this.c.poll();
    }

    public void h(V v) {
        z50.g(v);
        boolean z = false;
        if (this.d) {
            if (this.e > 0) {
                z = true;
            }
            z50.i(z);
            this.e--;
            a(v);
            return;
        }
        int i = this.e;
        if (i > 0) {
            this.e = i - 1;
            a(v);
            return;
        }
        f60.k(C0201.m82(36370), C0201.m82(36371), v);
    }
}
