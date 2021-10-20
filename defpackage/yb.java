package defpackage;

import android.graphics.Path;
import java.util.List;

/* renamed from: yb  reason: default package */
/* compiled from: ShapeKeyframeAnimation */
public class yb extends nb<nd, Path> {
    private final nd i = new nd();
    private final Path j = new Path();

    public yb(List<bg<nd>> list) {
        super(list);
    }

    /* renamed from: o */
    public Path i(bg<nd> bgVar, float f) {
        this.i.c(bgVar.b, bgVar.c, f);
        zf.h(this.i, this.j);
        return this.j;
    }
}
