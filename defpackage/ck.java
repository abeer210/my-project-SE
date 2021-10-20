package defpackage;

import androidx.core.util.e;
import com.bumptech.glide.g;
import com.bumptech.glide.load.i;
import defpackage.vg;
import defpackage.zj;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import vigqyno.C0201;

/* renamed from: ck  reason: default package */
/* compiled from: MultiModelLoader */
public class ck<Model, Data> implements zj<Model, Data> {
    private final List<zj<Model, Data>> a;
    private final e<List<Throwable>> b;

    /* renamed from: ck$a */
    /* compiled from: MultiModelLoader */
    static class a<Data> implements vg<Data>, vg.a<Data> {
        private final List<vg<Data>> a;
        private final e<List<Throwable>> b;
        private int c = 0;
        private g d;
        private vg.a<? super Data> e;
        private List<Throwable> f;
        private boolean g;

        public a(List<vg<Data>> list, e<List<Throwable>> eVar) {
            this.b = eVar;
            ep.c(list);
            this.a = list;
        }

        private void g() {
            if (!this.g) {
                if (this.c < this.a.size() - 1) {
                    this.c++;
                    e(this.d, this.e);
                    return;
                }
                ep.d(this.f);
                this.e.c(new ci(C0201.m82(17433), new ArrayList(this.f)));
            }
        }

        @Override // defpackage.vg
        public Class<Data> a() {
            return this.a.get(0).a();
        }

        @Override // defpackage.vg
        public void b() {
            List<Throwable> list = this.f;
            if (list != null) {
                this.b.a(list);
            }
            this.f = null;
            for (vg<Data> vgVar : this.a) {
                vgVar.b();
            }
        }

        @Override // defpackage.vg.a
        public void c(Exception exc) {
            List<Throwable> list = this.f;
            ep.d(list);
            list.add(exc);
            g();
        }

        @Override // defpackage.vg
        public void cancel() {
            this.g = true;
            for (vg<Data> vgVar : this.a) {
                vgVar.cancel();
            }
        }

        @Override // defpackage.vg
        public com.bumptech.glide.load.a d() {
            return this.a.get(0).d();
        }

        @Override // defpackage.vg
        public void e(g gVar, vg.a<? super Data> aVar) {
            this.d = gVar;
            this.e = aVar;
            this.f = this.b.b();
            this.a.get(this.c).e(gVar, this);
            if (this.g) {
                cancel();
            }
        }

        @Override // defpackage.vg.a
        public void f(Data data) {
            if (data != null) {
                this.e.f(data);
            } else {
                g();
            }
        }
    }

    public ck(List<zj<Model, Data>> list, e<List<Throwable>> eVar) {
        this.a = list;
        this.b = eVar;
    }

    @Override // defpackage.zj
    public boolean a(Model model) {
        for (zj<Model, Data> zjVar : this.a) {
            if (zjVar.a(model)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.zj
    public zj.a<Data> b(Model model, int i, int i2, i iVar) {
        zj.a<Data> b2;
        int size = this.a.size();
        ArrayList arrayList = new ArrayList(size);
        com.bumptech.glide.load.g gVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            zj<Model, Data> zjVar = this.a.get(i3);
            if (zjVar.a(model) && (b2 = zjVar.b(model, i, i2, iVar)) != null) {
                gVar = b2.a;
                arrayList.add(b2.c);
            }
        }
        if (arrayList.isEmpty() || gVar == null) {
            return null;
        }
        return new zj.a<>(gVar, new a(arrayList, this.b));
    }

    public String toString() {
        return C0201.m82(8186) + Arrays.toString(this.a.toArray()) + '}';
    }
}
