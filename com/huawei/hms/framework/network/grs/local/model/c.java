package com.huawei.hms.framework.network.grs.local.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class c {
    private String a;
    private String b;
    private Map<String, d> c = new HashMap(16);
    private List<b> d = new ArrayList(16);

    public d a(String str) {
        return this.c.get(str);
    }

    public List<b> a() {
        return this.d;
    }

    public void a(String str, d dVar) {
        this.c.put(str, dVar);
    }

    public void a(List<b> list) {
        this.d = list;
    }

    public String b() {
        return this.a;
    }

    public void b(String str) {
        this.a = str;
    }

    public String c() {
        return this.b;
    }

    public void c(String str) {
        this.b = str;
    }
}
