package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import vigqyno.C0201;

public final class q implements i3 {
    private static final gy1 f = new gy1(C0201.m82(10385));
    private static final Intent g = new Intent(C0201.m82(10386)).setPackage(C0201.m82(10387));
    private final String a;
    private final x0 b;
    private qy1<pz1> c;
    private qy1<pz1> d;
    private final AtomicBoolean e = new AtomicBoolean();

    public q(Context context, x0 x0Var) {
        this.a = context.getPackageName();
        this.b = x0Var;
        if (uy1.a(context)) {
            this.c = new qy1<>(l02.a(context), f, C0201.m82(10388), g, j3.a);
            this.d = new qy1<>(l02.a(context), f, C0201.m82(10389), g, k3.a);
        }
        f.c(C0201.m82(10390), new Object[0]);
    }

    public static /* synthetic */ ArrayList f(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Bundle bundle = new Bundle();
            bundle.putString(C0201.m82(10391), (String) it.next());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static /* synthetic */ List g(q qVar, List list) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AssetPackState next = c.b((Bundle) list.get(i), qVar.b).e().values().iterator().next();
            if (next == null) {
                f.e(C0201.m82(10392), new Object[0]);
            }
            if (v1.c(next.f())) {
                arrayList.add(next.e());
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public final void h(int i, String str, int i2) {
        if (this.c != null) {
            f.f(C0201.m82(10393), new Object[0]);
            d12 d12 = new d12();
            this.c.c(new h(this, d12, i, str, d12, i2));
            return;
        }
        throw new t0(C0201.m82(10394), i);
    }

    public static /* synthetic */ Bundle l(Map map) {
        Bundle u = u();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (Map.Entry entry : map.entrySet()) {
            Bundle bundle = new Bundle();
            bundle.putString(C0201.m82(10395), (String) entry.getKey());
            bundle.putLong(C0201.m82(10396), ((Long) entry.getValue()).longValue());
            arrayList.add(bundle);
        }
        u.putParcelableArrayList(C0201.m82(10397), arrayList);
        return u;
    }

    /* access modifiers changed from: private */
    public static Bundle o(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt(C0201.m82(10398), i);
        return bundle;
    }

    /* access modifiers changed from: private */
    public static Bundle p(int i, String str) {
        Bundle o = o(i);
        o.putString(C0201.m82(10399), str);
        return o;
    }

    public static /* synthetic */ Bundle q(int i, String str, String str2, int i2) {
        Bundle p = p(i, str);
        p.putString(C0201.m82(10400), str2);
        p.putInt(C0201.m82(10401), i2);
        return p;
    }

    private static <T> s02<T> t() {
        f.e(C0201.m82(10402), -11);
        return u02.a(new a(-11));
    }

    /* access modifiers changed from: private */
    public static Bundle u() {
        Bundle bundle = new Bundle();
        bundle.putInt(C0201.m82(10403), 10800);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);
        bundle.putIntegerArrayList(C0201.m82(10404), arrayList);
        bundle.putIntegerArrayList(C0201.m82(10405), new ArrayList<>());
        return bundle;
    }

    @Override // com.google.android.play.core.assetpacks.i3
    public final synchronized void a() {
        if (this.d == null) {
            f.g(C0201.m82(10406), new Object[0]);
            return;
        }
        f.f(C0201.m82(10407), new Object[0]);
        if (!this.e.compareAndSet(false, true)) {
            f.f(C0201.m82(10408), new Object[0]);
            return;
        }
        d12 d12 = new d12();
        this.d.c(new k(this, d12, d12));
    }

    @Override // com.google.android.play.core.assetpacks.i3
    public final void a(int i) {
        if (this.c != null) {
            f.f(C0201.m82(10409), new Object[0]);
            d12 d12 = new d12();
            this.c.c(new i(this, d12, i, d12));
            return;
        }
        throw new t0(C0201.m82(10410), i);
    }

    @Override // com.google.android.play.core.assetpacks.i3
    public final void a(int i, String str) {
        h(i, str, 10);
    }

    @Override // com.google.android.play.core.assetpacks.i3
    public final void a(List<String> list) {
        if (this.c != null) {
            f.f(C0201.m82(10411), list);
            d12 d12 = new d12();
            this.c.c(new e(this, d12, list, d12));
        }
    }

    @Override // com.google.android.play.core.assetpacks.i3
    public final s02<List<String>> b(Map<String, Long> map) {
        if (this.c == null) {
            return t();
        }
        f.f(C0201.m82(10412), new Object[0]);
        d12 d12 = new d12();
        this.c.c(new f(this, d12, map, d12));
        return d12.a();
    }

    @Override // com.google.android.play.core.assetpacks.i3
    public final s02<ParcelFileDescriptor> c(int i, String str, String str2, int i2) {
        if (this.c == null) {
            return t();
        }
        f.f(C0201.m82(10413), str, str2, Integer.valueOf(i2), Integer.valueOf(i));
        d12 d12 = new d12();
        this.c.c(new j(this, d12, i, str, str2, i2, d12));
        return d12.a();
    }

    @Override // com.google.android.play.core.assetpacks.i3
    public final void d(int i, String str, String str2, int i2) {
        if (this.c != null) {
            f.f(C0201.m82(10414), new Object[0]);
            d12 d12 = new d12();
            this.c.c(new g(this, d12, i, str, str2, i2, d12));
            return;
        }
        throw new t0(C0201.m82(10415), i);
    }
}
