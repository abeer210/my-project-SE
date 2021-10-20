package defpackage;

import android.graphics.RectF;
import defpackage.tm0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/* renamed from: ul0  reason: default package */
/* compiled from: CacheManager */
public class ul0 {
    private final PriorityQueue<pm0> a = new PriorityQueue<>(tm0.a.a, this.e);
    private final PriorityQueue<pm0> b = new PriorityQueue<>(tm0.a.a, this.e);
    private final List<pm0> c = new ArrayList();
    private final Object d = new Object();
    private final a e = new a(this);

    /* renamed from: ul0$a */
    /* compiled from: CacheManager */
    class a implements Comparator<pm0> {
        public a(ul0 ul0) {
        }

        /* renamed from: a */
        public int compare(pm0 pm0, pm0 pm02) {
            if (pm0.a() == pm02.a()) {
                return 0;
            }
            return pm0.a() > pm02.a() ? 1 : -1;
        }
    }

    private void a(Collection<pm0> collection, pm0 pm0) {
        for (pm0 pm02 : collection) {
            if (pm02.equals(pm0)) {
                pm0.d().recycle();
                return;
            }
        }
        collection.add(pm0);
    }

    private static pm0 e(PriorityQueue<pm0> priorityQueue, pm0 pm0) {
        Iterator<pm0> it = priorityQueue.iterator();
        while (it.hasNext()) {
            pm0 next = it.next();
            if (next.equals(pm0)) {
                return next;
            }
        }
        return null;
    }

    private void h() {
        synchronized (this.d) {
            while (this.b.size() + this.a.size() >= tm0.a.a && !this.a.isEmpty()) {
                this.a.poll().d().recycle();
            }
            while (this.b.size() + this.a.size() >= tm0.a.a && !this.b.isEmpty()) {
                this.b.poll().d().recycle();
            }
        }
    }

    public void b(pm0 pm0) {
        synchronized (this.d) {
            h();
            this.b.offer(pm0);
        }
    }

    public void c(pm0 pm0) {
        synchronized (this.c) {
            while (this.c.size() >= tm0.a.b) {
                this.c.remove(0).d().recycle();
            }
            a(this.c, pm0);
        }
    }

    public boolean d(int i, RectF rectF) {
        pm0 pm0 = new pm0(i, null, rectF, true, 0);
        synchronized (this.c) {
            for (pm0 pm02 : this.c) {
                if (pm02.equals(pm0)) {
                    return true;
                }
            }
            return false;
        }
    }

    public List<pm0> f() {
        ArrayList arrayList;
        synchronized (this.d) {
            arrayList = new ArrayList(this.a);
            arrayList.addAll(this.b);
        }
        return arrayList;
    }

    public List<pm0> g() {
        List<pm0> list;
        synchronized (this.c) {
            list = this.c;
        }
        return list;
    }

    public void i() {
        synchronized (this.d) {
            this.a.addAll(this.b);
            this.b.clear();
        }
    }

    public void j() {
        synchronized (this.d) {
            Iterator<pm0> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().d().recycle();
            }
            this.a.clear();
            Iterator<pm0> it2 = this.b.iterator();
            while (it2.hasNext()) {
                it2.next().d().recycle();
            }
            this.b.clear();
        }
        synchronized (this.c) {
            for (pm0 pm0 : this.c) {
                pm0.d().recycle();
            }
            this.c.clear();
        }
    }

    public boolean k(int i, RectF rectF, int i2) {
        pm0 pm0 = new pm0(i, null, rectF, false, 0);
        synchronized (this.d) {
            pm0 e2 = e(this.a, pm0);
            boolean z = true;
            if (e2 != null) {
                this.a.remove(e2);
                e2.f(i2);
                this.b.offer(e2);
                return true;
            }
            if (e(this.b, pm0) == null) {
                z = false;
            }
            return z;
        }
    }
}
