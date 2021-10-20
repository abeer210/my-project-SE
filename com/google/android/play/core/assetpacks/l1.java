package com.google.android.play.core.assetpacks;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import vigqyno.C0201;

public final class l1 {
    private static final gy1 f = new gy1(C0201.m82(16707));
    private final b0 a;
    private final fz1<i3> b;
    private final x0 c;
    private final Map<Integer, i1> d = new HashMap();
    private final ReentrantLock e = new ReentrantLock();

    public l1(b0 b0Var, fz1<i3> fz1, x0 x0Var, fz1<Executor> fz12) {
        this.a = b0Var;
        this.b = fz1;
        this.c = x0Var;
    }

    private final <T> T a(k1<T> k1Var) {
        try {
            b();
            return k1Var.a();
        } finally {
            f();
        }
    }

    private final Map<String, i1> o(List<String> list) {
        return (Map) a(new d1(this, list));
    }

    private final i1 q(int i) {
        Map<Integer, i1> map = this.d;
        Integer valueOf = Integer.valueOf(i);
        i1 i1Var = map.get(valueOf);
        if (i1Var != null) {
            return i1Var;
        }
        throw new t0(String.format(C0201.m82(16708), valueOf), i);
    }

    private static String r(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList(C0201.m82(16709));
        if (stringArrayList != null && !stringArrayList.isEmpty()) {
            return stringArrayList.get(0);
        }
        throw new t0(C0201.m82(16710));
    }

    private static <T> List<T> s(List<T> list) {
        return list == null ? Collections.emptyList() : list;
    }

    public final void b() {
        this.e.lock();
    }

    public final void c(int i) {
        a(new f1(this, i));
    }

    public final void d(String str, int i, long j) {
        a(new c1(this, str, i, j));
    }

    public final boolean e(Bundle bundle) {
        return ((Boolean) a(new a1(this, bundle))).booleanValue();
    }

    public final void f() {
        this.e.unlock();
    }

    public final /* synthetic */ void g(int i) {
        q(i).c.c = 5;
    }

    public final /* synthetic */ void h(String str, int i, long j) {
        i1 i1Var = o(Arrays.asList(str)).get(str);
        if (i1Var == null || v1.f(i1Var.c.c)) {
            f.e(String.format(C0201.m82(16711), str), new Object[0]);
        }
        this.a.A(str, i, j);
        i1Var.c.c = 4;
    }

    public final boolean i(Bundle bundle) {
        return ((Boolean) a(new b1(this, bundle))).booleanValue();
    }

    public final /* synthetic */ Boolean j(Bundle bundle) {
        int i = bundle.getInt(C0201.m82(16712));
        if (i == 0) {
            return Boolean.TRUE;
        }
        Map<Integer, i1> map = this.d;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf)) {
            return Boolean.TRUE;
        }
        i1 i1Var = this.d.get(valueOf);
        if (i1Var.c.c == 6) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(!v1.d(i1Var.c.c, bundle.getInt(jz1.a(C0201.m82(16713), r(bundle)))));
    }

    public final Map<Integer, i1> k() {
        return this.d;
    }

    public final /* synthetic */ Map l(List list) {
        HashMap hashMap = new HashMap();
        for (i1 i1Var : this.d.values()) {
            String str = i1Var.c.a;
            if (list.contains(str)) {
                i1 i1Var2 = (i1) hashMap.get(str);
                if ((i1Var2 == null ? -1 : i1Var2.a) < i1Var.a) {
                    hashMap.put(str, i1Var);
                }
            }
        }
        return hashMap;
    }

    public final /* synthetic */ void m(int i) {
        i1 q = q(i);
        if (v1.f(q.c.c)) {
            b0 b0Var = this.a;
            h1 h1Var = q.c;
            b0Var.A(h1Var.a, q.b, h1Var.b);
            h1 h1Var2 = q.c;
            int i2 = h1Var2.c;
            if (i2 == 5 || i2 == 6) {
                this.a.t(h1Var2.a);
                return;
            }
            return;
        }
        throw new t0(String.format(C0201.m82(16714), Integer.valueOf(i)), i);
    }

    public final /* synthetic */ Boolean n(Bundle bundle) {
        j1 j1Var;
        int i = bundle.getInt(C0201.m82(16715));
        if (i == 0) {
            return Boolean.FALSE;
        }
        Map<Integer, i1> map = this.d;
        Integer valueOf = Integer.valueOf(i);
        boolean containsKey = map.containsKey(valueOf);
        String r5 = C0201.m82(16716);
        String r6 = C0201.m82(16717);
        boolean z = false;
        if (containsKey) {
            i1 q = q(i);
            int i2 = bundle.getInt(jz1.a(r6, q.c.a));
            if (v1.d(q.c.c, i2)) {
                f.c(C0201.m82(16718), valueOf, Integer.valueOf(q.c.c));
                h1 h1Var = q.c;
                String str = h1Var.a;
                int i3 = h1Var.c;
                if (i3 == 4) {
                    this.b.a().a(i, str);
                } else if (i3 == 5) {
                    this.b.a().a(i);
                } else if (i3 == 6) {
                    this.b.a().a(Arrays.asList(str));
                }
            } else {
                q.c.c = i2;
                if (v1.f(i2)) {
                    c(i);
                    this.c.b(q.c.a);
                } else {
                    List<j1> list = q.c.e;
                    int size = list.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        j1 j1Var2 = list.get(i4);
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList(jz1.b(r5, q.c.a, j1Var2.a));
                        if (parcelableArrayList != null) {
                            for (int i5 = 0; i5 < parcelableArrayList.size(); i5++) {
                                if (!(parcelableArrayList.get(i5) == null || ((Intent) parcelableArrayList.get(i5)).getData() == null)) {
                                    j1Var2.d.get(i5).a = true;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            String r = r(bundle);
            long j = bundle.getLong(jz1.a(C0201.m82(16719), r));
            int i6 = bundle.getInt(jz1.a(r6, r));
            long j2 = bundle.getLong(jz1.a(C0201.m82(16720), r));
            ArrayList<String> stringArrayList = bundle.getStringArrayList(jz1.a(C0201.m82(16721), r));
            ArrayList arrayList = new ArrayList();
            Iterator it = s(stringArrayList).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(jz1.b(r5, r, str2));
                ArrayList arrayList2 = new ArrayList();
                for (Intent intent : s(parcelableArrayList2)) {
                    if (intent != null) {
                        z = true;
                    }
                    arrayList2.add(new g1(z));
                    it = it;
                    z = false;
                }
                String string = bundle.getString(jz1.b(C0201.m82(16722), r, str2));
                long j3 = bundle.getLong(jz1.b(C0201.m82(16723), r, str2));
                int i7 = bundle.getInt(jz1.b(C0201.m82(16724), r, str2), 0);
                if (i7 != 0) {
                    j1Var = new j1(str2, string, j3, arrayList2, 0, i7);
                    z = false;
                } else {
                    z = false;
                    j1Var = new j1(str2, string, j3, arrayList2, bundle.getInt(jz1.b(C0201.m82(16725), r, str2), 0), 0);
                }
                arrayList.add(j1Var);
                it = it;
            }
            this.d.put(Integer.valueOf(i), new i1(i, bundle.getInt(C0201.m82(16726)), new h1(r, j, i6, j2, arrayList)));
        }
        return Boolean.TRUE;
    }

    public final void p(int i) {
        a(new e1(this, i));
    }
}
