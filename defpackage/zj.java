package defpackage;

import com.bumptech.glide.load.g;
import com.bumptech.glide.load.i;
import java.util.Collections;
import java.util.List;

/* renamed from: zj  reason: default package */
/* compiled from: ModelLoader */
public interface zj<Model, Data> {

    /* renamed from: zj$a */
    /* compiled from: ModelLoader */
    public static class a<Data> {
        public final g a;
        public final List<g> b;
        public final vg<Data> c;

        public a(g gVar, vg<Data> vgVar) {
            this(gVar, Collections.emptyList(), vgVar);
        }

        public a(g gVar, List<g> list, vg<Data> vgVar) {
            ep.d(gVar);
            this.a = gVar;
            ep.d(list);
            this.b = list;
            ep.d(vgVar);
            this.c = vgVar;
        }
    }

    boolean a(Model model);

    a<Data> b(Model model, int i, int i2, i iVar);
}
