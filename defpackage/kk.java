package defpackage;

import com.bumptech.glide.load.h;
import com.bumptech.glide.load.i;
import defpackage.zj;
import java.io.InputStream;
import vigqyno.C0201;

/* renamed from: kk  reason: default package */
/* compiled from: HttpGlideUrlLoader */
public class kk implements zj<sj, InputStream> {
    public static final h<Integer> b = h.f(C0201.m82(27495), 2500);
    private final yj<sj, sj> a;

    /* renamed from: kk$a */
    /* compiled from: HttpGlideUrlLoader */
    public static class a implements ak<sj, InputStream> {
        private final yj<sj, sj> a = new yj<>(500);

        @Override // defpackage.ak
        public void a() {
        }

        @Override // defpackage.ak
        public zj<sj, InputStream> c(dk dkVar) {
            return new kk(this.a);
        }
    }

    public kk(yj<sj, sj> yjVar) {
        this.a = yjVar;
    }

    /* renamed from: c */
    public zj.a<InputStream> b(sj sjVar, int i, int i2, i iVar) {
        yj<sj, sj> yjVar = this.a;
        if (yjVar != null) {
            sj a2 = yjVar.a(sjVar, 0, 0);
            if (a2 == null) {
                this.a.b(sjVar, 0, 0, sjVar);
            } else {
                sjVar = a2;
            }
        }
        return new zj.a<>(sjVar, new bh(sjVar, ((Integer) iVar.c(b)).intValue()));
    }

    /* renamed from: d */
    public boolean a(sj sjVar) {
        return true;
    }
}
