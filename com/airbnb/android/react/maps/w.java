package com.airbnb.android.react.maps;

import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: ViewChangesTracker */
public class w {
    private static w f;
    private Handler a = new Handler(Looper.myLooper());
    private LinkedList<g> b = new LinkedList<>();
    private boolean c = false;
    private Runnable d = new a();
    private LinkedList<g> e = new LinkedList<>();

    /* compiled from: ViewChangesTracker */
    class a implements Runnable {
        public a() {
        }

        public void run() {
            w.this.c = false;
            w.this.h();
            if (w.this.b.size() > 0) {
                w.this.a.postDelayed(w.this.d, 40);
            }
        }
    }

    private w() {
    }

    public static w f() {
        if (f == null) {
            synchronized (w.class) {
                f = new w();
            }
        }
        return f;
    }

    public void e(g gVar) {
        this.b.add(gVar);
        if (!this.c) {
            this.c = true;
            this.a.postDelayed(this.d, 40);
        }
    }

    public void g(g gVar) {
        this.b.remove(gVar);
    }

    public void h() {
        Iterator<g> it = this.b.iterator();
        while (it.hasNext()) {
            g next = it.next();
            if (!next.B()) {
                this.e.add(next);
            }
        }
        if (this.e.size() > 0) {
            this.b.removeAll(this.e);
            this.e.clear();
        }
    }
}
