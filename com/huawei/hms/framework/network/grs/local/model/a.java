package com.huawei.hms.framework.network.grs.local.model;

import java.util.HashMap;
import java.util.Map;

public class a {
    private String a;
    private long b;
    private Map<String, c> c = new HashMap(16);

    public c a(String str) {
        return this.c.get(str);
    }

    public String a() {
        return this.a;
    }

    public void a(long j) {
        this.b = j;
    }

    public void a(String str, c cVar) {
        this.c.put(str, cVar);
    }

    public Map<String, c> b() {
        return this.c;
    }

    public void b(String str) {
        this.a = str;
    }
}
