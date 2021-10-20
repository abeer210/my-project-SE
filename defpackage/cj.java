package defpackage;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import vigqyno.C0201;

/* renamed from: cj  reason: default package */
/* compiled from: DiskCacheWriteLocker */
public final class cj {
    private final Map<String, a> a = new HashMap();
    private final b b = new b();

    /* access modifiers changed from: private */
    /* renamed from: cj$a */
    /* compiled from: DiskCacheWriteLocker */
    public static class a {
        public final Lock a = new ReentrantLock();
        public int b;
    }

    /* renamed from: cj$b */
    /* compiled from: DiskCacheWriteLocker */
    private static class b {
        private final Queue<a> a = new ArrayDeque();

        public a a() {
            a poll;
            synchronized (this.a) {
                poll = this.a.poll();
            }
            return poll == null ? new a() : poll;
        }

        public void b(a aVar) {
            synchronized (this.a) {
                if (this.a.size() < 10) {
                    this.a.offer(aVar);
                }
            }
        }
    }

    public void a(String str) {
        a aVar;
        synchronized (this) {
            aVar = this.a.get(str);
            if (aVar == null) {
                aVar = this.b.a();
                this.a.put(str, aVar);
            }
            aVar.b++;
        }
        aVar.a.lock();
    }

    public void b(String str) {
        a aVar;
        synchronized (this) {
            a aVar2 = this.a.get(str);
            ep.d(aVar2);
            aVar = aVar2;
            if (aVar.b >= 1) {
                int i = aVar.b - 1;
                aVar.b = i;
                if (i == 0) {
                    a remove = this.a.remove(str);
                    if (remove.equals(aVar)) {
                        this.b.b(remove);
                    } else {
                        throw new IllegalStateException(C0201.m82(8031) + aVar + C0201.m82(8032) + remove + C0201.m82(8033) + str);
                    }
                }
            } else {
                throw new IllegalStateException(C0201.m82(8034) + str + C0201.m82(8035) + aVar.b);
            }
        }
        aVar.a.unlock();
    }
}
