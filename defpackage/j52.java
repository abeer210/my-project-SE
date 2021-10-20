package defpackage;

import com.google.android.gms.maps.model.j;
import java.util.ArrayList;
import java.util.HashMap;
import vigqyno.C0201;

/* renamed from: j52  reason: default package */
/* compiled from: KmlContainer */
public class j52 {
    private final HashMap<String, String> a;
    private final HashMap<r52, Object> b;
    private final ArrayList<j52> c;
    private final HashMap<m52, j> d;
    private final HashMap<String, String> e;
    private HashMap<String, v52> f;

    public j52(HashMap<String, String> hashMap, HashMap<String, v52> hashMap2, HashMap<r52, Object> hashMap3, HashMap<String, String> hashMap4, ArrayList<j52> arrayList, HashMap<m52, j> hashMap5, String str) {
        this.a = hashMap;
        this.b = hashMap3;
        this.f = hashMap2;
        this.e = hashMap4;
        this.c = arrayList;
        this.d = hashMap5;
    }

    public Iterable<j52> a() {
        return this.c;
    }

    public HashMap<m52, j> b() {
        return this.d;
    }

    public Iterable<r52> c() {
        return this.b.keySet();
    }

    public HashMap<r52, Object> d() {
        return this.b;
    }

    public String e(String str) {
        return this.a.get(str);
    }

    public v52 f(String str) {
        return this.f.get(str);
    }

    public HashMap<String, String> g() {
        return this.e;
    }

    public HashMap<String, v52> h() {
        return this.f;
    }

    public boolean i() {
        return this.c.size() > 0;
    }

    public boolean j(String str) {
        return this.a.containsKey(str);
    }

    public void k(r52 r52, Object obj) {
        this.b.put(r52, obj);
    }

    public String toString() {
        return C0201.m82(31379) + C0201.m82(31380) + C0201.m82(31381) + this.a + C0201.m82(31382) + this.b + C0201.m82(31383) + this.c + C0201.m82(31384) + this.d + C0201.m82(31385) + this.e + C0201.m82(31386) + this.f + C0201.m82(31387);
    }
}
