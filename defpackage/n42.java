package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

/* renamed from: n42  reason: default package */
/* compiled from: Feature */
public class n42 extends Observable {
    private final String a;
    private final Map<String, String> b;
    private o42 c;

    public n42(o42 o42, String str, Map<String, String> map) {
        this.c = o42;
        this.a = str;
        if (map == null) {
            this.b = new HashMap();
        } else {
            this.b = map;
        }
    }

    public o42 a() {
        return this.c;
    }

    public String b() {
        return this.a;
    }

    public Iterable c() {
        return this.b.entrySet();
    }

    public String d(String str) {
        return this.b.get(str);
    }

    public boolean e() {
        return this.c != null;
    }

    public boolean f(String str) {
        return this.b.containsKey(str);
    }
}
