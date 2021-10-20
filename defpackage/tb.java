package defpackage;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* renamed from: tb  reason: default package */
/* compiled from: MaskKeyframeAnimation */
public class tb {
    private final List<nb<nd, Path>> a;
    private final List<nb<Integer, Integer>> b;
    private final List<id> c;

    public tb(List<id> list) {
        this.c = list;
        this.a = new ArrayList(list.size());
        this.b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.a.add(list.get(i).b().a());
            this.b.add(list.get(i).c().a());
        }
    }

    public List<nb<nd, Path>> a() {
        return this.a;
    }

    public List<id> b() {
        return this.c;
    }

    public List<nb<Integer, Integer>> c() {
        return this.b;
    }
}
