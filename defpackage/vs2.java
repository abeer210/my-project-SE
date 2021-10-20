package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import vigqyno.C0201;

/* renamed from: vs2  reason: default package */
/* compiled from: XrefTrailerResolver */
public class vs2 {
    private final Map<Long, c> a = new HashMap();
    private c b = null;
    private c c = null;

    /* renamed from: vs2$b */
    /* compiled from: XrefTrailerResolver */
    public enum b {
        TABLE,
        STREAM
    }

    /* access modifiers changed from: private */
    /* renamed from: vs2$c */
    /* compiled from: XrefTrailerResolver */
    public class c {
        public vq2 a;
        private b b;
        private final Map<er2, Long> c;

        private c(vs2 vs2) {
            this.a = null;
            this.c = new HashMap();
            this.b = b.TABLE;
        }
    }

    public Set<Long> a(int i) {
        if (this.c == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        long j = (long) (-i);
        for (Map.Entry entry : this.c.c.entrySet()) {
            if (((Long) entry.getValue()).longValue() == j) {
                hashSet.add(Long.valueOf(((er2) entry.getKey()).e()));
            }
        }
        return hashSet;
    }

    public vq2 b() {
        return this.b.a;
    }

    public vq2 c() {
        c cVar = this.c;
        if (cVar == null) {
            return null;
        }
        return cVar.a;
    }

    public Map<er2, Long> d() {
        c cVar = this.c;
        if (cVar == null) {
            return null;
        }
        return cVar.c;
    }

    public b e() {
        c cVar = this.c;
        if (cVar == null) {
            return null;
        }
        return cVar.b;
    }

    public void f(long j, b bVar) {
        Map<Long, c> map = this.a;
        Long valueOf = Long.valueOf(j);
        c cVar = new c();
        this.b = cVar;
        map.put(valueOf, cVar);
        this.b.b = bVar;
    }

    public void g(long j) {
        c cVar = this.c;
        String r1 = C0201.m82(10268);
        if (cVar != null) {
            Log.w(r1, C0201.m82(10269));
            return;
        }
        c cVar2 = new c();
        this.c = cVar2;
        cVar2.a = new vq2();
        c cVar3 = this.a.get(Long.valueOf(j));
        ArrayList<Long> arrayList = new ArrayList();
        if (cVar3 == null) {
            Log.w(r1, C0201.m82(10270) + j);
            arrayList.addAll(this.a.keySet());
            Collections.sort(arrayList);
        } else {
            this.c.b = cVar3.b;
            arrayList.add(Long.valueOf(j));
            while (true) {
                vq2 vq2 = cVar3.a;
                if (vq2 == null) {
                    break;
                }
                long P0 = vq2.P0(ar2.k0, -1);
                if (P0 == -1) {
                    break;
                }
                cVar3 = this.a.get(Long.valueOf(P0));
                if (cVar3 == null) {
                    Log.w(r1, C0201.m82(10271) + P0);
                    break;
                }
                arrayList.add(Long.valueOf(P0));
                if (arrayList.size() >= this.a.size()) {
                    break;
                }
            }
            Collections.reverse(arrayList);
        }
        for (Long l : arrayList) {
            c cVar4 = this.a.get(l);
            vq2 vq22 = cVar4.a;
            if (vq22 != null) {
                this.c.a.r(vq22);
            }
            this.c.c.putAll(cVar4.c);
        }
    }

    public void h(vq2 vq2) {
        c cVar = this.b;
        if (cVar == null) {
            Log.w(C0201.m82(10272), C0201.m82(10273));
        } else {
            cVar.a = vq2;
        }
    }

    public void i(er2 er2, long j) {
        c cVar = this.b;
        if (cVar == null) {
            Log.w(C0201.m82(10276), C0201.m82(10274) + er2.e() + C0201.m82(10275));
            return;
        }
        cVar.c.put(er2, Long.valueOf(j));
    }
}
