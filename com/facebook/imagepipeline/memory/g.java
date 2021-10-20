package com.facebook.imagepipeline.memory;

import android.util.SparseArray;
import java.util.LinkedList;
import vigqyno.C0201;

/* compiled from: BucketMap */
public class g<T> {
    public final SparseArray<b<T>> a = new SparseArray<>();
    public b<T> b;
    public b<T> c;

    /* access modifiers changed from: package-private */
    /* compiled from: BucketMap */
    public static class b<I> {
        public b<I> a;
        public int b;
        public LinkedList<I> c;
        public b<I> d;

        public String toString() {
            return C0201.m82(5292) + this.b + C0201.m82(5293);
        }

        private b(b<I> bVar, int i, LinkedList<I> linkedList, b<I> bVar2) {
            this.a = bVar;
            this.b = i;
            this.c = linkedList;
            this.d = bVar2;
        }
    }

    private void b(b<T> bVar) {
        if (bVar != null && bVar.c.isEmpty()) {
            d(bVar);
            this.a.remove(bVar.b);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.facebook.imagepipeline.memory.g$b<T> */
    /* JADX WARN: Multi-variable type inference failed */
    private void c(b<T> bVar) {
        if (this.b != bVar) {
            d(bVar);
            b bVar2 = (b<T>) this.b;
            if (bVar2 == null) {
                this.b = bVar;
                this.c = bVar;
                return;
            }
            bVar.d = bVar2;
            bVar2.a = bVar;
            this.b = bVar;
        }
    }

    private synchronized void d(b<T> bVar) {
        b bVar2 = (b<I>) bVar.a;
        b bVar3 = (b<I>) bVar.d;
        if (bVar2 != null) {
            bVar2.d = bVar3;
        }
        if (bVar3 != null) {
            bVar3.a = bVar2;
        }
        bVar.a = null;
        bVar.d = null;
        if (bVar == this.b) {
            this.b = bVar3;
        }
        if (bVar == this.c) {
            this.c = bVar2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    public synchronized T a(int i) {
        b<T> bVar = this.a.get(i);
        if (bVar == null) {
            return null;
        }
        I pollFirst = bVar.c.pollFirst();
        c(bVar);
        return pollFirst;
    }

    public synchronized void e(int i, T t) {
        b<T> bVar = this.a.get(i);
        if (bVar == null) {
            bVar = new b<>(null, i, new LinkedList(), null);
            this.a.put(i, bVar);
        }
        bVar.c.addLast(t);
        c(bVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    public synchronized T f() {
        b<T> bVar = this.c;
        if (bVar == null) {
            return null;
        }
        I pollLast = bVar.c.pollLast();
        b(bVar);
        return pollLast;
    }
}
