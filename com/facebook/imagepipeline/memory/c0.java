package com.facebook.imagepipeline.memory;

import java.util.LinkedList;

/* compiled from: OOMSoftReferenceBucket */
public class c0<V> extends f<V> {
    private LinkedList<w60<V>> f = new LinkedList<>();

    public c0(int i, int i2, int i3) {
        super(i, i2, i3, false);
    }

    @Override // com.facebook.imagepipeline.memory.f
    public void a(V v) {
        w60<V> poll = this.f.poll();
        if (poll == null) {
            poll = new w60<>();
        }
        poll.c(v);
        this.c.add(poll);
    }

    @Override // com.facebook.imagepipeline.memory.f
    public V g() {
        w60<V> w60 = (w60) this.c.poll();
        V b = w60.b();
        w60.a();
        this.f.add(w60);
        return b;
    }
}
