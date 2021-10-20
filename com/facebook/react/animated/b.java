package com.facebook.react.animated;

import java.util.ArrayList;
import java.util.List;

/* compiled from: AnimatedNode */
public abstract class b {
    public List<b> a;
    public int b = 0;
    public int c = 0;
    public int d = -1;

    public final void a(b bVar) {
        if (this.a == null) {
            this.a = new ArrayList(1);
        }
        List<b> list = this.a;
        yh0.c(list);
        list.add(bVar);
        bVar.b(this);
    }

    public void b(b bVar) {
    }

    public void c(b bVar) {
    }

    public final void d(b bVar) {
        if (this.a != null) {
            bVar.c(this);
            this.a.remove(bVar);
        }
    }

    public void e() {
    }
}
