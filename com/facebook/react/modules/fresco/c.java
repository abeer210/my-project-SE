package com.facebook.react.modules.fresco;

import android.util.Pair;
import com.facebook.systrace.a;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

/* compiled from: SystraceRequestListener */
public class c extends ef0 {
    public int a = 0;
    public Map<String, Pair<Integer, String>> b = new HashMap();
    public Map<String, Pair<Integer, String>> c = new HashMap();

    @Override // defpackage.gf0, defpackage.ef0
    public void a(ih0 ih0, Object obj, String str, boolean z) {
        if (a.h(0)) {
            Pair<Integer, String> create = Pair.create(Integer.valueOf(this.a), C0201.m82(25062) + ih0.q().toString().replace(':', '_'));
            a.a(0, (String) create.second, this.a);
            this.c.put(str, create);
            this.a = this.a + 1;
        }
    }

    @Override // defpackage.ef0, defpackage.ug0
    public void b(String str, String str2) {
        if (a.h(0)) {
            Pair<Integer, String> create = Pair.create(Integer.valueOf(this.a), C0201.m82(25063) + str2.replace(':', '_'));
            a.a(0, (String) create.second, this.a);
            this.b.put(str, create);
            this.a = this.a + 1;
        }
    }

    @Override // defpackage.gf0, defpackage.ef0
    public void c(ih0 ih0, String str, boolean z) {
        if (a.h(0) && this.c.containsKey(str)) {
            Pair<Integer, String> pair = this.c.get(str);
            a.e(0, (String) pair.second, ((Integer) pair.first).intValue());
            this.c.remove(str);
        }
    }

    @Override // defpackage.ef0, defpackage.ug0
    public void d(String str, String str2, Map<String, String> map) {
        if (a.h(0) && this.b.containsKey(str)) {
            Pair<Integer, String> pair = this.b.get(str);
            a.e(0, (String) pair.second, ((Integer) pair.first).intValue());
            this.b.remove(str);
        }
    }

    @Override // defpackage.ef0, defpackage.ug0
    public boolean f(String str) {
        return false;
    }

    @Override // defpackage.gf0, defpackage.ef0
    public void g(ih0 ih0, String str, Throwable th, boolean z) {
        if (a.h(0) && this.c.containsKey(str)) {
            Pair<Integer, String> pair = this.c.get(str);
            a.e(0, (String) pair.second, ((Integer) pair.first).intValue());
            this.c.remove(str);
        }
    }

    @Override // defpackage.ef0, defpackage.ug0
    public void h(String str, String str2, String str3) {
        if (a.h(0)) {
            StringBuilder sb = new StringBuilder();
            sb.append(C0201.m82(25064));
            sb.append(str.replace(':', '_'));
            String r6 = C0201.m82(25065);
            sb.append(r6);
            sb.append(str2.replace(':', '_'));
            sb.append(r6);
            sb.append(str3.replace(':', '_'));
            a.l(0, sb.toString(), a.EnumC0052a.THREAD);
        }
    }

    @Override // defpackage.ef0, defpackage.ug0
    public void i(String str, String str2, Map<String, String> map) {
        if (a.h(0) && this.b.containsKey(str)) {
            Pair<Integer, String> pair = this.b.get(str);
            a.e(0, (String) pair.second, ((Integer) pair.first).intValue());
            this.b.remove(str);
        }
    }

    @Override // defpackage.ef0, defpackage.ug0
    public void j(String str, String str2, Throwable th, Map<String, String> map) {
        if (a.h(0) && this.b.containsKey(str)) {
            Pair<Integer, String> pair = this.b.get(str);
            a.e(0, (String) pair.second, ((Integer) pair.first).intValue());
            this.b.remove(str);
        }
    }

    @Override // defpackage.gf0, defpackage.ef0
    public void k(String str) {
        if (a.h(0) && this.c.containsKey(str)) {
            Pair<Integer, String> pair = this.c.get(str);
            a.e(0, (String) pair.second, ((Integer) pair.first).intValue());
            this.c.remove(str);
        }
    }
}
