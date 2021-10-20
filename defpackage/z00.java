package defpackage;

import java.util.ArrayList;
import vigqyno.C0201;

/* renamed from: z00  reason: default package */
/* compiled from: Subpath */
public class z00 {
    private final ArrayList<r00> a;
    private final String b;

    public z00() {
        this(C0201.m82(28738));
    }

    public void a(r00 r00) {
        this.a.add(r00);
    }

    public Iterable<r00> b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public int d() {
        return this.a.size();
    }

    public z00(String str) {
        this.a = new ArrayList<>();
        this.b = str;
    }
}
