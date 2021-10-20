package defpackage;

import com.bumptech.glide.g;
import com.bumptech.glide.load.i;
import defpackage.vg;
import defpackage.zj;

/* renamed from: hk  reason: default package */
/* compiled from: UnitModelLoader */
public class hk<Model> implements zj<Model, Model> {
    private static final hk<?> a = new hk<>();

    /* renamed from: hk$a */
    /* compiled from: UnitModelLoader */
    public static class a<Model> implements ak<Model, Model> {
        private static final a<?> a = new a<>();

        public static <T> a<T> b() {
            return (a<T>) a;
        }

        @Override // defpackage.ak
        public void a() {
        }

        @Override // defpackage.ak
        public zj<Model, Model> c(dk dkVar) {
            return hk.c();
        }
    }

    /* renamed from: hk$b */
    /* compiled from: UnitModelLoader */
    private static class b<Model> implements vg<Model> {
        private final Model a;

        public b(Model model) {
            this.a = model;
        }

        @Override // defpackage.vg
        public Class<Model> a() {
            return (Class<Model>) this.a.getClass();
        }

        @Override // defpackage.vg
        public void b() {
        }

        @Override // defpackage.vg
        public void cancel() {
        }

        @Override // defpackage.vg
        public com.bumptech.glide.load.a d() {
            return com.bumptech.glide.load.a.LOCAL;
        }

        @Override // defpackage.vg
        public void e(g gVar, vg.a<? super Model> aVar) {
            aVar.f(this.a);
        }
    }

    public static <T> hk<T> c() {
        return (hk<T>) a;
    }

    @Override // defpackage.zj
    public boolean a(Model model) {
        return true;
    }

    @Override // defpackage.zj
    public zj.a<Model> b(Model model, int i, int i2, i iVar) {
        return new zj.a<>(new uo(model), new b(model));
    }
}
