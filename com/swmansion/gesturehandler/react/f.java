package com.swmansion.gesturehandler.react;

import android.util.SparseArray;
import android.view.View;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayList;
import vigqyno.C0201;

/* compiled from: RNGestureHandlerRegistry */
public class f implements zp2 {
    private final SparseArray<wp2> a = new SparseArray<>();
    private final SparseArray<Integer> b = new SparseArray<>();
    private final SparseArray<ArrayList<wp2>> c = new SparseArray<>();

    /* access modifiers changed from: package-private */
    /* compiled from: RNGestureHandlerRegistry */
    public class a implements Runnable {
        public final /* synthetic */ wp2 a;

        public a(f fVar, wp2 wp2) {
            this.a = wp2;
        }

        public void run() {
            this.a.d();
        }
    }

    private synchronized void c(wp2 wp2) {
        Integer num = this.b.get(wp2.q());
        if (num != null) {
            this.b.remove(wp2.q());
            ArrayList<wp2> arrayList = this.c.get(num.intValue());
            if (arrayList != null) {
                arrayList.remove(wp2);
                if (arrayList.size() == 0) {
                    this.c.remove(num.intValue());
                }
            }
        }
        if (wp2.r() != null) {
            UiThreadUtil.runOnUiThread(new a(this, wp2));
        }
    }

    private synchronized void i(int i, wp2 wp2) {
        if (this.b.get(wp2.q()) == null) {
            this.b.put(wp2.q(), Integer.valueOf(i));
            ArrayList<wp2> arrayList = this.c.get(i);
            if (arrayList == null) {
                ArrayList<wp2> arrayList2 = new ArrayList<>(1);
                arrayList2.add(wp2);
                this.c.put(i, arrayList2);
            } else {
                arrayList.add(wp2);
            }
        } else {
            throw new IllegalStateException(C0201.m82(18260) + wp2 + C0201.m82(18261));
        }
    }

    @Override // defpackage.zp2
    public synchronized ArrayList<wp2> a(View view) {
        return g(view.getId());
    }

    public synchronized boolean b(int i, int i2) {
        wp2 wp2 = this.a.get(i);
        if (wp2 == null) {
            return false;
        }
        c(wp2);
        i(i2, wp2);
        return true;
    }

    public synchronized void d() {
        this.a.clear();
        this.b.clear();
        this.c.clear();
    }

    public synchronized void e(int i) {
        wp2 wp2 = this.a.get(i);
        if (wp2 != null) {
            c(wp2);
            this.a.remove(i);
        }
    }

    public synchronized wp2 f(int i) {
        return this.a.get(i);
    }

    public synchronized ArrayList<wp2> g(int i) {
        return this.c.get(i);
    }

    public synchronized void h(wp2 wp2) {
        this.a.put(wp2.q(), wp2);
    }
}
